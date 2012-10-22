class Parser #< MethodInterception
def root
  try{method_definition}
  try{action}
  star{
    try{method_definition}
    try{block}
    }
end



def block
  star{
    x=expression
    newlines
    return x
  }
end
#;//... expression| backtrack!


def expression
  any{
    try{action} ||
    try{if_then} ||
    try{once}    ||
    try{looper}
  }
  #one :action, :if_then ,:once , :looper
  #any{action || if_then || once || looper}
end

def method_definition
  #@@throwing=true
  method
  verb
  try{endNode}
  star{arg}
  #''?
  start_block
  no_rollback!
  block
  #newlines?
  done
  add_tree_node
end


#module EnglishScript
def ruby_action
  _'ruby'
  exec(action || quote)
end


def bash_action
  __ 'bash' #,'execute'
  @command = try{quote}  # danger bash "hi">echo
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
  _'if'
  condition
  _'then'
  action
end

def if_then_block
If
condition
_?'then'
newline
block
done
end

def if_then  # ( options {greedy=false } )
  if_then_line || if_then_block
#	|| action If condition newline
end


def once
 _'once'
 condition
 _?'then'
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
  endNode
  verb
  nod
end

 def action
   #	||'say' x=(.*) -> 'bash "say $quote"'
   #one  :bash_action ,:setter ,:verb ,:verb_node , :spo
   any{
         try{setter}||
         try {spo}||
         try{verb_node} ||
         try{verb} ||
         try {bash_action}
   }
   newline?
     #any{ bash_action ||setter ||verb ||verb and nod ||endNode and verb and nod}
 end

def while_loop
  _'while'
  no_rollback!
  condition
  newline
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
  action
  __ 'as long','while','until'
  condition
end

def times
  action
  number
  _'times'
end


# todo : node cache : skip action(X) -> _'forever'  if action was (not) parsed before
def forever
  action
  _'forever'
end

def as_long_condition_block
  _'as long as'
  condition
  newline
  block
  done
end

def looper
  _? "do"
  _? "repeat"
  one :while_loop ,:looped_action,:times,:as_long_condition_block,:forever
end
#  until_condition ,:while_condition ,:as_long_condition

#/*	 let nod be nods */
def setter
  let?
  the?
  modifier?
  try{tokens 'var ','val ','value of '}
  modifier?
  variable
  be
  no_rollback!
  value
# ||'to'
#'initial'?	let? the? ('initial'||'var'||'val'||'value of')? variable (be||'to') value
end

def variable
  one_or_more{word}
end


def word
  #danger:greedy!!!
  return false if try{modifier}
  return false if starts_with? keywords
  match=@@string.match(/^\s*\w+[\d\w_]*/)
  if(match)
    @@string=@@string[match[0].length..-1].strip
    @@current_value=match[0]
    return match[0]
  end
  #fad35
  #unknown
  noun
end

  def no_keyword
    raise NotMatching.new ("ShouldNotMatchKeyword") if starts_with? keywords
    #raise ShouldNotMatchKeyword.new if starts_with? keywords
  end

def value
 @@current_value=nil
 no_keyword
 any{
 true_variable? ||
 nill? ||
 nod? ||
 rest_of_line
 }
end


  def nod #options{generateAmbigWarnings=false}
    try{number} ||
    try{quote} ||
    try{the_noun_that}
  end

def arg
 preposition
 endNode # about sex
end

# things that stink
#, things that move backwards
def that_do
  token 'that'
  verbium
  endNode?
end


def that_are
_'that'
be
gerund
end

def that
that_do || that_are
end

def gerund
	 'stinking'
end

def where
	token 'where'
  condition
end

def condition
  endNode
  comparison
  endNode # || endNode have adjective || endNode attribute || endNode verbTo verb #||endNode auxiliary gerundium
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
  comparison||verb and adverb  # be||have||
end

def the_noun_that
  the?
  noun
  star{selector}
end


def endNode
  any{
      try{endNode2 and _'of' and endNode2}||
      try{endNode2 and selector2 } ||
      try{endNode2} ||
      try{value}
    }
end

def selector2
__ 'that','who'
star{adverb}
verb
_'s'
preposition
endNode2
end

def selector
# ambivalent?  delete james from china
#any{where || that || token('of') and endNode || preposition and nod }
  one :where,:that,try{token('of') and endNode},try{preposition and nod}
end

# preposition nod  # ambivalent?  delete james, from china delete (james from china)

# (who) run like rabbits
def verb_comparison
 star{adverb}
 verb
 preposition
end


def comparison
  try{verb_comparison}||
      try{comparation}
end


def endNode2
  the?
  star{adjective}
  noun
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

  def any_line
    @@string=@@string.gsub(".*?\n","")
  end

  def ruby_block
    block_depth=0
  star{
    raise EndOfBlock.new if(@@string.strip.start_with?"end") and block_depth==0
    any_line
  }
  end

  def ruby_def
    start_tree_node
    _"def"
    method=word
    try{arg=word;}
    star{_","; arg=word;}
    newline
    ruby_block
    #-- # // Some Ruby coat goes here
    newline
    _"end"
    add_tree_node
  end


  def start_block
    try{newline} ||
    try{tokens "{","first you ","second you ","then you ","finally you ",":"}
  end
end

