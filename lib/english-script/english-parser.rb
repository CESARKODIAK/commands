#!/usr/bin/env ruby

require_relative "Interpretation"
require_relative "MethodInterception"
require_relative "CoreFunctions"
require_relative "english-tokens"
require_relative "power-parser"
require 'linguistics'
require 'wordnet'
#require 'wordnet-defaultdb'
Linguistics.use(:en, :monkeypatch => true)
#http://99designs.com/tech-blog/ More magic


class EnglishParser < Parser
  include MethodInterception
  include CoreFunctions
  include EnglishParserTokens # module
  @methods=[]


  def initialize
    super
    @interpret=true
    @javascript=""
    @context=""
    @variables={}
    @svg=[]
    @ruby_methods=["puts", "print", "svg"] #"puts"=>x_puts !!!
    @core_methods=["show"] #"puts"=>x_puts !!!
    @methods=[]
    @OK="OK"
    @result=""
  end


  def interpretation
    @interpretation=Interpretation.new
    i= @interpretation #  Interpretation.new
    super # set tree, nodes
    i.javascript=@javascript
    i.context=@context
    i.methods=@methods
    i.ruby_methods=@ruby_methods
    i.variables=@variables
    i.svg=@svg
    i.result=@result
    i
  end

  def download url
    require 'net/http'
    require 'uri'
    uri = URI.parse(url)
    http = Net::HTTP.new(uri.host, uri.port)
    http.use_ssl = url =~ /https/
    http.verify_mode = OpenSSL::SSL::VERIFY_NONE
    request = Net::HTTP::Get.new(uri.request_uri)
    response = http.request(request)
    #response.status
    #response["header-here"] # All headers are lowercase
    response.body
  end

  def english_to_math s
    s.replace_numerals!
    s.gsub!(" plus ", "+")
    s.gsub!(" minus ", "-")

    s.gsub!(" (\d+) multiply (\d+) ", "\1 * \2")
    s.gsub!(" multiply (\d+) with (\d+) ", "\1 * \2")
    s.gsub!(" multiply (\d+) by (\d+) ", "\1 * \2")
    s.gsub!(" multiply (\d+) and (\d+) ", "\1 * \2")
    s.gsub!(" divide (\d+) with (\d+) ", "\1 / \2")
    s.gsub!(" divide (\d+) by (\d+) ", "\1 / \2")
    s.gsub!(" divide (\d+) and (\d+) ", "\1 / \2")
    s.gsub!(" multiplied by ", "*")
    s.gsub!(" times ", "*")
    s.gsub!(" divided by ", "/")
    s.gsub!(" divided ", "/")
    s.gsub!(" with ", "*")
    s.gsub!(" by ", "*")
    s.gsub!(" and ", "+")
    s.gsub!(" multiply ", "*")
    return s
  end


  def do_evaluate x
    $variables=@variables
    return @variables[x] if @variables.contains x
    return x.eval_node if x.is_a? TreeNode
    return eval(x)
    # ... todo!
  end

  def evaluate_property
    must_contain "of"
    raiseNewline
    x=endNode2 type_keywords
    _ "of"
    y=endNode
    return parent_node if not @interpret
    # todo : eval NODE !@!!
    x="class" if x=="type" # !@!@*)($&@) NOO
    if x.is_a? TreeNode
      if x.nodes.count==1
        x=x.to_s
      else
        r="" # argument hack
        for n in x.nodes
          r=":"+n.value+" "+r if n.value and n.valid
        end
        x=r[1..-1]
      end
    #x=x.full_value.flip  # argument hack NEEE color= green  color of the sun => sun.green --

    end
    all=x+" of "+y
    begin
    @result=eval(y+"."+x) rescue nil
    @result=eval('"'+y+'".'+x) if not @result  rescue SyntaxError #string method
    @result=eval(all) if not @result rescue SyntaxError
    rescue
    @result=jeannie all if not @result
    end
    return @result
  end


  def jeannie request
    jeannie_api="https://weannie.pannous.com/api?"
    params="login=test-user&out=simple&input="
    #raise "empty evaluation" if @current_value.blank?
    download jeannie_api+params+URI.encode(request)
  end

  #  those attributes. hacky? do better / don't use
  def subnode attributes={}
    return if $dont_use_tree
    attributes.each do |name, value|
      @current_node.nodes<<TreeNode.new(name: name, value: value)
      @current_value=value
    end
    return @current_value
  end

  def evaluate
    __ "what is", "evaluate", "how much", "what are", "calculate", "eval"
    no_rollback!
    the_expression= rest_of_line
    subnode statement: the_expression
    @current_value=the_expression
    begin
      @result=eval(english_to_math the_expression) #if @result.blank?
    rescue
      @result=jeannie(the_expression)
    end
    subnode result: @result # todo: via automagic
    @current_value=@result
    @current_value
  end

  def root
    many {#root
          try { newline } ||
          try { method_definition } ||
          try { statement } ||
          try { ruby_def } ||
          try { block }||
          try { expression } ||
          try { context }
    }
  end

  def context
    _ "context"
    @context= word
    newlines
    #NL
    block
    done
  end

  def bracelet
    subnode "brace" => token("(")
    algebra
    subnode "brace" => token(")")
  end

  def operator
    tokens("+", "*", "-", "/")
  end

  def algebra
    any { value? or bracelet? } # variable? or number? or
    star {
      operator
      #subnode operator: tokens("+", "*", "-", "/")
      no_rollback!
      z=any {
        value? ||
        bracelet?
      }
    }
    if @interpret
      @result=parent_node.eval_node #wasteful!!
    end
    parent_node
  end

  def javascript
    __ @context=="javascript" ? "script" : "java script", "javascript", "js"
    no_rollback! 10
    @javascript+=rest_of_line+";"
    newline?
    return @javascript
    #block and done if not @javascript
  end


  def script_block
    _ "<script>"
    read_until "</script>"
  end


  def block
    star {
      x=statement
      newlines
      x
    }
  end

  def expression
    ex=any{
      try { algebra } ||
      try { endNode } ||
      try { evaluate_property }
      }
    @result=do_evaluate ex if ex
  end

  def statement
    raiseNewline
    x=any {
      return @NEWLINE if checkNewline
          try { action }||
          try { expression } || # AS RETURN VALUE! DANGER!
          try { if_then } ||
          try { once } ||
          try { looper }
    }
    x
    #one :action, :if_then ,:once , :looper
    #any{action || if_then || once || looper}
  end

  def method_definition
    method #  how to
    no_rollback!
    name=verb #  integrate
    obj=try { endNode } # a sine wave
    args=star { arg } # over an interval
    start_block # :
    no_rollback! 10
    @interpret=false
    block
    done
    @interpret=true
    @methods[name]=parent_node rescue nil
    name
  end

  def ruby_action
    _ 'ruby'
    exec(action || quote)
  end


  def bash_action
    must_contain 'bash'
    remove_tokens 'execute', 'command', 'commandline', 'run', 'shell', 'shellscript', 'script', 'bash'
    @command = try { quote } # danger bash "hi">echo
    @command = rest_of_line if not @command
                             #any{ try{  } ||  statements }
    begin
      puts "going to execute " + @command
      result=%x{#{@command}}
      puts "result:"
      puts result
      return result || true
    rescue
      puts "error executing bash_action"
    end

  end


  def if_then_line
    _ 'if'
    condition
    _ 'then'
    action
  end

  def if_then_block
    If
    condition
    no_rollback!
    _? 'then'
    newline?
    block
    done
  end

  def if_then # ( options {greedy=false } )
    if_then_line || if_then_block
              #	|| action If condition newline
  end


  def once
    _ 'once'
    condition
    _? 'then'
    action
#	|| action 'as soon as' condition
#	|| action 'once' condition
#	|| 'as soon as' condition 'then'? action
  end

#/*n_times
#	 verb number 'times' preposition nod -> "<verb> <preposition> <nod> for <number> times" 	*/
#/*	 verb number 'times' preposition nod -> ^(number times (verb preposition nod)) # Tree ~= lisp	*/

  def verb_node
    verb
    nod
  end

  def spo
    endNode2
    verb
    nod
  end

  def substitute_variables args
    #args=" "+args+" "
    for variable in @variables.keys
      variable=variable.join(" ") if variable.is_a? Array #HOW!?!?!
      value=@variables[variable]||"nil"
                                                          #args.gsub!(/\$#{variable}/, "#{variable}") # $x => x !!
      args.gsub!(/.\{#{variable}\}/, "#{value}") #  ruby style #{x} ;}
      args.gsub!(/\$#{variable}$/, "#{value}") # php style $x
      args.gsub!(/\$#{variable}([^\w])/, "#{value}\\1")
      args.gsub!(/^#{variable}$/, "#{value}")
      args.gsub!(/^#{variable}([^\w])/, "#{value}\\1")
      args.gsub!(/([^\w])#{variable}$/, "\\1#{value}")
      args.gsub!(/([^\w])#{variable}([^\w])/, "\\1#{value}\\2")
    end
    #args.strip
    args
  end

  def x_puts x
    if @result
      @result+=x.to_s rescue nil
    else
      @result=x
    end
    puts x
    x
  end

  #def print x
  #  @result+=x.to_s
  #  p x
  #  x
  #end

  def ruby_method_call
    call=tokens? "call", "execute", "run", "start", "evaluate", "invoke"
    if call # remove later
      no_rollback! if call # remove later
    end
    ruby_method=tokens? @ruby_methods
    raise UndefinedRubyMethod.new word if not ruby_method
    ruby_method.gsub!("puts", "x_puts")
    args=substitute_variables rest_of_line
    begin
      the_call=ruby_method+" "+args.to_s
      @result=eval(the_call)||""
      verbose the_call+"  called successfully with result "+@result.to_s
    rescue => e
      puts "\n!!!!!!!!!!!!\n ERROR calling #{the_call}\n!!!!!!!!!!!!\n "
      error $!
      puts "!!!! ERROR calling "+the_call
    end
    checkNewline
    #raiseEnd
    @current_value=ruby_method
    #return @OK # don't return nil!
    return ruby_method
  end

  def method_call
    #verb_node
    method=verb
    obj=nod?
    args=star { arg }
    if @interpret
      for method0 in @methods
        if method0.name==method
          method0.call(obj, args)
        end
      end
    end
  end

  def bla
    @current_value=nil
    star {
      tokens "tell me", "hey", "could you", "give me",
             "i would like to", "can you", "please", "let us", "let's", "can i",
             "can you", "would you", "i would", "i ask you to", "i'd",
             "love to", "like to", "i asked you to", "would you", "could i",
             "i tell you to", "i told you to", "would you", "come on",
             "i wanna", "i want to", "i want", "tell me", "i need to",
             "i need"
    }
    #_? "know" # what is
  end

  def action
    bla?
    #	||'say' x=(.*) -> 'bash "say $quote"'
    #one  :bash_action ,:setter ,:verb ,:verb_node , :spo
    result=any {#action
      try { javascript } ||
          try { bash_action } ||
          try { ruby_method_call } ||
          try { method_call } ||
          try { evaluate_property } ||
          try { evaluate } ||
          try { setter } ||
          try { spo }||
          try { verb_node } ||
          try { verb }
    }
    raise NoResult.new if not result
    #any{ bash_action ||setter ||verb ||verb and nod ||endNode and verb and nod}
    newline? #cut rest, BUT:
    return result
  end

  def while_loop
    _ 'while'
    no_rollback!
    condition
    start_block
    no_rollback! 13 # arbitrary value ! :{
    block
    done
  end

#
#def until_condition
#  action
#  _'until'
#  condition
#end
#
#def while_condition
#  action
#  _'while'
#  condition
#end
#
#def as_long_condition
#  action
#  _'as long'
#  condition
#end
#
  def looped_action
    must_contain 'as long', 'while', 'until'
    action
    __ 'as long', 'while', 'until'
    condition
  end

  def times
    must_contain 'times'
    action
    number
    _ 'times'
  end


# todo : node cache : skip action(X) -> _'forever'  if action was (not) parsed before
  def forever
    must_contain 'forever'
    action
    _ 'forever'
  end

  def as_long_condition_block
    _ 'as long as'
    condition
    newline
    block
    done
  end

  def looper
    _? "do"
    _? "repeat"
    one :while_loop, :looped_action, :times, :as_long_condition_block, :forever
  end

#  until_condition ,:while_condition ,:as_long_condition

#  CAREFUL WITH WATCHES!!! THEY manipulate the current system, especially variable
#/*	 let nod be nods */
  def setter
    let?
    the?
    mod=modifier?
    tokens? 'var', 'val', 'value of'
    mod||=modifier? # ??
    var=variable
    _?("to") or be
    #val=expression
    no_rollback!
    val=endNode if not val
    #val=value
    @variables[var]=val if mod!="default" or not @variables.contains(var)
    checkEnd||newline
    var
# ||'to'
#'initial'?	let? the? ('initial'||'var'||'val'||'value of')? variable (be||'to') value
  end

  def variable
    one_or_more { word }
  end


  def word item=nil
    #danger:greedy!!!
    no_keyword
    raiseNewline
    #raise EndOfDocument.new if @string.blank?
    #return false if starts_with? keywords
    match=@string.match(/^\s*\w+[\d\w_]*/)
    if (match)
      @string=@string[match[0].length..-1].strip
      @current_value=match[0].strip
      return match[0]
    end
    #fad35
    #unknown
    noun
  end

  def no_keyword_except except=[]
    raise NotMatching.new ("ShouldNotMatchKeyword") if starts_with? keywords-except
  end

  def no_keyword except=[]
    except=except[:except] if except.is_a? Hash
    raise NotMatching.new ("ShouldNotMatchKeyword") if starts_with? keywords-except
  end

  def constant
    tokens constants
  end

  def value
    @current_value=nil
    no_keyword_except constants
    @current_value=any {
          quote?||
          constant?||
          true_variable? ||
          number? ||
          nod? ||
          nill?
      #||
      #rest_of_line # TOOBIG HERE!
    }
    @current_value #.strip
  end


  def nod #options{generateAmbigWarnings=false}
    try { number } ||
        try { quote } ||
        try { the_noun_that }
  end

  def article
    tokens articles
  end

  def arg
    preposition
    endNode # about sex
  end

# things that stink
#, things that move backwards
  def that_do
    tokens 'that','which','whose','who'
    verbium
    endNode?
  end




  def that_are
    __ 'that','which','whose','who'
    be
    adjective? || gerund
  end

  def that
    that_do || that_are
  end


  def where
    tokens 'where'
    condition
  end

  def condition
    a=endNode
    comp=comparison
    #allow_rollback ??
    b=endNode # || endNode have adjective || endNode attribute || endNode verbTo verb #||endNode auxiliary gerundium
    if @interpret
      begin
      @result=a.send(comp,b)
      return @result
      rescue => x
        debug x
      end
    end
    return parent_node
  end

  def auxiliary
    'want'||'like'||'hate'
  end

# todo  I hate to ...

  def verbTo
    auxiliary
    _ 's to'
  end


  def gerundium
    verb
    token 'ing'
  end


  def verbium
    comparison||verb and adverb # be||have||
  end

  def the_noun_that
    the?
    noun
    star { selector }
  end

  #def plural
  #  word #todo
  #end

  def typeName
    tokens type_names
  end


  def gerund
    #'stinking'
    match=@string.match(/^\s*(\w+)ing/)
    return false if not match
    @string=match.post_match
    pr=tokens? prepositions # wrapped in
    endNode? if pr # silver
    @current_value=match[1]
    @current_value
  end

  def postjective # 4 squared , 'bla' inverted, buttons pushed in, mail read by James
    match=@string.match(/^\s*(\w+)ed/)
    return false if not match
    @string=match.post_match
    pr=tokens? prepositions if not checkEnd# wrapped in
    endNode? if pr and not checkEnd # silver
    @current_value=match[1]
    @current_value
  end

  def endNode
    return true if checkEnd
    x=any {
          #typeName? ||
          #try { plural} ||
          try { evaluate_property }||
          try { x=endNode2
                try{verbSelector}  # fucks it up, HOW !?!?!?  EndOfDocument hmmmmmmm , not caught OK
                return x
          } ||
          try { true_variable} ||
          try { article?; word } ||
          try { article?
                typeName
          } ||
          try { value }
    }
    po=try{postjective} # inverted
    if po and @interpret
      x=@current_value=x.send(po) rescue x #DANGAR!!
    end
    x
  end

  def verbSelector
    return if checkEnd
    __ 'that', 'who'
    star { adverb }
    verb
    star { adverb }
    #_ 's' ??
    preposition
    endNode2
  end

  def selector
# ambivalent?  delete james from china
any{
  try{where}
  that?
  try{token('of') and endNode}
  try{preposition and nod }
  }
    #one :where, :that, try { token('of') and endNode }, try { preposition and nod }
  end

# preposition nod  # ambivalent?  delete james, from china delete (james from china)

# (who) run like rabbits
  def verb_comparison
    star { adverb }
    verb
    preposition
  end


  def comparison
    try { verb_comparison }||
        try { comparation }
  end


  def endNode2 include=[]
    try {
      article
    }
    star { adjective } #  first second ... included
    noun include
    return parent_node
    #any{
    #  try{noun}
    #  try{variable}
    #  }
  end

# a nod can be a noun, a string, a number or a simple expression such as The President of the USA, birds in africa
#/*nods
#	 nod||List 	*/
#/*List
#	 (nod ',')* nod 'and' nod */

  def any_ruby_line
    line=@string
    @string=@string.gsub(/.*/, "")
    checkNewline
    line
  end

  def execute_ruby_block
    #require 'evil'
    lines=ruby_block
    result=eval(lines.join("\n"))
    p result
    #result=class_eval(lines.join("\n"))
    #p result
    #A.instance_method(:m).force_bind(B.new).call
    #ruby_block_test
  end


  def ruby_block
    block_depth=0
    lines=[]
    star {
      raise EndOfBlock.new if (@string.strip.start_with? "end") and block_depth==0
      line=any_ruby_line
      lines<<line
      line
    }
    lines<<"end" #todo: in any_ruby_line
    @current_value=lines #todo: !?!
    lines
  end

  def ruby_def
    _ "def"
    no_rollback!
    lines=["def "+@string]
    method=word "method"
    #@current_node.value=method #has ruby_block leaf!
    try { arg=word; }
    try { _ "="; defaulter=(quote? or word?) } # or ...!?
    star { _ ","; arg=word; }
    newline
    lines+=ruby_block
    #-- # // Some Ruby coat goes here
    newline?
    done
    begin
      #Redirect output to HTML result
      the_script=lines.join("\n").gsub("puts", "x_puts")
      eval the_script
      @ruby_methods<<method
      @methods<<@current_node # to do : more
      verbose method + " defined successfully !"
    rescue
      error "error in ruby_def block"
      error lines
      error $!
    end
    newline?
    lines
  end


  def start_block
    return @OK if checkNewline
    try { tokens "do", "{", "first you ", "second you ", "then you ", "finally you ", ":" }
  end


  def newline?
    try { newline }
  end

  def raiseNewline
    raise EndOfLine.new if @string.blank?
  end

  def checkNewline
    comment if not @string.blank?
    if @string.blank? or @string.strip.blank?
      @line_number=@line_number+1
      return @NEWLINE if @line_number>=@lines.count
      #raise EndOfDocument.new if @line_number==@lines.count
      @string=@lines[@line_number];
      @original_string=@string
      checkNewline
      return @NEWLINE
    end
  end

  def newline
    return @NEWLINE if checkNewline==@NEWLINE
    found=tokens "\.\n", "\. ", "\n", "\r\n", ";" #,'\.\.\.' ,'end','done' NO!! OPTIONAL!
    return @NEWLINE if checkNewline==@NEWLINE # get new line
    return found
  end

  def newlines
    #one_or_more{newline}
    star { newline }
  end

  def NL
    tokens '\n', '\r'
  end


  def NLs
    tokens '\n', '\r'
  end


  def rest_of_statement
    @current_value=@string.match(/(.*?)([\r\n;]|done)/)[1].strip
    @string=@string[@current_value.length..-1]
    return @current_value
  end

  def rest_of_line
    if not @string.match(/(.*?)[;\n]/)
      @current_value=@string
      @string=nil
      return @current_value
    end
    @current_value=@string.match(/(.*?)[;\n]/)[1]
    @string=@string[@current_value.length+1..-1]
    @current_value.strip!
    return @current_value
  end

  def comment_block
    token '/*'
    @string.gsub('.*?\*\/', '')
    #token '*/'
    add_tree_node
  end

  def comment
    raiseEnd if @string==nil
    @string.gsub!(/ -- .*/, '');
    @string.gsub!(/\/\/.*/, ''); # todo
    @string.gsub!(/#.*/, '');
    checkNewline if @string.blank?
  end

  def start
    super
    result= "<script>"+ @javascript+"</script>"
    result
  end

  def svg x
    @svg<<x
  end

end

#EnglishParser.new.parse "x=7" if nil
#EnglishParser.new.start if not ARGV.blank?
