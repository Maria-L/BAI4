// $ANTLR 3.4 C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g 2013-05-20 15:43:05
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolPuzzleWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BLOCK_COMMENT", "EQUALS", "LINE_COMMENT", "NEWLINE", "NUMBER", "PUZZLE", "SUB", "SYMBOL", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK_COMMENT=5;
    public static final int EQUALS=6;
    public static final int LINE_COMMENT=7;
    public static final int NEWLINE=8;
    public static final int NUMBER=9;
    public static final int PUZZLE=10;
    public static final int SUB=11;
    public static final int SYMBOL=12;
    public static final int WS=13;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolPuzzleWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolPuzzleWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolPuzzleWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:15:1: start : puzzle ;
    public final SymbolPuzzleWalker.start_return start() throws RecognitionException {
        SymbolPuzzleWalker.start_return retval = new SymbolPuzzleWalker.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolPuzzleWalker.puzzle_return puzzle1 =null;



        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:15:7: ( puzzle )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:15:9: puzzle
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_puzzle_in_start50);
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
        return retval;
    }
    // $ANTLR end "start"


    public static class puzzle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:17:1: puzzle : ^( PUZZLE calc calc calc calc calc calc ) ;
    public final SymbolPuzzleWalker.puzzle_return puzzle() throws RecognitionException {
        SymbolPuzzleWalker.puzzle_return retval = new SymbolPuzzleWalker.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUZZLE2=null;
        SymbolPuzzleWalker.calc_return calc3 =null;

        SymbolPuzzleWalker.calc_return calc4 =null;

        SymbolPuzzleWalker.calc_return calc5 =null;

        SymbolPuzzleWalker.calc_return calc6 =null;

        SymbolPuzzleWalker.calc_return calc7 =null;

        SymbolPuzzleWalker.calc_return calc8 =null;


        CommonTree PUZZLE2_tree=null;

        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:17:8: ( ^( PUZZLE calc calc calc calc calc calc ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:17:10: ^( PUZZLE calc calc calc calc calc calc )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PUZZLE2=(CommonTree)match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle60); 
            PUZZLE2_tree = (CommonTree)adaptor.dupNode(PUZZLE2);


            root_1 = (CommonTree)adaptor.becomeRoot(PUZZLE2_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle62);
            calc3=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle64);
            calc4=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle66);
            calc5=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle68);
            calc6=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle70);
            calc7=calc();

            state._fsp--;

            adaptor.addChild(root_1, calc7.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_calc_in_puzzle72);
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
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class calc_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calc"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:19:1: calc : ( ^( EQUALS ^( ADD term1 term2 ) term3 ) | ^( EQUALS ^( SUB term1 term2 ) term3 ) -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 ) );
    public final SymbolPuzzleWalker.calc_return calc() throws RecognitionException {
        SymbolPuzzleWalker.calc_return retval = new SymbolPuzzleWalker.calc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS9=null;
        CommonTree ADD10=null;
        CommonTree EQUALS14=null;
        CommonTree SUB15=null;
        SymbolPuzzleWalker.term1_return term111 =null;

        SymbolPuzzleWalker.term2_return term212 =null;

        SymbolPuzzleWalker.term3_return term313 =null;

        SymbolPuzzleWalker.term1_return term116 =null;

        SymbolPuzzleWalker.term2_return term217 =null;

        SymbolPuzzleWalker.term3_return term318 =null;


        CommonTree EQUALS9_tree=null;
        CommonTree ADD10_tree=null;
        CommonTree EQUALS14_tree=null;
        CommonTree SUB15_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_term1=new RewriteRuleSubtreeStream(adaptor,"rule term1");
        RewriteRuleSubtreeStream stream_term3=new RewriteRuleSubtreeStream(adaptor,"rule term3");
        RewriteRuleSubtreeStream stream_term2=new RewriteRuleSubtreeStream(adaptor,"rule term2");
        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:19:6: ( ^( EQUALS ^( ADD term1 term2 ) term3 ) | ^( EQUALS ^( SUB term1 term2 ) term3 ) -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 ) )
            int alt1=2;
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
                    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:19:8: ^( EQUALS ^( ADD term1 term2 ) term3 )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS9=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_calc83); 
                    EQUALS9_tree = (CommonTree)adaptor.dupNode(EQUALS9);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS9_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD10=(CommonTree)match(input,ADD,FOLLOW_ADD_in_calc86); 
                    ADD10_tree = (CommonTree)adaptor.dupNode(ADD10);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD10_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term1_in_calc88);
                    term111=term1();

                    state._fsp--;

                    adaptor.addChild(root_2, term111.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term2_in_calc90);
                    term212=term2();

                    state._fsp--;

                    adaptor.addChild(root_2, term212.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term3_in_calc93);
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
                    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:20:8: ^( EQUALS ^( SUB term1 term2 ) term3 )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS14=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_calc104);  
                    stream_EQUALS.add(EQUALS14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB15=(CommonTree)match(input,SUB,FOLLOW_SUB_in_calc107);  
                    stream_SUB.add(SUB15);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term1_in_calc109);
                    term116=term1();

                    state._fsp--;

                    stream_term1.add(term116.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term2_in_calc111);
                    term217=term2();

                    state._fsp--;

                    stream_term2.add(term217.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term3_in_calc114);
                    term318=term3();

                    state._fsp--;

                    stream_term3.add(term318.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: term1, term2, term3, EQUALS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:43: -> ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 )
                    {
                        // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:20:46: ^( EQUALS[\"=\"] ^( ADD[\"+\"] term3 term2 ) term1 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EQUALS, "=")
                        , root_1);

                        // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:20:60: ^( ADD[\"+\"] term3 term2 )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_term3.nextTree());

                        adaptor.addChild(root_2, stream_term2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
        return retval;
    }
    // $ANTLR end "calc"


    public static class term1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term1"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:23:1: term1 : number ;
    public final SymbolPuzzleWalker.term1_return term1() throws RecognitionException {
        SymbolPuzzleWalker.term1_return retval = new SymbolPuzzleWalker.term1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolPuzzleWalker.number_return number19 =null;



        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:23:7: ( number )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:23:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term1152);
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
        return retval;
    }
    // $ANTLR end "term1"


    public static class term2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term2"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:24:1: term2 : number ;
    public final SymbolPuzzleWalker.term2_return term2() throws RecognitionException {
        SymbolPuzzleWalker.term2_return retval = new SymbolPuzzleWalker.term2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolPuzzleWalker.number_return number20 =null;



        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:24:7: ( number )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:24:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term2160);
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
        return retval;
    }
    // $ANTLR end "term2"


    public static class term3_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term3"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:25:1: term3 : number ;
    public final SymbolPuzzleWalker.term3_return term3() throws RecognitionException {
        SymbolPuzzleWalker.term3_return retval = new SymbolPuzzleWalker.term3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolPuzzleWalker.number_return number21 =null;



        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:25:7: ( number )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:25:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_term3168);
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
        return retval;
    }
    // $ANTLR end "term3"


    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:27:1: number : ^( NUMBER ( SYMBOL )+ ) ;
    public final SymbolPuzzleWalker.number_return number() throws RecognitionException {
        SymbolPuzzleWalker.number_return retval = new SymbolPuzzleWalker.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NUMBER22=null;
        CommonTree SYMBOL23=null;

        CommonTree NUMBER22_tree=null;
        CommonTree SYMBOL23_tree=null;

        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:27:8: ( ^( NUMBER ( SYMBOL )+ ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:27:10: ^( NUMBER ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            NUMBER22=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_number178); 
            NUMBER22_tree = (CommonTree)adaptor.dupNode(NUMBER22);


            root_1 = (CommonTree)adaptor.becomeRoot(NUMBER22_tree, root_1);


            match(input, Token.DOWN, null); 
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:27:19: ( SYMBOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzleWalker.g:27:19: SYMBOL
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL23=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number180); 
            	    SYMBOL23_tree = (CommonTree)adaptor.dupNode(SYMBOL23);


            	    adaptor.addChild(root_1, SYMBOL23_tree);


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
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_puzzle_in_start50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUZZLE_in_puzzle60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_calc_in_puzzle62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_calc_in_puzzle64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_calc_in_puzzle66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_calc_in_puzzle68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_calc_in_puzzle70 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_calc_in_puzzle72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_calc83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_calc86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term1_in_calc88 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_term2_in_calc90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term3_in_calc93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_calc104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_calc107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term1_in_calc109 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_term2_in_calc111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term3_in_calc114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_term1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_number180 = new BitSet(new long[]{0x0000000000001008L});

}