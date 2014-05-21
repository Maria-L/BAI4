import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Symbolraetsel3Lexer lex = new Symbolraetsel3Lexer(new ANTLRFileStream("/Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin1/inputraetsel.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Symbolraetsel3Parser g = new Symbolraetsel3Parser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}