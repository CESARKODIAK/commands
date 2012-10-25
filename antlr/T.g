grammar T;
options{
/*	language=Scala; UGLY as java!*/
/*	language=Java;*/
/*	language=JavaScript;//js*/
	language=Ruby;
}
import T2; // :
/*T:'Test';*/

t:
	x=T{puts "OK T #{x}";puts x.inspect}
	| x=X{puts "OK #{x}";require 'ap';ap x}
	| x=X r{puts "OK #{x}";require 'ap';ap x}
	;

r: 'fee';

X:'XTest';