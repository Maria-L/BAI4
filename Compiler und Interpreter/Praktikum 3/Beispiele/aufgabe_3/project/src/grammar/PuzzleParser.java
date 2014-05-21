// $ANTLR 3.4 /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g 2013-05-28 10:47:19
package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PuzzleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PuzzleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PuzzleParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:18:1: start : opr00= operand op1= operator opr01= operand '=' opr02= operand NEWLINE op2= operator op3= operator op4= operator NEWLINE opr10= operand op5= operator opr11= operand '=' opr12= operand NEWLINE '=' '=' '=' NEWLINE opr20= operand op6= operator opr21= operand '=' opr22= operand NEWLINE EOF -> ^( CALCULATION ^( $op1 $opr00 $opr01) $opr02) ^( CALCULATION ^( $op5 $opr10 $opr11) $opr12) ^( CALCULATION ^( $op6 $opr20 $opr21) $opr22) ^( CALCULATION ^( $op2 $opr00 $opr10) $opr20) ^( CALCULATION ^( $op3 $opr01 $opr11) $opr21) ^( CALCULATION ^( $op4 $opr02 $opr12) $opr22) ;
    public final PuzzleParser.start_return start() throws RecognitionException {
        PuzzleParser.start_return retval = new PuzzleParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal1=null;
        Token NEWLINE2=null;
        Token NEWLINE3=null;
        Token char_literal4=null;
        Token NEWLINE5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token NEWLINE9=null;
        Token char_literal10=null;
        Token NEWLINE11=null;
        Token EOF12=null;
        PuzzleParser.operand_return opr00 =null;

        PuzzleParser.operator_return op1 =null;

        PuzzleParser.operand_return opr01 =null;

        PuzzleParser.operand_return opr02 =null;

        PuzzleParser.operator_return op2 =null;

        PuzzleParser.operator_return op3 =null;

        PuzzleParser.operator_return op4 =null;

        PuzzleParser.operand_return opr10 =null;

        PuzzleParser.operator_return op5 =null;

        PuzzleParser.operand_return opr11 =null;

        PuzzleParser.operand_return opr12 =null;

        PuzzleParser.operand_return opr20 =null;

        PuzzleParser.operator_return op6 =null;

        PuzzleParser.operand_return opr21 =null;

        PuzzleParser.operand_return opr22 =null;


        CommonTree char_literal1_tree=null;
        CommonTree NEWLINE2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree NEWLINE5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree NEWLINE9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree NEWLINE11_tree=null;
        CommonTree EOF12_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:19:2: (opr00= operand op1= operator opr01= operand '=' opr02= operand NEWLINE op2= operator op3= operator op4= operator NEWLINE opr10= operand op5= operator opr11= operand '=' opr12= operand NEWLINE '=' '=' '=' NEWLINE opr20= operand op6= operator opr21= operand '=' opr22= operand NEWLINE EOF -> ^( CALCULATION ^( $op1 $opr00 $opr01) $opr02) ^( CALCULATION ^( $op5 $opr10 $opr11) $opr12) ^( CALCULATION ^( $op6 $opr20 $opr21) $opr22) ^( CALCULATION ^( $op2 $opr00 $opr10) $opr20) ^( CALCULATION ^( $op3 $opr01 $opr11) $opr21) ^( CALCULATION ^( $op4 $opr02 $opr12) $opr22) )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:20:3: opr00= operand op1= operator opr01= operand '=' opr02= operand NEWLINE op2= operator op3= operator op4= operator NEWLINE opr10= operand op5= operator opr11= operand '=' opr12= operand NEWLINE '=' '=' '=' NEWLINE opr20= operand op6= operator opr21= operand '=' opr22= operand NEWLINE EOF
            {
            pushFollow(FOLLOW_operand_in_start68);
            opr00=operand();

            state._fsp--;

            stream_operand.add(opr00.getTree());

            pushFollow(FOLLOW_operator_in_start73);
            op1=operator();

            state._fsp--;

            stream_operator.add(op1.getTree());

            pushFollow(FOLLOW_operand_in_start77);
            opr01=operand();

            state._fsp--;

            stream_operand.add(opr01.getTree());

            char_literal1=(Token)match(input,12,FOLLOW_12_in_start79);  
            stream_12.add(char_literal1);


            pushFollow(FOLLOW_operand_in_start83);
            opr02=operand();

            state._fsp--;

            stream_operand.add(opr02.getTree());

            NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start85);  
            stream_NEWLINE.add(NEWLINE2);


            pushFollow(FOLLOW_operator_in_start93);
            op2=operator();

            state._fsp--;

            stream_operator.add(op2.getTree());

            pushFollow(FOLLOW_operator_in_start97);
            op3=operator();

            state._fsp--;

            stream_operator.add(op3.getTree());

            pushFollow(FOLLOW_operator_in_start103);
            op4=operator();

            state._fsp--;

            stream_operator.add(op4.getTree());

            NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start105);  
            stream_NEWLINE.add(NEWLINE3);


            pushFollow(FOLLOW_operand_in_start111);
            opr10=operand();

            state._fsp--;

            stream_operand.add(opr10.getTree());

            pushFollow(FOLLOW_operator_in_start116);
            op5=operator();

            state._fsp--;

            stream_operator.add(op5.getTree());

            pushFollow(FOLLOW_operand_in_start120);
            opr11=operand();

            state._fsp--;

            stream_operand.add(opr11.getTree());

            char_literal4=(Token)match(input,12,FOLLOW_12_in_start122);  
            stream_12.add(char_literal4);


            pushFollow(FOLLOW_operand_in_start126);
            opr12=operand();

            state._fsp--;

            stream_operand.add(opr12.getTree());

            NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start128);  
            stream_NEWLINE.add(NEWLINE5);


            char_literal6=(Token)match(input,12,FOLLOW_12_in_start136);  
            stream_12.add(char_literal6);


            char_literal7=(Token)match(input,12,FOLLOW_12_in_start147);  
            stream_12.add(char_literal7);


            char_literal8=(Token)match(input,12,FOLLOW_12_in_start160);  
            stream_12.add(char_literal8);


            NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start162);  
            stream_NEWLINE.add(NEWLINE9);


            pushFollow(FOLLOW_operand_in_start168);
            opr20=operand();

            state._fsp--;

            stream_operand.add(opr20.getTree());

            pushFollow(FOLLOW_operator_in_start173);
            op6=operator();

            state._fsp--;

            stream_operator.add(op6.getTree());

            pushFollow(FOLLOW_operand_in_start177);
            opr21=operand();

            state._fsp--;

            stream_operand.add(opr21.getTree());

            char_literal10=(Token)match(input,12,FOLLOW_12_in_start179);  
            stream_12.add(char_literal10);


            pushFollow(FOLLOW_operand_in_start183);
            opr22=operand();

            state._fsp--;

            stream_operand.add(opr22.getTree());

            NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_start185);  
            stream_NEWLINE.add(NEWLINE11);


            EOF12=(Token)match(input,EOF,FOLLOW_EOF_in_start189);  
            stream_EOF.add(EOF12);


            // AST REWRITE
            // elements: op2, op6, opr11, opr21, op1, opr01, opr22, opr21, opr02, op5, opr10, opr02, opr10, op4, opr12, opr00, opr11, opr12, opr20, opr00, opr22, opr20, op3, opr01
            // token labels: 
            // rule labels: retval, opr20, op1, op2, op3, op4, opr11, op5, op6, opr10, opr22, opr21, opr12, opr01, opr02, opr00
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_opr20=new RewriteRuleSubtreeStream(adaptor,"rule opr20",opr20!=null?opr20.tree:null);
            RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
            RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.tree:null);
            RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);
            RewriteRuleSubtreeStream stream_op4=new RewriteRuleSubtreeStream(adaptor,"rule op4",op4!=null?op4.tree:null);
            RewriteRuleSubtreeStream stream_opr11=new RewriteRuleSubtreeStream(adaptor,"rule opr11",opr11!=null?opr11.tree:null);
            RewriteRuleSubtreeStream stream_op5=new RewriteRuleSubtreeStream(adaptor,"rule op5",op5!=null?op5.tree:null);
            RewriteRuleSubtreeStream stream_op6=new RewriteRuleSubtreeStream(adaptor,"rule op6",op6!=null?op6.tree:null);
            RewriteRuleSubtreeStream stream_opr10=new RewriteRuleSubtreeStream(adaptor,"rule opr10",opr10!=null?opr10.tree:null);
            RewriteRuleSubtreeStream stream_opr22=new RewriteRuleSubtreeStream(adaptor,"rule opr22",opr22!=null?opr22.tree:null);
            RewriteRuleSubtreeStream stream_opr21=new RewriteRuleSubtreeStream(adaptor,"rule opr21",opr21!=null?opr21.tree:null);
            RewriteRuleSubtreeStream stream_opr12=new RewriteRuleSubtreeStream(adaptor,"rule opr12",opr12!=null?opr12.tree:null);
            RewriteRuleSubtreeStream stream_opr01=new RewriteRuleSubtreeStream(adaptor,"rule opr01",opr01!=null?opr01.tree:null);
            RewriteRuleSubtreeStream stream_opr02=new RewriteRuleSubtreeStream(adaptor,"rule opr02",opr02!=null?opr02.tree:null);
            RewriteRuleSubtreeStream stream_opr00=new RewriteRuleSubtreeStream(adaptor,"rule opr00",opr00!=null?opr00.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:3: -> ^( CALCULATION ^( $op1 $opr00 $opr01) $opr02) ^( CALCULATION ^( $op5 $opr10 $opr11) $opr12) ^( CALCULATION ^( $op6 $opr20 $opr21) $opr22) ^( CALCULATION ^( $op2 $opr00 $opr10) $opr20) ^( CALCULATION ^( $op3 $opr01 $opr11) $opr21) ^( CALCULATION ^( $op4 $opr02 $opr12) $opr22)
            {
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:28:4: ^( CALCULATION ^( $op1 $opr00 $opr01) $opr02)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:28:18: ^( $op1 $opr00 $opr01)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr00.nextTree());

                adaptor.addChild(root_2, stream_opr01.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr02.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:29:4: ^( CALCULATION ^( $op5 $opr10 $opr11) $opr12)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:29:18: ^( $op5 $opr10 $opr11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op5.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr10.nextTree());

                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr12.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:30:4: ^( CALCULATION ^( $op6 $opr20 $opr21) $opr22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:30:18: ^( $op6 $opr20 $opr21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op6.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr20.nextTree());

                adaptor.addChild(root_2, stream_opr21.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr22.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:32:4: ^( CALCULATION ^( $op2 $opr00 $opr10) $opr20)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:32:18: ^( $op2 $opr00 $opr10)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr00.nextTree());

                adaptor.addChild(root_2, stream_opr10.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr20.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:33:4: ^( CALCULATION ^( $op3 $opr01 $opr11) $opr21)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:33:18: ^( $op3 $opr01 $opr11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr01.nextTree());

                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr21.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:34:4: ^( CALCULATION ^( $op4 $opr02 $opr12) $opr22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:34:18: ^( $op4 $opr02 $opr12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op4.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr02.nextTree());

                adaptor.addChild(root_2, stream_opr12.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr22.nextTree());

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


    public static class operand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:37:1: operand : ( ID )+ -> ^( OPERAND ( ID )+ ) ;
    public final PuzzleParser.operand_return operand() throws RecognitionException {
        PuzzleParser.operand_return retval = new PuzzleParser.operand_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID13=null;

        CommonTree ID13_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:38:2: ( ( ID )+ -> ^( OPERAND ( ID )+ ) )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:38:4: ( ID )+
            {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:38:4: ( ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:38:4: ID
            	    {
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_operand333);  
            	    stream_ID.add(ID13);


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
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:2: -> ^( OPERAND ( ID )+ )
            {
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:39:6: ^( OPERAND ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OPERAND, "OPERAND")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

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
    // $ANTLR end "operand"


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:46:1: operator : ( ADD | SUB );
    public final PuzzleParser.operator_return operator() throws RecognitionException {
        PuzzleParser.operator_return retval = new PuzzleParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:47:2: ( ADD | SUB )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set14=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set14)
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


 

    public static final BitSet FOLLOW_operand_in_start68 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start73 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start77 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start79 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start83 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start85 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start93 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start97 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start105 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start111 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start120 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start147 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start160 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start162 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start168 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_operator_in_start173 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start179 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operand_in_start183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_start185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operand333 = new BitSet(new long[]{0x0000000000000082L});

}