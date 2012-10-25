// $ANTLR 3.4 T.g 2012-02-11 21:18:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T"
    };

    public static final int EOF=-1;
    public static final int T=4;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TParser.tokenNames; }
    public String getGrammarFileName() { return "T.g"; }



    // $ANTLR start "t"
    // T.g:8:1: t : T ;
    public final void t() throws RecognitionException {
        try {
            // T.g:8:2: ( T )
            // T.g:8:3: T
            {
            match(input,T,FOLLOW_T_in_t23); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "t"

    // Delegated rules


 

    public static final BitSet FOLLOW_T_in_t23 = new BitSet(new long[]{0x0000000000000002L});

}