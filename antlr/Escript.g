grammar Escript;

options{
	k=6;
//	language=Ruby;
	//testLiterals=false;   
}
@members 
{
        String file="~/data/base/lang/english.words.sqlite3.db";
        static Runtime runtime=Runtime.getRuntime();
        
        public boolean testSql(String word, String type){
                try{
                String query=" 'SELECT * FROM nouns WHERE word=\""+word+"\"'";
                String cmd="sqlite3 "+file+" "+query;
                Process p =runtime.exec(cmd);
                }catch(Exception e){return false;};
                return true;
       }
                
         public static void pp(Object x){
                System.out.println(x);
         }                
 }
        	

/*import EscriptLexer;*/

// IMPLEMENTING FUNCTIONALLITY :
//ruby_action:

bash_action:
	bash quote {runtime.exec( $quote.getText());}
//	|bash  ( options {greedy=false;} : .)*{exec(getText());}
	;

bash:	'bash';
// 	: exp=statements {value = exp.text;require 'ap';ap exp;}
//	| exp=action{value = exp.text;require 'ap';ap exp;} // ruby

parse returns [String value]
	: exp=statements {value = exp.getText();pp(value);}
	| exp=action{value = exp.getText();pp(value);}
	|EOF {pp("done");};

act0	: action|statements;

statements 
: definition*|block;

block
		: (expression NL+)*;//... expression| backtrack!
	
expression
	: action;//| if_then | once | loop 

definition	
	:method verb endNode? arg* ':'? NL block done;
	// 
	
if_then  // ( options {greedy=false;} )
	: 'if' condition 'then' action
	| If condition 'then'? NL block done;
//	| action If condition NL;

once
	: 'once' condition 'then'? action 
//	| action 'as soon as' condition
//	| action 'once' condition
//	| 'as soon as' condition 'then'? action 
	;	

/*n_times
	: verb number 'times' preposition nod -> "<verb> <preposition> <nod> for <number> times";	*/
/*	: verb number 'times' preposition nod -> ^(number times (verb preposition nod)) // Tree ~= lisp	*/

action :
	bash_action
//	|'say' x=(.*) -> 'bash "say $quote"'
 	|set
	|verb
	|verb nod
	|endNode verb nod;	


loop:
	 'while' condition NL block done 
	 | action 'until' condition	
	 | action number 'times'
//	 | action 'forever'
/*	| action 'while' condition
	| action 'as long as' condition */
	|  'as long as' condition NL block done
	;
	
/*	: let nod be nods;*/	
set
	:let? the?  ('var'|'val'|'value of')? variable be value;// |'to'
	//'initial'?	:let? the? ('initial'|'var'|'val'|'value of')? variable (be|'to') value;

variable
	: Word;

value
	: nod;

	
arg
	: preposition endNode;// about sex


that:
	 'that' verbium endNode? // things that stink , things that move backwards
	 | 'that' be gerund  ;
	
gerund
	: 'stinking';
		
where
	:'where' condition;
	
condition
	:endcondition;// :( 'but not' endcondition | endcondition 'and' condition;
	
endcondition 		
	:endNode comparison endNode;// | endNode have adjective | endNode attribute | endNode verbTo verb;//|endNode hilfsverb gerundium;
	
// todo : I hate to ...	
verbTo
	: hilfsverb's to';
		
hilfsverb
	: 'want'|'like'|'hate';
	
gerundium
	:	verb'ing';
	
attribute
	:Attribute;

verbium
	:comparison|verb adverb; // be|have|

// be have do get make want  try 
verb : Verb;
	//: {isVerb(getText());}? Word;//'verb';//

nod //options{generateAmbigWarnings=false}
	:number |quote | the? noun (selector)*;	

noun
	:{isNoun(getText())}? Word; // getText withouth variable OK ? LT(1) text  $Word.text ?

quote
	:	Quote;

attrib
	: 'stinky'; //Word;

//number    :  DIGIT+ ('.' DIGIT+)?;
number    :Integer | Real;//s '34';// Integer | Real ;
/*number    :    Integer | Real ;*/

endNode: 
	endNode2;//| endNode2 selector2 |  endNode2 'of' endNode2 | ;


selector
	:where|that | 'of' endNode | preposition nod; // ambivalent?  delete james from china
		//	catch [RecognitionException re] {}		;//Preposition nod
		 // preposition nod; // ambivalent?  delete james, from china delete (james from china)		
		
selector2
	:	('that'|'who') adverb* verb's' (preposition endNode2);	
	
adverb
	:	'often'|'never'|'joyfully';
		
endNode2
	:the? adjective* noun;

adjective
	:	'funny';

done
	: 'ok'|'OK'|'alrighty'|'done'|'end'|'all set'|'finished'|'qed';// NL+; // NL verbium?


/////////////////////////////////////
// Lexemes = simple words
////////////////////////////////////

let
	: 'let' | 'set';

method
	:	'how to'|'function'|'define'|'method for'|'method';

comparison
	: adverb* verb preposition |comparation;
	
comparation:Comparation;	
		
// a nod can be a noun, a string, a number or a simple expression such as The President of the USA, birds in africa
/*nods
	: nod|List;	*/
/*List
	: (nod ',')* nod 'and' nod;*/
the:The;
be:Be;
have:Have;
	
/*otherKeywords :'and'|'as'|'back'|'beginning'|'but'|'by'|'contain'|'contains'|'copy'|'div'|'does'|'eighth'|'else'|'end'|'equal'|'equals'|'error'|'every'|'false'|'fifth'|'first'|'for'|'fourth'|'even' | 'front'|'get'|'given'|'global'|'if'|'ignoring' | 'is'|'it'|'its'|'last'|'local'|'me'|'middle'|'mod'|'my'|'ninth'|'not'|'sixth'|'some'|'tell'|'tenth'|'that'|'the'|'then'|'third'|'timeout'|'times'|'transaction'|'true'|'try'|'where'|'whoseuntil'|'while'|'prop'|'property'|'put'|'ref'|'reference'|'repeat'|'returning'|'script'|'second'|'set'|'seventh';*/

preposition: Preposition;
// 'of'|











////////// LEXER

protected ESC : '\\' ('n' | 'r');
Quote : '"' ( options {greedy=false;} : .)* '"' | '\''  ( options {greedy=false;} : .)* '\'';
//Quote : '"' ( options {greedy=false;} : (ESC | ~('\\'|'"'))*)* '"' | '\''  ( options {greedy=false;} :(ESC | ~('\\'|'"'))*)* '\'';

//		: 'Quote'; //

If	:	'unless'|'in case that'|'if';
//the	:	'the';


/*Epsilon   JUST USE TOKEN* (star)*  '' invalid char literal !! */


Preposition: 'in'|'above'|'after'|'against'|'apart from'|'around'|'as'|'aside from'|'at'|'before'|'behind'|'below'|'beneath'|'beside'|'between'|'considering'|'from'|'instead of'|'into'|'on'|'onto'|'out of'|'over'|'since'|'through'|'thru'|'to'|'with'|'without';

Attribute:
	'sucks';
	

Verb 		
	:'buy'|'take'|'apply'|'make'|'get'|'eat'|'drink'|'say'|'go'|'know'|'take'|'see'|'come'|'think'|'look'|'give'|'use'|'find'|'tell'|'ask'|'work'|'seem'|'feel'|'leave'|'call';
	

The	:'a'|'an'|'the'|'these'|'those'|'any'|'all'|'some'|'teh'|'that'|'every'|'each'|'this';// 'that' * 2 !!!

Be
		:'is'|'be'|'was'|':='|'='|'==';

Comparation	
				: '>'|'>='|'=='|'<'|'=<'|'gt'|'lt'|'eq'|'bigger than'|'greater than'|'equals'|'smaller than'|'less than'
				;

Have
		:'has'|'had'|'have';
		


Word
	: LETTER+;

// ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*	    ;
// !!! USE ONLY IN CONTEXT!!!

/*IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;*/

fragment DIGIT    :  '0'..'9';  
Integer :   DIGIT+	;
Real : DIGIT* '.' DIGIT+;

NL
	: '\r'|'\n'|'!'|'?'|';'|'. ';

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;	


COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' 
	{System.out.println("found comment "+getText());$channel=HIDDEN;}
    ;

Reductions
	: ('here is'|'lets see'|'please') {$channel=HIDDEN;};

LINE_COMMENT
    : ('//' | '#' | '--') ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

	/* We're going to ignore all white space characters NOT NEW LINES!!*/
WS      :   (' ' | '\t' | '\u000C' |'\r') { $channel=HIDDEN;} ;
	/*WS      :   (' ' | '\t' | '\r'| '\n') {skip();}    ;*/

		