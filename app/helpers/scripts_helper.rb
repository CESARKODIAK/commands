module ScriptsHelper
  #  HELPERS
  def run_script
    @interpretation=Script.run(@text)
    @result=@interpretation.result
    @javascript=@interpretation.javascript
    @svg=@interpretation.svg
    @scripts=Script.where(:current_id => nil)
    @versions=Script.where(:current_id => @script.id) rescue @versions=[]
  end

  def save_version
    return if @script.text==@text
    #require 'Diff'
    #di=@script.text.diff @text
    old=Script.new text: @script.text
    @script.versions<<old
    @script.text=@text
    @script.save!
  end

end
