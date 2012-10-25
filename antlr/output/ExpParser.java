// $ANTLR 3.4 /Users/pannous/nlp/english-script/grammar/Exp.g 2012-02-11 23:13:57

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
public class ExpParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "ESC", "If", "Integer", "LETTER", "LINE_COMMENT", "NL", "Quote", "Real", "Reductions", "WS", "Word", "':'", "':='", "'<'", "'='", "'=<'", "'=='", "'>'", "'>='", "'OK'", "'a'", "'above'", "'after'", "'against'", "'all set'", "'all'", "'alrighty'", "'an'", "'and'", "'any'", "'apart from'", "'around'", "'as long as'", "'as'", "'aside from'", "'at'", "'be'", "'before'", "'behind'", "'below'", "'beneath'", "'beside'", "'between'", "'bigger than'", "'but not'", "'considering'", "'define'", "'done'", "'end'", "'eq'", "'equals'", "'finished'", "'from'", "'function'", "'funny'", "'greater than'", "'gt'", "'had'", "'has'", "'hate'", "'have'", "'how to'", "'if'", "'in'", "'ing'", "'instead of'", "'into'", "'is'", "'joyfully'", "'less than'", "'let'", "'like'", "'lt'", "'method for'", "'method'", "'never'", "'of'", "'often'", "'ok'", "'on'", "'once'", "'onto'", "'out of'", "'over'", "'qed'", "'s to'", "'s'", "'set'", "'since'", "'smaller than'", "'some'", "'stinky'", "'sucks'", "'teh'", "'that'", "'the'", "'then'", "'these'", "'those'", "'through'", "'thru'", "'to'", "'val'", "'value of'", "'var'", "'want'", "'was'", "'where'", "'while'", "'who'", "'with'", "'without'"
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "endcondition", "the", "comparation", "attribute", "be", 
    "verb", "parse", "gerundium", "verbium", "attrib", "loopendNode", "expression", 
    "method", "have", "definition", "selector2", "selector", "where", "statements", 
    "quote", "variable", "arg", "noun", "act", "endNode2", "let", "adjective", 
    "number", "action", "nod", "block", "adverb", "endNode", "set", "end", 
    "condition", "verbTo", "once", "that", "comparison", "if_then", "hilfsverb", 
    "value", "preposition"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public ExpParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public ExpParser(TokenStream input, int port, RecognizerSharedState state) {
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

public ExpParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return ExpParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/pannous/nlp/english-script/grammar/Exp.g"; }


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
    // /Users/pannous/nlp/english-script/grammar/Exp.g:74:1: parse returns [String value] : (exp= statements | EOF );
    public final String parse() throws RecognitionException {
        String value = null;


        ExpParser.statements_return exp =null;


        try { dbg.enterRule(getGrammarFileName(), "parse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:75:2: (exp= statements | EOF )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==Word||LA1_0==26||LA1_0==31||LA1_0==33||LA1_0==35||LA1_0==52||(LA1_0 >= 59 && LA1_0 <= 60)||LA1_0==67||LA1_0==76||(LA1_0 >= 79 && LA1_0 <= 80)||LA1_0==93||LA1_0==96||(LA1_0 >= 99 && LA1_0 <= 101)||(LA1_0 >= 103 && LA1_0 <= 104)||(LA1_0 >= 108 && LA1_0 <= 110)) ) {
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

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:75:4: exp= statements
                    {
                    dbg.location(75,7);
                    pushFollow(FOLLOW_statements_in_parse49);
                    exp=statements();

                    state._fsp--;

                    dbg.location(75,19);
                    value = (exp!=null?input.toString(exp.start,exp.stop):null);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:76:3: EOF
                    {
                    dbg.location(76,3);
                    match(input,EOF,FOLLOW_EOF_in_parse55); 
                    dbg.location(76,7);
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
        dbg.location(76, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "parse"



    // $ANTLR start "act"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:78:1: act : statements ;
    public final void act() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "act");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:78:5: ( statements )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:78:7: statements
            {
            dbg.location(78,7);
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
        dbg.location(78, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "act");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "act"


    public static class statements_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "statements"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:80:1: statements : ( ( definition )* | block );
    public final ExpParser.statements_return statements() throws RecognitionException {
        ExpParser.statements_return retval = new ExpParser.statements_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "statements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:81:3: ( ( definition )* | block )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case 52:
            case 59:
            case 67:
            case 79:
            case 80:
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
            case 60:
            case 76:
            case 93:
            case 96:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
            case 108:
            case 109:
            case 110:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:81:3: ( definition )*
                    {
                    dbg.location(81,3);
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:81:3: ( definition )*
                    try { dbg.enterSubRule(2);

                    loop2:
                    do {
                        int alt2=2;
                        try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==52||LA2_0==59||LA2_0==67||(LA2_0 >= 79 && LA2_0 <= 80)) ) {
                            alt2=1;
                        }


                        } finally {dbg.exitDecision(2);}

                        switch (alt2) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:81:3: definition
                    	    {
                    	    dbg.location(81,3);
                    	    pushFollow(FOLLOW_definition_in_statements73);
                    	    definition();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:81:15: block
                    {
                    dbg.location(81,15);
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
        dbg.location(81, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statements"



    // $ANTLR start "block"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:83:1: block : ( expression ( NL )+ )* ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:84:3: ( ( expression ( NL )+ )* )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:84:5: ( expression ( NL )+ )*
            {
            dbg.location(84,5);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:84:5: ( expression ( NL )+ )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==Word||LA5_0==26||LA5_0==31||LA5_0==33||LA5_0==35||LA5_0==60||LA5_0==76||LA5_0==93||LA5_0==96||(LA5_0 >= 99 && LA5_0 <= 101)||(LA5_0 >= 103 && LA5_0 <= 104)||(LA5_0 >= 108 && LA5_0 <= 110)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:84:6: expression ( NL )+
            	    {
            	    dbg.location(84,6);
            	    pushFollow(FOLLOW_expression_in_block87);
            	    expression();

            	    state._fsp--;

            	    dbg.location(84,17);
            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:84:17: ( NL )+
            	    int cnt4=0;
            	    try { dbg.enterSubRule(4);

            	    loop4:
            	    do {
            	        int alt4=2;
            	        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==NL) ) {
            	            alt4=1;
            	        }


            	        } finally {dbg.exitDecision(4);}

            	        switch (alt4) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:84:17: NL
            	    	    {
            	    	    dbg.location(84,17);
            	    	    match(input,NL,FOLLOW_NL_in_block89); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(4);}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(84, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "expression"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:86:1: expression : action ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:87:2: ( action )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:87:4: action
            {
            dbg.location(87,4);
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
        dbg.location(87, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "definition"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:89:1: definition : method verb ( endNode )? ( arg )* ( ':' )? NL block end ;
    public final void definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:2: ( method verb ( endNode )? ( arg )* ( ':' )? NL block end )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:3: method verb ( endNode )? ( arg )* ( ':' )? NL block end
            {
            dbg.location(90,3);
            pushFollow(FOLLOW_method_in_definition111);
            method();

            state._fsp--;

            dbg.location(90,10);
            pushFollow(FOLLOW_verb_in_definition113);
            verb();

            state._fsp--;

            dbg.location(90,15);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:15: ( endNode )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==Word||LA6_0==26||LA6_0==31||LA6_0==33||LA6_0==35||LA6_0==60||LA6_0==96||(LA6_0 >= 99 && LA6_0 <= 101)||(LA6_0 >= 103 && LA6_0 <= 104)) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:90:15: endNode
                    {
                    dbg.location(90,15);
                    pushFollow(FOLLOW_endNode_in_definition115);
                    endNode();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(90,24);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:24: ( arg )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= 27 && LA7_0 <= 29)||(LA7_0 >= 36 && LA7_0 <= 37)||(LA7_0 >= 39 && LA7_0 <= 41)||(LA7_0 >= 43 && LA7_0 <= 48)||LA7_0==51||LA7_0==58||LA7_0==69||(LA7_0 >= 71 && LA7_0 <= 72)||LA7_0==85||(LA7_0 >= 87 && LA7_0 <= 89)||LA7_0==94||(LA7_0 >= 105 && LA7_0 <= 107)||(LA7_0 >= 116 && LA7_0 <= 117)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:90:24: arg
            	    {
            	    dbg.location(90,24);
            	    pushFollow(FOLLOW_arg_in_definition118);
            	    arg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(90,29);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:90:29: ( ':' )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:90:29: ':'
                    {
                    dbg.location(90,29);
                    match(input,17,FOLLOW_17_in_definition121); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(90,34);
            match(input,NL,FOLLOW_NL_in_definition124); 
            dbg.location(90,37);
            pushFollow(FOLLOW_block_in_definition126);
            block();

            state._fsp--;

            dbg.location(90,43);
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
        dbg.location(90, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition"



    // $ANTLR start "if_then"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:93:1: if_then : ( 'if' condition 'then' action | If condition ( 'then' )? NL block end );
    public final void if_then() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "if_then");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:94:2: ( 'if' condition 'then' action | If condition ( 'then' )? NL block end )
            int alt10=2;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==68) ) {
                alt10=1;
            }
            else if ( (LA10_0==If) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:94:4: 'if' condition 'then' action
                    {
                    dbg.location(94,4);
                    match(input,68,FOLLOW_68_in_if_then142); 
                    dbg.location(94,9);
                    pushFollow(FOLLOW_condition_in_if_then144);
                    condition();

                    state._fsp--;

                    dbg.location(94,19);
                    match(input,102,FOLLOW_102_in_if_then146); 
                    dbg.location(94,26);
                    pushFollow(FOLLOW_action_in_if_then148);
                    action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:95:4: If condition ( 'then' )? NL block end
                    {
                    dbg.location(95,4);
                    match(input,If,FOLLOW_If_in_if_then153); 
                    dbg.location(95,7);
                    pushFollow(FOLLOW_condition_in_if_then155);
                    condition();

                    state._fsp--;

                    dbg.location(95,17);
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:95:17: ( 'then' )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==102) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/pannous/nlp/english-script/grammar/Exp.g:95:17: 'then'
                            {
                            dbg.location(95,17);
                            match(input,102,FOLLOW_102_in_if_then157); 

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(95,25);
                    match(input,NL,FOLLOW_NL_in_if_then160); 
                    dbg.location(95,28);
                    pushFollow(FOLLOW_block_in_if_then162);
                    block();

                    state._fsp--;

                    dbg.location(95,34);
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
        dbg.location(95, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_then");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_then"



    // $ANTLR start "once"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:98:1: once : 'once' condition ( 'then' )? action ;
    public final void once() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "once");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:99:2: ( 'once' condition ( 'then' )? action )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:99:4: 'once' condition ( 'then' )? action
            {
            dbg.location(99,4);
            match(input,86,FOLLOW_86_in_once174); 
            dbg.location(99,11);
            pushFollow(FOLLOW_condition_in_once176);
            condition();

            state._fsp--;

            dbg.location(99,21);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:99:21: ( 'then' )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==102) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:99:21: 'then'
                    {
                    dbg.location(99,21);
                    match(input,102,FOLLOW_102_in_once178); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(99,29);
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
        dbg.location(103, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "once");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "once"



    // $ANTLR start "action"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:105:1: action : ( set | verb | verb nod | endNode verb nod );
    public final void action() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:106:2: ( set | verb | verb nod | endNode verb nod )
            int alt12=4;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case 76:
            case 93:
            case 108:
            case 109:
            case 110:
                {
                alt12=1;
                }
                break;
            case 26:
            case 31:
            case 33:
            case 35:
            case 96:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
                {
                switch ( input.LA(2) ) {
                case 108:
                case 109:
                case 110:
                    {
                    alt12=1;
                    }
                    break;
                case Word:
                    {
                    int LA12_7 = input.LA(3);

                    if ( (LA12_7==18||LA12_7==20||LA12_7==22||LA12_7==42||LA12_7==73||LA12_7==112) ) {
                        alt12=1;
                    }
                    else if ( (LA12_7==Word||LA12_7==82) ) {
                        alt12=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 60:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    dbg.recognitionException(nvae);
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
                case 73:
                case 112:
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
                case 96:
                case 99:
                case 100:
                case 101:
                case 103:
                case 104:
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
                    case 58:
                    case 69:
                    case 71:
                    case 72:
                    case 82:
                    case 85:
                    case 87:
                    case 88:
                    case 89:
                    case 94:
                    case 105:
                    case 106:
                    case 107:
                    case 113:
                    case 116:
                    case 117:
                        {
                        alt12=3;
                        }
                        break;
                    case 100:
                        {
                        alt12=3;
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
                    case 96:
                    case 99:
                    case 101:
                    case 103:
                    case 104:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 15, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    }
                    break;
                case 82:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 60:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:106:4: set
                    {
                    dbg.location(106,4);
                    pushFollow(FOLLOW_set_in_action197);
                    set();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:106:8: verb
                    {
                    dbg.location(106,8);
                    pushFollow(FOLLOW_verb_in_action199);
                    verb();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:106:13: verb nod
                    {
                    dbg.location(106,13);
                    pushFollow(FOLLOW_verb_in_action201);
                    verb();

                    state._fsp--;

                    dbg.location(106,18);
                    pushFollow(FOLLOW_nod_in_action203);
                    nod();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:106:25: endNode verb nod
                    {
                    dbg.location(106,25);
                    pushFollow(FOLLOW_endNode_in_action208);
                    endNode();

                    state._fsp--;

                    dbg.location(106,33);
                    pushFollow(FOLLOW_verb_in_action210);
                    verb();

                    state._fsp--;

                    dbg.location(106,38);
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
        dbg.location(106, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "action"



    // $ANTLR start "loopendNode"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:108:1: loopendNode : ( 'while' condition NL block end | 'as long as' condition NL block end );
    public final void loopendNode() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "loopendNode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:109:2: ( 'while' condition NL block end | 'as long as' condition NL block end )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==114) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:109:4: 'while' condition NL block end
                    {
                    dbg.location(109,4);
                    match(input,114,FOLLOW_114_in_loopendNode221); 
                    dbg.location(109,12);
                    pushFollow(FOLLOW_condition_in_loopendNode223);
                    condition();

                    state._fsp--;

                    dbg.location(109,22);
                    match(input,NL,FOLLOW_NL_in_loopendNode225); 
                    dbg.location(109,25);
                    pushFollow(FOLLOW_block_in_loopendNode227);
                    block();

                    state._fsp--;

                    dbg.location(109,31);
                    pushFollow(FOLLOW_end_in_loopendNode229);
                    end();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:113:5: 'as long as' condition NL block end
                    {
                    dbg.location(113,5);
                    match(input,38,FOLLOW_38_in_loopendNode237); 
                    dbg.location(113,18);
                    pushFollow(FOLLOW_condition_in_loopendNode239);
                    condition();

                    state._fsp--;

                    dbg.location(113,28);
                    match(input,NL,FOLLOW_NL_in_loopendNode241); 
                    dbg.location(113,31);
                    pushFollow(FOLLOW_block_in_loopendNode243);
                    block();

                    state._fsp--;

                    dbg.location(113,37);
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
        dbg.location(114, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loopendNode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "loopendNode"



    // $ANTLR start "set"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:117:1: set : ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value ;
    public final void set() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:118:2: ( ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:118:3: ( let )? ( the )? ( 'var' | 'val' | 'value of' )? variable be value
            {
            dbg.location(118,3);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:118:3: ( let )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==76||LA14_0==93) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:118:3: let
                    {
                    dbg.location(118,3);
                    pushFollow(FOLLOW_let_in_set259);
                    let();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(118,8);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:118:8: ( the )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==26||LA15_0==31||LA15_0==33||LA15_0==35||LA15_0==96||(LA15_0 >= 99 && LA15_0 <= 101)||(LA15_0 >= 103 && LA15_0 <= 104)) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:118:8: the
                    {
                    dbg.location(118,8);
                    pushFollow(FOLLOW_the_in_set262);
                    the();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(118,14);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:118:14: ( 'var' | 'val' | 'value of' )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= 108 && LA16_0 <= 110)) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:
                    {
                    dbg.location(118,14);
                    if ( (input.LA(1) >= 108 && input.LA(1) <= 110) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(118,40);
            pushFollow(FOLLOW_variable_in_set275);
            variable();

            state._fsp--;

            dbg.location(118,49);
            pushFollow(FOLLOW_be_in_set277);
            be();

            state._fsp--;

            dbg.location(118,52);
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
        dbg.location(118, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "set"



    // $ANTLR start "variable"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:121:1: variable : Word ;
    public final void variable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:122:2: ( Word )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:122:4: Word
            {
            dbg.location(122,4);
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
        dbg.location(122, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variable"



    // $ANTLR start "value"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:124:1: value : nod ;
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:125:2: ( nod )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:125:4: nod
            {
            dbg.location(125,4);
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
        dbg.location(125, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "arg"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:128:1: arg : preposition endNode ;
    public final void arg() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:129:2: ( preposition endNode )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:129:4: preposition endNode
            {
            dbg.location(129,4);
            pushFollow(FOLLOW_preposition_in_arg310);
            preposition();

            state._fsp--;

            dbg.location(129,16);
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
        dbg.location(129, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arg"



    // $ANTLR start "selector"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:131:1: selector : ( where | that | 'of' endNode | preposition nod );
    public final void selector() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:132:3: ( where | that | 'of' endNode | preposition nod )
            int alt17=4;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            switch ( input.LA(1) ) {
            case 113:
                {
                alt17=1;
                }
                break;
            case 100:
                {
                alt17=2;
                }
                break;
            case 82:
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
            case 58:
            case 69:
            case 71:
            case 72:
            case 85:
            case 87:
            case 88:
            case 89:
            case 94:
            case 105:
            case 106:
            case 107:
            case 116:
            case 117:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:132:4: where
                    {
                    dbg.location(132,4);
                    pushFollow(FOLLOW_where_in_selector321);
                    where();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:132:10: that
                    {
                    dbg.location(132,10);
                    pushFollow(FOLLOW_that_in_selector323);
                    that();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:132:17: 'of' endNode
                    {
                    dbg.location(132,17);
                    match(input,82,FOLLOW_82_in_selector327); 
                    dbg.location(132,22);
                    pushFollow(FOLLOW_endNode_in_selector329);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:132:32: preposition nod
                    {
                    dbg.location(132,32);
                    pushFollow(FOLLOW_preposition_in_selector333);
                    preposition();

                    state._fsp--;

                    dbg.location(132,44);
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
        dbg.location(132, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "selector"



    // $ANTLR start "that"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:135:1: that : ( 'that' verbium endNode | 'that' attrib );
    public final void that() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "that");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:136:3: ( 'that' verbium endNode | 'that' attrib )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==100) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==Word||LA18_1==19||(LA18_1 >= 21 && LA18_1 <= 24)||LA18_1==49||(LA18_1 >= 55 && LA18_1 <= 56)||(LA18_1 >= 61 && LA18_1 <= 62)||(LA18_1 >= 74 && LA18_1 <= 75)||LA18_1==78||LA18_1==81||LA18_1==83||LA18_1==95) ) {
                    alt18=1;
                }
                else if ( (LA18_1==97) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:136:5: 'that' verbium endNode
                    {
                    dbg.location(136,5);
                    match(input,100,FOLLOW_100_in_that347); 
                    dbg.location(136,12);
                    pushFollow(FOLLOW_verbium_in_that349);
                    verbium();

                    state._fsp--;

                    dbg.location(136,20);
                    pushFollow(FOLLOW_endNode_in_that351);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:136:30: 'that' attrib
                    {
                    dbg.location(136,30);
                    match(input,100,FOLLOW_100_in_that355); 
                    dbg.location(136,37);
                    pushFollow(FOLLOW_attrib_in_that357);
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
        dbg.location(136, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "that");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "that"



    // $ANTLR start "where"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:138:1: where : 'where' condition ;
    public final void where() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "where");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:139:2: ( 'where' condition )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:139:3: 'where' condition
            {
            dbg.location(139,3);
            match(input,113,FOLLOW_113_in_where366); 
            dbg.location(139,11);
            pushFollow(FOLLOW_condition_in_where368);
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
        dbg.location(139, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "where");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "where"



    // $ANTLR start "condition"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:141:1: condition : ( endcondition 'but not' endcondition | endcondition 'and' condition );
    public final void condition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:142:2: ( endcondition 'but not' endcondition | endcondition 'and' condition )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            switch ( input.LA(1) ) {
            case 26:
            case 31:
            case 33:
            case 35:
            case 96:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==60) ) {
                    int LA19_4 = input.LA(3);

                    if ( (LA19_4==Word) ) {
                        alt19=1;
                    }
                    else if ( (LA19_4==60) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA19_1==Word) ) {
                    switch ( input.LA(3) ) {
                    case 82:
                        {
                        alt19=1;
                        }
                        break;
                    case 74:
                    case 81:
                    case 83:
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
                    case 55:
                    case 56:
                    case 61:
                    case 62:
                    case 75:
                    case 78:
                    case 95:
                        {
                        alt19=1;
                        }
                        break;
                    case 63:
                    case 64:
                    case 66:
                        {
                        alt19=1;
                        }
                        break;
                    case 98:
                        {
                        alt19=1;
                        }
                        break;
                    case 65:
                    case 77:
                    case 111:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 60:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==Word) ) {
                    switch ( input.LA(3) ) {
                    case 82:
                        {
                        alt19=1;
                        }
                        break;
                    case 74:
                    case 81:
                    case 83:
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
                    case 55:
                    case 56:
                    case 61:
                    case 62:
                    case 75:
                    case 78:
                    case 95:
                        {
                        alt19=1;
                        }
                        break;
                    case 63:
                    case 64:
                    case 66:
                        {
                        alt19=1;
                        }
                        break;
                    case 98:
                        {
                        alt19=1;
                        }
                        break;
                    case 65:
                    case 77:
                    case 111:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 6, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else if ( (LA19_2==60) ) {
                    int LA19_7 = input.LA(3);

                    if ( (LA19_7==Word) ) {
                        alt19=1;
                    }
                    else if ( (LA19_7==60) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Word:
                {
                switch ( input.LA(2) ) {
                case 82:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 96:
                    case 99:
                    case 100:
                    case 101:
                    case 103:
                    case 104:
                        {
                        alt19=1;
                        }
                        break;
                    case 60:
                        {
                        alt19=1;
                        }
                        break;
                    case Word:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    }
                    break;
                case 74:
                case 81:
                case 83:
                    {
                    int LA19_9 = input.LA(3);

                    if ( (LA19_9==Word) ) {
                        alt19=1;
                    }
                    else if ( (LA19_9==74||LA19_9==81||LA19_9==83) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case Word:
                    {
                    int LA19_10 = input.LA(3);

                    if ( ((LA19_10 >= 27 && LA19_10 <= 29)||(LA19_10 >= 36 && LA19_10 <= 37)||(LA19_10 >= 39 && LA19_10 <= 41)||(LA19_10 >= 43 && LA19_10 <= 48)||LA19_10==51||LA19_10==58||LA19_10==69||(LA19_10 >= 71 && LA19_10 <= 72)||LA19_10==85||(LA19_10 >= 87 && LA19_10 <= 89)||LA19_10==94||(LA19_10 >= 105 && LA19_10 <= 107)||(LA19_10 >= 116 && LA19_10 <= 117)) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 10, input);

                        dbg.recognitionException(nvae);
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
                case 55:
                case 56:
                case 61:
                case 62:
                case 75:
                case 78:
                case 95:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 96:
                    case 99:
                    case 100:
                    case 101:
                    case 103:
                    case 104:
                        {
                        alt19=1;
                        }
                        break;
                    case 60:
                        {
                        alt19=1;
                        }
                        break;
                    case Word:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    }
                    break;
                case 63:
                case 64:
                case 66:
                    {
                    int LA19_12 = input.LA(3);

                    if ( (LA19_12==60) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 12, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 98:
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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 65:
                case 77:
                case 111:
                    {
                    int LA19_14 = input.LA(3);

                    if ( (LA19_14==91) ) {
                        alt19=1;
                    }
                    else if ( (LA19_14==Word) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 14, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:142:3: endcondition 'but not' endcondition
                    {
                    dbg.location(142,3);
                    pushFollow(FOLLOW_endcondition_in_condition377);
                    endcondition();

                    state._fsp--;

                    dbg.location(142,16);
                    match(input,50,FOLLOW_50_in_condition379); 
                    dbg.location(142,26);
                    pushFollow(FOLLOW_endcondition_in_condition381);
                    endcondition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:142:41: endcondition 'and' condition
                    {
                    dbg.location(142,41);
                    pushFollow(FOLLOW_endcondition_in_condition385);
                    endcondition();

                    state._fsp--;

                    dbg.location(142,54);
                    match(input,34,FOLLOW_34_in_condition387); 
                    dbg.location(142,60);
                    pushFollow(FOLLOW_condition_in_condition389);
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
        dbg.location(142, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "condition"



    // $ANTLR start "endcondition"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:144:1: endcondition : ( endNode comparison endNode | endNode have adjective | endNode attribute | endNode verbTo verb | endNode hilfsverb gerundium );
    public final void endcondition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "endcondition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:145:2: ( endNode comparison endNode | endNode have adjective | endNode attribute | endNode verbTo verb | endNode hilfsverb gerundium )
            int alt20=5;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            switch ( input.LA(1) ) {
            case 26:
            case 31:
            case 33:
            case 35:
            case 96:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==60) ) {
                    int LA20_4 = input.LA(3);

                    if ( (LA20_4==Word) ) {
                        alt20=1;
                    }
                    else if ( (LA20_4==60) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA20_1==Word) ) {
                    switch ( input.LA(3) ) {
                    case 82:
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
                    case 55:
                    case 56:
                    case 61:
                    case 62:
                    case 74:
                    case 75:
                    case 78:
                    case 81:
                    case 83:
                    case 95:
                        {
                        alt20=1;
                        }
                        break;
                    case 63:
                    case 64:
                    case 66:
                        {
                        alt20=2;
                        }
                        break;
                    case 98:
                        {
                        alt20=3;
                        }
                        break;
                    case 65:
                    case 77:
                    case 111:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 60:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==Word) ) {
                    switch ( input.LA(3) ) {
                    case 82:
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
                    case 55:
                    case 56:
                    case 61:
                    case 62:
                    case 74:
                    case 75:
                    case 78:
                    case 81:
                    case 83:
                    case 95:
                        {
                        alt20=1;
                        }
                        break;
                    case 63:
                    case 64:
                    case 66:
                        {
                        alt20=2;
                        }
                        break;
                    case 98:
                        {
                        alt20=3;
                        }
                        break;
                    case 65:
                    case 77:
                    case 111:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 6, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else if ( (LA20_2==60) ) {
                    int LA20_7 = input.LA(3);

                    if ( (LA20_7==Word) ) {
                        alt20=1;
                    }
                    else if ( (LA20_7==60) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Word:
                {
                switch ( input.LA(2) ) {
                case 82:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 31:
                    case 33:
                    case 35:
                    case 96:
                    case 99:
                    case 100:
                    case 101:
                    case 103:
                    case 104:
                        {
                        alt20=1;
                        }
                        break;
                    case 60:
                        {
                        alt20=1;
                        }
                        break;
                    case Word:
                        {
                        alt20=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 8, input);

                        dbg.recognitionException(nvae);
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
                case 55:
                case 56:
                case 61:
                case 62:
                case 74:
                case 75:
                case 78:
                case 81:
                case 83:
                case 95:
                    {
                    alt20=1;
                    }
                    break;
                case 63:
                case 64:
                case 66:
                    {
                    alt20=2;
                    }
                    break;
                case 98:
                    {
                    alt20=3;
                    }
                    break;
                case 65:
                case 77:
                case 111:
                    {
                    int LA20_14 = input.LA(3);

                    if ( (LA20_14==91) ) {
                        alt20=4;
                    }
                    else if ( (LA20_14==Word) ) {
                        alt20=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 14, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:145:3: endNode comparison endNode
                    {
                    dbg.location(145,3);
                    pushFollow(FOLLOW_endNode_in_endcondition401);
                    endNode();

                    state._fsp--;

                    dbg.location(145,11);
                    pushFollow(FOLLOW_comparison_in_endcondition403);
                    comparison();

                    state._fsp--;

                    dbg.location(145,22);
                    pushFollow(FOLLOW_endNode_in_endcondition405);
                    endNode();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:145:32: endNode have adjective
                    {
                    dbg.location(145,32);
                    pushFollow(FOLLOW_endNode_in_endcondition409);
                    endNode();

                    state._fsp--;

                    dbg.location(145,40);
                    pushFollow(FOLLOW_have_in_endcondition411);
                    have();

                    state._fsp--;

                    dbg.location(145,45);
                    pushFollow(FOLLOW_adjective_in_endcondition413);
                    adjective();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:145:57: endNode attribute
                    {
                    dbg.location(145,57);
                    pushFollow(FOLLOW_endNode_in_endcondition417);
                    endNode();

                    state._fsp--;

                    dbg.location(145,65);
                    pushFollow(FOLLOW_attribute_in_endcondition419);
                    attribute();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:145:77: endNode verbTo verb
                    {
                    dbg.location(145,77);
                    pushFollow(FOLLOW_endNode_in_endcondition423);
                    endNode();

                    state._fsp--;

                    dbg.location(145,85);
                    pushFollow(FOLLOW_verbTo_in_endcondition425);
                    verbTo();

                    state._fsp--;

                    dbg.location(145,92);
                    pushFollow(FOLLOW_verb_in_endcondition427);
                    verb();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:145:97: endNode hilfsverb gerundium
                    {
                    dbg.location(145,97);
                    pushFollow(FOLLOW_endNode_in_endcondition429);
                    endNode();

                    state._fsp--;

                    dbg.location(145,105);
                    pushFollow(FOLLOW_hilfsverb_in_endcondition431);
                    hilfsverb();

                    state._fsp--;

                    dbg.location(145,115);
                    pushFollow(FOLLOW_gerundium_in_endcondition433);
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
        dbg.location(145, 123);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endcondition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "endcondition"



    // $ANTLR start "verbTo"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:148:1: verbTo : hilfsverb 's to' ;
    public final void verbTo() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "verbTo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:149:2: ( hilfsverb 's to' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:149:4: hilfsverb 's to'
            {
            dbg.location(149,4);
            pushFollow(FOLLOW_hilfsverb_in_verbTo444);
            hilfsverb();

            state._fsp--;

            dbg.location(149,13);
            match(input,91,FOLLOW_91_in_verbTo445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(149, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verbTo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "verbTo"



    // $ANTLR start "hilfsverb"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:151:1: hilfsverb : ( 'want' | 'like' | 'hate' );
    public final void hilfsverb() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "hilfsverb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:152:2: ( 'want' | 'like' | 'hate' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(152,2);
            if ( input.LA(1)==65||input.LA(1)==77||input.LA(1)==111 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(152, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hilfsverb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "hilfsverb"



    // $ANTLR start "gerundium"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:154:1: gerundium : verb 'ing' ;
    public final void gerundium() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "gerundium");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:155:2: ( verb 'ing' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:155:4: verb 'ing'
            {
            dbg.location(155,4);
            pushFollow(FOLLOW_verb_in_gerundium470);
            verb();

            state._fsp--;

            dbg.location(155,8);
            match(input,70,FOLLOW_70_in_gerundium471); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(155, 12);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "gerundium");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "gerundium"



    // $ANTLR start "attribute"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:157:1: attribute : 'sucks' ;
    public final void attribute() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "attribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:158:2: ( 'sucks' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:158:4: 'sucks'
            {
            dbg.location(158,4);
            match(input,98,FOLLOW_98_in_attribute481); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(158, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "attribute"



    // $ANTLR start "verbium"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:160:1: verbium : ( comparison | verb adverb );
    public final void verbium() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "verbium");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:161:2: ( comparison | verb adverb )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==19||(LA21_0 >= 21 && LA21_0 <= 24)||LA21_0==49||(LA21_0 >= 55 && LA21_0 <= 56)||(LA21_0 >= 61 && LA21_0 <= 62)||(LA21_0 >= 74 && LA21_0 <= 75)||LA21_0==78||LA21_0==81||LA21_0==83||LA21_0==95) ) {
                alt21=1;
            }
            else if ( (LA21_0==Word) ) {
                int LA21_2 = input.LA(2);

                if ( ((LA21_2 >= 27 && LA21_2 <= 29)||(LA21_2 >= 36 && LA21_2 <= 37)||(LA21_2 >= 39 && LA21_2 <= 41)||(LA21_2 >= 43 && LA21_2 <= 48)||LA21_2==51||LA21_2==58||LA21_2==69||(LA21_2 >= 71 && LA21_2 <= 72)||LA21_2==85||(LA21_2 >= 87 && LA21_2 <= 89)||LA21_2==94||(LA21_2 >= 105 && LA21_2 <= 107)||(LA21_2 >= 116 && LA21_2 <= 117)) ) {
                    alt21=1;
                }
                else if ( (LA21_2==74||LA21_2==81||LA21_2==83) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:161:3: comparison
                    {
                    dbg.location(161,3);
                    pushFollow(FOLLOW_comparison_in_verbium489);
                    comparison();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:161:14: verb adverb
                    {
                    dbg.location(161,14);
                    pushFollow(FOLLOW_verb_in_verbium491);
                    verb();

                    state._fsp--;

                    dbg.location(161,19);
                    pushFollow(FOLLOW_adverb_in_verbium493);
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
        dbg.location(161, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verbium");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "verbium"



    // $ANTLR start "verb"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:163:1: verb : w= Word ;
    public final void verb() throws RecognitionException {
        Token w=null;

        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:164:2: (w= Word )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:164:4: w= Word
            {
            dbg.location(164,5);
            w=(Token)match(input,Word,FOLLOW_Word_in_verb505); 
            dbg.location(164,10);
            isVerb(w.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(164, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "verb"



    // $ANTLR start "nod"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:166:1: nod : ( number | quote | ( the )? noun ( selector )* );
    public final void nod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "nod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:167:2: ( number | quote | ( the )? noun ( selector )* )
            int alt24=3;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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
            case 96:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:3: number
                    {
                    dbg.location(167,3);
                    pushFollow(FOLLOW_number_in_nod514);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:10: quote
                    {
                    dbg.location(167,10);
                    pushFollow(FOLLOW_quote_in_nod516);
                    quote();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:17: ( the )? noun ( selector )*
                    {
                    dbg.location(167,17);
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:17: ( the )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==26||LA22_0==31||LA22_0==33||LA22_0==35||LA22_0==96||(LA22_0 >= 99 && LA22_0 <= 101)||(LA22_0 >= 103 && LA22_0 <= 104)) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/pannous/nlp/english-script/grammar/Exp.g:167:17: the
                            {
                            dbg.location(167,17);
                            pushFollow(FOLLOW_the_in_nod519);
                            the();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(167,22);
                    pushFollow(FOLLOW_noun_in_nod522);
                    noun();

                    state._fsp--;

                    dbg.location(167,27);
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:27: ( selector )*
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                        switch ( input.LA(1) ) {
                        case 113:
                            {
                            alt23=1;
                            }
                            break;
                        case 100:
                            {
                            alt23=1;
                            }
                            break;
                        case 82:
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
                        case 58:
                        case 69:
                        case 71:
                        case 72:
                        case 85:
                        case 87:
                        case 88:
                        case 89:
                        case 94:
                        case 105:
                        case 106:
                        case 107:
                        case 116:
                        case 117:
                            {
                            alt23=1;
                            }
                            break;

                        }

                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:167:28: selector
                    	    {
                    	    dbg.location(167,28);
                    	    pushFollow(FOLLOW_selector_in_nod525);
                    	    selector();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(23);}


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
        dbg.location(167, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nod"



    // $ANTLR start "noun"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:169:1: noun : w= Word ;
    public final void noun() throws RecognitionException {
        Token w=null;

        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:170:2: (w= Word )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:170:3: w= Word
            {
            dbg.location(170,4);
            w=(Token)match(input,Word,FOLLOW_Word_in_noun538); 
            dbg.location(170,10);
            isNoun(w.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(170, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "noun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "noun"



    // $ANTLR start "quote"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:172:1: quote : Quote ;
    public final void quote() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "quote");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:173:2: ( Quote )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:173:4: Quote
            {
            dbg.location(173,4);
            match(input,Quote,FOLLOW_Quote_in_quote550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(173, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "quote");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "quote"



    // $ANTLR start "attrib"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:175:1: attrib : 'stinky' ;
    public final void attrib() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "attrib");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:176:2: ( 'stinky' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:176:4: 'stinky'
            {
            dbg.location(176,4);
            match(input,97,FOLLOW_97_in_attrib559); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(176, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attrib");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "attrib"



    // $ANTLR start "number"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:179:1: number : ( Integer | Real );
    public final void number() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:179:11: ( Integer | Real )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(179,11);
            if ( input.LA(1)==Integer||input.LA(1)==Real ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(179, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "number"



    // $ANTLR start "endNode"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:182:1: endNode : ( endNode2 'of' endNode2 | endNode2 );
    public final void endNode() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "endNode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:182:8: ( endNode2 'of' endNode2 | endNode2 )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            try {
                isCyclicDecision = true;
                alt25 = dfa25.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:183:3: endNode2 'of' endNode2
                    {
                    dbg.location(183,3);
                    pushFollow(FOLLOW_endNode2_in_endNode587);
                    endNode2();

                    state._fsp--;

                    dbg.location(183,12);
                    match(input,82,FOLLOW_82_in_endNode589); 
                    dbg.location(183,17);
                    pushFollow(FOLLOW_endNode2_in_endNode591);
                    endNode2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:183:28: endNode2
                    {
                    dbg.location(183,28);
                    pushFollow(FOLLOW_endNode2_in_endNode595);
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
        dbg.location(183, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endNode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "endNode"



    // $ANTLR start "selector2"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:185:1: selector2 : ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) ;
    public final void selector2() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "selector2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:186:2: ( ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 ) )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:186:4: ( 'that' | 'who' ) ( adverb )* verb 's' ( preposition endNode2 )
            {
            dbg.location(186,4);
            if ( input.LA(1)==100||input.LA(1)==115 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(186,19);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:186:19: ( adverb )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==74||LA26_0==81||LA26_0==83) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:186:19: adverb
            	    {
            	    dbg.location(186,19);
            	    pushFollow(FOLLOW_adverb_in_selector2612);
            	    adverb();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(186,27);
            pushFollow(FOLLOW_verb_in_selector2615);
            verb();

            state._fsp--;

            dbg.location(186,31);
            match(input,92,FOLLOW_92_in_selector2616); 
            dbg.location(186,35);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:186:35: ( preposition endNode2 )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:186:36: preposition endNode2
            {
            dbg.location(186,36);
            pushFollow(FOLLOW_preposition_in_selector2619);
            preposition();

            state._fsp--;

            dbg.location(186,48);
            pushFollow(FOLLOW_endNode2_in_selector2621);
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
        dbg.location(186, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "selector2"



    // $ANTLR start "adverb"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:188:1: adverb : ( 'often' | 'never' | 'joyfully' );
    public final void adverb() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "adverb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:189:2: ( 'often' | 'never' | 'joyfully' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(189,2);
            if ( input.LA(1)==74||input.LA(1)==81||input.LA(1)==83 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(189, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "adverb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "adverb"



    // $ANTLR start "endNode2"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:191:1: endNode2 : ( the )? ( adjective )* noun ;
    public final void endNode2() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "endNode2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:192:2: ( ( the )? ( adjective )* noun )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:192:3: ( the )? ( adjective )* noun
            {
            dbg.location(192,3);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:192:3: ( the )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==26||LA27_0==31||LA27_0==33||LA27_0==35||LA27_0==96||(LA27_0 >= 99 && LA27_0 <= 101)||(LA27_0 >= 103 && LA27_0 <= 104)) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:192:3: the
                    {
                    dbg.location(192,3);
                    pushFollow(FOLLOW_the_in_endNode2647);
                    the();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(192,8);
            // /Users/pannous/nlp/english-script/grammar/Exp.g:192:8: ( adjective )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==60) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/pannous/nlp/english-script/grammar/Exp.g:192:8: adjective
            	    {
            	    dbg.location(192,8);
            	    pushFollow(FOLLOW_adjective_in_endNode2650);
            	    adjective();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}

            dbg.location(192,19);
            pushFollow(FOLLOW_noun_in_endNode2653);
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
        dbg.location(192, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endNode2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "endNode2"



    // $ANTLR start "adjective"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:194:1: adjective : 'funny' ;
    public final void adjective() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "adjective");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:195:2: ( 'funny' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:195:4: 'funny'
            {
            dbg.location(195,4);
            match(input,60,FOLLOW_60_in_adjective662); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(195, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "adjective");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "adjective"



    // $ANTLR start "end"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:197:1: end : ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' );
    public final void end() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "end");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:198:2: ( 'ok' | 'OK' | 'alrighty' | 'done' | 'end' | 'all set' | 'finished' | 'qed' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(198,2);
            if ( input.LA(1)==25||input.LA(1)==30||input.LA(1)==32||(input.LA(1) >= 53 && input.LA(1) <= 54)||input.LA(1)==57||input.LA(1)==84||input.LA(1)==90 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(198, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "end");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "end"



    // $ANTLR start "let"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:205:1: let : ( 'let' | 'set' );
    public final void let() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "let");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:206:2: ( 'let' | 'set' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(206,2);
            if ( input.LA(1)==76||input.LA(1)==93 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(206, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "let");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "let"



    // $ANTLR start "method"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:208:1: method : ( 'how to' | 'function' | 'define' | 'method for' | 'method' );
    public final void method() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:209:2: ( 'how to' | 'function' | 'define' | 'method for' | 'method' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(209,2);
            if ( input.LA(1)==52||input.LA(1)==59||input.LA(1)==67||(input.LA(1) >= 79 && input.LA(1) <= 80) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(209, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "method"



    // $ANTLR start "comparison"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:211:1: comparison : ( ( adverb )* verb preposition | comparation );
    public final void comparison() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "comparison");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:212:2: ( ( adverb )* verb preposition | comparation )
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==Word||LA30_0==74||LA30_0==81||LA30_0==83) ) {
                alt30=1;
            }
            else if ( (LA30_0==19||(LA30_0 >= 21 && LA30_0 <= 24)||LA30_0==49||(LA30_0 >= 55 && LA30_0 <= 56)||(LA30_0 >= 61 && LA30_0 <= 62)||LA30_0==75||LA30_0==78||LA30_0==95) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:212:4: ( adverb )* verb preposition
                    {
                    dbg.location(212,4);
                    // /Users/pannous/nlp/english-script/grammar/Exp.g:212:4: ( adverb )*
                    try { dbg.enterSubRule(29);

                    loop29:
                    do {
                        int alt29=2;
                        try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==74||LA29_0==81||LA29_0==83) ) {
                            alt29=1;
                        }


                        } finally {dbg.exitDecision(29);}

                        switch (alt29) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/pannous/nlp/english-script/grammar/Exp.g:212:4: adverb
                    	    {
                    	    dbg.location(212,4);
                    	    pushFollow(FOLLOW_adverb_in_comparison729);
                    	    adverb();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(212,12);
                    pushFollow(FOLLOW_verb_in_comparison732);
                    verb();

                    state._fsp--;

                    dbg.location(212,17);
                    pushFollow(FOLLOW_preposition_in_comparison734);
                    preposition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/pannous/nlp/english-script/grammar/Exp.g:212:30: comparation
                    {
                    dbg.location(212,30);
                    pushFollow(FOLLOW_comparation_in_comparison737);
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
        dbg.location(212, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparison");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comparison"



    // $ANTLR start "comparation"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:214:1: comparation : ( '>' | '>=' | '==' | '<' | '=<' | 'gt' | 'lt' | 'eq' | 'bigger than' | 'greater than' | 'equals' | 'smaller than' | 'less than' );
    public final void comparation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "comparation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:215:2: ( '>' | '>=' | '==' | '<' | '=<' | 'gt' | 'lt' | 'eq' | 'bigger than' | 'greater than' | 'equals' | 'smaller than' | 'less than' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(215,2);
            if ( input.LA(1)==19||(input.LA(1) >= 21 && input.LA(1) <= 24)||input.LA(1)==49||(input.LA(1) >= 55 && input.LA(1) <= 56)||(input.LA(1) >= 61 && input.LA(1) <= 62)||input.LA(1)==75||input.LA(1)==78||input.LA(1)==95 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(215, 105);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comparation"



    // $ANTLR start "the"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:231:1: the : ( 'a' | 'an' | 'the' | 'these' | 'those' | 'any' | 'all' | 'some' | 'teh' | 'that' );
    public final void the() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "the");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:231:5: ( 'a' | 'an' | 'the' | 'these' | 'those' | 'any' | 'all' | 'some' | 'teh' | 'that' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(231,5);
            if ( input.LA(1)==26||input.LA(1)==31||input.LA(1)==33||input.LA(1)==35||input.LA(1)==96||(input.LA(1) >= 99 && input.LA(1) <= 101)||(input.LA(1) >= 103 && input.LA(1) <= 104) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(231, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "the");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "the"



    // $ANTLR start "be"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:233:1: be : ( 'is' | 'be' | 'was' | ':=' | '=' | '==' );
    public final void be() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:234:2: ( 'is' | 'be' | 'was' | ':=' | '=' | '==' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(234,2);
            if ( input.LA(1)==18||input.LA(1)==20||input.LA(1)==22||input.LA(1)==42||input.LA(1)==73||input.LA(1)==112 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(234, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "be");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "be"



    // $ANTLR start "have"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:235:1: have : ( 'has' | 'had' | 'have' );
    public final void have() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "have");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:236:2: ( 'has' | 'had' | 'have' )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(236,2);
            if ( (input.LA(1) >= 63 && input.LA(1) <= 64)||input.LA(1)==66 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(236, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "have");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "have"



    // $ANTLR start "preposition"
    // /Users/pannous/nlp/english-script/grammar/Exp.g:240:1: preposition : ( 'in' | 'above' | 'after' | 'against' | 'apart from' | 'around' | 'as' | 'aside from' | 'at' | 'before' | 'behind' | 'below' | 'beneath' | 'beside' | 'between' | 'considering' | 'from' | 'instead of' | 'into' | 'on' | 'onto' | 'out of' | 'over' | 'since' | 'through' | 'thru' | 'to' | 'with' | 'without' ) ;
    public final void preposition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "preposition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 0);

        try {
            // /Users/pannous/nlp/english-script/grammar/Exp.g:240:12: ( ( 'in' | 'above' | 'after' | 'against' | 'apart from' | 'around' | 'as' | 'aside from' | 'at' | 'before' | 'behind' | 'below' | 'beneath' | 'beside' | 'between' | 'considering' | 'from' | 'instead of' | 'into' | 'on' | 'onto' | 'out of' | 'over' | 'since' | 'through' | 'thru' | 'to' | 'with' | 'without' ) )
            dbg.enterAlt(1);

            // /Users/pannous/nlp/english-script/grammar/Exp.g:
            {
            dbg.location(240,12);
            if ( (input.LA(1) >= 27 && input.LA(1) <= 29)||(input.LA(1) >= 36 && input.LA(1) <= 37)||(input.LA(1) >= 39 && input.LA(1) <= 41)||(input.LA(1) >= 43 && input.LA(1) <= 48)||input.LA(1)==51||input.LA(1)==58||input.LA(1)==69||(input.LA(1) >= 71 && input.LA(1) <= 72)||input.LA(1)==85||(input.LA(1) >= 87 && input.LA(1) <= 89)||input.LA(1)==94||(input.LA(1) >= 105 && input.LA(1) <= 107)||(input.LA(1) >= 116 && input.LA(1) <= 117) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(241, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "preposition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "preposition"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\113\uffff";
    static final String DFA25_eofS =
        "\3\uffff\1\11\1\uffff\2\11\104\uffff";
    static final String DFA25_minS =
        "\3\20\1\13\1\20\2\13\2\20\102\uffff";
    static final String DFA25_maxS =
        "\1\150\2\74\1\165\1\74\2\165\1\74\1\150\102\uffff";
    static final String DFA25_acceptS =
        "\11\uffff\1\2\22\uffff\3\1\23\uffff\1\1\23\uffff\5\1";
    static final String DFA25_specialS =
        "\113\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\11\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\30\uffff"+
            "\1\2\43\uffff\1\1\2\uffff\3\1\1\uffff\2\1",
            "\1\5\53\uffff\1\4",
            "\1\6\53\uffff\1\7",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\3\uffff"+
            "\2\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1\uffff\2\11\1"+
            "\uffff\5\11\2\uffff\1\11\1\10\1\11\1\uffff\1\11\1\uffff\3\11"+
            "\3\uffff\4\11\1\uffff\16\11\1\uffff\1\11\2\uffff\2\11",
            "\1\34\53\uffff\1\35",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\3\uffff"+
            "\2\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1\uffff\2\11\1"+
            "\uffff\5\11\2\uffff\1\11\1\36\1\11\1\uffff\1\11\1\uffff\3\11"+
            "\3\uffff\4\11\1\uffff\16\11\1\uffff\1\11\2\uffff\2\11",
            "\1\11\4\uffff\2\11\1\uffff\1\11\1\uffff\4\11\1\uffff\4\11\1"+
            "\uffff\1\11\1\uffff\5\11\1\uffff\3\11\1\uffff\11\11\3\uffff"+
            "\2\11\1\uffff\1\11\1\uffff\7\11\2\uffff\1\11\1\uffff\2\11\1"+
            "\uffff\5\11\2\uffff\1\11\1\62\1\11\1\uffff\1\11\1\uffff\3\11"+
            "\3\uffff\4\11\1\uffff\16\11\1\uffff\1\11\2\uffff\2\11",
            "\1\106\53\uffff\1\107",
            "\1\112\11\uffff\1\110\4\uffff\1\110\1\uffff\1\110\1\uffff\1"+
            "\110\30\uffff\1\111\43\uffff\1\110\2\uffff\3\110\1\uffff\2\110",
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
            "",
            "",
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
            return "182:1: endNode : ( endNode2 'of' endNode2 | endNode2 );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_statements_in_parse49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_parse55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statements_in_act65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_statements73 = new BitSet(new long[]{0x0810000000000002L,0x0000000000018008L});
    public static final BitSet FOLLOW_block_in_statements76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_block87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_block89 = new BitSet(new long[]{0x1000000A84010802L,0x000071B920001000L});
    public static final BitSet FOLLOW_action_in_expression102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_definition111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_definition113 = new BitSet(new long[]{0x1409FBBABC030800L,0x00300FB943A001A0L});
    public static final BitSet FOLLOW_endNode_in_definition115 = new BitSet(new long[]{0x0409FBB038020800L,0x00300E0043A001A0L});
    public static final BitSet FOLLOW_arg_in_definition118 = new BitSet(new long[]{0x0409FBB038020800L,0x00300E0043A001A0L});
    public static final BitSet FOLLOW_17_in_definition121 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_definition124 = new BitSet(new long[]{0x1260000BC6010000L,0x000071B924101000L});
    public static final BitSet FOLLOW_block_in_definition126 = new BitSet(new long[]{0x0260000142000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_end_in_definition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_if_then142 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_if_then144 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_then146 = new BitSet(new long[]{0x1000000A84010000L,0x000071B920001000L});
    public static final BitSet FOLLOW_action_in_if_then148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_if_then153 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_if_then155 = new BitSet(new long[]{0x0000000000000800L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_then157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_if_then160 = new BitSet(new long[]{0x1260000BC6010000L,0x000071B924101000L});
    public static final BitSet FOLLOW_block_in_if_then162 = new BitSet(new long[]{0x0260000142000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_end_in_if_then164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_once174 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_once176 = new BitSet(new long[]{0x1000000A84010000L,0x000071F920001000L});
    public static final BitSet FOLLOW_102_in_once178 = new BitSet(new long[]{0x1000000A84010000L,0x000071B920001000L});
    public static final BitSet FOLLOW_action_in_once181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_action201 = new BitSet(new long[]{0x0000000A84013100L,0x000001B900000000L});
    public static final BitSet FOLLOW_nod_in_action203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_action208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_action210 = new BitSet(new long[]{0x0000000A84013100L,0x000001B900000000L});
    public static final BitSet FOLLOW_nod_in_action212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_loopendNode221 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_loopendNode223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_loopendNode225 = new BitSet(new long[]{0x1260000BC6010000L,0x000071B924101000L});
    public static final BitSet FOLLOW_block_in_loopendNode227 = new BitSet(new long[]{0x0260000142000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_end_in_loopendNode229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_loopendNode237 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_loopendNode239 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_loopendNode241 = new BitSet(new long[]{0x1260000BC6010000L,0x000071B924101000L});
    public static final BitSet FOLLOW_block_in_loopendNode243 = new BitSet(new long[]{0x0260000142000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_end_in_loopendNode245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_set259 = new BitSet(new long[]{0x0000000A84010000L,0x000071B900000000L});
    public static final BitSet FOLLOW_the_in_set262 = new BitSet(new long[]{0x0000000000010000L,0x0000700000000000L});
    public static final BitSet FOLLOW_variable_in_set275 = new BitSet(new long[]{0x0000040000540000L,0x0001000000000200L});
    public static final BitSet FOLLOW_be_in_set277 = new BitSet(new long[]{0x0000000A84013100L,0x000001B900000000L});
    public static final BitSet FOLLOW_value_in_set279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Word_in_variable290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nod_in_value299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_arg310 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode_in_arg312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_in_selector321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_that_in_selector323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_selector327 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode_in_selector329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_selector333 = new BitSet(new long[]{0x0000000A84013100L,0x000001B900000000L});
    public static final BitSet FOLLOW_nod_in_selector335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_that347 = new BitSet(new long[]{0x6182000001E90000L,0x00000000800A4C00L});
    public static final BitSet FOLLOW_verbium_in_that349 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode_in_that351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_that355 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_attrib_in_that357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_where366 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_where368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endcondition_in_condition377 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condition379 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endcondition_in_condition381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endcondition_in_condition385 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_condition387 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_condition_in_condition389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition401 = new BitSet(new long[]{0x6182000001E90000L,0x00000000800A4C00L});
    public static final BitSet FOLLOW_comparison_in_endcondition403 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode_in_endcondition405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition409 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_have_in_endcondition411 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_adjective_in_endcondition413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition417 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_attribute_in_endcondition419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition423 = new BitSet(new long[]{0x0000000000000000L,0x0000800000002002L});
    public static final BitSet FOLLOW_verbTo_in_endcondition425 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_verb_in_endcondition427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode_in_endcondition429 = new BitSet(new long[]{0x0000000000000000L,0x0000800000002002L});
    public static final BitSet FOLLOW_hilfsverb_in_endcondition431 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_gerundium_in_endcondition433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hilfsverb_in_verbTo444 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_verbTo445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_gerundium470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_gerundium471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_attribute481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_verbium489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_verbium491 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0400L});
    public static final BitSet FOLLOW_adverb_in_verbium493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Word_in_verb505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_nod514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quote_in_nod516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_nod519 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_noun_in_nod522 = new BitSet(new long[]{0x0409FBB038000002L,0x00320E1043A401A0L});
    public static final BitSet FOLLOW_selector_in_nod525 = new BitSet(new long[]{0x0409FBB038000002L,0x00320E1043A401A0L});
    public static final BitSet FOLLOW_Word_in_noun538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Quote_in_quote550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_attrib559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode2_in_endNode587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_endNode589 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode2_in_endNode591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endNode2_in_endNode595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_selector2606 = new BitSet(new long[]{0x0000000000010000L,0x00000000000A0400L});
    public static final BitSet FOLLOW_adverb_in_selector2612 = new BitSet(new long[]{0x0000000000010000L,0x00000000000A0400L});
    public static final BitSet FOLLOW_verb_in_selector2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_selector2616 = new BitSet(new long[]{0x0409FBB038000000L,0x00300E0043A001A0L});
    public static final BitSet FOLLOW_preposition_in_selector2619 = new BitSet(new long[]{0x1000000A84010000L,0x000001B900000000L});
    public static final BitSet FOLLOW_endNode2_in_selector2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_the_in_endNode2647 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_adjective_in_endNode2650 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_noun_in_endNode2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_adjective662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adverb_in_comparison729 = new BitSet(new long[]{0x0000000000010000L,0x00000000000A0400L});
    public static final BitSet FOLLOW_verb_in_comparison732 = new BitSet(new long[]{0x0409FBB038000000L,0x00300E0043A001A0L});
    public static final BitSet FOLLOW_preposition_in_comparison734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparation_in_comparison737 = new BitSet(new long[]{0x0000000000000002L});

}