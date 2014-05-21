import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class Raetsel {

    public static void main(String args[]) throws Exception {
        raetselLexer lex = new raetselLexer(new ANTLRFileStream("/Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        raetselParser parser = new raetselParser(tokens);
        raetselParser.start_return r = parser.start();
        
        CommonTree tree1 = (CommonTree) r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
        System.out.println("Eingabe:");
        System.out.println(tree1.toStringTree());
        raetselwalker walker = new raetselwalker(nodes);
       
        try {
            raetselwalker.start_return rtn = walker.start();
            CommonTree tree2 = (CommonTree) rtn.getTree();
            System.out.println("Ergebnis:");
            System.out.println(tree2.toStringTree());
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

}