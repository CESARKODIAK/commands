// $ANTLR 3.4 TJ.g 2012-02-12 21:55:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TJLexer extends Lexer {
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
    public TJ_T2 gT2;
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {gT2};
    }

    public TJLexer() {} 
    public TJLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TJLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        gT2 = new TJ_T2(input, state, this);
    }
    public String getGrammarFileName() { return "TJ.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:3:7: ( 'b' )
            // TJ.g:3:9: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:4:7: ( 'fee' )
            // TJ.g:4:9: 'fee'
            {
            match("fee"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            int _type = X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:55:2: ( 'XTest' )
            // TJ.g:55:3: 'XTest'
            {
            match("XTest"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:64:3: ( 'a' . . )
            // TJ.g:64:5: 'a' . .
            {
            match('a'); 

            matchAny(); 

            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            int _type = B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:67:3: ( 'b' ID )
            // TJ.g:67:5: 'b' ID
            {
            match('b'); 

            mID(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            int _type = C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:68:3: ( 'c' )
            // TJ.g:68:5: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TJ.g:69:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // TJ.g:69:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // TJ.g:69:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TJ.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    public void mTokens() throws RecognitionException {
        // TJ.g:1:8: ( T__12 | T__13 | X | A | B | C | ID | T2. Tokens )
        int alt2=8;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // TJ.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // TJ.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // TJ.g:1:22: X
                {
                mX(); 


                }
                break;
            case 4 :
                // TJ.g:1:24: A
                {
                mA(); 


                }
                break;
            case 5 :
                // TJ.g:1:26: B
                {
                mB(); 


                }
                break;
            case 6 :
                // TJ.g:1:28: C
                {
                mC(); 


                }
                break;
            case 7 :
                // TJ.g:1:30: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // TJ.g:1:33: T2. Tokens
                {
                gT2.mTokens(); 


                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\1\uffff\1\11\3\7\1\17\1\7\3\uffff\1\22\3\7\2\uffff\1\7\1\22\1\uffff"+
        "\1\27\1\7\1\16\1\7\1\uffff\1\7\1\uffff\1\33\1\uffff";
    static final String DFA2_eofS =
        "\34\uffff";
    static final String DFA2_minS =
        "\1\11\1\60\1\145\1\124\1\0\1\60\1\145\3\uffff\1\60\2\145\1\0\2\uffff"+
        "\1\163\1\60\1\uffff\1\60\1\163\1\60\1\164\1\uffff\1\164\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA2_maxS =
        "\2\172\1\145\1\124\1\uffff\1\172\1\145\3\uffff\1\172\2\145\1\uffff"+
        "\2\uffff\1\163\1\172\1\uffff\1\172\1\163\1\172\1\164\1\uffff\1\164"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA2_acceptS =
        "\7\uffff\1\7\1\10\1\1\4\uffff\1\4\1\6\2\uffff\1\5\4\uffff\1\2\1"+
        "\uffff\1\7\1\uffff\1\3";
    static final String DFA2_specialS =
        "\4\uffff\1\0\10\uffff\1\1\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\10\1\uffff\2\10\22\uffff\1\10\40\uffff\23\7\1\6\3\7\1\3\2"+
            "\7\4\uffff\1\7\1\uffff\1\4\1\1\1\5\2\7\1\2\24\7",
            "\12\7\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\13",
            "\1\14",
            "\60\16\12\15\7\16\32\15\4\16\1\15\1\16\32\15\uff85\16",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\20",
            "",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\23",
            "\1\24",
            "\60\16\12\25\7\16\32\25\4\16\1\25\1\16\32\25\uff85\16",
            "",
            "",
            "\1\26",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\30",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\31",
            "",
            "\1\32",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | X | A | B | C | ID | T2. Tokens );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_4 = input.LA(1);

                        s = -1;
                        if ( ((LA2_4 >= '0' && LA2_4 <= '9')||(LA2_4 >= 'A' && LA2_4 <= 'Z')||LA2_4=='_'||(LA2_4 >= 'a' && LA2_4 <= 'z')) ) {s = 13;}

                        else if ( ((LA2_4 >= '\u0000' && LA2_4 <= '/')||(LA2_4 >= ':' && LA2_4 <= '@')||(LA2_4 >= '[' && LA2_4 <= '^')||LA2_4=='`'||(LA2_4 >= '{' && LA2_4 <= '\uFFFF')) ) {s = 14;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA2_13 = input.LA(1);

                        s = -1;
                        if ( ((LA2_13 >= '0' && LA2_13 <= '9')||(LA2_13 >= 'A' && LA2_13 <= 'Z')||LA2_13=='_'||(LA2_13 >= 'a' && LA2_13 <= 'z')) ) {s = 21;}

                        else if ( ((LA2_13 >= '\u0000' && LA2_13 <= '/')||(LA2_13 >= ':' && LA2_13 <= '@')||(LA2_13 >= '[' && LA2_13 <= '^')||LA2_13=='`'||(LA2_13 >= '{' && LA2_13 <= '\uFFFF')) ) {s = 14;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}