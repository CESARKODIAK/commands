import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;//pipe
import java.io.BufferedReader;
import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class __Test__{
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
}