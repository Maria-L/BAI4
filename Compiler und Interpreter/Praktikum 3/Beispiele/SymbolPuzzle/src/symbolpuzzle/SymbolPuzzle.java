package symbolpuzzle;

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

import symbolpuzzle.grammar.SymbolPuzzleLexer;
import symbolpuzzle.grammar.SymbolPuzzleParser;
import symbolpuzzle.grammar.SymbolPuzzleWalker;

/**
 * @author Eike-Christian
 * @author Andreas Kamenz
 */
public class SymbolPuzzle {

	private static Logger logger = Logger.getLogger(SymbolPuzzle.class.getName());

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ANTLRFileStream file = new ANTLRFileStream("src/symbolpuzzle/puzzles/puzzle1.txt");
			Lexer lexer = new SymbolPuzzleLexer(file);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SymbolPuzzleParser parser = new SymbolPuzzleParser(tokens);
			try {
				CommonTree puzzleTree = (CommonTree) parser.start().getTree();

				// Walk Result Tree
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(puzzleTree);
				SymbolPuzzleWalker walker = new SymbolPuzzleWalker(nodes);
				SymbolPuzzleWalker.start_return walkerRes = walker.start();
				CommonTree walkerTree = (CommonTree) walkerRes.getTree();

				// DOT Generator
				DOTTreeGenerator gen = new DOTTreeGenerator();
				StringTemplate walkerTemplate = gen.toDOT(walkerTree);
				System.out.println(walkerTemplate);				
			} catch (RecognitionException e) {
				logger.log(Level.SEVERE, "Parser meldet Fehler", e);
			}
		} catch (IOException ex) {
			logger.log(Level.SEVERE, "Fehler beim Einlesen des Puzzles", ex);
		}
	}

}
