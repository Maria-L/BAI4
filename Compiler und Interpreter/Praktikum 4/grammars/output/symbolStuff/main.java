package symbolStuff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import antlr.RecognitionException;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		try {
			generateSolver("raetsel.txt",
			"zahlenraetsel.solver.Raetsel");
		} catch (org.antlr.runtime.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generateSolver(String pathToSourceFile, String pathforClass) throws IOException, RecognitionException, org.antlr.runtime.RecognitionException{
		ANTLRFileStream fileStream=new ANTLRFileStream(pathToSourceFile);
		
		symboleLexer lexer= new symboleLexer(fileStream);
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		symboleParser parser=new symboleParser(tokens);
		
		CommonTree treeAfterParsing=(CommonTree)parser.start().getTree();
		
		System.out.println("\n ************* \n Baum nach dem Parsen\n ************* \n ");
		System.out.println(treeAfterParsing.toStringTree());
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(treeAfterParsing);
		symbolTreeGrammar treeWalker = new symbolTreeGrammar(nodes);
		
		CommonTree treeAfterNormalization=(CommonTree) treeWalker.start().getTree();
		
		System.out.println("\n ************* \n Baum nach der Normalisierung \n ************* \n");
		System.out.println(treeAfterNormalization.toStringTree());
		
		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(treeAfterNormalization);
		nodes2.setTokenStream(tokens);
		
		symbolTreeEmitter emitter = new symbolTreeEmitter(nodes2);
		InputStream templateIs =new FileInputStream("./grammars/template.stg");
		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
			      AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		String packagePath=pathforClass.substring(0, pathforClass.lastIndexOf("."));
		String className=pathforClass.substring(pathforClass.lastIndexOf(".")+1, pathforClass.length());
		symbolTreeEmitter.start_return puzzle_return = emitter.start(packagePath, className, pathToSourceFile);
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
