class Node

  attr_accessor :name
  attr_accessor :value
  attr_accessor :parent
  attr_accessor :nodes
  attr_accessor :valid

  def show_node
    #true
    @valid and @nodes.empty? and @value or not @nodes.empty? # if node.valid
  end

  def is_leaf
    nodes.empty?
  end

  def good_value
    return @name.to_s if not @nodes.empty?
    return @name.to_s + ":" + @value.to_s
  end

  def to_s
    good_value
  end

  def destroy
    @valid=false
    @parent.nodes.delete(self) if @parent
  end

  def initialize args={}
    @parent=nil || args[:parent]
    @parent.nodes<<self if @parent
    @nodes=[]
    @valid=false
    @value=nil || args[:value]
    @name=nil || args[:name]
  end
end
