#require File.expand_path(File.dirname(__FILE__) + '/../node.rb')
require_relative "node"
require_relative "extensions"

#class MethodInterception
module MethodInterception

  def initialize
    super # needs to be called by hand!
    @tree=true#[]
    @nodes=[]
    @tokens=[]
    @new_nodes=[] #  remove after try failed
    @current_node=nil
    @root=nil
    @current_value=""
  end

  def ignore
    #"newline","newlines","newline?",
    #test_setter Should never be set ("")!?
    #"token","tokens",
    ["_","_?","tokens", "any","initialize",         "one_or_more","expression",             "endNode",
     "the_noun_that","nod",
     "star",
     "rest_of_line","setter",
     "root","action","parse","number","allow_rollback",
     "test_setter","try_action","method_missing","endNode2","no_rollback!","raiseEnd",
     "string_pointer","verbose","try","checkEnd","to_source","rest","keywords",
     "starts_with?", "be_words","no_keyword","prepositions","variables_list","the?","app_path"] #"call_is_verb",
  end

  def keepers
    ["token","tokens"]
  end
  def current_value= x
    @current_value=x
  end

  def walk_tree node,tabs=0
    puts " "*tabs+node.good_value if node.show_node #if node.valid
    for n in node.nodes
      #next if not n.valid
      walk_tree n, (tabs+1)
    end
    #node.destroy if node.nodes.empty? and not node.valid
  end


  def flat_tree  node
    puts node.good_value if node.show_node and node.value
    for n in node.nodes
      flat_tree n
    end
  end

  def show_tree
    return if not @root
    walk_tree @root
    puts "---------"
    flat_tree @root
  end

  def bad name
    return true if name.to_s.end_with? "_words"
    #bad_name=true if name.to_s.end_with?("?") or
    ignore.index name.to_s # 0 == true ! OK
  end

  def get_parent
    return nil if @nodes.count==0
    for i in 0..(caller.count)
      next if not caller[i].match(/parser/)
      name=caller[i].match(/`(.*)'/)[1]
      for j in 0..(@nodes.count)
        node=@nodes[-j]
        node_name=node.name.to_s
        return node if(node_name==name)
      end
    end
    return nil
  end

  def before_each_method name
    if not bad name
      @current_value=nil# if not keepers.index name.to_s
                        #parent=@current_node
      @current_node=Node.new(parent:get_parent, name:name)
      @root=@current_node if @nodes.count==0
      @nodes<<@current_node
    end
    #not bad name and
    #@current_value="" if  not keepers.index name.to_s
    #p [:before_method, name]
  end

  # not called on error, good
  def after_each_method name
    if not bad name
      @current_node.valid=true #if @current_value
      @current_node.value=@current_value if @current_node.is_leaf
      @nodes.pop
      @current_node=@nodes[-1]
      @new_nodes<<@current_node
    end
    @current_value=nil if not keepers.index name.to_s
  end

  def self.included(base)
    base.extend ClassMethods
  end
  module ClassMethods
    @@use_tree=false
    @@use_tree=true # DO NOT use while developing!
    @@__last_methods_added=[]

    def method_added name
      return if not @@use_tree
      return if @@__last_methods_added && @@__last_methods_added.include?(name)
      with = :"#{name}_with_before_each_method"
      without = :"#{name}_without_before_each_method"
      @@__last_methods_added = [name, with, without]
      define_method with do |*args, &block|
        before_each_method name
        val=send without, *args, &block
        after_each_method name
        #begin rescue  doesn't work
        return val
      end
      alias_method without, name
      alias_method name, with
      @@__last_methods_added = nil
    end
  end
end

