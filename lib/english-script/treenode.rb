class TreeNode

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

  def full_value
    if value
      if $variables and ($variables[value])
        return $variables[value]
      else
        return value
      end
    elsif @nodes.count>0
      return @nodes.map(&:full_value).join(" ")
    else
      return ""
    end
  end

  def value_string
    if x.nodes.count==1
      return x.to_s
    else
      r="" # argument hack
      for n in x.nodes
        r=n.value+" "+r if n.value and n.valid
      end
    end
    return r
    #x=x.full_value.flip  # argument hack NEEE color= green  color of the sun => sun.green --
  end


  def eval_node variables
    $variables||=variables
    whot=full_value
    begin
      whot.gsub!("\\","") # where from?? token?
      res=eval(whot) rescue nil ## v0.0
      return res
    rescue SyntaxError => se
    end
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
