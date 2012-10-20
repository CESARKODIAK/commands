# # !/usr/bin/env ruby
#gem 'debugger'
#gem 'ruby-debug19', :require => 'ruby-debug'
#require 'ruby-debug'
#require 'debugger'
#gem 'ParseTree' ruby 1.9 only :{
#require 'sourcify' #http://stackoverflow.com/questions/5774916/print-the-actual-ruby-code-of-a-block BAD
#require 'method_source'

#gem 'ruby-debug', :platforms => :ruby_18
#gem 'ruby-debug19', :platforms => :ruby_19, :require => 'ruby-debug'

def maybe &block
  return yield rescue true
end


def token t
  if @@string.match(/^#{t}/)
    @@string=@@string[t.length..-1].strip
    return true
  else
    throw "expected "+t  if @@throwing
  end
end


def tokens *tokens
  for t in tokens
    if @@string.match(/^#{t}/)
      @@string=@@string[t.length..-1].strip
      return
    end
  end
  throw "expected any of "+tokens.to_s if @@throwing
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
  @@level = @@level+1
  throw "Max recursion reached #{to_source block}" if @@level>20
  was_throwing=@@throwing
  @@throwing=false
  #@@throwing[@@level]=false
  begin
    result=yield
  rescue => e
    verbose "Error in #{to_source block}"
    error e
  end
  #result=plus block
  @@throwing=was_throwing
  #@@throwing[@@level]=true
  @@level=@@level-1
    return result if result
  throw "Not matching #{to_source block}"
end

def quote
  if @@string[0]=="'"
    to=@@string[1..-1].index("'")
    quote_content=@@string[1..to];
    @@string= @@string[to..-1].strip
    return quote_content
  end
  if @@string[0]=='"'
    to=@@string[1..-1].index('"')
    quote_content=@@string[1..to];
    @@string= @@string[to..-1].strip
    return quote_content
  end
  throw "no quote" if @@throwing
  return false
end



def to_source x
  #proc=block.to_source(:strip_enclosure => true) rescue "Sourcify::MultipleMatchingProcsPerLineError"
  IO.readlines(x.source_location[0])[x.source_location[1]-1]
end

def try(&block)

  begin
    return yield
  rescue
      verbose "Not matching #{to_source block}"
     return false
  end
end


def one_or_more(&block)
  max=100
  current=0
  good=[]
  # begin
  while true
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
  max=100
  current=0
  good=[]
  # begin
    while true
      matched=yield
      good<<matched if matched
      break if not matched
      throw " too many occurrences of "+ to_source(block) if current>max and @@throwing
    end
    return good
  # rescue
  # end
end

def verbose info
  puts info
end

# use _?
#def maybe token
#  return token token rescue true
#end


def ignore_rest_of_line
  @@string.gsub!(/.*?\n/,"\n")
end

def error e
  puts e.message
  puts e.backtrace
  offset=@@original_string.length-@@string.length
  from=offset>10?offset-10 :0
  puts e.message
  #puts @@string
  puts @@original_string[from..offset+10]
  puts "          ^^^         "
  puts offset
  puts " "
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


def newline
  tokens "\n","\r"
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

x=7
puts x
start
#parse "hello why does the world end"
#parse "hello why does the world car"
