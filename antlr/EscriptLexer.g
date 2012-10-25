lexer grammar EscriptLexer;

protected ESC : '\\' ('n' | 'r');
Quote : '"' ( options {greedy=false;} : .)* '"' | '\''  ( options {greedy=false;} : .)* '\'';
//Quote : '"' ( options {greedy=false;} : (ESC | ~('\\'|'"'))*)* '"' | '\''  ( options {greedy=false;} :(ESC | ~('\\'|'"'))*)* '\'';

//		: 'Quote'; //

If	:	'unless'|'in case that'|'if';
//the	:	'the';


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
		
		
