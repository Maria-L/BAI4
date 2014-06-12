// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g 2014-06-02 10:21:55

	package symbolStuff;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class symboleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BCHAR", "COLUMN", "COMMENT", "EQ", "LINE", "NL", "SIGN", "START", "SUB", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BCHAR=5;
    public static final int COLUMN=6;
    public static final int COMMENT=7;
    public static final int EQ=8;
    public static final int LINE=9;
    public static final int NL=10;
    public static final int SIGN=11;
    public static final int START=12;
    public static final int SUB=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public symboleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public symboleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return symboleParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:1: start : si1= signs (op1= ADD |op1= SUB ) si2= signs EQ si3= signs ( NL )+ (op3= ADD |op3= SUB ) (op4= ADD |op4= SUB ) (op5= ADD |op5= SUB ) ( NL )+ si4= signs (op6= ADD |op6= SUB ) si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs (op7= ADD |op7= SUB ) si10= signs EQ si11= signs ( NL )* -> ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) ;
    public final symboleParser.start_return start() throws RecognitionException {
        symboleParser.start_return retval = new symboleParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token op1=null;
        Token op3=null;
        Token op4=null;
        Token op5=null;
        Token op6=null;
        Token op7=null;
        Token EQ1=null;
        Token NL2=null;
        Token NL3=null;
        Token EQ4=null;
        Token NL5=null;
        Token EQ6=null;
        Token EQ7=null;
        Token EQ8=null;
        Token NL9=null;
        Token EQ10=null;
        Token NL11=null;
        symboleParser.signs_return si1 =null;

        symboleParser.signs_return si2 =null;

        symboleParser.signs_return si3 =null;

        symboleParser.signs_return si4 =null;

        symboleParser.signs_return si7 =null;

        symboleParser.signs_return si8 =null;

        symboleParser.signs_return si9 =null;

        symboleParser.signs_return si10 =null;

        symboleParser.signs_return si11 =null;


        CommonTree op1_tree=null;
        CommonTree op3_tree=null;
        CommonTree op4_tree=null;
        CommonTree op5_tree=null;
        CommonTree op6_tree=null;
        CommonTree op7_tree=null;
        CommonTree EQ1_tree=null;
        CommonTree NL2_tree=null;
        CommonTree NL3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree NL5_tree=null;
        CommonTree EQ6_tree=null;
        CommonTree EQ7_tree=null;
        CommonTree EQ8_tree=null;
        CommonTree NL9_tree=null;
        CommonTree EQ10_tree=null;
        CommonTree NL11_tree=null;
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_signs=new RewriteRuleSubtreeStream(adaptor,"rule signs");
        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:8: (si1= signs (op1= ADD |op1= SUB ) si2= signs EQ si3= signs ( NL )+ (op3= ADD |op3= SUB ) (op4= ADD |op4= SUB ) (op5= ADD |op5= SUB ) ( NL )+ si4= signs (op6= ADD |op6= SUB ) si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs (op7= ADD |op7= SUB ) si10= signs EQ si11= signs ( NL )* -> ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:11: si1= signs (op1= ADD |op1= SUB ) si2= signs EQ si3= signs ( NL )+ (op3= ADD |op3= SUB ) (op4= ADD |op4= SUB ) (op5= ADD |op5= SUB ) ( NL )+ si4= signs (op6= ADD |op6= SUB ) si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs (op7= ADD |op7= SUB ) si10= signs EQ si11= signs ( NL )*
            {
            pushFollow(FOLLOW_signs_in_start61);
            si1=signs();

            state._fsp--;

            stream_signs.add(si1.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:22: (op1= ADD |op1= SUB )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ADD) ) {
                alt1=1;
            }
            else if ( (LA1_0==SUB) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:23: op1= ADD
                    {
                    op1=(Token)match(input,ADD,FOLLOW_ADD_in_start67);  
                    stream_ADD.add(op1);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:31: op1= SUB
                    {
                    op1=(Token)match(input,SUB,FOLLOW_SUB_in_start71);  
                    stream_SUB.add(op1);


                    }
                    break;

            }


            pushFollow(FOLLOW_signs_in_start77);
            si2=signs();

            state._fsp--;

            stream_signs.add(si2.getTree());

            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_start80);  
            stream_EQ.add(EQ1);


            pushFollow(FOLLOW_signs_in_start85);
            si3=signs();

            state._fsp--;

            stream_signs.add(si3.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:68: ( NL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:22:68: NL
            	    {
            	    NL2=(Token)match(input,NL,FOLLOW_NL_in_start89);  
            	    stream_NL.add(NL2);


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


            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:4: (op3= ADD |op3= SUB )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ADD) ) {
                alt3=1;
            }
            else if ( (LA3_0==SUB) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:5: op3= ADD
                    {
                    op3=(Token)match(input,ADD,FOLLOW_ADD_in_start99);  
                    stream_ADD.add(op3);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:13: op3= SUB
                    {
                    op3=(Token)match(input,SUB,FOLLOW_SUB_in_start103);  
                    stream_SUB.add(op3);


                    }
                    break;

            }


            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:25: (op4= ADD |op4= SUB )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ADD) ) {
                alt4=1;
            }
            else if ( (LA4_0==SUB) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:26: op4= ADD
                    {
                    op4=(Token)match(input,ADD,FOLLOW_ADD_in_start112);  
                    stream_ADD.add(op4);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:34: op4= SUB
                    {
                    op4=(Token)match(input,SUB,FOLLOW_SUB_in_start116);  
                    stream_SUB.add(op4);


                    }
                    break;

            }


            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:43: (op5= ADD |op5= SUB )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ADD) ) {
                alt5=1;
            }
            else if ( (LA5_0==SUB) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:44: op5= ADD
                    {
                    op5=(Token)match(input,ADD,FOLLOW_ADD_in_start122);  
                    stream_ADD.add(op5);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:52: op5= SUB
                    {
                    op5=(Token)match(input,SUB,FOLLOW_SUB_in_start126);  
                    stream_SUB.add(op5);


                    }
                    break;

            }


            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:62: ( NL )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:62: NL
            	    {
            	    NL3=(Token)match(input,NL,FOLLOW_NL_in_start130);  
            	    stream_NL.add(NL3);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            pushFollow(FOLLOW_signs_in_start139);
            si4=signs();

            state._fsp--;

            stream_signs.add(si4.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:15: (op6= ADD |op6= SUB )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ADD) ) {
                alt7=1;
            }
            else if ( (LA7_0==SUB) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:16: op6= ADD
                    {
                    op6=(Token)match(input,ADD,FOLLOW_ADD_in_start145);  
                    stream_ADD.add(op6);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:24: op6= SUB
                    {
                    op6=(Token)match(input,SUB,FOLLOW_SUB_in_start149);  
                    stream_SUB.add(op6);


                    }
                    break;

            }


            pushFollow(FOLLOW_signs_in_start155);
            si7=signs();

            state._fsp--;

            stream_signs.add(si7.getTree());

            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_start158);  
            stream_EQ.add(EQ4);


            pushFollow(FOLLOW_signs_in_start163);
            si8=signs();

            state._fsp--;

            stream_signs.add(si8.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:61: ( NL )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NL) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:61: NL
            	    {
            	    NL5=(Token)match(input,NL,FOLLOW_NL_in_start167);  
            	    stream_NL.add(NL5);


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_start174);  
            stream_EQ.add(EQ6);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_start181);  
            stream_EQ.add(EQ7);


            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_start186);  
            stream_EQ.add(EQ8);


            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:25:24: ( NL )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:25:24: NL
            	    {
            	    NL9=(Token)match(input,NL,FOLLOW_NL_in_start191);  
            	    stream_NL.add(NL9);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            pushFollow(FOLLOW_signs_in_start200);
            si9=signs();

            state._fsp--;

            stream_signs.add(si9.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:15: (op7= ADD |op7= SUB )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ADD) ) {
                alt10=1;
            }
            else if ( (LA10_0==SUB) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:16: op7= ADD
                    {
                    op7=(Token)match(input,ADD,FOLLOW_ADD_in_start206);  
                    stream_ADD.add(op7);


                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:24: op7= SUB
                    {
                    op7=(Token)match(input,SUB,FOLLOW_SUB_in_start210);  
                    stream_SUB.add(op7);


                    }
                    break;

            }


            pushFollow(FOLLOW_signs_in_start216);
            si10=signs();

            state._fsp--;

            stream_signs.add(si10.getTree());

            EQ10=(Token)match(input,EQ,FOLLOW_EQ_in_start219);  
            stream_EQ.add(EQ10);


            pushFollow(FOLLOW_signs_in_start224);
            si11=signs();

            state._fsp--;

            stream_signs.add(si11.getTree());

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:63: ( NL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:63: NL
            	    {
            	    NL11=(Token)match(input,NL,FOLLOW_NL_in_start228);  
            	    stream_NL.add(NL11);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: si7, si8, si2, op4, EQ, si10, si3, EQ, EQ, si1, op5, si11, EQ, si7, si2, si1, si4, EQ, op7, si9, op1, si8, si10, si11, si3, EQ, si4, op6, op3, si9
            // token labels: op1, op4, op3, op6, op5, op7
            // rule labels: si7, si10, si9, si8, si11, si1, si3, si2, retval, si4
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_op1=new RewriteRuleTokenStream(adaptor,"token op1",op1);
            RewriteRuleTokenStream stream_op4=new RewriteRuleTokenStream(adaptor,"token op4",op4);
            RewriteRuleTokenStream stream_op3=new RewriteRuleTokenStream(adaptor,"token op3",op3);
            RewriteRuleTokenStream stream_op6=new RewriteRuleTokenStream(adaptor,"token op6",op6);
            RewriteRuleTokenStream stream_op5=new RewriteRuleTokenStream(adaptor,"token op5",op5);
            RewriteRuleTokenStream stream_op7=new RewriteRuleTokenStream(adaptor,"token op7",op7);
            RewriteRuleSubtreeStream stream_si7=new RewriteRuleSubtreeStream(adaptor,"rule si7",si7!=null?si7.tree:null);
            RewriteRuleSubtreeStream stream_si10=new RewriteRuleSubtreeStream(adaptor,"rule si10",si10!=null?si10.tree:null);
            RewriteRuleSubtreeStream stream_si9=new RewriteRuleSubtreeStream(adaptor,"rule si9",si9!=null?si9.tree:null);
            RewriteRuleSubtreeStream stream_si8=new RewriteRuleSubtreeStream(adaptor,"rule si8",si8!=null?si8.tree:null);
            RewriteRuleSubtreeStream stream_si11=new RewriteRuleSubtreeStream(adaptor,"rule si11",si11!=null?si11.tree:null);
            RewriteRuleSubtreeStream stream_si1=new RewriteRuleSubtreeStream(adaptor,"rule si1",si1!=null?si1.tree:null);
            RewriteRuleSubtreeStream stream_si3=new RewriteRuleSubtreeStream(adaptor,"rule si3",si3!=null?si3.tree:null);
            RewriteRuleSubtreeStream stream_si2=new RewriteRuleSubtreeStream(adaptor,"rule si2",si2!=null?si2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_si4=new RewriteRuleSubtreeStream(adaptor,"rule si4",si4!=null?si4.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:3: -> ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11)
            {
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:28:3: ^( LINE $si1 $op1 $si2 EQ $si3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_1);

                adaptor.addChild(root_1, stream_si1.nextTree());

                adaptor.addChild(root_1, stream_op1.nextNode());

                adaptor.addChild(root_1, stream_si2.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:29:3: ^( LINE $si4 $op6 $si7 EQ $si8)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_1);

                adaptor.addChild(root_1, stream_si4.nextTree());

                adaptor.addChild(root_1, stream_op6.nextNode());

                adaptor.addChild(root_1, stream_si7.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si8.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:30:3: ^( LINE $si9 $op7 $si10 EQ $si11)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_1);

                adaptor.addChild(root_1, stream_si9.nextTree());

                adaptor.addChild(root_1, stream_op7.nextNode());

                adaptor.addChild(root_1, stream_si10.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si11.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:31:3: ^( COLUMN $si1 $op3 $si4 EQ $si9)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_1);

                adaptor.addChild(root_1, stream_si1.nextTree());

                adaptor.addChild(root_1, stream_op3.nextNode());

                adaptor.addChild(root_1, stream_si4.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si9.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:32:3: ^( COLUMN $si2 $op4 $si7 EQ $si10)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_1);

                adaptor.addChild(root_1, stream_si2.nextTree());

                adaptor.addChild(root_1, stream_op4.nextNode());

                adaptor.addChild(root_1, stream_si7.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si10.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:33:3: ^( COLUMN $si3 $op5 $si8 EQ $si11)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_1);

                adaptor.addChild(root_1, stream_si3.nextTree());

                adaptor.addChild(root_1, stream_op5.nextNode());

                adaptor.addChild(root_1, stream_si8.nextTree());

                adaptor.addChild(root_1, 
                stream_EQ.nextNode()
                );

                adaptor.addChild(root_1, stream_si11.nextTree());

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


    public static class signline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signline"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:1: signline : signs ( ADD | SUB ) signs EQ signs ;
    public final symboleParser.signline_return signline() throws RecognitionException {
        symboleParser.signline_return retval = new symboleParser.signline_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set13=null;
        Token EQ15=null;
        symboleParser.signs_return signs12 =null;

        symboleParser.signs_return signs14 =null;

        symboleParser.signs_return signs16 =null;


        CommonTree set13_tree=null;
        CommonTree EQ15_tree=null;

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:9: ( signs ( ADD | SUB ) signs EQ signs )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:11: signs ( ADD | SUB ) signs EQ signs
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_signs_in_signline366);
            signs12=signs();

            state._fsp--;

            adaptor.addChild(root_0, signs12.getTree());

            set13=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set13)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_signs_in_signline374);
            signs14=signs();

            state._fsp--;

            adaptor.addChild(root_0, signs14.getTree());

            EQ15=(Token)match(input,EQ,FOLLOW_EQ_in_signline376); 
            EQ15_tree = 
            (CommonTree)adaptor.create(EQ15)
            ;
            adaptor.addChild(root_0, EQ15_tree);


            pushFollow(FOLLOW_signs_in_signline378);
            signs16=signs();

            state._fsp--;

            adaptor.addChild(root_0, signs16.getTree());

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
    // $ANTLR end "signline"


    public static class signs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signs"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:1: signs : (id+= BCHAR )+ -> ^( SIGN ( $id)* ) ;
    public final symboleParser.signs_return signs() throws RecognitionException {
        symboleParser.signs_return retval = new symboleParser.signs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_BCHAR=new RewriteRuleTokenStream(adaptor,"token BCHAR");

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:7: ( (id+= BCHAR )+ -> ^( SIGN ( $id)* ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:9: (id+= BCHAR )+
            {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:11: (id+= BCHAR )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BCHAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:11: id+= BCHAR
            	    {
            	    id=(Token)match(input,BCHAR,FOLLOW_BCHAR_in_signs395);  
            	    stream_BCHAR.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 41:20: -> ^( SIGN ( $id)* )
            {
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:23: ^( SIGN ( $id)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGN, "SIGN")
                , root_1);

                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:41:31: ( $id)*
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextNode());

                }
                stream_id.reset();

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
    // $ANTLR end "signs"

    // Delegated rules


 

    public static final BitSet FOLLOW_signs_in_start61 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ADD_in_start67 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SUB_in_start71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start77 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_start80 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start85 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_start89 = new BitSet(new long[]{0x0000000000002410L});
    public static final BitSet FOLLOW_ADD_in_start99 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_SUB_in_start103 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ADD_in_start112 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_SUB_in_start116 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ADD_in_start122 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SUB_in_start126 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_start130 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_signs_in_start139 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ADD_in_start145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SUB_in_start149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_start158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_start167 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_EQ_in_start174 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_start181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_start186 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_start191 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_signs_in_start200 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ADD_in_start206 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SUB_in_start210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_start219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_start224 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_NL_in_start228 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_signs_in_signline366 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_set_in_signline368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_signline374 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_signline376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_signs_in_signline378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BCHAR_in_signs395 = new BitSet(new long[]{0x0000000000000022L});

}