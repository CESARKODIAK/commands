##################/
# Lexemes = simple words
##################

def preposition
  tokens 'in','above','after','against','apart from','around','as','aside from','at','before','behind','below','beneath','beside','between','considering','from','instead of','into','on','onto','out of','over','since','through','thru','to','with','without'
end

def attribute
  tokens 'sucks'
end


def verb
  tokens 'be', 'have', 'do', 'get', 'make', 'want', 'try', 'buy','take','apply','make','get','eat','drink','say','go','know','take','see','come','think','look','give','use','find','tell','ask','work','seem','feel','leave','call'
end


def be
  tokens 'is','be','was',':=','=','=='
end

def comparison
tokens '>','>=','==','<','=<','gt','lt','eq','bigger than','greater than','equals','smaller than','less than'
end

def have
tokens 'has','had','have'
end


def adverb
  tokens 'often','never','joyfully'
end


def adjective
  tokens 'funny'
end

def done
  tokens 'ok','OK','alright','alrighty','that\'s it','fine','fini','done','end','all set','finished','qed'# NL+ # NL verbium?
  ignore_rest_of_line
end

def let
  tokens 'let' , 'set'
end



def question
  tokens "how", "where","why","what","who","whom"
end


def method
  tokens 'how to','function','define','method for','method'
end

def the
  tokens 'a','an','the','these','those','any','all','some','teh','that','every','each','this'# 'that' * 2 !!!
end

def the?
  maybe{the}
end

#/*otherKeywords 'and'||'as'||'back'||'beginning'||'but'||'by'||'contain'||'contains'||'copy'||'div'||'does'||'eighth'||'else'||'end'||'equal'||'equals'||'error'||'every'||'false'||'fifth'||'first'||'for'||'fourth'||'even' || 'front'||'get'||'given'||'global'||'if'||'ignoring' || 'is'||'it'||'its'||'last'||'local'||'me'||'middle'||'mod'||'my'||'ninth'||'not'||'sixth'||'some'||'tell'||'tenth'||'that'||'the'||'then'||'third'||'timeout'||'times'||'transaction'||'true'||'try'||'where'||'whoseuntil'||'while'||'prop'||'property'||'put'||'ref'||'reference'||'repeat'||'returning'||'script'||'second'||'set'||'seventh' */
