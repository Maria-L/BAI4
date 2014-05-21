package solver;

import grammar.PuzzleConverter;
import grammar.PuzzleLexer;
import grammar.PuzzleParser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

class Parser {
	public static void main(String args[]) throws Exception {
		PuzzleLexer lex = new PuzzleLexer(new ANTLRFileStream("/Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_1/raetsel.txt", "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		PuzzleParser parser = new PuzzleParser(tokens);
		PuzzleParser.start_return r = parser.start();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
		PuzzleConverter walker = new PuzzleConverter(nodes);

		try {
			CommonTree walkerTree = (CommonTree) walker.start().getTree();
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate walkerTemplate = gen.toDOT(walkerTree);
			System.out.println(walkerTemplate);
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}