package symbolRaetsel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import symbolRaetsel.output.*;

public class SymbolRaetsel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ANTLRFileStream file;
			file = new ANTLRFileStream("src/symbolRaetsel/output/TestPuzzle1.ljp");
			Lexer lexer = new Bild1Lexer(file);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Bild1Parser bRCEO = new Bild1Parser(tokens);
			
			try {
				CommonTree tree = (CommonTree) bRCEO.start().getTree();
				
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
				BildRaetselChef walker = new BildRaetselChef(nodes);
				BildRaetselChef.start_return walkerRes = walker.start();
				CommonTree walkerTree = (CommonTree) walkerRes.getTree();
				
				DOTTreeGenerator gen = new DOTTreeGenerator();
				StringTemplate walkerTemplate = gen.toDOT(walkerTree);
				System.out.println(walkerTemplate);
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		


	}

}
