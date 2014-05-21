// $ANTLR 3.4 D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g 2013-05-20 15:09:04
package  symbolRaetsel.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Bild1Parser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Bild1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Bild1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Bild1Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:19:1: start : puzzle -> ^( PUZZLE puzzle ) ;
    public final Bild1Parser.start_return start() throws RecognitionException {
        Bild1Parser.start_return retval = new Bild1Parser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Bild1Parser.puzzle_return puzzle1 =null;


        RewriteRuleSubtreeStream stream_puzzle=new RewriteRuleSubtreeStream(adaptor,"rule puzzle");
        try {
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:19:7: ( puzzle -> ^( PUZZLE puzzle ) )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:19:9: puzzle
            {
            pushFollow(FOLLOW_puzzle_in_start63);
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
            // 19:15: -> ^( PUZZLE puzzle )
            {
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:19:18: ^( PUZZLE puzzle )
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
    // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:21:1: puzzle : n11= number o11= operator n12= number EQUALS n13= number o21= operator o22= operator o23= operator n31= number o31= operator n32= number EQUALS n33= number EQUALS EQUALS EQUALS n51= number o51= operator n52= number EQUALS n53= number -> ^( EQUALS ^( $o11 $n11 $n12) $n13) ^( EQUALS ^( $o31 $n31 $n32) $n33) ^( EQUALS ^( $o51 $n51 $n52) $n53) ^( EQUALS ^( $o21 $n11 $n31) $n51) ^( EQUALS ^( $o22 $n12 $n32) $n52) ^( EQUALS ^( $o23 $n13 $n33) $n53) ;
    public final Bild1Parser.puzzle_return puzzle() throws RecognitionException {
        Bild1Parser.puzzle_return retval = new Bild1Parser.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUALS2=null;
        Token EQUALS3=null;
        Token EQUALS4=null;
        Token EQUALS5=null;
        Token EQUALS6=null;
        Token EQUALS7=null;
        Bild1Parser.number_return n11 =null;

        Bild1Parser.operator_return o11 =null;

        Bild1Parser.number_return n12 =null;

        Bild1Parser.number_return n13 =null;

        Bild1Parser.operator_return o21 =null;

        Bild1Parser.operator_return o22 =null;

        Bild1Parser.operator_return o23 =null;

        Bild1Parser.number_return n31 =null;

        Bild1Parser.operator_return o31 =null;

        Bild1Parser.number_return n32 =null;

        Bild1Parser.number_return n33 =null;

        Bild1Parser.number_return n51 =null;

        Bild1Parser.operator_return o51 =null;

        Bild1Parser.number_return n52 =null;

        Bild1Parser.number_return n53 =null;


        CommonTree EQUALS2_tree=null;
        CommonTree EQUALS3_tree=null;
        CommonTree EQUALS4_tree=null;
        CommonTree EQUALS5_tree=null;
        CommonTree EQUALS6_tree=null;
        CommonTree EQUALS7_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:21:9: (n11= number o11= operator n12= number EQUALS n13= number o21= operator o22= operator o23= operator n31= number o31= operator n32= number EQUALS n33= number EQUALS EQUALS EQUALS n51= number o51= operator n52= number EQUALS n53= number -> ^( EQUALS ^( $o11 $n11 $n12) $n13) ^( EQUALS ^( $o31 $n31 $n32) $n33) ^( EQUALS ^( $o51 $n51 $n52) $n53) ^( EQUALS ^( $o21 $n11 $n31) $n51) ^( EQUALS ^( $o22 $n12 $n32) $n52) ^( EQUALS ^( $o23 $n13 $n33) $n53) )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:21:13: n11= number o11= operator n12= number EQUALS n13= number o21= operator o22= operator o23= operator n31= number o31= operator n32= number EQUALS n33= number EQUALS EQUALS EQUALS n51= number o51= operator n52= number EQUALS n53= number
            {
            pushFollow(FOLLOW_number_in_puzzle84);
            n11=number();

            state._fsp--;

            stream_number.add(n11.getTree());

            pushFollow(FOLLOW_operator_in_puzzle88);
            o11=operator();

            state._fsp--;

            stream_operator.add(o11.getTree());

            pushFollow(FOLLOW_number_in_puzzle92);
            n12=number();

            state._fsp--;

            stream_number.add(n12.getTree());

            EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle94);  
            stream_EQUALS.add(EQUALS2);


            pushFollow(FOLLOW_number_in_puzzle98);
            n13=number();

            state._fsp--;

            stream_number.add(n13.getTree());

            pushFollow(FOLLOW_operator_in_puzzle105);
            o21=operator();

            state._fsp--;

            stream_operator.add(o21.getTree());

            pushFollow(FOLLOW_operator_in_puzzle109);
            o22=operator();

            state._fsp--;

            stream_operator.add(o22.getTree());

            pushFollow(FOLLOW_operator_in_puzzle113);
            o23=operator();

            state._fsp--;

            stream_operator.add(o23.getTree());

            pushFollow(FOLLOW_number_in_puzzle120);
            n31=number();

            state._fsp--;

            stream_number.add(n31.getTree());

            pushFollow(FOLLOW_operator_in_puzzle124);
            o31=operator();

            state._fsp--;

            stream_operator.add(o31.getTree());

            pushFollow(FOLLOW_number_in_puzzle128);
            n32=number();

            state._fsp--;

            stream_number.add(n32.getTree());

            EQUALS3=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle130);  
            stream_EQUALS.add(EQUALS3);


            pushFollow(FOLLOW_number_in_puzzle134);
            n33=number();

            state._fsp--;

            stream_number.add(n33.getTree());

            EQUALS4=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle139);  
            stream_EQUALS.add(EQUALS4);


            EQUALS5=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle141);  
            stream_EQUALS.add(EQUALS5);


            EQUALS6=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle143);  
            stream_EQUALS.add(EQUALS6);


            pushFollow(FOLLOW_number_in_puzzle150);
            n51=number();

            state._fsp--;

            stream_number.add(n51.getTree());

            pushFollow(FOLLOW_operator_in_puzzle154);
            o51=operator();

            state._fsp--;

            stream_operator.add(o51.getTree());

            pushFollow(FOLLOW_number_in_puzzle158);
            n52=number();

            state._fsp--;

            stream_number.add(n52.getTree());

            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_puzzle160);  
            stream_EQUALS.add(EQUALS7);


            pushFollow(FOLLOW_number_in_puzzle164);
            n53=number();

            state._fsp--;

            stream_number.add(n53.getTree());

            // AST REWRITE
            // elements: EQUALS, n13, o22, n33, EQUALS, n52, n11, n33, n11, n32, n31, n51, n53, n12, EQUALS, EQUALS, o31, n12, n31, n32, o51, n53, EQUALS, n52, o21, o11, EQUALS, n13, n51, o23
            // token labels: 
            // rule labels: retval, n12, n11, n32, n31, n33, n53, o31, o23, o51, n51, n52, o11, o21, o22, n13
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_n12=new RewriteRuleSubtreeStream(adaptor,"rule n12",n12!=null?n12.tree:null);
            RewriteRuleSubtreeStream stream_n11=new RewriteRuleSubtreeStream(adaptor,"rule n11",n11!=null?n11.tree:null);
            RewriteRuleSubtreeStream stream_n32=new RewriteRuleSubtreeStream(adaptor,"rule n32",n32!=null?n32.tree:null);
            RewriteRuleSubtreeStream stream_n31=new RewriteRuleSubtreeStream(adaptor,"rule n31",n31!=null?n31.tree:null);
            RewriteRuleSubtreeStream stream_n33=new RewriteRuleSubtreeStream(adaptor,"rule n33",n33!=null?n33.tree:null);
            RewriteRuleSubtreeStream stream_n53=new RewriteRuleSubtreeStream(adaptor,"rule n53",n53!=null?n53.tree:null);
            RewriteRuleSubtreeStream stream_o31=new RewriteRuleSubtreeStream(adaptor,"rule o31",o31!=null?o31.tree:null);
            RewriteRuleSubtreeStream stream_o23=new RewriteRuleSubtreeStream(adaptor,"rule o23",o23!=null?o23.tree:null);
            RewriteRuleSubtreeStream stream_o51=new RewriteRuleSubtreeStream(adaptor,"rule o51",o51!=null?o51.tree:null);
            RewriteRuleSubtreeStream stream_n51=new RewriteRuleSubtreeStream(adaptor,"rule n51",n51!=null?n51.tree:null);
            RewriteRuleSubtreeStream stream_n52=new RewriteRuleSubtreeStream(adaptor,"rule n52",n52!=null?n52.tree:null);
            RewriteRuleSubtreeStream stream_o11=new RewriteRuleSubtreeStream(adaptor,"rule o11",o11!=null?o11.tree:null);
            RewriteRuleSubtreeStream stream_o21=new RewriteRuleSubtreeStream(adaptor,"rule o21",o21!=null?o21.tree:null);
            RewriteRuleSubtreeStream stream_o22=new RewriteRuleSubtreeStream(adaptor,"rule o22",o22!=null?o22.tree:null);
            RewriteRuleSubtreeStream stream_n13=new RewriteRuleSubtreeStream(adaptor,"rule n13",n13!=null?n13.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 26:4: -> ^( EQUALS ^( $o11 $n11 $n12) $n13) ^( EQUALS ^( $o31 $n31 $n32) $n33) ^( EQUALS ^( $o51 $n51 $n52) $n53) ^( EQUALS ^( $o21 $n11 $n31) $n51) ^( EQUALS ^( $o22 $n12 $n32) $n52) ^( EQUALS ^( $o23 $n13 $n33) $n53)
            {
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:27:5: ^( EQUALS ^( $o11 $n11 $n12) $n13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:27:14: ^( $o11 $n11 $n12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o11.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n11.nextTree());

                adaptor.addChild(root_2, stream_n12.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n13.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:28:4: ^( EQUALS ^( $o31 $n31 $n32) $n33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:28:13: ^( $o31 $n31 $n32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o31.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n31.nextTree());

                adaptor.addChild(root_2, stream_n32.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n33.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:29:4: ^( EQUALS ^( $o51 $n51 $n52) $n53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:29:13: ^( $o51 $n51 $n52)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o51.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n51.nextTree());

                adaptor.addChild(root_2, stream_n52.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:31:4: ^( EQUALS ^( $o21 $n11 $n31) $n51)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:31:13: ^( $o21 $n11 $n31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n11.nextTree());

                adaptor.addChild(root_2, stream_n31.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n51.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:32:4: ^( EQUALS ^( $o22 $n12 $n32) $n52)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:32:13: ^( $o22 $n12 $n32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o22.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n12.nextTree());

                adaptor.addChild(root_2, stream_n32.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n52.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:33:4: ^( EQUALS ^( $o23 $n13 $n33) $n53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:33:13: ^( $o23 $n13 $n33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o23.nextNode(), root_2);

                adaptor.addChild(root_2, stream_n13.nextTree());

                adaptor.addChild(root_2, stream_n33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_n53.nextTree());

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


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:1: number : ( ZIFFER )+ -> ^( ZAHL ( ZIFFER )+ ) ;
    public final Bild1Parser.number_return number() throws RecognitionException {
        Bild1Parser.number_return retval = new Bild1Parser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ZIFFER8=null;

        CommonTree ZIFFER8_tree=null;
        RewriteRuleTokenStream stream_ZIFFER=new RewriteRuleTokenStream(adaptor,"token ZIFFER");

        try {
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:8: ( ( ZIFFER )+ -> ^( ZAHL ( ZIFFER )+ ) )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:10: ( ZIFFER )+
            {
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:10: ( ZIFFER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ZIFFER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:10: ZIFFER
            	    {
            	    ZIFFER8=(Token)match(input,ZIFFER,FOLLOW_ZIFFER_in_number318);  
            	    stream_ZIFFER.add(ZIFFER8);


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
            // elements: ZIFFER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 35:18: -> ^( ZAHL ( ZIFFER )+ )
            {
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:35:21: ^( ZAHL ( ZIFFER )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ZAHL, "ZAHL")
                , root_1);

                if ( !(stream_ZIFFER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ZIFFER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ZIFFER.nextNode()
                    );

                }
                stream_ZIFFER.reset();

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


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:36:1: operator : ( ADD | SUB );
    public final Bild1Parser.operator_return operator() throws RecognitionException {
        Bild1Parser.operator_return retval = new Bild1Parser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:37:2: ( ADD | SUB )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set9=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set9)
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
    // $ANTLR end "operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_puzzle_in_start63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_puzzle84 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle88 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle92 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle98 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle105 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle109 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle113 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle120 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle124 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle130 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle143 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle150 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_operator_in_puzzle154 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_puzzle160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_number_in_puzzle164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZIFFER_in_number318 = new BitSet(new long[]{0x0000000000000402L});

}