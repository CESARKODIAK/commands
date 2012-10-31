require_relative "../src/english-parser"

class ParserTest<EnglishParser
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
  s "a b c d"
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
  s "eat a sandwich; done"
  #s "bash 'ls'"
  #verb and nod
  action
  assert(!@string.match("sandwich"))
end

def test_methods
  test_method2
  test_method3
  test_method4
end

  def test_method
  s "how to integrate a bug do test done"
  x=method_definition
end

  def test_method2
  s "how to print: eat a sandwich; done"
  x=method_definition
  puts x
  #any{method_definition}
  end

  def test_method3
    s "how to integrate a bug\ntest\nok"
    x=method_definition
  end

  def test_method4
    s "how to integrate a bug
      test
    ok"
    x=method_definition
  end


def test_expression
  s "eat a sandwich;"
  x=action
  puts x
end

def raise_test
  raise "test"
end

def test_block
  s "let the initial value of I be x;\nstep size is the length of the interval,
divided by the number of steps\nvar x = 8;"
  block
end
  def test_quote
    s 'msg = "heee"'
    setter
  end

  def test_while
    allow_rollback
    s "while i is smaller or less then y do
 evaluate the function at point I
 add the result to the sum
 increase I by the step size
done"
    looper
  end

def test_setter3
  s "step size is the length of the interval, divided by the number of steps"
  setter
end

def test_setter2
  s "var x = 8;"
  setter
end

def test_setter
  s "let the initial value of I be x"
  setter
end

def test_looper
  s "while i is smaller or less then y do\nyawn\nend"
  looper
end

  def s string
    allow_rollback
    @lines=string.split("\n")
    @string=@lines[0]
    #@string=string
    @original_string=@string
  end

  def test_method_call
  s "evaluate the function at point I"
  #method_call
    action
  end

  def test_verb
    s "help"
    verb
  end

  def test_comment
    s "#ok"
    expression
    s "z3=13 //ok"
    expression
    s "z4=23 -- ok"
    expression
    s "z5=33 # ok"
    expression
    s "z6=/* dfsfds */3 "
  end

  def test_js
    s "js alert('hi')"
    #javascript
    root
    puts @javascript
  end

  def test_ruby_method_call
    test_ruby_def
    p "NOW CALL via english"
    s "call ruby_block_test"
    ruby_method_call
  end

  def test_ruby_def
    s "def ruby_block_test
  puts 'ooooo'
end"
    ruby_def
    # ^^ defines:
    ruby_block_test
  end

  def test_ruby
    s "def ruby_block_test
  puts 'ooooo'
end"
    execute_ruby_block
    # ^^ defines:
    ruby_block_test
  end

  def test
    puts "Starting tests!"
    begin
      #test_ruby
      #test_ruby_def
      test_ruby_method_call
      exit
      test_js
      #test_verb
      #test_setter2
      #test_setter3
      test_method3
      test_comment
      s "a bug"
      x=endNode
      star{arg}
      test_block
      test_quote
      test_while
      test_methods
      test_method_call
    #  test_looper
      show_tree
    puts "++++++++++++++++++\nPARSED successfully!"
    rescue => e
      error e
    end
  end

end

ParserTest.new.test

