package zahlenraetsel.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import zahlenraetsel.generated.ZahlenRaetselEmitter;
import zahlenraetsel.generated.ZahlenraetselLexer;
import zahlenraetsel.generated.ZahlenraetselParser;
import zahlenraetsel.generated.ZahlenraetselTree;

public class MainClass {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		generateSolver("./src/zahlenraetsel/main/raetsel.txt",
		"zahlenraetsel.solver.Raetsel");
		generateSolver("./src/zahlenraetsel/main/raetsel2.txt",
				"zahlenraetsel.solver.Raetsel2");
	}
	
	public static void generateSolver(String pathToSourceFile, String pathforClass) throws IOException, RecognitionException{
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
		
		ZahlenRaetselEmitter emitter = new ZahlenRaetselEmitter(nodes2);
		InputStream templateIs =new FileInputStream("./src/zahlenraetsel/grammar/template.stg");
		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
			      AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		String packagePath=pathforClass.substring(0, pathforClass.lastIndexOf("."));
		String className=pathforClass.substring(pathforClass.lastIndexOf(".")+1, pathforClass.length());
		ZahlenRaetselEmitter.raetsel_return puzzle_return = emitter.raetsel(packagePath, className, pathToSourceFile);
		String output = puzzle_return.getTemplate().toString();
		
		System.out.println("\n ************* \n JavaClass zum Lösen des Zahlenrätsels\n ************* \n");
		System.out.println(output);
		
		File classFile=new File("./src/"+pathforClass.replace(".","/")+".java");
		
		FileWriter filewriter=new FileWriter(classFile ,false);
		filewriter.write(output);
		filewriter.flush();
		filewriter.close();
	}

}
