#!/usr/bin/env ruby

class Parser #<MethodInterception
  include Exceptions
  def initialize
    super # needs to be called by hand!
    #@verbose=true
    @verbose=false
          #@very_verbose=true
    #@very_verbose=false
    @very_verbose=@verbose
    @rollback=[]
    @tree=[]
    @line_number=0
  end


  def verbose info
    puts info if @verbose
  end

#gem 'debugger'
#gem 'ruby-debug19', :require => 'ruby-debug'
#require 'ruby-debug'
#require 'debugger'
#gem 'ParseTree' ruby 1.9 only :{
#require 'sourcify' #http://stackoverflow.com/questions/5774916/print-the-actual-ruby-code-of-a-block BAD
#require 'method_source'

#gem 'ruby-debug', :platforms => :ruby_18
#gem 'ruby-debug19', :platforms => :ruby_19, :require => 'ruby-debug'

#def maybe &block
#  return yield rescue true
#end

  @line_number=0
  @lines=[]
  def raiseEnd
    if @string.blank?
      raise EndOfDocument.new if @line_number>=@lines.count
      @string=@lines[++@line_number];
      raise EndOfLine.new
    end
  end

  def checkEnd
    #raise EndOfDocument.new if @string.blank? # no:try,try,try
    return @string.blank?
  end

  def token t
    return nil if checkEnd
    #raiseEnd
    if @string.start_with? t
      @current_value=@string[0,t.length].strip
      @string=@string[t.length..-1].strip
      return true
    else
      verbose "expected "+t # if @throwing
      raise NotMatching.new(t)
    end
  end

  def starts_with? tokenz
    return if checkEnd
    for t in tokenz
      if @string.start_with?(t+" ")
        return true
      end
    end
    return false
  end

  def tokens *tokenz
    raiseEnd
    #return if checkEnd
    @string=@string.gsub(/([^\w ])/," \\1 ").strip+" "
    for t in tokenz.flatten
      return true if(t=="\n" and @string.empty?)
      if @string.start_with?(t+" ")
        @current_value=@string[0,t.length].strip
        @string=@string[t.length..-1].strip
        return @current_value
      end
    end
    raise NotMatching.new(tokenz.to_s) #if @throwing
    return false
  end


  def tokens2 *tokenz
    return if checkEnd
    tokenz.flatten!
    tokenz.flatten!
    for t in tokenz
      if(t=="\n" and @string.start_with? "\n")
        @string.strip!
        @current_value="\n"
        return "\n"
      end
      if @string.gsub(/^ */,"").start_with?(t)
        @current_value=@string.strip[0,t.length].strip
        @string=@string.strip[t.strip.length..-1]# DO NOT .strip!!
        return @current_value
      end
    end
    raise NotMatching.new(tokenz.to_s) #if @throwing
    return false
  end

  def remove_tokens *tokenz
    for t in tokenz.flatten
      @string.gsub!(/ *#{t} */," ")
    end
  end


# shortcut
  def __? *x
    remove_tokens x
  end

  def __ *x
    tokens x
  end

  def must_contain x
    look_ahead x
  end

  def look_ahead x
    @string.index(x) ? true : raise(NotMatching.new(x))
  end

  def _! x
    look_ahead x
  end

  def _ x
    token x
  end

  def _? *x
    try{tokens x}
  end


  def last_try stack
    for s in stack
      if s.match("`try'")
        return s
      end
    end
  end

  def caller_name
    for i in 0..(caller.count)
      next if not caller[i].match(/parser/)
      name=caller[i].match(/`(.*)'/)[1]
      return name if caller[i].index("parser")
    end
  end


  def no_rollback! n=0
    for i in 0..(caller.count+n)
      @rollback[i] ="NO"
    end
    @method=caller#_name
  end

  def allow_rollback
    @rollback=[]
  end

  def check_rollback_allowed
    #puts caller.count
    @rollback[caller.count]!="NO"   # -1?
  end

  @throwing=true #[]
  @level=0
  def any(&block)
    raiseEnd
    #return if checkEnd
    last_try=0
    #throw "Max recursion reached #{to_source block}" if @level>20
    raise MaxRecursionReached.new(to_source block) if caller.count>80
    was_throwing=@throwing
    @throwing=false
    #@throwing[@level]=false
    oldString=@string
    begin
      result=yield
      if not result
      @string=oldString
      raise NoResult.new(to_source block)
      end
      return result
    rescue EndOfDocument
      verbose "EndOfDocument"
    rescue EndOfLine
      verbose "EndOfLine"
    rescue NotMatching
      verbose "NotMatching"
        #retry
    rescue => e
      verbose "Error in #{to_source block}"
      puts e.message
      #error e
    end
    @string=oldString if check_rollback_allowed
    @throwing=was_throwing
    #@throwing[@level]=true
    #@level=@level-1
    verbose "Succeeded with any #{to_source block}" if result
    return result if result
    string_pointer if @verbose
    raise NotMatching.new(to_source block)
    #throw "Not matching #{to_source block}"
  end

  def quote
    raiseEnd
    #return if checkEnd
    if @string[0]=="'"
      to=@string[1..-1].index("'")
      @current_value=@string[1..to];
      @string= @string[to+2..-1].strip
      return @current_value
    end
    if @string[0]=='"'
      to=@string[1..-1].index('"')
      @current_value=@string[1..to];
      @string= @string[to+2..-1].strip
      return @current_value
    end
    raise NotMatching.new("quote")
    #throw "no quote" if @throwing
    return false
  end

  def to_source x
    return @last_pattern if @last_pattern
    #proc=block.to_source(:strip_enclosure => true) rescue "Sourcify::MultipleMatchingProcsPerLineError"
    IO.readlines(x.source_location[0])[x.source_location[1]-1]#+(x.source_location.to_s)
  end

  def try(&block)
    #return if checkEnd
    old=@string
    @original_string=@string if @original_string.blank?
    begin
      old_nodes=@nodes.clone
      result = yield
      if result
        @rollback[caller.count..-1]="YES" #Succeeded
      else
        (@nodes-old_nodes).each{|n| n.valid=false}
        @string=old
      end
      return result
    rescue NotMatching,EndOfLine => e
      verbose "Tried #{to_source block}"
      verbose e
      string_pointer if @verbose
      (@nodes-old_nodes).each{|n|
        n.destroy
      } #n.valid=false;

      #caller.index(last_try caller)]
      #puts @rollback[caller.count]
      #puts caller.count
      #puts rollback
      if not check_rollback_allowed
        #puts
        #puts @method.join("\n")
        show_tree #Not reached
        error e
        string_pointer
        error "NO ROLLBACK, GIVING UP!!!"
        exit
        #raise GivingUp.new
      end
    rescue EndOfDocument => e
      verbose "EndOfDocument"
      raise e
        #return true
    rescue => e
      error e
      exit
    end
    @string=old #if rollback
    return false
  end

  def one_or_more(&block)
    yield
    star{yield}
  end

  def many(&block)
    while true
      begin
        comment?
        old_tree=@nodes.clone
        result=yield
        #puts "------------------"
        #puts @nodes-old_tree
        break if @string.blank?
        if not result  #or @string==""
          error "Syntax error"
          string_pointer
          exit
        end
      rescue =>e
        error e
      end
    end
  end

  def star(&block)
    #checkEnd
    was_throwing=@throwing
    @throwing=true
    old_state=@current_value
    max=100
    current=0
    good=[]
    # begin
    oldString=@string
    last_string=""
    begin
      while true
        break if @string=="" or @string==last_string
        last_string=@string
        match=yield
        break if match.blank?
        oldString=@string # (partial)  success
        good<< match
        throw " too many occurrences of "+ to_source(block) if current>max and @throwing
      end
    rescue NotMatching => e
      if @very_verbose and not good
        verbose "NotMatching star "+ e.to_s
        #verbose "expected any of "+tokens.to_s if tokens and tokens.count>0
        string_pointer if @verbose
      end
    rescue EndOfDocument =>e
      #raise e
      verbose "EndOfDocument"
        #break
        #return false
    rescue => e
      error e
      error "error in star "+ to_source(block)
      #warn e
    end

    @throwing=was_throwing
    @string=oldString if good.blank?
    return old_state if good.blank?
    return good
    # rescue
    # end
  end


# use _?
#def maybe token
#  return token token rescue true
#end


  def ignore_rest_of_line
    @string.gsub!(/.*?\n/,"\n")
  end

  def string_pointer
    offset=@original_string.length-@string.length rescue 0
    offset=0 if offset<0
    puts @original_string
    puts " "*(offset) + "^^^"
    puts ""
  end

  def string_pointer2
    @original_string=@string if @original_string.blank?
    offset=@original_string.length-@string.length
    from=offset-80
    to=offset+80
    from=0 if(from<0)

    newline_i=@original_string.rindex("\n",offset)
    if(newline_i and newline_i<offset and newline_i-from<80)
      from=newline_i+1
    end

    newline_i=@original_string.index("\n",offset)
    if(newline_i and newline_i<to and newline_i>=offset)
      to=newline_i
    end
    #puts @string
    puts @original_string[from..to]
    puts " "*(offset-from+1) + "^^^"
  end

  def error e
    puts e if e.is_a? String
    if e.is_a? Exception
      puts e.class.to_s+" "+e.message.to_s
      puts e.backtrace
      puts e.class.to_s+" "+e.message.to_s
      string_pointer
      show_tree
      exit
    end
  end


  def warn e
    puts e.message
  end

  @original_string=""
  @string=""
  def parse string
    puts "PARSING"
    begin
      @original_string=string
      @string=string
      root
    rescue => e
      error e
    end
    puts "PARSED SUCCESSFULLY!!"
  end


  def one *matches
    oldString=@string
    for match in matches
      begin
        @string=oldString
        return match if match and not match.is_a? Symbol
        result =send(match) if match.is_a? Symbol
        return result #if result
      rescue NotMatching =>e
        verbose "NotMatching one "+match.to_s+"("+e.to_s+")"
        #raise GivingUp.new
        error e if not check_rollback_allowed
      rescue => e
        error e
      end
    end
    @string=oldString if check_rollback_allowed
    verbose "Should have matched one of "+matches.to_s if @throwing
    raise NotMatching.new
    #throw "Should have matched one of "+matches
  end



  @last_pattern=nil
  def method_missing(sym, *args, &block)  # <- NoMethodError use node.blah to get blah!
    syms=sym.to_s
    cut=syms[0..-2]
    #return send(cut) if(syms.end_with?"!")
    if(syms.end_with?"?")
      old_last=@last_pattern
      @last_pattern=cut
      x= try{send(cut)} if args.count==0
      x= try{send(cut,args)} if args.count>0
      @last_pattern=old_last
      return x
    end
    return star{send(cut,args)} if(syms.end_with?"!")
    #return star{send(cut)} if(syms.end_with?"*")
    #return plus{send(cut)} if(syms.end_with?"+")
    super(sym, *args, &block)
  end

  def *(a)
    puts a
  end


  def start
    a=ARGV[0] ||  app_path+"/../examples/test.e"
    #test_any
    #test_action
    #test_expression
    #test_method
    if(File.exists?a)
      @lines=IO.readlines(a)
    else
      @lines=a.split("\n")
    end
    parse @lines[0]
    #parse IO.read(a)
    show_tree
  end



  def app_path
    File.expand_path(File.dirname(__FILE__)).to_s
  end

  def dictionary_path
    app_path + "word-lists/"
  end

end
