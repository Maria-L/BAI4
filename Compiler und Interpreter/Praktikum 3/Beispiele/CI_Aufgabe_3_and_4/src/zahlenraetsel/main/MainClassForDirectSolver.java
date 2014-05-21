package zahlenraetsel.main;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import zahlenraetsel.generated.ZahlenRaetselDirectSolver;
import zahlenraetsel.generated.ZahlenRaetselEmitter;
import zahlenraetsel.generated.ZahlenraetselLexer;
import zahlenraetsel.generated.ZahlenraetselParser;
import zahlenraetsel.generated.ZahlenraetselTree;

public class MainClassForDirectSolver {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		generateSolver("./src/zahlenraetsel/main/raetsel.txt");
	}
	
	public static void generateSolver(String pathToSourceFile) throws IOException, RecognitionException{
		ANTLRFileStream fileStream=new ANTLRFileStream(pathToSourceFile);
		
		ZahlenraetselLexer lexer= new ZahlenraetselLexer(fileStream);
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		ZahlenraetselParser parser=new ZahlenraetselParser(tokens);
		
		CommonTree treeAfterParsing=(CommonTree)parser.prog().getTree();
		
		System.out.println("\n ************* \n Baum nach dem Parsen\n ************* \n ");
		System.out.println(treeAfterParsing.toStringTree());
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(treeAfterParsing);
		ZahlenraetselTree treeWalker = new ZahlenraetselTree(nodes);
		
		CommonTree treeAfterNormalization=treeWalker.prog().getTree();
		
		System.out.println("\n ************* \n Baum nach der Normalisierung \n ************* \n");
		System.out.println(treeAfterNormalization.toStringTree());
		
		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(treeAfterNormalization);
		nodes2.setTokenStream(tokens);
		
		ZahlenRaetselDirectSolver emitter = new ZahlenRaetselDirectSolver(nodes2);
		Map<String, Integer> puzzle_return = emitter.raetsel();
		
		System.out.println("\n ************* \n Lösung des Zahlenrätsels\n ************* \n");
		
		
		FileInputStream fstream = new FileInputStream(pathToSourceFile);
        DataInputStream in = new DataInputStream(fstream);
        StringBuilder strBuilder=new StringBuilder();
        int i=in.read();
        while(i!=-1){
          strBuilder.append((char)i);
          i=in.read();
        }
        in.close();
        String raetsel=strBuilder.toString();
        System.out.println(raetsel);
        
        raetsel=raetsel.toLowerCase();
        for(Entry<String, Integer> entry:puzzle_return.entrySet()){
          
          raetsel=raetsel.replace(entry.getKey(),entry.getValue().toString());
        }
        System.out.println(raetsel);
	}

}
