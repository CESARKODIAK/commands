class ActiveRecord::Base
  def self.random
    self.find(:first, :offset => rand(self.all.size))
#    self.find(:all, :order => 'rand()')
#    self.first(:conditions => "id >= floor(rand() * (select max(id) from widgets))", :limit => 1)
  end
end

class String
  def + other
    "#{self}#{other.to_s}"
  end
  def to_upper
    self.upcase
  end
  def to_lower
    self.downcase
  end
end

class Dir
  def self.mkdirs(path)
    %x{mkdir -p #{path}}
    return
  end
  # alias self.mkdirs=self.makedirs
end

class Float
  def precision digits=2
    (10**digits * self).round/10.0**digits
  end

  def to_p digits=1
    precision digits
  end
end

class Fixnum

  alias :add :+

  def + other
    return self.to_s+other.to_s if other.class.name=="String"
    self.add other
  end

  def pad(minLength)
    str=self.to_s
    while (str.length < minLength)
      str = "0" + str;
    end
    str;
  end

  def node
    Node[self]
  end
end
class Bignum
  def node
    Node[self]
  end
end

class Object;
  def this
    self
  end

  def to_p;
    self.round rescue 0;
  end

  ;
end
class Array;
# geht nicht mit Abstract.all[1..10]
#!!!
#  alias old_indexer []
#  def [] a,b=nil
#    return old_indexer(a,b) if a.is_a?(Integer) and b
#    return old_indexer(a) if a.is_a?(Integer)
#    return find_matches(Node.get(a)) if self[0].is_a?(Node)
#    return old_indexer(a,b) if b
#    return old_indexer(a)
#  end


  def find_matches m
    all=[]
    for n in self
      all<<n if n.is? m || n.has?(m)
#      all<<n if n.has? m
    end
    return all
  end

  def find_match m
    for n in self
      return n if n.is? m
    end
    return nil
  end

  def mean;
    sum.to_f / size rescue 0;
  end

  ;
end
class Array;
  def average;
    sum.to_f / size rescue 0;
  end

  ;
end
class Array;
  alias count :size;
end;
class Array;
  def sum_tolerant;
    inject( nil ) { |sum, x| sum ?  sum+(x||0):(x||0)  }||0;
  end

  ;
end

require 'uri'


class Hash
  def method_missing(meth, *args)
    if /=$/=~(meth=meth.id2name) then
      self[meth[0...-1]] = (args.length<2 ? args[0] : args)
    else
      self[meth]
    end
  end
end


#class Object
##	alias  :var :attr_accessor
#end


class ActiveRecord::Migration
  def self.table_exists (name)
    begin
      say "select 1 from `#{name}` limit 1"
      User.connection.execute("select 1 from `#{name}` limit 1")
      say "Checking For Table: #{name} => Table Found"
      return true;
    rescue
      begin
        say "select 1 from '#{name}' limit 1"
        User.connection.execute("select 1 from `#{name}` limit 1")
        say "Checking For Table: #{name} => Table Found"
        return true;
      rescue
        say "Checking For Table: #{name} => Table Not Found"
        return false;
      end
    end
  end
end

#!!!!!!!!!!!!!!!!!!!!
#class Object
#  def instance_exec(*args, &block)
#    mname = "__instance_exec_#{Thread.current.object_id.abs}"
#    class << self; self end.class_eval{ define_method(mname, &block) }
#    begin
#      ret = send(mname, *args)
#    ensure
#      class << self; self end.class_eval{ undef_method(mname) } rescue
#nil
#    end
#    ret
#  end
#
#  def instance_eval_with_args(obj, *args, &block)
#    # Magic goes here to evaluate +block+ in the scope of
#    # +obj+, yet pass a list of argument values to the block.
#    obj.instance_exec(*args, &block)
#  end
#end

class Array

  alias old_method_missing method_missing_hack
  def method_missing_hack meth, *args,&block
#    puts "."

    arg=args[0] rescue ""
    arg=arg.to_s if arg.is_a? Symbol
    #    puts caller
    begin
      x= old_method_missing(meth, args) if args.length > 0
      x= old_method_missing(meth) if args.length==0
#      puts "found method "+meth+" "+args
      return x
    rescue NoMethodError
#      puts "ok"
    end
    meth=meth.to_s
    meth.gsub!(/s$/,'') if not self[0].respond_to? meth

    puts "call method "+meth+" "+args+" "+block+" on array"
#    return map{|x| instance_eval_with_args x,meth.to_s,args,block} if  block
    return map{|x| x.send meth,args[0],&block} if  block and args.length==1
    return map{|x| x.send meth,args,&block} if  block and args.length>0
    return map{|x| x.send meth,&block} if  block
    return map{|x| x.send(meth,args[0])} if  args.length ==1
    return map{|x| x.send(meth,args)} if  args.length > 0
    return map{|x| x.send(meth)} if  args.length ==0
#    return map{|x| x.instance_eval meth} if  args.length == 0
  end
end

