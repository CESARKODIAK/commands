require 'test_helper'
$use_tree=false
require_relative "../../lib/english-script/english-parser"

class MacTestParser<EnglishParser
  def current

  end
end

class ListTest < ActiveSupport::TestCase

  def self._test x
    puts "NOT testing "+x.to_s
  end

  def initialize args
    @testParser=ListTestParser.new
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
