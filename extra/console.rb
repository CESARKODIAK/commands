
def self.method_missing method, *args, &block
  name=method.to_s
#	puts "Creating "+name
  isPlural= /s$/ =~ name

  n=Node.find_by_name name
  if isPlural and not n
    alle=Node.list name.sub(/s$/, "")
#    alle=alle[:noun]
#    a2=alle.classes if(alle.length==1)
#    alle<<a2 if a2 and a2.lenght>0
    return alle if alle
  end
  n=Node.get name
#    puts n.show
#  puts "console method_missing "+method+" "+args
  n.handle_arguments args if args.length>0
  if block_given?
#		n.value=block.call rescue nil
    n.evaluate &block
    #todo: New.word{a,b,c}
  end
  # install_alias_method name,n

  # eval name+"="+n
  # self.instance_variable_set name,n   NUR FUER @a

#  eval "def #{name} *args\nputs 'searching #{name}';return Node.get('#{name}').handle_arguments(args)\nend"
#  namE=name.capitalize
  # clazz="class #{namE}\ndef self.method_missing\nputs 'find class #{name}'; Node.get '#{name}'\nend\nend"
  # puts clazz
  # eval clazz
  # self.class.send(:define_method, name) { Node.get "name" }
  # self.define_method "name",{n}
  # alias_method n,:name

  return n
end

def drop id
    sql = ActiveRecord::Base.connection();
    sql.execute("delete from nodes where id=#{id}")
    sql.execute("delete from nodes where context_id=#{id}")
    sql.execute "delete from statements where context_id=#{id}";
    sql.execute "delete from statements where subject_id=#{id}";
    sql.execute "delete from statements where predicate_id=#{id}" if(type!="Relation")
    sql.execute "delete from statements where object_id=#{id}";
end

  def merge a,b
    #danger!!!
    sql = ActiveRecord::Base.connection();
    sql.execute("update nodes set context_id=#{a} where context_id=#{b}")
    sql.execute("update statements set context_id=#{a} where context_id=#{b}")
    sql.execute("update statements set subject_id=#{a} where subject_id=#{b}")
    sql.execute("update statements set predicate_id=#{a} where predicate_id=#{b}")
    sql.execute("update statements set object_id=#{a} where object_id=#{b}")
    sql.execute("delete from nodes where id=#{b}")

    reload!
  end

def self.const_missing const, *args, &block
  name=const.to_s
  puts "Creating const "+name
end

def const_missing const, *args, &block
  name=const.to_s
  puts "Creating const "+name
end

def r
  alias re reload!
  re
#  self.reload!
end

#alias re reload!
def get args
  Node.get args
end

#just drop this'>>synonym statt >>a :Synonym'
#def a *args
#  Node.get args
#end

def the *args
  Node.get args
end

def sql x
  sql = ActiveRecord::Base.connection();
  sql.execute(x)
end

def delete id
  n=Node.get(id)
  n.edges.destroy
  n.destroy
end


class The < Node
  def self.method_missing a
    Node.get a.to_s
  end
end
