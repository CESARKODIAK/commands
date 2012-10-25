// $ANTLR 3.4 /Users/pannous/nlp/english-script/grammar/Test.g 2012-02-08 10:35:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "C", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'b'"
    };

    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int A=4;
    public static final int B=5;
    public static final int C=6;
    public static final int CHAR=7;
    public static final int COMMENT=8;
    public static final int ESC_SEQ=9;
    public static final int EXPONENT=10;
    public static final int FLOAT=11;
    public static final int HEX_DIGIT=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int OCTAL_ESC=15;
    public static final int STRING=16;
    public static final int UNICODE_ESC=17;
    public static final int WS=18;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "test", "b"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public TestParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public TestParser(TokenStream input, int port, RecognizerSharedState state) {
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

public TestParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return TestParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/pannous/nlp/english-script/grammar/Test.g"; }


    	void print(Object x){
    			System.out.println("yay"+x);
    			System.err.println("yay"+x);
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			System.out.print("\007"); System.out.flush();
    	}



    // $ANTLR start "test"
    // /Users/pannous/nlp/english-script/grammar/Test.g:12:1: test : ( A b ( C )+ FLOAT | A b |be= b );
    public final void test() throws RecognitionException {
        Token A2=null;
        TestParser.b_return be =null;

        TestParser.b_return b1 =null;


        try { dbg.enterRule(getGrammarFileName(), "test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Test.g:12:5: ( A b ( C )+ FLOAT | A b |be= b )
            int alt2=3;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==A) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==19) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==ID) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==C) ) {
                            alt2=1;
                        }
                        else if ( (LA2_4==EOF) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA2_0==19) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Test.g:13:2: A b ( C )+ FLOAT
                    {
                    dbg.location(13,2);
                    match(input,A,FOLLOW_A_in_test17); 
                    dbg.location(13,4);
                    pushFollow(FOLLOW_b_in_test19);
                    b1=b();

                    state._fsp--;

                    dbg.location(13,6);
                    // /Users/pannous/nlp/english-script/grammar/Test.g:13:6: ( C )+
                    int cnt1=0;
                    try { dbg.enterSubRule(1);

                    loop1:
                    do {
                        int alt1=2;
                        try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==C) ) {
                            alt1=1;
                        }


                        } finally {dbg.exitDecision(1);}

                        switch (alt1) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/pannous/nlp/english-script/grammar/Test.g:13:6: C
                    	    {
                    	    dbg.location(13,6);
                    	    match(input,C,FOLLOW_C_in_test21); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt1++;
                    } while (true);
                    } finally {dbg.exitSubRule(1);}

                    dbg.location(13,9);
                    match(input,FLOAT,FOLLOW_FLOAT_in_test24); 
                    dbg.location(13,14);
                    print((b1!=null?input.toString(b1.start,b1.stop):null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Test.g:14:2: A b
                    {
                    dbg.location(14,2);
                    A2=(Token)match(input,A,FOLLOW_A_in_test30); 
                    dbg.location(14,4);
                    pushFollow(FOLLOW_b_in_test32);
                    b();

                    state._fsp--;

                    dbg.location(14,5);
                    print((A2!=null?A2.getText():null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/pannous/nlp/english-script/grammar/Test.g:16:2: be= b
                    {
                    dbg.location(16,4);
                    pushFollow(FOLLOW_b_in_test42);
                    be=b();

                    state._fsp--;

                    dbg.location(16,6);
                    print(be);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "test");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "test"


    public static class b_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "b"
    // /Users/pannous/nlp/english-script/grammar/Test.g:20:1: b : 'b' ID ;
    public final TestParser.b_return b() throws RecognitionException {
        TestParser.b_return retval = new TestParser.b_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Test.g:20:3: ( 'b' ID )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Test.g:20:5: 'b' ID
            {
            dbg.location(20,5);
            match(input,19,FOLLOW_19_in_b66); 
            dbg.location(20,9);
            match(input,ID,FOLLOW_ID_in_b68); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "b"

    // Delegated rules


 

    public static final BitSet FOLLOW_A_in_test17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_b_in_test19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_C_in_test21 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_FLOAT_in_test24 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_test30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_b_in_test32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_b_in_test42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_b66 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_b68 = new BitSet(new long[]{0x0000000000000002L});

}