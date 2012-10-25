grammar Exp;

options {
	k=3;  
	//filter=true; illegal // first serves first in lexer !
}

import EscriptLexer;
import Escript;

/*
backtrack=true;
options {
	k=2;
}
    k=*;  
  backtrack=true; // not interpretable!!
    memoize=true;
    greedy=false;
how to eat chicken in bavaria :
	munch as long as it has feathers.
ok
*/

/*I've gotten this time-out error in the past also.  It usually occurs when I'm using a look-ahead of k=2, if I change the look-ahead to k=1 and then recompile, it will sometimes spit out an error that leads me to a fix.  I can then fix the error, set look-ahead back to k=2, and then I'm able to debug. 
*/

@header {
import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;//pipe
import java.io.BufferedReader;
import java.io.*; 
import org.antlr.runtime.*;
}

@members {
	String file="~/data/base/lang/english.words.sqlite3.db";
	static Runtime runtime=Runtime.getRuntime();
	
	public boolean testSql(String word, String type){
		try{
		String query=" 'SELECT * FROM nouns WHERE word=\""+word+"\"'";
		String cmd="sqlite3 "+file+query;
		Process p =runtime.exec(cmd);
		return word.equals(new BufferedReader( new InputStreamReader(p.getInputStream())).readLine());
		}catch(Exception e){};
		return false;
	}

	public boolean isNoun(String word){
		return testSql(word,"noun");
	}
	
	// +s ed ing	
	public boolean isVerb(String word) {
			return testSql(word,"verb");// ||testSql(word-"ing","verb")||testSql(word+"s","verb")+testSql(word+"ed","verb");
	}
	public static void eval(String arg) throws Exception{
		System.out.println("parsing "+arg);
		ANTLRStringStream in = new ANTLRStringStream(arg);
		ExpLexer lexer = new ExpLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpParser parser = new ExpParser(tokens);
		System.out.println(parser.parse());
	}
	public static void main(String[] args) throws Exception{
			String arg="x=7;";
			BufferedReader pipe = new BufferedReader(new InputStreamReader(System.in));
			if(args.length>0)eval(args[0]);
			else if(System.in.available() > 0)// pipe
	        	while((arg=pipe.readLine()) != null)
	           		eval(arg);
			else eval(arg);			
	}
	public static void puts(String x){
		System.out.println(x);
	}
}



teste
	:	Test2 | 'parse' EOF;

Test2:	 'Test';