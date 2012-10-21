def root
  action || star{method_definition || block}
end



def block
  star{
    expression
    newlines
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
  endNode?
  star{arg}
  #''?
  newline
  block
  #newlines?
  done
end


#module EnglishScript
def ruby_action
  _'ruby'
  exec(action || quote)
end


def bash_action
  __ 'bash' #,'execute'
  @command = try{quote}
  @command = rest_of_statement if not @command
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
 'once'
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
         try {bash_action} ||
         try{setter}||
         try {spo}||
         try{verb_node} ||
         try{verb}
   }
   newline?
     #any{ bash_action ||setter ||verb ||verb and nod ||endNode and verb and nod}
 end

def while_loop
  _'while'
  condition
  newline
  block
  done
end

def until_condition
  action
  _'until'
  condition
end

def while_condition
  action
  _'while'
  condition
end

def as_long_condition
  action
  _'as long'
  condition
end

def times
  action
  number
  _'times'
end


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
  _? "repeat"
  one :while_loop ,:until_condition ,:times ,:while_condition ,:as_long_condition ,:as_long_condition_block
end

#/*	 let nod be nods */
def setter
  let?
  the?
  maybe{tokens 'var','val','value of'}
  variable
be
value
# ||'to'
#'initial'?	let? the? ('initial'||'var'||'val'||'value of')? variable (be||'to') value
end

def variable
 word
end


def word
  noun
end

def value
 nod
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

def endNode?
  maybe{endNode}
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

def nod #options{generateAmbigWarnings=false}
    try{number} ||
    try{quote} ||
    try{the_noun_that}
end

#number      DIGIT+ ('.' DIGIT+)?
def number
  real || integer  #s '34' # Integer || Real
end

def real
  match=@@string.match(/^\d*.\d+/)
  if match
    @@string=@@string[match[0].length..-1].strip
    #return rest @@string
  end
  #plus{tokens '1','2','3','4','5','6','7','8','9','0','.'}
end

def integer
  match=@@string.match(/^\d+/)
  if match
    @@string=@@string[match[0].length..-1].strip
  end
  #plus{tokens '1','2','3','4','5','6','7','8','9','0'}
end

def endNode
    endNode2 #|| endNode2 selector2 ||  endNode2 'of' endNode2 ||
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
  verb_comparison||comparation
end


def endNode2
  the?
  star{adjective}
  noun
end


# a nod can be a noun, a string, a number or a simple expression such as The President of the USA, birds in africa
#/*nods
#	 nod||List 	*/
#/*List
#	 (nod ',')* nod 'and' nod */

