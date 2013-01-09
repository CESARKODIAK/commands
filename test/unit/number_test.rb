require 'test_helper'
#require '../test_helper'

$use_tree=false
$use_tree=true

#require_relative "../lib/english-script/english-parser"
require_relative "../../lib/english-script/english-parser"

class NumberTestParser<EnglishParser

  def initialize
    @@testing=true
    super
  end

  def test_int_methods
    parse "invert 3"
    assert @result=="1/3"
  end

  def test_type1
    parse "class of 1"
    assert @result==Fixnum
    parse "class of 3.3"
    assert @result==Float
  end

  def test_type2
    assert "3.2 is a Float"
    assert "3.2 is a Numeric"
    assert "3.2 is a number"
    assert "3.2 is a real number"
    assert "3.2 is a real"
    assert "3.2 is a float"
    assert "3.2 is a float number"
  end

  def test_type3
    assert "3 is a Fixnum"
    assert "3 is a Numeric"
    assert "3 is an Integer"
    assert "3 is a number"
    assert "3 is an integer"
  end

  def current
    test_type1
    test_type2
    test_type
    test_type3
  end

end

class NumberTest < ActiveSupport::TestCase

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
    @testParser=StringTestParser.new
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
    @testParser.current
  end

end
