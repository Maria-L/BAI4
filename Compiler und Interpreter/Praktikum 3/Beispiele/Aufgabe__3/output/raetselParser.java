// $ANTLR 3.4 /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g 2013-06-04 08:57:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class raetselParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public raetselParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public raetselParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return raetselParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:23:1: start : raetsel -> ^( RAETSEL raetsel ) ;
    public final raetselParser.start_return start() throws RecognitionException {
        raetselParser.start_return retval = new raetselParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        raetselParser.raetsel_return raetsel1 =null;


        RewriteRuleSubtreeStream stream_raetsel=new RewriteRuleSubtreeStream(adaptor,"rule raetsel");
        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:23:6: ( raetsel -> ^( RAETSEL raetsel ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:23:8: raetsel
            {
            pushFollow(FOLLOW_raetsel_in_start48);
            raetsel1=raetsel();

            state._fsp--;

            stream_raetsel.add(raetsel1.getTree());

            // AST REWRITE
            // elements: raetsel
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 23:16: -> ^( RAETSEL raetsel )
            {
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:23:19: ^( RAETSEL raetsel )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RAETSEL, "RAETSEL")
                , root_1);

                adaptor.addChild(root_1, stream_raetsel.nextTree());

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


    public static class raetsel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "raetsel"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:25:1: raetsel : b11= BLOCK o11= op b12= BLOCK EQS b13= BLOCK o21= op o22= op o23= op b21= BLOCK o31= op b22= BLOCK EQS b23= BLOCK EQS EQS EQS b31= BLOCK o51= op b32= BLOCK EQS b33= BLOCK EOF -> ^( EQS ^( $o11 $b11 $b12) $b13) ^( EQS ^( $o31 $b21 $b22) $b23) ^( EQS ^( $o51 $b31 $b32) $b33) ^( EQS ^( $o21 $b11 $b21) $b31) ^( EQS ^( $o22 $b12 $b22) $b32) ^( EQS ^( $o23 $b13 $b23) $b33) ;
    public final raetselParser.raetsel_return raetsel() throws RecognitionException {
        raetselParser.raetsel_return retval = new raetselParser.raetsel_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token b11=null;
        Token b12=null;
        Token b13=null;
        Token b21=null;
        Token b22=null;
        Token b23=null;
        Token b31=null;
        Token b32=null;
        Token b33=null;
        Token EQS2=null;
        Token EQS3=null;
        Token EQS4=null;
        Token EQS5=null;
        Token EQS6=null;
        Token EQS7=null;
        Token EOF8=null;
        raetselParser.op_return o11 =null;

        raetselParser.op_return o21 =null;

        raetselParser.op_return o22 =null;

        raetselParser.op_return o23 =null;

        raetselParser.op_return o31 =null;

        raetselParser.op_return o51 =null;


        CommonTree b11_tree=null;
        CommonTree b12_tree=null;
        CommonTree b13_tree=null;
        CommonTree b21_tree=null;
        CommonTree b22_tree=null;
        CommonTree b23_tree=null;
        CommonTree b31_tree=null;
        CommonTree b32_tree=null;
        CommonTree b33_tree=null;
        CommonTree EQS2_tree=null;
        CommonTree EQS3_tree=null;
        CommonTree EQS4_tree=null;
        CommonTree EQS5_tree=null;
        CommonTree EQS6_tree=null;
        CommonTree EQS7_tree=null;
        CommonTree EOF8_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_BLOCK=new RewriteRuleTokenStream(adaptor,"token BLOCK");
        RewriteRuleTokenStream stream_EQS=new RewriteRuleTokenStream(adaptor,"token EQS");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:25:9: (b11= BLOCK o11= op b12= BLOCK EQS b13= BLOCK o21= op o22= op o23= op b21= BLOCK o31= op b22= BLOCK EQS b23= BLOCK EQS EQS EQS b31= BLOCK o51= op b32= BLOCK EQS b33= BLOCK EOF -> ^( EQS ^( $o11 $b11 $b12) $b13) ^( EQS ^( $o31 $b21 $b22) $b23) ^( EQS ^( $o51 $b31 $b32) $b33) ^( EQS ^( $o21 $b11 $b21) $b31) ^( EQS ^( $o22 $b12 $b22) $b32) ^( EQS ^( $o23 $b13 $b23) $b33) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:25:15: b11= BLOCK o11= op b12= BLOCK EQS b13= BLOCK o21= op o22= op o23= op b21= BLOCK o31= op b22= BLOCK EQS b23= BLOCK EQS EQS EQS b31= BLOCK o51= op b32= BLOCK EQS b33= BLOCK EOF
            {
            b11=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel71);  
            stream_BLOCK.add(b11);


            pushFollow(FOLLOW_op_in_raetsel75);
            o11=op();

            state._fsp--;

            stream_op.add(o11.getTree());

            b12=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel79);  
            stream_BLOCK.add(b12);


            EQS2=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel81);  
            stream_EQS.add(EQS2);


            b13=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel85);  
            stream_BLOCK.add(b13);


            pushFollow(FOLLOW_op_in_raetsel102);
            o21=op();

            state._fsp--;

            stream_op.add(o21.getTree());

            pushFollow(FOLLOW_op_in_raetsel109);
            o22=op();

            state._fsp--;

            stream_op.add(o22.getTree());

            pushFollow(FOLLOW_op_in_raetsel114);
            o23=op();

            state._fsp--;

            stream_op.add(o23.getTree());

            b21=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel130);  
            stream_BLOCK.add(b21);


            pushFollow(FOLLOW_op_in_raetsel134);
            o31=op();

            state._fsp--;

            stream_op.add(o31.getTree());

            b22=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel138);  
            stream_BLOCK.add(b22);


            EQS3=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel140);  
            stream_EQS.add(EQS3);


            b23=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel144);  
            stream_BLOCK.add(b23);


            EQS4=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel159);  
            stream_EQS.add(EQS4);


            EQS5=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel169);  
            stream_EQS.add(EQS5);


            EQS6=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel174);  
            stream_EQS.add(EQS6);


            b31=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel190);  
            stream_BLOCK.add(b31);


            pushFollow(FOLLOW_op_in_raetsel194);
            o51=op();

            state._fsp--;

            stream_op.add(o51.getTree());

            b32=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel198);  
            stream_BLOCK.add(b32);


            EQS7=(Token)match(input,EQS,FOLLOW_EQS_in_raetsel200);  
            stream_EQS.add(EQS7);


            b33=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_raetsel204);  
            stream_BLOCK.add(b33);


            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_raetsel218);  
            stream_EOF.add(EOF8);


            // AST REWRITE
            // elements: o31, b11, b23, EQS, EQS, o23, EQS, EQS, EQS, b13, b12, b33, b31, b32, EQS, b12, b13, b11, b31, o21, b33, b22, o11, b32, b23, b21, b22, o22, o51, b21
            // token labels: b11, b21, b12, b22, b23, b33, b31, b13, b32
            // rule labels: retval, o11, o21, o22, o31, o23, o51
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b11=new RewriteRuleTokenStream(adaptor,"token b11",b11);
            RewriteRuleTokenStream stream_b21=new RewriteRuleTokenStream(adaptor,"token b21",b21);
            RewriteRuleTokenStream stream_b12=new RewriteRuleTokenStream(adaptor,"token b12",b12);
            RewriteRuleTokenStream stream_b22=new RewriteRuleTokenStream(adaptor,"token b22",b22);
            RewriteRuleTokenStream stream_b23=new RewriteRuleTokenStream(adaptor,"token b23",b23);
            RewriteRuleTokenStream stream_b33=new RewriteRuleTokenStream(adaptor,"token b33",b33);
            RewriteRuleTokenStream stream_b31=new RewriteRuleTokenStream(adaptor,"token b31",b31);
            RewriteRuleTokenStream stream_b13=new RewriteRuleTokenStream(adaptor,"token b13",b13);
            RewriteRuleTokenStream stream_b32=new RewriteRuleTokenStream(adaptor,"token b32",b32);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o11=new RewriteRuleSubtreeStream(adaptor,"rule o11",o11!=null?o11.tree:null);
            RewriteRuleSubtreeStream stream_o21=new RewriteRuleSubtreeStream(adaptor,"rule o21",o21!=null?o21.tree:null);
            RewriteRuleSubtreeStream stream_o22=new RewriteRuleSubtreeStream(adaptor,"rule o22",o22!=null?o22.tree:null);
            RewriteRuleSubtreeStream stream_o31=new RewriteRuleSubtreeStream(adaptor,"rule o31",o31!=null?o31.tree:null);
            RewriteRuleSubtreeStream stream_o23=new RewriteRuleSubtreeStream(adaptor,"rule o23",o23!=null?o23.tree:null);
            RewriteRuleSubtreeStream stream_o51=new RewriteRuleSubtreeStream(adaptor,"rule o51",o51!=null?o51.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 30:17: -> ^( EQS ^( $o11 $b11 $b12) $b13) ^( EQS ^( $o31 $b21 $b22) $b23) ^( EQS ^( $o51 $b31 $b32) $b33) ^( EQS ^( $o21 $b11 $b21) $b31) ^( EQS ^( $o22 $b12 $b22) $b32) ^( EQS ^( $o23 $b13 $b23) $b33)
            {
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:30:21: ^( EQS ^( $o11 $b11 $b12) $b13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:30:27: ^( $o11 $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o11.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextNode());

                adaptor.addChild(root_2, stream_b12.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b13.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:31:15: ^( EQS ^( $o31 $b21 $b22) $b23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:31:21: ^( $o31 $b21 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o31.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b21.nextNode());

                adaptor.addChild(root_2, stream_b22.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b23.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:32:15: ^( EQS ^( $o51 $b31 $b32) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:32:21: ^( $o51 $b31 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o51.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b31.nextNode());

                adaptor.addChild(root_2, stream_b32.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b33.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:33:15: ^( EQS ^( $o21 $b11 $b21) $b31)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:33:21: ^( $o21 $b11 $b21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextNode());

                adaptor.addChild(root_2, stream_b21.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b31.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:34:15: ^( EQS ^( $o22 $b12 $b22) $b32)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:34:21: ^( $o22 $b12 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o22.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b12.nextNode());

                adaptor.addChild(root_2, stream_b22.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b32.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:35:15: ^( EQS ^( $o23 $b13 $b23) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQS.nextNode()
                , root_1);

                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:35:21: ^( $o23 $b13 $b23)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o23.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b13.nextNode());

                adaptor.addChild(root_2, stream_b23.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b33.nextNode());

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
    // $ANTLR end "raetsel"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:43:1: op : ( ADD | SUB ) ;
    public final raetselParser.op_return op() throws RecognitionException {
        raetselParser.op_return retval = new raetselParser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:43:3: ( ( ADD | SUB ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:
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
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_raetsel_in_start48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel71 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel79 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel81 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel85 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel102 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel109 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel130 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel190 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_raetsel194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQS_in_raetsel200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BLOCK_in_raetsel204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_raetsel218 = new BitSet(new long[]{0x0000000000000002L});

}