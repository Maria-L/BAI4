// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g 2014-05-26 16:40:17

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolTreeGrammar extends DebugTreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "line", "secondOp", "column", "firstOp", "thirdOp", "start"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public symbolTreeGrammar(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public symbolTreeGrammar(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public symbolTreeGrammar(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return symbolTreeGrammar.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:10:1: start : line line line column column column ;
    public final symbolTreeGrammar.start_return start() throws RecognitionException {
        symbolTreeGrammar.start_return retval = new symbolTreeGrammar.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        symbolTreeGrammar.line_return line1 =null;

        symbolTreeGrammar.line_return line2 =null;

        symbolTreeGrammar.line_return line3 =null;

        symbolTreeGrammar.column_return column4 =null;

        symbolTreeGrammar.column_return column5 =null;

        symbolTreeGrammar.column_return column6 =null;



        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:10:7: ( line line line column column column )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:10:9: line line line column column column
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(10,9);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start45);
            line1=line();

            state._fsp--;

            adaptor.addChild(root_0, line1.getTree());

            dbg.location(10,14);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start47);
            line2=line();

            state._fsp--;

            adaptor.addChild(root_0, line2.getTree());

            dbg.location(10,19);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start49);
            line3=line();

            state._fsp--;

            adaptor.addChild(root_0, line3.getTree());

            dbg.location(10,24);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start51);
            column4=column();

            state._fsp--;

            adaptor.addChild(root_0, column4.getTree());

            dbg.location(10,31);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start53);
            column5=column();

            state._fsp--;

            adaptor.addChild(root_0, column5.getTree());

            dbg.location(10,38);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start55);
            column6=column();

            state._fsp--;

            adaptor.addChild(root_0, column6.getTree());


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
        dbg.location(11, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:13:1: line : ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) );
    public final symbolTreeGrammar.line_return line() throws RecognitionException {
        symbolTreeGrammar.line_return retval = new symbolTreeGrammar.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LINE7=null;
        CommonTree ADD9=null;
        CommonTree EQ11=null;
        CommonTree LINE13=null;
        CommonTree SUB15=null;
        CommonTree EQ17=null;
        symbolTreeGrammar.firstOp_return firstOp8 =null;

        symbolTreeGrammar.secondOp_return secondOp10 =null;

        symbolTreeGrammar.thirdOp_return thirdOp12 =null;

        symbolTreeGrammar.firstOp_return firstOp14 =null;

        symbolTreeGrammar.secondOp_return secondOp16 =null;

        symbolTreeGrammar.thirdOp_return thirdOp18 =null;


        CommonTree LINE7_tree=null;
        CommonTree ADD9_tree=null;
        CommonTree EQ11_tree=null;
        CommonTree LINE13_tree=null;
        CommonTree SUB15_tree=null;
        CommonTree EQ17_tree=null;
        RewriteRuleNodeStream stream_ADD=new RewriteRuleNodeStream(adaptor,"token ADD");
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_LINE=new RewriteRuleNodeStream(adaptor,"token LINE");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_firstOp=new RewriteRuleSubtreeStream(adaptor,"rule firstOp");
        RewriteRuleSubtreeStream stream_secondOp=new RewriteRuleSubtreeStream(adaptor,"rule secondOp");
        RewriteRuleSubtreeStream stream_thirdOp=new RewriteRuleSubtreeStream(adaptor,"rule thirdOp");
        try { dbg.enterRule(getGrammarFileName(), "line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:13:6: ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            try {
                isCyclicDecision = true;
                alt1 = dfa1.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:13:8: ^( LINE firstOp ADD secondOp EQ thirdOp )
                    {
                    dbg.location(13,8);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(13,10);
                    _last = (CommonTree)input.LT(1);
                    LINE7=(CommonTree)match(input,LINE,FOLLOW_LINE_in_line67);  
                    stream_LINE.add(LINE7);


                    match(input, Token.DOWN, null); 
                    dbg.location(13,15);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_line69);
                    firstOp8=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp8.getTree());
                    dbg.location(13,23);
                    _last = (CommonTree)input.LT(1);
                    ADD9=(CommonTree)match(input,ADD,FOLLOW_ADD_in_line71);  
                    stream_ADD.add(ADD9);

                    dbg.location(13,27);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_line73);
                    secondOp10=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp10.getTree());
                    dbg.location(13,36);
                    _last = (CommonTree)input.LT(1);
                    EQ11=(CommonTree)match(input,EQ,FOLLOW_EQ_in_line75);  
                    stream_EQ.add(EQ11);

                    dbg.location(13,39);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_line77);
                    thirdOp12=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp12.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: ADD, secondOp, LINE, thirdOp, firstOp, EQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 13:49: -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp )
                    {
                        dbg.location(13,52);
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:13:52: ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(13,54);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LINE.nextNode()
                        , root_1);

                        dbg.location(13,59);
                        adaptor.addChild(root_1, stream_firstOp.nextTree());
                        dbg.location(13,67);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );
                        dbg.location(13,76);
                        adaptor.addChild(root_1, stream_secondOp.nextTree());
                        dbg.location(13,85);
                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );
                        dbg.location(13,88);
                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:14:4: ^( LINE firstOp SUB secondOp EQ thirdOp )
                    {
                    dbg.location(14,4);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(14,6);
                    _last = (CommonTree)input.LT(1);
                    LINE13=(CommonTree)match(input,LINE,FOLLOW_LINE_in_line102);  
                    stream_LINE.add(LINE13);


                    match(input, Token.DOWN, null); 
                    dbg.location(14,11);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_line104);
                    firstOp14=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp14.getTree());
                    dbg.location(14,19);
                    _last = (CommonTree)input.LT(1);
                    SUB15=(CommonTree)match(input,SUB,FOLLOW_SUB_in_line106);  
                    stream_SUB.add(SUB15);

                    dbg.location(14,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_line108);
                    secondOp16=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp16.getTree());
                    dbg.location(14,32);
                    _last = (CommonTree)input.LT(1);
                    EQ17=(CommonTree)match(input,EQ,FOLLOW_EQ_in_line110);  
                    stream_EQ.add(EQ17);

                    dbg.location(14,35);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_line112);
                    thirdOp18=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp18.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: LINE, firstOp, secondOp, EQ, thirdOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 14:45: -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp )
                    {
                        dbg.location(14,48);
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:14:48: ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(14,50);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LINE.nextNode()
                        , root_1);

                        dbg.location(14,55);
                        adaptor.addChild(root_1, stream_secondOp.nextTree());
                        dbg.location(14,64);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );
                        dbg.location(14,73);
                        adaptor.addChild(root_1, stream_thirdOp.nextTree());
                        dbg.location(14,81);
                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );
                        dbg.location(14,84);
                        adaptor.addChild(root_1, stream_firstOp.nextTree());

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
        dbg.location(15, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "line"


    public static class column_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:17:1: column : ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) );
    public final symbolTreeGrammar.column_return column() throws RecognitionException {
        symbolTreeGrammar.column_return retval = new symbolTreeGrammar.column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN19=null;
        CommonTree ADD21=null;
        CommonTree EQ23=null;
        CommonTree COLUMN25=null;
        CommonTree SUB27=null;
        CommonTree EQ29=null;
        symbolTreeGrammar.firstOp_return firstOp20 =null;

        symbolTreeGrammar.secondOp_return secondOp22 =null;

        symbolTreeGrammar.thirdOp_return thirdOp24 =null;

        symbolTreeGrammar.firstOp_return firstOp26 =null;

        symbolTreeGrammar.secondOp_return secondOp28 =null;

        symbolTreeGrammar.thirdOp_return thirdOp30 =null;


        CommonTree COLUMN19_tree=null;
        CommonTree ADD21_tree=null;
        CommonTree EQ23_tree=null;
        CommonTree COLUMN25_tree=null;
        CommonTree SUB27_tree=null;
        CommonTree EQ29_tree=null;
        RewriteRuleNodeStream stream_ADD=new RewriteRuleNodeStream(adaptor,"token ADD");
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_COLUMN=new RewriteRuleNodeStream(adaptor,"token COLUMN");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_firstOp=new RewriteRuleSubtreeStream(adaptor,"rule firstOp");
        RewriteRuleSubtreeStream stream_secondOp=new RewriteRuleSubtreeStream(adaptor,"rule secondOp");
        RewriteRuleSubtreeStream stream_thirdOp=new RewriteRuleSubtreeStream(adaptor,"rule thirdOp");
        try { dbg.enterRule(getGrammarFileName(), "column");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:17:8: ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            try {
                isCyclicDecision = true;
                alt2 = dfa2.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:17:10: ^( COLUMN firstOp ADD secondOp EQ thirdOp )
                    {
                    dbg.location(17,10);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(17,12);
                    _last = (CommonTree)input.LT(1);
                    COLUMN19=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column143);  
                    stream_COLUMN.add(COLUMN19);


                    match(input, Token.DOWN, null); 
                    dbg.location(17,19);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_column145);
                    firstOp20=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp20.getTree());
                    dbg.location(17,27);
                    _last = (CommonTree)input.LT(1);
                    ADD21=(CommonTree)match(input,ADD,FOLLOW_ADD_in_column147);  
                    stream_ADD.add(ADD21);

                    dbg.location(17,31);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_column149);
                    secondOp22=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp22.getTree());
                    dbg.location(17,40);
                    _last = (CommonTree)input.LT(1);
                    EQ23=(CommonTree)match(input,EQ,FOLLOW_EQ_in_column151);  
                    stream_EQ.add(EQ23);

                    dbg.location(17,43);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_column153);
                    thirdOp24=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp24.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: COLUMN, ADD, secondOp, thirdOp, EQ, firstOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 17:52: -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp )
                    {
                        dbg.location(17,55);
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:17:55: ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(17,57);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_COLUMN.nextNode()
                        , root_1);

                        dbg.location(17,64);
                        adaptor.addChild(root_1, stream_firstOp.nextTree());
                        dbg.location(17,72);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );
                        dbg.location(17,81);
                        adaptor.addChild(root_1, stream_secondOp.nextTree());
                        dbg.location(17,90);
                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );
                        dbg.location(17,93);
                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:18:4: ^( COLUMN firstOp SUB secondOp EQ thirdOp )
                    {
                    dbg.location(18,4);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(18,6);
                    _last = (CommonTree)input.LT(1);
                    COLUMN25=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column177);  
                    stream_COLUMN.add(COLUMN25);


                    match(input, Token.DOWN, null); 
                    dbg.location(18,13);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_column179);
                    firstOp26=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp26.getTree());
                    dbg.location(18,21);
                    _last = (CommonTree)input.LT(1);
                    SUB27=(CommonTree)match(input,SUB,FOLLOW_SUB_in_column181);  
                    stream_SUB.add(SUB27);

                    dbg.location(18,25);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_column183);
                    secondOp28=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp28.getTree());
                    dbg.location(18,34);
                    _last = (CommonTree)input.LT(1);
                    EQ29=(CommonTree)match(input,EQ,FOLLOW_EQ_in_column185);  
                    stream_EQ.add(EQ29);

                    dbg.location(18,37);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_column187);
                    thirdOp30=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp30.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: secondOp, COLUMN, EQ, thirdOp, firstOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 18:46: -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp )
                    {
                        dbg.location(18,49);
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:18:49: ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(18,51);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_COLUMN.nextNode()
                        , root_1);

                        dbg.location(18,58);
                        adaptor.addChild(root_1, stream_secondOp.nextTree());
                        dbg.location(18,67);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );
                        dbg.location(18,76);
                        adaptor.addChild(root_1, stream_thirdOp.nextTree());
                        dbg.location(18,84);
                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );
                        dbg.location(18,87);
                        adaptor.addChild(root_1, stream_firstOp.nextTree());

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
        dbg.location(19, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "column");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "column"


    public static class firstOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "firstOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:21:1: firstOp : ^( SIGN ( BCHAR )+ ) ;
    public final symbolTreeGrammar.firstOp_return firstOp() throws RecognitionException {
        symbolTreeGrammar.firstOp_return retval = new symbolTreeGrammar.firstOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SIGN31=null;
        CommonTree BCHAR32=null;

        CommonTree SIGN31_tree=null;
        CommonTree BCHAR32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "firstOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:21:9: ( ^( SIGN ( BCHAR )+ ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:21:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,11);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(21,13);
            _last = (CommonTree)input.LT(1);
            SIGN31=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_firstOp217); 
            SIGN31_tree = (CommonTree)adaptor.dupNode(SIGN31);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN31_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(21,18);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:21:18: ( BCHAR )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==BCHAR) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:21:18: BCHAR
            	    {
            	    dbg.location(21,18);
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR32=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_firstOp219); 
            	    BCHAR32_tree = (CommonTree)adaptor.dupNode(BCHAR32);


            	    adaptor.addChild(root_1, BCHAR32_tree);


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
        dbg.location(22, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "firstOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "firstOp"


    public static class secondOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "secondOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:24:1: secondOp : ^( SIGN ( BCHAR )+ ) ;
    public final symbolTreeGrammar.secondOp_return secondOp() throws RecognitionException {
        symbolTreeGrammar.secondOp_return retval = new symbolTreeGrammar.secondOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SIGN33=null;
        CommonTree BCHAR34=null;

        CommonTree SIGN33_tree=null;
        CommonTree BCHAR34_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "secondOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:24:9: ( ^( SIGN ( BCHAR )+ ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:24:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(24,11);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(24,13);
            _last = (CommonTree)input.LT(1);
            SIGN33=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_secondOp232); 
            SIGN33_tree = (CommonTree)adaptor.dupNode(SIGN33);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN33_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(24,18);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:24:18: ( BCHAR )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==BCHAR) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:24:18: BCHAR
            	    {
            	    dbg.location(24,18);
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR34=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_secondOp234); 
            	    BCHAR34_tree = (CommonTree)adaptor.dupNode(BCHAR34);


            	    adaptor.addChild(root_1, BCHAR34_tree);


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
        dbg.location(25, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "secondOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "secondOp"


    public static class thirdOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "thirdOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:27:1: thirdOp : ^( SIGN ( BCHAR )+ ) ;
    public final symbolTreeGrammar.thirdOp_return thirdOp() throws RecognitionException {
        symbolTreeGrammar.thirdOp_return retval = new symbolTreeGrammar.thirdOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SIGN35=null;
        CommonTree BCHAR36=null;

        CommonTree SIGN35_tree=null;
        CommonTree BCHAR36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "thirdOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:27:9: ( ^( SIGN ( BCHAR )+ ) )
            dbg.enterAlt(1);

            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:27:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,11);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(27,13);
            _last = (CommonTree)input.LT(1);
            SIGN35=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_thirdOp248); 
            SIGN35_tree = (CommonTree)adaptor.dupNode(SIGN35);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN35_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(27,18);
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:27:18: ( BCHAR )+
            int cnt5=0;
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==BCHAR) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbolTreeGrammar.g:27:18: BCHAR
            	    {
            	    dbg.location(27,18);
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR36=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_thirdOp250); 
            	    BCHAR36_tree = (CommonTree)adaptor.dupNode(BCHAR36);


            	    adaptor.addChild(root_1, BCHAR36_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt5++;
            } while (true);
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(28, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "thirdOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "thirdOp"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\11\1\2\1\13\1\2\1\5\1\3\1\4\2\uffff";
    static final String DFA1_maxS =
        "\1\11\1\2\1\13\1\2\2\5\1\15\2\uffff";
    static final String DFA1_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\uffff\1\5",
            "\1\7\10\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "13:1: line : ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA2_eotS =
        "\11\uffff";
    static final String DFA2_eofS =
        "\11\uffff";
    static final String DFA2_minS =
        "\1\6\1\2\1\13\1\2\1\5\1\3\1\4\2\uffff";
    static final String DFA2_maxS =
        "\1\6\1\2\1\13\1\2\2\5\1\15\2\uffff";
    static final String DFA2_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\11\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\uffff\1\5",
            "\1\7\10\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "17:1: column : ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_line_in_start45 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start47 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_line67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_line69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_line71 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_line73 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_line75 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_line77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_line102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_line104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SUB_in_line106 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_line108 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_line110 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_line112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_column143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_column145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_column147 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_column149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_column151 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_column153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_column177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_column179 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SUB_in_column181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_column183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_column185 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_column187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGN_in_firstOp217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_firstOp219 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_SIGN_in_secondOp232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_secondOp234 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_SIGN_in_thirdOp248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_thirdOp250 = new BitSet(new long[]{0x0000000000000028L});

}