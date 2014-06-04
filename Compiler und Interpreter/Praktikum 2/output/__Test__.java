import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import symbolStuff.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        symboleLexer lex = new symboleLexer(new ANTLRFileStream("Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        symboleParser parser = new symboleParser(tokens);
        symboleParser.start_return r = parser.start();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        symbolTreeGrammar walker = new symbolTreeGrammar(nodes);
        try {
            walker.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}