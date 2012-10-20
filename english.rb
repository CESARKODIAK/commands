#!/usr/bin/env ruby

#gem 'ParseTree' ruby 1.9 only :{
#require 'sourcify' #http://stackoverflow.com/questions/5774916/print-the-actual-ruby-code-of-a-block BAD
#require 'method_source'



def verb
  any_token "start", "end"
end

def question
  any_token "how", "where" , "why"
end



def token t
  if @string.match(/^#{t}/)
    @string=@string[t.length..-1].strip
    return true
  else
    throw "expected "+t
  end
end


def any_token *tokens
  for t in tokens
    if @string.match(/^#{t}/)
        @string=@string[t.length..-1].strip
        return
    end
  end
  throw "expected any of "+tokens.to_s
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

def star(&block)
  max=100
  current=0
  good=[]
  # begin
    while true
      matched=yield
      good<<matched if matched
      break if not matched
      throw " too many occurrences of "+ to_source(block) if current>max
    end
    return good
  # rescue
  # end
end

def verbose info
  puts info
end
def maybe token
  return token token rescue true
end


#def maybe &block
#   return yield rescue true
#end


# @original_string
# @string
def parse string

  begin
  @original_string=string
  @string=string
  root
  rescue => e
    puts e.message
    puts e.backtrace
    offset=string.length-@string.length
    from=offset>10?offset-10 :0
    puts e.message
    puts @string
    puts string[from..offset+10]
    puts "          ^^^         "
    puts offset
  end
end


# grammar : 'hello' QUESTION ('does'| QUESTION)* 'the world'? VERB
def root
  token "hello"
  question
  star{
    try{token 'does'} || try{question}
  }
  maybe 'the world'
  verb
  puts "Parsed successfully!"
end


parse "hello why does the world end"
parse "hello why does the world car"
