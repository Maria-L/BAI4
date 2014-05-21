// $ANTLR 3.4 /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g 2013-06-04 09:10:11

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class raetselwalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BLOCK", "EQS", "ID", "RAETSEL", "SUB", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK=5;
    public static final int EQS=6;
    public static final int ID=7;
    public static final int RAETSEL=8;
    public static final int SUB=9;
    public static final int WS=10;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public raetselwalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public raetselwalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return raetselwalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:11:1: start : ^( RAETSEL eqs eqs eqs eqs eqs eqs ) ;
    public final raetselwalker.start_return start() throws RecognitionException {
        raetselwalker.start_return retval = new raetselwalker.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RAETSEL1=null;
        raetselwalker.eqs_return eqs2 =null;

        raetselwalker.eqs_return eqs3 =null;

        raetselwalker.eqs_return eqs4 =null;

        raetselwalker.eqs_return eqs5 =null;

        raetselwalker.eqs_return eqs6 =null;

        raetselwalker.eqs_return eqs7 =null;


        CommonTree RAETSEL1_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:11:6: ( ^( RAETSEL eqs eqs eqs eqs eqs eqs ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:11:9: ^( RAETSEL eqs eqs eqs eqs eqs eqs )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RAETSEL1=(CommonTree)match(input,RAETSEL,FOLLOW_RAETSEL_in_start39); 
            RAETSEL1_tree = (CommonTree)adaptor.dupNode(RAETSEL1);


            root_1 = (CommonTree)adaptor.becomeRoot(RAETSEL1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start41);
            eqs2=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start43);
            eqs3=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start45);
            eqs4=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start47);
            eqs5=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start49);
            eqs6=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_eqs_in_start51);
            eqs7=eqs();

            state._fsp--;

            adaptor.addChild(root_1, eqs7.getTree());


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
        return retval;
    }
    // $ANTLR end "start"


    public static class eqs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eqs"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:13:1: eqs : ( ^( EQS ^( ADD t1 t2 ) t3 ) | ^( EQS ^( SUB t1 t2 ) t3 ) -> ^( EQS ^( ADD[\"+\"] t3 t2 ) t1 ) );
    public final raetselwalker.eqs_return eqs() throws RecognitionException {
        raetselwalker.eqs_return retval = new raetselwalker.eqs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQS8=null;
        CommonTree ADD9=null;
        CommonTree EQS13=null;
        CommonTree SUB14=null;
        raetselwalker.t1_return t110 =null;

        raetselwalker.t2_return t211 =null;

        raetselwalker.t3_return t312 =null;

        raetselwalker.t1_return t115 =null;

        raetselwalker.t2_return t216 =null;

        raetselwalker.t3_return t317 =null;


        CommonTree EQS8_tree=null;
        CommonTree ADD9_tree=null;
        CommonTree EQS13_tree=null;
        CommonTree SUB14_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQS=new RewriteRuleNodeStream(adaptor,"token EQS");
        RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3");
        RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2");
        RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1");
        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:13:4: ( ^( EQS ^( ADD t1 t2 ) t3 ) | ^( EQS ^( SUB t1 t2 ) t3 ) -> ^( EQS ^( ADD[\"+\"] t3 t2 ) t1 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQS) ) {
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

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

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
                    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:13:6: ^( EQS ^( ADD t1 t2 ) t3 )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQS8=(CommonTree)match(input,EQS,FOLLOW_EQS_in_eqs61); 
                    EQS8_tree = (CommonTree)adaptor.dupNode(EQS8);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQS8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD9=(CommonTree)match(input,ADD,FOLLOW_ADD_in_eqs64); 
                    ADD9_tree = (CommonTree)adaptor.dupNode(ADD9);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t1_in_eqs66);
                    t110=t1();

                    state._fsp--;

                    adaptor.addChild(root_2, t110.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t2_in_eqs68);
                    t211=t2();

                    state._fsp--;

                    adaptor.addChild(root_2, t211.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t3_in_eqs71);
                    t312=t3();

                    state._fsp--;

                    adaptor.addChild(root_1, t312.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:14:2: ^( EQS ^( SUB t1 t2 ) t3 )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQS13=(CommonTree)match(input,EQS,FOLLOW_EQS_in_eqs79);  
                    stream_EQS.add(EQS13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB14=(CommonTree)match(input,SUB,FOLLOW_SUB_in_eqs82);  
                    stream_SUB.add(SUB14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t1_in_eqs84);
                    t115=t1();

                    state._fsp--;

                    stream_t1.add(t115.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t2_in_eqs86);
                    t216=t2();

                    state._fsp--;

                    stream_t2.add(t216.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t3_in_eqs89);
                    t317=t3();

                    state._fsp--;

                    stream_t3.add(t317.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: t2, EQS, t3, t1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 14:26: -> ^( EQS ^( ADD[\"+\"] t3 t2 ) t1 )
                    {
                        // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:14:29: ^( EQS ^( ADD[\"+\"] t3 t2 ) t1 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQS.nextNode()
                        , root_1);

                        // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:14:35: ^( ADD[\"+\"] t3 t2 )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_t3.nextTree());

                        adaptor.addChild(root_2, stream_t2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_t1.nextTree());

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
        return retval;
    }
    // $ANTLR end "eqs"


    public static class op_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:16:1: op : ( ADD | SUB ) ;
    public final raetselwalker.op_return op() throws RecognitionException {
        raetselwalker.op_return retval = new raetselwalker.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set18=null;

        CommonTree set18_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:16:3: ( ( ADD | SUB ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set18=(CommonTree)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                set18_tree = (CommonTree)adaptor.dupNode(set18);


                adaptor.addChild(root_0, set18_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return retval;
    }
    // $ANTLR end "op"


    public static class t1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t1"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:18:1: t1 : BLOCK ;
    public final raetselwalker.t1_return t1() throws RecognitionException {
        raetselwalker.t1_return retval = new raetselwalker.t1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK19=null;

        CommonTree BLOCK19_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:18:3: ( BLOCK )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:18:5: BLOCK
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BLOCK19=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_t1131); 
            BLOCK19_tree = (CommonTree)adaptor.dupNode(BLOCK19);


            adaptor.addChild(root_0, BLOCK19_tree);


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
        return retval;
    }
    // $ANTLR end "t1"


    public static class t2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t2"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:19:1: t2 : BLOCK ;
    public final raetselwalker.t2_return t2() throws RecognitionException {
        raetselwalker.t2_return retval = new raetselwalker.t2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK20=null;

        CommonTree BLOCK20_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:19:3: ( BLOCK )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:19:5: BLOCK
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BLOCK20=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_t2137); 
            BLOCK20_tree = (CommonTree)adaptor.dupNode(BLOCK20);


            adaptor.addChild(root_0, BLOCK20_tree);


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
        return retval;
    }
    // $ANTLR end "t2"


    public static class t3_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t3"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:20:1: t3 : BLOCK ;
    public final raetselwalker.t3_return t3() throws RecognitionException {
        raetselwalker.t3_return retval = new raetselwalker.t3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK21=null;

        CommonTree BLOCK21_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:20:3: ( BLOCK )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetselwalker.g:20:5: BLOCK
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BLOCK21=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_t3143); 
            BLOCK21_tree = (CommonTree)adaptor.dupNode(BLOCK21);


            adaptor.addChild(root_0, BLOCK21_tree);


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
        return retval;
    }
    // $ANTLR end "t3"

    // Delegated rules


 

    public static final BitSet FOLLOW_RAETSEL_in_start39 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eqs_in_start41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_eqs_in_start43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_eqs_in_start45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_eqs_in_start47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_eqs_in_start49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_eqs_in_start51 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQS_in_eqs61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_eqs64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_t1_in_eqs66 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_t2_in_eqs68 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_t3_in_eqs71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQS_in_eqs79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_eqs82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_t1_in_eqs84 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_t2_in_eqs86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_t3_in_eqs89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_t1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_t2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_t3143 = new BitSet(new long[]{0x0000000000000002L});

}