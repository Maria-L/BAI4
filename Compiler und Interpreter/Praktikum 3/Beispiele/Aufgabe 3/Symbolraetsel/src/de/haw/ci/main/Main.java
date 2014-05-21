package de.haw.ci.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import de.haw.ci.grammar.SymbolRaetselWalker;
import de.haw.ci.grammar.SymbolraetselLexer;
import de.haw.ci.grammar.SymbolraetselParser;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		try {
		InputStream is = new FileInputStream("res/raetsel02.txt");
	
		ANTLRInputStream input = new ANTLRInputStream(is);
		//Lexer
		SymbolraetselLexer lexer = new SymbolraetselLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		//Parser
		SymbolraetselParser parser = new SymbolraetselParser(tokens);
		SymbolraetselParser.start_return result = parser.start();
		
		//Walk Tree
		CommonTree t = (CommonTree) result.getTree();
		System.out.println(t.toStringTree());
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		SymbolRaetselWalker walker = new SymbolRaetselWalker(nodes);
		SymbolRaetselWalker.start_return walkerResult = walker.start();
		
		CommonTree tree = (CommonTree)walkerResult.getTree();
		System.out.println(tree.toStringTree());
		
		} catch(IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
