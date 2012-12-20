class Context < Node
  has_many :nodes
# ^^ zu teuer
  has_many :functions #,:through => :nodes
  has_many :variables, class_name: 'Node'

  def count
    nodes.count
  end

  def self.cleanup
    sql = ActiveRecord::Base.connection();
    sql.execute("delete from nodes where not context_id")
  end


  def self.merge a,b
    sql = ActiveRecord::Base.connection();
    sql.execute("update nodes set context_id=#{a} where context_id=#{b}")
    sql.execute("update statements set context_id=#{a} where context_id=#{b}")
    sql.execute("update statements set subject_id=#{a} where subject_id=#{b}")
    sql.execute("update statements set predicate_id=#{a} where predicate_id=#{b}")
    sql.execute("update statements set object_id=#{a} where object_id=#{b}")
    reload!
  end

  def self.index name
    Context.find_by_name name.to_s
  end

  def self.get name
    Context.find_by_name name.to_s
  end

  def clear
    sql = ActiveRecord::Base.connection();
     sql.execute("delete from nodes where context_id=#{id}")
     sql.execute("delete from statements where context_id=#{id}")
  end

# hack!
#  def method_missing x
#    return the x.to_s
#  end


def the name
    first name
end

def first name
    Node.find :first, :conditions=>"name='#{name}' and context_id=#{id}"
end

def last name
    Node.find :last, :conditions=>"name='#{name}' and context_id=#{id}"
  end
  def all name
      Node.find :all, :conditions=>"name='#{name}' and context_id=#{id}"
    end

  def self.My
    return Context.first
  end
  def self.my
    return Context.first
  end

  def inspect
    show#Node
  end


#  alias old_method_missing method_missing

  def self.method_missing2 meth, *args
#    puts "."
#    puts "method_missing "+meth+" "+args

    arg=args[0] rescue ""
    arg=arg.to_s if arg.is_a? Symbol
    #    puts caller
    begin
#      x= old_method_missing(meth, args) if args.length > 0
#      x= old_method_missing(meth) if args.length==0
#      puts "found method "+meth+" "+args
#      return x
    rescue NoMethodError
#      puts "ok"
    rescue NameError
      puts $!
      return
#      puts "ok"
    rescue ArgumentError
      puts "+++++++++++++++++++"
      puts "ArgumentError "+meth+" "+args
      puts $!
#      puts $!.backtrace
      puts "---------------------"
#      retry if old_method_missing(meth)
    rescue => err;
      puts "Rescued #{err.class.name}";
      puts $!
#      raise err
      return
#      puts "nix"
    end
    Context.find_by_name args
end

end

