// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g 2014-05-21 13:29:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class symboleParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BCHAR", "COLUMN", "COMMENT", "EQ", "LINE", "NL", "OP", "SIGN", "START", "WS"
    };

    public static final int EOF=-1;
    public static final int BCHAR=4;
    public static final int COLUMN=5;
    public static final int COMMENT=6;
    public static final int EQ=7;
    public static final int LINE=8;
    public static final int NL=9;
    public static final int OP=10;
    public static final int SIGN=11;
    public static final int START=12;
    public static final int WS=13;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "start", "signline", "signs"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public symboleParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public symboleParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
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

public symboleParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return symboleParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:17:1: start : si1= signs op1= OP si2= signs EQ si3= signs ( NL )+ op3= OP op4= OP op5= OP ( NL )+ si4= signs op6= OP si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs op7= OP si10= signs EQ si11= signs ( NL )* -> ^( START ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) ) ;
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
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_signs=new RewriteRuleSubtreeStream(adaptor,"rule signs");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:17:8: (si1= signs op1= OP si2= signs EQ si3= signs ( NL )+ op3= OP op4= OP op5= OP ( NL )+ si4= signs op6= OP si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs op7= OP si10= signs EQ si11= signs ( NL )* -> ^( START ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:17:11: si1= signs op1= OP si2= signs EQ si3= signs ( NL )+ op3= OP op4= OP op5= OP ( NL )+ si4= signs op6= OP si7= signs EQ si8= signs ( NL )+ EQ EQ EQ ( NL )+ si9= signs op7= OP si10= signs EQ si11= signs ( NL )*
            {
            dbg.location(17,14);
            pushFollow(FOLLOW_signs_in_start54);
            si1=signs();

            state._fsp--;

            stream_signs.add(si1.getTree());
            dbg.location(17,25);
            op1=(Token)match(input,OP,FOLLOW_OP_in_start59);  
            stream_OP.add(op1);

            dbg.location(17,33);
            pushFollow(FOLLOW_signs_in_start64);
            si2=signs();

            state._fsp--;

            stream_signs.add(si2.getTree());
            dbg.location(17,41);
            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_start67);  
            stream_EQ.add(EQ1);

            dbg.location(17,48);
            pushFollow(FOLLOW_signs_in_start72);
            si3=signs();

            state._fsp--;

            stream_signs.add(si3.getTree());
            dbg.location(17,55);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:17:55: ( NL )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:17:55: NL
            	    {
            	    dbg.location(17,55);
            	    NL2=(Token)match(input,NL,FOLLOW_NL_in_start74);  
            	    stream_NL.add(NL2);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(18,7);
            op3=(Token)match(input,OP,FOLLOW_OP_in_start83);  
            stream_OP.add(op3);

            dbg.location(18,17);
            op4=(Token)match(input,OP,FOLLOW_OP_in_start90);  
            stream_OP.add(op4);

            dbg.location(18,26);
            op5=(Token)match(input,OP,FOLLOW_OP_in_start96);  
            stream_OP.add(op5);

            dbg.location(18,30);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:18:30: ( NL )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==NL) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:18:30: NL
            	    {
            	    dbg.location(18,30);
            	    NL3=(Token)match(input,NL,FOLLOW_NL_in_start98);  
            	    stream_NL.add(NL3);


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

            dbg.location(19,7);
            pushFollow(FOLLOW_signs_in_start107);
            si4=signs();

            state._fsp--;

            stream_signs.add(si4.getTree());
            dbg.location(19,18);
            op6=(Token)match(input,OP,FOLLOW_OP_in_start112);  
            stream_OP.add(op6);

            dbg.location(19,26);
            pushFollow(FOLLOW_signs_in_start117);
            si7=signs();

            state._fsp--;

            stream_signs.add(si7.getTree());
            dbg.location(19,34);
            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_start120);  
            stream_EQ.add(EQ4);

            dbg.location(19,41);
            pushFollow(FOLLOW_signs_in_start125);
            si8=signs();

            state._fsp--;

            stream_signs.add(si8.getTree());
            dbg.location(19,48);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:19:48: ( NL )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==NL) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:19:48: NL
            	    {
            	    dbg.location(19,48);
            	    NL5=(Token)match(input,NL,FOLLOW_NL_in_start127);  
            	    stream_NL.add(NL5);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(20,4);
            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_start134);  
            stream_EQ.add(EQ6);

            dbg.location(20,10);
            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_start139);  
            stream_EQ.add(EQ7);

            dbg.location(20,16);
            EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_start144);  
            stream_EQ.add(EQ8);

            dbg.location(20,19);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:20:19: ( NL )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==NL) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:20:19: NL
            	    {
            	    dbg.location(20,19);
            	    NL9=(Token)match(input,NL,FOLLOW_NL_in_start146);  
            	    stream_NL.add(NL9);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt4++;
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(21,7);
            pushFollow(FOLLOW_signs_in_start155);
            si9=signs();

            state._fsp--;

            stream_signs.add(si9.getTree());
            dbg.location(21,18);
            op7=(Token)match(input,OP,FOLLOW_OP_in_start160);  
            stream_OP.add(op7);

            dbg.location(21,27);
            pushFollow(FOLLOW_signs_in_start165);
            si10=signs();

            state._fsp--;

            stream_signs.add(si10.getTree());
            dbg.location(21,35);
            EQ10=(Token)match(input,EQ,FOLLOW_EQ_in_start168);  
            stream_EQ.add(EQ10);

            dbg.location(21,43);
            pushFollow(FOLLOW_signs_in_start173);
            si11=signs();

            state._fsp--;

            stream_signs.add(si11.getTree());
            dbg.location(21,50);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:21:50: ( NL )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==NL) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:21:50: NL
            	    {
            	    dbg.location(21,50);
            	    NL11=(Token)match(input,NL,FOLLOW_NL_in_start175);  
            	    stream_NL.add(NL11);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            // AST REWRITE
            // elements: si7, op7, op6, EQ, si3, EQ, si4, si9, si8, si7, EQ, si10, EQ, si10, si4, si3, si9, si1, EQ, si8, si2, op4, si11, si11, si1, op1, EQ, si2, op3, op5
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
            // 22:3: -> ^( START ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) )
            {
                dbg.location(23,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:23:3: ^( START ^( LINE $si1 $op1 $si2 EQ $si3) ^( LINE $si4 $op6 $si7 EQ $si8) ^( LINE $si9 $op7 $si10 EQ $si11) ^( COLUMN $si1 $op3 $si4 EQ $si9) ^( COLUMN $si2 $op4 $si7 EQ $si10) ^( COLUMN $si3 $op5 $si8 EQ $si11) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(23,5);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(START, "START")
                , root_1);

                dbg.location(24,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:24:3: ^( LINE $si1 $op1 $si2 EQ $si3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(24,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_2);

                dbg.location(24,11);
                adaptor.addChild(root_2, stream_si1.nextTree());
                dbg.location(24,16);
                adaptor.addChild(root_2, stream_op1.nextNode());
                dbg.location(24,21);
                adaptor.addChild(root_2, stream_si2.nextTree());
                dbg.location(24,25);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(24,29);
                adaptor.addChild(root_2, stream_si3.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(25,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:25:3: ^( LINE $si4 $op6 $si7 EQ $si8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(25,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_2);

                dbg.location(25,11);
                adaptor.addChild(root_2, stream_si4.nextTree());
                dbg.location(25,16);
                adaptor.addChild(root_2, stream_op6.nextNode());
                dbg.location(25,21);
                adaptor.addChild(root_2, stream_si7.nextTree());
                dbg.location(25,25);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(25,29);
                adaptor.addChild(root_2, stream_si8.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(26,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:26:3: ^( LINE $si9 $op7 $si10 EQ $si11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(26,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_2);

                dbg.location(26,11);
                adaptor.addChild(root_2, stream_si9.nextTree());
                dbg.location(26,16);
                adaptor.addChild(root_2, stream_op7.nextNode());
                dbg.location(26,21);
                adaptor.addChild(root_2, stream_si10.nextTree());
                dbg.location(26,26);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(26,30);
                adaptor.addChild(root_2, stream_si11.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(27,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:27:3: ^( COLUMN $si1 $op3 $si4 EQ $si9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(27,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_2);

                dbg.location(27,13);
                adaptor.addChild(root_2, stream_si1.nextTree());
                dbg.location(27,18);
                adaptor.addChild(root_2, stream_op3.nextNode());
                dbg.location(27,23);
                adaptor.addChild(root_2, stream_si4.nextTree());
                dbg.location(27,27);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(27,31);
                adaptor.addChild(root_2, stream_si9.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(28,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:28:3: ^( COLUMN $si2 $op4 $si7 EQ $si10)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(28,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_2);

                dbg.location(28,13);
                adaptor.addChild(root_2, stream_si2.nextTree());
                dbg.location(28,18);
                adaptor.addChild(root_2, stream_op4.nextNode());
                dbg.location(28,23);
                adaptor.addChild(root_2, stream_si7.nextTree());
                dbg.location(28,27);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(28,31);
                adaptor.addChild(root_2, stream_si10.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(29,3);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:29:3: ^( COLUMN $si3 $op5 $si8 EQ $si11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(29,5);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN, "COLUMN")
                , root_2);

                dbg.location(29,13);
                adaptor.addChild(root_2, stream_si3.nextTree());
                dbg.location(29,18);
                adaptor.addChild(root_2, stream_op5.nextNode());
                dbg.location(29,23);
                adaptor.addChild(root_2, stream_si8.nextTree());
                dbg.location(29,27);
                adaptor.addChild(root_2, 
                stream_EQ.nextNode()
                );
                dbg.location(29,31);
                adaptor.addChild(root_2, stream_si11.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
        dbg.location(31, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class signline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signline"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:33:1: signline : signs OP signs EQ signs ;
    public final symboleParser.signline_return signline() throws RecognitionException {
        symboleParser.signline_return retval = new symboleParser.signline_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OP13=null;
        Token EQ15=null;
        symboleParser.signs_return signs12 =null;

        symboleParser.signs_return signs14 =null;

        symboleParser.signs_return signs16 =null;


        CommonTree OP13_tree=null;
        CommonTree EQ15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "signline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:33:9: ( signs OP signs EQ signs )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:33:11: signs OP signs EQ signs
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,11);
            pushFollow(FOLLOW_signs_in_signline319);
            signs12=signs();

            state._fsp--;

            adaptor.addChild(root_0, signs12.getTree());
            dbg.location(33,17);
            OP13=(Token)match(input,OP,FOLLOW_OP_in_signline321); 
            OP13_tree = 
            (CommonTree)adaptor.create(OP13)
            ;
            adaptor.addChild(root_0, OP13_tree);

            dbg.location(33,20);
            pushFollow(FOLLOW_signs_in_signline323);
            signs14=signs();

            state._fsp--;

            adaptor.addChild(root_0, signs14.getTree());
            dbg.location(33,26);
            EQ15=(Token)match(input,EQ,FOLLOW_EQ_in_signline325); 
            EQ15_tree = 
            (CommonTree)adaptor.create(EQ15)
            ;
            adaptor.addChild(root_0, EQ15_tree);

            dbg.location(33,29);
            pushFollow(FOLLOW_signs_in_signline327);
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
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "signline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "signline"


    public static class signs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signs"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:1: signs : (id+= BCHAR )+ -> ^( SIGN ( $id)* ) ;
    public final symboleParser.signs_return signs() throws RecognitionException {
        symboleParser.signs_return retval = new symboleParser.signs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_BCHAR=new RewriteRuleTokenStream(adaptor,"token BCHAR");

        try { dbg.enterRule(getGrammarFileName(), "signs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:7: ( (id+= BCHAR )+ -> ^( SIGN ( $id)* ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:9: (id+= BCHAR )+
            {
            dbg.location(37,11);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:11: (id+= BCHAR )+
            int cnt6=0;
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==BCHAR) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:11: id+= BCHAR
            	    {
            	    dbg.location(37,11);
            	    id=(Token)match(input,BCHAR,FOLLOW_BCHAR_in_signs344);  
            	    stream_BCHAR.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt6++;
            } while (true);
            } finally {dbg.exitSubRule(6);}


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
            // 37:20: -> ^( SIGN ( $id)* )
            {
                dbg.location(37,23);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:23: ^( SIGN ( $id)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(37,25);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGN, "SIGN")
                , root_1);

                dbg.location(37,31);
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:37:31: ( $id)*
                while ( stream_id.hasNext() ) {
                    dbg.location(37,31);
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
        dbg.location(38, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "signs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "signs"

    // Delegated rules


 

    public static final BitSet FOLLOW_signs_in_start54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_start59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start64 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_start67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start72 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_start74 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_OP_in_start83 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_start90 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_start96 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_start98 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_signs_in_start107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_start112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_start120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_start127 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_EQ_in_start134 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_start139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_start144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_start146 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_signs_in_start155 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_start160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start165 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_start168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_start173 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NL_in_start175 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_signs_in_signline319 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OP_in_signline321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_signline323 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQ_in_signline325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signs_in_signline327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BCHAR_in_signs344 = new BitSet(new long[]{0x0000000000000012L});

}