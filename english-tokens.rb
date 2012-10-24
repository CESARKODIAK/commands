class Parser < MethodInterception
##################/
# Lexemes = simple words
##################
  @@OK="OK"

  def initialize
    #pronouns +  TODO!!! keywords-pronouns has "I"!?
    @keywords=prepositions+be_words+true_comparitons+fillers+nill_words+done_words+auxiliary_verbs+conjunctions #+otherKeywords
  end

  def keywords
    @keywords
  end

  def question_words
    ["when","why","where", "what", "who","which", "whose", "whom", "how"]#,"what's","how's","why's", "when's","who's",
  end

  def prepositions
    ['above','after','against','apart from','around','as','aside from','at','before','behind','below',
                 'beneath','beside','between','beyond','by','considering','down','during','for','from','in',
                 'instead of','inside','into','like','near','on','onto','out of','over', 'outside',
                 'since','through','thru','to','till','with','up','upon','under','underneath','versus', 'via','with',
                 'within','without','toward','towards']
  end


#'but',
  def all_prepositions
    ['aboard','about','above','across','after','against','along','amid','among','anti','around','as',
                     'at','before','behind','below','beneath','beside','besides','between','beyond','by',
                     'concerning' ,'considering','despite','down','during','except','excepting','excluding','following',
                     'for','from','in','inside','into','like','minus','near','of','off','on','onto','opposite',
                     'outside', 'over','past','per','pro','plus','re','regarding','round','save','sans','since','than',
                     'through','thru','thruout','throughout','to','till',
                     'toward','towards','under','underneath','unlike','until','up','upon','versus', 'via','with',
                     'within','without']
  end

  def long_prepositions
    ['by means of','for the sake of','in accordance with','in addition to','in case of',
                       'in front of',
                      'in lieu of','in order to','in place of','in point of','in spite of','on account of',
                      'on behalf of','on top of','with regard to','with respect to','with a view to','as far as',
                      'as long as','as opposed to','as soon as','as well as','by virtue of']
  end

  def pair_prepositions
  ['according to','ahead of','apart from','as for','as of','as per','as regards','aside from',
                      'back to','because of','close to','due to','except for','far from',
                      'in to','(contracted as into)','inside of','(note that inside out is an adverb and not a preposition)',
                      'instead of','left of','near to','next to','on to','(contracted as onto)','out from','out of','outside of',
                      'owing to','prior to','pursuant to','regardless of','right of','subsequent to','thanks to','that of','up to',
                      'where as']#,'whereas'
  end

  def postpositions
    ['ago','apart','aside','away','hence','notwithstanding','on','through','withal']
  end

  def conjunctions
    ['and','or','but','yet','xor','nand']# so for nor
  end

  def correlative_conjunctions
    ['either...or','not only...but (also)','neither...nor','neither...or',
                             'both...and', 'whether...or','just as...so']
  end

  def auxiliary_verbs
    ['be','can','could','have','may','might','must','shall','should','will','would']
  end

  def pronouns
    ['I','i','me','my','mine','myself','we','us','our','ours','ourselves','you','your','yours','yourself','you',
             'your','yours','yourselves','he','him','his','himself','they','them','their','theirs','themselves','she',
             'her','hers','herself','it','its','itself','ye','thou','thee','thy','thine','thyself']
  end

  def interjections
    ['ah','aah','aha','ahem','ahh','argh','aw','bah','boo','brr','eek','eep','eh','eww',
                  'gah','grr','hmm','huh','hurrah','meh','mhm','mm','muahaha','nah','nuh-uh','oh','ooh',
                  'ooh-la-la','oomph','oops','ow','oy','oy','pff','phew','psst','sheesh','shh','tsk-tsk','uh-hu',
                  'uh-uh','uh-oh','uhh','wee','whoa','wow','yeah','yahoo','yoo-hoo','yuh-uh','yuk','zing']
  end

  def be_words
    ['is','be','was',':=','=','==']
  end

  def fillers
    ["like", "y'know", "so", "actually", "literally", "basically", "right", "I'm tellin' ya",
            "you know what I mean?","ehm","uh","er" ]
  end
#Classifiers==#measure word="litre","cups","kernels","ears","bushels",

  def true_comparitons
    ['be','is','are','were','=' '>','>=','==','<','=<','gt','lt','eq','bigger','greater','equals',
                     'smaller','less','equal to','more','less']
  end

  def nill_words
    ['0','0.0','0,nix','zero','naught','nought','aught','oh','nil','nill','nul','nothing','not a thing','null',
         'zilch','nada','nuttin','nutting','zip','nix','cypher','cipher','leer','empty','nirvana','void']  #'love',
  end

  def done_words
    ['}','ok','OK','O.K.','alright','alrighty','that\'s it',"I'm done","i'm done", 'fine','fini','done',
               'end','all set','finished','finish','fin','ende','the end','over and out','over','qed',"<end>"]# NL+ # NL verbium?]
  end


  def otherKeywords
    ['and','as','back','beginning','but','by','contain','contains','copy','div','does','eighth','else',
                  'end','equal','equals','error','every','false','fifth','first','for','fourth','even','front','get',
                  'given','global','if','ignoring' ,'is','it','its','last','local','me','middle','mod','my',
                  'ninth', 'not','sixth','some','tell','tenth','then','third','timeout','times',
                  'transaction','true','try','where','whose','until','while','prop','property','put','ref','reference',
                  'repeat','returning','script','second','set','seventh']
  end


  def nill
    tokens nill_words
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
    tokens true_comparitons
    no_rollback!
    tokens? 'and','or','xor','nor'
    tokens? true_comparitons
    _?'than','then' #_?'then' ;}
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
    #return true if checkEndOfLine
    return "OK" if checkNewline
    tokens done_words
    #rescue EndOfLine =>x
    #  puts x
    #end
    #return true
    #ignore_rest_of_line
  end

  def let?
    _? 'let' , 'set'
  end

  def let
    tokens 'let' , 'set'
  end



  def question
    tokens question_words
  end


  def method
    tokens 'how to','function','definition for','definition of','define','method for','method','to' # <<< TO == DANGER!!
  end

  def bla
    tokens 'hey'#,'here is'
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

  def checkNewline
    if @@string.blank?
      @@line_number=@@line_number+1
      return @@OK if @@line_number>=@@lines.count
      #raise EndOfDocument.new if @@line_number==@@lines.count
      @@string=@@lines[@@line_number];
      @@original_string=@@string
      return @@OK
    end
  end

  def newline
    return @@OK if checkNewline==@@OK
    found=tokens "\.\n","\. ","\n","\r\n",";" #,'\.\.\.' ,'end','done' NO!! OPTIONAL!
    return @@OK if checkNewline==@@OK # get new line
    return found
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
    @@current_value=@@string.match(/(.*?)\n/)[1]
    @@string=@@string[@@current_value.length..-1]
    @@current_value.strip!
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
    return ['x','y','z','a','i']
  end

  def true_variable
    tokens variables_list
  end

  def noun
    no_keyword
    #return true if true_variable
    #@@string=@@string[2]if(@@string.start_with?('s ')) #plural, todo
    tokens  'bug','sandwich','integrable-function','function','steps','step','size' #careful with function!
  end

  def special_verbs
    ['evaluate','eval']
  end

  @@verbs=nil
  @@verbs2=[ 'be', 'have', 'do', 'get', 'make', 'want', 'try', 'buy','take','apply','make','get','eat','drink',
                'say',
             'go','know','take','see','come','think','look','give','use','find','tell','ask','work','seem','feel',
             'leave','call','integrate','print','eat','test']


  def app_path
    File.expand_path(File.dirname(__FILE__)).to_s
  end
  def dictionary_path
    app_path + "word-lists/"
  end

  def call_is_verb
  test=@@string.match(/^\s*(\w+)/)[1] rescue nil
  return false if not test
  command=app_path+"/is_verb "+test
  puts command
  found_verb=%x[#{command}]
  found_verb="" if found_verb=="NO VERB"
  raise NotMatching.new "no verb" if found_verb.blank?
  @@string=@@string.strip[found_verb.length..-1] if found_verb
  puts "found_verb "+found_verb.to_s
  found_verb
  end

  def verb
    #if not @@verbs
    #  @@verbs=IO.readlines(dictionary_path + "/english.verbs.list")
    #end
    #found_verb= tokens @@verbs,special_verbs
    @@current_value=call_is_verb
  end

  def modifier
    tokens 'initial','public','static','void','default','protected','private','constant','const'
  end

end
