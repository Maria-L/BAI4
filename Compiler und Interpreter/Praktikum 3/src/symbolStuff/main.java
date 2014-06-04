package symbolStuff;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class main {

	public static void main(String[] args) {
		ANTLRFileStream file;
		try {
			file = new ANTLRFileStream("src/symbolStuff/input.txt");
			Lexer lexer = new symboleLexer(file);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			symboleParser parser = new symboleParser(tokens);
			
			CommonTree gameTree = (CommonTree) parser.start().getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(gameTree);
			symbolTreeGrammar walker = new symbolTreeGrammar(nodes);
			symbolTreeGrammar.start_return walkerRes = walker.start();
			CommonTree walkerTree = (CommonTree) walkerRes.getTree();
			
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate walkerTemplate = gen.toDOT(walkerTree);
			System.out.println(walkerTemplate);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
