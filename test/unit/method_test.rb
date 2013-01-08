require 'test_helper'
#require '../test_helper'

$use_tree=true

#require_relative "../lib/english-script/english-parser"
require_relative "../../lib/english-script/english-parser"

class StringTestClass<EnglishParser

  def initialize
    @@testing=true
    super
  end

  def test_result
    parse "how to test:show 3;ok"
    assert @methods.count>0
    assert @methods.last.name=="test"
    parse "test"
    assert @result=="3"
    #assert @variables['x']==3
  end

  def test
    puts "Starting tests!"
    begin
      test_result
      show_tree
      puts "++++++++++++++++++\nPARSED successfully!"
    rescue => e
      error e
    end
  end

end


class StringTestTest < ActiveSupport::TestCase

  def initialize args
    @testParser=StringTestClass.new
    super args
  end

  def self._test x
    puts "NOT testing "+x.to_s
  end

  test "ALL" do
    @testParser.methods.each{|m|
      if m.to_s.starts_with?"test"
        @testParser.send(m)
      end
    }
  end

end
