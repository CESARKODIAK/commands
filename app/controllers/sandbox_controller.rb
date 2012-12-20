# Filters added to this controller apply to all controllers in the application.
# Likewise, all the methods added will be available for all controllers.

#require "models/english-parser.rb"
class SandboxController < ApplicationController
  helper :all # include all helpers, all the time
  protect_from_forgery # See ActionController::RequestForgeryProtection for details

  # Scrub sensitive parameters from your log
  # filter_parameter_logging :password

  def index
    @text=params[:text]||"what is 3 + 3"
    @interpretation=Script.run(@text)
    @result=@interpretation.result
    @javascript=@interpretation.javascript
    @svg=@interpretation.svg
    @scripts=Script.all
    respond_to do |format|
      format.html # index.html.erb
      format.xml { render :xml => @nodes }
    end
  end


end
