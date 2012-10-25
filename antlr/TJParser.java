// $ANTLR 3.4 TJ.g 2012-02-12 22:54:46

import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;//pipe
import java.io.BufferedReader;
import java.io.*; 
import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TJParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T", "WS"
    };

    public static final int EOF=-1;
    public static final int T=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "parse", "t"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public TJParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public TJParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public TJParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return TJParser.tokenNames; }
    public String getGrammarFileName() { return "TJ.g"; }


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



    // $ANTLR start "parse"
    // TJ.g:45:1: parse returns [String value] : x= t EOF ;
    public final String parse() throws RecognitionException {
        String value = null;


         value ="nix";
        try { dbg.enterRule(getGrammarFileName(), "parse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            // TJ.g:46:23: (x= t EOF )
            dbg.enterAlt(1);

            // TJ.g:47:2: x= t EOF
            {
            dbg.location(47,3);
            pushFollow(FOLLOW_t_in_parse44);
            t();

            state._fsp--;

            dbg.location(47,6);
            value ="noe";
            dbg.location(47,22);
            match(input,EOF,FOLLOW_EOF_in_parse48); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(47, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "parse"



    // $ANTLR start "t"
    // TJ.g:49:1: t : x= T ;
    public final void t() throws RecognitionException {
        Token x=null;

        try { dbg.enterRule(getGrammarFileName(), "t");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // TJ.g:49:2: (x= T )
            dbg.enterAlt(1);

            // TJ.g:50:2: x= T
            {
            dbg.location(50,3);
            x=(Token)match(input,T,FOLLOW_T_in_t58); 
            dbg.location(50,6);
            String t = (x!=null?x.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(50, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "t");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "t"

    // Delegated rules


 

    public static final BitSet FOLLOW_t_in_parse44 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_in_t58 = new BitSet(new long[]{0x0000000000000002L});

}