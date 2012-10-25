grammar TJ;

import T2; // :
/*T:'Test';*/

@header {
import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;//pipe
import java.io.BufferedReader;
import java.io.*; 
import org.antlr.runtime.*;
}


@members 
{
String file="~/data/base/lang/english.words.sqlite3.db";
static Runtime runtime=Runtime.getRuntime();
	
static void puts(Object x){
       System.out.println(x);
}

static void eval(String arg) throws Exception{
	System.out.println("parsing "+arg);
	ANTLRStringStream in = new ANTLRStringStream(arg);
	TJLexer lexer = new TJLexer(in);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	TJParser parser = new TJParser(tokens);
	System.out.println(parser.parse());
	System.out.println("done");
}
public static void main(String[] args) throws Exception{
		String arg="XText fee";
		BufferedReader pipe = new BufferedReader(new InputStreamReader(System.in));
		if(args.length>0)eval(args[0]);
		else if(System.in.available() > 0){puts("reading pipe...");
        	while((arg=pipe.readLine()) != null)
           		eval(arg);}
		else eval(arg);			
}
}

parse returns [String value]
	@init{ $value="nix";}:
	x=t {$value="noe";} EOF;// | value=test EOF;

t:
	x=T {String t = $x.text;};//{puts("OK T "+x);}
/*	| x=X{puts("OK T "+x);}
	| x=X r{puts("OK T "+x);}
*/	;

r: 'fee';

X:'XTest';

test:	
	A b C+ FLOAT{print($b.text);} |
	A b{print($A.text);} |
	//A{print(LT(1));} |
	be=b{print(be);}	
	;
	
A	:	'a' . .;
b	: 'b' ID; // SPACE NECCESSARY !!
// BLOCKS IDS starting with b !
B	: 'b' ID;
C	: 'c';
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
