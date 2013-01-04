require 'test_helper'
$testing=true
require_relative "../../lib/english-script/english-parser"

class ThatTest < ActiveSupport::TestCase

  def self.parse x,&block
    s x
    test x do block
    end
  end

  parse "what is that"

end
