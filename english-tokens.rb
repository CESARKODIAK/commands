##################/
# Lexemes = simple words
##################
class Parser #< MethodInterception

prepositions=['in','above','after','against','apart from','around','as','aside from','at','before','behind','below',
              'beneath','beside','between','considering','from','instead of','into','on','onto','out of','over',
              'since','through','thru','to','with','without']


#'but',
all_prepositions=['aboard','about','above','across','after','against','along','amid','among','anti','around','as',
                  'at','before','behind','below','beneath','beside','besides','between','beyond','by',
                  'concerning' ,'considering','despite','down','during','except','excepting','excluding','following',
                  'for','from','in','inside','into','like','minus','near','of','off','on','onto','opposite',
                  'outside', 'over','past','per','plus','re','regarding','round','save','sans','since','than',
                  'through','thru',
                  'thruout','throughout','to','till',
                  'toward','towards','under','underneath','unlike','until','up','upon','versus', 'via','with',
                  'within','without']

long_prepositions=['by means of','for the sake of','in accordance with','in addition to','in case of','in front of',
                   'in lieu of','in order to','in place of','in point of','in spite of','on account of',
                   'on behalf of','on top of','with regard to','with respect to','with a view to','as far as',
                   'as long as','as opposed to','as soon as','as well as','by virtue of']

pair_prepositions=['according to','ahead of','apart from','as for','as of','as per','as regards','aside from',
                        'back to','because of','close to','due to','except for','far from',
    'in to','(contracted as into)','inside of','(note that inside out is an adverb and not a preposition)',
    'instead of','left of','near to','next to','on to','(contracted as onto)','out from','out of','outside of',
    'owing to','prior to','pursuant to','regardless of','right of','subsequent to','thanks to','that of','up to',
    'where as']#,'whereas'

  postpositions=['ago','apart','aside','away','hence','notwithstanding','on','through','withal']

  conjunctions=['and','or','but','yet']# so for nor

  correlative_conjunctions=['either...or','not only...but (also)','neither...nor','neither...or',
                          'both...and','whether...or','just as...so']

  auxiliary_verbs=['be','can','could','have','may','might','must','shall','should','will','would']

pronouns=['I','i','me','my','mine','myself','we','us','our','ours','ourselves','you','your','yours','yourself','you',
          'your','yours','yourselves','he','him','his','himself','they','them','their','theirs','themselves','she',
          'her','hers','herself','it','its','itself','ye','thou','thee','thy','thine','thyself']

  interjections=['ah','aah','aha','ahem','ahh','argh','aw','bah','boo','brr','eek','eep','eh','eww',
                 'gah','grr','hmm','huh','hurrah','meh','mhm','mm','muahaha','nah','nuh-uh','oh','ooh',
                 'ooh-la-la','oomph','oops','ow','oy','oy','pff','phew','psst','sheesh','shh','tsk-tsk','uh-hu',
                 'uh-uh','uh-oh','uhh','wee','whoa','wow','yeah','yahoo','yoo-hoo','yuh-uh','yuk','zing']

be_words=['is','be','was',':=','=','==']

fillers=["like", "y'know", "so", "actually", "literally", "basically", "right", "I'm tellin' ya",
         "you know what I mean?","ehm","uh","er" ]
  #Classifiers==#measure word="litre","cups","kernels","ears","bushels",

true_comparitons=['be','is','are','were','=' '>','>=','==','<','=<','gt','lt','eq','bigger','greater','equals',
                  'smaller','less','equal to','more','less']

nill=['nil','nill','nul','null','empty','void','nothing']

done_words=['}','ok','OK','O.K.','alright','alrighty','that\'s it','fine','fini','done','end','all set','finished',
            'qed']# NL+ # NL verbium?]


otherKeywords=['and','as','back','beginning','but','by','contain','contains','copy','div','does','eighth','else','end','equal','equals','error','every','false','fifth','first','for','fourth','even' || 'front','get','given','global','if','ignoring' || 'is','it','its','last','local','me','middle','mod','my','ninth','not','sixth','some','tell','tenth','that','the','then','third','timeout','times','transaction','true','try','where','whoseuntil','while','prop','property','put','ref','reference','repeat','returning','script','second','set','seventh']


def keywords
  prepositions+be_words+true_comparitons+nill+done_words+otherKeywords
end


def preposition
  tokens prepositions
end

def attribute
  tokens 'sucks','default'
end

def be
  tokens be_words
end

# is more or less
# is neither ... nor ...
def comparation
  # danger: is
  tokens? 'be','is','are','were'
  tokens? 'either','neither'
  tokens? 'not'
  try{adverb} #'quite','nearly','almost','definitely','by any means','without a doubt'
  true_comparitons
  tokens? 'and','or','xor','nor'
  true_comparitons?
  _?'than'
end

  def either_or
    tokens? 'be','is','are','were'
    tokens 'either','neither'
    comparation?
    value
    tokens? 'or','nor'
    comparation?
    value
  end


def have
  tokens 'has','had','have'
end


def adverb
  tokens 'often','never','joyfully', 'often','never','joyfully','quite','nearly','almost','definitely','by any means','without a doubt'
end


def adjective
  tokens 'funny','big','small','good','bad'
end

def done
  #if(@@string[0]=='}')
  #  @@string=@@string[1]
  #  pop '}'
  #end
  tokens done_words
  ignore_rest_of_line
end

def let?
  _? 'let' , 'set'
end

def let
  tokens 'let' , 'set'
end



def question
  tokens 'how', 'where','why','what','who','whom'
end


def method
  tokens 'how to','function','definition for','definition of','define','method for','method','to' # <<< TO == DANGER!!
end

def bla
  tokens 'hey','here is'
end

def the
  tokens 'a','an','the','these','those','any','all','some','teh','that','every','each','this'# 'that' * 2 !!!
end

def the?
  try{the}
end


#number      DIGIT+ ('.' DIGIT+)?
def number
  real || integer  #s '34' # Integer || Real
end



  def real
    match=@@string.match(/^\d*.\d+/)
    if match
      @@current_value=@@string[0..match[0].length]
      @@string=@@string[match[0].length..-1].strip
      #return rest @@string
    end
    #plus{tokens '1','2','3','4','5','6','7','8','9','0','.'}
  end

  def integer
    match=@@string.match(/^\d+/)
    if match
      @@current_value=@@string[0..match[0].length]
      @@string=@@string[match[0].length..-1].strip
    end
    #plus{tokens '1','2','3','4','5','6','7','8','9','0'}
  end


  def newline?
    try{newline}
  end

  def newline
    return true if @@string==''
    tokens '.\n','. ','\n','\r',';' #,'\.\.\.' ,'<EOF>' # << dont consume!
    #,'end','done' NOT OPTIONAL!
  end

  def newlines
    #one_or_more{newline}
    star{newline}
  end

  def NL
    tokens '\n','\r'
  end


  def NLs
    tokens '\n','\r'
  end


  def rest_of_statement
    @@current_value=@@string.match(/(.*?)([\r\n;]|done)/)[1].strip
    @@string=@@string[@@current_value.length..-1]
    return @@current_value
  end

  def rest_of_line
    return @@current_value=@@string if not @@string.match(/(.*?)\n/)
    @@current_value=@@string.match(/(.*?)\n/)[1].strip
    @@string=@@string[@@current_value.length..-1]
    return @@current_value
  end

  def comment_block
    token '/*'
    @@string.gsub('.*?\*\/','')
    #token '*/'
    add_tree_node
  end

  def comment
    tokens '--','//','#'
    add_tree_node
  end

  def variables_list
    return ['x','y','z','a','i','I']
  end

  def true_variable
    tokens variables_list
  end

  def noun
    #return true if true_variable
    #@@string=@@string[2]if(@@string.start_with?('s ')) #plural, todo
    tokens  'bug','sandwich','integrable-function','function','steps','step','size','I' #careful with function!
  end

  def verb
    tokens 'be', 'have', 'do', 'get', 'make', 'want', 'try', 'buy','take','apply','make','get','eat','drink','say','go','know','take','see','come','think','look','give','use','find','tell','ask','work','seem','feel','leave','call','integrate','print','eat'
  end

end
