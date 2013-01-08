require 'test_helper'
#require '../test_helper'

$use_tree=true

#require_relative "../lib/english-script/english-parser"
require_relative "../../lib/english-script/english-parser"

class TreeParserTestParser<EnglishParser
  #@@parser=EnglishParser.new

  def initialize
    @@testing=true
    super
    #@@parser=EnglishParser.new
  end

  def assert x=nil, &block
    x=yield if not x and block
    #raise Exception.new (to_source(block)) if not x
    raise ScriptError.new to_source(block) if not x
    puts x
    puts "!!OK!!"
  end

  def s string
    allow_rollback
    init string
    #@@parser.init string
  end


  def NOmethod_missing(sym, *args, &block) # <- NoMethodError use node.blah to get blah!
    syms=sym.to_s
    if @@parser and @@parser.methods.contains(sym)#(syms.end_with?"?")
      x= try { @@parser.send(sym) } if args.count==0
      x= try { @@parser.send(sym,args[0]) } if args.count==1
      x= try { @@parser.send(sym, args) } if args.count>0
      return x
    end
    super(sym, *args, &block)
  end

  def test_method4
    s "how to integrate a bug
      test
    ok"
    assert method_definition
  end



  def test_block
    s "let the initial value of I be x;\nstep size is the length of the interval,
divided by the number of steps\nvar x = 8;"
    block
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

  def test_looper
    s "while i is smaller or less then y do\nyawn\nend"
    looper
  end

  def test_method_call
    s "evaluate the function at point I"
    method_call
    #action
  end

  def test_algebra
    s "2* ( 3 + 10 ) "
    #s "2*(3+10)"
    puts "Parse #{@string} as algebra?"
    ok=algebra
    assert @result==26
    assert @current_node!=nil
    #assert @current_node==@root
    full_value=@current_node.full_value
    assert eval(full_value)==26
    assert @current_node.eval_node==26
  end

end



class TreeParserTest < ActiveSupport::TestCase

  def initialize args
    @testParser=TreeParserTestParser.new
    super args
  end

  def self._test x
    puts "NOT testing "+x.to_s
  end

  _test "ALL" do
    @testParser.methods.each{|m|
      if m.to_s.starts_with?"test"
        @testParser.send(m)
      end
    }
  end

  test "current" do
    @testParser.test_algebra
    #@testParser.test
  end

end
