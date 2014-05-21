// $ANTLR 3.4 /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g 2013-06-18 13:55:27
package symbolRaetsel.output;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BildRaetselChef extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "EQUALS", "PUZZLE", "SUB", "WS", "ZAHL", "ZIFFER"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQUALS=5;
    public static final int PUZZLE=6;
    public static final int SUB=7;
    public static final int WS=8;
    public static final int ZAHL=9;
    public static final int ZIFFER=10;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "number", "term2", "term1", "term3", "calc", "puzzle", 
    "start"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public BildRaetselChef(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public BildRaetselChef(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public BildRaetselChef(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return BildRaetselChef.tokenNames; }
    public String getGrammarFileName() { return "/home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:11:1: start : puzzle ;
    public final BildRaetselChef.start_return start() throws RecognitionException {
        BildRaetselChef.start_return retval = new BildRaetselChef.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        BildRaetselChef.puzzle_return puzzle1 =null;



        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:11:7: ( puzzle )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:11:9: puzzle
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(11,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_puzzle_in_start41);
            puzzle1=puzzle();

            state._fsp--;

            adaptor.addChild(root_0, puzzle1.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class puzzle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:13:1: puzzle : ^( PUZZLE calc calc calc calc calc calc ) ;
    public final BildRaetselChef.puzzle_return puzzle() throws RecognitionException {
        BildRaetselChef.puzzle_return retval = new BildRaetselChef.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUZZLE2=null;
        BildRaetselChef.calc_return calc3 =null;

        BildRaetselChef.calc_return calc4 =null;

        BildRaetselChef.calc_return calc5 =null;

        BildRaetselChef.calc_return calc6 =null;

        BildRaetselChef.calc_return calc7 =null;

        BildRaetselChef.calc_return calc8 =null;


        CommonTree PUZZLE2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "puzzle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:13:8: ( ^( PUZZLE calc calc calc calc calc calc ) )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:13:10: ^( PUZZLE calc calc calc calc calc calc )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(13,10);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(13,12);
            _last = (CommonTree)input.LT(1);
            PUZZLE2=(CommonTree)match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle51); 
            PUZZLE2_tree = (CommonTree)adaptor.dupNode(PUZZLE2);


            root_1 = (CommonTree)adaptor.becomeRoot(PUZZLE2_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(13,19);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle53);
            calc3=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc3.getTree());

            dbg.location(13,24);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle55);
            calc4=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc4.getTree());

            dbg.location(13,29);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle57);
            calc5=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc5.getTree());

            dbg.location(13,34);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle59);
            calc6=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc6.getTree());

            dbg.location(13,39);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle61);
            calc7=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc7.getTree());

            dbg.location(13,44);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle63);
            calc8=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc8.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "puzzle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "puzzle"


    public static class calc_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calc"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:15:1: calc : ( ^( EQUALS ^( ADD term1 term2 ) term3 ) | ^( EQUALS ^( SUB term1 term2 ) term3 ) -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 ) );
    public final BildRaetselChef.calc_return calc() throws RecognitionException {
        BildRaetselChef.calc_return retval = new BildRaetselChef.calc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS9=null;
        CommonTree ADD10=null;
        CommonTree EQUALS14=null;
        CommonTree SUB15=null;
        BildRaetselChef.term1_return term111 =null;

        BildRaetselChef.term2_return term212 =null;

        BildRaetselChef.term3_return term313 =null;

        BildRaetselChef.term1_return term116 =null;

        BildRaetselChef.term2_return term217 =null;

        BildRaetselChef.term3_return term318 =null;


        CommonTree EQUALS9_tree=null;
        CommonTree ADD10_tree=null;
        CommonTree EQUALS14_tree=null;
        CommonTree SUB15_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_term1=new RewriteRuleSubtreeStream(adaptor,"rule term1");
        RewriteRuleSubtreeStream stream_term3=new RewriteRuleSubtreeStream(adaptor,"rule term3");
        RewriteRuleSubtreeStream stream_term2=new RewriteRuleSubtreeStream(adaptor,"rule term2");
        try { dbg.enterRule(getGrammarFileName(), "calc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:15:6: ( ^( EQUALS ^( ADD term1 term2 ) term3 ) | ^( EQUALS ^( SUB term1 term2 ) term3 ) -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 ) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQUALS) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
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
                        new NoViableAltException("", 1, 1, input);

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

                    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:15:8: ^( EQUALS ^( ADD term1 term2 ) term3 )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(15,8);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(15,10);
                    _last = (CommonTree)input.LT(1);
                    EQUALS9=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_calc74); 
                    EQUALS9_tree = (CommonTree)adaptor.dupNode(EQUALS9);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS9_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,17);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(15,19);
                    _last = (CommonTree)input.LT(1);
                    ADD10=(CommonTree)match(input,ADD,FOLLOW_ADD_in_calc77); 
                    ADD10_tree = (CommonTree)adaptor.dupNode(ADD10);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD10_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term1_in_calc79);
                    term111=term1();

                    state._fsp--;

                    adaptor.addChild(root_2, term111.getTree());

                    dbg.location(15,29);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term2_in_calc81);
                    term212=term2();

                    state._fsp--;

                    adaptor.addChild(root_2, term212.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(15,36);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term3_in_calc84);
                    term313=term3();

                    state._fsp--;

                    adaptor.addChild(root_1, term313.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:16:8: ^( EQUALS ^( SUB term1 term2 ) term3 )
                    {
                    dbg.location(16,8);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(16,10);
                    _last = (CommonTree)input.LT(1);
                    EQUALS14=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_calc95);  
                    stream_EQUALS.add(EQUALS14);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,17);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(16,19);
                    _last = (CommonTree)input.LT(1);
                    SUB15=(CommonTree)match(input,SUB,FOLLOW_SUB_in_calc98);  
                    stream_SUB.add(SUB15);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term1_in_calc100);
                    term116=term1();

                    state._fsp--;

                    stream_term1.add(term116.getTree());
                    dbg.location(16,29);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term2_in_calc102);
                    term217=term2();

                    state._fsp--;

                    stream_term2.add(term217.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(16,36);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term3_in_calc105);
                    term318=term3();

                    state._fsp--;

                    stream_term3.add(term318.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: term3, term1, term2, EQUALS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 16:43: -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 )
                    {
                        dbg.location(16,46);
                        // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:16:46: ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(16,48);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EQUALS, "=")
                        , root_1);

                        dbg.location(16,60);
                        // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:16:60: ^( ADD[\"+\"] term3 term2 )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(16,62);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        dbg.location(16,71);
                        adaptor.addChild(root_2, stream_term3.nextTree());
                        dbg.location(16,77);
                        adaptor.addChild(root_2, stream_term2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(16,84);
                        adaptor.addChild(root_1, stream_term1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "calc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "calc"


    public static class term1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term1"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:19:1: term1 : number ;
    public final BildRaetselChef.term1_return term1() throws RecognitionException {
        BildRaetselChef.term1_return retval = new BildRaetselChef.term1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        BildRaetselChef.number_return number19 =null;



        try { dbg.enterRule(getGrammarFileName(), "term1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:19:7: ( number )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:19:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(19,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term1143);
            number19=number();

            state._fsp--;

            adaptor.addChild(root_0, number19.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term1"


    public static class term2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term2"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:20:1: term2 : number ;
    public final BildRaetselChef.term2_return term2() throws RecognitionException {
        BildRaetselChef.term2_return retval = new BildRaetselChef.term2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        BildRaetselChef.number_return number20 =null;



        try { dbg.enterRule(getGrammarFileName(), "term2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:20:7: ( number )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:20:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(20,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term2151);
            number20=number();

            state._fsp--;

            adaptor.addChild(root_0, number20.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term2"


    public static class term3_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term3"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:21:1: term3 : number ;
    public final BildRaetselChef.term3_return term3() throws RecognitionException {
        BildRaetselChef.term3_return retval = new BildRaetselChef.term3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        BildRaetselChef.number_return number21 =null;



        try { dbg.enterRule(getGrammarFileName(), "term3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:21:7: ( number )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:21:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term3159);
            number21=number();

            state._fsp--;

            adaptor.addChild(root_0, number21.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term3"


    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:23:1: number : ^( ZAHL ( ZIFFER )+ ) ;
    public final BildRaetselChef.number_return number() throws RecognitionException {
        BildRaetselChef.number_return retval = new BildRaetselChef.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ZAHL22=null;
        CommonTree ZIFFER23=null;

        CommonTree ZAHL22_tree=null;
        CommonTree ZIFFER23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:23:8: ( ^( ZAHL ( ZIFFER )+ ) )
            dbg.enterAlt(1);

            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:23:10: ^( ZAHL ( ZIFFER )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(23,10);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(23,12);
            _last = (CommonTree)input.LT(1);
            ZAHL22=(CommonTree)match(input,ZAHL,FOLLOW_ZAHL_in_number169); 
            ZAHL22_tree = (CommonTree)adaptor.dupNode(ZAHL22);


            root_1 = (CommonTree)adaptor.becomeRoot(ZAHL22_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(23,17);
            // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:23:17: ( ZIFFER )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==ZIFFER) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jonny/Dropbox/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jonny und Loki/SymbolRaetsel/src/symbolRaetsel/BildRaetselChef.g:23:17: ZIFFER
            	    {
            	    dbg.location(23,17);
            	    _last = (CommonTree)input.LT(1);
            	    ZIFFER23=(CommonTree)match(input,ZIFFER,FOLLOW_ZIFFER_in_number171); 
            	    ZIFFER23_tree = (CommonTree)adaptor.dupNode(ZIFFER23);


            	    adaptor.addChild(root_1, ZIFFER23_tree);


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


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_puzzle_in_start41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUZZLE_in_puzzle51 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_calc_in_puzzle53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle55 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle59 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle63 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_calc74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_calc77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term1_in_calc79 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_term2_in_calc81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term3_in_calc84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_calc95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_calc98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term1_in_calc100 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_term2_in_calc102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term3_in_calc105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_term1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZAHL_in_number169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ZIFFER_in_number171 = new BitSet(new long[]{0x0000000000000408L});

}