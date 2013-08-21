require 'test_helper'
$use_tree=false
#$use_tree=true
require_relative "../../lib/english-script/english-parser"

class ConditionTestParser<EnglishParser
  def current
    test_if_in_loop
    #test_loops
    #test_forever
    #test_expressions
    #test_if
  end
  def test_if_in_loop
    parse "c=0;while c<3:c++;if c>1 then beep;done"
  end

  def test_if
    parse "if 1>0 then beep"
    assert @result=="beeped"
    parse "if 1>0 then: beep"
    assert @result=="beeped"
    parse "if 1>0 then: beep;"
    assert @result=="beeped"
    parse "if 1>0 then: beep;end"
    assert @result=="beeped"
    parse "if 1>0\n beep\nend"
    assert @result=="beeped"

    parse "if one is bigger than zero then beep"
    assert @result=="beeped"
    #parse "if 1>0 beep"
    #assert @result=="beeped"
  end

end


class ConditionTest < ActiveSupport::TestCase

  def self._test x
    puts "NOT testing "+x.to_s
  end

  def initialize args
    @testParser=ConditionTestParser.new
    super args
  end

  _test "ALL" do
    @testParser.methods.each { |m|
      if m.to_s.starts_with? "test"
        @testParser.send(m)
      end
    }
  end

  test "current" do
    @testParser.current
  end

end