require 'test_helper'

class VariableTest < ActiveSupport::TestCase
  # test "the truth" do
  #   assert true
  # end
  test "local variables" do
    parse "x=2;def test\nx=1\nend\ntest"
    assert "x=2 or x=1?"
    parse "x=1;try x=2;"
    assert "x=2"
    parse "x=1;while x<2 do x=2;"
    assert "x=2"
  end
end
