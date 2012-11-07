# Filters added to this controller apply to all controllers in the application.
# Likewise, all the methods added will be available for all controllers.

#require "models/english-parser.rb"
class SandboxController < ApplicationController
  helper :all # include all helpers, all the time
  protect_from_forgery # See ActionController::RequestForgeryProtection for details

  # Scrub sensitive parameters from your log
  # filter_parameter_logging :password

  def index
    require_dependency "english-script/power-parser.rb"
    require_dependency "english-script/english-parser.rb"
    #Dir["/english-script/*.rb"].each {|file| require file }
    @text=params[:text]
    begin
    @result=EnglishParser.new.parse @text
    #rescue Exceptions::NotMatching => e
    rescue Exceptions::NotMatching ,SystemExit => e
      @result="<b>"+e.class.to_s+" "+e.message.to_s.gsub("\n","<br/>")
      @result+=$!.backtrace.select{|x|not x.to_s.match(/ruby/)}.join("<br/>")+"</b>"
      @result=@result.html_safe
    end

    respond_to do |format|
      format.html # index.html.erb
      format.xml  { render :xml => @nodes }
    end
  end


end
