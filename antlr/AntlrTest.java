import org.antlr.runtime.*;

public class ANTLRDemo {
	public Double evaluate(String string, Map<String, Double> input) throws RecognitionException {
	    ANTLRStringStream in = new ANTLRStringStream(string);
	    ExpLexer lexer = new ExpLexer(in);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    return new ExpParser(tokens).eval();
	}
	
    public static void main(String[] args) throws Exception {
	String arg="12*(5-6)";
		if(args.length>0)arg=args[0];
		System.out.println("parsing "+arg);
        ANTLRStringStream in = new ANTLRStringStream(arg);
        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        System.out.println(parser.eval());
		System.out.println("done");
    }
}