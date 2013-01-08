require 'test_helper'
$use_tree=false
require_relative "../../lib/english-script/english-parser"

class ListTestClass<EnglishParser
  def current
    test_type0
    #test_list_syntax
    #test_type1
    #test_type2
    #test_type
    #test_type3
    #test_concatenation
    #test_gerunds
    #test_string_methods
    #test_select
    #test_concatenation
    #test_concatenation2
  end

  def initialize
    @@testing=true
    super
  end


  def test_type0
    s "1 , 2 , 3"
    list
    s "1,2,3"
    list
    s "[1,2,3]"
    list
    s "{1,2,3}"
    list
    s "1,2 and 3"
    list
    s "[1,2 and 3]"
    list
    s "{1,2 and 3}"
    l=list
    assert l==[1,2,3]
  end


  def _test_list_methods
    p "invert [1,2,3]"
    assert @result=="[3,2,1]"
    p "x='hi' inverted"
    assert @result=="ih"
    assert(@variables['x']== 'ih');
  end

  def _test_select
    assert "first character of 'h','i','v' is 'h'"
    assert "second character of 'h','i','v' is 'i'"
    assert "last character of 'h','i' is 'i'"
    assert "first word of 'hi,'you' is 'hi'"
    assert "second word of 'hi','you' is 'you'"
    assert "last word of 'hi','you' is 'you'"
    assert "first item in 'hi,'you' is 'hi'"
    assert "second item in 'hi','you' is 'you'"
    assert "last item in 'hi','you' is 'you'"
    assert "numbers are 1,2,3. second number is 2"
    assert "my friends are a,b and c. my second friend is b"
  end

  def test_list_syntax
    assert("1,2 is [1,2]")
    assert("1,2 is {1,2}")
    assert("[1,2] is {1,2}")
    assert("1,2 and 3 is [1,2,3]")
    assert("1,2,3 is the same as [1,2,3]")
    assert("1,2 and 3 is the same as [1,2,3]")
  end

  def test_concatenation
    p "x is 1,2,3;y=4,5,6"
    assert(@variables['x']== [1,2,3]);
    assert(@variables['y'].count== 3);
    s "x + y"
    z=algebra
    assert @result.length==6
  end

  def test_concatenation2
    p "x + y"
  assert @result.length==6
  p "x is 1,2
       y is 3,4
       z is x + y"
  assert(@variables['z']== [1,2,3,4]);
  assert("x and y == [1,2,3,4]")
  assert("x and y == 1,2,3,4");
  assert("x + y == 1,2,3,4");
  assert("x plus y == [1,2,3,4]");
    end

  def test_type1
    s "class of 1,2,3"
    evaluate_property
    assert @result==Array
    s "class of [1,2,3]"
    expression
    assert @result==Array
    p "class of 1,2,3"
    assert @result==Array
  end


  def test_type2
    p "x=1,2,3;class of x"
    assert @result==Array
  end


  def test_type
    parse "x=1,2,3;"
    assert "type of x is Array"
  end

  def test_type3
  p "x be 1,2,3;y= class of x"
    assert @variables['y']==Array
    assert("type of x is Array")
    assert("class of x is Array")
    assert("kind of x is Array")
    assert("y is Array")
  end

  def test_selector1
    assert("every number in 1,'a',3 ==1,3")
    assert("all numbers in 1,'a',3 ==1,3")
    assert("all negative numbers in 1,-2,3,-4 ==-2,-4")
    assert("all numbers in 1,-2,3,-4 that are negative == -2,-4")
  end

  def test_map
    assert("square every number in 1,2,3 ==1,4,9")
    assert("add one to every number in 1,2,3 ==2,3,4")
    assert("square every number in 1,'a',3 ==1,9")
  end


end

class ListTest < ActiveSupport::TestCase

  def self._test x
    puts "NOT testing "+x.to_s
  end

  def initialize args
    @testParser=ListTestClass.new
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
