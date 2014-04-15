// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g 2014-04-14 10:13:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetzelParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BCHAR", "COMMENT", "EQ", "NL", "OP", "WS"
    };

    public static final int EOF=-1;
    public static final int BCHAR=4;
    public static final int COMMENT=5;
    public static final int EQ=6;
    public static final int NL=7;
    public static final int OP=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "signline", "signs", "start"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolraetzelParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolraetzelParser(TokenStream input, int port, RecognizerSharedState state) {
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

public SymbolraetzelParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return SymbolraetzelParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g"; }



    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:4:1: start : signline NL OP OP OP NL signline NL EQ EQ EQ NL signline ( NL )* ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:4:8: ( signline NL OP OP OP NL signline NL EQ EQ EQ NL signline ( NL )* )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:4:10: signline NL OP OP OP NL signline NL EQ EQ EQ NL signline ( NL )*
            {
            dbg.location(4,10);
            pushFollow(FOLLOW_signline_in_start12);
            signline();

            state._fsp--;

            dbg.location(4,19);
            match(input,NL,FOLLOW_NL_in_start14); 
            dbg.location(4,22);
            match(input,OP,FOLLOW_OP_in_start16); 
            dbg.location(4,25);
            match(input,OP,FOLLOW_OP_in_start18); 
            dbg.location(4,28);
            match(input,OP,FOLLOW_OP_in_start20); 
            dbg.location(4,31);
            match(input,NL,FOLLOW_NL_in_start22); 
            dbg.location(4,34);
            pushFollow(FOLLOW_signline_in_start24);
            signline();

            state._fsp--;

            dbg.location(4,43);
            match(input,NL,FOLLOW_NL_in_start26); 
            dbg.location(4,46);
            match(input,EQ,FOLLOW_EQ_in_start28); 
            dbg.location(4,49);
            match(input,EQ,FOLLOW_EQ_in_start30); 
            dbg.location(4,52);
            match(input,EQ,FOLLOW_EQ_in_start32); 
            dbg.location(4,55);
            match(input,NL,FOLLOW_NL_in_start34); 
            dbg.location(4,58);
            pushFollow(FOLLOW_signline_in_start36);
            signline();

            state._fsp--;

            dbg.location(4,67);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:4:67: ( NL )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:4:67: NL
            	    {
            	    dbg.location(4,67);
            	    match(input,NL,FOLLOW_NL_in_start38); 

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
        dbg.location(5, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "signline"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:7:1: signline : signs OP signs EQ signs ;
    public final void signline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "signline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:7:9: ( signs OP signs EQ signs )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:7:11: signs OP signs EQ signs
            {
            dbg.location(7,11);
            pushFollow(FOLLOW_signs_in_signline49);
            signs();

            state._fsp--;

            dbg.location(7,17);
            match(input,OP,FOLLOW_OP_in_signline51); 
            dbg.location(7,20);
            pushFollow(FOLLOW_signs_in_signline53);
            signs();

            state._fsp--;

            dbg.location(7,26);
            match(input,EQ,FOLLOW_EQ_in_signline55); 
            dbg.location(7,29);
            pushFollow(FOLLOW_signs_in_signline57);
            signs();

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
        dbg.location(8, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "signline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "signline"



    // $ANTLR start "signs"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:10:1: signs : ( BCHAR )+ ;
    public final void signs() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "signs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:10:7: ( ( BCHAR )+ )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:10:9: ( BCHAR )+
            {
            dbg.location(10,9);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:10:9: ( BCHAR )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==BCHAR) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 1\\Symbolraetzel.g:10:9: BCHAR
            	    {
            	    dbg.location(10,9);
            	    match(input,BCHAR,FOLLOW_BCHAR_in_signs70); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
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
        dbg.location(11, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "signs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "signs"

    // Delegated rules


 

    public static final BitSet FOLLOW_signline_in_start12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_start14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OP_in_start16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OP_in_start18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OP_in_start20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_start22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signline_in_start24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_start26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_in_start28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_in_start30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_in_start32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_start34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signline_in_start36 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NL_in_start38 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_signs_in_signline49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OP_in_signline51 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_signline53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_in_signline55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_signline57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BCHAR_in_signs70 = new BitSet(new long[]{0x0000000000000012L});

}