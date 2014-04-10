// $ANTLR 3.4 C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g 2014-04-10 13:32:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
    "invalidRule", "term", "start", "idList", "definition_", "definition", 
    "praedicate_", "declarations", "factor", "arith_", "ifControl", "declaration", 
    "commands", "flowControl", "arith", "command", "definition__", "praedicats", 
    "print", "praedicate", "praedicats_", "whileControl", "read", "term_"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false
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
    public String getGrammarFileName() { return "C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g"; }



    // $ANTLR start "start"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:1: start : K_PROGRAM declarations K_BEGIN commands K_END ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:7: ( K_PROGRAM declarations K_BEGIN commands K_END )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:9: K_PROGRAM declarations K_BEGIN commands K_END
            {
            dbg.location(3,9);
            match(input,K_PROGRAM,FOLLOW_K_PROGRAM_in_start10); 
            dbg.location(3,19);
            pushFollow(FOLLOW_declarations_in_start12);
            declarations();

            state._fsp--;

            dbg.location(3,32);
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_start14); 
            dbg.location(3,40);
            pushFollow(FOLLOW_commands_in_start16);
            commands();

            state._fsp--;

            dbg.location(3,49);
            match(input,K_END,FOLLOW_K_END_in_start18); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(4, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:6:1: declarations : ( declaration )* ;
    public final void declarations() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:2: ( ( declaration )* )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: ( declaration )*
            {
            dbg.location(7,4);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: ( declaration )*
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

            	    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: declaration
            	    {
            	    dbg.location(7,4);
            	    pushFollow(FOLLOW_declaration_in_declarations30);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:10:1: declaration : ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM ;
    public final void declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:2: ( ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:4: ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM
            {
            dbg.location(11,4);
            if ( input.LA(1)==K_BOOLEAN||input.LA(1)==K_INTEGER||input.LA(1)==K_REAL||input.LA(1)==K_STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(11,48);
            pushFollow(FOLLOW_idList_in_declaration58);
            idList();

            state._fsp--;

            dbg.location(11,55);
            match(input,K_SEM,FOLLOW_K_SEM_in_declaration60); 

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
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "idList"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:1: idList : ID ( ',' ID )* ;
    public final void idList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "idList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:8: ( ID ( ',' ID )* )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:10: ID ( ',' ID )*
            {
            dbg.location(14,10);
            match(input,ID,FOLLOW_ID_in_idList71); 
            dbg.location(14,13);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:13: ( ',' ID )*
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

            	    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:14: ',' ID
            	    {
            	    dbg.location(14,14);
            	    match(input,40,FOLLOW_40_in_idList74); 
            	    dbg.location(14,18);
            	    match(input,ID,FOLLOW_ID_in_idList76); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:1: commands : ( command K_SEM | flowControl )+ ;
    public final void commands() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:9: ( ( command K_SEM | flowControl )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:11: ( command K_SEM | flowControl )+
            {
            dbg.location(17,11);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:11: ( command K_SEM | flowControl )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==K_PRINTLN||LA3_0==K_READ) ) {
                    alt3=1;
                }
                else if ( (LA3_0==K_IF||LA3_0==K_WHILE) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:12: command K_SEM
            	    {
            	    dbg.location(17,12);
            	    pushFollow(FOLLOW_command_in_commands89);
            	    command();

            	    state._fsp--;

            	    dbg.location(17,20);
            	    match(input,K_SEM,FOLLOW_K_SEM_in_commands91); 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:28: flowControl
            	    {
            	    dbg.location(17,28);
            	    pushFollow(FOLLOW_flowControl_in_commands95);
            	    flowControl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
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
        dbg.location(19, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:1: command : ( definition | read | print );
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:9: ( definition | read | print )
            int alt4=3;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case K_READ:
                {
                alt4=2;
                }
                break;
            case K_PRINTLN:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:11: definition
                    {
                    dbg.location(21,11);
                    pushFollow(FOLLOW_definition_in_command109);
                    definition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:24: read
                    {
                    dbg.location(21,24);
                    pushFollow(FOLLOW_read_in_command113);
                    read();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:31: print
                    {
                    dbg.location(21,31);
                    pushFollow(FOLLOW_print_in_command117);
                    print();

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
        dbg.location(22, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:24:1: flowControl : ( ifControl | whileControl );
    public final void flowControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flowControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:2: ( ifControl | whileControl )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_IF) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_WHILE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:4: ifControl
                    {
                    dbg.location(25,4);
                    pushFollow(FOLLOW_ifControl_in_flowControl129);
                    ifControl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:16: whileControl
                    {
                    dbg.location(25,16);
                    pushFollow(FOLLOW_whileControl_in_flowControl133);
                    whileControl();

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
        dbg.location(26, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:28:1: definition : ID ':=' ( STRING | BOOLEAN ( praedicate_ ( praedicats_ )? )? | ID definition_ | '(' arith ')' ( arith_ | term_ )? | INTEGER ( definition__ )? | REAL ( definition__ )? ) ;
    public final void definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:2: ( ID ':=' ( STRING | BOOLEAN ( praedicate_ ( praedicats_ )? )? | ID definition_ | '(' arith ')' ( arith_ | term_ )? | INTEGER ( definition__ )? | REAL ( definition__ )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:4: ID ':=' ( STRING | BOOLEAN ( praedicate_ ( praedicats_ )? )? | ID definition_ | '(' arith ')' ( arith_ | term_ )? | INTEGER ( definition__ )? | REAL ( definition__ )? )
            {
            dbg.location(29,4);
            match(input,ID,FOLLOW_ID_in_definition145); 
            dbg.location(29,7);
            match(input,43,FOLLOW_43_in_definition147); 
            dbg.location(30,2);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:30:2: ( STRING | BOOLEAN ( praedicate_ ( praedicats_ )? )? | ID definition_ | '(' arith ')' ( arith_ | term_ )? | INTEGER ( definition__ )? | REAL ( definition__ )? )
            int alt11=6;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case STRING:
                {
                alt11=1;
                }
                break;
            case BOOLEAN:
                {
                alt11=2;
                }
                break;
            case ID:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case INTEGER:
                {
                alt11=5;
                }
                break;
            case REAL:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:30:3: STRING
                    {
                    dbg.location(30,3);
                    match(input,STRING,FOLLOW_STRING_in_definition152); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:4: BOOLEAN ( praedicate_ ( praedicats_ )? )?
                    {
                    dbg.location(31,4);
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_definition158); 
                    dbg.location(31,12);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:12: ( praedicate_ ( praedicats_ )? )?
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==OP_PRAEDICATE) ) {
                        alt7=1;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:13: praedicate_ ( praedicats_ )?
                            {
                            dbg.location(31,13);
                            pushFollow(FOLLOW_praedicate__in_definition161);
                            praedicate_();

                            state._fsp--;

                            dbg.location(31,25);
                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:25: ( praedicats_ )?
                            int alt6=2;
                            try { dbg.enterSubRule(6);
                            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==OP_LOGICAL) ) {
                                alt6=1;
                            }
                            } finally {dbg.exitDecision(6);}

                            switch (alt6) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:25: praedicats_
                                    {
                                    dbg.location(31,25);
                                    pushFollow(FOLLOW_praedicats__in_definition163);
                                    praedicats_();

                                    state._fsp--;


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(6);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:32:4: ID definition_
                    {
                    dbg.location(32,4);
                    match(input,ID,FOLLOW_ID_in_definition171); 
                    dbg.location(32,7);
                    pushFollow(FOLLOW_definition__in_definition173);
                    definition_();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:4: '(' arith ')' ( arith_ | term_ )?
                    {
                    dbg.location(33,4);
                    match(input,36,FOLLOW_36_in_definition179); 
                    dbg.location(33,8);
                    pushFollow(FOLLOW_arith_in_definition181);
                    arith();

                    state._fsp--;

                    dbg.location(33,14);
                    match(input,37,FOLLOW_37_in_definition183); 
                    dbg.location(33,18);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:18: ( arith_ | term_ )?
                    int alt8=3;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==39||LA8_0==41) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==38||LA8_0==42) ) {
                        alt8=2;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:19: arith_
                            {
                            dbg.location(33,19);
                            pushFollow(FOLLOW_arith__in_definition186);
                            arith_();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:28: term_
                            {
                            dbg.location(33,28);
                            pushFollow(FOLLOW_term__in_definition190);
                            term_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:34:4: INTEGER ( definition__ )?
                    {
                    dbg.location(34,4);
                    match(input,INTEGER,FOLLOW_INTEGER_in_definition198); 
                    dbg.location(34,12);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:34:12: ( definition__ )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==OP_PRAEDICATE||(LA9_0 >= 38 && LA9_0 <= 39)||(LA9_0 >= 41 && LA9_0 <= 42)) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:34:12: definition__
                            {
                            dbg.location(34,12);
                            pushFollow(FOLLOW_definition___in_definition200);
                            definition__();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:35:4: REAL ( definition__ )?
                    {
                    dbg.location(35,4);
                    match(input,REAL,FOLLOW_REAL_in_definition207); 
                    dbg.location(35,9);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:35:9: ( definition__ )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==OP_PRAEDICATE||(LA10_0 >= 38 && LA10_0 <= 39)||(LA10_0 >= 41 && LA10_0 <= 42)) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:35:9: definition__
                            {
                            dbg.location(35,9);
                            pushFollow(FOLLOW_definition___in_definition209);
                            definition__();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(36, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition"



    // $ANTLR start "definition_"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:38:1: definition_ : ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? |);
    public final void definition_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:2: ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? |)
            int alt14=4;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case 39:
            case 41:
                {
                alt14=1;
                }
                break;
            case 38:
            case 42:
                {
                alt14=2;
                }
                break;
            case OP_PRAEDICATE:
                {
                alt14=3;
                }
                break;
            case K_SEM:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:4: arith_
                    {
                    dbg.location(39,4);
                    pushFollow(FOLLOW_arith__in_definition_223);
                    arith_();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:13: term_ ( arith_ )?
                    {
                    dbg.location(39,13);
                    pushFollow(FOLLOW_term__in_definition_227);
                    term_();

                    state._fsp--;

                    dbg.location(39,19);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:19: ( arith_ )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==39||LA12_0==41) ) {
                        alt12=1;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:19: arith_
                            {
                            dbg.location(39,19);
                            pushFollow(FOLLOW_arith__in_definition_229);
                            arith_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:28: praedicate_ ( praedicats_ )?
                    {
                    dbg.location(39,28);
                    pushFollow(FOLLOW_praedicate__in_definition_233);
                    praedicate_();

                    state._fsp--;

                    dbg.location(39,40);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:40: ( praedicats_ )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==OP_LOGICAL) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:40: praedicats_
                            {
                            dbg.location(39,40);
                            pushFollow(FOLLOW_praedicats__in_definition_235);
                            praedicats_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:40:2: 
                    {
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
        dbg.location(40, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition_"



    // $ANTLR start "definition__"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:42:1: definition__ : ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? );
    public final void definition__() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition__");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:2: ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? )
            int alt17=3;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            switch ( input.LA(1) ) {
            case 39:
            case 41:
                {
                alt17=1;
                }
                break;
            case 38:
            case 42:
                {
                alt17=2;
                }
                break;
            case OP_PRAEDICATE:
                {
                alt17=3;
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

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:4: arith_
                    {
                    dbg.location(43,4);
                    pushFollow(FOLLOW_arith__in_definition__252);
                    arith_();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:13: term_ ( arith_ )?
                    {
                    dbg.location(43,13);
                    pushFollow(FOLLOW_term__in_definition__256);
                    term_();

                    state._fsp--;

                    dbg.location(43,19);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:19: ( arith_ )?
                    int alt15=2;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==39||LA15_0==41) ) {
                        alt15=1;
                    }
                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:19: arith_
                            {
                            dbg.location(43,19);
                            pushFollow(FOLLOW_arith__in_definition__258);
                            arith_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:29: praedicate_ ( praedicats_ )?
                    {
                    dbg.location(43,29);
                    pushFollow(FOLLOW_praedicate__in_definition__263);
                    praedicate_();

                    state._fsp--;

                    dbg.location(43,41);
                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:41: ( praedicats_ )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==OP_LOGICAL) ) {
                        alt16=1;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:41: praedicats_
                            {
                            dbg.location(43,41);
                            pushFollow(FOLLOW_praedicats__in_definition__265);
                            praedicats_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}


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
        dbg.location(44, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition__");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition__"



    // $ANTLR start "read"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:46:1: read : K_READ '(' ID ')' ;
    public final void read() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:46:6: ( K_READ '(' ID ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:46:8: K_READ '(' ID ')'
            {
            dbg.location(46,8);
            match(input,K_READ,FOLLOW_K_READ_in_read276); 
            dbg.location(46,15);
            match(input,36,FOLLOW_36_in_read278); 
            dbg.location(46,19);
            match(input,ID,FOLLOW_ID_in_read280); 
            dbg.location(46,22);
            match(input,37,FOLLOW_37_in_read282); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(47, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:49:1: print : K_PRINTLN '(' ( ID | STRING ) ')' ;
    public final void print() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:49:7: ( K_PRINTLN '(' ( ID | STRING ) ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:49:9: K_PRINTLN '(' ( ID | STRING ) ')'
            {
            dbg.location(49,9);
            match(input,K_PRINTLN,FOLLOW_K_PRINTLN_in_print292); 
            dbg.location(49,19);
            match(input,36,FOLLOW_36_in_print294); 
            dbg.location(49,23);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(49,37);
            match(input,37,FOLLOW_37_in_print304); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(50, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:52:1: ifControl : K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI ;
    public final void ifControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:53:2: ( K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:53:4: K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI
            {
            dbg.location(53,4);
            match(input,K_IF,FOLLOW_K_IF_in_ifControl315); 
            dbg.location(53,9);
            pushFollow(FOLLOW_praedicate_in_ifControl317);
            praedicate();

            state._fsp--;

            dbg.location(53,20);
            match(input,K_THEN,FOLLOW_K_THEN_in_ifControl319); 
            dbg.location(53,27);
            pushFollow(FOLLOW_commands_in_ifControl321);
            commands();

            state._fsp--;

            dbg.location(53,36);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:53:36: ( K_ELSE commands )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==K_ELSE) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:53:37: K_ELSE commands
                    {
                    dbg.location(53,37);
                    match(input,K_ELSE,FOLLOW_K_ELSE_in_ifControl324); 
                    dbg.location(53,44);
                    pushFollow(FOLLOW_commands_in_ifControl326);
                    commands();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(53,55);
            match(input,K_FI,FOLLOW_K_FI_in_ifControl330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(54, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:56:1: whileControl : K_WHILE praedicats K_DO commands K_OD ;
    public final void whileControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whileControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:57:2: ( K_WHILE praedicats K_DO commands K_OD )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:57:4: K_WHILE praedicats K_DO commands K_OD
            {
            dbg.location(57,4);
            match(input,K_WHILE,FOLLOW_K_WHILE_in_whileControl342); 
            dbg.location(57,12);
            pushFollow(FOLLOW_praedicats_in_whileControl344);
            praedicats();

            state._fsp--;

            dbg.location(57,23);
            match(input,K_DO,FOLLOW_K_DO_in_whileControl346); 
            dbg.location(57,28);
            pushFollow(FOLLOW_commands_in_whileControl348);
            commands();

            state._fsp--;

            dbg.location(57,37);
            match(input,K_OD,FOLLOW_K_OD_in_whileControl350); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(58, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:60:1: praedicats : praedicate ( praedicats_ )? ;
    public final void praedicats() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:2: ( praedicate ( praedicats_ )? )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:4: praedicate ( praedicats_ )?
            {
            dbg.location(61,4);
            pushFollow(FOLLOW_praedicate_in_praedicats362);
            praedicate();

            state._fsp--;

            dbg.location(61,15);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:15: ( praedicats_ )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==OP_LOGICAL) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:61:15: praedicats_
                    {
                    dbg.location(61,15);
                    pushFollow(FOLLOW_praedicats__in_praedicats364);
                    praedicats_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}


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
            dbg.exitRule(getGrammarFileName(), "praedicats");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicats"



    // $ANTLR start "praedicats_"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:64:1: praedicats_ : ( OP_LOGICAL praedicate )+ ;
    public final void praedicats_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:2: ( ( OP_LOGICAL praedicate )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:4: ( OP_LOGICAL praedicate )+
            {
            dbg.location(65,4);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:4: ( OP_LOGICAL praedicate )+
            int cnt20=0;
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==OP_LOGICAL) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:5: OP_LOGICAL praedicate
            	    {
            	    dbg.location(65,5);
            	    match(input,OP_LOGICAL,FOLLOW_OP_LOGICAL_in_praedicats_378); 
            	    dbg.location(65,16);
            	    pushFollow(FOLLOW_praedicate_in_praedicats_380);
            	    praedicate();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt20++;
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(66, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:1: praedicate : ( ID | BOOLEAN | REAL | INTEGER ) ( praedicate_ )? ;
    public final void praedicate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:69:2: ( ( ID | BOOLEAN | REAL | INTEGER ) ( praedicate_ )? )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:69:4: ( ID | BOOLEAN | REAL | INTEGER ) ( praedicate_ )?
            {
            dbg.location(69,4);
            if ( input.LA(1)==BOOLEAN||(input.LA(1) >= ID && input.LA(1) <= INTEGER)||input.LA(1)==REAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(69,37);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:69:37: ( praedicate_ )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==OP_PRAEDICATE) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:69:37: praedicate_
                    {
                    dbg.location(69,37);
                    pushFollow(FOLLOW_praedicate__in_praedicate411);
                    praedicate_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:1: praedicate_ : OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) ;
    public final void praedicate_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:73:2: ( OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:73:4: OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER )
            {
            dbg.location(73,4);
            match(input,OP_PRAEDICATE,FOLLOW_OP_PRAEDICATE_in_praedicate_424); 
            dbg.location(73,18);
            if ( input.LA(1)==BOOLEAN||(input.LA(1) >= ID && input.LA(1) <= INTEGER)||input.LA(1)==REAL ) {
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
        dbg.location(74, 1);

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
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:1: arith : term ( arith_ )? ;
    public final void arith() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:7: ( term ( arith_ )? )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:9: term ( arith_ )?
            {
            dbg.location(76,9);
            pushFollow(FOLLOW_term_in_arith451);
            term();

            state._fsp--;

            dbg.location(76,14);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:14: ( arith_ )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==39||LA22_0==41) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:14: arith_
                    {
                    dbg.location(76,14);
                    pushFollow(FOLLOW_arith__in_arith453);
                    arith_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}


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
            dbg.exitRule(getGrammarFileName(), "arith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arith"



    // $ANTLR start "arith_"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:1: arith_ : ( '+' arith | '-' arith );
    public final void arith_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:8: ( '+' arith | '-' arith )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:10: '+' arith
                    {
                    dbg.location(79,10);
                    match(input,39,FOLLOW_39_in_arith_465); 
                    dbg.location(79,14);
                    pushFollow(FOLLOW_arith_in_arith_467);
                    arith();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:22: '-' arith
                    {
                    dbg.location(79,22);
                    match(input,41,FOLLOW_41_in_arith_471); 
                    dbg.location(79,26);
                    pushFollow(FOLLOW_arith_in_arith_473);
                    arith();

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
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arith_"



    // $ANTLR start "term"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:82:1: term : factor ( term_ )? ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:82:6: ( factor ( term_ )? )
            dbg.enterAlt(1);

            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:82:8: factor ( term_ )?
            {
            dbg.location(82,8);
            pushFollow(FOLLOW_factor_in_term484);
            factor();

            state._fsp--;

            dbg.location(82,15);
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:82:15: ( term_ )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==38||LA24_0==42) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:82:15: term_
                    {
                    dbg.location(82,15);
                    pushFollow(FOLLOW_term__in_term486);
                    term_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(83, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "term_"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:85:1: term_ : ( '*' term | '/' term );
    public final void term_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:85:7: ( '*' term | '/' term )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( (LA25_0==42) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:85:9: '*' term
                    {
                    dbg.location(85,9);
                    match(input,38,FOLLOW_38_in_term_498); 
                    dbg.location(85,13);
                    pushFollow(FOLLOW_term_in_term_500);
                    term();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:85:20: '/' term
                    {
                    dbg.location(85,20);
                    match(input,42,FOLLOW_42_in_term_504); 
                    dbg.location(85,24);
                    pushFollow(FOLLOW_term_in_term_506);
                    term();

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
        dbg.location(86, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term_"



    // $ANTLR start "factor"
    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:1: factor : ( ( ID | REAL | INTEGER ) | '(' arith ')' | '-' factor );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 0);

        try {
            // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:8: ( ( ID | REAL | INTEGER ) | '(' arith ')' | '-' factor )
            int alt26=3;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            switch ( input.LA(1) ) {
            case ID:
            case INTEGER:
            case REAL:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:10: ( ID | REAL | INTEGER )
                    {
                    dbg.location(88,10);
                    if ( (input.LA(1) >= ID && input.LA(1) <= INTEGER)||input.LA(1)==REAL ) {
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
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:89:4: '(' arith ')'
                    {
                    dbg.location(89,4);
                    match(input,36,FOLLOW_36_in_factor532); 
                    dbg.location(89,8);
                    pushFollow(FOLLOW_arith_in_factor534);
                    arith();

                    state._fsp--;

                    dbg.location(89,14);
                    match(input,37,FOLLOW_37_in_factor536); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Maria\\Documents\\HAW\\Sommersemester 2014_AI4\\GIT\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:90:4: '-' factor
                    {
                    dbg.location(90,4);
                    match(input,41,FOLLOW_41_in_factor541); 
                    dbg.location(90,8);
                    pushFollow(FOLLOW_factor_in_factor543);
                    factor();

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
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_K_PROGRAM_in_start10 = new BitSet(new long[]{0x0000000005083000L});
    public static final BitSet FOLLOW_declarations_in_start12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BEGIN_in_start14 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_start16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_K_END_in_start18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations30 = new BitSet(new long[]{0x0000000005082002L});
    public static final BitSet FOLLOW_set_in_declaration42 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_idList_in_declaration58 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_K_SEM_in_declaration60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList71 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_idList74 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idList76 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_command_in_commands89 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_K_SEM_in_commands91 = new BitSet(new long[]{0x0000000010A40402L});
    public static final BitSet FOLLOW_flowControl_in_commands95 = new BitSet(new long[]{0x0000000010A40402L});
    public static final BitSet FOLLOW_definition_in_command109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_command113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_command117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifControl_in_flowControl129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileControl_in_flowControl133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_definition145 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_definition147 = new BitSet(new long[]{0x0000001300000C10L});
    public static final BitSet FOLLOW_STRING_in_definition152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_definition158 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_praedicate__in_definition161 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_definition171 = new BitSet(new long[]{0x000006C080000000L});
    public static final BitSet FOLLOW_definition__in_definition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition179 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_arith_in_definition181 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_definition183 = new BitSet(new long[]{0x000006C000000002L});
    public static final BitSet FOLLOW_arith__in_definition186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_definition198 = new BitSet(new long[]{0x000006C080000002L});
    public static final BitSet FOLLOW_definition___in_definition200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_definition207 = new BitSet(new long[]{0x000006C080000002L});
    public static final BitSet FOLLOW_definition___in_definition209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith__in_definition_223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition_227 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_arith__in_definition_229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate__in_definition_233 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition_235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith__in_definition__252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition__256 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_arith__in_definition__258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate__in_definition__263 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition__265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_READ_in_read276 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_read278 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_read280 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_read282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRINTLN_in_print292 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_print294 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_set_in_print296 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_print304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_IF_in_ifControl315 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_ifControl317 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_THEN_in_ifControl319 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl321 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_K_ELSE_in_ifControl324 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_K_FI_in_ifControl330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WHILE_in_whileControl342 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicats_in_whileControl344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_DO_in_whileControl346 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_whileControl348 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_OD_in_whileControl350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate_in_praedicats362 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_praedicats364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LOGICAL_in_praedicats_378 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_praedicats_380 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_set_in_praedicate394 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_praedicate__in_praedicate411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PRAEDICATE_in_praedicate_424 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_set_in_praedicate_426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arith451 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_arith__in_arith453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_arith_465 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_arith_in_arith_467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_arith_471 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_arith_in_arith_473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term484 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_term__in_term486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_term_498 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_term_in_term_500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_term_504 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_term_in_term_506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_factor532 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_arith_in_factor534 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_factor541 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_factor_in_factor543 = new BitSet(new long[]{0x0000000000000002L});

}