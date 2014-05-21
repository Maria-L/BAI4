// $ANTLR 3.4 /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g 2013-05-28 13:01:09
package grammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleConverter extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "CALCULATION", "COMMENT", "ID", "NEWLINE", "OPERAND", "OPERATION", "SUB", "'='"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int ADD=4;
    public static final int CALCULATION=5;
    public static final int COMMENT=6;
    public static final int ID=7;
    public static final int NEWLINE=8;
    public static final int OPERAND=9;
    public static final int OPERATION=10;
    public static final int SUB=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "calc", "start", "puzzle", "operand"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public PuzzleConverter(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public PuzzleConverter(TreeNodeStream input, int port, RecognizerSharedState state) {
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

public PuzzleConverter(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return PuzzleConverter.tokenNames; }
    public String getGrammarFileName() { return "/Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:11:1: start : puzzle ;
    public final PuzzleConverter.start_return start() throws RecognitionException {
        PuzzleConverter.start_return retval = new PuzzleConverter.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PuzzleConverter.puzzle_return puzzle1 =null;



        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:11:7: ( puzzle )
            dbg.enterAlt(1);

            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:11:9: puzzle
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(11,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_puzzle_in_start44);
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
        dbg.location(11, 14);

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
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:13:1: puzzle : calc calc calc calc calc calc ;
    public final PuzzleConverter.puzzle_return puzzle() throws RecognitionException {
        PuzzleConverter.puzzle_return retval = new PuzzleConverter.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PuzzleConverter.calc_return calc2 =null;

        PuzzleConverter.calc_return calc3 =null;

        PuzzleConverter.calc_return calc4 =null;

        PuzzleConverter.calc_return calc5 =null;

        PuzzleConverter.calc_return calc6 =null;

        PuzzleConverter.calc_return calc7 =null;



        try { dbg.enterRule(getGrammarFileName(), "puzzle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:13:8: ( calc calc calc calc calc calc )
            dbg.enterAlt(1);

            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:13:10: calc calc calc calc calc calc
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(13,10);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle52);
            calc2=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc2.getTree());

            dbg.location(13,15);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle54);
            calc3=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc3.getTree());

            dbg.location(13,20);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle56);
            calc4=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc4.getTree());

            dbg.location(13,25);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle58);
            calc5=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc5.getTree());

            dbg.location(13,30);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle60);
            calc6=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc6.getTree());

            dbg.location(13,35);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle62);
            calc7=calc();

            state._fsp--;

            adaptor.addChild(root_0, calc7.getTree());


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
        dbg.location(13, 39);

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
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:15:1: calc : ( ^( CALCULATION ^( ADD operand operand ) operand ) | ^( CALCULATION ^( SUB op1= operand op2= operand ) op3= operand ) -> ^( CALCULATION ^( ADD[\"+\"] $op3 $op2) $op1) );
    public final PuzzleConverter.calc_return calc() throws RecognitionException {
        PuzzleConverter.calc_return retval = new PuzzleConverter.calc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CALCULATION8=null;
        CommonTree ADD9=null;
        CommonTree CALCULATION13=null;
        CommonTree SUB14=null;
        PuzzleConverter.operand_return op1 =null;

        PuzzleConverter.operand_return op2 =null;

        PuzzleConverter.operand_return op3 =null;

        PuzzleConverter.operand_return operand10 =null;

        PuzzleConverter.operand_return operand11 =null;

        PuzzleConverter.operand_return operand12 =null;


        CommonTree CALCULATION8_tree=null;
        CommonTree ADD9_tree=null;
        CommonTree CALCULATION13_tree=null;
        CommonTree SUB14_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_CALCULATION=new RewriteRuleNodeStream(adaptor,"token CALCULATION");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try { dbg.enterRule(getGrammarFileName(), "calc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:15:6: ( ^( CALCULATION ^( ADD operand operand ) operand ) | ^( CALCULATION ^( SUB op1= operand op2= operand ) op3= operand ) -> ^( CALCULATION ^( ADD[\"+\"] $op3 $op2) $op1) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==CALCULATION) ) {
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

                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:15:8: ^( CALCULATION ^( ADD operand operand ) operand )
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
                    CALCULATION8=(CommonTree)match(input,CALCULATION,FOLLOW_CALCULATION_in_calc72); 
                    CALCULATION8_tree = (CommonTree)adaptor.dupNode(CALCULATION8);


                    root_1 = (CommonTree)adaptor.becomeRoot(CALCULATION8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,22);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(15,24);
                    _last = (CommonTree)input.LT(1);
                    ADD9=(CommonTree)match(input,ADD,FOLLOW_ADD_in_calc75); 
                    ADD9_tree = (CommonTree)adaptor.dupNode(ADD9);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,28);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc77);
                    operand10=operand();

                    state._fsp--;

                    adaptor.addChild(root_2, operand10.getTree());

                    dbg.location(15,36);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc79);
                    operand11=operand();

                    state._fsp--;

                    adaptor.addChild(root_2, operand11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(15,45);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc82);
                    operand12=operand();

                    state._fsp--;

                    adaptor.addChild(root_1, operand12.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:16:8: ^( CALCULATION ^( SUB op1= operand op2= operand ) op3= operand )
                    {
                    dbg.location(16,8);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(16,10);
                    _last = (CommonTree)input.LT(1);
                    CALCULATION13=(CommonTree)match(input,CALCULATION,FOLLOW_CALCULATION_in_calc93);  
                    stream_CALCULATION.add(CALCULATION13);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,22);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(16,24);
                    _last = (CommonTree)input.LT(1);
                    SUB14=(CommonTree)match(input,SUB,FOLLOW_SUB_in_calc96);  
                    stream_SUB.add(SUB14);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,31);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc100);
                    op1=operand();

                    state._fsp--;

                    stream_operand.add(op1.getTree());
                    dbg.location(16,43);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc104);
                    op2=operand();

                    state._fsp--;

                    stream_operand.add(op2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(16,56);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operand_in_calc109);
                    op3=operand();

                    state._fsp--;

                    stream_operand.add(op3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: op3, CALCULATION, op1, op2
                    // token labels: 
                    // rule labels: op1, op2, retval, op3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
                    RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 17:8: -> ^( CALCULATION ^( ADD[\"+\"] $op3 $op2) $op1)
                    {
                        dbg.location(17,11);
                        // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:17:11: ^( CALCULATION ^( ADD[\"+\"] $op3 $op2) $op1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(17,13);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CALCULATION.nextNode()
                        , root_1);

                        dbg.location(17,25);
                        // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:17:25: ^( ADD[\"+\"] $op3 $op2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(17,27);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        dbg.location(17,37);
                        adaptor.addChild(root_2, stream_op3.nextTree());
                        dbg.location(17,42);
                        adaptor.addChild(root_2, stream_op2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(17,48);
                        adaptor.addChild(root_1, stream_op1.nextTree());

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
        dbg.location(18, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "calc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "calc"


    public static class operand_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:20:1: operand : ^( OPERAND ( ID )+ ) ;
    public final PuzzleConverter.operand_return operand() throws RecognitionException {
        PuzzleConverter.operand_return retval = new PuzzleConverter.operand_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPERAND15=null;
        CommonTree ID16=null;

        CommonTree OPERAND15_tree=null;
        CommonTree ID16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:20:8: ( ^( OPERAND ( ID )+ ) )
            dbg.enterAlt(1);

            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:20:10: ^( OPERAND ( ID )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(20,10);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(20,12);
            _last = (CommonTree)input.LT(1);
            OPERAND15=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_operand151); 
            OPERAND15_tree = (CommonTree)adaptor.dupNode(OPERAND15);


            root_1 = (CommonTree)adaptor.becomeRoot(OPERAND15_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(20,20);
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:20:20: ( ID )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/PuzzleConverter.g:20:20: ID
            	    {
            	    dbg.location(20,20);
            	    _last = (CommonTree)input.LT(1);
            	    ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_operand153); 
            	    ID16_tree = (CommonTree)adaptor.dupNode(ID16);


            	    adaptor.addChild(root_1, ID16_tree);


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
        dbg.location(20, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operand"

    // Delegated rules


 

    public static final BitSet FOLLOW_puzzle_in_start44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calc_in_puzzle52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calc_in_puzzle62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALCULATION_in_calc72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_calc75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand_in_calc77 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_operand_in_calc79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operand_in_calc82 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALCULATION_in_calc93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_calc96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand_in_calc100 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_operand_in_calc104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operand_in_calc109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_operand151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operand153 = new BitSet(new long[]{0x0000000000000088L});

}