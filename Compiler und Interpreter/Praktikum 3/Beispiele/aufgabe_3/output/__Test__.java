import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import grammar.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        PuzzleLexer lex = new PuzzleLexer(new ANTLRFileStream("/Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_1/raetsel.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        PuzzleParser parser = new PuzzleParser(tokens);
        PuzzleParser.start_return r = parser.start();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        PuzzleConverter walker = new PuzzleConverter(nodes);
        try {
            walker.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}