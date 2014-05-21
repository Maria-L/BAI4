// $ANTLR 3.4 C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g 2013-05-13 22:09:37
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolPuzzleParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SymbolPuzzleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolPuzzleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolPuzzleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:22:1: start : puzzle -> ^( PUZZLE puzzle ) ;
    public final SymbolPuzzleParser.start_return start() throws RecognitionException {
        SymbolPuzzleParser.start_return retval = new SymbolPuzzleParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SymbolPuzzleParser.puzzle_return puzzle1 =null;


        RewriteRuleSubtreeStream stream_puzzle=new RewriteRuleSubtreeStream(adaptor,"rule puzzle");
        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:22:7: ( puzzle -> ^( PUZZLE puzzle ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:22:9: puzzle
            {
            pushFollow(FOLLOW_puzzle_in_start70);
            puzzle1=puzzle();

            state._fsp--;

            stream_puzzle.add(puzzle1.getTree());

            // AST REWRITE
            // elements: puzzle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 22:16: -> ^( PUZZLE puzzle )
            {
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:22:19: ^( PUZZLE puzzle )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PUZZLE, "PUZZLE")
                , root_1);

                adaptor.addChild(root_1, stream_puzzle.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class puzzle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:24:1: puzzle : s11= number o11= operation s12= number EQUALS s13= number o21= operation o22= operation o23= operation s31= number o31= operation s32= number EQUALS s33= number EQUALS EQUALS EQUALS s51= number o51= operation s52= number EQUALS s53= number -> ^( EQUALS ^( $o11 $s11 $s12) $s13) ^( EQUALS ^( $o31 $s31 $s32) $s33) ^( EQUALS ^( $o51 $s51 $s52) $s53) ^( EQUALS ^( $o21 $s11 $s31) $s51) ^( EQUALS ^( $o22 $s12 $s32) $s52) ^( EQUALS ^( $o23 $s13 $s33) $s53) ;
    public final SymbolPuzzleParser.puzzle_return puzzle() throws RecognitionException {
        SymbolPuzzleParser.puzzle_return retval = new SymbolPuzzleParser.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUALS2=null;
        Token EQUALS3=null;
        Token EQUALS4=null;
        Token EQUALS5=null;
        Token EQUALS6=null;
        Token EQUALS7=null;
        SymbolPuzzleParser.number_return s11 =null;

        SymbolPuzzleParser.operation_return o11 =null;

        SymbolPuzzleParser.number_return s12 =null;

        SymbolPuzzleParser.number_return s13 =null;

        SymbolPuzzleParser.operation_return o21 =null;

        SymbolPuzzleParser.operation_return o22 =null;

        SymbolPuzzleParser.operation_return o23 =null;

        SymbolPuzzleParser.number_return s31 =null;

        SymbolPuzzleParser.operation_return o31 =null;

        SymbolPuzzleParser.number_return s32 =null;

        SymbolPuzzleParser.number_return s33 =null;

        SymbolPuzzleParser.number_return s51 =null;

        SymbolPuzzleParser.operation_return o51 =null;

        SymbolPuzzleParser.number_return s52 =null;

        SymbolPuzzleParser.number_return s53 =null;


        CommonTree EQUALS2_tree=null;
        CommonTree EQUALS3_tree=null;
        CommonTree EQUALS4_tree=null;
        CommonTree EQUALS5_tree=null;
        CommonTree EQUALS6_tree=null;
        CommonTree EQUALS7_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:24:8: (s11= number o11= operation s12= number EQUALS s13= number o21= operation o22= operation o23= operation s31= number o31= operation s32= number EQUALS s33= number EQUALS EQUALS EQUALS s51= number o51= operation s52= number EQUALS s53= number -> ^( EQUALS ^( $o11 $s11 $s12) $s13) ^( EQUALS ^( $o31 $s31 $s32) $s33) ^( EQUALS ^( $o51 $s51 $s52) $s53) ^( EQUALS ^( $o21 $s11 $s31) $s51) ^( EQUALS ^( $o22 $s12 $s32) $s52) ^( EQUALS ^( $o23 $s13 $s33) $s53) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:24:10: s11= number o11= operation s12= number EQUALS s13= number o21= operation o22= operation o23= operation s31= number o31= operation s32= number EQUALS s33= number EQUALS EQUALS EQUALS s51= number o51= operation s52= number EQUALS s53= number
            {
            pushFollow(FOLLOW_number_in_puzzle89);
            s11=number();

            state._fsp--;

            stream_number.add(s11.getTree());

            pushFollow(FOLLOW_operation_in_puzzle94);
            o11=operation();

            state._fsp--;

            stream_operation.add(o11.getTree());

            pushFollow(FOLLOW_number_in_puzzle99);
            s12=number();

            state._fsp--;

            stream_number.add(s12.getTree());

            EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle102);  
            stream_EQUALS.add(EQUALS2);


            pushFollow(FOLLOW_number_in_puzzle108);
            s13=number();

            state._fsp--;

            stream_number.add(s13.getTree());

            pushFollow(FOLLOW_operation_in_puzzle114);
            o21=operation();

            state._fsp--;

            stream_operation.add(o21.getTree());

            pushFollow(FOLLOW_operation_in_puzzle121);
            o22=operation();

            state._fsp--;

            stream_operation.add(o22.getTree());

            pushFollow(FOLLOW_operation_in_puzzle128);
            o23=operation();

            state._fsp--;

            stream_operation.add(o23.getTree());

            pushFollow(FOLLOW_number_in_puzzle135);
            s31=number();

            state._fsp--;

            stream_number.add(s31.getTree());

            pushFollow(FOLLOW_operation_in_puzzle140);
            o31=operation();

            state._fsp--;

            stream_operation.add(o31.getTree());

            pushFollow(FOLLOW_number_in_puzzle145);
            s32=number();

            state._fsp--;

            stream_number.add(s32.getTree());

            EQUALS3=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle148);  
            stream_EQUALS.add(EQUALS3);


            pushFollow(FOLLOW_number_in_puzzle154);
            s33=number();

            state._fsp--;

            stream_number.add(s33.getTree());

            EQUALS4=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle163);  
            stream_EQUALS.add(EQUALS4);


            EQUALS5=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle172);  
            stream_EQUALS.add(EQUALS5);


            EQUALS6=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle181);  
            stream_EQUALS.add(EQUALS6);


            pushFollow(FOLLOW_number_in_puzzle188);
            s51=number();

            state._fsp--;

            stream_number.add(s51.getTree());

            pushFollow(FOLLOW_operation_in_puzzle193);
            o51=operation();

            state._fsp--;

            stream_operation.add(o51.getTree());

            pushFollow(FOLLOW_number_in_puzzle198);
            s52=number();

            state._fsp--;

            stream_number.add(s52.getTree());

            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle201);  
            stream_EQUALS.add(EQUALS7);


            pushFollow(FOLLOW_number_in_puzzle207);
            s53=number();

            state._fsp--;

            stream_number.add(s53.getTree());

            // AST REWRITE
            // elements: o51, s51, o23, s11, s32, s33, s12, o21, EQUALS, s32, s31, s11, o22, s51, s13, s52, EQUALS, s33, s13, s31, EQUALS, o31, s53, EQUALS, EQUALS, s12, s53, s52, o11, EQUALS
            // token labels: 
            // rule labels: retval, s53, s52, s33, s32, s31, o31, o23, o51, o11, o21, o22, s12, s13, s51, s11
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s53=new RewriteRuleSubtreeStream(adaptor,"rule s53",s53!=null?s53.tree:null);
            RewriteRuleSubtreeStream stream_s52=new RewriteRuleSubtreeStream(adaptor,"rule s52",s52!=null?s52.tree:null);
            RewriteRuleSubtreeStream stream_s33=new RewriteRuleSubtreeStream(adaptor,"rule s33",s33!=null?s33.tree:null);
            RewriteRuleSubtreeStream stream_s32=new RewriteRuleSubtreeStream(adaptor,"rule s32",s32!=null?s32.tree:null);
            RewriteRuleSubtreeStream stream_s31=new RewriteRuleSubtreeStream(adaptor,"rule s31",s31!=null?s31.tree:null);
            RewriteRuleSubtreeStream stream_o31=new RewriteRuleSubtreeStream(adaptor,"rule o31",o31!=null?o31.tree:null);
            RewriteRuleSubtreeStream stream_o23=new RewriteRuleSubtreeStream(adaptor,"rule o23",o23!=null?o23.tree:null);
            RewriteRuleSubtreeStream stream_o51=new RewriteRuleSubtreeStream(adaptor,"rule o51",o51!=null?o51.tree:null);
            RewriteRuleSubtreeStream stream_o11=new RewriteRuleSubtreeStream(adaptor,"rule o11",o11!=null?o11.tree:null);
            RewriteRuleSubtreeStream stream_o21=new RewriteRuleSubtreeStream(adaptor,"rule o21",o21!=null?o21.tree:null);
            RewriteRuleSubtreeStream stream_o22=new RewriteRuleSubtreeStream(adaptor,"rule o22",o22!=null?o22.tree:null);
            RewriteRuleSubtreeStream stream_s12=new RewriteRuleSubtreeStream(adaptor,"rule s12",s12!=null?s12.tree:null);
            RewriteRuleSubtreeStream stream_s13=new RewriteRuleSubtreeStream(adaptor,"rule s13",s13!=null?s13.tree:null);
            RewriteRuleSubtreeStream stream_s51=new RewriteRuleSubtreeStream(adaptor,"rule s51",s51!=null?s51.tree:null);
            RewriteRuleSubtreeStream stream_s11=new RewriteRuleSubtreeStream(adaptor,"rule s11",s11!=null?s11.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 30:3: -> ^( EQUALS ^( $o11 $s11 $s12) $s13) ^( EQUALS ^( $o31 $s31 $s32) $s33) ^( EQUALS ^( $o51 $s51 $s52) $s53) ^( EQUALS ^( $o21 $s11 $s31) $s51) ^( EQUALS ^( $o22 $s12 $s32) $s52) ^( EQUALS ^( $o23 $s13 $s33) $s53)
            {
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:30:6: ^( EQUALS ^( $o11 $s11 $s12) $s13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:30:15: ^( $o11 $s11 $s12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o11.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s11.nextTree());

                adaptor.addChild(root_2, stream_s12.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s13.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:31:6: ^( EQUALS ^( $o31 $s31 $s32) $s33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:31:15: ^( $o31 $s31 $s32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o31.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s31.nextTree());

                adaptor.addChild(root_2, stream_s32.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s33.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:32:6: ^( EQUALS ^( $o51 $s51 $s52) $s53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:32:15: ^( $o51 $s51 $s52)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o51.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s51.nextTree());

                adaptor.addChild(root_2, stream_s52.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:33:6: ^( EQUALS ^( $o21 $s11 $s31) $s51)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:33:15: ^( $o21 $s11 $s31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s11.nextTree());

                adaptor.addChild(root_2, stream_s31.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s51.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:34:6: ^( EQUALS ^( $o22 $s12 $s32) $s52)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:34:15: ^( $o22 $s12 $s32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o22.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s12.nextTree());

                adaptor.addChild(root_2, stream_s32.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s52.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:35:6: ^( EQUALS ^( $o23 $s13 $s33) $s53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:35:15: ^( $o23 $s13 $s33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o23.nextNode(), root_2);

                adaptor.addChild(root_2, stream_s13.nextTree());

                adaptor.addChild(root_2, stream_s33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_s53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:38:1: operation : ( ADD | SUB );
    public final SymbolPuzzleParser.operation_return operation() throws RecognitionException {
        SymbolPuzzleParser.operation_return retval = new SymbolPuzzleParser.operation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:38:11: ( ADD | SUB )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set8=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set8)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:1: number : ( SYMBOL )+ -> ^( NUMBER ( SYMBOL )+ ) ;
    public final SymbolPuzzleParser.number_return number() throws RecognitionException {
        SymbolPuzzleParser.number_return retval = new SymbolPuzzleParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SYMBOL9=null;

        CommonTree SYMBOL9_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:8: ( ( SYMBOL )+ -> ^( NUMBER ( SYMBOL )+ ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:10: ( SYMBOL )+
            {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:10: ( SYMBOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:10: SYMBOL
            	    {
            	    SYMBOL9=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_number375);  
            	    stream_SYMBOL.add(SYMBOL9);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:18: -> ^( NUMBER ( SYMBOL )+ )
            {
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:40:21: ^( NUMBER ( SYMBOL )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_1);

                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SYMBOL.nextNode()
                    );

                }
                stream_SYMBOL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_puzzle_in_start70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_puzzle89 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle94 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle99 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle108 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle114 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle121 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle135 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle140 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle181 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle188 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operation_in_puzzle193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_puzzle207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_number375 = new BitSet(new long[]{0x0000000000001002L});

}