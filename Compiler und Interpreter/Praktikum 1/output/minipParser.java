// $ANTLR 3.4 E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g 2014-04-13 10:20:56

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
    "invalidRule", "factor", "whileControl", "term", "definition__", "praedicats", 
    "definition", "ifControl", "idList", "start", "declarations", "praedicate", 
    "commands", "flowControl", "praedicate_", "praedicats_", "read", "arith", 
    "arith_", "command", "term_", "declaration", "definition_", "print"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
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
    public String getGrammarFileName() { return "E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g"; }



    // $ANTLR start "start"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:1: start : K_PROGRAM declarations K_BEGIN commands K_END ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:7: ( K_PROGRAM declarations K_BEGIN commands K_END )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:9: K_PROGRAM declarations K_BEGIN commands K_END
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:6:1: declarations : ( declaration )* ;
    public final void declarations() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:2: ( ( declaration )* )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: ( declaration )*
            {
            dbg.location(7,4);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: ( declaration )*
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

            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:4: declaration
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:10:1: declaration : ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM ;
    public final void declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:2: ( ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:11:4: ( K_INTEGER | K_REAL | K_STRING | K_BOOLEAN ) idList K_SEM
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:1: idList : ID ( ',' ID )* ;
    public final void idList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "idList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:8: ( ID ( ',' ID )* )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:10: ID ( ',' ID )*
            {
            dbg.location(14,10);
            match(input,ID,FOLLOW_ID_in_idList71); 
            dbg.location(14,13);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:13: ( ',' ID )*
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

            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:14:14: ',' ID
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:1: commands : ( command K_SEM | flowControl )+ ;
    public final void commands() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:9: ( ( command K_SEM | flowControl )+ )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:11: ( command K_SEM | flowControl )+
            {
            dbg.location(17,11);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:11: ( command K_SEM | flowControl )+
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

            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:12: command K_SEM
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

            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:17:28: flowControl
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:1: command : ( definition | read | print );
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:9: ( definition | read | print )
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:11: definition
                    {
                    dbg.location(21,11);
                    pushFollow(FOLLOW_definition_in_command109);
                    definition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:24: read
                    {
                    dbg.location(21,24);
                    pushFollow(FOLLOW_read_in_command113);
                    read();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:21:31: print
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:24:1: flowControl : ( ifControl | whileControl );
    public final void flowControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flowControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:2: ( ifControl | whileControl )
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:4: ifControl
                    {
                    dbg.location(25,4);
                    pushFollow(FOLLOW_ifControl_in_flowControl129);
                    ifControl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:25:16: whileControl
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:28:1: definition : ID ':=' ( STRING | BOOLEAN ( praedicats_ )? | ID definition__ | '(' arith ')' ( arith_ | term_ )? | INTEGER definition_ | REAL definition_ ) ;
    public final void definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:2: ( ID ':=' ( STRING | BOOLEAN ( praedicats_ )? | ID definition__ | '(' arith ')' ( arith_ | term_ )? | INTEGER definition_ | REAL definition_ ) )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:29:4: ID ':=' ( STRING | BOOLEAN ( praedicats_ )? | ID definition__ | '(' arith ')' ( arith_ | term_ )? | INTEGER definition_ | REAL definition_ )
            {
            dbg.location(29,4);
            match(input,ID,FOLLOW_ID_in_definition145); 
            dbg.location(29,7);
            match(input,43,FOLLOW_43_in_definition147); 
            dbg.location(30,2);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:30:2: ( STRING | BOOLEAN ( praedicats_ )? | ID definition__ | '(' arith ')' ( arith_ | term_ )? | INTEGER definition_ | REAL definition_ )
            int alt8=6;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case STRING:
                {
                alt8=1;
                }
                break;
            case BOOLEAN:
                {
                alt8=2;
                }
                break;
            case ID:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case INTEGER:
                {
                alt8=5;
                }
                break;
            case REAL:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:30:3: STRING
                    {
                    dbg.location(30,3);
                    match(input,STRING,FOLLOW_STRING_in_definition152); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:4: BOOLEAN ( praedicats_ )?
                    {
                    dbg.location(31,4);
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_definition158); 
                    dbg.location(31,12);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:12: ( praedicats_ )?
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

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:31:12: praedicats_
                            {
                            dbg.location(31,12);
                            pushFollow(FOLLOW_praedicats__in_definition160);
                            praedicats_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:32:4: ID definition__
                    {
                    dbg.location(32,4);
                    match(input,ID,FOLLOW_ID_in_definition166); 
                    dbg.location(32,7);
                    pushFollow(FOLLOW_definition___in_definition168);
                    definition__();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:4: '(' arith ')' ( arith_ | term_ )?
                    {
                    dbg.location(33,4);
                    match(input,36,FOLLOW_36_in_definition174); 
                    dbg.location(33,8);
                    pushFollow(FOLLOW_arith_in_definition176);
                    arith();

                    state._fsp--;

                    dbg.location(33,14);
                    match(input,37,FOLLOW_37_in_definition178); 
                    dbg.location(33,18);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:18: ( arith_ | term_ )?
                    int alt7=3;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==39||LA7_0==41) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==38||LA7_0==42) ) {
                        alt7=2;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:19: arith_
                            {
                            dbg.location(33,19);
                            pushFollow(FOLLOW_arith__in_definition181);
                            arith_();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:33:28: term_
                            {
                            dbg.location(33,28);
                            pushFollow(FOLLOW_term__in_definition185);
                            term_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:34:4: INTEGER definition_
                    {
                    dbg.location(34,4);
                    match(input,INTEGER,FOLLOW_INTEGER_in_definition193); 
                    dbg.location(34,12);
                    pushFollow(FOLLOW_definition__in_definition195);
                    definition_();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:35:4: REAL definition_
                    {
                    dbg.location(35,4);
                    match(input,REAL,FOLLOW_REAL_in_definition201); 
                    dbg.location(35,9);
                    pushFollow(FOLLOW_definition__in_definition203);
                    definition_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:38:1: definition_ : ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? |);
    public final void definition_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:2: ( arith_ | term_ ( arith_ )? | praedicate_ ( praedicats_ )? |)
            int alt11=4;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 39:
            case 41:
                {
                alt11=1;
                }
                break;
            case 38:
            case 42:
                {
                alt11=2;
                }
                break;
            case OP_PRAEDICATE:
                {
                alt11=3;
                }
                break;
            case K_SEM:
                {
                alt11=4;
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:4: arith_
                    {
                    dbg.location(39,4);
                    pushFollow(FOLLOW_arith__in_definition_216);
                    arith_();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:13: term_ ( arith_ )?
                    {
                    dbg.location(39,13);
                    pushFollow(FOLLOW_term__in_definition_220);
                    term_();

                    state._fsp--;

                    dbg.location(39,19);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:19: ( arith_ )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==39||LA9_0==41) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:19: arith_
                            {
                            dbg.location(39,19);
                            pushFollow(FOLLOW_arith__in_definition_222);
                            arith_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:29: praedicate_ ( praedicats_ )?
                    {
                    dbg.location(39,29);
                    pushFollow(FOLLOW_praedicate__in_definition_227);
                    praedicate_();

                    state._fsp--;

                    dbg.location(39,41);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:41: ( praedicats_ )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==OP_LOGICAL) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:39:41: praedicats_
                            {
                            dbg.location(39,41);
                            pushFollow(FOLLOW_praedicats__in_definition_229);
                            praedicats_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:40:2: 
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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:42:1: definition__ : ( arith_ | term_ ( arith_ )? | ( praedicate_ )? ( praedicats_ )? );
    public final void definition__() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition__");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:2: ( arith_ | term_ ( arith_ )? | ( praedicate_ )? ( praedicats_ )? )
            int alt15=3;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case 39:
            case 41:
                {
                alt15=1;
                }
                break;
            case 38:
            case 42:
                {
                alt15=2;
                }
                break;
            case K_SEM:
            case OP_LOGICAL:
            case OP_PRAEDICATE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:4: arith_
                    {
                    dbg.location(43,4);
                    pushFollow(FOLLOW_arith__in_definition__244);
                    arith_();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:13: term_ ( arith_ )?
                    {
                    dbg.location(43,13);
                    pushFollow(FOLLOW_term__in_definition__248);
                    term_();

                    state._fsp--;

                    dbg.location(43,19);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:19: ( arith_ )?
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

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:19: arith_
                            {
                            dbg.location(43,19);
                            pushFollow(FOLLOW_arith__in_definition__250);
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:29: ( praedicate_ )? ( praedicats_ )?
                    {
                    dbg.location(43,29);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:29: ( praedicate_ )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==OP_PRAEDICATE) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:29: praedicate_
                            {
                            dbg.location(43,29);
                            pushFollow(FOLLOW_praedicate__in_definition__255);
                            praedicate_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(43,42);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:42: ( praedicats_ )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==OP_LOGICAL) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:43:42: praedicats_
                            {
                            dbg.location(43,42);
                            pushFollow(FOLLOW_praedicats__in_definition__258);
                            praedicats_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}


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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:1: read : K_READ '(' ID ')' ;
    public final void read() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:6: ( K_READ '(' ID ')' )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:65:8: K_READ '(' ID ')'
            {
            dbg.location(65,8);
            match(input,K_READ,FOLLOW_K_READ_in_read275); 
            dbg.location(65,15);
            match(input,36,FOLLOW_36_in_read277); 
            dbg.location(65,19);
            match(input,ID,FOLLOW_ID_in_read279); 
            dbg.location(65,22);
            match(input,37,FOLLOW_37_in_read281); 

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
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read"



    // $ANTLR start "print"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:1: print : K_PRINTLN '(' ( ID | STRING ) ')' ;
    public final void print() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:7: ( K_PRINTLN '(' ( ID | STRING ) ')' )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:68:9: K_PRINTLN '(' ( ID | STRING ) ')'
            {
            dbg.location(68,9);
            match(input,K_PRINTLN,FOLLOW_K_PRINTLN_in_print291); 
            dbg.location(68,19);
            match(input,36,FOLLOW_36_in_print293); 
            dbg.location(68,23);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(68,37);
            match(input,37,FOLLOW_37_in_print303); 

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
            dbg.exitRule(getGrammarFileName(), "print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "print"



    // $ANTLR start "ifControl"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:71:1: ifControl : K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI ;
    public final void ifControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:2: ( K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:4: K_IF praedicate K_THEN commands ( K_ELSE commands )? K_FI
            {
            dbg.location(72,4);
            match(input,K_IF,FOLLOW_K_IF_in_ifControl314); 
            dbg.location(72,9);
            pushFollow(FOLLOW_praedicate_in_ifControl316);
            praedicate();

            state._fsp--;

            dbg.location(72,20);
            match(input,K_THEN,FOLLOW_K_THEN_in_ifControl318); 
            dbg.location(72,27);
            pushFollow(FOLLOW_commands_in_ifControl320);
            commands();

            state._fsp--;

            dbg.location(72,36);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:36: ( K_ELSE commands )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==K_ELSE) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:72:37: K_ELSE commands
                    {
                    dbg.location(72,37);
                    match(input,K_ELSE,FOLLOW_K_ELSE_in_ifControl323); 
                    dbg.location(72,44);
                    pushFollow(FOLLOW_commands_in_ifControl325);
                    commands();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(72,55);
            match(input,K_FI,FOLLOW_K_FI_in_ifControl329); 

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
            dbg.exitRule(getGrammarFileName(), "ifControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifControl"



    // $ANTLR start "whileControl"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:75:1: whileControl : K_WHILE praedicats K_DO commands K_OD ;
    public final void whileControl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whileControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:2: ( K_WHILE praedicats K_DO commands K_OD )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:76:4: K_WHILE praedicats K_DO commands K_OD
            {
            dbg.location(76,4);
            match(input,K_WHILE,FOLLOW_K_WHILE_in_whileControl341); 
            dbg.location(76,12);
            pushFollow(FOLLOW_praedicats_in_whileControl343);
            praedicats();

            state._fsp--;

            dbg.location(76,23);
            match(input,K_DO,FOLLOW_K_DO_in_whileControl345); 
            dbg.location(76,28);
            pushFollow(FOLLOW_commands_in_whileControl347);
            commands();

            state._fsp--;

            dbg.location(76,37);
            match(input,K_OD,FOLLOW_K_OD_in_whileControl349); 

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
            dbg.exitRule(getGrammarFileName(), "whileControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "whileControl"



    // $ANTLR start "praedicats"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:79:1: praedicats : praedicate ( praedicats_ )? ;
    public final void praedicats() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:2: ( praedicate ( praedicats_ )? )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:4: praedicate ( praedicats_ )?
            {
            dbg.location(80,4);
            pushFollow(FOLLOW_praedicate_in_praedicats361);
            praedicate();

            state._fsp--;

            dbg.location(80,15);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:15: ( praedicats_ )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==OP_LOGICAL) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:80:15: praedicats_
                    {
                    dbg.location(80,15);
                    pushFollow(FOLLOW_praedicats__in_praedicats363);
                    praedicats_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}


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
            dbg.exitRule(getGrammarFileName(), "praedicats");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicats"



    // $ANTLR start "praedicats_"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:83:1: praedicats_ : ( OP_LOGICAL praedicate )+ ;
    public final void praedicats_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicats_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:2: ( ( OP_LOGICAL praedicate )+ )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:4: ( OP_LOGICAL praedicate )+
            {
            dbg.location(84,4);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:4: ( OP_LOGICAL praedicate )+
            int cnt18=0;
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==OP_LOGICAL) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:84:5: OP_LOGICAL praedicate
            	    {
            	    dbg.location(84,5);
            	    match(input,OP_LOGICAL,FOLLOW_OP_LOGICAL_in_praedicats_377); 
            	    dbg.location(84,16);
            	    pushFollow(FOLLOW_praedicate_in_praedicats_379);
            	    praedicate();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt18++;
            } while (true);
            } finally {dbg.exitSubRule(18);}


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
            dbg.exitRule(getGrammarFileName(), "praedicats_");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "praedicats_"



    // $ANTLR start "praedicate"
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:87:1: praedicate : ( ID ( praedicate_ )? | ( REAL | INTEGER ) praedicate_ | BOOLEAN );
    public final void praedicate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:2: ( ID ( praedicate_ )? | ( REAL | INTEGER ) praedicate_ | BOOLEAN )
            int alt20=3;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt20=1;
                }
                break;
            case INTEGER:
            case REAL:
                {
                alt20=2;
                }
                break;
            case BOOLEAN:
                {
                alt20=3;
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:4: ID ( praedicate_ )?
                    {
                    dbg.location(88,4);
                    match(input,ID,FOLLOW_ID_in_praedicate393); 
                    dbg.location(88,7);
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:7: ( praedicate_ )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OP_PRAEDICATE) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:7: praedicate_
                            {
                            dbg.location(88,7);
                            pushFollow(FOLLOW_praedicate__in_praedicate395);
                            praedicate_();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:22: ( REAL | INTEGER ) praedicate_
                    {
                    dbg.location(88,22);
                    if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(88,39);
                    pushFollow(FOLLOW_praedicate__in_praedicate408);
                    praedicate_();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:88:53: BOOLEAN
                    {
                    dbg.location(88,53);
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_praedicate412); 

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
        dbg.location(89, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:91:1: praedicate_ : OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) ;
    public final void praedicate_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "praedicate_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:92:2: ( OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER ) )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:92:4: OP_PRAEDICATE ( ID | BOOLEAN | REAL | INTEGER )
            {
            dbg.location(92,4);
            match(input,OP_PRAEDICATE,FOLLOW_OP_PRAEDICATE_in_praedicate_424); 
            dbg.location(92,18);
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
        dbg.location(93, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:95:1: arith : term ( arith_ )? ;
    public final void arith() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:95:7: ( term ( arith_ )? )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:95:9: term ( arith_ )?
            {
            dbg.location(95,9);
            pushFollow(FOLLOW_term_in_arith451);
            term();

            state._fsp--;

            dbg.location(95,14);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:95:14: ( arith_ )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==39||LA21_0==41) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:95:14: arith_
                    {
                    dbg.location(95,14);
                    pushFollow(FOLLOW_arith__in_arith453);
                    arith_();

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
        dbg.location(96, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:98:1: arith_ : ( '+' arith | '-' arith );
    public final void arith_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:98:8: ( '+' arith | '-' arith )
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:98:10: '+' arith
                    {
                    dbg.location(98,10);
                    match(input,39,FOLLOW_39_in_arith_465); 
                    dbg.location(98,14);
                    pushFollow(FOLLOW_arith_in_arith_467);
                    arith();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:98:22: '-' arith
                    {
                    dbg.location(98,22);
                    match(input,41,FOLLOW_41_in_arith_471); 
                    dbg.location(98,26);
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
        dbg.location(99, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:101:1: term : factor ( term_ )? ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:101:6: ( factor ( term_ )? )
            dbg.enterAlt(1);

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:101:8: factor ( term_ )?
            {
            dbg.location(101,8);
            pushFollow(FOLLOW_factor_in_term484);
            factor();

            state._fsp--;

            dbg.location(101,15);
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:101:15: ( term_ )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==38||LA23_0==42) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:101:15: term_
                    {
                    dbg.location(101,15);
                    pushFollow(FOLLOW_term__in_term486);
                    term_();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(102, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:104:1: term_ : ( '*' term | '/' term );
    public final void term_() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term_");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:104:7: ( '*' term | '/' term )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==42) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:104:9: '*' term
                    {
                    dbg.location(104,9);
                    match(input,38,FOLLOW_38_in_term_498); 
                    dbg.location(104,13);
                    pushFollow(FOLLOW_term_in_term_500);
                    term();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:104:20: '/' term
                    {
                    dbg.location(104,20);
                    match(input,42,FOLLOW_42_in_term_504); 
                    dbg.location(104,24);
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
        dbg.location(105, 1);

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
    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:107:1: factor : ( ( ID | REAL | INTEGER ) | '(' arith ')' | '-' factor );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 0);

        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:107:8: ( ( ID | REAL | INTEGER ) | '(' arith ')' | '-' factor )
            int alt25=3;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            switch ( input.LA(1) ) {
            case ID:
            case INTEGER:
            case REAL:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:107:10: ( ID | REAL | INTEGER )
                    {
                    dbg.location(107,10);
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

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:108:4: '(' arith ')'
                    {
                    dbg.location(108,4);
                    match(input,36,FOLLOW_36_in_factor532); 
                    dbg.location(108,8);
                    pushFollow(FOLLOW_arith_in_factor534);
                    arith();

                    state._fsp--;

                    dbg.location(108,14);
                    match(input,37,FOLLOW_37_in_factor536); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:109:4: '-' factor
                    {
                    dbg.location(109,4);
                    match(input,41,FOLLOW_41_in_factor541); 
                    dbg.location(109,8);
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
        dbg.location(110, 1);

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
    public static final BitSet FOLLOW_BOOLEAN_in_definition158 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_definition166 = new BitSet(new long[]{0x000006C0C0000000L});
    public static final BitSet FOLLOW_definition___in_definition168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition174 = new BitSet(new long[]{0x0000021100000C00L});
    public static final BitSet FOLLOW_arith_in_definition176 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_definition178 = new BitSet(new long[]{0x000006C000000002L});
    public static final BitSet FOLLOW_arith__in_definition181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_definition193 = new BitSet(new long[]{0x000006C080000000L});
    public static final BitSet FOLLOW_definition__in_definition195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_definition201 = new BitSet(new long[]{0x000006C080000000L});
    public static final BitSet FOLLOW_definition__in_definition203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith__in_definition_216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition_220 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_arith__in_definition_222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate__in_definition_227 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition_229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith__in_definition__244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term__in_definition__248 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_arith__in_definition__250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate__in_definition__255 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_definition__258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_READ_in_read275 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_read277 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_read279 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_read281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRINTLN_in_print291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_print293 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_set_in_print295 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_print303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_IF_in_ifControl314 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_ifControl316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_THEN_in_ifControl318 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl320 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_K_ELSE_in_ifControl323 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_ifControl325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_K_FI_in_ifControl329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WHILE_in_whileControl341 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicats_in_whileControl343 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_DO_in_whileControl345 = new BitSet(new long[]{0x0000000010A40400L});
    public static final BitSet FOLLOW_commands_in_whileControl347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_OD_in_whileControl349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_praedicate_in_praedicats361 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_praedicats__in_praedicats363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LOGICAL_in_praedicats_377 = new BitSet(new long[]{0x0000000100000C10L});
    public static final BitSet FOLLOW_praedicate_in_praedicats_379 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ID_in_praedicate393 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_praedicate__in_praedicate395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_praedicate400 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_praedicate__in_praedicate408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_praedicate412 = new BitSet(new long[]{0x0000000000000002L});
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