#require_relative "../lib/english-script/english-parser"
#require 'test_helper'
require '../test_helper'
#require 'active_support/core_ext'
#require 'active_support/dependencies'
#require_dependency 'test'
#require_dependency "english-script/power-parser.rb"
#require_dependency "english-script/english-parser.rb"
require_relative "../../lib/english-script/english-parser"


class EnglishParserTest<EnglishParser
# grammar : 'hello' QUESTION ('does'| QUESTION)* 'the world'? VERB
  def test_root
    s "hello who does the world end"
    token "hello"
    question
    star{
      try{token 'does'} || try{question}
    }
    _? 'the world'
    assert verb
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
    one :aa, :bb, :cc
    assert any {
      try { puts "a" }
      try { puts "b" }
      try { raise NotMatching.new }
      try { puts "c" }
      try { throw "b" }
      try { puts "b" }
    }

  end


  def test_action
    s "eat a sandwich; done"
    #s "bash 'ls'"
    #verb and nod
    assert action
    assert(!@string.match("sandwich"))
  end

  def test_methods
    test_method2
    #test_method3
    test_method4
  end

  def test_method
    s "how to integrate a bug do test done"
    assert method_definition
  end

  def test_method2
    s "how to print: eat a sandwich; done"
    assert method_definition
    #any{method_definition}
  end

  def test_method3
    s "how to integrate a bug\ntest\nok"
    assert method_definition
  end

  def test_method4
    s "how to integrate a bug
      test
    ok"
    assert method_definition
  end


  def test_expression
    s "eat a sandwich;"
    assert action
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
    method_call
    #action
  end

  def test_verb
    s "help"
    verb
  end

  def test_comment
    s "#ok"
    statement
    s "z3=13 //ok"
    assert statement
    s "z4=23 -- ok"
    assert statement
    s "z5=33 # ok"
    assert statement
    s "z6=/* dfsfds */3 "
  end

  def test_js
    s "js alert('hi')"
    assert javascript
    puts @javascript
  end

  def test_ruby_method_call
    test_ruby_def
    p "NOW CALL via english"
    s "call ruby_block_test 'yeah'"
    assert ruby_method_call
  end

  def test_ruby_def
    s "def ruby_block_test x='yuhu'
  puts x
  return x+'yay'
end"
    assert ruby_def
    # ^^ defines:
    ruby_block_test
  end

  def test_ruby_all
    s "
def ruby_block_test x='yuhu'
  puts x
  return x+'yay'
end
call ruby_block_test 'yeah'
"
  root
  end

  def test_ruby_variables
    s "x=7;puts x;x+1;"
    root
  end

  def test_ruby
    s "def ruby_block_test
  puts 'ooooo'
  return 'yay'
end"
    execute_ruby_block
    # ^^ defines:
    ruby_block_test
  end

  def test_algebra
    s "2* ( 3 + 10 ) "
    #s "2*(3+10)"
    puts "Parse #{@string} as algebra?"
    assert algebra
    #puts eval good_node_values @root if @root #== @string
  end

  def assert x
    raise ScriptError if not x
    puts x
    puts "!!OK!!"
  end

  def test_args
    s " an mp3"
    assert(endNode)
  end

  def test
    puts "Starting tests!"
    begin
      s "a bug"
      test_method3
      test_method4
      assert endNode
      test_ruby_variables
      test_args
      test_algebra
      test_ruby
      test_ruby_def
      test_ruby_method_call
      test_ruby_all
      #return
      test_js
      test_verb
      test_setter2
      test_setter3
      test_comment
      #star { arg }
      test_block
      test_quote
      test_while
      test_method_call
      #test_methods
      #  test_looper
      show_tree
      puts "++++++++++++++++++\nPARSED successfully!"
    rescue => e
      error e
    end
  end

end

#EnglishParserTest.new.test

#require 'test_helper'

class ParserTest < ActiveSupport::TestCase
  # test "the truth" do
  #   assert true
  # end
  test "all" do
    EnglishParserTest.new.test
  end


  test "jeannie" do
    p=EnglishParser.new
    r= p.jeannie ("3 plus 3")
    puts "jeannie : 3 plus 3 = "+r.to_s
    assert(r=="6")
    puts "OK!!!!!!"
  end

end

