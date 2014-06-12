// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g 2014-06-12 15:48:17

	package symbolStuff;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolTreeGrammar extends TreeParser {
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


    public symbolTreeGrammar(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return symbolTreeGrammar.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:14:1: start : line line line column column column ;
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



        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:14:7: ( line line line column column column )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:14:9: line line line column column column
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start51);
            line1=line();

            state._fsp--;

            adaptor.addChild(root_0, line1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start53);
            line2=line();

            state._fsp--;

            adaptor.addChild(root_0, line2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_start55);
            line3=line();

            state._fsp--;

            adaptor.addChild(root_0, line3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start57);
            column4=column();

            state._fsp--;

            adaptor.addChild(root_0, column4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start59);
            column5=column();

            state._fsp--;

            adaptor.addChild(root_0, column5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_column_in_start61);
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
        return retval;
    }
    // $ANTLR end "start"


    public static class line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:17:1: line : ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) );
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
        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:17:6: ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:17:8: ^( LINE firstOp ADD secondOp EQ thirdOp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LINE7=(CommonTree)match(input,LINE,FOLLOW_LINE_in_line73);  
                    stream_LINE.add(LINE7);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_line75);
                    firstOp8=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp8.getTree());

                    _last = (CommonTree)input.LT(1);
                    ADD9=(CommonTree)match(input,ADD,FOLLOW_ADD_in_line77);  
                    stream_ADD.add(ADD9);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_line79);
                    secondOp10=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp10.getTree());

                    _last = (CommonTree)input.LT(1);
                    EQ11=(CommonTree)match(input,EQ,FOLLOW_EQ_in_line81);  
                    stream_EQ.add(EQ11);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_line83);
                    thirdOp12=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp12.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: thirdOp, LINE, EQ, ADD, secondOp, firstOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 17:49: -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp )
                    {
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:17:52: ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LINE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_firstOp.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );

                        adaptor.addChild(root_1, stream_secondOp.nextTree());

                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );

                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:18:4: ^( LINE firstOp SUB secondOp EQ thirdOp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LINE13=(CommonTree)match(input,LINE,FOLLOW_LINE_in_line108);  
                    stream_LINE.add(LINE13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_line110);
                    firstOp14=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp14.getTree());

                    _last = (CommonTree)input.LT(1);
                    SUB15=(CommonTree)match(input,SUB,FOLLOW_SUB_in_line112);  
                    stream_SUB.add(SUB15);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_line114);
                    secondOp16=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp16.getTree());

                    _last = (CommonTree)input.LT(1);
                    EQ17=(CommonTree)match(input,EQ,FOLLOW_EQ_in_line116);  
                    stream_EQ.add(EQ17);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_line118);
                    thirdOp18=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp18.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: EQ, secondOp, thirdOp, firstOp, LINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 18:45: -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp )
                    {
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:18:48: ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LINE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_secondOp.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );

                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );

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
        return retval;
    }
    // $ANTLR end "line"


    public static class column_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:21:1: column : ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) );
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
        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:21:8: ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:21:10: ^( COLUMN firstOp ADD secondOp EQ thirdOp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN19=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column149);  
                    stream_COLUMN.add(COLUMN19);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_column151);
                    firstOp20=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp20.getTree());

                    _last = (CommonTree)input.LT(1);
                    ADD21=(CommonTree)match(input,ADD,FOLLOW_ADD_in_column153);  
                    stream_ADD.add(ADD21);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_column155);
                    secondOp22=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp22.getTree());

                    _last = (CommonTree)input.LT(1);
                    EQ23=(CommonTree)match(input,EQ,FOLLOW_EQ_in_column157);  
                    stream_EQ.add(EQ23);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_column159);
                    thirdOp24=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp24.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: firstOp, EQ, thirdOp, COLUMN, secondOp, ADD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:52: -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp )
                    {
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:21:55: ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_COLUMN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_firstOp.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );

                        adaptor.addChild(root_1, stream_secondOp.nextTree());

                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );

                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:22:4: ^( COLUMN firstOp SUB secondOp EQ thirdOp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN25=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column183);  
                    stream_COLUMN.add(COLUMN25);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_firstOp_in_column185);
                    firstOp26=firstOp();

                    state._fsp--;

                    stream_firstOp.add(firstOp26.getTree());

                    _last = (CommonTree)input.LT(1);
                    SUB27=(CommonTree)match(input,SUB,FOLLOW_SUB_in_column187);  
                    stream_SUB.add(SUB27);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_secondOp_in_column189);
                    secondOp28=secondOp();

                    state._fsp--;

                    stream_secondOp.add(secondOp28.getTree());

                    _last = (CommonTree)input.LT(1);
                    EQ29=(CommonTree)match(input,EQ,FOLLOW_EQ_in_column191);  
                    stream_EQ.add(EQ29);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_thirdOp_in_column193);
                    thirdOp30=thirdOp();

                    state._fsp--;

                    stream_thirdOp.add(thirdOp30.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: firstOp, thirdOp, EQ, secondOp, COLUMN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 22:46: -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp )
                    {
                        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:22:49: ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_COLUMN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_secondOp.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ADD, "+")
                        );

                        adaptor.addChild(root_1, stream_thirdOp.nextTree());

                        adaptor.addChild(root_1, 
                        stream_EQ.nextNode()
                        );

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
        return retval;
    }
    // $ANTLR end "column"


    public static class firstOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "firstOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:25:1: firstOp : ^( SIGN ( BCHAR )+ ) ;
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

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:25:9: ( ^( SIGN ( BCHAR )+ ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:25:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SIGN31=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_firstOp223); 
            SIGN31_tree = (CommonTree)adaptor.dupNode(SIGN31);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN31_tree, root_1);


            match(input, Token.DOWN, null); 
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:25:18: ( BCHAR )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BCHAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:25:18: BCHAR
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR32=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_firstOp225); 
            	    BCHAR32_tree = (CommonTree)adaptor.dupNode(BCHAR32);


            	    adaptor.addChild(root_1, BCHAR32_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "firstOp"


    public static class secondOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "secondOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:28:1: secondOp : ^( SIGN ( BCHAR )+ ) ;
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

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:28:9: ( ^( SIGN ( BCHAR )+ ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:28:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SIGN33=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_secondOp238); 
            SIGN33_tree = (CommonTree)adaptor.dupNode(SIGN33);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN33_tree, root_1);


            match(input, Token.DOWN, null); 
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:28:18: ( BCHAR )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BCHAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:28:18: BCHAR
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR34=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_secondOp240); 
            	    BCHAR34_tree = (CommonTree)adaptor.dupNode(BCHAR34);


            	    adaptor.addChild(root_1, BCHAR34_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "secondOp"


    public static class thirdOp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "thirdOp"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:31:1: thirdOp : ^( SIGN ( BCHAR )+ ) ;
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

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:31:9: ( ^( SIGN ( BCHAR )+ ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:31:11: ^( SIGN ( BCHAR )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SIGN35=(CommonTree)match(input,SIGN,FOLLOW_SIGN_in_thirdOp254); 
            SIGN35_tree = (CommonTree)adaptor.dupNode(SIGN35);


            root_1 = (CommonTree)adaptor.becomeRoot(SIGN35_tree, root_1);


            match(input, Token.DOWN, null); 
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:31:18: ( BCHAR )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BCHAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeGrammar.g:31:18: BCHAR
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BCHAR36=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_thirdOp256); 
            	    BCHAR36_tree = (CommonTree)adaptor.dupNode(BCHAR36);


            	    adaptor.addChild(root_1, BCHAR36_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            return "17:1: line : ( ^( LINE firstOp ADD secondOp EQ thirdOp ) -> ^( LINE firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( LINE firstOp SUB secondOp EQ thirdOp ) -> ^( LINE secondOp ADD[\"+\"] thirdOp EQ firstOp ) );";
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
            return "21:1: column : ( ^( COLUMN firstOp ADD secondOp EQ thirdOp ) -> ^( COLUMN firstOp ADD[\"+\"] secondOp EQ thirdOp ) | ^( COLUMN firstOp SUB secondOp EQ thirdOp ) -> ^( COLUMN secondOp ADD[\"+\"] thirdOp EQ firstOp ) );";
        }
    }
 

    public static final BitSet FOLLOW_line_in_start51 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start53 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start57 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_line73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_line75 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_line77 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_line79 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_line81 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_line83 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_line108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_line110 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SUB_in_line112 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_line114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_line116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_line118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_column149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_column151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_column153 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_column155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_column157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_column159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_column183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_firstOp_in_column185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SUB_in_column187 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_secondOp_in_column189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_column191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_thirdOp_in_column193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGN_in_firstOp223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_firstOp225 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_SIGN_in_secondOp238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_secondOp240 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_SIGN_in_thirdOp254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_thirdOp256 = new BitSet(new long[]{0x0000000000000028L});

}