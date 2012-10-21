#!/usr/bin/env ruby

#@verbose=true
@verbose=false
def verbose info
  puts info if @verbose
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

NotMatching = Class.new StandardError
EndOfDocument = Class.new StandardError

def maybe &block
  return yield rescue true
end


def checkEnd
  raise EndOfDocument.new if @@string.empty?
end

def token t
  checkEnd
  if @@string.match(/^#{t}/)
    @@string=@@string[t.length..-1].strip
    return true
  else
    verbose "expected "+t # if @@throwing
    raise NotMatching.new(t)
  end
end

def rest x
  x
  #todo
  #x.index(";")
end

def tokens *tokens
  checkEnd
  for t in tokens
    match=@@string.match(/^#{t}/)
    if match
      @@string=@@string[match[0].length..-1].strip
      #checkEnd
      return rest @@string
    end
  end
  verbose "expected any of "+tokens.to_s
  raise NotMatching.new(tokens.to_s) #if @@throwing
end

# shortcut
def __ *x
  tokens x
end

def _ x
  token x
end

def _? *x
  maybe{tokens x}
end

@@throwing=true #[]
@@level=0
def any(&block)
  checkEnd
  @@level = @@level+1
  last_try=0
  throw "Max recursion reached #{to_source block}" if @@level>20
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
  @@string=oldString
  @@throwing=was_throwing
  #@@throwing[@@level]=true
  @@level=@@level-1
  return result if result
  string_pointer if @verbose
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
  #proc=block.to_source(:strip_enclosure => true) rescue "Sourcify::MultipleMatchingProcsPerLineError"
  IO.readlines(x.source_location[0])[x.source_location[1]-1]
end

def try(&block)
  checkEnd
  old=@@string
  begin
    return yield
  rescue
    verbose "Not matching #{to_source block}"
    string_pointer if @verbose
  end
  @@string=old
  return false
end


def one_or_more(&block)
  checkEnd
  max=100
  current=0
  good=[]
  # begin
  while true
    #old=@@string
    matched=yield
    good<<matched if matched
    break if not matched
    current=current+1
    throw(" too many occurrences of "+ to_source(block)) if current>max and @@throwing
  end
  throw "no occurrence of "+ to_source(block) if current==0 and @@throwing
  return good
  # rescue
  # end
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
  begin
    while true
      break if @@string==""
      matched=yield
      good<<matched if matched
      break if not matched
      throw " too many occurrences of "+ to_source(block) if current>max and @@throwing
    end
  rescue NotMatching => e
    verbose e
  rescue => e
    warn e
    to_source(block)
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
  from=offset>10?offset-10 :0
  #puts @@string
  puts @@original_string[from..offset+10]
  puts "          ^^^         "
end
def error e
  puts e.message
  puts e.backtrace
  puts e.message
  string_pointer
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

def newline?
  return true if @@string==""
  maybe{tokens "\n","\r",";",":","..." ,"<EOF>"}
end


def newline
  return true if @@string==""
  tokens "\n","\r",";",":" #,"\.\.\." ,"<EOF>" # << dont consume!
end

def newlines
  one_or_more{newline}
end

def NL
  tokens "\n","\r"
end


def NLs
  tokens "\n","\r"
end


# grammar : 'hello' QUESTION ('does'| QUESTION)* 'the world'? VERB
def test_root
  #token "hello"
  #question
  #star{
  #  try{token 'does'} || try{question}
  #}
  #_? 'the world'
  #verb
  puts "Parsed successfully!"
end

require_relative "english-tokens"
require_relative "english-script"

def rest_of_statement
  return @@string.gsub(/;.*/," ").gsub(/\n.*/," ").gsub(/\r.*/," ").gsub(/ done.*/," ").strip
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
      verbose match.to_s
      verbose " NotMatching "
      #verbose e.to_s # HUH???
    rescue => e
      error e
    end
  end
  @@string=oldString
  puts "Should have matched one of "+matches.to_s
  raise NotMatching.new
  #throw "Should have matched one of "+matches
end

def aa
  puts "aa"
end
def bb
  raise NotMatching.new(test)
  #throw NotMatching.new NOT rescued!!!
end
def cc
  puts "cc"
  return "cc"
end
def dd
  puts "dd"
  throw "dd"
end

def test_any
  one :aa,:bb,:cc
  any{
    try{puts "a"}
    try{puts "b"}
    try{raise NotMatching.new}
    try{puts "c"}
    try{throw "b"}
    try{puts "b"}
  }

end


def test_action
  @@string="eat a sandwich; done"
  #@@string="bash 'ls'"
  #verb and nod
  action
  assert(!@@string.match("sandwich"))
end

def test_method
  @@string="how to print: eat a sandwich; done"
  x=method_definition
  puts x
  #any{method_definition}
end

def test_expression
  @@string="eat a sandwich;"
  x=action
  puts x
end


def start
  a=ARGV[0] || "/Users/me/english-script/test.e"
  #test_any
  #test_action
  #test_expression
  test_method
  #parse IO.read(a)
end


start
#parse "hello why does the world end"
#parse "hello why does the world car"
