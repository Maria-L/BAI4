// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g 2011-05-26 13:21:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class Symbolraetsel3Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS_", "PLUS", "ERGEBNIS", "MINUS", "STRING", "NEWLINE"
    };
    public static final int EOF=-1;
    public static final int PLUS_=4;
    public static final int PLUS=5;
    public static final int ERGEBNIS=6;
    public static final int MINUS=7;
    public static final int STRING=8;
    public static final int NEWLINE=9;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "term2", "term1", "start", "string", "zeile", "newline", 
        "ergebnis", "berechnung"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public Symbolraetsel3Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public Symbolraetsel3Parser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public Symbolraetsel3Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return Symbolraetsel3Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:2: start : ( zeile | ( newline ) )* EOF ;
    public final Symbolraetsel3Parser.start_return start() throws RecognitionException {
        Symbolraetsel3Parser.start_return retval = new Symbolraetsel3Parser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        Symbolraetsel3Parser.zeile_return zeile1 = null;

        Symbolraetsel3Parser.newline_return newline2 = null;


        Object EOF3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:11: ( ( zeile | ( newline ) )* EOF )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:16: ( zeile | ( newline ) )* EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(11,16);
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:16: ( zeile | ( newline ) )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }
                else if ( (LA1_0==NEWLINE) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:17: zeile
            	    {
            	    dbg.location(11,17);
            	    pushFollow(FOLLOW_zeile_in_start44);
            	    zeile1=zeile();

            	    state._fsp--;

            	    adaptor.addChild(root_0, zeile1.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:23: ( newline )
            	    {
            	    dbg.location(11,23);
            	    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:23: ( newline )
            	    dbg.enterAlt(1);

            	    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:11:24: newline
            	    {
            	    dbg.location(11,31);
            	    pushFollow(FOLLOW_newline_in_start47);
            	    newline2=newline();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(11,36);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_start53); 
            EOF3_tree = (Object)adaptor.create(EOF3);
            adaptor.addChild(root_0, EOF3_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(11, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"

    public static class zeile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zeile"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:13:2: zeile : berechnung ;
    public final Symbolraetsel3Parser.zeile_return zeile() throws RecognitionException {
        Symbolraetsel3Parser.zeile_return retval = new Symbolraetsel3Parser.zeile_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Symbolraetsel3Parser.berechnung_return berechnung4 = null;



        try { dbg.enterRule(getGrammarFileName(), "zeile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:13:9: ( berechnung )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:13:11: berechnung
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(13,11);
            pushFollow(FOLLOW_berechnung_in_zeile63);
            berechnung4=berechnung();

            state._fsp--;

            adaptor.addChild(root_0, berechnung4.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(13, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zeile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "zeile"

    public static class berechnung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "berechnung"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:15:2: berechnung : ( term1 PLUS term2 ERGEBNIS ergebnis -> ^( ERGEBNIS ^( PLUS_ term1 term2 ) ergebnis ) | term1 MINUS term2 ERGEBNIS ergebnis -> ^( ERGEBNIS ^( PLUS_ ergebnis term2 ) term1 ) );
    public final Symbolraetsel3Parser.berechnung_return berechnung() throws RecognitionException {
        Symbolraetsel3Parser.berechnung_return retval = new Symbolraetsel3Parser.berechnung_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS6=null;
        Token ERGEBNIS8=null;
        Token MINUS11=null;
        Token ERGEBNIS13=null;
        Symbolraetsel3Parser.term1_return term15 = null;

        Symbolraetsel3Parser.term2_return term27 = null;

        Symbolraetsel3Parser.ergebnis_return ergebnis9 = null;

        Symbolraetsel3Parser.term1_return term110 = null;

        Symbolraetsel3Parser.term2_return term212 = null;

        Symbolraetsel3Parser.ergebnis_return ergebnis14 = null;


        Object PLUS6_tree=null;
        Object ERGEBNIS8_tree=null;
        Object MINUS11_tree=null;
        Object ERGEBNIS13_tree=null;
        RewriteRuleTokenStream stream_ERGEBNIS=new RewriteRuleTokenStream(adaptor,"token ERGEBNIS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_term1=new RewriteRuleSubtreeStream(adaptor,"rule term1");
        RewriteRuleSubtreeStream stream_term2=new RewriteRuleSubtreeStream(adaptor,"rule term2");
        RewriteRuleSubtreeStream stream_ergebnis=new RewriteRuleSubtreeStream(adaptor,"rule ergebnis");
        try { dbg.enterRule(getGrammarFileName(), "berechnung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:16:3: ( term1 PLUS term2 ERGEBNIS ergebnis -> ^( ERGEBNIS ^( PLUS_ term1 term2 ) ergebnis ) | term1 MINUS term2 ERGEBNIS ergebnis -> ^( ERGEBNIS ^( PLUS_ ergebnis term2 ) term1 ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==PLUS) ) {
                    alt2=1;
                }
                else if ( (LA2_1==MINUS) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:16:5: term1 PLUS term2 ERGEBNIS ergebnis
                    {
                    dbg.location(16,5);
                    pushFollow(FOLLOW_term1_in_berechnung75);
                    term15=term1();

                    state._fsp--;

                    stream_term1.add(term15.getTree());
                    dbg.location(16,11);
                    PLUS6=(Token)match(input,PLUS,FOLLOW_PLUS_in_berechnung77);  
                    stream_PLUS.add(PLUS6);

                    dbg.location(16,16);
                    pushFollow(FOLLOW_term2_in_berechnung79);
                    term27=term2();

                    state._fsp--;

                    stream_term2.add(term27.getTree());
                    dbg.location(16,22);
                    ERGEBNIS8=(Token)match(input,ERGEBNIS,FOLLOW_ERGEBNIS_in_berechnung81);  
                    stream_ERGEBNIS.add(ERGEBNIS8);

                    dbg.location(16,31);
                    pushFollow(FOLLOW_ergebnis_in_berechnung83);
                    ergebnis9=ergebnis();

                    state._fsp--;

                    stream_ergebnis.add(ergebnis9.getTree());


                    // AST REWRITE
                    // elements: ERGEBNIS, ergebnis, term2, term1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 16:40: -> ^( ERGEBNIS ^( PLUS_ term1 term2 ) ergebnis )
                    {
                        dbg.location(16,43);
                        // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:16:43: ^( ERGEBNIS ^( PLUS_ term1 term2 ) ergebnis )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(16,45);
                        root_1 = (Object)adaptor.becomeRoot(stream_ERGEBNIS.nextNode(), root_1);

                        dbg.location(16,54);
                        // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:16:54: ^( PLUS_ term1 term2 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(16,56);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS_, "PLUS_"), root_2);

                        dbg.location(16,62);
                        adaptor.addChild(root_2, stream_term1.nextTree());
                        dbg.location(16,68);
                        adaptor.addChild(root_2, stream_term2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(16,75);
                        adaptor.addChild(root_1, stream_ergebnis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:17:5: term1 MINUS term2 ERGEBNIS ergebnis
                    {
                    dbg.location(17,5);
                    pushFollow(FOLLOW_term1_in_berechnung105);
                    term110=term1();

                    state._fsp--;

                    stream_term1.add(term110.getTree());
                    dbg.location(17,11);
                    MINUS11=(Token)match(input,MINUS,FOLLOW_MINUS_in_berechnung107);  
                    stream_MINUS.add(MINUS11);

                    dbg.location(17,17);
                    pushFollow(FOLLOW_term2_in_berechnung109);
                    term212=term2();

                    state._fsp--;

                    stream_term2.add(term212.getTree());
                    dbg.location(17,23);
                    ERGEBNIS13=(Token)match(input,ERGEBNIS,FOLLOW_ERGEBNIS_in_berechnung111);  
                    stream_ERGEBNIS.add(ERGEBNIS13);

                    dbg.location(17,32);
                    pushFollow(FOLLOW_ergebnis_in_berechnung113);
                    ergebnis14=ergebnis();

                    state._fsp--;

                    stream_ergebnis.add(ergebnis14.getTree());


                    // AST REWRITE
                    // elements: ERGEBNIS, term2, term1, ergebnis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 17:41: -> ^( ERGEBNIS ^( PLUS_ ergebnis term2 ) term1 )
                    {
                        dbg.location(17,44);
                        // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:17:44: ^( ERGEBNIS ^( PLUS_ ergebnis term2 ) term1 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(17,46);
                        root_1 = (Object)adaptor.becomeRoot(stream_ERGEBNIS.nextNode(), root_1);

                        dbg.location(17,55);
                        // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:17:55: ^( PLUS_ ergebnis term2 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(17,57);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS_, "PLUS_"), root_2);

                        dbg.location(17,63);
                        adaptor.addChild(root_2, stream_ergebnis.nextTree());
                        dbg.location(17,72);
                        adaptor.addChild(root_2, stream_term2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(17,79);
                        adaptor.addChild(root_1, stream_term1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(17, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "berechnung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "berechnung"

    public static class term1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term1"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:19:2: term1 : string ;
    public final Symbolraetsel3Parser.term1_return term1() throws RecognitionException {
        Symbolraetsel3Parser.term1_return retval = new Symbolraetsel3Parser.term1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Symbolraetsel3Parser.string_return string15 = null;



        try { dbg.enterRule(getGrammarFileName(), "term1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:19:8: ( string )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:19:10: string
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(19,10);
            pushFollow(FOLLOW_string_in_term1138);
            string15=string();

            state._fsp--;

            adaptor.addChild(root_0, string15.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(19, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term1"

    public static class term2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term2"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:20:2: term2 : string ;
    public final Symbolraetsel3Parser.term2_return term2() throws RecognitionException {
        Symbolraetsel3Parser.term2_return retval = new Symbolraetsel3Parser.term2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Symbolraetsel3Parser.string_return string16 = null;



        try { dbg.enterRule(getGrammarFileName(), "term2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:20:8: ( string )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:20:10: string
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(20,10);
            pushFollow(FOLLOW_string_in_term2146);
            string16=string();

            state._fsp--;

            adaptor.addChild(root_0, string16.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(20, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term2"

    public static class ergebnis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ergebnis"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:22:2: ergebnis : string ;
    public final Symbolraetsel3Parser.ergebnis_return ergebnis() throws RecognitionException {
        Symbolraetsel3Parser.ergebnis_return retval = new Symbolraetsel3Parser.ergebnis_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Symbolraetsel3Parser.string_return string17 = null;



        try { dbg.enterRule(getGrammarFileName(), "ergebnis");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:22:10: ( string )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:22:12: string
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(22,12);
            pushFollow(FOLLOW_string_in_ergebnis154);
            string17=string();

            state._fsp--;

            adaptor.addChild(root_0, string17.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(22, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ergebnis");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ergebnis"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:24:2: string : STRING ;
    public final Symbolraetsel3Parser.string_return string() throws RecognitionException {
        Symbolraetsel3Parser.string_return retval = new Symbolraetsel3Parser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING18=null;

        Object STRING18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:24:9: ( STRING )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:24:11: STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,11);
            STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_string163); 
            STRING18_tree = (Object)adaptor.create(STRING18);
            adaptor.addChild(root_0, STRING18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(24, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "string"

    public static class newline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newline"
    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:25:2: newline : NEWLINE ;
    public final Symbolraetsel3Parser.newline_return newline() throws RecognitionException {
        Symbolraetsel3Parser.newline_return retval = new Symbolraetsel3Parser.newline_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE19=null;

        Object NEWLINE19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "newline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 2);

        try {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:25:10: ( NEWLINE )
            dbg.enterAlt(1);

            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:25:12: NEWLINE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(25,12);
            NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_newline171); 
            NEWLINE19_tree = (Object)adaptor.create(NEWLINE19);
            adaptor.addChild(root_0, NEWLINE19_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(25, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "newline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "newline"

    // Delegated rules


 

    public static final BitSet FOLLOW_zeile_in_start44 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_newline_in_start47 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_EOF_in_start53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_berechnung_in_zeile63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term1_in_berechnung75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PLUS_in_berechnung77 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_term2_in_berechnung79 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ERGEBNIS_in_berechnung81 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ergebnis_in_berechnung83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term1_in_berechnung105 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MINUS_in_berechnung107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_term2_in_berechnung109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ERGEBNIS_in_berechnung111 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ergebnis_in_berechnung113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_ergebnis154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_newline171 = new BitSet(new long[]{0x0000000000000002L});

}