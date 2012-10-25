grammar Exp;


options {
    backtrack=true;
    memoize=true;
    k=2;
}
/*	
	
	greedy=true;	
    output=AST;
	filter=true; //disable @after and action blocks,  @init OK! */


@header {
import java.util.Set;
import java.util.HashSet;
}

@members {
	public static void main(String[] args){
	}
}


/*translation_unit
scope Symbols; // entire file is a scope
@init {
  $Symbols::types = new HashSet();
}
	: external_declaration+
	;*/

/*parse*/
/*  :  Definition;*/
// EOF!?
/* { System.out.println("done"); }*/


// ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*	    ;
// !!! USE ONLY IN CONTEXT!!!

/* A number: can be an integer value, or a decimal value */
fragment DIGIT    :  '0'..'9';  
number    :    Integer | Real ;
Integer :   DIGIT+	;
Real : DIGIT* '.' DIGIT+;


/*Verb
	: {isVerb(input)}? Word;
Noun
	: {isNoun(input)}? Word;	
*/

// { N <= 10 }?   is a semantic predicate
/* http://stackoverflow.com/questions/3056441/what-is-a-semantic-predicate-in-antlr */


Definition
	:Method;
/*	:Method Verbium Nod? Arg* NL Block* End NL;*/
NL
	: '\n'|'!'|'?'|';'|'. ';// ! 'do'|
Block
	: (Set|Loop|If|Once)*;//...
If
	: 'if' Condition 'then'? Action 
	| Action 'if' Condition;
Once
	: 'once' Condition 'then'? Action;
	// 'as long as' 'while' 'as soon as' 'until' 'unless' 'in case that'

Action
	: (Set|Verbium|Verbium Nod) NL;

Loop
	: 'while' Condition NL Block* End;
Condition
	: Nod Verbium Nod;
End
	: ('ok'|'done'|'end') (Verbium)?;
	
Set
/*	: Let Nod Be Nods;*/
	: Let The? 'Initial'? ('var'|'val'|'value of')? Variable (Be|'to'|':='|'=') Value;

// todo :annotate
Variable
	: Nod;
Value
	: Nod;
Let
	: 'let'|'set';
Method
	:	'how to'|'function'|'define'|'method for'|'method';
	
// a Nod can be a noun, a string, a number or a simple expression such as The President of the USA, birds in africa
Nod
	:Quote|(The)Noun(Selector)*;
Nods
	: Nod|List;	
List
	: (Nod ',')* Nod 'and' Nod;
Quote
	: 'Quote'; //'"'Letter*'"';
The
	:'a'|'the'|'these'|'those'|'any'|'all'|'some';
Noun
	:'todo';
Selector
	:Where|That|'of' Nod;//Preposition Nod
That
	: 'that' Verbium Nod | 'that' Attrib;
Attrib
	: 'stink';
Arg
	: Preposition Nod;// about sex
Where
	:'where' Nod Verbium Nod;
Letter
	:	'todoooo';//'a'..'Z';
Verbium
	:	Be|Have|Verb;
Be
	:'is'|'be'|'was';
Have
	:'has'|'had'|'have';
Verb
	:Letter*;
	
OtherKeywords :'and'|'as'|'back'|'beginning'|'but'|'by'|'contain'|'contains'|'copy'|'div'|'does'|'eighth'|'else'|'end'|'equal'|'equals'|'error'|'every'|'false'|'fifth'|'first'|'for'|'fourth'|'even' | 'front'|'get'|'given'|'global'|'if'|'ignoring' | 'is'|'it'|'its'|'last'|'local'|'me'|'middle'|'mod'|'my'|'ninth'|'not'|'sixth'|'some'|'tell'|'tenth'|'that'|'the'|'then'|'third'|'timeout'|'times'|'transaction'|'true'|'try'|'where'|'whoseuntil'|'while'|'prop'|'property'|'put'|'ref'|'reference'|'repeat'|'returning'|'script'|'second'|'set'|'seventh';

Preposition: 'above'|'after'|'against'|'apart\s+from'|'around'|'as'|'aside\s+from'|'at'|'before'|'behind'|'below'|'beneath'|'beside'|'between'|'considering'|'from'|'in'|'instead\s+of'|'into'|'of'|'on'|'onto'|'out\s+of'|'over'|'since'|'through'|'thru'|'to'|'with'|'without'
;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

	/* We're going to ignore all white space characters NOT NEW LINES!!*/
/*WS      :   (' ' | '\t') {$channel=HIDDEN;}    ;*/
	/*WS      :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}    ;*/
