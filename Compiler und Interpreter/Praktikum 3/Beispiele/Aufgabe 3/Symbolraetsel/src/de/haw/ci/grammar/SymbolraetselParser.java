package de.haw.ci.grammar;

// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g 2013-05-14 15:30:34

import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class SymbolraetselParser extends Parser {
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


        public SymbolraetselParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolraetselParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:13:1: start : var01= zBlock op0102= op var02= zBlock EQ eq03= zBlock op0111= op op0212= op op0313= op var11= zBlock op1112= op var12= zBlock EQ eq13= zBlock EQ EQ EQ eq21= zBlock op2122= op eq22= zBlock EQ eq23= zBlock -> ^( EQ ^( $op0102 $var01 $var02) $eq03) ^( EQ ^( $op1112 $var11 $var12) $eq13) ^( EQ ^( $op2122 $eq21 $eq22) $eq23) ^( EQ ^( $op0111 $var01 $var11) $eq21) ^( EQ ^( $op0212 $var02 $var12) $eq22) ^( EQ ^( $op0313 $eq03 $eq13) $eq23) ;
    public final SymbolraetselParser.start_return start() throws RecognitionException {
        SymbolraetselParser.start_return retval = new SymbolraetselParser.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ1=null;
        Token EQ2=null;
        Token EQ3=null;
        Token EQ4=null;
        Token EQ5=null;
        Token EQ6=null;
        SymbolraetselParser.zBlock_return var01 = null;

        SymbolraetselParser.op_return op0102 = null;

        SymbolraetselParser.zBlock_return var02 = null;

        SymbolraetselParser.zBlock_return eq03 = null;

        SymbolraetselParser.op_return op0111 = null;

        SymbolraetselParser.op_return op0212 = null;

        SymbolraetselParser.op_return op0313 = null;

        SymbolraetselParser.zBlock_return var11 = null;

        SymbolraetselParser.op_return op1112 = null;

        SymbolraetselParser.zBlock_return var12 = null;

        SymbolraetselParser.zBlock_return eq13 = null;

        SymbolraetselParser.zBlock_return eq21 = null;

        SymbolraetselParser.op_return op2122 = null;

        SymbolraetselParser.zBlock_return eq22 = null;

        SymbolraetselParser.zBlock_return eq23 = null;


        CommonTree EQ1_tree=null;
        CommonTree EQ2_tree=null;
        CommonTree EQ3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree EQ5_tree=null;
        CommonTree EQ6_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_zBlock=new RewriteRuleSubtreeStream(adaptor,"rule zBlock");
        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:13:6: (var01= zBlock op0102= op var02= zBlock EQ eq03= zBlock op0111= op op0212= op op0313= op var11= zBlock op1112= op var12= zBlock EQ eq13= zBlock EQ EQ EQ eq21= zBlock op2122= op eq22= zBlock EQ eq23= zBlock -> ^( EQ ^( $op0102 $var01 $var02) $eq03) ^( EQ ^( $op1112 $var11 $var12) $eq13) ^( EQ ^( $op2122 $eq21 $eq22) $eq23) ^( EQ ^( $op0111 $var01 $var11) $eq21) ^( EQ ^( $op0212 $var02 $var12) $eq22) ^( EQ ^( $op0313 $eq03 $eq13) $eq23) )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:13:8: var01= zBlock op0102= op var02= zBlock EQ eq03= zBlock op0111= op op0212= op op0313= op var11= zBlock op1112= op var12= zBlock EQ eq13= zBlock EQ EQ EQ eq21= zBlock op2122= op eq22= zBlock EQ eq23= zBlock
            {
            pushFollow(FOLLOW_zBlock_in_start48);
            var01=zBlock();

            state._fsp--;

            stream_zBlock.add(var01.getTree());
            pushFollow(FOLLOW_op_in_start53);
            op0102=op();

            state._fsp--;

            stream_op.add(op0102.getTree());
            pushFollow(FOLLOW_zBlock_in_start58);
            var02=zBlock();

            state._fsp--;

            stream_zBlock.add(var02.getTree());
            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_start61);  
            stream_EQ.add(EQ1);

            pushFollow(FOLLOW_zBlock_in_start66);
            eq03=zBlock();

            state._fsp--;

            stream_zBlock.add(eq03.getTree());
            pushFollow(FOLLOW_op_in_start77);
            op0111=op();

            state._fsp--;

            stream_op.add(op0111.getTree());
            pushFollow(FOLLOW_op_in_start82);
            op0212=op();

            state._fsp--;

            stream_op.add(op0212.getTree());
            pushFollow(FOLLOW_op_in_start87);
            op0313=op();

            state._fsp--;

            stream_op.add(op0313.getTree());
            pushFollow(FOLLOW_zBlock_in_start98);
            var11=zBlock();

            state._fsp--;

            stream_zBlock.add(var11.getTree());
            pushFollow(FOLLOW_op_in_start102);
            op1112=op();

            state._fsp--;

            stream_op.add(op1112.getTree());
            pushFollow(FOLLOW_zBlock_in_start107);
            var12=zBlock();

            state._fsp--;

            stream_zBlock.add(var12.getTree());
            EQ2=(Token)match(input,EQ,FOLLOW_EQ_in_start110);  
            stream_EQ.add(EQ2);

            pushFollow(FOLLOW_zBlock_in_start115);
            eq13=zBlock();

            state._fsp--;

            stream_zBlock.add(eq13.getTree());
            EQ3=(Token)match(input,EQ,FOLLOW_EQ_in_start124);  
            stream_EQ.add(EQ3);

            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_start127);  
            stream_EQ.add(EQ4);

            EQ5=(Token)match(input,EQ,FOLLOW_EQ_in_start130);  
            stream_EQ.add(EQ5);

            pushFollow(FOLLOW_zBlock_in_start140);
            eq21=zBlock();

            state._fsp--;

            stream_zBlock.add(eq21.getTree());
            pushFollow(FOLLOW_op_in_start145);
            op2122=op();

            state._fsp--;

            stream_op.add(op2122.getTree());
            pushFollow(FOLLOW_zBlock_in_start150);
            eq22=zBlock();

            state._fsp--;

            stream_zBlock.add(eq22.getTree());
            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_start153);  
            stream_EQ.add(EQ6);

            pushFollow(FOLLOW_zBlock_in_start158);
            eq23=zBlock();

            state._fsp--;

            stream_zBlock.add(eq23.getTree());


            // AST REWRITE
            // elements: var12, op0111, op2122, op0313, EQ, var01, var02, var12, EQ, eq21, EQ, var02, var11, eq03, EQ, eq03, eq22, eq22, eq21, op1112, var11, EQ, EQ, eq13, eq23, eq23, eq13, var01, op0212, op0102
            // token labels: 
            // rule labels: op0313, retval, op1112, eq21, eq03, eq22, eq13, eq23, op0102, op0111, var12, op0212, op2122, var01, var11, var02
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_op0313=new RewriteRuleSubtreeStream(adaptor,"rule op0313",op0313!=null?op0313.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_op1112=new RewriteRuleSubtreeStream(adaptor,"rule op1112",op1112!=null?op1112.tree:null);
            RewriteRuleSubtreeStream stream_eq21=new RewriteRuleSubtreeStream(adaptor,"rule eq21",eq21!=null?eq21.tree:null);
            RewriteRuleSubtreeStream stream_eq03=new RewriteRuleSubtreeStream(adaptor,"rule eq03",eq03!=null?eq03.tree:null);
            RewriteRuleSubtreeStream stream_eq22=new RewriteRuleSubtreeStream(adaptor,"rule eq22",eq22!=null?eq22.tree:null);
            RewriteRuleSubtreeStream stream_eq13=new RewriteRuleSubtreeStream(adaptor,"rule eq13",eq13!=null?eq13.tree:null);
            RewriteRuleSubtreeStream stream_eq23=new RewriteRuleSubtreeStream(adaptor,"rule eq23",eq23!=null?eq23.tree:null);
            RewriteRuleSubtreeStream stream_op0102=new RewriteRuleSubtreeStream(adaptor,"rule op0102",op0102!=null?op0102.tree:null);
            RewriteRuleSubtreeStream stream_op0111=new RewriteRuleSubtreeStream(adaptor,"rule op0111",op0111!=null?op0111.tree:null);
            RewriteRuleSubtreeStream stream_var12=new RewriteRuleSubtreeStream(adaptor,"rule var12",var12!=null?var12.tree:null);
            RewriteRuleSubtreeStream stream_op0212=new RewriteRuleSubtreeStream(adaptor,"rule op0212",op0212!=null?op0212.tree:null);
            RewriteRuleSubtreeStream stream_op2122=new RewriteRuleSubtreeStream(adaptor,"rule op2122",op2122!=null?op2122.tree:null);
            RewriteRuleSubtreeStream stream_var01=new RewriteRuleSubtreeStream(adaptor,"rule var01",var01!=null?var01.tree:null);
            RewriteRuleSubtreeStream stream_var11=new RewriteRuleSubtreeStream(adaptor,"rule var11",var11!=null?var11.tree:null);
            RewriteRuleSubtreeStream stream_var02=new RewriteRuleSubtreeStream(adaptor,"rule var02",var02!=null?var02.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 19:8: -> ^( EQ ^( $op0102 $var01 $var02) $eq03) ^( EQ ^( $op1112 $var11 $var12) $eq13) ^( EQ ^( $op2122 $eq21 $eq22) $eq23) ^( EQ ^( $op0111 $var01 $var11) $eq21) ^( EQ ^( $op0212 $var02 $var12) $eq22) ^( EQ ^( $op0313 $eq03 $eq13) $eq23)
            {
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:19:11: ^( EQ ^( $op0102 $var01 $var02) $eq03)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:19:16: ^( $op0102 $var01 $var02)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op0102.nextNode(), root_2);

                adaptor.addChild(root_2, stream_var01.nextTree());
                adaptor.addChild(root_2, stream_var02.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq03.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:20:5: ^( EQ ^( $op1112 $var11 $var12) $eq13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:20:10: ^( $op1112 $var11 $var12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op1112.nextNode(), root_2);

                adaptor.addChild(root_2, stream_var11.nextTree());
                adaptor.addChild(root_2, stream_var12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq13.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:21:5: ^( EQ ^( $op2122 $eq21 $eq22) $eq23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:21:10: ^( $op2122 $eq21 $eq22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2122.nextNode(), root_2);

                adaptor.addChild(root_2, stream_eq21.nextTree());
                adaptor.addChild(root_2, stream_eq22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq23.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:22:5: ^( EQ ^( $op0111 $var01 $var11) $eq21)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:22:10: ^( $op0111 $var01 $var11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op0111.nextNode(), root_2);

                adaptor.addChild(root_2, stream_var01.nextTree());
                adaptor.addChild(root_2, stream_var11.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq21.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:23:5: ^( EQ ^( $op0212 $var02 $var12) $eq22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:23:10: ^( $op0212 $var02 $var12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op0212.nextNode(), root_2);

                adaptor.addChild(root_2, stream_var02.nextTree());
                adaptor.addChild(root_2, stream_var12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq22.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:24:5: ^( EQ ^( $op0313 $eq03 $eq13) $eq23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:24:10: ^( $op0313 $eq03 $eq13)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op0313.nextNode(), root_2);

                adaptor.addChild(root_2, stream_eq03.nextTree());
                adaptor.addChild(root_2, stream_eq13.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_eq23.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:27:1: op : ( ADD | SUB );
    public final SymbolraetselParser.op_return op() throws RecognitionException {
        SymbolraetselParser.op_return retval = new SymbolraetselParser.op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:27:3: ( ADD | SUB )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set7=(Token)input.LT(1);
            if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set7));
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
        }
        return retval;
    }
    // $ANTLR end "op"

    public static class zBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zBlock"
    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:1: zBlock : ( SYM )+ -> ^( NUMBER ( SYM )+ ) ;
    public final SymbolraetselParser.zBlock_return zBlock() throws RecognitionException {
        SymbolraetselParser.zBlock_return retval = new SymbolraetselParser.zBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYM8=null;

        CommonTree SYM8_tree=null;
        RewriteRuleTokenStream stream_SYM=new RewriteRuleTokenStream(adaptor,"token SYM");

        try {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:7: ( ( SYM )+ -> ^( NUMBER ( SYM )+ ) )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:9: ( SYM )+
            {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:9: ( SYM )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYM) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:9: SYM
            	    {
            	    SYM8=(Token)match(input,SYM,FOLLOW_SYM_in_zBlock341);  
            	    stream_SYM.add(SYM8);


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
            // elements: SYM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 30:14: -> ^( NUMBER ( SYM )+ )
            {
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:30:17: ^( NUMBER ( SYM )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMBER, "NUMBER"), root_1);

                if ( !(stream_SYM.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYM.hasNext() ) {
                    adaptor.addChild(root_1, stream_SYM.nextNode());

                }
                stream_SYM.reset();

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
        }
        return retval;
    }
    // $ANTLR end "zBlock"

    // Delegated rules


 

    public static final BitSet FOLLOW_zBlock_in_start48 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start66 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start77 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start82 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start87 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start98 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start110 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start140 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_op_in_start145 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_start153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_zBlock_in_start158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYM_in_zBlock341 = new BitSet(new long[]{0x0000000000000102L});

}