require 'test_helper'
$use_tree=false
#$use_tree=true
require_relative "../../lib/english-script/english-parser"

class LoopTestParser<EnglishParser
  def current
    #test_loops
    #test_forever
    test_expressions
    #test_repeat
  end

  def test_forever
    s "beep forever"
    loops
    parse "beep forever"  # OK ;{TRUST ME;}
  end


  def test_loops
    s "beep three times"
    loops
    parse "beep three times"
    parse "repeat three times: beep; okay"
  end

  def test_expressions
    #s "counter=0"
    #setter
    parse "counter=1"
    #counter=@variables['counter']
    #@variables['counter']=1
    #parse "counter+1"
    #r=expression0
    assert(@variables['counter']==1)
    parse "counter++"
    #r=expression0
    assert(@variables['counter']==2)
    #@variables['counter']=2
    parse "counter+=1"
    #r=plusEqual
    #r=expression0
    assert(@variables['counter']==3)
    parse "counter=counter+counter"
    #r=setter
    #r=algebra
    #r=expression0
    counter=@variables['counter']
    assert counter==6
  end

  def test_repeat # NEEEEDS blocks!! Parser.new(block)
    #parse "repeat three times: beep; okay"
    #parse "repeat three times: beep"
    #parse "counter =0; repeat three times: increase the counter; okay"
    #assert "counter =5"
    s "counter=counter+1;"
    action
    parse "counter =0; repeat three times: counter=counter+1; okay"
    assert "counter =5" if $use_tree # counter=counter+1 not repeatable as string
    parse "counter =0; repeat three times: counter+=1; okay"
    assert "counter =5"
    parse "counter =0; repeat three times: counter++; okay"
    counter=@variables['counter']
    assert "counter =5"
    #parse "counter =0; repeat three times: increase the counter by two; okay"
    #assert "counter =10"
  end
end

class ListTest < ActiveSupport::TestCase

  def self._test x
    puts "NOT testing "+x.to_s
  end

  def initialize args
    @testParser=LoopTestParser.new
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
