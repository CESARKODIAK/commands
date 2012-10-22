#!/usr/bin/env ruby

require_relative "MethodInterception"
require_relative "english-tokens"
require_relative "english-script"
require_relative "parser-test"

class Parser #< MethodInterception

@@verbose=true
#@verbose=false
#@@very_verbose=false
@@very_verbose=true

  NotMatching = Class.new StandardError
  EndOfDocument = Class.new StandardError
  EndOfLine= Class.new StandardError
  MaxRecursionReached= Class.new StandardError
  EndOfBlock= Class.new StandardError
  GivingUp= Class.new StandardError

def verbose info
  puts info if @@verbose
end

#gem 'debugger'
#gem 'ruby-debug19', :require => 'ruby-debug'
#require 'ruby-debug'
#require 'debugger'
#gem 'ParseTree' ruby 1.9 only :{
#require 'sourcify' #http://stackoverflow.com/questions/5774916/print-the-actual-ruby-code-of-a-block BAD
#require 'method_source'

#gem 'ruby-debug', :platforms => :ruby_18
#gem 'ruby-debug19', :platforms => :ruby_19, :require => 'ruby-debug'

#def maybe &block
#  return yield rescue true
#end


def checkEnd
  #raise EndOfDocument.new if @@string.empty? # no:try,try,try
  return @@string.empty?
end

def token t
  checkEnd
  if @@string.match(/^#{t}/)
    @@current_value=@@string[0,t.length]
    @@string=@@string[t.length..-1].strip
    return true
  else
    verbose "expected "+t # if @@throwing
    raise NotMatching.new(t)
  end
end

def tokens *tokens
  return if checkEnd

  #match=@@string.match("^#{t}")
  #if match
  #  @@string=@@string[match[0].length..-1].strip
  for t in tokens.flatten
    if @@string.start_with? t
      @@current_value=@@string[0,t.length]
      @@string=@@string[t.length..-1].strip
      #checkEnd
      return @@current_value
    end
  end
  raise NotMatching.new(tokens.to_s) #if @@throwing
  return false
end

# shortcut
def __ *x
  tokens x
end

def _ x
  token x
end

def _? *x
  try{tokens x}
end


def last_try stack
  for s in stack
    if s.match("`try'")
      return s
    end
  end
end

@@rollback=[]
def no_rollback!
  #@@rollback[last_try caller] =false
  #depth=caller.index(last_try caller)
  for i in 0..(caller.count)
    @@rollback[i] ="NO"
  end
end

def do_rollback
  @@rollback[caller.count]!="NO"   # -1?
end

@@throwing=true #[]
@@level=0
def any(&block)
  checkEnd

  last_try=0
  #throw "Max recursion reached #{to_source block}" if @@level>20
  raise MaxRecursionReached.new(to_source block) if caller.count>50
  was_throwing=@@throwing
  @@throwing=false
  #@@throwing[@@level]=false
  oldString=@@string
  begin
    result=yield
    return result
  rescue EndOfDocument
    puts "EndOfDocument"
  rescue EndOfLine
    puts "EndOfLine"
  rescue NotMatching
    puts "NotMatching"
    #retry
  rescue => e
    verbose "Error in #{to_source block}"
    puts e.message
    #error e
  end
  @@string=oldString if do_rollback
  @@throwing=was_throwing
  #@@throwing[@@level]=true
  #@@level=@@level-1
  verbose "Succeeded with any #{to_source block}" if result
  return result if result
  string_pointer if @@verbose
  raise NotMatching.new(to_source block)
  #throw "Not matching #{to_source block}"
end

def quote
  checkEnd
  if @@string[0]=="'"
    to=@@string[1..-1].index("'")
    quote_content=@@string[1..to];
    @@string= @@string[to+2..-1].strip
    return quote_content
  end
  if @@string[0]=='"'
    to=@@string[1..-1].index('"')
    quote_content=@@string[1..to];
    @@string= @@string[to..-1].strip
    return quote_content
  end
  raise NotMatching.new("no quote")
  #throw "no quote" if @@throwing
  return false
end

def to_source x
  return @@last_pattern if @@last_pattern
  #proc=block.to_source(:strip_enclosure => true) rescue "Sourcify::MultipleMatchingProcsPerLineError"
  IO.readlines(x.source_location[0])[x.source_location[1]-1]#+(x.source_location.to_s)
end

def try(&block)
  return if checkEnd
  old=@@string
  @@original_string=@@string if @@original_string.empty?
  begin
    x = yield
    #rollback=@@rollback[caller.count]="YES" #Succeeded
    rollback=@@rollback[caller.count..-1]="YES" #Succeeded
    return x
  rescue NotMatching => e
    verbose "Tried #{to_source block}"
    verbose e
    string_pointer if @@verbose
    #caller.index(last_try caller)]
    rollback=@@rollback[caller.count]!="NO"
    #puts @@rollback[caller.count]
    #puts caller.count
    #puts rollback
    if not rollback
      puts @@rollback[caller.count]
      puts caller.count
      error e
      error "NO ROLLBACK, GIVING UP!!!"
      show_tree rescue puts "no tree"
      exit
      #raise GivingUp.new
    end
  rescue => e
    error e
    exit
  end
  @@string=old #if rollback
  return false
end

  def plus(&block)
    yield
    star{yield}
  end

def one_or_more(&block)
  yield
  star{yield}
end

def star(&block)
  checkEnd
  was_throwing=@@throwing
  @@throwing=true

  max=100
  current=0
  good=[]
  # begin
  oldString=@@string
  last_string=""
  begin
    while true
      break if @@string=="" or @@string==last_string
      last_string=@@string
      rest=yield
      break if not rest
      matched=last_string[0.. last_string.length- rest.length-1].strip if rest
      good<< matched if matched
      throw " too many occurrences of "+ to_source(block) if current>max and @@throwing
    end
  rescue NotMatching => e
    if @@very_verbose and not good
      verbose "NotMatching star "+ e.to_s
      #verbose "expected any of "+tokens.to_s if tokens and tokens.count>0
      string_pointer if @@verbose
    end
  rescue => e
    error e
    error "error in star "+ to_source(block)
    #warn e
  end

  @@string=oldString if not good
  @@throwing=was_throwing

  return good
  # rescue
  # end
end


# use _?
#def maybe token
#  return token token rescue true
#end


def ignore_rest_of_line
  @@string.gsub!(/.*?\n/,"\n")
end

def string_pointer
  offset=@@original_string.length-@@string.length
  from=offset-80
  to=offset+80
  from=0 if(from<0)

  newline_i=@@original_string.rindex("\n",offset)
  if(newline_i and newline_i<offset and newline_i-from<80)
    from=newline_i+1
  end

  newline_i=@@original_string.index("\n",offset)
  if(newline_i and newline_i<to and newline_i>=offset)
    to=newline_i
  end
  #puts @@string
  puts @@original_string[from..to]
  puts " "*(offset-from) + "^^^"
end

def error e
  puts e if e.is_a? String
  if e.is_a? Exception
  puts e.class.to_s+" "+e.message.to_s
  puts e.backtrace
  puts e.class.to_s+" "+e.message.to_s
  string_pointer
    exit
  end
end


def warn e
  puts e.message
end


@@original_string=""
@@string=""
def parse string
  puts "parsing"
  begin
    @@original_string=string
    @@string=string
    root
  rescue => e
    error e
  end
end


def one *matches
  oldString=@@string
  for match in matches
    begin
      @@string=oldString
      return match if match and not match.is_a? Symbol
      result =send(match) if match.is_a? Symbol
      return result #if result
    rescue NotMatching =>e
      verbose "NotMatching one "+match.to_s+"("+e.to_s+")"
      #raise GivingUp.new
      error e if not do_rollback
    rescue => e
      error e
    end
  end
  @@string=oldString if do_rollback
  verbose "Should have matched one of "+matches.to_s if @@throwing
  raise NotMatching.new
  #throw "Should have matched one of "+matches
end



@@last_pattern=nil
def method_missing(sym, *args, &block)  # <- NoMethodError use node.blah to get blah!
  syms=sym.to_s
  cut=syms[0..-2]
  #return send(cut) if(syms.end_with?"!")
  if(syms.end_with?"?")
    old_last=@@last_pattern
    @@last_pattern=cut
    x= try{send(cut)} if args.count==0
    x= try{send(cut,args)} if args.count>0
    @@last_pattern=old_last
    return x
  end
  return star{send(cut,args)} if(syms.end_with?"!")
  #return star{send(cut)} if(syms.end_with?"*")
  #return plus{send(cut)} if(syms.end_with?"+")
  super(sym, *args, &block)
end

  def *(a)
    puts a
  end


  def start
    a=ARGV[0] || "/Users/me/english-script/test.e"
    #test_any
    #test_action
    #test_expression
    #test_method
    parse IO.read(a)
    show_tree rescue puts "no tree"
  end

  @@tree=[]
  def start_tree_node
    @@tree<<caller[0]
  end
  def add_tree_node
    @@tree<<caller[0]
  end



end

#Parser.new.test±
#Parser.new.test•
#Parser.new.test∆
#Parser.new.test!
#Parser.new.test*
#Parser.new.test_any

Parser.new.test
Parser.new.start
#Parser.new.parse "hello why does the world end"
#Parser.new.parse "hello why does the world car"
