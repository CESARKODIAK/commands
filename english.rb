#!/usr/bin/env ruby

# grammar : 'hello' QUESTION ('does'| QUESTION)* 'the world'? VERB


def verb
  any_token "start", "end"
end

def question
  any_token "how", "where"
end



def token t
  if @string.match(/^#{t}/)
    @string=@string[t.length..-1]
    return true
  else
    throw "expected "+t
  end
end
  

def any_token *tokens
  for t in tokens
    if @string.match(/^#{t}/)
        @string=    @string[t.length..-1]
        return
    end
  end
  throw "expected any of "+tokens.to_s
end  


def try(&block)
  begin
    return yield
  rescue
     verbose "Not matching #{block.to_s},  no worries"
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
      throw " too many occurrences of "+ block.to_s if current>max
    end
    return good
  # rescue
  # end
end

def verbose info
  puts info
end

def root
  token "hello"
  question
  star{
    try{token 'does'} || try{question}
  }
  maybe 'the world'
  verb
end


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
    puts string[from..offset+10]
    puts "          ^^^         " 
  end
end

parse "hello why does the world end"
parse "Hello does why does the world car"  
  