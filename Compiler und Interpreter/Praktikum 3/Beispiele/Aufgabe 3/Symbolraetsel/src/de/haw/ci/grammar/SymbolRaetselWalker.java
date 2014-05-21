// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g 2013-05-19 16:10:22
package de.haw.ci.grammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class SymbolRaetselWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "EQ", "ADD", "SUB", "SYM", "WS"
    };
    public static final int EOF=-1;
    public static final int NUMBER=4;
    public static final int EQ=5;
    public static final int ADD=6;
    public static final int SUB=7;
    public static final int SYM=8;
    public static final int WS=9;

    // delegates
    // delegators


        public SymbolRaetselWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolRaetselWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolRaetselWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:12:1: start : equation equation equation equation equation equation ;
    public final SymbolRaetselWalker.start_return start() throws RecognitionException {
        SymbolRaetselWalker.start_return retval = new SymbolRaetselWalker.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRaetselWalker.equation_return equation1 = null;

        SymbolRaetselWalker.equation_return equation2 = null;

        SymbolRaetselWalker.equation_return equation3 = null;

        SymbolRaetselWalker.equation_return equation4 = null;

        SymbolRaetselWalker.equation_return equation5 = null;

        SymbolRaetselWalker.equation_return equation6 = null;



        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:12:7: ( equation equation equation equation equation equation )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:12:9: equation equation equation equation equation equation
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start45);
            equation1=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation1.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start47);
            equation2=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation2.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start49);
            equation3=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation3.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start51);
            equation4=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation4.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start53);
            equation5=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation5.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_equation_in_start55);
            equation6=equation();

            state._fsp--;

            adaptor.addChild(root_0, equation6.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class equation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equation"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:14:1: equation : ( ^( EQ ^( ADD firstoperand secondoperand ) equalsnum ) | ^( EQ ^( SUB firstoperand secondoperand ) equalsnum ) -> ^( EQ ^( ADD[\"+\"] equalsnum secondoperand ) firstoperand ) );
    public final SymbolRaetselWalker.equation_return equation() throws RecognitionException {
        SymbolRaetselWalker.equation_return retval = new SymbolRaetselWalker.equation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ7=null;
        CommonTree ADD8=null;
        CommonTree EQ12=null;
        CommonTree SUB13=null;
        SymbolRaetselWalker.firstoperand_return firstoperand9 = null;

        SymbolRaetselWalker.secondoperand_return secondoperand10 = null;

        SymbolRaetselWalker.equalsnum_return equalsnum11 = null;

        SymbolRaetselWalker.firstoperand_return firstoperand14 = null;

        SymbolRaetselWalker.secondoperand_return secondoperand15 = null;

        SymbolRaetselWalker.equalsnum_return equalsnum16 = null;


        CommonTree EQ7_tree=null;
        CommonTree ADD8_tree=null;
        CommonTree EQ12_tree=null;
        CommonTree SUB13_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_firstoperand=new RewriteRuleSubtreeStream(adaptor,"rule firstoperand");
        RewriteRuleSubtreeStream stream_equalsnum=new RewriteRuleSubtreeStream(adaptor,"rule equalsnum");
        RewriteRuleSubtreeStream stream_secondoperand=new RewriteRuleSubtreeStream(adaptor,"rule secondoperand");
        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:14:10: ( ^( EQ ^( ADD firstoperand secondoperand ) equalsnum ) | ^( EQ ^( SUB firstoperand secondoperand ) equalsnum ) -> ^( EQ ^( ADD[\"+\"] equalsnum secondoperand ) firstoperand ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ) ) {
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
                    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:14:12: ^( EQ ^( ADD firstoperand secondoperand ) equalsnum )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQ7=(CommonTree)match(input,EQ,FOLLOW_EQ_in_equation64); 
                    EQ7_tree = (CommonTree)adaptor.dupNode(EQ7);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQ7_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ADD8=(CommonTree)match(input,ADD,FOLLOW_ADD_in_equation67); 
                    ADD8_tree = (CommonTree)adaptor.dupNode(ADD8);

                    root_2 = (CommonTree)adaptor.becomeRoot(ADD8_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstoperand_in_equation69);
                    firstoperand9=firstoperand();

                    state._fsp--;

                    adaptor.addChild(root_2, firstoperand9.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondoperand_in_equation71);
                    secondoperand10=secondoperand();

                    state._fsp--;

                    adaptor.addChild(root_2, secondoperand10.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_equalsnum_in_equation74);
                    equalsnum11=equalsnum();

                    state._fsp--;

                    adaptor.addChild(root_1, equalsnum11.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:15:8: ^( EQ ^( SUB firstoperand secondoperand ) equalsnum )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQ12=(CommonTree)match(input,EQ,FOLLOW_EQ_in_equation85);  
                    stream_EQ.add(EQ12);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUB13=(CommonTree)match(input,SUB,FOLLOW_SUB_in_equation88);  
                    stream_SUB.add(SUB13);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstoperand_in_equation90);
                    firstoperand14=firstoperand();

                    state._fsp--;

                    stream_firstoperand.add(firstoperand14.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondoperand_in_equation92);
                    secondoperand15=secondoperand();

                    state._fsp--;

                    stream_secondoperand.add(secondoperand15.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_equalsnum_in_equation95);
                    equalsnum16=equalsnum();

                    state._fsp--;

                    stream_equalsnum.add(equalsnum16.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: EQ, secondoperand, firstoperand, equalsnum
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 15:58: -> ^( EQ ^( ADD[\"+\"] equalsnum secondoperand ) firstoperand )
                    {
                        // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:15:61: ^( EQ ^( ADD[\"+\"] equalsnum secondoperand ) firstoperand )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                        // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:15:66: ^( ADD[\"+\"] equalsnum secondoperand )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADD, "+"), root_2);

                        adaptor.addChild(root_2, stream_equalsnum.nextTree());
                        adaptor.addChild(root_2, stream_secondoperand.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_firstoperand.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "equation"

    public static class firstoperand_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "firstoperand"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:18:1: firstoperand : number ;
    public final SymbolRaetselWalker.firstoperand_return firstoperand() throws RecognitionException {
        SymbolRaetselWalker.firstoperand_return retval = new SymbolRaetselWalker.firstoperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRaetselWalker.number_return number17 = null;



        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:18:14: ( number )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:18:16: number
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_firstoperand133);
            number17=number();

            state._fsp--;

            adaptor.addChild(root_0, number17.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "firstoperand"

    public static class secondoperand_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "secondoperand"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:19:1: secondoperand : number ;
    public final SymbolRaetselWalker.secondoperand_return secondoperand() throws RecognitionException {
        SymbolRaetselWalker.secondoperand_return retval = new SymbolRaetselWalker.secondoperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRaetselWalker.number_return number18 = null;



        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:19:15: ( number )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:19:17: number
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_secondoperand140);
            number18=number();

            state._fsp--;

            adaptor.addChild(root_0, number18.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "secondoperand"

    public static class equalsnum_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalsnum"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:20:1: equalsnum : number ;
    public final SymbolRaetselWalker.equalsnum_return equalsnum() throws RecognitionException {
        SymbolRaetselWalker.equalsnum_return retval = new SymbolRaetselWalker.equalsnum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRaetselWalker.number_return number19 = null;



        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:20:11: ( number )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:20:13: number
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_equalsnum147);
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
        }
        return retval;
    }
    // $ANTLR end "equalsnum"

    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:22:1: number : ^( NUMBER ( SYM )+ ) ;
    public final SymbolRaetselWalker.number_return number() throws RecognitionException {
        SymbolRaetselWalker.number_return retval = new SymbolRaetselWalker.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NUMBER20=null;
        CommonTree SYM21=null;

        CommonTree NUMBER20_tree=null;
        CommonTree SYM21_tree=null;

        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:22:8: ( ^( NUMBER ( SYM )+ ) )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:22:10: ^( NUMBER ( SYM )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            NUMBER20=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_number156); 
            NUMBER20_tree = (CommonTree)adaptor.dupNode(NUMBER20);

            root_1 = (CommonTree)adaptor.becomeRoot(NUMBER20_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:22:19: ( SYM )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYM) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\SymbolRaetselWalker.g:22:19: SYM
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYM21=(CommonTree)match(input,SYM,FOLLOW_SYM_in_number158); 
            	    SYM21_tree = (CommonTree)adaptor.dupNode(SYM21);

            	    adaptor.addChild(root_1, SYM21_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_equation_in_start45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equation_in_start47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equation_in_start49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equation_in_start51 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equation_in_start53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equation_in_start55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equation64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_equation67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstoperand_in_equation69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_secondoperand_in_equation71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equalsnum_in_equation74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_equation85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_equation88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstoperand_in_equation90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_secondoperand_in_equation92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equalsnum_in_equation95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_firstoperand133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_secondoperand140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_equalsnum147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYM_in_number158 = new BitSet(new long[]{0x0000000000000108L});

}