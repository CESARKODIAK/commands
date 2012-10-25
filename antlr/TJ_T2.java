// $ANTLR 3.4 T2.g 2012-02-12 21:55:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TJ_T2 extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int A=4;
    public static final int B=5;
    public static final int C=6;
    public static final int FLOAT=7;
    public static final int ID=8;
    public static final int T=9;
    public static final int WS=10;
    public static final int X=11;
    public static final int Tokens=14;

    // delegates
    // delegators
    public TJLexer gTJ;
    public TJLexer gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TJ_T2() {} 
    public TJ_T2(CharStream input, TJLexer gTJ) {
        this(input, new RecognizerSharedState(), gTJ);
    }
    public TJ_T2(CharStream input, RecognizerSharedState state, TJLexer gTJ) {
        super(input,state);
        this.gTJ = gTJ;
        gParent = gTJ;
    }
    public String getGrammarFileName() { return "T2.g"; }

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T2.g:3:2: ( 'Test' )
            // T2.g:3:3: 'Test'
            {
            match("Test"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T2.g:5:9: ( ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' ) )
            // T2.g:5:13: ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // T2.g:1:8: ( T | WS )
        int alt1=2;
        int LA1_0 = input.LA(1);

        if ( (LA1_0=='T') ) {
            alt1=1;
        }
        else if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
            alt1=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }
        switch (alt1) {
            case 1 :
                // T2.g:1:10: T
                {
                mT(); 


                }
                break;
            case 2 :
                // T2.g:1:12: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}