
import java.io.InputStreamReader;//pipe
import java.io.BufferedReader;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class ANTLRDemo {
	public void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
	
		public static void eval(String arg) throws Exception{
			System.out.println("parsing "+arg);
			ANTLRStringStream in = new ANTLRStringStream(arg);
			ExpLexer lexer = new ExpLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ExpParser parser = new ExpParser(tokens);
			ExpParser.parse_return ret=parser.parse();
			CommonTree tree = (CommonTree)ret.getTree();
			printTree(tree,0);
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