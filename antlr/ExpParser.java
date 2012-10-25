// $ANTLR 3.4 Exp.g 2012-02-11 23:33:16

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

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "ESC", "If", "Integer", "LETTER", "LINE_COMMENT", "NL", "Quote", "Real", "Reductions", "WS", "Word", "':'", "':='", "'<'", "'='", "'=<'", "'=='", "'>'", "'>='", "'OK'", "'a'", "'above'", "'after'", "'against'", "'all set'", "'all'", "'alrighty'", "'an'", "'and'", "'any'", "'apart from'", "'around'", "'as long as'", "'as'", "'aside from'", "'at'", "'be'", "'before'", "'behind'", "'below'", "'beneath'", "'beside'", "'between'", "'bigger than'", "'but not'", "'considering'", "'define'", "'done'", "'each'", "'end'", "'eq'", "'equals'", "'every'", "'finished'", "'from'", "'function'", "'funny'", "'greater than'", "'gt'", "'had'", "'has'", "'hate'", "'have'", "'how to'", "'if'", "'in'", "'ing'", "'instead of'", "'into'", "'is'", "'joyfully'", "'less than'", "'let'", "'like'", "'lt'", "'method for'", "'method'", "'never'", "'of'", "'often'", "'ok'", "'on'", "'once'", "'onto'", "'out of'", "'over'", "'qed'", "'s to'", "'s'", "'set'", "'since'", "'smaller than'", "'some'", "'stinky'", "'sucks'", "'teh'", "'that'", "'the'", "'then'", "'these'", "'this'", "'those'", "'through'", "'thru'", "'to'", "'val'", "'value of'", "'var'", "'want'", "'was'", "'where'", "'while'", "'who'", "'with'", "'without'"
    };

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
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExpParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ExpParser.tokenNames; }
    public String getGrammarFileName() { return "Exp.g"; }


    	String file="~/data/base/lang/english.words.sqlite3.db";
    	static Runtime runtime=Runtime.getRuntime();
    	
    	public boolean testSql(String word, String type){
    		try{
    		String query=" 'SELECT * FROM nouns WHERE word=\""+word+"\"'";
    		String cmd="sqlite3 "+file+query;
    		Process p =runtime.exec(cmd);
    		return word.equals(new BufferedReader( new InputStreamReader(p.getInputStream())).readLine());
    		}catch(Exception e){};
    		return false;
    	}

    	public boolean isNoun(String word){
    		return testSql(word,"noun");
    	}
    	
    	// +s ed ing	
    	public boolean isVerb(String word) {
    			return testSql(word,"verb");// ||testSql(word-"ing","verb")||testSql(word+"s","verb")+testSql(word+"ed","verb");
    	}
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



    // $ANTLR start "parse"
    // Exp.g:74:1: parse returns [String value] : (exp= statements | EOF );
    public final String parse() throws RecognitionException {
        String value = null;


        ExpParser.statements_return exp =null;


        try {
            // Exp.g:75:2: (exp= statements | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Word||LA1_0==26||LA1_0==31||LA1_0==33||LA1_0==35||LA1_0==52||LA1_0==54||LA1_0==58||(LA1_0 >= 61 && LA1_0 <= 62)||LA1_0==69||LA1_0==78||(LA1_0 >= 81 && LA1_0 <= 82)||LA1_0==95||LA1_0==98||(LA1_0 >= 101 && LA1_0 <= 103)||(LA1_0 >= 105 && LA1_0 <= 107)||(LA1_0 >= 111 && LA1_0 <= 113)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Exp.g:75:4: exp= statements
                    {
                    pushFollow(FOLLOW_statements_in_parse49);
                    exp=statements();

                    state._fsp--;


                    value = (exp!=null?input.toString(exp.start,exp.stop):null);

                    }
                    break;
                case 2 :
                    // Exp.g:76:3: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_parse55); 

                    System.out.println("done");

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



    // $ANTLR start "act"
    // Exp.g:78:1: act : statements ;
    public final void act() throws RecognitionException {
        try {
            // Exp.g:78:5: ( statements )
            // Exp.g:78:7: statements
            {
            pushFollow(FOLLOW_statements_in_act65);
            statements();

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
    // $ANTLR end "act"


    public static class statements_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "statements"
    // Exp.g:80:1: statements : ( ( definition )* | block );
    public final ExpParser.statements_return statements() throws RecognitionException {
        ExpParser.statements_return retval = new ExpParser.statements_return();
        retval.start = input.LT(1);


        try {
            // Exp.g:81:3: ( ( definition )* | block )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 52:
            case 61:
            case 69:
            case 81:
            case 82:
                {
                alt3=1;
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            case Word:
            case 26:
            case 31:
            case 33:
            case 35:
            case 54:
            case 58:
            case 62:
            case 78:
            case 95:
            case 98:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 111:
            case 112:
            case 113:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // Exp.g:81:3: ( definition )*
                    {
                    // Exp.g:81:3: ( definition )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==52||LA2_0==61||LA2_0==69||(LA2_0 >= 81 && LA2_0 <= 82)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Exp.g:81:3: definition
                    	    {
                    	    pushFollow(FOLLOW_definition_in_statements73);
                    	    definition();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Exp.g:81:15: block
                    {
                    pushFollow(FOLLOW_block_in_statements76);
                    block();

                    state._fsp--;


                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "statements"



    // $ANTLR start "block"
    // Exp.g:83:1: block : ( expression ( NL )+ )* ;
    public final void block() throws RecognitionException {
        try {
            // Exp.g:84:3: ( ( expression ( NL )+ )* )
            // Exp.g:84:5: ( expression ( NL )+ )*
            {
            // Exp.g:84:5: ( expression ( NL )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Word||LA5_0==26||LA5_0==31||LA5_0==33||LA5_0==35||LA5_0==54||LA5_0==58||LA5_0==62||LA5_0==78||LA5_0==95||LA5_0==98||(LA5_0 >= 101 && LA5_0 <= 103)||(LA5_0 >= 105 && LA5_0 <= 107)||(LA5_0 >= 111 && LA5_0 <= 113)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Exp.g:84:6: expression ( NL )+
            	    {
            	    pushFollow(FOLLOW_expression_in_block87);
            	    expression();

            	    state._fsp--;


            	    // Exp.g:84:17: ( NL )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==NL) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // Exp.g:84:17: NL
            	    	    {
            	    	    match(input,NL,FOLLOW_NL_in_block89); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // Exp.g:86:1: expression : action ;
    public final void expression() throws RecognitionException {
        try {
            // Exp.g:87:2: ( action )
            // Exp.g:87:4: action
            {
            pushFollow(FOLLOW_action_in_expression102);
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
    // Exp.g:89:1: definition : method verb ( endNode )? ( arg )* ( ':' )? NL block end ;
    public final void definition() throws RecognitionException {
        try {
            // Exp.g:90:2: ( method verb ( endNode )? ( arg )* ( ':' )? NL block end )
            // Exp.g:90:3: method verb ( endNode )? ( arg )* ( ':' )? NL block end
            {
            pushFollow(FOLLOW_method_in_definition111);
            method();

            state._fsp--;


            pushFollow(FOLLOW_verb_in_definition113);
            verb();

            state._fsp--;


            // Exp.g:90:15: ( endNode )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Word||LA6_0==26||LA6_0==31||LA6_0==33||LA6_0==35||LA6_0==54||LA6_0==58||LA6_0==62||LA6_0==98||(LA6_0 >= 101 && LA6_0 <= 103)||(LA6_0 >= 105 && LA6_0 <= 107)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Exp.g:90:15: endNode
                    {
                    pushFollow(FOLLOW_endNode_in_definition115);
                    endNode();

                    state._fsp--;


                    }
                    break;

            }


            // Exp.g:90:24: ( arg )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= 27 && LA7_0 <= 29)||(LA7_0 >= 36 && LA7_0 <= 37)||(LA7_0 >= 39 && LA7_0 <= 41)||(LA7_0 >= 43 && LA7_0 <= 48)||LA7_0==51||LA7_0==60||LA7_0==71||(LA7_0 >= 73 && LA7_0 <= 74)||LA7_0==87||(LA7_0 >= 89 && LA7_0 <= 91)||LA7_0==96||(LA7_0 >= 108 && LA7_0 <= 110)||(LA7_0 >= 119 && LA7_0 <= 120)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Exp.g:90:24: arg
            	    {
            	    pushFollow(FOLLOW_arg_in_definition118);
            	    arg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Exp.g:90:29: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Exp.g:90:29: ':'
                    {
                    match(input,17,FOLLOW_17_in_definition121); 

                    }
                    break;

            }


            match(input,NL,FOLLOW_NL_in_definition124); 

            pushFollow(FOLLOW_block_in_definition126);
            block();

            state._fsp--;


            pushFollow(FOLLOW_end_in_definition128);
            end();

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
    // Exp.g:93:1: if_then : ( 'if' condition 'then' action | If condition ( 'then' )? NL block end );
    public final void if_then() throws RecognitionException {
        try {
            // Exp.g:94:2: ( 'if' condition 'then' action | If condition ( 'then' )? NL block end )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==70) ) {
                alt10=1;
            }
            else if ( (LA10_0==If) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Exp.g:94:4: 'if' condition 'then' action
                    {
                    match(input,70,FOLLOW_70_in_if_then142); 

                    pushFollow(FOLLOW_condition_in_if_then144);
                    condition();

                    state._fsp--;


                    match(input,104,FOLLOW_104_in_if_then146); 

                    pushFollow(FOLLOW_action_in_if_then148);
                    action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:95:4: If condition ( 'then' )? NL block end
                    {
                    match(input,If,FOLLOW_If_in_if_then153); 

                    pushFollow(FOLLOW_condition_in_if_then155);
                    condition();

                    state._fsp--;


                    // Exp.g:95:17: ( 'then' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==104) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Exp.g:95:17: 'then'
                            {
                            match(input,104,FOLLOW_104_in_if_then157); 

                            }
                            break;

                    }


                    match(input,NL,FOLLOW_NL_in_if_then160); 

                    pushFollow(FOLLOW_block_in_if_then162);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_end_in_if_then164);
                    end();

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
    // Exp.g:98:1: once : 'once' condition ( 'then' )? action ;
    public final void once() throws RecognitionException {
        try {
            // Exp.g:99:2: ( 'once' condition ( 'then' )? action )
            // Exp.g:99:4: 'once' condition ( 'then' )? action
            {
            match(input,88,FOLLOW_88_in_once174); 

            pushFollow(FOLLOW_condition_in_once176);
            condition();

            state._fsp--;


            // Exp.g:99:21: ( 'then' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==104) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Exp.g:99:21: 'then'
                    {
                    match(input,104,FOLLOW_104_in_once178); 

                    }
                    break;

            }


            pushFollow(FOLLOW_action_in_once181);
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
    // Exp.g:105:1: action : ( set | verb | verb nod | endNode verb nod );
    public final void action() throws RecognitionException {
        try {
            // Exp.g:106:2: ( set | verb | verb nod | endNode verb nod )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 78:
            case 95:
            case 111:
            case 112:
            case 113:
                {
                alt12=1;
                }
                break;
            case 26:
            case 31:
            case 33:
            case 35:
            case 54:
            case 58:
            case 98:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
                {
                switch ( input.LA(2) ) {
                case 111:
                case 112:
                case 113:
                    {
                    alt12=1;
                    }
                    break;
                case Word:
                    {
                    int LA12_7 = input.LA(3);

                    if ( (LA12_7==18||LA12_7==20||LA12_7==22||LA12_7==42||LA12_7==75||LA12_7==115) ) {
                        alt12=1;
                    }
                    else if ( (LA12_7==Word||LA12_7==84) ) {
                        alt12=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case 62:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }

                }
                break;
            case Word:
                {
                switch ( input.LA(2) ) {
                case 18:
                case 20:
                case 22:
                case 42:
                case 75:
                case 115:
                    {
                    alt12=1;
                    }
                    break;
                case EOF:
                case NL:
                    {
                    alt12=2;
                    }
                    break;
                case Integer:
                case Quote:
                case Real:
                case 26:
                case 31:
                case 33:
                case 35:
                case 54:
                case 58:
                case 98:
                case 101:
                case 102:
                case 103:
                case 105:
                case 106:
                case 107:
                    {
                    alt12=3;
                    }
                    break;
                case Word:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NL:
                    case 27:
                    case 28:
                    case 29:
                    case 36:
                    case 37:
                    case 39:
                    case 40:
                    case 41:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 51:
                    case 60:
                    case 71:
                    case 73:
                    case 74:
                    case 84:
                    case 87:
                    case 89:
                    case 90:
                    case 91:
                    case 96:
                    case 108:
                    case 109:
                    case 110:
                    case 116:
                    case 119:
                    case 120:
                        {
                        alt12=3;
                        }
                        break;
                    case 102:
                        {
                        int LA12_21 = input.LA(4);

                        if ( ((isVerb(getText());)) ) {
                            alt12=3;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt12=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Integer:
                    case Quote:
                    case Real:
                    case Word:
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 54:
                    case 58:
                    case 98:
                    case 101:
                    case 103:
                    case 105:
                    case 106:
                    case 107:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 15, input);

                        throw nvae;

                    }

                    }
                    break;
                case 84:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }

                }
                break;
            case 62:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Exp.g:106:4: set
                    {
                    pushFollow(FOLLOW_set_in_action197);
                    set();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:106:8: verb
                    {
                    pushFollow(FOLLOW_verb_in_action199);
                    verb();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Exp.g:106:13: verb nod
                    {
                    pushFollow(FOLLOW_verb_in_action201);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_action203);
                    nod();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Exp.g:106:25: endNode verb nod
                    {
                    pushFollow(FOLLOW_endNode_in_action208);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_verb_in_action210);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_action212);
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
    // Exp.g:108:1: loopendNode : ( 'while' condition NL block end | 'as long as' condition NL block end );
    public final void loopendNode() throws RecognitionException {
        try {
            // Exp.g:109:2: ( 'while' condition NL block end | 'as long as' condition NL block end )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==117) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // Exp.g:109:4: 'while' condition NL block end
                    {
                    match(input,117,FOLLOW_117_in_loopendNode221); 

                    pushFollow(FOLLOW_condition_in_loopendNode223);
                    condition();

                    state._fsp--;


                    match(input,NL,FOLLOW_NL_in_loopendNode225); 

                    pushFollow(FOLLOW_block_in_loopendNode227);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_end_in_loopendNode229);
                    end();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:113:5: 'as long as' condition NL block end
                    {
                    match(input,38,FOLLOW_38_in_loopendNode237); 

                    pushFollow(FOLLOW_condition_in_loopendNode239);
                    condition();

                    state._fsp--;


                    match(input,NL,FOLLOW_NL_in_loopendNode241); 

                    pushFollow(FOLLOW_block_in_loopendNode243);
                    block();

                    state._fsp--;


                    pushFollow(FOLLOW_end_in_loopendNode245);
                    end();

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
    // Exp.g:117:1: set : ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value ;
    public final void set() throws RecognitionException {
        try {
            // Exp.g:118:2: ( ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value )
            // Exp.g:118:3: ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value
            {
            // Exp.g:118:3: ( let )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==78||LA14_0==95) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Exp.g:118:3: let
                    {
                    pushFollow(FOLLOW_let_in_set259);
                    let();

                    state._fsp--;


                    }
                    break;

            }


            // Exp.g:118:8: ( the )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26||LA15_0==31||LA15_0==33||LA15_0==35||LA15_0==54||LA15_0==58||LA15_0==98||(LA15_0 >= 101 && LA15_0 <= 103)||(LA15_0 >= 105 && LA15_0 <= 107)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Exp.g:118:8: the
                    {
                    pushFollow(FOLLOW_the_in_set262);
                    the();

                    state._fsp--;


                    }
                    break;

            }


            // Exp.g:118:14: ( 'var' | 'val' | 'value of' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= 111 && LA16_0 <= 113)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Exp.g:
                    {
                    if ( (input.LA(1) >= 111 && input.LA(1) <= 113) ) {
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


            pushFollow(FOLLOW_variable_in_set275);
            variable();

            state._fsp--;


            pushFollow(FOLLOW_be_in_set277);
            be();

            state._fsp--;


            pushFollow(FOLLOW_value_in_set279);
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
    // Exp.g:121:1: variable : Word ;
    public final void variable() throws RecognitionException {
        try {
            // Exp.g:122:2: ( Word )
            // Exp.g:122:4: Word
            {
            match(input,Word,FOLLOW_Word_in_variable290); 

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
    // Exp.g:124:1: value : nod ;
    public final void value() throws RecognitionException {
        try {
            // Exp.g:125:2: ( nod )
            // Exp.g:125:4: nod
            {
            pushFollow(FOLLOW_nod_in_value299);
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
    // Exp.g:128:1: arg : preposition endNode ;
    public final void arg() throws RecognitionException {
        try {
            // Exp.g:129:2: ( preposition endNode )
            // Exp.g:129:4: preposition endNode
            {
            pushFollow(FOLLOW_preposition_in_arg310);
            preposition();

            state._fsp--;


            pushFollow(FOLLOW_endNode_in_arg312);
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



    // $ANTLR start "selector"
    // Exp.g:131:1: selector : ( where | that | 'of' endNode | preposition nod );
    public final void selector() throws RecognitionException {
        try {
            // Exp.g:132:3: ( where | that | 'of' endNode | preposition nod )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt17=1;
                }
                break;
            case 102:
                {
                alt17=2;
                }
                break;
            case 84:
                {
                alt17=3;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 36:
            case 37:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 51:
            case 60:
            case 71:
            case 73:
            case 74:
            case 87:
            case 89:
            case 90:
            case 91:
            case 96:
            case 108:
            case 109:
            case 110:
            case 119:
            case 120:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // Exp.g:132:4: where
                    {
                    pushFollow(FOLLOW_where_in_selector321);
                    where();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:132:10: that
                    {
                    pushFollow(FOLLOW_that_in_selector323);
                    that();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Exp.g:132:17: 'of' endNode
                    {
                    match(input,84,FOLLOW_84_in_selector327); 

                    pushFollow(FOLLOW_endNode_in_selector329);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Exp.g:132:32: preposition nod
                    {
                    pushFollow(FOLLOW_preposition_in_selector333);
                    preposition();

                    state._fsp--;


                    pushFollow(FOLLOW_nod_in_selector335);
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



    // $ANTLR start "that"
    // Exp.g:136:1: that : ( 'that' verbium endNode | 'that' attrib );
    public final void that() throws RecognitionException {
        try {
            // Exp.g:137:3: ( 'that' verbium endNode | 'that' attrib )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==102) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==Word||LA18_1==19||(LA18_1 >= 21 && LA18_1 <= 24)||LA18_1==49||(LA18_1 >= 56 && LA18_1 <= 57)||(LA18_1 >= 63 && LA18_1 <= 64)||(LA18_1 >= 76 && LA18_1 <= 77)||LA18_1==80||LA18_1==83||LA18_1==85||LA18_1==97) ) {
                    alt18=1;
                }
                else if ( (LA18_1==99) ) {
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
                    // Exp.g:137:5: 'that' verbium endNode
                    {
                    match(input,102,FOLLOW_102_in_that351); 

                    pushFollow(FOLLOW_verbium_in_that353);
                    verbium();

                    state._fsp--;


                    pushFollow(FOLLOW_endNode_in_that355);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:137:30: 'that' attrib
                    {
                    match(input,102,FOLLOW_102_in_that359); 

                    pushFollow(FOLLOW_attrib_in_that361);
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
    // Exp.g:139:1: where : 'where' condition ;
    public final void where() throws RecognitionException {
        try {
            // Exp.g:140:2: ( 'where' condition )
            // Exp.g:140:3: 'where' condition
            {
            match(input,116,FOLLOW_116_in_where370); 

            pushFollow(FOLLOW_condition_in_where372);
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
    // Exp.g:142:1: condition : ( endcondition 'but not' endcondition | endcondition 'and' condition );
    public final void condition() throws RecognitionException {
        try {
            // Exp.g:143:2: ( endcondition 'but not' endcondition | endcondition 'and' condition )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 26:
            case 31:
            case 33:
            case 35:
            case 54:
            case 58:
            case 98:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==62) ) {
                    int LA19_4 = input.LA(3);

                    if ( (LA19_4==Word) ) {
                        alt19=1;
                    }
                    else if ( (LA19_4==62) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        throw nvae;

                    }
                }
                else if ( (LA19_1==Word) ) {
                    switch ( input.LA(3) ) {
                    case 84:
                        {
                        alt19=1;
                        }
                        break;
                    case 76:
                    case 83:
                    case 85:
                        {
                        alt19=1;
                        }
                        break;
                    case Word:
                        {
                        alt19=1;
                        }
                        break;
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 49:
                    case 56:
                    case 57:
                    case 63:
                    case 64:
                    case 77:
                    case 80:
                    case 97:
                        {
                        alt19=1;
                        }
                        break;
                    case 65:
                    case 66:
                    case 68:
                        {
                        alt19=1;
                        }
                        break;
                    case 100:
                        {
                        alt19=1;
                        }
                        break;
                    case 67:
                    case 79:
                    case 114:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 5, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==Word) ) {
                    switch ( input.LA(3) ) {
                    case 84:
                        {
                        alt19=1;
                        }
                        break;
                    case 76:
                    case 83:
                    case 85:
                        {
                        alt19=1;
                        }
                        break;
                    case Word:
                        {
                        alt19=1;
                        }
                        break;
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 49:
                    case 56:
                    case 57:
                    case 63:
                    case 64:
                    case 77:
                    case 80:
                    case 97:
                        {
                        alt19=1;
                        }
                        break;
                    case 65:
                    case 66:
                    case 68:
                        {
                        alt19=1;
                        }
                        break;
                    case 100:
                        {
                        alt19=1;
                        }
                        break;
                    case 67:
                    case 79:
                    case 114:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 6, input);

                        throw nvae;

                    }

                }
                else if ( (LA19_2==62) ) {
                    int LA19_7 = input.LA(3);

                    if ( (LA19_7==Word) ) {
                        alt19=1;
                    }
                    else if ( (LA19_7==62) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case Word:
                {
                switch ( input.LA(2) ) {
                case 84:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 54:
                    case 58:
                    case 98:
                    case 101:
                    case 102:
                    case 103:
                    case 105:
                    case 106:
                    case 107:
                        {
                        int LA19_33 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 33, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 62:
                        {
                        int LA19_34 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 34, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Word:
                        {
                        int LA19_35 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 35, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 8, input);

                        throw nvae;

                    }

                    }
                    break;
                case 76:
                case 83:
                case 85:
                    {
                    int LA19_9 = input.LA(3);

                    if ( (LA19_9==Word) ) {
                        int LA19_36 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 36, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA19_9==76||LA19_9==83||LA19_9==85) ) {
                        int LA19_37 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 37, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case Word:
                    {
                    int LA19_10 = input.LA(3);

                    if ( ((LA19_10 >= 27 && LA19_10 <= 29)||(LA19_10 >= 36 && LA19_10 <= 37)||(LA19_10 >= 39 && LA19_10 <= 41)||(LA19_10 >= 43 && LA19_10 <= 48)||LA19_10==51||LA19_10==60||LA19_10==71||(LA19_10 >= 73 && LA19_10 <= 74)||LA19_10==87||(LA19_10 >= 89 && LA19_10 <= 91)||LA19_10==96||(LA19_10 >= 108 && LA19_10 <= 110)||(LA19_10 >= 119 && LA19_10 <= 120)) ) {
                        int LA19_38 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 38, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 49:
                case 56:
                case 57:
                case 63:
                case 64:
                case 77:
                case 80:
                case 97:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 54:
                    case 58:
                    case 98:
                    case 101:
                    case 102:
                    case 103:
                    case 105:
                    case 106:
                    case 107:
                        {
                        int LA19_39 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 39, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 62:
                        {
                        int LA19_40 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 40, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Word:
                        {
                        int LA19_41 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 41, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                case 65:
                case 66:
                case 68:
                    {
                    int LA19_12 = input.LA(3);

                    if ( (LA19_12==62) ) {
                        int LA19_42 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 42, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 100:
                    {
                    int LA19_13 = input.LA(3);

                    if ( (LA19_13==50) ) {
                        alt19=1;
                    }
                    else if ( (LA19_13==34) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 67:
                case 79:
                case 114:
                    {
                    int LA19_14 = input.LA(3);

                    if ( (LA19_14==93) ) {
                        int LA19_45 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 45, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA19_14==Word) ) {
                        int LA19_46 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt19=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 46, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // Exp.g:143:3: endcondition 'but not' endcondition
                    {
                    pushFollow(FOLLOW_endcondition_in_condition381);
                    endcondition();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_condition383); 

                    pushFollow(FOLLOW_endcondition_in_condition385);
                    endcondition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:143:41: endcondition 'and' condition
                    {
                    pushFollow(FOLLOW_endcondition_in_condition389);
                    endcondition();

                    state._fsp--;


                    match(input,34,FOLLOW_34_in_condition391); 

                    pushFollow(FOLLOW_condition_in_condition393);
                    condition();

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
    // $ANTLR end "condition"



    // $ANTLR start "endcondition"
    // Exp.g:145:1: endcondition : ( endNode comparison endNode | endNode have adjective | endNode attribute | endNode verbTo verb | endNode hilfsverb gerundium );
    public final void endcondition() throws RecognitionException {
        try {
            // Exp.g:146:2: ( endNode comparison endNode | endNode have adjective | endNode attribute | endNode verbTo verb | endNode hilfsverb gerundium )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 26:
            case 31:
            case 33:
            case 35:
            case 54:
            case 58:
            case 98:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==62) ) {
                    int LA20_4 = input.LA(3);

                    if ( (LA20_4==Word) ) {
                        alt20=1;
                    }
                    else if ( (LA20_4==62) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;

                    }
                }
                else if ( (LA20_1==Word) ) {
                    switch ( input.LA(3) ) {
                    case 84:
                        {
                        alt20=1;
                        }
                        break;
                    case Word:
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 49:
                    case 56:
                    case 57:
                    case 63:
                    case 64:
                    case 76:
                    case 77:
                    case 80:
                    case 83:
                    case 85:
                    case 97:
                        {
                        alt20=1;
                        }
                        break;
                    case 65:
                    case 66:
                    case 68:
                        {
                        alt20=2;
                        }
                        break;
                    case 100:
                        {
                        alt20=3;
                        }
                        break;
                    case 67:
                    case 79:
                    case 114:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==Word) ) {
                    switch ( input.LA(3) ) {
                    case 84:
                        {
                        alt20=1;
                        }
                        break;
                    case Word:
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 49:
                    case 56:
                    case 57:
                    case 63:
                    case 64:
                    case 76:
                    case 77:
                    case 80:
                    case 83:
                    case 85:
                    case 97:
                        {
                        alt20=1;
                        }
                        break;
                    case 65:
                    case 66:
                    case 68:
                        {
                        alt20=2;
                        }
                        break;
                    case 100:
                        {
                        alt20=3;
                        }
                        break;
                    case 67:
                    case 79:
                    case 114:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 6, input);

                        throw nvae;

                    }

                }
                else if ( (LA20_2==62) ) {
                    int LA20_7 = input.LA(3);

                    if ( (LA20_7==Word) ) {
                        alt20=1;
                    }
                    else if ( (LA20_7==62) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
                }
                break;
            case Word:
                {
                switch ( input.LA(2) ) {
                case 84:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 54:
                    case 58:
                    case 98:
                    case 101:
                    case 102:
                    case 103:
                    case 105:
                    case 106:
                    case 107:
                        {
                        int LA20_33 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt20=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=2;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=3;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=4;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 33, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 62:
                        {
                        int LA20_34 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt20=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=2;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=3;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=4;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 34, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Word:
                        {
                        int LA20_35 = input.LA(4);

                        if ( ((isNoun(getText());)) ) {
                            alt20=1;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=2;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=3;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=4;
                        }
                        else if ( ((isNoun(getText());)) ) {
                            alt20=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 35, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 8, input);

                        throw nvae;

                    }

                    }
                    break;
                case Word:
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 49:
                case 56:
                case 57:
                case 63:
                case 64:
                case 76:
                case 77:
                case 80:
                case 83:
                case 85:
                case 97:
                    {
                    alt20=1;
                    }
                    break;
                case 65:
                case 66:
                case 68:
                    {
                    alt20=2;
                    }
                    break;
                case 100:
                    {
                    alt20=3;
                    }
                    break;
                case 67:
                case 79:
                case 114:
                    {
                    int LA20_14 = input.LA(3);

                    if ( (LA20_14==93) ) {
                        alt20=4;
                    }
                    else if ( (LA20_14==Word) ) {
                        alt20=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // Exp.g:146:3: endNode comparison endNode
                    {
                    pushFollow(FOLLOW_endNode_in_endcondition405);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_endcondition407);
                    comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_endNode_in_endcondition409);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:146:32: endNode have adjective
                    {
                    pushFollow(FOLLOW_endNode_in_endcondition413);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_have_in_endcondition415);
                    have();

                    state._fsp--;


                    pushFollow(FOLLOW_adjective_in_endcondition417);
                    adjective();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Exp.g:146:57: endNode attribute
                    {
                    pushFollow(FOLLOW_endNode_in_endcondition421);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_attribute_in_endcondition423);
                    attribute();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Exp.g:146:77: endNode verbTo verb
                    {
                    pushFollow(FOLLOW_endNode_in_endcondition427);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_verbTo_in_endcondition429);
                    verbTo();

                    state._fsp--;


                    pushFollow(FOLLOW_verb_in_endcondition431);
                    verb();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Exp.g:146:97: endNode hilfsverb gerundium
                    {
                    pushFollow(FOLLOW_endNode_in_endcondition433);
                    endNode();

                    state._fsp--;


                    pushFollow(FOLLOW_hilfsverb_in_endcondition435);
                    hilfsverb();

                    state._fsp--;


                    pushFollow(FOLLOW_gerundium_in_endcondition437);
                    gerundium();

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
    // $ANTLR end "endcondition"



    // $ANTLR start "verbTo"
    // Exp.g:149:1: verbTo : hilfsverb 's to' ;
    public final void verbTo() throws RecognitionException {
        try {
            // Exp.g:150:2: ( hilfsverb 's to' )
            // Exp.g:150:4: hilfsverb 's to'
            {
            pushFollow(FOLLOW_hilfsverb_in_verbTo448);
            hilfsverb();

            state._fsp--;


            match(input,93,FOLLOW_93_in_verbTo449); 

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
    // Exp.g:152:1: hilfsverb : ( 'want' | 'like' | 'hate' );
    public final void hilfsverb() throws RecognitionException {
        try {
            // Exp.g:153:2: ( 'want' | 'like' | 'hate' )
            // Exp.g:
            {
            if ( input.LA(1)==67||input.LA(1)==79||input.LA(1)==114 ) {
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
    // Exp.g:155:1: gerundium : verb 'ing' ;
    public final void gerundium() throws RecognitionException {
        try {
            // Exp.g:156:2: ( verb 'ing' )
            // Exp.g:156:4: verb 'ing'
            {
            pushFollow(FOLLOW_verb_in_gerundium474);
            verb();

            state._fsp--;


            match(input,72,FOLLOW_72_in_gerundium475); 

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
    // Exp.g:158:1: attribute : 'sucks' ;
    public final void attribute() throws RecognitionException {
        try {
            // Exp.g:159:2: ( 'sucks' )
            // Exp.g:159:4: 'sucks'
            {
            match(input,100,FOLLOW_100_in_attribute485); 

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
    // Exp.g:161:1: verbium : ( comparison | verb adverb );
    public final void verbium() throws RecognitionException {
        try {
            // Exp.g:162:2: ( comparison | verb adverb )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19||(LA21_0 >= 21 && LA21_0 <= 24)||LA21_0==49||(LA21_0 >= 56 && LA21_0 <= 57)||(LA21_0 >= 63 && LA21_0 <= 64)||(LA21_0 >= 76 && LA21_0 <= 77)||LA21_0==80||LA21_0==83||LA21_0==85||LA21_0==97) ) {
                alt21=1;
            }
            else if ( (LA21_0==Word) ) {
                int LA21_2 = input.LA(2);

                if ( ((LA21_2 >= 27 && LA21_2 <= 29)||(LA21_2 >= 36 && LA21_2 <= 37)||(LA21_2 >= 39 && LA21_2 <= 41)||(LA21_2 >= 43 && LA21_2 <= 48)||LA21_2==51||LA21_2==60||LA21_2==71||(LA21_2 >= 73 && LA21_2 <= 74)||LA21_2==87||(LA21_2 >= 89 && LA21_2 <= 91)||LA21_2==96||(LA21_2 >= 108 && LA21_2 <= 110)||(LA21_2 >= 119 && LA21_2 <= 120)) ) {
                    alt21=1;
                }
                else if ( (LA21_2==76||LA21_2==83||LA21_2==85) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Exp.g:162:3: comparison
                    {
                    pushFollow(FOLLOW_comparison_in_verbium493);
                    comparison();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:162:14: verb adverb
                    {
                    pushFollow(FOLLOW_verb_in_verbium495);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_adverb_in_verbium497);
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
    // Exp.g:164:1: verb :{...}? Word ;
    public final void verb() throws RecognitionException {
        try {
            // Exp.g:165:2: ({...}? Word )
            // Exp.g:165:4: {...}? Word
            {
            if ( !((isVerb(getText());)) ) {
                throw new FailedPredicateException(input, "verb", "isVerb(getText());");
            }

            match(input,Word,FOLLOW_Word_in_verb509); 

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
    // Exp.g:167:1: nod : ( number | quote | ( the )? noun ( selector )* );
    public final void nod() throws RecognitionException {
        try {
            // Exp.g:168:2: ( number | quote | ( the )? noun ( selector )* )
            int alt24=3;
            switch ( input.LA(1) ) {
            case Integer:
            case Real:
                {
                alt24=1;
                }
                break;
            case Quote:
                {
                alt24=2;
                }
                break;
            case Word:
            case 26:
            case 31:
            case 33:
            case 35:
            case 54:
            case 58:
            case 98:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // Exp.g:168:3: number
                    {
                    pushFollow(FOLLOW_number_in_nod517);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:168:10: quote
                    {
                    pushFollow(FOLLOW_quote_in_nod519);
                    quote();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Exp.g:168:17: ( the )? noun ( selector )*
                    {
                    // Exp.g:168:17: ( the )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==26||LA22_0==31||LA22_0==33||LA22_0==35||LA22_0==54||LA22_0==58||LA22_0==98||(LA22_0 >= 101 && LA22_0 <= 103)||(LA22_0 >= 105 && LA22_0 <= 107)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Exp.g:168:17: the
                            {
                            pushFollow(FOLLOW_the_in_nod522);
                            the();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_noun_in_nod525);
                    noun();

                    state._fsp--;


                    // Exp.g:168:27: ( selector )*
                    loop23:
                    do {
                        int alt23=2;
                        switch ( input.LA(1) ) {
                        case 116:
                            {
                            alt23=1;
                            }
                            break;
                        case 102:
                            {
                            alt23=1;
                            }
                            break;
                        case 84:
                            {
                            alt23=1;
                            }
                            break;
                        case 27:
                        case 28:
                        case 29:
                        case 36:
                        case 37:
                        case 39:
                        case 40:
                        case 41:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 51:
                        case 60:
                        case 71:
                        case 73:
                        case 74:
                        case 87:
                        case 89:
                        case 90:
                        case 91:
                        case 96:
                        case 108:
                        case 109:
                        case 110:
                        case 119:
                        case 120:
                            {
                            alt23=1;
                            }
                            break;

                        }

                        switch (alt23) {
                    	case 1 :
                    	    // Exp.g:168:28: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_nod528);
                    	    selector();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // Exp.g:170:1: noun :{...}? Word ;
    public final void noun() throws RecognitionException {
        try {
            // Exp.g:171:2: ({...}? Word )
            // Exp.g:171:3: {...}? Word
            {
            if ( !((isNoun(getText());)) ) {
                throw new FailedPredicateException(input, "noun", "isNoun(getText());");
            }

            match(input,Word,FOLLOW_Word_in_noun541); 

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
    // Exp.g:173:1: quote : Quote ;
    public final void quote() throws RecognitionException {
        try {
            // Exp.g:174:2: ( Quote )
            // Exp.g:174:4: Quote
            {
            match(input,Quote,FOLLOW_Quote_in_quote551); 

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
    // Exp.g:176:1: attrib : 'stinky' ;
    public final void attrib() throws RecognitionException {
        try {
            // Exp.g:177:2: ( 'stinky' )
            // Exp.g:177:4: 'stinky'
            {
            match(input,99,FOLLOW_99_in_attrib560); 

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
    // Exp.g:180:1: number : ( Integer | Real );
    public final void number() throws RecognitionException {
        try {
            // Exp.g:180:11: ( Integer | Real )
            // Exp.g:
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
    // Exp.g:183:1: endNode : ( endNode2 'of' endNode2 | endNode2 );
    public final void endNode() throws RecognitionException {
        try {
            // Exp.g:183:8: ( endNode2 'of' endNode2 | endNode2 )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // Exp.g:184:3: endNode2 'of' endNode2
                    {
                    pushFollow(FOLLOW_endNode2_in_endNode588);
                    endNode2();

                    state._fsp--;


                    match(input,84,FOLLOW_84_in_endNode590); 

                    pushFollow(FOLLOW_endNode2_in_endNode592);
                    endNode2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:184:28: endNode2
                    {
                    pushFollow(FOLLOW_endNode2_in_endNode596);
                    endNode2();

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
    // $ANTLR end "endNode"



    // $ANTLR start "selector2"
    // Exp.g:186:1: selector2 : ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) ;
    public final void selector2() throws RecognitionException {
        try {
            // Exp.g:187:2: ( ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) )
            // Exp.g:187:4: ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 )
            {
            if ( input.LA(1)==102||input.LA(1)==118 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Exp.g:187:19: ( adverb )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==76||LA26_0==83||LA26_0==85) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Exp.g:187:19: adverb
            	    {
            	    pushFollow(FOLLOW_adverb_in_selector2613);
            	    adverb();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            pushFollow(FOLLOW_verb_in_selector2616);
            verb();

            state._fsp--;


            match(input,94,FOLLOW_94_in_selector2617); 

            // Exp.g:187:35: ( preposition endNode2 )
            // Exp.g:187:36: preposition endNode2
            {
            pushFollow(FOLLOW_preposition_in_selector2620);
            preposition();

            state._fsp--;


            pushFollow(FOLLOW_endNode2_in_selector2622);
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
    // Exp.g:189:1: adverb : ( 'often' | 'never' | 'joyfully' );
    public final void adverb() throws RecognitionException {
        try {
            // Exp.g:190:2: ( 'often' | 'never' | 'joyfully' )
            // Exp.g:
            {
            if ( input.LA(1)==76||input.LA(1)==83||input.LA(1)==85 ) {
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
    // Exp.g:192:1: endNode2 : ( the )? ( adjective )* noun ;
    public final void endNode2() throws RecognitionException {
        try {
            // Exp.g:193:2: ( ( the )? ( adjective )* noun )
            // Exp.g:193:3: ( the )? ( adjective )* noun
            {
            // Exp.g:193:3: ( the )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26||LA27_0==31||LA27_0==33||LA27_0==35||LA27_0==54||LA27_0==58||LA27_0==98||(LA27_0 >= 101 && LA27_0 <= 103)||(LA27_0 >= 105 && LA27_0 <= 107)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Exp.g:193:3: the
                    {
                    pushFollow(FOLLOW_the_in_endNode2648);
                    the();

                    state._fsp--;


                    }
                    break;

            }


            // Exp.g:193:8: ( adjective )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==62) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Exp.g:193:8: adjective
            	    {
            	    pushFollow(FOLLOW_adjective_in_endNode2651);
            	    adjective();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            pushFollow(FOLLOW_noun_in_endNode2654);
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
    // Exp.g:195:1: adjective : 'funny' ;
    public final void adjective() throws RecognitionException {
        try {
            // Exp.g:196:2: ( 'funny' )
            // Exp.g:196:4: 'funny'
            {
            match(input,62,FOLLOW_62_in_adjective663); 

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



    // $ANTLR start "end"
    // Exp.g:198:1: end : ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' );
    public final void end() throws RecognitionException {
        try {
            // Exp.g:199:2: ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' )
            // Exp.g:
            {
            if ( input.LA(1)==25||input.LA(1)==30||input.LA(1)==32||input.LA(1)==53||input.LA(1)==55||input.LA(1)==59||input.LA(1)==86||input.LA(1)==92 ) {
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
    // $ANTLR end "end"



    // $ANTLR start "let"
    // Exp.g:206:1: let : ( 'let' | 'set' );
    public final void let() throws RecognitionException {
        try {
            // Exp.g:207:2: ( 'let' | 'set' )
            // Exp.g:
            {
            if ( input.LA(1)==78||input.LA(1)==95 ) {
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
    // Exp.g:209:1: method : ( 'how to' | 'function' | 'define' | 'method for' | 'method' );
    public final void method() throws RecognitionException {
        try {
            // Exp.g:210:2: ( 'how to' | 'function' | 'define' | 'method for' | 'method' )
            // Exp.g:
            {
            if ( input.LA(1)==52||input.LA(1)==61||input.LA(1)==69||(input.LA(1) >= 81 && input.LA(1) <= 82) ) {
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
    // Exp.g:212:1: comparison : ( ( adverb )* verb preposition | comparation );
    public final void comparison() throws RecognitionException {
        try {
            // Exp.g:213:2: ( ( adverb )* verb preposition | comparation )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Word||LA30_0==76||LA30_0==83||LA30_0==85) ) {
                alt30=1;
            }
            else if ( (LA30_0==19||(LA30_0 >= 21 && LA30_0 <= 24)||LA30_0==49||(LA30_0 >= 56 && LA30_0 <= 57)||(LA30_0 >= 63 && LA30_0 <= 64)||LA30_0==77||LA30_0==80||LA30_0==97) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Exp.g:213:4: ( adverb )* verb preposition
                    {
                    // Exp.g:213:4: ( adverb )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==76||LA29_0==83||LA29_0==85) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Exp.g:213:4: adverb
                    	    {
                    	    pushFollow(FOLLOW_adverb_in_comparison730);
                    	    adverb();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    pushFollow(FOLLOW_verb_in_comparison733);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_preposition_in_comparison735);
                    preposition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Exp.g:213:30: comparation
                    {
                    pushFollow(FOLLOW_comparation_in_comparison738);
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
    // Exp.g:215:1: comparation : ( '>' | '>=' | '==' | '<' | '=<' | 'gt' | 'lt' | 'eq' | 'bigger than' | 'greater than' | 'equals' | 'smaller than' | 'less than' );
    public final void comparation() throws RecognitionException {
        try {
            // Exp.g:216:2: ( '>' | '>=' | '==' | '<' | '=<' | 'gt' | 'lt' | 'eq' | 'bigger than' | 'greater than' | 'equals' | 'smaller than' | 'less than' )
            // Exp.g:
            {
            if ( input.LA(1)==19||(input.LA(1) >= 21 && input.LA(1) <= 24)||input.LA(1)==49||(input.LA(1) >= 56 && input.LA(1) <= 57)||(input.LA(1) >= 63 && input.LA(1) <= 64)||input.LA(1)==77||input.LA(1)==80||input.LA(1)==97 ) {
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
    // $ANTLR end "comparation"



    // $ANTLR start "the"
    // Exp.g:232:1: the : ( 'a' | 'an' | 'the' | 'these' | 'those' | 'any' | 'all' | 'some' | 'teh' | 'that' | 'every' | 'each' | 'this' );
    public final void the() throws RecognitionException {
        try {
            // Exp.g:232:5: ( 'a' | 'an' | 'the' | 'these' | 'those' | 'any' | 'all' | 'some' | 'teh' | 'that' | 'every' | 'each' | 'this' )
            // Exp.g:
            {
            if ( input.LA(1)==26||input.LA(1)==31||input.LA(1)==33||input.LA(1)==35||input.LA(1)==54||input.LA(1)==58||input.LA(1)==98||(input.LA(1) >= 101 && input.LA(1) <= 103)||(input.LA(1) >= 105 && input.LA(1) <= 107) ) {
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
    // $ANTLR end "the"



    // $ANTLR start "be"
    // Exp.g:234:1: be : ( 'is' | 'be' | 'was' | ':=' | '=' | '==' );
    public final void be() throws RecognitionException {
        try {
            // Exp.g:235:2: ( 'is' | 'be' | 'was' | ':=' | '=' | '==' )
            // Exp.g:
            {
            if ( input.LA(1)==18||input.LA(1)==20||input.LA(1)==22||input.LA(1)==42||input.LA(1)==75||input.LA(1)==115 ) {
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
    // $ANTLR end "be"



    // $ANTLR start "have"
    // Exp.g:236:1: have : ( 'has' | 'had' | 'have' );
    public final void have() throws RecognitionException {
        try {
            // Exp.g:237:2: ( 'has' | 'had' | 'have' )
            // Exp.g:
            {
            if ( (input.LA(1) >= 65 && input.LA(1) <= 66)||input.LA(1)==68 ) {
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
    // $ANTLR end "have"



    // $ANTLR start "preposition"
    // Exp.g:241:1: preposition : ( 'in' | 'above' | 'after' | 'against' | 'apart from' | 'around' | 'as' | 'aside from' | 'at' | 'before' | 'behind' | 'below' | 'beneath' | 'beside' | 'between' | 'considering' | 'from' | 'instead of' | 'into' | 'on' | 'onto' | 'out of' | 'over' | 'since' | 'through' | 'thru' | 'to' | 'with' | 'without' ) ;
    public final void preposition() throws RecognitionException {
        try {
            // Exp.g:241:12: ( ( 'in' | 'above' | 'after' | 'against' | 'apart from' | 'around' | 'as' | 'aside from' | 'at' | 'before' | 'behind' | 'below' | 'beneath' | 'beside' | 'between' | 'considering' | 'from' | 'instead of' | 'into' | 'on' | 'onto' | 'out of' | 'over' | 'since' | 'through' | 'thru' | 'to' | 'with' | 'without' ) )
            // Exp.g:
            {
            if ( (input.LA(1) >= 27 && input.LA(1) <= 29)||(input.LA(1) >= 36 && input.LA(1) <= 37)||(input.LA(1) >= 39 && input.LA(1) <= 41)||(input.LA(1) >= 43 && input.LA(1) <= 48)||input.LA(1)==51||input.LA(1)==60||input.LA(1)==71||(input.LA(1) >= 73 && input.LA(1) <= 74)||input.LA(1)==87||(input.LA(1) >= 89 && input.LA(1) <= 91)||input.LA(1)==96||(input.LA(1) >= 108 && input.LA(1) <= 110)||(input.LA(1) >= 119 && input.LA(1) <= 120) ) {
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
    // $ANTLR end "preposition"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\114\uffff";
    static final String DFA25_eofS =
        "\3\uffff\1\11\1\uffff\2\11\105\uffff";
    static final String DFA25_minS =
        "\3\20\1\13\1\20\2\13\2\20\77\uffff\3\0\1\uffff";
    static final String DFA25_maxS =
        "\1\153\2\76\1\170\1\76\2\170\1\76\1\153\77\uffff\3\0\1\uffff";
    static final String DFA25_acceptS =
        "\11\uffff\1\2\22\uffff\3\1\23\uffff\1\1\23\uffff\2\1\3\uffff\1\1";
    static final String DFA25_specialS =
        "\110\uffff\1\0\1\1\1\2\1\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\11\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\22\uffff"+
            "\1\1\3\uffff\1\1\3\uffff\1\2\43\uffff\1\1\2\uffff\3\1\1\uffff"+
            "\3\1",
            "\1\5\55\uffff\1\4",
            "\1\6\55\uffff\1\7",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\2\uffff"+
            "\1\11\1\uffff\3\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1"+
            "\uffff\2\11\1\uffff\5\11\2\uffff\1\11\1\10\1\11\1\uffff\1\11"+
            "\1\uffff\3\11\3\uffff\4\11\1\uffff\17\11\1\uffff\1\11\2\uffff"+
            "\2\11",
            "\1\34\55\uffff\1\35",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\2\uffff"+
            "\1\11\1\uffff\3\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1"+
            "\uffff\2\11\1\uffff\5\11\2\uffff\1\11\1\36\1\11\1\uffff\1\11"+
            "\1\uffff\3\11\3\uffff\4\11\1\uffff\17\11\1\uffff\1\11\2\uffff"+
            "\2\11",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\2\uffff"+
            "\1\11\1\uffff\3\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1"+
            "\uffff\2\11\1\uffff\5\11\2\uffff\1\11\1\62\1\11\1\uffff\1\11"+
            "\1\uffff\3\11\3\uffff\4\11\1\uffff\17\11\1\uffff\1\11\2\uffff"+
            "\2\11",
            "\1\106\55\uffff\1\107",
            "\1\112\11\uffff\1\110\4\uffff\1\110\1\uffff\1\110\1\uffff\1"+
            "\110\22\uffff\1\110\3\uffff\1\110\3\uffff\1\111\43\uffff\1\110"+
            "\2\uffff\3\110\1\uffff\3\110",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "183:1: endNode : ( endNode2 'of' endNode2 | endNode2 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_72 = input.LA(1);

                         
                        int index25_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText());)) ) {s = 75;}

                        else if ( ((isNoun(getText());)) ) {s = 9;}

                         
                        input.seek(index25_72);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA25_73 = input.LA(1);

                         
                        int index25_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText());)) ) {s = 75;}

                        else if ( ((isNoun(getText());)) ) {s = 9;}

                         
                        input.seek(index25_73);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA25_74 = input.LA(1);

                         
                        int index25_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((isNoun(getText());)) ) {s = 75;}

                        else if ( ((isNoun(getText());)) ) {s = 9;}

                         
                        input.seek(index25_74);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_statements_in_parse49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_parse55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statements_in_act65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_statements73 = new BitSet(new long[]{0x2010000000000002L,0x0000000000060020L});
    public static final BitSet FOLLOW_block_in_statements76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_block87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_block89 = new BitSet(new long[]{0x4440000A84010802L,0x00038EE480004000L});
    public static final BitSet FOLLOW_action_in_expression102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_definition111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_definition113 = new BitSet(new long[]{0x5449FBBABC030800L,0x01807EE50E800680L});
    public static final BitSet FOLLOW_endNode_in_definition115 = new BitSet(new long[]{0x1009FBB038020800L,0x018070010E800680L});
    public static final BitSet FOLLOW_arg_in_definition118 = new BitSet(new long[]{0x1009FBB038020800L,0x018070010E800680L});
    public static final BitSet FOLLOW_17_in_definition121 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_definition124 = new BitSet(new long[]{0x4CE0000BC6010000L,0x00038EE490404000L});
    public static final BitSet FOLLOW_block_in_definition126 = new BitSet(new long[]{0x08A0000142000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_end_in_definition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_if_then142 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_if_then144 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_if_then146 = new BitSet(new long[]{0x4440000A84010000L,0x00038EE480004000L});
    public static final BitSet FOLLOW_action_in_if_then148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_if_then153 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_if_then155 = new BitSet(new long[]{0x0000000000000800L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_if_then157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_if_then160 = new BitSet(new long[]{0x4CE0000BC6010000L,0x00038EE490404000L});
    public static final BitSet FOLLOW_block_in_if_then162 = new BitSet(new long[]{0x08A0000142000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_end_in_if_then164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_once174 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_once176 = new BitSet(new long[]{0x4440000A84010000L,0x00038FE480004000L});
    public static final BitSet FOLLOW_104_in_once178 = new BitSet(new long[]{0x4440000A84010000L,0x00038EE480004000L});
    public static final BitSet FOLLOW_action_in_once181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action201 = new BitSet(new long[]{0x0440000A84013100L,0x00000EE400000000L});
    public static final BitSet FOLLOW_nod_in_action203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_action208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_action210 = new BitSet(new long[]{0x0440000A84013100L,0x00000EE400000000L});
    public static final BitSet FOLLOW_nod_in_action212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_loopendNode221 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_loopendNode223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_loopendNode225 = new BitSet(new long[]{0x4CE0000BC6010000L,0x00038EE490404000L});
    public static final BitSet FOLLOW_block_in_loopendNode227 = new BitSet(new long[]{0x08A0000142000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_end_in_loopendNode229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_loopendNode237 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_loopendNode239 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_loopendNode241 = new BitSet(new long[]{0x4CE0000BC6010000L,0x00038EE490404000L});
    public static final BitSet FOLLOW_block_in_loopendNode243 = new BitSet(new long[]{0x08A0000142000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_end_in_loopendNode245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_set259 = new BitSet(new long[]{0x0440000A84010000L,0x00038EE400000000L});
    public static final BitSet FOLLOW_the_in_set262 = new BitSet(new long[]{0x0000000000010000L,0x0003800000000000L});
    public static final BitSet FOLLOW_variable_in_set275 = new BitSet(new long[]{0x0000040000540000L,0x0008000000000800L});
    public static final BitSet FOLLOW_be_in_set277 = new BitSet(new long[]{0x0440000A84013100L,0x00000EE400000000L});
    public static final BitSet FOLLOW_value_in_set279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Word_in_variable290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nod_in_value299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_arg310 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode_in_arg312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_in_selector321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_that_in_selector323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_selector327 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode_in_selector329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_selector333 = new BitSet(new long[]{0x0440000A84013100L,0x00000EE400000000L});
    public static final BitSet FOLLOW_nod_in_selector335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_that351 = new BitSet(new long[]{0x8302000001E90000L,0x0000000200293001L});
    public static final BitSet FOLLOW_verbium_in_that353 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode_in_that355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_that359 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_attrib_in_that361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_where370 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_where372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endcondition_in_condition381 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condition383 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endcondition_in_condition385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endcondition_in_condition389 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_condition391 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_condition_in_condition393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition405 = new BitSet(new long[]{0x8302000001E90000L,0x0000000200293001L});
    public static final BitSet FOLLOW_comparison_in_endcondition407 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode_in_endcondition409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_have_in_endcondition415 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_adjective_in_endcondition417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition421 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_attribute_in_endcondition423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition427 = new BitSet(new long[]{0x0000000000000000L,0x0004000000008008L});
    public static final BitSet FOLLOW_verbTo_in_endcondition429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_endcondition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition433 = new BitSet(new long[]{0x0000000000000000L,0x0004000000008008L});
    public static final BitSet FOLLOW_hilfsverb_in_endcondition435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_gerundium_in_endcondition437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hilfsverb_in_verbTo448 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_verbTo449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_gerundium474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_gerundium475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_attribute485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_verbium493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_verbium495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000281000L});
    public static final BitSet FOLLOW_adverb_in_verbium497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Word_in_verb509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_nod517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quote_in_nod519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_nod522 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_noun_in_nod525 = new BitSet(new long[]{0x1009FBB038000002L,0x019070410E900680L});
    public static final BitSet FOLLOW_selector_in_nod528 = new BitSet(new long[]{0x1009FBB038000002L,0x019070410E900680L});
    public static final BitSet FOLLOW_Word_in_noun541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Quote_in_quote551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_attrib560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode2_in_endNode588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_endNode590 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode2_in_endNode592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode2_in_endNode596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_selector2607 = new BitSet(new long[]{0x0000000000010000L,0x0000000000281000L});
    public static final BitSet FOLLOW_adverb_in_selector2613 = new BitSet(new long[]{0x0000000000010000L,0x0000000000281000L});
    public static final BitSet FOLLOW_verb_in_selector2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_selector2617 = new BitSet(new long[]{0x1009FBB038000000L,0x018070010E800680L});
    public static final BitSet FOLLOW_preposition_in_selector2620 = new BitSet(new long[]{0x4440000A84010000L,0x00000EE400000000L});
    public static final BitSet FOLLOW_endNode2_in_selector2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_endNode2648 = new BitSet(new long[]{0x4000000000010000L});
    public static final BitSet FOLLOW_adjective_in_endNode2651 = new BitSet(new long[]{0x4000000000010000L});
    public static final BitSet FOLLOW_noun_in_endNode2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_adjective663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adverb_in_comparison730 = new BitSet(new long[]{0x0000000000010000L,0x0000000000281000L});
    public static final BitSet FOLLOW_verb_in_comparison733 = new BitSet(new long[]{0x1009FBB038000000L,0x018070010E800680L});
    public static final BitSet FOLLOW_preposition_in_comparison735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparation_in_comparison738 = new BitSet(new long[]{0x0000000000000002L});

}