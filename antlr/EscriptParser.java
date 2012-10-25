// $ANTLR 3.4 Escript.g 2012-02-12 13:51:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Attribute", "Be", "COMMENT", "Comparation", "DIGIT", "ESC", "Have", "If", "Integer", "LETTER", "LINE_COMMENT", "NL", "Preposition", "Quote", "Real", "Reductions", "The", "Verb", "WS", "Word", "':'", "'OK'", "'all set'", "'alrighty'", "'as long as'", "'bash'", "'define'", "'done'", "'end'", "'finished'", "'function'", "'funny'", "'hate'", "'how to'", "'if'", "'ing'", "'joyfully'", "'let'", "'like'", "'method for'", "'method'", "'never'", "'of'", "'often'", "'ok'", "'once'", "'qed'", "'s to'", "'s'", "'set'", "'stinky'", "'that'", "'then'", "'until'", "'val'", "'value of'", "'var'", "'want'", "'where'", "'while'", "'who'"
    };

    public static final int EOF=-1;
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
    public static final int Attribute=4;
    public static final int Be=5;
    public static final int COMMENT=6;
    public static final int Comparation=7;
    public static final int DIGIT=8;
    public static final int ESC=9;
    public static final int Have=10;
    public static final int If=11;
    public static final int Integer=12;
    public static final int LETTER=13;
    public static final int LINE_COMMENT=14;
    public static final int NL=15;
    public static final int Preposition=16;
    public static final int Quote=17;
    public static final int Real=18;
    public static final int Reductions=19;
    public static final int The=20;
    public static final int Verb=21;
    public static final int WS=22;
    public static final int Word=23;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EscriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EscriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EscriptParser.tokenNames; }
    public String getGrammarFileName() { return "Escript.g"; }


            String file="~/data/base/lang/english.words.sqlite3.db";
            static Runtime runtime=Runtime.getRuntime();
            
            public boolean testSql(String word, String type){
                    try{
                    String query=" 'SELECT * FROM nouns WHERE word=\""+word+"\"'";
                    String cmd="sqlite3 "+file+query;
                    Process p =runtime.exec(cmd);
                    }catch(Exception e){};
                    return false;
                    }
                    
             public static void pp(Object x){
                    System.out.println(x);
             }                
     


    // $ANTLR start "ruby_action"
    // Escript.g:31:1: ruby_action : bash quote ;
    public final void ruby_action() throws RecognitionException {
        try {
            // Escript.g:31:12: ( bash quote )
            // Escript.g:32:2: bash quote
            {
            pushFollow(FOLLOW_bash_in_ruby_action44);
            bash();

            state._fsp--;


            pushFollow(FOLLOW_quote_in_ruby_action46);
            quote();

            state._fsp--;


            runtime.exec( $quote.getText());

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
    // $ANTLR end "ruby_action"



    // $ANTLR start "bash"
    // Escript.g:36:1: bash : 'bash' ;
    public final void bash() throws RecognitionException {
        try {
            // Escript.g:36:5: ( 'bash' )
            // Escript.g:36:7: 'bash'
            {
            match(input,29,FOLLOW_29_in_bash58); 

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
    // $ANTLR end "bash"



    // $ANTLR start "parse"
    // Escript.g:40:1: parse returns [String value] : (exp= statements |exp= action | EOF );
    public final String parse() throws RecognitionException {
        String value = null;


        try {
            // Escript.g:41:2: (exp= statements |exp= action | EOF )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // Escript.g:41:4: exp= statements
                    {
                    pushFollow(FOLLOW_statements_in_parse75);
                    statements();

                    state._fsp--;


                    value = exp.getText();pp(value);

                    }
                    break;
                case 2 :
                    // Escript.g:42:4: exp= action
                    {
                    pushFollow(FOLLOW_action_in_parse84);
                    action();

                    state._fsp--;


                    value = exp.getText();pp(value);

                    }
                    break;
                case 3 :
                    // Escript.g:43:3: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_parse89); 

                    pp("done");

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
        return value;
    }
    // $ANTLR end "parse"



    // $ANTLR start "act0"
    // Escript.g:45:1: act0 : ( action | statements );
    public final void act0() throws RecognitionException {
        try {
            // Escript.g:45:6: ( action | statements )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // Escript.g:45:8: action
                    {
                    pushFollow(FOLLOW_action_in_act099);
                    action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:45:15: statements
                    {
                    pushFollow(FOLLOW_statements_in_act0101);
                    statements();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "act0"



    // $ANTLR start "statements"
    // Escript.g:47:1: statements : ( ( definition )* | block );
    public final void statements() throws RecognitionException {
        try {
            // Escript.g:48:3: ( ( definition )* | block )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 30:
            case 34:
            case 37:
            case 43:
            case 44:
                {
                alt4=1;
                }
                break;
            case EOF:
                {
                alt4=1;
                }
                break;
            case The:
            case Verb:
            case Word:
            case 29:
            case 35:
            case 41:
            case 53:
            case 58:
            case 59:
            case 60:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Escript.g:48:3: ( definition )*
                    {
                    // Escript.g:48:3: ( definition )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==30||LA3_0==34||LA3_0==37||(LA3_0 >= 43 && LA3_0 <= 44)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Escript.g:48:3: definition
                    	    {
                    	    pushFollow(FOLLOW_definition_in_statements110);
                    	    definition();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Escript.g:48:15: block
                    {
                    pushFollow(FOLLOW_block_in_statements113);
                    block();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "statements"



    // $ANTLR start "block"
    // Escript.g:50:1: block : ( expression ( NL )+ )* ;
    public final void block() throws RecognitionException {
        try {
            // Escript.g:51:3: ( ( expression ( NL )+ )* )
            // Escript.g:51:5: ( expression ( NL )+ )*
            {
            // Escript.g:51:5: ( expression ( NL )+ )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= The && LA6_0 <= Verb)||LA6_0==Word||LA6_0==29||LA6_0==35||LA6_0==41||LA6_0==53||(LA6_0 >= 58 && LA6_0 <= 60)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Escript.g:51:6: expression ( NL )+
            	    {
            	    pushFollow(FOLLOW_expression_in_block124);
            	    expression();

            	    state._fsp--;


            	    // Escript.g:51:17: ( NL )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==NL) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // Escript.g:51:17: NL
            	    	    {
            	    	    match(input,NL,FOLLOW_NL_in_block126); 

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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "block"



    // $ANTLR start "expression"
    // Escript.g:53:1: expression : action ;
    public final void expression() throws RecognitionException {
        try {
            // Escript.g:54:2: ( action )
            // Escript.g:54:4: action
            {
            pushFollow(FOLLOW_action_in_expression139);
            action();

            state._fsp--;


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
    // $ANTLR end "expression"



    // $ANTLR start "definition"
    // Escript.g:56:1: definition : method verb ( endNode )? ( arg )* ( ':' )? NL block done ;
    public final void definition() throws RecognitionException {
        try {
            // Escript.g:57:2: ( method verb ( endNode )? ( arg )* ( ':' )? NL block done )
            // Escript.g:57:3: method verb ( endNode )? ( arg )* ( ':' )? NL block done
            {
            pushFollow(FOLLOW_method_in_definition148);
            method();

            state._fsp--;


            pushFollow(FOLLOW_verb_in_definition150);
            verb();

            state._fsp--;


            // Escript.g:57:15: ( endNode )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==The||LA7_0==Word||LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Escript.g:57:15: endNode
                    {
                    pushFollow(FOLLOW_endNode_in_definition152);
                    endNode();

                    state._fsp--;


                    }
                    break;

            }


            // Escript.g:57:24: ( arg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Preposition) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Escript.g:57:24: arg
            	    {
            	    pushFollow(FOLLOW_arg_in_definition155);
            	    arg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // Escript.g:57:29: ( ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Escript.g:57:29: ':'
                    {
                    match(input,24,FOLLOW_24_in_definition158); 

                    }
                    break;

            }


            match(input,NL,FOLLOW_NL_in_definition161); 

            pushFollow(FOLLOW_block_in_definition163);
            block();

            state._fsp--;


            pushFollow(FOLLOW_done_in_definition165);
            done();

            state._fsp--;


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
    // $ANTLR end "definition"



    // $ANTLR start "if_then"
    // Escript.g:60:1: if_then : ( 'if' condition 'then' action | If condition ( 'then' )? NL block done );
    public final void if_then() throws RecognitionException {
        try {
            // Escript.g:61:2: ( 'if' condition 'then' action | If condition ( 'then' )? NL block done )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==If) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Escript.g:61:4: 'if' condition 'then' action
                    {
                    match(input,38,FOLLOW_38_in_if_then179); 

                    pushFollow(FOLLOW_condition_in_if_then181);
                    condition();

                    state._fsp--;


                    match(input,56,FOLLOW_56_in_if_then183); 

                    pushFollow(FOLLOW_action_in_if_then185);
                    action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:62:4: If condition ( 'then' )? NL block done
                    {
                    match(input,If,FOLLOW_If_in_if_then190); 

                    pushFollow(FOLLOW_condition_in_if_then192);
                    condition();

                    state._fsp--;


                    // Escript.g:62:17: ( 'then' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==56) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Escript.g:62:17: 'then'
                            {
                            match(input,56,FOLLOW_56_in_if_then194); 

                            }
                            break;

                    }


                    match(input,NL,FOLLOW_NL_in_if_then197); 

                    pushFollow(FOLLOW_block_in_if_then199);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_done_in_if_then201);
                    done();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "if_then"



    // $ANTLR start "once"
    // Escript.g:65:1: once : 'once' condition ( 'then' )? action ;
    public final void once() throws RecognitionException {
        try {
            // Escript.g:66:2: ( 'once' condition ( 'then' )? action )
            // Escript.g:66:4: 'once' condition ( 'then' )? action
            {
            match(input,49,FOLLOW_49_in_once211); 

            pushFollow(FOLLOW_condition_in_once213);
            condition();

            state._fsp--;


            // Escript.g:66:21: ( 'then' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Escript.g:66:21: 'then'
                    {
                    match(input,56,FOLLOW_56_in_once215); 

                    }
                    break;

            }


            pushFollow(FOLLOW_action_in_once218);
            action();

            state._fsp--;


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
    // $ANTLR end "once"



    // $ANTLR start "action"
    // Escript.g:76:1: action : ( ruby_action | set | verb | verb nod | endNode verb nod );
    public final void action() throws RecognitionException {
        try {
            // Escript.g:76:8: ( ruby_action | set | verb | verb nod | endNode verb nod )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 41:
            case 53:
            case 58:
            case 59:
            case 60:
                {
                alt13=2;
                }
                break;
            case The:
                {
                switch ( input.LA(2) ) {
                case 58:
                case 59:
                case 60:
                    {
                    alt13=2;
                    }
                    break;
                case Word:
                    {
                    int LA13_9 = input.LA(3);

                    if ( (LA13_9==Be) ) {
                        alt13=2;
                    }
                    else if ( (LA13_9==Verb) ) {
                        alt13=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case 35:
                    {
                    alt13=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }

                }
                break;
            case Word:
                {
                int LA13_5 = input.LA(2);

                if ( (LA13_5==Be) ) {
                    alt13=2;
                }
                else if ( (LA13_5==Verb) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;

                }
                }
                break;
            case Verb:
                {
                int LA13_6 = input.LA(2);

                if ( (LA13_6==EOF||LA13_6==NL||LA13_6==57) ) {
                    alt13=3;
                }
                else if ( (LA13_6==Integer||(LA13_6 >= Quote && LA13_6 <= Real)||LA13_6==The||LA13_6==Word) ) {
                    alt13=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;

                }
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // Escript.g:77:2: ruby_action
                    {
                    pushFollow(FOLLOW_ruby_action_in_action239);
                    ruby_action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:79:4: set
                    {
                    pushFollow(FOLLOW_set_in_action245);
                    set();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Escript.g:80:3: verb
                    {
                    pushFollow(FOLLOW_verb_in_action249);
                    verb();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Escript.g:81:3: verb nod
                    {
                    pushFollow(FOLLOW_verb_in_action253);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_action255);
                    nod();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Escript.g:82:3: endNode verb nod
                    {
                    pushFollow(FOLLOW_endNode_in_action259);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_verb_in_action261);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_action263);
                    nod();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "action"



    // $ANTLR start "loopendNode"
    // Escript.g:85:1: loopendNode : ( 'while' condition NL block done | action 'until' condition | 'as long as' condition NL block done );
    public final void loopendNode() throws RecognitionException {
        try {
            // Escript.g:85:12: ( 'while' condition NL block done | action 'until' condition | 'as long as' condition NL block done )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt14=1;
                }
                break;
            case The:
            case Verb:
            case Word:
            case 29:
            case 35:
            case 41:
            case 53:
            case 58:
            case 59:
            case 60:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Escript.g:86:3: 'while' condition NL block done
                    {
                    match(input,63,FOLLOW_63_in_loopendNode274); 

                    pushFollow(FOLLOW_condition_in_loopendNode276);
                    condition();

                    state._fsp--;


                    match(input,NL,FOLLOW_NL_in_loopendNode278); 

                    pushFollow(FOLLOW_block_in_loopendNode280);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_done_in_loopendNode282);
                    done();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:87:4: action 'until' condition
                    {
                    pushFollow(FOLLOW_action_in_loopendNode288);
                    action();

                    state._fsp--;


                    match(input,57,FOLLOW_57_in_loopendNode290); 

                    pushFollow(FOLLOW_condition_in_loopendNode292);
                    condition();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Escript.g:90:5: 'as long as' condition NL block done
                    {
                    match(input,28,FOLLOW_28_in_loopendNode301); 

                    pushFollow(FOLLOW_condition_in_loopendNode303);
                    condition();

                    state._fsp--;


                    match(input,NL,FOLLOW_NL_in_loopendNode305); 

                    pushFollow(FOLLOW_block_in_loopendNode307);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_done_in_loopendNode309);
                    done();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "loopendNode"



    // $ANTLR start "set"
    // Escript.g:94:1: set : ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value ;
    public final void set() throws RecognitionException {
        try {
            // Escript.g:95:2: ( ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value )
            // Escript.g:95:3: ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value
            {
            // Escript.g:95:3: ( let )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41||LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Escript.g:95:3: let
                    {
                    pushFollow(FOLLOW_let_in_set323);
                    let();

                    state._fsp--;


                    }
                    break;

            }


            // Escript.g:95:8: ( the )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==The) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Escript.g:95:8: the
                    {
                    pushFollow(FOLLOW_the_in_set326);
                    the();

                    state._fsp--;


                    }
                    break;

            }


            // Escript.g:95:14: ( 'var' | 'val' | 'value of' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= 58 && LA17_0 <= 60)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Escript.g:
                    {
                    if ( (input.LA(1) >= 58 && input.LA(1) <= 60) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_variable_in_set339);
            variable();

            state._fsp--;


            pushFollow(FOLLOW_be_in_set341);
            be();

            state._fsp--;


            pushFollow(FOLLOW_value_in_set343);
            value();

            state._fsp--;


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
    // $ANTLR end "set"



    // $ANTLR start "variable"
    // Escript.g:98:1: variable : Word ;
    public final void variable() throws RecognitionException {
        try {
            // Escript.g:99:2: ( Word )
            // Escript.g:99:4: Word
            {
            match(input,Word,FOLLOW_Word_in_variable354); 

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
    // $ANTLR end "variable"



    // $ANTLR start "value"
    // Escript.g:101:1: value : nod ;
    public final void value() throws RecognitionException {
        try {
            // Escript.g:102:2: ( nod )
            // Escript.g:102:4: nod
            {
            pushFollow(FOLLOW_nod_in_value363);
            nod();

            state._fsp--;


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
    // $ANTLR end "value"



    // $ANTLR start "arg"
    // Escript.g:105:1: arg : preposition endNode ;
    public final void arg() throws RecognitionException {
        try {
            // Escript.g:106:2: ( preposition endNode )
            // Escript.g:106:4: preposition endNode
            {
            pushFollow(FOLLOW_preposition_in_arg374);
            preposition();

            state._fsp--;


            pushFollow(FOLLOW_endNode_in_arg376);
            endNode();

            state._fsp--;


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
    // $ANTLR end "arg"



    // $ANTLR start "that"
    // Escript.g:109:1: that : ( 'that' verbium endNode | 'that' attrib );
    public final void that() throws RecognitionException {
        try {
            // Escript.g:110:3: ( 'that' verbium endNode | 'that' attrib )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==55) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==Comparation||LA18_1==Verb||LA18_1==40||LA18_1==45||LA18_1==47) ) {
                    alt18=1;
                }
                else if ( (LA18_1==54) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Escript.g:110:5: 'that' verbium endNode
                    {
                    match(input,55,FOLLOW_55_in_that387); 

                    pushFollow(FOLLOW_verbium_in_that389);
                    verbium();

                    state._fsp--;


                    pushFollow(FOLLOW_endNode_in_that391);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:110:30: 'that' attrib
                    {
                    match(input,55,FOLLOW_55_in_that395); 

                    pushFollow(FOLLOW_attrib_in_that397);
                    attrib();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "that"



    // $ANTLR start "where"
    // Escript.g:112:1: where : 'where' condition ;
    public final void where() throws RecognitionException {
        try {
            // Escript.g:113:2: ( 'where' condition )
            // Escript.g:113:3: 'where' condition
            {
            match(input,62,FOLLOW_62_in_where406); 

            pushFollow(FOLLOW_condition_in_where408);
            condition();

            state._fsp--;


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
    // $ANTLR end "where"



    // $ANTLR start "condition"
    // Escript.g:115:1: condition : endcondition ;
    public final void condition() throws RecognitionException {
        try {
            // Escript.g:116:2: ( endcondition )
            // Escript.g:116:3: endcondition
            {
            pushFollow(FOLLOW_endcondition_in_condition417);
            endcondition();

            state._fsp--;


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
    // $ANTLR end "condition"



    // $ANTLR start "endcondition"
    // Escript.g:118:1: endcondition : endNode comparison endNode ;
    public final void endcondition() throws RecognitionException {
        try {
            // Escript.g:119:2: ( endNode comparison endNode )
            // Escript.g:119:3: endNode comparison endNode
            {
            pushFollow(FOLLOW_endNode_in_endcondition429);
            endNode();

            state._fsp--;


            pushFollow(FOLLOW_comparison_in_endcondition431);
            comparison();

            state._fsp--;


            pushFollow(FOLLOW_endNode_in_endcondition433);
            endNode();

            state._fsp--;


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
    // $ANTLR end "endcondition"



    // $ANTLR start "verbTo"
    // Escript.g:122:1: verbTo : hilfsverb 's to' ;
    public final void verbTo() throws RecognitionException {
        try {
            // Escript.g:123:2: ( hilfsverb 's to' )
            // Escript.g:123:4: hilfsverb 's to'
            {
            pushFollow(FOLLOW_hilfsverb_in_verbTo444);
            hilfsverb();

            state._fsp--;


            match(input,51,FOLLOW_51_in_verbTo445); 

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
    // $ANTLR end "verbTo"



    // $ANTLR start "hilfsverb"
    // Escript.g:125:1: hilfsverb : ( 'want' | 'like' | 'hate' );
    public final void hilfsverb() throws RecognitionException {
        try {
            // Escript.g:126:2: ( 'want' | 'like' | 'hate' )
            // Escript.g:
            {
            if ( input.LA(1)==36||input.LA(1)==42||input.LA(1)==61 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "hilfsverb"



    // $ANTLR start "gerundium"
    // Escript.g:128:1: gerundium : verb 'ing' ;
    public final void gerundium() throws RecognitionException {
        try {
            // Escript.g:129:2: ( verb 'ing' )
            // Escript.g:129:4: verb 'ing'
            {
            pushFollow(FOLLOW_verb_in_gerundium470);
            verb();

            state._fsp--;


            match(input,39,FOLLOW_39_in_gerundium471); 

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
    // $ANTLR end "gerundium"



    // $ANTLR start "attribute"
    // Escript.g:131:1: attribute : Attribute ;
    public final void attribute() throws RecognitionException {
        try {
            // Escript.g:132:2: ( Attribute )
            // Escript.g:132:3: Attribute
            {
            match(input,Attribute,FOLLOW_Attribute_in_attribute480); 

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
    // $ANTLR end "attribute"



    // $ANTLR start "verbium"
    // Escript.g:134:1: verbium : ( comparison | verb adverb );
    public final void verbium() throws RecognitionException {
        try {
            // Escript.g:135:2: ( comparison | verb adverb )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Comparation||LA19_0==40||LA19_0==45||LA19_0==47) ) {
                alt19=1;
            }
            else if ( (LA19_0==Verb) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==Preposition) ) {
                    alt19=1;
                }
                else if ( (LA19_2==40||LA19_2==45||LA19_2==47) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Escript.g:135:3: comparison
                    {
                    pushFollow(FOLLOW_comparison_in_verbium488);
                    comparison();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:135:14: verb adverb
                    {
                    pushFollow(FOLLOW_verb_in_verbium490);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_adverb_in_verbium492);
                    adverb();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "verbium"



    // $ANTLR start "verb"
    // Escript.g:138:1: verb : Verb ;
    public final void verb() throws RecognitionException {
        try {
            // Escript.g:138:6: ( Verb )
            // Escript.g:138:8: Verb
            {
            match(input,Verb,FOLLOW_Verb_in_verb502); 

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
    // $ANTLR end "verb"



    // $ANTLR start "nod"
    // Escript.g:141:1: nod : ( number | quote | ( the )? noun ( selector )* );
    public final void nod() throws RecognitionException {
        try {
            // Escript.g:142:2: ( number | quote | ( the )? noun ( selector )* )
            int alt22=3;
            switch ( input.LA(1) ) {
            case Integer:
            case Real:
                {
                alt22=1;
                }
                break;
            case Quote:
                {
                alt22=2;
                }
                break;
            case The:
            case Word:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Escript.g:142:3: number
                    {
                    pushFollow(FOLLOW_number_in_nod513);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:142:11: quote
                    {
                    pushFollow(FOLLOW_quote_in_nod516);
                    quote();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Escript.g:142:19: ( the )? noun ( selector )*
                    {
                    // Escript.g:142:19: ( the )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==The) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Escript.g:142:19: the
                            {
                            pushFollow(FOLLOW_the_in_nod520);
                            the();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_noun_in_nod523);
                    noun();

                    state._fsp--;


                    // Escript.g:142:29: ( selector )*
                    loop21:
                    do {
                        int alt21=2;
                        switch ( input.LA(1) ) {
                        case 62:
                            {
                            alt21=1;
                            }
                            break;
                        case 55:
                            {
                            alt21=1;
                            }
                            break;
                        case 46:
                            {
                            alt21=1;
                            }
                            break;
                        case Preposition:
                            {
                            alt21=1;
                            }
                            break;

                        }

                        switch (alt21) {
                    	case 1 :
                    	    // Escript.g:142:30: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_nod526);
                    	    selector();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "nod"



    // $ANTLR start "noun"
    // Escript.g:144:1: noun :{...}? Word ;
    public final void noun() throws RecognitionException {
        try {
            // Escript.g:145:2: ({...}? Word )
            // Escript.g:145:3: {...}? Word
            {
            if ( !((isNoun(getText()))) ) {
                throw new FailedPredicateException(input, "noun", "isNoun(getText())");
            }

            match(input,Word,FOLLOW_Word_in_noun539); 

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
    // $ANTLR end "noun"



    // $ANTLR start "quote"
    // Escript.g:147:1: quote : Quote ;
    public final void quote() throws RecognitionException {
        try {
            // Escript.g:148:2: ( Quote )
            // Escript.g:148:4: Quote
            {
            match(input,Quote,FOLLOW_Quote_in_quote549); 

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
    // $ANTLR end "quote"



    // $ANTLR start "attrib"
    // Escript.g:150:1: attrib : 'stinky' ;
    public final void attrib() throws RecognitionException {
        try {
            // Escript.g:151:2: ( 'stinky' )
            // Escript.g:151:4: 'stinky'
            {
            match(input,54,FOLLOW_54_in_attrib558); 

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
    // $ANTLR end "attrib"



    // $ANTLR start "number"
    // Escript.g:154:1: number : ( Integer | Real );
    public final void number() throws RecognitionException {
        try {
            // Escript.g:154:11: ( Integer | Real )
            // Escript.g:
            {
            if ( input.LA(1)==Integer||input.LA(1)==Real ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "number"



    // $ANTLR start "endNode"
    // Escript.g:157:1: endNode : endNode2 ;
    public final void endNode() throws RecognitionException {
        try {
            // Escript.g:157:8: ( endNode2 )
            // Escript.g:158:2: endNode2
            {
            pushFollow(FOLLOW_endNode2_in_endNode585);
            endNode2();

            state._fsp--;


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
    // $ANTLR end "endNode"



    // $ANTLR start "selector"
    // Escript.g:161:1: selector : ( where | that | 'of' endNode | preposition nod );
    public final void selector() throws RecognitionException {
        try {
            // Escript.g:162:2: ( where | that | 'of' endNode | preposition nod )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt23=1;
                }
                break;
            case 55:
                {
                alt23=2;
                }
                break;
            case 46:
                {
                alt23=3;
                }
                break;
            case Preposition:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Escript.g:162:3: where
                    {
                    pushFollow(FOLLOW_where_in_selector594);
                    where();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:162:9: that
                    {
                    pushFollow(FOLLOW_that_in_selector596);
                    that();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Escript.g:162:16: 'of' endNode
                    {
                    match(input,46,FOLLOW_46_in_selector600); 

                    pushFollow(FOLLOW_endNode_in_selector602);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Escript.g:162:31: preposition nod
                    {
                    pushFollow(FOLLOW_preposition_in_selector606);
                    preposition();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_selector608);
                    nod();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "selector"



    // $ANTLR start "selector2"
    // Escript.g:166:1: selector2 : ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) ;
    public final void selector2() throws RecognitionException {
        try {
            // Escript.g:167:2: ( ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) )
            // Escript.g:167:4: ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 )
            {
            if ( input.LA(1)==55||input.LA(1)==64 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Escript.g:167:19: ( adverb )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40||LA24_0==45||LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Escript.g:167:19: adverb
            	    {
            	    pushFollow(FOLLOW_adverb_in_selector2633);
            	    adverb();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            pushFollow(FOLLOW_verb_in_selector2636);
            verb();

            state._fsp--;


            match(input,52,FOLLOW_52_in_selector2637); 

            // Escript.g:167:35: ( preposition endNode2 )
            // Escript.g:167:36: preposition endNode2
            {
            pushFollow(FOLLOW_preposition_in_selector2640);
            preposition();

            state._fsp--;


            pushFollow(FOLLOW_endNode2_in_selector2642);
            endNode2();

            state._fsp--;


            }


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
    // $ANTLR end "selector2"



    // $ANTLR start "adverb"
    // Escript.g:169:1: adverb : ( 'often' | 'never' | 'joyfully' );
    public final void adverb() throws RecognitionException {
        try {
            // Escript.g:170:2: ( 'often' | 'never' | 'joyfully' )
            // Escript.g:
            {
            if ( input.LA(1)==40||input.LA(1)==45||input.LA(1)==47 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "adverb"



    // $ANTLR start "endNode2"
    // Escript.g:172:1: endNode2 : ( the )? ( adjective )* noun ;
    public final void endNode2() throws RecognitionException {
        try {
            // Escript.g:173:2: ( ( the )? ( adjective )* noun )
            // Escript.g:173:3: ( the )? ( adjective )* noun
            {
            // Escript.g:173:3: ( the )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==The) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Escript.g:173:3: the
                    {
                    pushFollow(FOLLOW_the_in_endNode2668);
                    the();

                    state._fsp--;


                    }
                    break;

            }


            // Escript.g:173:8: ( adjective )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Escript.g:173:8: adjective
            	    {
            	    pushFollow(FOLLOW_adjective_in_endNode2671);
            	    adjective();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            pushFollow(FOLLOW_noun_in_endNode2674);
            noun();

            state._fsp--;


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
    // $ANTLR end "endNode2"



    // $ANTLR start "adjective"
    // Escript.g:175:1: adjective : 'funny' ;
    public final void adjective() throws RecognitionException {
        try {
            // Escript.g:176:2: ( 'funny' )
            // Escript.g:176:4: 'funny'
            {
            match(input,35,FOLLOW_35_in_adjective683); 

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
    // $ANTLR end "adjective"



    // $ANTLR start "done"
    // Escript.g:178:1: done : ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' );
    public final void done() throws RecognitionException {
        try {
            // Escript.g:179:2: ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' )
            // Escript.g:
            {
            if ( (input.LA(1) >= 25 && input.LA(1) <= 27)||(input.LA(1) >= 31 && input.LA(1) <= 33)||input.LA(1)==48||input.LA(1)==50 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "done"



    // $ANTLR start "let"
    // Escript.g:186:1: let : ( 'let' | 'set' );
    public final void let() throws RecognitionException {
        try {
            // Escript.g:187:2: ( 'let' | 'set' )
            // Escript.g:
            {
            if ( input.LA(1)==41||input.LA(1)==53 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "let"



    // $ANTLR start "method"
    // Escript.g:189:1: method : ( 'how to' | 'function' | 'define' | 'method for' | 'method' );
    public final void method() throws RecognitionException {
        try {
            // Escript.g:190:2: ( 'how to' | 'function' | 'define' | 'method for' | 'method' )
            // Escript.g:
            {
            if ( input.LA(1)==30||input.LA(1)==34||input.LA(1)==37||(input.LA(1) >= 43 && input.LA(1) <= 44) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "method"



    // $ANTLR start "comparison"
    // Escript.g:192:1: comparison : ( ( adverb )* verb preposition | comparation );
    public final void comparison() throws RecognitionException {
        try {
            // Escript.g:193:2: ( ( adverb )* verb preposition | comparation )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Verb||LA28_0==40||LA28_0==45||LA28_0==47) ) {
                alt28=1;
            }
            else if ( (LA28_0==Comparation) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // Escript.g:193:4: ( adverb )* verb preposition
                    {
                    // Escript.g:193:4: ( adverb )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==40||LA27_0==45||LA27_0==47) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Escript.g:193:4: adverb
                    	    {
                    	    pushFollow(FOLLOW_adverb_in_comparison750);
                    	    adverb();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    pushFollow(FOLLOW_verb_in_comparison753);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_preposition_in_comparison755);
                    preposition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Escript.g:193:30: comparation
                    {
                    pushFollow(FOLLOW_comparation_in_comparison758);
                    comparation();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "comparison"



    // $ANTLR start "comparation"
    // Escript.g:195:1: comparation : Comparation ;
    public final void comparation() throws RecognitionException {
        try {
            // Escript.g:195:12: ( Comparation )
            // Escript.g:195:13: Comparation
            {
            match(input,Comparation,FOLLOW_Comparation_in_comparation765); 

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
    // $ANTLR end "comparation"



    // $ANTLR start "the"
    // Escript.g:202:1: the : The ;
    public final void the() throws RecognitionException {
        try {
            // Escript.g:202:4: ( The )
            // Escript.g:202:5: The
            {
            match(input,The,FOLLOW_The_in_the779); 

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
    // $ANTLR end "the"



    // $ANTLR start "be"
    // Escript.g:203:1: be : Be ;
    public final void be() throws RecognitionException {
        try {
            // Escript.g:203:3: ( Be )
            // Escript.g:203:4: Be
            {
            match(input,Be,FOLLOW_Be_in_be784); 

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
    // $ANTLR end "be"



    // $ANTLR start "have"
    // Escript.g:204:1: have : Have ;
    public final void have() throws RecognitionException {
        try {
            // Escript.g:204:5: ( Have )
            // Escript.g:204:6: Have
            {
            match(input,Have,FOLLOW_Have_in_have789); 

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
    // $ANTLR end "have"



    // $ANTLR start "preposition"
    // Escript.g:208:1: preposition : Preposition ;
    public final void preposition() throws RecognitionException {
        try {
            // Escript.g:208:12: ( Preposition )
            // Escript.g:208:14: Preposition
            {
            match(input,Preposition,FOLLOW_Preposition_in_preposition800); 

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
    // $ANTLR end "preposition"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\77\uffff";
    static final String DFA1_eofS =
        "\1\2\1\uffff\1\12\5\uffff\1\32\2\uffff\1\32\12\uffff\2\32\1\uffff"+
        "\1\32\45\uffff";
    static final String DFA1_minS =
        "\1\24\1\uffff\1\0\1\21\1\24\2\27\1\5\1\14\1\27\1\uffff\1\17\2\27"+
        "\1\5\1\27\1\5\1\27\1\5\2\14\1\uffff\2\17\1\27\1\17\1\uffff\1\25"+
        "\1\27\20\uffff\4\0\16\uffff";
    static final String DFA1_maxS =
        "\1\74\1\uffff\1\0\1\21\2\74\1\27\1\25\1\27\1\43\1\uffff\1\17\1\74"+
        "\1\27\1\5\1\27\1\25\1\43\1\5\2\27\1\uffff\2\17\1\27\1\76\1\uffff"+
        "\1\25\1\43\20\uffff\4\0\16\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\17\uffff\1\2\4\uffff\16\1\10\uffff\5\1"+
        "\2\uffff\3\1";
    static final String DFA1_specialS =
        "\55\uffff\1\0\1\1\1\2\1\3\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\1\10\1\uffff\1\7\5\uffff\1\3\1\1\3\uffff\1\1\1\11\1\uffff"+
            "\1\1\3\uffff\1\4\1\uffff\2\1\10\uffff\1\4\4\uffff\3\6",
            "",
            "\1\uffff",
            "\1\13",
            "\1\14\2\uffff\1\16\42\uffff\3\15",
            "\1\20\13\uffff\1\21\26\uffff\3\17",
            "\1\22",
            "\1\23\17\uffff\1\24",
            "\1\26\2\uffff\1\1\1\uffff\1\27\1\26\1\uffff\1\30\2\uffff\1"+
            "\31",
            "\1\33\13\uffff\1\34",
            "",
            "\1\1",
            "\1\40\42\uffff\3\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44\17\uffff\1\45",
            "\1\46\13\uffff\1\47",
            "\1\50",
            "\1\51\4\uffff\1\52\1\51\1\uffff\1\53\2\uffff\1\54",
            "\1\55\4\uffff\1\56\1\55\1\uffff\1\57\2\uffff\1\60",
            "",
            "\1\1",
            "\1\1",
            "\1\65",
            "\1\1\1\71\35\uffff\1\70\10\uffff\1\67\6\uffff\1\66",
            "",
            "\1\74",
            "\1\75\13\uffff\1\76",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "40:1: parse returns [String value] : (exp= statements |exp= action | EOF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_45 = input.LA(1);

                         
                        int index1_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 1;}

                        else if ( ((isNoun(getText()))) ) {s = 26;}

                         
                        input.seek(index1_45);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA1_46 = input.LA(1);

                         
                        int index1_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 1;}

                        else if ( ((isNoun(getText()))) ) {s = 26;}

                         
                        input.seek(index1_46);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA1_47 = input.LA(1);

                         
                        int index1_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 1;}

                        else if ( ((isNoun(getText()))) ) {s = 26;}

                         
                        input.seek(index1_47);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA1_48 = input.LA(1);

                         
                        int index1_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 1;}

                        else if ( ((isNoun(getText()))) ) {s = 26;}

                         
                        input.seek(index1_48);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA2_eotS =
        "\76\uffff";
    static final String DFA2_eofS =
        "\1\10\5\uffff\1\24\3\uffff\1\24\12\uffff\2\24\1\uffff\1\24\45\uffff";
    static final String DFA2_minS =
        "\1\24\1\21\1\24\2\27\1\5\1\14\1\27\2\uffff\1\17\2\27\1\5\1\27\1"+
        "\5\1\27\1\5\2\14\1\uffff\2\17\1\27\1\17\1\uffff\1\25\1\27\20\uffff"+
        "\4\0\16\uffff";
    static final String DFA2_maxS =
        "\1\74\1\21\2\74\1\27\1\25\1\27\1\43\2\uffff\1\17\1\74\1\27\1\5\1"+
        "\27\1\25\1\43\1\5\2\27\1\uffff\2\17\1\27\1\76\1\uffff\1\25\1\43"+
        "\20\uffff\4\0\16\uffff";
    static final String DFA2_acceptS =
        "\10\uffff\1\2\13\uffff\1\1\11\uffff\16\1\10\uffff\5\1\2\uffff\3"+
        "\1";
    static final String DFA2_specialS =
        "\54\uffff\1\0\1\1\1\2\1\3\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\6\1\uffff\1\5\5\uffff\1\1\1\10\3\uffff\1\10\1\7\1\uffff"+
            "\1\10\3\uffff\1\2\1\uffff\2\10\10\uffff\1\2\4\uffff\3\4",
            "\1\12",
            "\1\13\2\uffff\1\15\42\uffff\3\14",
            "\1\17\13\uffff\1\20\26\uffff\3\16",
            "\1\21",
            "\1\22\17\uffff\1\23",
            "\1\25\2\uffff\1\10\1\uffff\1\26\1\25\1\uffff\1\27\2\uffff\1"+
            "\30",
            "\1\32\13\uffff\1\33",
            "",
            "",
            "\1\10",
            "\1\37\42\uffff\3\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\17\uffff\1\44",
            "\1\45\13\uffff\1\46",
            "\1\47",
            "\1\50\4\uffff\1\51\1\50\1\uffff\1\52\2\uffff\1\53",
            "\1\54\4\uffff\1\55\1\54\1\uffff\1\56\2\uffff\1\57",
            "",
            "\1\10",
            "\1\10",
            "\1\64",
            "\1\10\1\70\35\uffff\1\67\10\uffff\1\66\6\uffff\1\65",
            "",
            "\1\73",
            "\1\74\13\uffff\1\75",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
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
            return "45:1: act0 : ( action | statements );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_44 = input.LA(1);

                         
                        int index2_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 20;}

                        else if ( ((isNoun(getText()))) ) {s = 8;}

                         
                        input.seek(index2_44);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA2_45 = input.LA(1);

                         
                        int index2_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 20;}

                        else if ( ((isNoun(getText()))) ) {s = 8;}

                         
                        input.seek(index2_45);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA2_46 = input.LA(1);

                         
                        int index2_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 20;}

                        else if ( ((isNoun(getText()))) ) {s = 8;}

                         
                        input.seek(index2_46);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA2_47 = input.LA(1);

                         
                        int index2_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText()))) ) {s = 20;}

                        else if ( ((isNoun(getText()))) ) {s = 8;}

                         
                        input.seek(index2_47);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_bash_in_ruby_action44 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_quote_in_ruby_action46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_bash58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statements_in_parse75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_parse84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_parse89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_act099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statements_in_act0101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_statements110 = new BitSet(new long[]{0x0000182440000002L});
    public static final BitSet FOLLOW_block_in_statements113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_block124 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NL_in_block126 = new BitSet(new long[]{0x1C20020820B08002L});
    public static final BitSet FOLLOW_action_in_expression139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_definition148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_verb_in_definition150 = new BitSet(new long[]{0x0000000801918000L});
    public static final BitSet FOLLOW_endNode_in_definition152 = new BitSet(new long[]{0x0000000001018000L});
    public static final BitSet FOLLOW_arg_in_definition155 = new BitSet(new long[]{0x0000000001018000L});
    public static final BitSet FOLLOW_24_in_definition158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NL_in_definition161 = new BitSet(new long[]{0x1C25020BAEB00000L});
    public static final BitSet FOLLOW_block_in_definition163 = new BitSet(new long[]{0x000500038E000000L});
    public static final BitSet FOLLOW_done_in_definition165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_if_then179 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_if_then181 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_if_then183 = new BitSet(new long[]{0x1C20020820B00000L});
    public static final BitSet FOLLOW_action_in_if_then185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_if_then190 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_if_then192 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_56_in_if_then194 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NL_in_if_then197 = new BitSet(new long[]{0x1C25020BAEB00000L});
    public static final BitSet FOLLOW_block_in_if_then199 = new BitSet(new long[]{0x000500038E000000L});
    public static final BitSet FOLLOW_done_in_if_then201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_once211 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_once213 = new BitSet(new long[]{0x1D20020820B00000L});
    public static final BitSet FOLLOW_56_in_once215 = new BitSet(new long[]{0x1C20020820B00000L});
    public static final BitSet FOLLOW_action_in_once218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruby_action_in_action239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action253 = new BitSet(new long[]{0x0000000000961000L});
    public static final BitSet FOLLOW_nod_in_action255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_action259 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_verb_in_action261 = new BitSet(new long[]{0x0000000000961000L});
    public static final BitSet FOLLOW_nod_in_action263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_loopendNode274 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_loopendNode276 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NL_in_loopendNode278 = new BitSet(new long[]{0x1C25020BAEB00000L});
    public static final BitSet FOLLOW_block_in_loopendNode280 = new BitSet(new long[]{0x000500038E000000L});
    public static final BitSet FOLLOW_done_in_loopendNode282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_loopendNode288 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_loopendNode290 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_loopendNode292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_loopendNode301 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_loopendNode303 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NL_in_loopendNode305 = new BitSet(new long[]{0x1C25020BAEB00000L});
    public static final BitSet FOLLOW_block_in_loopendNode307 = new BitSet(new long[]{0x000500038E000000L});
    public static final BitSet FOLLOW_done_in_loopendNode309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_set323 = new BitSet(new long[]{0x1C00000000900000L});
    public static final BitSet FOLLOW_the_in_set326 = new BitSet(new long[]{0x1C00000000800000L});
    public static final BitSet FOLLOW_variable_in_set339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_be_in_set341 = new BitSet(new long[]{0x0000000000961000L});
    public static final BitSet FOLLOW_value_in_set343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Word_in_variable354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nod_in_value363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_arg374 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_endNode_in_arg376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_that387 = new BitSet(new long[]{0x0000A10000200080L});
    public static final BitSet FOLLOW_verbium_in_that389 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_endNode_in_that391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_that395 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_attrib_in_that397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_where406 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_condition_in_where408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endcondition_in_condition417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition429 = new BitSet(new long[]{0x0000A10000200080L});
    public static final BitSet FOLLOW_comparison_in_endcondition431 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_endNode_in_endcondition433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hilfsverb_in_verbTo444 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_verbTo445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_gerundium470 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_gerundium471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Attribute_in_attribute480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_verbium488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_verbium490 = new BitSet(new long[]{0x0000A10000000000L});
    public static final BitSet FOLLOW_adverb_in_verbium492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verb_in_verb502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_nod513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quote_in_nod516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_nod520 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_noun_in_nod523 = new BitSet(new long[]{0x4080400000010002L});
    public static final BitSet FOLLOW_selector_in_nod526 = new BitSet(new long[]{0x4080400000010002L});
    public static final BitSet FOLLOW_Word_in_noun539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Quote_in_quote549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_attrib558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode2_in_endNode585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_in_selector594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_that_in_selector596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_selector600 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_endNode_in_selector602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_selector606 = new BitSet(new long[]{0x0000000000961000L});
    public static final BitSet FOLLOW_nod_in_selector608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_selector2627 = new BitSet(new long[]{0x0000A10000200000L});
    public static final BitSet FOLLOW_adverb_in_selector2633 = new BitSet(new long[]{0x0000A10000200000L});
    public static final BitSet FOLLOW_verb_in_selector2636 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_selector2637 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_preposition_in_selector2640 = new BitSet(new long[]{0x0000000800900000L});
    public static final BitSet FOLLOW_endNode2_in_selector2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_endNode2668 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_adjective_in_endNode2671 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_noun_in_endNode2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_adjective683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adverb_in_comparison750 = new BitSet(new long[]{0x0000A10000200000L});
    public static final BitSet FOLLOW_verb_in_comparison753 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_preposition_in_comparison755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparation_in_comparison758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comparation_in_comparation765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_The_in_the779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Be_in_be784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Have_in_have789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Preposition_in_preposition800 = new BitSet(new long[]{0x0000000000000002L});

}