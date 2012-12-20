class Script < ActiveRecord::Base
  belongs_to :current, class_name: "Script", foreign_key: :current_id
  has_many :versions, class_name: "Script", foreign_key: :current_id

  def self.run text
    @text=text
    require "context"
    context=Context.new value: Value.new(value: @text)
    require_dependency "english-script/power-parser.rb"
    require_dependency "english-script/english-parser.rb"
    begin
      parser=EnglishParser.new
      @interpretation=parser.parse @text
      #context.interpretation=@interpretation
      for node in @interpretation.nodes #tree # /* TreeNode */
        if node.value
          context.nodes<< Node.new(name: node.to_s, value: Value.new(value: node.value))
        else
          context.nodes<< Node.new(name: node.to_s)
        end
      end
      context.nodes.map(&:save)
      for variable, value in @interpretation.variables
        context.variables<< Variable.new(name: variable, value: value)
      end
      @interpretation.context=context

        #rescue Exceptions::NotMatching => e
    rescue Exceptions::NotMatching, SystemExit => e
      @interpretation=Interpretation.new
      @result="<b style='color:red'>"+e.class.to_s+"\n"
      @result+="<code>"+parser.string_pointer_s+"</code>"
      @result+=e.message.to_s+"</b>\n"
      @result+=$!.backtrace.select { |x| not x.to_s.match(/ruby/) }.join("<br/>")
      @result=@result.gsub(" ","&nbsp;").gsub("\n", "<br/>").html_safe
      @interpretation.result=@result
    end
    @interpretation

  end
end
