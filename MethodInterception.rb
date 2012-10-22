class MethodInterception

  @@tree=[]
  @@tokens=[]

  @@current_value=""
  def current_value= x
    @@current_value=x
  end

  def show_tree
    #puts "TREE:"
    puts @@tree.join("->")
    puts @@tokens.join(" ")
  end

  def ignore
    #test_setter Should never be set ("")!?
    ["_","_?","tokens","number","endNode","the_noun_that","nod", "rest_of_line","setter","test_setter","method_missing","star","endNode2","no_rollback!","string_pointer","verbose","try","any","checkEnd","to_source","rest"]
  end

  def keepers
    ["token","tokens"]
  end

  def bad name
    #bad_name=true if name.to_s.end_with?("?") or
    ignore.index name.to_s # 0 == true ! OK
  end

  def before_each_method name
    @@current_value="" if not bad name and not keepers.index name.to_s
    #p [:before_method, name]
  end

  @@last_value=""
  # not called on error, good
  def after_each_method name
    #p [:after_method, name]
    if not bad name
      #@@tokens.delete_at(-1) if @@last_value==@@current_value #last vs first??
      return if @@last_value==@@current_value
      @@last_value=@@current_value
      @@tokens<<name.to_s+":"+@@current_value if not @@current_value.empty?
      @@tree<<name.to_s # if @@current_value.empty?
      end
  end

  def self.method_added name
    return if @__last_methods_added && @__last_methods_added.include?(name)
    with = :"#{name}_with_before_each_method"
    without = :"#{name}_without_before_each_method"
    @__last_methods_added = [name, with, without]
    define_method with do |*args, &block|
      before_each_method name
      #begin
      val=send without, *args, &block
      #rescue x  doesn't work
      after_each_method name
      return val
      #raise y if y
    end
    alias_method without, name
    alias_method name, with
    @__last_methods_added = nil
  end

end
