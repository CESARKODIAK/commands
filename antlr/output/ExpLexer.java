// $ANTLR 3.4 /Users/pannous/nlp/english-script/grammar/Exp.g 2012-02-11 23:13:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExpLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int COMMENT=4;
    public static final int DIGIT=5;
    public static final int ESC=6;
    public static final int If=7;
    public static final int Integer=8;
    public static final int LETTER=9;
    public static final int LINE_COMMENT=10;
    public static final int NL=11;
    public static final int Quote=12;
    public static final int Real=13;
    public static final int Reductions=14;
    public static final int WS=15;
    public static final int Word=16;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExpLexer() {} 
    public ExpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/pannous/nlp/english-script/grammar/Exp.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:2:7: ( ':' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:2:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:3:7: ( ':=' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:3:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:4:7: ( '<' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:4:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:5:7: ( '=' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:5:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:6:7: ( '=<' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:6:9: '=<'
            {
            match("=<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:7:7: ( '==' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:7:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:8:7: ( '>' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:8:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:9:7: ( '>=' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:9:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:10:7: ( 'OK' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:10:9: 'OK'
            {
            match("OK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:11:7: ( 'a' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:11:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:12:7: ( 'above' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:12:9: 'above'
            {
            match("above"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:13:7: ( 'after' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:13:9: 'after'
            {
            match("after"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:14:7: ( 'against' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:14:9: 'against'
            {
            match("against"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:15:7: ( 'all set' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:15:9: 'all set'
            {
            match("all set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:16:7: ( 'all' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:16:9: 'all'
            {
            match("all"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:17:7: ( 'alrighty' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:17:9: 'alrighty'
            {
            match("alrighty"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:18:7: ( 'an' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:18:9: 'an'
            {
            match("an"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:19:7: ( 'and' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:19:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:20:7: ( 'any' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:20:9: 'any'
            {
            match("any"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:21:7: ( 'apart from' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:21:9: 'apart from'
            {
            match("apart from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:22:7: ( 'around' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:22:9: 'around'
            {
            match("around"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:23:7: ( 'as long as' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:23:9: 'as long as'
            {
            match("as long as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:24:7: ( 'as' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:24:9: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:25:7: ( 'aside from' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:25:9: 'aside from'
            {
            match("aside from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:26:7: ( 'at' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:26:9: 'at'
            {
            match("at"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:27:7: ( 'be' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:27:9: 'be'
            {
            match("be"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:28:7: ( 'before' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:28:9: 'before'
            {
            match("before"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:29:7: ( 'behind' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:29:9: 'behind'
            {
            match("behind"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:30:7: ( 'below' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:30:9: 'below'
            {
            match("below"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:31:7: ( 'beneath' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:31:9: 'beneath'
            {
            match("beneath"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:32:7: ( 'beside' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:32:9: 'beside'
            {
            match("beside"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:33:7: ( 'between' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:33:9: 'between'
            {
            match("between"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:34:7: ( 'bigger than' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:34:9: 'bigger than'
            {
            match("bigger than"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:35:7: ( 'but not' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:35:9: 'but not'
            {
            match("but not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:36:7: ( 'considering' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:36:9: 'considering'
            {
            match("considering"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:37:7: ( 'define' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:37:9: 'define'
            {
            match("define"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:38:7: ( 'done' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:38:9: 'done'
            {
            match("done"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:39:7: ( 'end' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:39:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:40:7: ( 'eq' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:40:9: 'eq'
            {
            match("eq"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:41:7: ( 'equals' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:41:9: 'equals'
            {
            match("equals"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:42:7: ( 'finished' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:42:9: 'finished'
            {
            match("finished"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:43:7: ( 'from' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:43:9: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:44:7: ( 'function' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:44:9: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:45:7: ( 'funny' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:45:9: 'funny'
            {
            match("funny"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:46:7: ( 'greater than' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:46:9: 'greater than'
            {
            match("greater than"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:47:7: ( 'gt' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:47:9: 'gt'
            {
            match("gt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:48:7: ( 'had' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:48:9: 'had'
            {
            match("had"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:49:7: ( 'has' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:49:9: 'has'
            {
            match("has"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:50:7: ( 'hate' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:50:9: 'hate'
            {
            match("hate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:51:7: ( 'have' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:51:9: 'have'
            {
            match("have"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:52:7: ( 'how to' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:52:9: 'how to'
            {
            match("how to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:53:7: ( 'if' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:53:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:54:7: ( 'in' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:54:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:55:7: ( 'ing' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:55:9: 'ing'
            {
            match("ing"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:56:7: ( 'instead of' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:56:9: 'instead of'
            {
            match("instead of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:57:7: ( 'into' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:57:9: 'into'
            {
            match("into"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:58:7: ( 'is' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:58:9: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:59:7: ( 'joyfully' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:59:9: 'joyfully'
            {
            match("joyfully"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:60:7: ( 'less than' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:60:9: 'less than'
            {
            match("less than"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:61:7: ( 'let' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:61:9: 'let'
            {
            match("let"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:62:7: ( 'like' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:62:9: 'like'
            {
            match("like"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:63:7: ( 'lt' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:63:9: 'lt'
            {
            match("lt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:64:7: ( 'method for' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:64:9: 'method for'
            {
            match("method for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:65:7: ( 'method' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:65:9: 'method'
            {
            match("method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:66:7: ( 'never' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:66:9: 'never'
            {
            match("never"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:67:7: ( 'of' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:67:9: 'of'
            {
            match("of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:68:7: ( 'often' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:68:9: 'often'
            {
            match("often"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:69:7: ( 'ok' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:69:9: 'ok'
            {
            match("ok"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:70:7: ( 'on' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:70:9: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:71:7: ( 'once' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:71:9: 'once'
            {
            match("once"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:72:7: ( 'onto' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:72:9: 'onto'
            {
            match("onto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:73:7: ( 'out of' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:73:9: 'out of'
            {
            match("out of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:74:7: ( 'over' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:74:9: 'over'
            {
            match("over"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:75:7: ( 'qed' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:75:9: 'qed'
            {
            match("qed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:76:7: ( 's to' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:76:9: 's to'
            {
            match("s to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:77:7: ( 's' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:77:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:78:7: ( 'set' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:78:9: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:79:7: ( 'since' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:79:9: 'since'
            {
            match("since"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:80:7: ( 'smaller than' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:80:9: 'smaller than'
            {
            match("smaller than"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:81:7: ( 'some' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:81:9: 'some'
            {
            match("some"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:82:7: ( 'stinky' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:82:9: 'stinky'
            {
            match("stinky"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:83:7: ( 'sucks' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:83:9: 'sucks'
            {
            match("sucks"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:84:7: ( 'teh' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:84:9: 'teh'
            {
            match("teh"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:85:8: ( 'that' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:85:10: 'that'
            {
            match("that"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:86:8: ( 'the' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:86:10: 'the'
            {
            match("the"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:87:8: ( 'then' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:87:10: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:88:8: ( 'these' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:88:10: 'these'
            {
            match("these"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:89:8: ( 'those' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:89:10: 'those'
            {
            match("those"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:8: ( 'through' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:10: 'through'
            {
            match("through"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:91:8: ( 'thru' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:91:10: 'thru'
            {
            match("thru"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:92:8: ( 'to' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:92:10: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:93:8: ( 'val' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:93:10: 'val'
            {
            match("val"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:94:8: ( 'value of' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:94:10: 'value of'
            {
            match("value of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:95:8: ( 'var' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:95:10: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:96:8: ( 'want' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:96:10: 'want'
            {
            match("want"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:97:8: ( 'was' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:97:10: 'was'
            {
            match("was"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:98:8: ( 'where' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:98:10: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:99:8: ( 'while' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:99:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:100:8: ( 'who' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:100:10: 'who'
            {
            match("who"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:101:8: ( 'with' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:101:10: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:102:8: ( 'without' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:102:10: 'without'
            {
            match("without"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            int _type = ESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:223:15: ( '\\\\' ( 'n' | 'r' ) )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:223:17: '\\\\' ( 'n' | 'r' )
            {
            match('\\'); 

            if ( input.LA(1)=='n'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "Quote"
    public final void mQuote() throws RecognitionException {
        try {
            int _type = Quote;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:224:7: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:9: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:13: ( options {greedy=false; } : . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\"') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:51: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:57: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\'') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:224:85: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Quote"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:229:4: ( 'unless' | 'in case that' | 'if' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='u') ) {
                alt4=1;
            }
            else if ( (LA4_0=='i') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='n') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='f') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:229:6: 'unless'
                    {
                    match("unless"); 



                    }
                    break;
                case 2 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:229:15: 'in case that'
                    {
                    match("in case that"); 



                    }
                    break;
                case 3 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:229:30: 'if'
                    {
                    match("if"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Word"
    public final void mWord() throws RecognitionException {
        try {
            int _type = Word;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:245:2: ( ( LETTER )+ )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:245:4: ( LETTER )+
            {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:245:4: ( LETTER )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Word"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:254:19: ( '0' .. '9' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:255:9: ( ( DIGIT )+ )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:255:13: ( DIGIT )+
            {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:255:13: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:256:6: ( ( DIGIT )* '.' ( DIGIT )+ )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:256:8: ( DIGIT )* '.' ( DIGIT )+
            {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:256:8: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    break loop7;
                }
            } while (true);


            match('.'); 

            // /Users/pannous/nlp/english-script/grammar/Exp.g:256:19: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:259:2: ( '\\r' | '\\n' | '!' | '?' | ';' | '. ' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt9=1;
                }
                break;
            case '\n':
                {
                alt9=2;
                }
                break;
            case '!':
                {
                alt9=3;
                }
                break;
            case '?':
                {
                alt9=4;
                }
                break;
            case ';':
                {
                alt9=5;
                }
                break;
            case '.':
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:9: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:14: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:18: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 5 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:22: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 6 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:259:26: '. '
                    {
                    match(". "); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:264:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:271:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:271:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /Users/pannous/nlp/english-script/grammar/Exp.g:271:14: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:271:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match("*/"); 



            System.out.println("found comment "+getText());_channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "Reductions"
    public final void mReductions() throws RecognitionException {
        try {
            int _type = Reductions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:276:2: ( ( 'here is' | 'lets see' | 'please' ) )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:276:4: ( 'here is' | 'lets see' | 'please' )
            {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:276:4: ( 'here is' | 'lets see' | 'please' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'h':
                {
                alt11=1;
                }
                break;
            case 'l':
                {
                alt11=2;
                }
                break;
            case 'p':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:276:5: 'here is'
                    {
                    match("here is"); 



                    }
                    break;
                case 2 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:276:15: 'lets see'
                    {
                    match("lets see"); 



                    }
                    break;
                case 3 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:276:26: 'please'
                    {
                    match("please"); 



                    }
                    break;

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
    // $ANTLR end "Reductions"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:279:5: ( ( '//' | '#' | '--' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:279:7: ( '//' | '#' | '--' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:279:7: ( '//' | '#' | '--' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '/':
                {
                alt12=1;
                }
                break;
            case '#':
                {
                alt12=2;
                }
                break;
            case '-':
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:279:8: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 2 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:279:15: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 3 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:279:21: '--'
                    {
                    match("--"); 



                    }
                    break;

            }


            // /Users/pannous/nlp/english-script/grammar/Exp.g:279:27: (~ ( '\\n' | '\\r' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop13;
                }
            } while (true);


            // /Users/pannous/nlp/english-script/grammar/Exp.g:279:41: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:279:41: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/pannous/nlp/english-script/grammar/Exp.g:283:9: ( ( ' ' | '\\t' | '\\u000C' | '\\r' ) )
            // /Users/pannous/nlp/english-script/grammar/Exp.g:283:13: ( ' ' | '\\t' | '\\u000C' | '\\r' )
            {
            if ( input.LA(1)=='\t'||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
        // /Users/pannous/nlp/english-script/grammar/Exp.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | ESC | Quote | If | Word | Integer | Real | NL | COMMENT | Reductions | LINE_COMMENT | WS )
        int alt15=112;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:148: T__40
                {
                mT__40(); 


                }
                break;
            case 25 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:154: T__41
                {
                mT__41(); 


                }
                break;
            case 26 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:160: T__42
                {
                mT__42(); 


                }
                break;
            case 27 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:166: T__43
                {
                mT__43(); 


                }
                break;
            case 28 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:172: T__44
                {
                mT__44(); 


                }
                break;
            case 29 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:178: T__45
                {
                mT__45(); 


                }
                break;
            case 30 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:184: T__46
                {
                mT__46(); 


                }
                break;
            case 31 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:190: T__47
                {
                mT__47(); 


                }
                break;
            case 32 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:196: T__48
                {
                mT__48(); 


                }
                break;
            case 33 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:202: T__49
                {
                mT__49(); 


                }
                break;
            case 34 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:208: T__50
                {
                mT__50(); 


                }
                break;
            case 35 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:214: T__51
                {
                mT__51(); 


                }
                break;
            case 36 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:220: T__52
                {
                mT__52(); 


                }
                break;
            case 37 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:226: T__53
                {
                mT__53(); 


                }
                break;
            case 38 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:232: T__54
                {
                mT__54(); 


                }
                break;
            case 39 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:238: T__55
                {
                mT__55(); 


                }
                break;
            case 40 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:244: T__56
                {
                mT__56(); 


                }
                break;
            case 41 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:250: T__57
                {
                mT__57(); 


                }
                break;
            case 42 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:256: T__58
                {
                mT__58(); 


                }
                break;
            case 43 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:262: T__59
                {
                mT__59(); 


                }
                break;
            case 44 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:268: T__60
                {
                mT__60(); 


                }
                break;
            case 45 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:274: T__61
                {
                mT__61(); 


                }
                break;
            case 46 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:280: T__62
                {
                mT__62(); 


                }
                break;
            case 47 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:286: T__63
                {
                mT__63(); 


                }
                break;
            case 48 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:292: T__64
                {
                mT__64(); 


                }
                break;
            case 49 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:298: T__65
                {
                mT__65(); 


                }
                break;
            case 50 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:304: T__66
                {
                mT__66(); 


                }
                break;
            case 51 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:310: T__67
                {
                mT__67(); 


                }
                break;
            case 52 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:316: T__68
                {
                mT__68(); 


                }
                break;
            case 53 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:322: T__69
                {
                mT__69(); 


                }
                break;
            case 54 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:328: T__70
                {
                mT__70(); 


                }
                break;
            case 55 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:334: T__71
                {
                mT__71(); 


                }
                break;
            case 56 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:340: T__72
                {
                mT__72(); 


                }
                break;
            case 57 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:346: T__73
                {
                mT__73(); 


                }
                break;
            case 58 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:352: T__74
                {
                mT__74(); 


                }
                break;
            case 59 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:358: T__75
                {
                mT__75(); 


                }
                break;
            case 60 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:364: T__76
                {
                mT__76(); 


                }
                break;
            case 61 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:370: T__77
                {
                mT__77(); 


                }
                break;
            case 62 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:376: T__78
                {
                mT__78(); 


                }
                break;
            case 63 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:382: T__79
                {
                mT__79(); 


                }
                break;
            case 64 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:388: T__80
                {
                mT__80(); 


                }
                break;
            case 65 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:394: T__81
                {
                mT__81(); 


                }
                break;
            case 66 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:400: T__82
                {
                mT__82(); 


                }
                break;
            case 67 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:406: T__83
                {
                mT__83(); 


                }
                break;
            case 68 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:412: T__84
                {
                mT__84(); 


                }
                break;
            case 69 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:418: T__85
                {
                mT__85(); 


                }
                break;
            case 70 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:424: T__86
                {
                mT__86(); 


                }
                break;
            case 71 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:430: T__87
                {
                mT__87(); 


                }
                break;
            case 72 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:436: T__88
                {
                mT__88(); 


                }
                break;
            case 73 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:442: T__89
                {
                mT__89(); 


                }
                break;
            case 74 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:448: T__90
                {
                mT__90(); 


                }
                break;
            case 75 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:454: T__91
                {
                mT__91(); 


                }
                break;
            case 76 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:460: T__92
                {
                mT__92(); 


                }
                break;
            case 77 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:466: T__93
                {
                mT__93(); 


                }
                break;
            case 78 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:472: T__94
                {
                mT__94(); 


                }
                break;
            case 79 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:478: T__95
                {
                mT__95(); 


                }
                break;
            case 80 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:484: T__96
                {
                mT__96(); 


                }
                break;
            case 81 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:490: T__97
                {
                mT__97(); 


                }
                break;
            case 82 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:496: T__98
                {
                mT__98(); 


                }
                break;
            case 83 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:502: T__99
                {
                mT__99(); 


                }
                break;
            case 84 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:508: T__100
                {
                mT__100(); 


                }
                break;
            case 85 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:515: T__101
                {
                mT__101(); 


                }
                break;
            case 86 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:522: T__102
                {
                mT__102(); 


                }
                break;
            case 87 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:529: T__103
                {
                mT__103(); 


                }
                break;
            case 88 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:536: T__104
                {
                mT__104(); 


                }
                break;
            case 89 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:543: T__105
                {
                mT__105(); 


                }
                break;
            case 90 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:550: T__106
                {
                mT__106(); 


                }
                break;
            case 91 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:557: T__107
                {
                mT__107(); 


                }
                break;
            case 92 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:564: T__108
                {
                mT__108(); 


                }
                break;
            case 93 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:571: T__109
                {
                mT__109(); 


                }
                break;
            case 94 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:578: T__110
                {
                mT__110(); 


                }
                break;
            case 95 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:585: T__111
                {
                mT__111(); 


                }
                break;
            case 96 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:592: T__112
                {
                mT__112(); 


                }
                break;
            case 97 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:599: T__113
                {
                mT__113(); 


                }
                break;
            case 98 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:606: T__114
                {
                mT__114(); 


                }
                break;
            case 99 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:613: T__115
                {
                mT__115(); 


                }
                break;
            case 100 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:620: T__116
                {
                mT__116(); 


                }
                break;
            case 101 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:627: T__117
                {
                mT__117(); 


                }
                break;
            case 102 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:634: ESC
                {
                mESC(); 


                }
                break;
            case 103 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:638: Quote
                {
                mQuote(); 


                }
                break;
            case 104 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:644: If
                {
                mIf(); 


                }
                break;
            case 105 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:647: Word
                {
                mWord(); 


                }
                break;
            case 106 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:652: Integer
                {
                mInteger(); 


                }
                break;
            case 107 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:660: Real
                {
                mReal(); 


                }
                break;
            case 108 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:665: NL
                {
                mNL(); 


                }
                break;
            case 109 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:668: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 110 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:676: Reductions
                {
                mReductions(); 


                }
                break;
            case 111 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:687: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 112 :
                // /Users/pannous/nlp/english-script/grammar/Exp.g:1:700: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\46\1\uffff\1\51\1\53\1\42\1\66\16\42\1\135\3\42\2\uffff"+
        "\2\42\1\147\16\uffff\1\152\4\42\1\162\2\42\1\167\1\170\1\uffff\1"+
        "\177\6\42\1\u0087\4\42\1\u008c\3\42\1\u0093\1\u0098\1\u0099\3\42"+
        "\1\u009e\2\42\1\u00a2\1\u00a3\1\u00a6\3\42\1\uffff\6\42\1\uffff"+
        "\2\42\1\u00b5\6\42\4\uffff\3\42\1\u00c4\1\42\1\u00c6\1\u00c7\1\uffff"+
        "\2\42\1\uffff\1\42\2\uffff\6\42\1\uffff\5\42\1\u00d6\1\42\1\uffff"+
        "\4\42\1\uffff\1\u00dd\1\u00de\4\42\1\uffff\1\u00e3\2\42\3\uffff"+
        "\2\42\1\u00e9\1\42\1\uffff\3\42\2\uffff\2\42\1\uffff\2\42\1\u00f2"+
        "\1\u00f3\5\42\1\u00f9\1\42\1\u00fd\2\42\1\uffff\1\u0102\1\u0103"+
        "\1\42\1\u0105\2\42\1\u0108\6\42\2\uffff\1\42\2\uffff\12\42\1\uffff"+
        "\2\42\1\u011c\1\uffff\2\42\1\u011f\3\42\2\uffff\1\u0123\1\u0124"+
        "\1\uffff\1\42\1\uffff\1\42\1\u0127\3\42\1\uffff\1\u012a\3\42\1\u012e"+
        "\1\u012f\1\uffff\1\u0130\2\uffff\2\42\1\u0133\2\42\1\uffff\1\u0136"+
        "\1\u0137\1\42\1\uffff\2\42\1\u013b\1\42\2\uffff\1\u013d\1\uffff"+
        "\2\42\1\uffff\1\u0141\2\42\1\u0144\1\u0145\7\42\1\u014d\6\42\1\uffff"+
        "\2\42\1\uffff\1\42\1\u0157\1\42\3\uffff\1\42\1\uffff\1\42\2\uffff"+
        "\1\42\1\u015c\1\u015d\3\uffff\1\u015e\1\42\1\uffff\1\42\1\u0161"+
        "\2\uffff\1\u0162\1\u0163\1\42\1\uffff\1\42\1\uffff\1\u0166\1\u0167"+
        "\1\42\1\uffff\2\42\2\uffff\2\42\1\uffff\1\u016d\1\uffff\1\u016e"+
        "\1\u016f\1\uffff\1\42\1\u0171\3\42\1\u0175\1\u0176\2\42\1\uffff"+
        "\3\42\1\u017d\3\uffff\1\42\1\u017f\3\uffff\1\42\3\uffff\1\42\1\u0097"+
        "\1\uffff\1\u0182\1\42\3\uffff\1\u0184\1\uffff\1\u0185\1\uffff\1"+
        "\42\2\uffff\5\42\2\uffff\1\42\1\uffff\1\u018d\1\u018e\1\uffff\1"+
        "\u018f\2\uffff\1\42\1\u0191\1\u0192\2\uffff\1\u0193\4\uffff\1\42"+
        "\3\uffff\1\42\1\u0196\1\uffff";
    static final String DFA15_eofS =
        "\u0197\uffff";
    static final String DFA15_minS =
        "\1\11\1\75\1\uffff\1\74\1\75\1\113\1\44\1\145\1\157\1\145\1\156"+
        "\1\151\1\162\1\141\1\146\1\157\3\145\1\146\1\145\1\40\1\145\2\141"+
        "\2\uffff\1\156\1\154\1\56\1\40\2\uffff\1\52\12\uffff\1\44\1\157"+
        "\1\164\1\141\1\154\1\44\1\141\1\157\1\40\1\44\1\uffff\1\44\1\147"+
        "\1\164\1\156\1\146\1\156\1\144\1\44\1\156\1\157\1\156\1\145\1\44"+
        "\1\144\1\167\1\162\1\44\1\40\1\44\1\171\1\163\1\153\1\44\1\164\1"+
        "\166\3\44\1\164\1\145\1\144\1\uffff\1\164\1\156\1\141\1\155\1\151"+
        "\1\143\1\uffff\1\150\1\141\1\44\1\154\1\156\1\145\1\164\1\154\1"+
        "\145\4\uffff\1\166\1\145\1\151\1\40\1\151\2\44\1\uffff\1\162\1\165"+
        "\1\uffff\1\144\2\uffff\1\157\1\151\1\157\1\145\1\151\1\167\1\uffff"+
        "\1\147\1\40\1\163\1\151\1\145\1\44\1\141\1\uffff\1\151\1\155\1\143"+
        "\1\141\1\uffff\2\44\2\145\1\40\1\145\1\uffff\1\44\1\164\1\157\3"+
        "\uffff\1\146\1\163\1\44\1\145\1\uffff\1\150\2\145\2\uffff\1\145"+
        "\1\157\1\uffff\1\40\1\162\2\44\1\143\1\154\1\145\1\156\1\153\1\44"+
        "\1\164\1\44\1\163\1\157\1\uffff\2\44\1\164\1\44\1\162\1\154\1\44"+
        "\1\150\1\145\1\141\1\145\1\162\1\156\2\uffff\1\147\2\uffff\1\164"+
        "\1\156\1\145\1\162\1\156\1\167\1\141\1\144\2\145\1\uffff\1\151\1"+
        "\156\1\44\1\uffff\1\154\1\163\1\44\1\164\1\171\1\164\2\uffff\2\44"+
        "\1\uffff\1\40\1\uffff\1\145\1\44\1\165\2\40\1\uffff\1\44\1\157\1"+
        "\162\1\156\2\44\1\uffff\1\44\2\uffff\1\145\1\154\1\44\1\153\1\163"+
        "\1\uffff\2\44\1\145\1\uffff\1\145\1\165\1\44\1\145\2\uffff\1\44"+
        "\1\uffff\2\145\1\uffff\1\44\2\163\2\44\1\163\1\150\1\40\1\144\1"+
        "\40\1\145\1\144\1\44\1\164\2\145\1\162\1\144\1\145\1\uffff\1\163"+
        "\1\150\1\uffff\1\151\1\44\1\145\3\uffff\1\141\1\uffff\1\154\2\uffff"+
        "\1\144\2\44\3\uffff\1\44\1\145\1\uffff\1\171\1\44\2\uffff\2\44\1"+
        "\147\1\uffff\1\40\1\uffff\2\44\1\165\1\uffff\1\163\1\145\2\uffff"+
        "\2\164\1\uffff\1\44\1\uffff\2\44\1\uffff\1\150\1\44\1\156\1\40\1"+
        "\145\2\44\1\145\1\157\1\uffff\1\162\1\144\1\154\1\40\3\uffff\1\162"+
        "\1\44\3\uffff\1\150\3\uffff\1\164\1\44\1\uffff\1\44\1\171\3\uffff"+
        "\1\44\1\uffff\1\44\1\uffff\1\162\2\uffff\1\144\1\156\2\40\1\171"+
        "\2\uffff\1\40\1\uffff\2\44\1\uffff\1\44\2\uffff\1\151\2\44\2\uffff"+
        "\1\44\4\uffff\1\156\3\uffff\1\147\1\44\1\uffff";
    static final String DFA15_maxS =
        "\1\172\1\75\1\uffff\2\75\1\113\1\172\1\165\2\157\1\161\1\165\1\164"+
        "\1\157\1\163\1\157\1\164\2\145\1\166\1\145\1\172\1\157\1\141\1\151"+
        "\2\uffff\1\156\1\154\2\71\2\uffff\1\57\12\uffff\1\172\1\157\1\164"+
        "\1\141\1\162\1\172\1\141\1\157\2\172\1\uffff\1\172\1\147\1\164\1"+
        "\156\1\146\1\156\1\144\1\172\1\156\1\157\1\156\1\145\1\172\1\166"+
        "\1\167\1\162\3\172\1\171\1\164\1\153\1\172\1\164\1\166\3\172\1\164"+
        "\1\145\1\144\1\uffff\1\164\1\156\1\141\1\155\1\151\1\143\1\uffff"+
        "\1\150\1\162\1\172\1\162\1\163\1\157\1\164\1\154\1\145\4\uffff\1"+
        "\166\1\145\1\151\1\172\1\151\2\172\1\uffff\1\162\1\165\1\uffff\1"+
        "\144\2\uffff\1\157\1\151\1\157\1\145\1\151\1\167\1\uffff\1\147\1"+
        "\40\1\163\1\151\1\145\1\172\1\141\1\uffff\1\151\1\155\1\156\1\141"+
        "\1\uffff\2\172\2\145\1\40\1\145\1\uffff\1\172\1\164\1\157\3\uffff"+
        "\1\146\1\163\1\172\1\145\1\uffff\1\150\2\145\2\uffff\1\145\1\157"+
        "\1\uffff\1\40\1\162\2\172\1\143\1\154\1\145\1\156\1\153\1\172\1"+
        "\164\1\172\1\163\1\165\1\uffff\2\172\1\164\1\172\1\162\1\154\1\172"+
        "\1\150\1\145\1\141\1\145\1\162\1\156\2\uffff\1\147\2\uffff\1\164"+
        "\1\156\1\145\1\162\1\156\1\167\1\141\1\144\2\145\1\uffff\1\151\1"+
        "\156\1\172\1\uffff\1\154\1\163\1\172\1\164\1\171\1\164\2\uffff\2"+
        "\172\1\uffff\1\40\1\uffff\1\145\1\172\1\165\2\40\1\uffff\1\172\1"+
        "\157\1\162\1\156\2\172\1\uffff\1\172\2\uffff\1\145\1\154\1\172\1"+
        "\153\1\163\1\uffff\2\172\1\145\1\uffff\1\145\1\165\1\172\1\145\2"+
        "\uffff\1\172\1\uffff\2\145\1\uffff\1\172\2\163\2\172\1\163\1\150"+
        "\1\40\1\144\1\40\1\145\1\144\1\172\1\164\2\145\1\162\1\144\1\145"+
        "\1\uffff\1\163\1\150\1\uffff\1\151\1\172\1\145\3\uffff\1\141\1\uffff"+
        "\1\154\2\uffff\1\144\2\172\3\uffff\1\172\1\145\1\uffff\1\171\1\172"+
        "\2\uffff\2\172\1\147\1\uffff\1\40\1\uffff\2\172\1\165\1\uffff\1"+
        "\163\1\145\2\uffff\2\164\1\uffff\1\172\1\uffff\2\172\1\uffff\1\150"+
        "\1\172\1\156\1\40\1\145\2\172\1\145\1\157\1\uffff\1\162\1\144\1"+
        "\154\1\172\3\uffff\1\162\1\172\3\uffff\1\150\3\uffff\1\164\1\172"+
        "\1\uffff\1\172\1\171\3\uffff\1\172\1\uffff\1\172\1\uffff\1\162\2"+
        "\uffff\1\144\1\156\2\40\1\171\2\uffff\1\40\1\uffff\2\172\1\uffff"+
        "\1\172\2\uffff\1\151\2\172\2\uffff\1\172\4\uffff\1\156\3\uffff\1"+
        "\147\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\26\uffff\1\146\1\147\4\uffff\2\154\1\uffff\1\151\1"+
        "\157\1\160\1\2\1\1\1\5\1\6\1\4\1\10\1\7\12\uffff\1\12\37\uffff\1"+
        "\113\6\uffff\1\114\11\uffff\1\152\1\153\1\155\1\11\7\uffff\1\21"+
        "\2\uffff\1\26\1\uffff\1\27\1\31\6\uffff\1\32\7\uffff\1\47\4\uffff"+
        "\1\56\6\uffff\1\64\3\uffff\1\150\1\65\1\71\4\uffff\1\76\3\uffff"+
        "\1\102\1\104\2\uffff\1\105\16\uffff\1\133\15\uffff\1\16\1\17\1\uffff"+
        "\1\22\1\23\12\uffff\1\42\3\uffff\1\46\6\uffff\1\57\1\60\2\uffff"+
        "\1\63\1\uffff\1\66\5\uffff\1\74\6\uffff\1\110\1\uffff\1\112\1\115"+
        "\5\uffff\1\123\3\uffff\1\125\4\uffff\1\134\1\136\1\uffff\1\140\2"+
        "\uffff\1\143\23\uffff\1\45\2\uffff\1\52\3\uffff\1\61\1\62\1\156"+
        "\1\uffff\1\70\1\uffff\1\73\1\75\3\uffff\1\106\1\107\1\111\2\uffff"+
        "\1\120\2\uffff\1\124\1\126\3\uffff\1\132\1\uffff\1\137\3\uffff\1"+
        "\144\2\uffff\1\13\1\14\2\uffff\1\24\1\uffff\1\30\2\uffff\1\35\11"+
        "\uffff\1\54\4\uffff\1\101\1\103\1\116\2\uffff\1\122\1\127\1\130"+
        "\1\uffff\1\135\1\141\1\142\2\uffff\1\151\2\uffff\1\25\1\33\1\34"+
        "\1\uffff\1\37\1\uffff\1\41\1\uffff\1\44\1\50\5\uffff\1\77\1\100"+
        "\1\uffff\1\121\2\uffff\1\15\1\uffff\1\36\1\40\3\uffff\1\55\1\67"+
        "\1\uffff\1\117\1\131\1\145\1\20\1\uffff\1\51\1\53\1\72\2\uffff\1"+
        "\43";
    static final String DFA15_specialS =
        "\u0197\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\44\1\40\1\uffff\1\44\1\37\22\uffff\1\44\1\40\1\32\1\43\1"+
            "\42\2\uffff\1\32\5\uffff\1\43\1\36\1\41\12\35\1\1\1\40\1\2\1"+
            "\3\1\4\1\40\1\uffff\16\42\1\5\13\42\1\uffff\1\31\2\uffff\1\42"+
            "\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\42"+
            "\1\20\1\21\1\22\1\23\1\34\1\24\1\42\1\25\1\26\1\33\1\27\1\30"+
            "\3\42",
            "\1\45",
            "",
            "\1\47\1\50",
            "\1\52",
            "\1\54",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\1\42\1\55\3\42\1"+
            "\56\1\57\4\42\1\60\1\42\1\61\1\42\1\62\1\42\1\63\1\64\1\65\6"+
            "\42",
            "\1\67\3\uffff\1\70\13\uffff\1\71",
            "\1\72",
            "\1\73\11\uffff\1\74",
            "\1\75\2\uffff\1\76",
            "\1\77\10\uffff\1\100\2\uffff\1\101",
            "\1\102\1\uffff\1\103",
            "\1\104\3\uffff\1\106\11\uffff\1\105",
            "\1\107\7\uffff\1\110\4\uffff\1\111",
            "\1\112",
            "\1\113\3\uffff\1\114\12\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120\4\uffff\1\121\2\uffff\1\122\6\uffff\1\123\1\124",
            "\1\125",
            "\1\126\3\uffff\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\4\42"+
            "\1\127\3\42\1\130\3\42\1\131\1\42\1\132\4\42\1\133\1\134\5\42",
            "\1\136\2\uffff\1\137\6\uffff\1\140",
            "\1\141",
            "\1\142\6\uffff\1\143\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\150\1\uffff\12\35",
            "\1\40\17\uffff\12\150",
            "",
            "",
            "\1\151\4\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\5\uffff\1\157",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\160\24\42"+
            "\1\161\1\42",
            "\1\163",
            "\1\164",
            "\1\165\3\uffff\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\10"+
            "\42\1\166\21\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\5\42\1\171\1\42\1"+
            "\172\3\42\1\173\1\42\1\174\4\42\1\175\1\176\6\42",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\u0086\5\42",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008d\16\uffff\1\u008e\1\u008f\1\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0097\3\uffff\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\6"+
            "\42\1\u0094\13\42\1\u0095\1\u0096\6\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009a",
            "\1\u009b\1\u009c",
            "\1\u009d",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009f",
            "\1\u00a0",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u00a1\6\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u00a4\20\42"+
            "\1\u00a5\6\42",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1\3\uffff\1\u00b2\11\uffff\1\u00b3\2\uffff\1\u00b4",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b6\5\uffff\1\u00b7",
            "\1\u00b8\4\uffff\1\u00b9",
            "\1\u00ba\3\uffff\1\u00bb\5\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\3\uffff\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42",
            "\1\u00c5",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\12\uffff\1\u00db",
            "\1\u00dc",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00e8\7\42",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00fa",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00fb\4\42"+
            "\1\u00fc\7\42",
            "\1\u00fe",
            "\1\u00ff\5\uffff\1\u0100",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\u0101\5\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0104",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0106",
            "\1\u0107",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "",
            "\1\u010f",
            "",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0128",
            "\1\u0129",
            "\1\u0125",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u013c",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u0140\13"+
            "\42",
            "\1\u0142",
            "\1\u0143",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0158",
            "",
            "",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "",
            "",
            "\1\u015b",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0164",
            "",
            "\1\u0165",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0168",
            "",
            "\1\u0169",
            "\1\u016a",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0170",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c\3\uffff\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42",
            "",
            "",
            "",
            "\1\u017e",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u0180",
            "",
            "",
            "",
            "\1\u0181",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0183",
            "",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0186",
            "",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "",
            "",
            "\1\u018c",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0190",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\1\u0194",
            "",
            "",
            "",
            "\1\u0195",
            "\1\42\34\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | ESC | Quote | If | Word | Integer | Real | NL | COMMENT | Reductions | LINE_COMMENT | WS );";
        }
    }
 

}