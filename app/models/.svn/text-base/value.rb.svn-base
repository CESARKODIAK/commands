class Value < ActiveRecord::Base
  belongs_to :node
  def to_s
    '"'+value+'"'
#    "Value{"+value+"}"

  end
  def inspect
    to_s
  end
end
