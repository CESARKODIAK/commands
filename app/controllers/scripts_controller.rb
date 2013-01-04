class ScriptsController < ApplicationController
  include ScriptsHelper
  # GET /scripts
  # GET /scripts.json
  def index
    @scripts = Script.all
    #@scripts = Script.where :current_id=>nil
    respond_to do |format|
      format.html # index.html.erb
      format.json { render json: @scripts }
    end
  end

  # GET /scripts/1
  # GET /scripts/1.json
  def show
    @script = Script.find(params[:id])
    run_script
    respond_to do |format|
      format.html # show.html.erb
      format.json { render json: @script }
    end
  end

  def run
    @text||=params[:text]  ||params["script[text]"]
    if params[:id]
      @script = Script.find(params[:id])
      save_version
    end
    run_script
    render :show
  end



  def run_script
    @text||=@script.text
    @interpretation=Script.run(@text)
    @result=@interpretation.result
    @javascript=@interpretation.javascript
    @svg=@interpretation.svg
    @scripts=Script.where(:current_id => nil)
    @versions=Script.where(:current_id => @script.id) rescue @versions=[]
  end

  # GET /scripts/new
  # GET /scripts/new.json
  def new
    @script = Script.new
    respond_to do |format|
      format.html # new.html.erb
      format.json { render json: @script }
    end
  end

  # GET /scripts/1/edit
  def edit
    @script = Script.find(params[:id])
  end

  # POST /scripts
  # POST /scripts.json
  def create
    @script = Script.new(params[:script])
    respond_to do |format|
      if @script.save
        format.html { redirect_to @script, notice: 'Script was successfully created.' }
        format.json { render json: @script, status: :created, location: @script }
      else
        format.html { render action: "new" }
        format.json { render json: @script.errors, status: :unprocessable_entity }
      end
    end
  end

  # PUT /scripts/1
  # PUT /scripts/1.json
  def update
    @script = Script.find(params[:id])
    @text=params[:script][:text]
    save_version # to do: better!
    respond_to do |format|
      if @script.update_attributes(params[:script])
        if @script.name
          @script.current_id=nil
          @script.save
        end
        format.html { redirect_to @script, notice: 'Script was successfully updated.' }
        format.json { head :ok }
      else
        format.html { render action: "edit" }
        format.json { render json: @script.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /scripts/1
  # DELETE /scripts/1.json
  def destroy
    @script = Script.find(params[:id])
    @script.destroy

    respond_to do |format|
      format.html { redirect_to scripts_url }
      format.json { head :ok }
      format.js { render :layout => false }
    end
  end

  def destroy_orphaned_versions
    if params[:id]
      @script=Script.find(params[:id])
      @script.versions.each { |script|
        script.destroy if not script.current_id==nil
      }
      @text=@script.text
      run_script
      render :show
    else
      Script.all.each { |script|
        script.destroy if not script.current_id==nil
      }
      render :index
    end
  end

end
