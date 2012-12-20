# See initializers/console.rb for console linking
#def nil.to_s
#  "NIL!"
#end

class Node < ActiveRecord::Base

#  belongs_to :context, :foreign_key => "context_id", :class_name=>"Node", :polymorphic => true
  belongs_to :context, :foreign_key => "context_id", :class_name=>"Context"#, :polymorphic => true
  belongs_to :parent, :foreign_key => "parent_id", :class_name=>"Node"#, :polymorphic => true
#  belongs_to :kind, :foreign_key => "kind_id", :class_name=>"Node"#, :polymorphic => true
  has_many :subject_statements, :foreign_key => "subject_id", :class_name => "Statement"
  has_many :predicate_statements, :foreign_key => "predicate_id", :class_name => "Statement"
  has_many :object_statements, :foreign_key => "object_id", :class_name => "Statement"
  has_one :value

  before_save :fix_id
#
#
#  has_many :subject_statements, :foreign_key => "subject", :class_name => "Statement"
#  has_many :predicate_statements, :foreign_key => "predicate", :class_name => "Statement"
#  has_many :object_statements, :foreign_key => "object", :class_name => "Statement"
#  has_many :modifier_statements
  def members

  end

  def get predicate, object=nil
    get_member predicate, object
  end

  def self.list instance_name
    begin
      Node.find_all_by_name instance_name.to_s
    rescue Interrupt
      puts "Interrupted\n"
    rescue IRB::Abort
      puts "Interrupted\n"
    end
  end
  @value

  #def value
  #  Value.find :last, :conditions=>"node_id=#{id}" rescue @value
  #end
  #
  #def value= val
  #  @value=val
  #  Value.new(:node=>self, :value=>val).save
  #end

  def edges
    subject_statements+object_statements
  end

  def statements
    edges
  end


  #alias old_initialize initialize
  alias old_inspect inspect
  alias old_save save
  alias old_destroy destroy

  def destroy
    clear
    #@@instances.remove self
    @@instances.delete self.name
    old_destroy
  end

#attr_accessor :name,:class,:value,:statements,:block
#  attr_accessor :value, :statements, :owner
#  , :kind
#  @kind=0
#  kind=0
#
#  def initialize args=nil
    #puts "init "
    #old_initialize args
    #return self
  #end


  def fix_id
    self.id=Node.next_id if not @id and not id or (@id and  @id<1) or (id and id<1)
  end


  def self.next_id
    sql = ActiveRecord::Base.connection();
#    puts sql.methods
    nid= sql.execute("SELECT id FROM lastids limit 1").fetch_row[0].to_i rescue nil
    nid= sql.execute("SELECT id FROM lastids limit 1")[0][0].to_i rescue 0 if not nid
    if (nid<1)
      puts "Lastid < 1 !!"
      nid=sql.execute("SELECT max(id) FROM nodes limit 1").fetch_row[0].to_i rescue nil
      nid=sql.execute("SELECT max(id) FROM nodes limit 1")[0][0].to_i rescue 0 if not nid
      sql.execute("Insert Into lastids (id) values (#{nid+1})")
    end
    sql.update("UPDATE lastids SET id=#{nid+1} where id>0");
    nid+1
  end



#   alias self_old_method_missing self.old_method_missing
  def self.instances
    puts "hi"
    @@instances
  end
#
#  @@old_class_method_missing = self.public_class_method(:method_missing)
#  def self.method_missing method, *args, &block
#    begin
#      puts @@old_class_method_missing
##      return @@old_class_method_missing.call(method, args)#OK!
#    rescue
##      puts "nix"
#    end
#    n=Node.get method.to_s
#    n.value=args[0] if args.length>0
#    if block_given?
#      n.evaluate &block
#    end
#    return n
#  end

  @@instances=Hash.new
  def self.get(name, context=nil)
    return name if name.is_a? Node
#    n=Node.find_by_name name
    n=@@instances[name] if not n
    puts "found #{name} in RAM" if n
#    Value.find :first,
    if not n
      n=Node.find_by_id name if name.is_a? Fixnum
      n=Node.find_by_name name.to_s if not n #all
      puts "found #{name} in DB" if n
    end
    if not n
      puts "create "+name
      n=Node.new(:name=>name, :context=>context) if context
      n=Node.new(:name=>name) if not context
    end
    @@instances[name]=n
    @@instances[n.id]=n
    n
  end


#allows for New.huhn{self.eier=8}
  def evaluate &block

#    puts block.methods
    puts "evaluate "+block
#puts &block.methods
    instance_eval &block
# wie geht New.huhn{eier=8} ? gar nicht? so nicht :
#@self_before_instance_eval = eval "self", block.binding
#self.instance_eval &block
#instance_eval &block, self.binding
  end

#
#def self.method_missing method
#	Node.new method.to_s
#end

  def self.Unknown
    Node.get "Unknown"
  end

#  def self.method_missing #needs trick [class eval alias ...]

  #alias old_method_missing method_missing

  def method_missing_hack meth, *args
#    puts "."
#    puts "method_missing "+meth+" "+args

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


    type="Node"  if type==nil
#    return name if (meth=='name')
#    return context.id if (meth=='context_id')
#    puts "method_missing "+meth+" "+args


    meth=meth.to_s
    isAssignment= /=$/ =~ meth
    isPlural= /s$/ =~ meth
    isQuestion= /\?$/ =~ meth
    isCall= /!$/ =~ meth
# raise "MethodMissing "+method  /\!$/ =~ method #if not (/=$/ =~ method) and args.length>0
    meth.sub!(/=$/, "")
#    puts isAssignment
    if find_edge meth
#      puts name+" FOUND "+meth
      return get(meth)
    elsif isAssignment
      puts name+".value="+arg
      add(meth, arg)
      return self
    elsif isQuestion
      ans=has meth
      return ans.blank? ? ans : Node.Unknown
    else
      if isPlural
        alle=get_all meth.sub!(/s$/, "")
        return alle if alle
      end
      node=add_new_member meth
    end
    if args.length>0 and isAssignment and node.is_a? Node
      isQuestion= /\?$/ =~ arg rescue false
      return node.value==arg.sub!(/\?$/, "") if isQuestion
      node.value=arg
      puts node.name+".value="+arg
    else
      puts "handle_arguments"
      node.handle_arguments args if args.length>0  rescue nil #TODO
    end
#    n.owner=self if not n.owner
    return node
  end


  def inspect
    show
#    return self
  end

  # def kind
  #    type
  #  end

  def show
    body=""
    @statements.each{|key, node|
      val= node.value.blank? ? "" : "="+node.value.to_s rescue ""
      body+=";" if not body.blank?
      body+= key+val
    } if @statements
    for node in subject_statements
      body+=";" if not body.blank?
      body+="\t"
      body+= node.predicate.blank? ? node.object.to_s : node.predicate.to_s+ (node.object.blank? ? "": ": "+node.object.to_s) rescue "xx"
    end
    for node in  object_statements
      body+=";" if not body.blank?
      body+="\t"
      body+= node.predicate.to_s+ "@"+node.subject.to_s rescue "xx"
    end
    if (body.length>30)
      body="\n"+body.gsub(";", "\n")+"\n"
    else
      body.gsub!("\t", " ")
    end
#    for node in  predicate_statements
#      body+=";" if not body.blank?
#      body+= node.subject.to_s+"->"+self.to_s+ "->"+node.object.to_s rescue "xx" if node.object.blank?
#      body+= self.to_s+"@"+node.subject.to_s rescue "xx" if not node.object.blank?
#    end
    body="{"+body+"}" if not body.blank?
    val= value.blank? ? "" : "="+value.to_s;
#    puts "self.value="+self.value
#    klass= type+" " rescue ""# @class=="object" ? "" : @class.to_s+" "
    klass= kind+" " if kind!="Node" rescue ""# @class=="object" ? "" : @class.to_s+" "
    return "\n"+klass+name.to_s+" #"+id+body+val+"\n";
  end

  def to_s
#    return label.value.to_s if has "label" rescue nil
    name.to_s
  end

  def set predicate, object=nil
    add predicate, object
  end

  def add predicate, object=nil
#    save
    predicate=Node.get predicate
    object=Node.get object if object
    predicate.save
    object.save if object
    statement=Statement.new({:subject=>self, :predicate=>Node.get(predicate), :object=>Node.get(object)})
#    statement=subject_statements.create({:subject=>self, :predicate=>Node.get(predicate), :object=>Node.get(object)})
    statement.save
    subject_statements<<statement
    object.object_statements<<statement if object
    predicate.predicate_statements<<statement if predicate
    statement.save
#    Statement.new(self,predicate,object).save if object
#    Statement.new(self,"HAS",predicate).save if not object
#    Statement.new({:subject=>self,:predicate=>predicate,:object=>object}).save if object
#    Statement.new({:subject=>self,:predicate=>"HAS",:object=>predicate}).save if not object
  end

  def self.[] id
    Node.get id
  end
#
#  def [] id
##    Node.get id #todo instances or so
#    get_all id
#  end

#
#  def kind
#    for s in subject_statements
#      return s.object if s.predicate==Relation.Hypernym|| s.predicate.is('IS')|| s.predicate.is('Type')
#    end
#    for s in object_statements
#      return s.subject if s.predicate==Relation.Hypernym|| s.predicate.is('Instance')|| s.predicate.is('subclass') and s.object==kind
#    end
#  end

  def is kind
    kind_s=kind.to_s.downcase
    return true if is_a? kind rescue nil
    return true if self==kind or self.class.to_s.downcase==kind_s or kind_s==(name||"").downcase rescue false #NIL !! todo
    return false
  end

  def length
    name.length
  end

  def is? kind
    return true if self.is kind
    return false if self.is_a? Statement
    return false if respond_to?"name" and name.is_a? Statement # SHOULD NEVER BE!!!!!!!!!!!!!!!!
    return false if kind.is_a? Statement
    for s in subject_statements
      return true if (s.predicate==Relation.Hypernym|| s.predicate.is('IS')||  s.predicate.is('SuperClass')|| s.predicate.is('Type')) and s.object.is kind
      # RECURSIVE!
      return true if (s.predicate==Relation.Hypernym|| s.predicate.is('IS')||  s.predicate.is('SuperClass')|| s.predicate.is('Type')) and s.object.is? kind
    end
    for s in object_statements
      return true if s.predicate==Relation.Hyponym|| s.predicate.is('Instance')|| s.predicate.is('SubClass') and s.object==kind rescue nil
    end
#    for s in subject_statements
#      return true if s.predicate==Relation.Hypernym|| s.predicate.is('IS')||  s.predicate.is('SuperClass')|| s.predicate.is('Type') and s.object.is kind
#    end                               u
#    for s in object_statements
#      return true if s.predicate==Relation.Hypernym|| s.predicate.is('IS')|| s.predicate.is('Type') and s.object==kind
#    end
    return false
  end

#  def get predicate
#    get_member predicate
#  end
  def self.where s
    Node.find :all, :conditions=>s
  end

  def get_member predicate, object=nil, &block
    for s in subject_statements
      next if not s.predicate
      if not object
        if (s.predicate and s.object and
                ( s.predicate.is(Relation.Meronym) or
                        s.predicate.is(Relation.Part) or
                        s.predicate.is(Relation.Substance) or
                        s.predicate.is('has')) and s.object.is(predicate))
        then
          return s.object||predicate
        end
        return s.object||predicate if s.predicate.is predicate
        return s.object||predicate if s.object.is predicate and not s.predicate.is_a? Relation rescue nil   #nee, oder
      else
        return s.object if s.predicate==predicate and s.object.is object
        return s.object if s.object.is object
      end
    end

    for s in object_statements
      next if not s.predicate
      if not object
        return s.object if s.object.is? predicate rescue nil
        return s.subject if s.subject.is? predicate rescue nil
        return s.predicate if s.predicate.is? predicate and not s.subject
        return s.subject if s.predicate.is_a? Relation and s.predicate.Antonym.is? predicate and s.subject rescue nil
      else
        return s.subject if s.predicate.is? predicate and s.subject.is? subject
        return s.subject if s.predicate==Relation.Holonym || s.predicate.is('OWNER')  and s.subject.is object
      end
    end
    return nil
  end


  def get_all predicate, object=nil, &block
    all=[]
    for s in subject_statements
      next if not s.predicate
      if not object
        if ((s.predicate.is(Relation.Meronym) ||
                s.predicate.is(Relation.Part) ||
                s.predicate.is(Relation.Substance) ||
                s.predicate.is('HAS')) && s.object.is(predicate))
        then
          all<< s.object||predicate
        end
        all<<s.object||predicate if s.predicate==predicate  || s.predicate.to_s==predicate.to_s
        all<<s.object||predicate if s.predicate.is predicate rescue nil
        all<<s.object||predicate if s.object.is predicate and not s.predicate.is_a? Relation rescue nil   #nee, oder
      else
        all<<s.object if s.predicate==predicate and s.object.is object
        all<<s.object if s.object.is object
      end
    end

    for s in object_statements
      next if not s.predicate
      if not object
        all<<s.object if s.object.is? predicate
        all<<s.subject if s.subject.is? predicate rescue nil
        all<<s.predicate if s.predicate.is?(predicate) and not s.subject
#        all<<s.subject if s.predicate.is? predicate and s.subject
        all<< s.subject if s.predicate.is_a? Relation and s.predicate.Antonym and s.predicate.Antonym.is predicate and s.subject rescue nil
      else
        all<<s.subject if s.predicate.is? predicate and s.subject.is? subject
        all<<s.subject if s.predicate==Relation.Holonym or s.predicate.is('OWNER')  and s.subject.is object
      end
    end
    return all
  end

  alias has? get_member

  def add_new_member name
    puts self.name+" += NEW "+name.to_s
    n=Node.new :name=>name
#    @statements[name]=n
    s=Statement.new(:subject=>self, :predicate=>Relation.Member, :object=>n)
    s.fix_id
    s.save
    subject_statements<<s rescue nil
#    @@instances[name]=n
    return n
  end

#
#  def synonym
#    x=get Relation.Synonym
#    return x.name if x
#    return name
#  end

  def classes
    get_all Relation.Hyponym
  end

  def handle_arguments *args
    return self if not args or args.length<1 or args.length==1 and args[0]==[]
    puts ">>"+args.length+  " args for "+self.name+" "+args.inspect
#    self.value=args[0] if args.length==1
#    puts self.name+".value=" +self.value
#    value=args[0] if args.length==1
#    puts name+".value=" +value
    pref=self
    for a in args
      a=a.to_s if a.is_a? Symbol
      puts pref.name+"." +a
      a=a[0] if a.length>0 rescue a
      pref.add a
      pref=a
    end
    return self
  end

  def self.My
    return Context.first
  end


  def find_edges predicate, object=nil
    all=[]
    for s in subject_statements
      next if not s.predicate
      if not object
        all<<s if s.object.is? predicate
        all<<s if s.predicate.is? predicate
        all<< s if s.predicate.is_a? Relation and s.predicate.Antonym.is? predicate rescue nil
        all<<s if s.subject.is? predicate rescue nil
      else
        all<<s if s.predicate.is? predicate and s.object.is? object
      end
    end
    for s in object_statements
      next if not s.predicate
      if not object
        all<< s if s.object.is? predicate
        all<< s if s.predicate.is? predicate
        all<< s if s.predicate.is_a? Relation and s.predicate.Antonym.is? predicate rescue nil
        all<< s if s.subject.is? predicate rescue nil
      else
        all<< s if s.predicate.is? predicate and s.subject.is? subject
      end
    end
    return all
  end

  def change_id id2
    self.id=id2
    id=id2
    @id=id2
    save
    for s in subject_statements
      s.subject_id=id2
      s.save
    end

    for s in predicate_statements
      s.predicate_id=id2
      s.save
    end
    for s in object_statements
      s.object_id=id2
      s.save
    end
    self.id=id2
    id=id2
    @id=id2
    save
    self
  end

  def find_edge predicate, object=nil
    return Statement[predicate] if not object and predicate.is_a? Fixnum
    for s in subject_statements
      next if not s.predicate
      if not object
        return s if s.object.is? predicate rescue nil
        return s if s.predicate.is? predicate rescue nil
        return s if s.predicate.is_a? Relation and s.predicate.Antonym.is? predicate rescue nil
        return s if s.subject.is? predicate rescue nil
      else
        return s if s.predicate.is? predicate and s.object.is? object rescue nil
      end
    end
    for s in object_statements
      next if not s.predicate
      if not object
        return s if s.object.is? predicate rescue nil
        return s if s.predicate.is? predicate rescue nil
        return s if s.predicate.is_a? Relation and s.predicate.Antonym.is? predicate rescue nil
        return s if s.subject.is? predicate rescue nil
      else
        return s if s.predicate.is? predicate and s.subject.is? subject rescue nil
      end
    end
    return nil
  end

  alias edge find_edge

  def drop predicate, object=nil
    edge=find_edge predicate, object
    return false if not edge
    edges.delete edge
    subject_statements.delete edge
    predicate_statements.delete edge
    object_statements.delete edge rescue nil
    edge.destroy
    save
    return edge
  end

  def all
    reals=list name
    for real in reals
      real.has? name
    end
  end
  def count
    edges.count
  end

  def clear
    sql = ActiveRecord::Base.connection();
    # CAREFUL!!!!!!!!!!!!!!!!!!!!!!!!!!
    sql.execute "delete from nodes where context_id=#{id}";
    sql.execute "delete from statements where context_id=#{id}";
    sql.execute "delete from statements where subject_id=#{id}";
    sql.execute "delete from statements where predicate_id=#{id}"
    sql.execute "delete from statements where object_id=#{id}";
    subject_statements.clear
#    predicate_statements.clear    #dont clear all Relations!!
    object_statements.clear
  end

end

#ok, if no table
class Noun <Node
end
class Kind<Node
end
class Verb<Node
end
class Word<Node
end
class Adjective<Node
end
class Adverb<Node
end
class Person<Node
end
#if table exists
class Concept < Node
#  def method_missing m, *a
#    puts "Concept method_missing"
#    super(m, *a)
#  end
end
