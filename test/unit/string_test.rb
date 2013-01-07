require 'test_helper'
#require '../test_helper'

#$dont_use_tree=true
$dont_use_tree=false
#require_relative "../lib/english-script/english-parser"
require_relative "../../lib/english-script/english-parser"

class StringTestClass<EnglishParser

  def initialize
    @@testing=true
    super
  end

  def _test_string_methods
    p "invert 'hi'"
    assert @result=="ih"
    p "x='hi' inverted"
    assert @result=="ih"
    assert(@variables['x']== 'hi');
  end

  def test_concatenation
    s "x is 'hi'"
    setter
    assert(@variables['x']== 'hi');
    p "x is 'hi'
       y is 'world'
        z is x + ' ' + y"
    assert(@variables['z']== 'hi world');
    assert("z is 'hi world'");
    p "x is 'hi'; y is 'world';z is x ' ' y"
    assert("z is 'hi world'");
    p "x is 'hi'; y is 'world';z is x plus ' ' plus y"
    assert("z is 'hi world'");
    p "x is 'hi'; y is 'world';z is x and ' ' and y"
    assert("type of z is string or type of z is list")
    #assert("type of z is string or list") // !+!+!
    assert("z is 'hi world' OR z is 'hi',' ','world'");
  end


  def test_type1
    s "class of 'hi'"
    evaluate_property
    assert @result==String
    s "class of 'hi'"
    expression
    assert @result==String
    p "class of 'hi'"
    assert @result==String
  end


  def test_type2
    p "x='hi';
      class of x"
    p "x='hi';class of x"
    assert @result==String
  end


  def test_result
    p "x be 'hello world';show x;x; class of x"
    assert("type of x is string")
    assert("class of x is string")
    assert("kind of x is string")
    p "y is type of x"
    assert("y is string")
  end


  def test_type
    parse "x='hi'"
    assert "type of x is string"
  end

  def test_type3
  p "x be 'hello world';show x;x;y= class of x"
    assert @variables['y']==String

    assert("type of x is string")
    assert("class of x is string")
    assert("kind of x is string")
    p "y is type of x"
    assert("y is string")
  end

end

class StringTest < ActiveSupport::TestCase

  def NOmethod_missing(sym, *args, &block) # <- NoMethodError use node.blah to get blah!
    syms=sym.to_s
    if @testParser and @testParser.methods.contains(sym)#(syms.end_with?"?")
      x= try { @testParser.send(sym) } if args.count==0
      x= try { @testParser.send(sym,args[0]) } if args.count==1
      x= try { @testParser.send(sym, args) } if args.count>0
      return x
    end
    super(sym, *args, &block)
  end

  def self._test x
    puts "NOT testing "+x.to_s
  end

  def initialize args
    @testParser=StringTestClass.new
    super args
  end

  _test "ALL" do
    @testParser.methods.each{|m|
      if m.to_s.starts_with?"test"
        @testParser.send(m)
      end
    }
  end

  test "current" do
    #@testParser.test_type1
    #@testParser.test_type2
    @testParser.test_type
  end

end
