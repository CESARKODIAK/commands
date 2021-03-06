class Statement < ActiveRecord::Base
  before_save :save_nodes, :fix_id

  belongs_to :context,  :class_name=>"Node"
  belongs_to :subject,  :class_name=>"Node"
  belongs_to :predicate,:class_name=>"Node"
  belongs_to :object,   :class_name=>"Node"
  belongs_to :modifier, :class_name=>"Node"
  belongs_to :user#,:foreign_key=>:user_id,:class_name=>"Node"
#  belongs_to :subject, :class_name=>"Node"
#  belongs_to :subject,:foreign_key=>:subject_id,:class_name=>"Node"
#  belongs_to :predicate, :foreign_key=>:predicate_id, :class_name=>"Node"
#  belongs_to :object, :foreign_key=>:object_id, :class_name=>"Node"
#  belongs_to :modifier, :foreign_key=>:modifier_id, :class_name=>"Node"
#  belongs_to :context#,:foreign_key=>:context_id,:class_name=>"Node"


  #belongs_to :subject,:foreign_key=>:Subject,:class_name=>"Node"
  #belongs_to :predicate,:foreign_key=>:Predicate,:class_name=>"Node"
  #belongs_to :object,:foreign_key=>:Object,:class_name=>"Node"
#  belongs_to :modifier,:foreign_key=>:modifier,:class_name=>"Node"
#  belongs_to :context,:foreign_key=>:context,:class_name=>"Node"
#
  alias old_initialize initialize
#         GEHT SO NICHT!
#  def initialize *args
#    old_initialize args rescue nil
#    subject=Node.get args[0]
#    predicate=Node.get args[1] rescue nil
#    object=Node.get args[2] rescue nil
#    predicate_id=predicate.id
#    p subject
#    p predicate
#    p object
#  end

  def save_nodes
    subject.save if subject
    predicate.save if predicate
    object.save if object
#    modifier.save if modifier
#    user.save if user
#    context.save if context
  end

  def self.[] id
    Statement.find_by_id id
  end

  def is_full_statement?
    subject and predicate and object
  end

  def show
    inspect
  end

  def inspect
#    return id+" "+subject.name+"->"+predicate.name+"->"+object.name+"\n" if is_full_statement?
    return id+" "+subject.name+"##{subject.id} -> "+predicate.name+"##{predicate.id} -> "+object.name+"##{object.id}\n" rescue nil#if is_full_statement?
    return subject.to_s + "=>" + predicate.to_s + "=>" + object
#    return (subject.name||"")+"->"+(predicate.name||"")+"->"+(object.name||"")
#    subject
  end

  def fix_id
    self.id=Node.next_id if not @id and not id or (@id and  @id<1) or (id and id<1)
  end

#  def inspect
#    subject.to_s+"."+predicate.to_s+"="+object.to_s
#  end

end
