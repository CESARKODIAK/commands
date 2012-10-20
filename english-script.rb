def root
  action || statements
end

#module EnglishScript
def ruby_action
  _'ruby'
  exec(action || quote)
end

def bash_action
  __ 'bash' #,'execute'
  any{ command = quote ||  statements || action }
  %x{#{command}}
end


def statements
  star{definition}||block
  block
		 star{
       expression
       newlines
       } #... expression|| backtrack!
end


def block
star{
  expression
  newlines
}
end
#;//... expression| backtrack!


def expression
  any{action || if_then || once || loop}
end


def definition
  @throwing=true
  method
  verb
  endNode?
  star{arg}
  #''?
  newline
  block
  done
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

 def action
   #	||'say' x=(.*) -> 'bash "say $quote"'
     any{ bash_action ||set ||verb ||verb and nod ||endNode and verb and nod}
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

def loop
  _? "repeat"
 any{while_loop || until_condition || times || while_condition || as_long_condition || as_long_condition_block}
end

#/*	 let nod be nods */
    def set
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

def value
 nod
end


def arg
  breakpoint
  debug
  pause
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

def  verbTo
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
def nod #options{generateAmbigWarnings=false}
number ||quote || the? and noun and star{selector}
    end

#number      DIGIT+ ('.' DIGIT+)?
def number
  Integer || Real #s '34' # Integer || Real
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
any{where || that || token('of') and endNode || preposition and nod }
  # ambivalent?  delete james from china
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

def noun
  tokens "bug"
end

# a nod can be a noun, a string, a number or a simple expression such as The President of the USA, birds in africa
#/*nods
#	 nod||List 	*/
#/*List
#	 (nod ',')* nod 'and' nod */


def start
  a=ARGV[0] || "/Users/me/english-script/test.e"
  parse IO.read(a)
end
