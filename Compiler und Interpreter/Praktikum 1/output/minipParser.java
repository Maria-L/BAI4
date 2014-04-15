// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g 2014-04-14 12:37:45

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class minipParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INTEGER", "K_BEGIN", "K_BOOLEAN", "K_DO", "K_ELSE", "K_END", "K_FI", "K_IF", "K_INTEGER", "K_OD", "K_PRINTLN", "K_PROGRAM", "K_READ", "K_REAL", "K_SEM", "K_STRING", "K_THEN", "K_WHILE", "OCTAL_ESC", "OP_LOGICAL", "OP_PRAEDICATE", "REAL", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='"
    };

    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int BOOLEAN=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INTEGER=11;
    public static final int K_BEGIN=12;
    public static final int K_BOOLEAN=13;
    public static final int K_DO=14;
    public static final int K_ELSE=15;
    public static final int K_END=16;
    public static final int K_FI=17;
    public static final int K_IF=18;
    public static final int K_INTEGER=19;
    public static final int K_OD=20;
    public static final int K_PRINTLN=21;
    public static final int K_PROGRAM=22;
    public static final int K_READ=23;
    public static final int K_REAL=24;
    public static final int K_SEM=25;
    public static final int K_STRING=26;
    public static final int K_THEN=27;
    public static final int K_WHILE=28;
    public static final int OCTAL_ESC=29;
    public static final int OP_LOGICAL=30;
    public static final int OP_PRAEDICATE=31;
    public static final int REAL=32;
    public static final int STRING=33;
    public static final int UNICODE_ESC=34;
    public static final int WS=35;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "declarations", "arith", "declaration", "whileControl", 
    "command", "read", "term", "type", "praedicate", "definition", "start", 
    "print", "ifControl", "idList", "praedicate_", "praedicats", "flowControl", 
    "commands", "praedicats_", "factor"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public minipParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public minipParser(TokenStream input, int port, RecognizerSharedState state) {
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

public minipParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return minipParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g"; }


    	HashMap<String, String> idTable = new HashMap<String, String>();



    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:1: start : K_PROGRAM declarations K_BEGIN commands K_END ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:7: ( K_PROGRAM declarations K_BEGIN commands K_END )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:9: K_PROGRAM declarations K_BEGIN commands K_END
            {
            dbg.location(11,9);
            match(input,K_PROGRAM,FOLLOW_K_PROGRAM_in_start22); if (state.failed) return ;
            dbg.location(11,19);
            pushFollow(FOLLOW_declarations_in_start24);
            declarations();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(11,32);
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_start26); if (state.failed) return ;
            dbg.location(11,40);
            pushFollow(FOLLOW_commands_in_start28);
            commands();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(11,49);
            match(input,K_END,FOLLOW_K_END_in_start30); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "declarations"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:1: declarations : ( declaration )* ;
    public final void declarations() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:15:2: ( ( declaration )* )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:15:4: ( declaration )*
            {
            dbg.location(15,4);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:15:4: ( declaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==K_BOOLEAN||LA1_0==K_INTEGER||LA1_0==K_REAL||LA1_0==K_STRING) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:15:4: declaration
            	    {
            	    dbg.location(15,4);
            	    pushFollow(FOLLOW_declaration_in_declarations42);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(16,2);
            if ( state.backtracking==0 ) {System.out.println(idTable.toString());}

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
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "declaration"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:19:1: declaration : type id= ID ( ',' id_= ID )* K_SEM ;
    public final void declaration() throws RecognitionException {
        Token id=null;
        Token id_=null;
        minipParser.type_return type1 =null;


        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:20:2: ( type id= ID ( ',' id_= ID )* K_SEM )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:20:4: type id= ID ( ',' id_= ID )* K_SEM
            {
            dbg.location(20,4);
            pushFollow(FOLLOW_type_in_declaration57);
            type1=type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(20,11);
            id=(Token)match(input,ID,FOLLOW_ID_in_declaration61); if (state.failed) return ;
            dbg.location(20,15);
            if ( state.backtracking==0 ) {idTable.put((id!=null?id.getText():null), (type1!=null?input.toString(type1.start,type1.stop):null));}
            dbg.location(20,52);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:20:52: ( ',' id_= ID )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==40) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:20:53: ',' id_= ID
            	    {
            	    dbg.location(20,53);
            	    match(input,40,FOLLOW_40_in_declaration66); if (state.failed) return ;
            	    dbg.location(20,60);
            	    id_=(Token)match(input,ID,FOLLOW_ID_in_declaration70); if (state.failed) return ;
            	    dbg.location(20,64);
            	    if ( state.backtracking==0 ) {idTable.put((id_!=null?id_.getText():null), (type1!=null?input.toString(type1.start,type1.stop):null));}

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(20,104);
            match(input,K_SEM,FOLLOW_K_SEM_in_declaration76); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "idList"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:23:1: idList : ID ( ',' ID )* ;
    public final void idList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "idList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:23:8: ( ID ( ',' ID )* )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:23:10: ID ( ',' ID )*
            {
            dbg.location(23,10);
            match(input,ID,FOLLOW_ID_in_idList87); if (state.failed) return ;
            dbg.location(23,13);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:23:13: ( ',' ID )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==40) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:23:14: ',' ID
            	    {
            	    dbg.location(23,14);
            	    match(input,40,FOLLOW_40_in_idList90); if (state.failed) return ;
            	    dbg.location(23,18);
            	    match(input,ID,FOLLOW_ID_in_idList92); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(24, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "idList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "idList"



    // $ANTLR start "commands"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:1: commands : ( command K_SEM | flowControl )+ ;
    public final void commands() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:9: ( ( command K_SEM | flowControl )+ )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:11: ( command K_SEM | flowControl )+
            {
            dbg.location(26,11);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:11: ( command K_SEM | flowControl )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=3;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||LA4_0==K_PRINTLN||LA4_0==K_READ) ) {
                    alt4=1;
                }
                else if ( (LA4_0==K_IF||LA4_0==K_WHILE) ) {
                    alt4=2;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:12: command K_SEM
            	    {
            	    dbg.location(26,12);
            	    pushFollow(FOLLOW_command_in_commands105);
            	    command();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(26,20);
            	    match(input,K_SEM,FOLLOW_K_SEM_in_commands107); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:26:28: flowControl
            	    {
            	    dbg.location(26,28);
            	    pushFollow(FOLLOW_flowControl_in_commands111);
            	    flowControl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt4++;
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commands"



    // $ANTLR start "command"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:1: command : ( definition | read | print );
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:9: ( definition | read | print )
            int alt5=3;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case K_READ:
                {
                alt5=2;
                }
                break;
            case K_PRINTLN:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:11: definition
                    {
                    dbg.location(29,11);
                    pushFollow(FOLLOW_definition_in_command124);
                    definition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:24: read
                    {
                    dbg.location(29,24);
                    pushFollow(FOLLOW_read_in_command128);
                    read();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:31: print
                    {
                    dbg.location(29,31);
                    pushFollow(FOLLOW_print_in_command132);
                    print();

                    state._fsp--;
                    if (state.failed) return ;

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
        dbg.location(30, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "command"



    // $ANTLR start "flowControl"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:32:1: flowControl : ( ifControl | whileControl );
    public final void flowControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flowControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:2: ( ifControl | whileControl )
            int alt6=2;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_IF) ) {
                alt6=1;
            }
            else if ( (LA6_0==K_WHILE) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:4: ifControl
                    {
                    dbg.location(33,4);
                    pushFollow(FOLLOW_ifControl_in_flowControl144);
                    ifControl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:16: whileControl
                    {
                    dbg.location(33,16);
                    pushFollow(FOLLOW_whileControl_in_flowControl148);
                    whileControl();

                    state._fsp--;
                    if (state.failed) return ;

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
        dbg.location(34, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flowControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "flowControl"



    // $ANTLR start "definition"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:54:1: definition options {backtrack=true; } : ID ':=' ( STRING |{...}? => praedicats | arith ) ;
    public final void definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:56:2: ( ID ':=' ( STRING |{...}? => praedicats | arith ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:56:4: ID ':=' ( STRING |{...}? => praedicats | arith )
            {
            dbg.location(56,4);
            match(input,ID,FOLLOW_ID_in_definition174); if (state.failed) return ;
            dbg.location(56,7);
            match(input,43,FOLLOW_43_in_definition176); if (state.failed) return ;
            dbg.location(56,12);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:56:12: ( STRING |{...}? => praedicats | arith )
            int alt7=3;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                int LA7_2 = input.LA(2);

                if ( (evalPredicate(false,"false")) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA7_0==INTEGER||LA7_0==REAL) ) {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==OP_PRAEDICATE) && (evalPredicate(false,"false"))) {
                    alt7=2;
                }
                else if ( (LA7_3==K_SEM||(LA7_3 >= 38 && LA7_3 <= 39)||(LA7_3 >= 41 && LA7_3 <= 42)) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA7_0==BOOLEAN) && (evalPredicate(false,"false"))) {
                alt7=2;
            }
            else if ( (LA7_0==36) ) {
                alt7=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:56:13: STRING
                    {
                    dbg.location(56,13);
                    match(input,STRING,FOLLOW_STRING_in_definition179); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:57:4: {...}? => praedicats
                    {
                    dbg.location(57,4);
                    if ( !(evalPredicate(false,"false")) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "definition", "false");
                    }
                    dbg.location(57,15);
                    pushFollow(FOLLOW_praedicats_in_definition188);
                    praedicats();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:58:4: arith
                    {
                    dbg.location(58,4);
                    pushFollow(FOLLOW_arith_in_definition194);
                    arith();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(58, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition"



    // $ANTLR start "read"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:1: read : K_READ '(' ID ')' ;
    public final void read() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:6: ( K_READ '(' ID ')' )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:8: K_READ '(' ID ')'
            {
            dbg.location(61,8);
            match(input,K_READ,FOLLOW_K_READ_in_read204); if (state.failed) return ;
            dbg.location(61,15);
            match(input,36,FOLLOW_36_in_read206); if (state.failed) return ;
            dbg.location(61,19);
            match(input,ID,FOLLOW_ID_in_read208); if (state.failed) return ;
            dbg.location(61,22);
            match(input,37,FOLLOW_37_in_read210); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(62, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read"



    // $ANTLR start "print"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:64:1: print : K_PRINTLN '(' ( ID | STRING ) ')' ;
    public final void print() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:64:7: ( K_PRINTLN '(' ( ID | STRING ) ')' )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:64:9: K_PRINTLN '(' ( ID | STRING ) ')'
            {
            dbg.location(64,9);
            match(input,K_PRINTLN,FOLLOW_K_PRINTLN_in_print220); if (state.failed) return ;
            dbg.location(64,19);
            match(input,36,FOLLOW_36_in_print222); if (state.failed) return ;
            dbg.location(64,23);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(64,37);
            match(input,37,FOLLOW_37_in_print232); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(65, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "print"



    // $ANTLR start "ifControl"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:67:1: ifControl : K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI ;
    public final void ifControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:2: ( K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:4: K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI
            {
            dbg.location(68,4);
            match(input,K_IF,FOLLOW_K_IF_in_ifControl243); if (state.failed) return ;
            dbg.location(68,9);
            pushFollow(FOLLOW_praedicate_in_ifControl245);
            praedicate();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(68,20);
            match(input,K_THEN,FOLLOW_K_THEN_in_ifControl247); if (state.failed) return ;
            dbg.location(68,27);
            pushFollow(FOLLOW_commands_in_ifControl249);
            commands();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(68,36);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:36: ( K_ELSE commands )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ELSE) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:37: K_ELSE commands
                    {
                    dbg.location(68,37);
                    match(input,K_ELSE,FOLLOW_K_ELSE_in_ifControl252); if (state.failed) return ;
                    dbg.location(68,44);
                    pushFollow(FOLLOW_commands_in_ifControl254);
                    commands();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(68,55);
            match(input,K_FI,FOLLOW_K_FI_in_ifControl258); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(69, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifControl"



    // $ANTLR start "whileControl"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:71:1: whileControl : K_WHILE praedicats K_DO commands K_OD ;
    public final void whileControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whileControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:2: ( K_WHILE praedicats K_DO commands K_OD )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:4: K_WHILE praedicats K_DO commands K_OD
            {
            dbg.location(72,4);
            match(input,K_WHILE,FOLLOW_K_WHILE_in_whileControl270); if (state.failed) return ;
            dbg.location(72,12);
            pushFollow(FOLLOW_praedicats_in_whileControl272);
            praedicats();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(72,23);
            match(input,K_DO,FOLLOW_K_DO_in_whileControl274); if (state.failed) return ;
            dbg.location(72,28);
            pushFollow(FOLLOW_commands_in_whileControl276);
            commands();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(72,37);
            match(input,K_OD,FOLLOW_K_OD_in_whileControl278); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(73, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "whileControl"



    // $ANTLR start "praedicats"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:75:1: praedicats : praedicate ( praedicats_ )? ;
    public final void praedicats() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:2: ( praedicate ( praedicats_ )? )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:4: praedicate ( praedicats_ )?
            {
            dbg.location(76,4);
            pushFollow(FOLLOW_praedicate_in_praedicats290);
            praedicate();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(76,15);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:15: ( praedicats_ )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==OP_LOGICAL) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:15: praedicats_
                    {
                    dbg.location(76,15);
                    pushFollow(FOLLOW_praedicats__in_praedicats292);
                    praedicats_();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "praedicats");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicats"



    // $ANTLR start "praedicats_"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:1: praedicats_ : ( OP_LOGICAL praedicate )+ ;
    public final void praedicats_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:2: ( ( OP_LOGICAL praedicate )+ )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:4: ( OP_LOGICAL praedicate )+
            {
            dbg.location(80,4);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:4: ( OP_LOGICAL praedicate )+
            int cnt10=0;
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==OP_LOGICAL) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:5: OP_LOGICAL praedicate
            	    {
            	    dbg.location(80,5);
            	    match(input,OP_LOGICAL,FOLLOW_OP_LOGICAL_in_praedicats_306); if (state.failed) return ;
            	    dbg.location(80,16);
            	    pushFollow(FOLLOW_praedicate_in_praedicats_308);
            	    praedicate();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt10++;
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(81, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "praedicats_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicats_"



    // $ANTLR start "praedicate"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:83:1: praedicate : ( ID ( praedicate_ )? | ( REAL | INTEGER ) praedicate_ | BOOLEAN );
    public final void praedicate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:2: ( ID ( praedicate_ )? | ( REAL | INTEGER ) praedicate_ | BOOLEAN )
            int alt12=3;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case INTEGER:
            case REAL:
                {
                alt12=2;
                }
                break;
            case BOOLEAN:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:4: ID ( praedicate_ )?
                    {
                    dbg.location(84,4);
                    match(input,ID,FOLLOW_ID_in_praedicate322); if (state.failed) return ;
                    dbg.location(84,7);
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:7: ( praedicate_ )?
                    int alt11=2;
                    try { dbg.enterSubRule(11);
                    try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==OP_PRAEDICATE) ) {
                        alt11=1;
                    }
                    } finally {dbg.exitDecision(11);}

                    switch (alt11) {
                        case 1 :
                            dbg.enterAlt(1);

                            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:7: praedicate_
                            {
                            dbg.location(84,7);
                            pushFollow(FOLLOW_praedicate__in_praedicate324);
                            praedicate_();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:22: ( REAL | INTEGER ) praedicate_
                    {
                    dbg.location(84,22);
                    if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(84,39);
                    pushFollow(FOLLOW_praedicate__in_praedicate337);
                    praedicate_();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:53: BOOLEAN
                    {
                    dbg.location(84,53);
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_praedicate341); if (state.failed) return ;

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
        dbg.location(85, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "praedicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicate"



    // $ANTLR start "praedicate_"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:87:1: praedicate_ : OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) ;
    public final void praedicate_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:2: ( OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:4: OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER )
            {
            dbg.location(88,4);
            match(input,OP_PRAEDICATE,FOLLOW_OP_PRAEDICATE_in_praedicate_353); if (state.failed) return ;
            dbg.location(88,18);
            if ( input.LA(1)==BOOLEAN||(input.LA(1) >= ID && input.LA(1) <= INTEGER)||input.LA(1)==REAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        dbg.location(89, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "praedicate_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicate_"



    // $ANTLR start "arith"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:1: arith : term ( '+' arith | '-' arith )* ;
    public final void arith() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:7: ( term ( '+' arith | '-' arith )* )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:9: term ( '+' arith | '-' arith )*
            {
            dbg.location(108,9);
            pushFollow(FOLLOW_term_in_arith384);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(108,14);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:14: ( '+' arith | '-' arith )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=3;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }
                else if ( (LA13_0==41) ) {
                    alt13=2;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:15: '+' arith
            	    {
            	    dbg.location(108,15);
            	    match(input,39,FOLLOW_39_in_arith387); if (state.failed) return ;
            	    dbg.location(108,19);
            	    pushFollow(FOLLOW_arith_in_arith389);
            	    arith();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:27: '-' arith
            	    {
            	    dbg.location(108,27);
            	    match(input,41,FOLLOW_41_in_arith393); if (state.failed) return ;
            	    dbg.location(108,31);
            	    pushFollow(FOLLOW_arith_in_arith395);
            	    arith();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(109, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arith"



    // $ANTLR start "term"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:1: term : factor ( '*' term | '/' term )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:6: ( factor ( '*' term | '/' term )* )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:8: factor ( '*' term | '/' term )*
            {
            dbg.location(112,8);
            pushFollow(FOLLOW_factor_in_term410);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(112,15);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:15: ( '*' term | '/' term )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=3;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }
                else if ( (LA14_0==42) ) {
                    alt14=2;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:16: '*' term
            	    {
            	    dbg.location(112,16);
            	    match(input,38,FOLLOW_38_in_term413); if (state.failed) return ;
            	    dbg.location(112,20);
            	    pushFollow(FOLLOW_term_in_term415);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:112:27: '/' term
            	    {
            	    dbg.location(112,27);
            	    match(input,42,FOLLOW_42_in_term419); if (state.failed) return ;
            	    dbg.location(112,31);
            	    pushFollow(FOLLOW_term_in_term421);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(113, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:116:1: factor : ( ( ID | REAL | INTEGER ) | '(' arith ')' );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:116:8: ( ( ID | REAL | INTEGER ) | '(' arith ')' )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= ID && LA15_0 <= INTEGER)||LA15_0==REAL) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:116:10: ( ID | REAL | INTEGER )
                    {
                    dbg.location(116,10);
                    if ( (input.LA(1) >= ID && input.LA(1) <= INTEGER)||input.LA(1)==REAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:117:4: '(' arith ')'
                    {
                    dbg.location(117,4);
                    match(input,36,FOLLOW_36_in_factor450); if (state.failed) return ;
                    dbg.location(117,8);
                    pushFollow(FOLLOW_arith_in_factor452);
                    arith();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(117,14);
                    match(input,37,FOLLOW_37_in_factor454); if (state.failed) return ;

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
        dbg.location(118, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"


    public static class type_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "type"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:120:1: type : ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN );
    public final minipParser.type_return type() throws RecognitionException {
        minipParser.type_return retval = new minipParser.type_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:120:6: ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
            {
            dbg.location(120,6);
            if ( input.LA(1)==K_BOOLEAN||input.LA(1)==K_INTEGER||input.LA(1)==K_REAL||input.LA(1)==K_STRING ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(121, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_K_PROGRAM_in_start22 = new BitSet(new long[]{0x0000000005083000L});
    public static final BitSet FOLLOW_declarations_in_start24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BEGIN_in_start26 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_start28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_K_END_in_start30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations42 = new BitSet(new long[]{0x0000000005082002L});
    public static final BitSet FOLLOW_type_in_declaration57 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declaration61 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_40_in_declaration66 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declaration70 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_K_SEM_in_declaration76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList87 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_idList90 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idList92 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_command_in_commands105 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_K_SEM_in_commands107 = new BitSet(new long[]{0x0000000010A40402L});
    public static final BitSet FOLLOW_flowControl_in_commands111 = new BitSet(new long[]{0x0000000010A40402L});
    public static final BitSet FOLLOW_definition_in_command124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_command128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_command132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifControl_in_flowControl144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileControl_in_flowControl148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_definition174 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_definition176 = new BitSet(new long[]{0x0000001300000C10L});
    public static final BitSet FOLLOW_STRING_in_definition179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicats_in_definition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_in_definition194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_READ_in_read204 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_read206 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_read208 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_read210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRINTLN_in_print220 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_print222 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_set_in_print224 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_print232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_IF_in_ifControl243 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_ifControl245 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_THEN_in_ifControl247 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl249 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_K_ELSE_in_ifControl252 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_K_FI_in_ifControl258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WHILE_in_whileControl270 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicats_in_whileControl272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_DO_in_whileControl274 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_whileControl276 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_OD_in_whileControl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate_in_praedicats290 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_praedicats292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LOGICAL_in_praedicats_306 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_praedicats_308 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ID_in_praedicate322 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_praedicate__in_praedicate324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_praedicate329 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_praedicate__in_praedicate337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_praedicate341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PRAEDICATE_in_praedicate_353 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_set_in_praedicate_355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arith384 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_39_in_arith387 = new BitSet(new long[]{0x0000001100000C00L});
    public static final BitSet FOLLOW_arith_in_arith389 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_41_in_arith393 = new BitSet(new long[]{0x0000001100000C00L});
    public static final BitSet FOLLOW_arith_in_arith395 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_factor_in_term410 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_38_in_term413 = new BitSet(new long[]{0x0000001100000C00L});
    public static final BitSet FOLLOW_term_in_term415 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_42_in_term419 = new BitSet(new long[]{0x0000001100000C00L});
    public static final BitSet FOLLOW_term_in_term421 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_set_in_factor435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_factor450 = new BitSet(new long[]{0x0000001100000C00L});
    public static final BitSet FOLLOW_arith_in_factor452 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor454 = new BitSet(new long[]{0x0000000000000002L});

}