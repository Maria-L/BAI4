// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g 2014-06-19 15:22:41

	package symbolStuff;
	import java.util.Set;
	import java.util.HashSet;
	import java.lang.Character;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolTreeEmitter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BCHAR", "COLUMN", "COMMENT", "EQ", "LINE", "NL", "SIGN", "START", "SUB", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BCHAR=5;
    public static final int COLUMN=6;
    public static final int COMMENT=7;
    public static final int EQ=8;
    public static final int LINE=9;
    public static final int NL=10;
    public static final int SIGN=11;
    public static final int START=12;
    public static final int SUB=13;
    public static final int WS=14;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public symbolTreeEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolTreeEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("symbolTreeEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return symbolTreeEmitter.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g"; }


    public static class start_return extends TreeRuleReturnScope {
        public Set<Character> letters;
        public Set<String> constraints;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "start"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:17:1: start[String packagePath, String className, String pathToPuzzleFile] returns [Set<Character> letters, Set<String> constraints] :ln1= line ln2= line ln3= line cl1= column cl2= column cl3= column -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile);
    public final symbolTreeEmitter.start_return start(String packagePath, String className, String pathToPuzzleFile) throws RecognitionException {
        symbolTreeEmitter.start_return retval = new symbolTreeEmitter.start_return();
        retval.start = input.LT(1);


        symbolTreeEmitter.line_return ln1 =null;

        symbolTreeEmitter.line_return ln2 =null;

        symbolTreeEmitter.line_return ln3 =null;

        symbolTreeEmitter.column_return cl1 =null;

        symbolTreeEmitter.column_return cl2 =null;

        symbolTreeEmitter.column_return cl3 =null;


        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:19:2: (ln1= line ln2= line ln3= line cl1= column cl2= column cl3= column -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile))
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:20:2: ln1= line ln2= line ln3= line cl1= column cl2= column cl3= column
            {

            		retval.letters = new HashSet<Character>();
            		retval.constraints = new HashSet<String>();
            	

            pushFollow(FOLLOW_line_in_start69);
            ln1=line();

            state._fsp--;


            pushFollow(FOLLOW_line_in_start73);
            ln2=line();

            state._fsp--;


            pushFollow(FOLLOW_line_in_start77);
            ln3=line();

            state._fsp--;


            pushFollow(FOLLOW_column_in_start81);
            cl1=column();

            state._fsp--;


            pushFollow(FOLLOW_column_in_start85);
            cl2=column();

            state._fsp--;


            pushFollow(FOLLOW_column_in_start89);
            cl3=column();

            state._fsp--;



            		retval.letters.addAll((ln1!=null?ln1.letters:null));
            		retval.letters.addAll((ln2!=null?ln2.letters:null));
            		retval.letters.addAll((ln3!=null?ln3.letters:null));
            		retval.letters.addAll((cl1!=null?cl1.letters:null));
            		retval.letters.addAll((cl2!=null?cl2.letters:null));
            		retval.letters.addAll((cl3!=null?cl3.letters:null));

            		retval.constraints.add((ln1!=null?ln1.st:null).toString());
            		retval.constraints.add((ln2!=null?ln2.st:null).toString());
            		retval.constraints.add((ln3!=null?ln3.st:null).toString());
            		retval.constraints.add((cl1!=null?cl1.st:null).toString());
            		retval.constraints.add((cl2!=null?cl2.st:null).toString());
            		retval.constraints.add((cl3!=null?cl3.st:null).toString());
            		
            		System.out.println((ln1!=null?ln1.st:null).toString());
            		System.out.println((ln2!=null?ln2.st:null).toString());
            		System.out.println((ln3!=null?ln3.st:null).toString());
            		System.out.println((cl1!=null?cl1.st:null).toString());
            		System.out.println((cl2!=null?cl2.st:null).toString());
            		System.out.println((cl3!=null?cl3.st:null).toString());
            		
            		System.out.println((ln1!=null?ln1.letters:null).toString());
            		System.out.println((ln2!=null?ln2.letters:null).toString());
            		System.out.println((ln3!=null?ln3.letters:null).toString());
            		System.out.println((cl1!=null?cl1.letters:null).toString());
            		System.out.println((cl2!=null?cl2.letters:null).toString());
            		System.out.println((cl3!=null?cl3.letters:null).toString());
            		
            		System.out.println("---- constraints ----");
            		for(String st : retval.constraints) {
            			System.out.println(st);
            		}
            	

            // TEMPLATE REWRITE
            // 59:2: -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("constraints", retval.constraints).put("letters", retval.letters).put("package", packagePath).put("className", className).put("pathToPuzzleFile", pathToPuzzleFile));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class line_return extends TreeRuleReturnScope {
        public Set<Character> letters;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "line"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:63:1: line returns [Set<Character> letters] : ^( LINE n1= number ADD n2= number EQ n3= number ) -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number);
    public final symbolTreeEmitter.line_return line() throws RecognitionException {
        symbolTreeEmitter.line_return retval = new symbolTreeEmitter.line_return();
        retval.start = input.LT(1);


        symbolTreeEmitter.number_return n1 =null;

        symbolTreeEmitter.number_return n2 =null;

        symbolTreeEmitter.number_return n3 =null;


        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:70:2: ( ^( LINE n1= number ADD n2= number EQ n3= number ) -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number))
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:70:4: ^( LINE n1= number ADD n2= number EQ n3= number )
            {
            match(input,LINE,FOLLOW_LINE_in_line146); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_line150);
            n1=number();

            state._fsp--;


            match(input,ADD,FOLLOW_ADD_in_line152); 

            pushFollow(FOLLOW_number_in_line156);
            n2=number();

            state._fsp--;


            match(input,EQ,FOLLOW_EQ_in_line158); 

            pushFollow(FOLLOW_number_in_line162);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 71:2: -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("num1", (n1!=null?n1.number:null)).put("num2", (n2!=null?n2.number:null)).put("num3", (n3!=null?n3.number:null)));
            }



            }


            		retval.letters = new HashSet<Character>();
            		retval.letters.addAll((n1!=null?n1.number:null).getCharacters());
            		retval.letters.addAll((n2!=null?n2.number:null).getCharacters());
            		retval.letters.addAll((n3!=null?n3.number:null).getCharacters());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line"


    public static class column_return extends TreeRuleReturnScope {
        public Set<Character> letters;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "column"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:75:1: column returns [Set<Character> letters] : ^( COLUMN n1= number ADD n2= number EQ n3= number ) -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number);
    public final symbolTreeEmitter.column_return column() throws RecognitionException {
        symbolTreeEmitter.column_return retval = new symbolTreeEmitter.column_return();
        retval.start = input.LT(1);


        symbolTreeEmitter.number_return n1 =null;

        symbolTreeEmitter.number_return n2 =null;

        symbolTreeEmitter.number_return n3 =null;


        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:82:2: ( ^( COLUMN n1= number ADD n2= number EQ n3= number ) -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number))
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:82:4: ^( COLUMN n1= number ADD n2= number EQ n3= number )
            {
            match(input,COLUMN,FOLLOW_COLUMN_in_column205); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_column209);
            n1=number();

            state._fsp--;


            match(input,ADD,FOLLOW_ADD_in_column211); 

            pushFollow(FOLLOW_number_in_column215);
            n2=number();

            state._fsp--;


            match(input,EQ,FOLLOW_EQ_in_column217); 

            pushFollow(FOLLOW_number_in_column221);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 83:2: -> sum(num1=$n1.numbernum2=$n2.numbernum3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("num1", (n1!=null?n1.number:null)).put("num2", (n2!=null?n2.number:null)).put("num3", (n3!=null?n3.number:null)));
            }



            }


            		retval.letters = new HashSet<Character>();
            		retval.letters.addAll((n1!=null?n1.number:null).getCharacters());
            		retval.letters.addAll((n2!=null?n2.number:null).getCharacters());
            		retval.letters.addAll((n3!=null?n3.number:null).getCharacters());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:86:1: number returns [Number number] : ^( SIGN (signs+= BCHAR )+ ) ;
    public final symbolTreeEmitter.number_return number() throws RecognitionException {
        symbolTreeEmitter.number_return retval = new symbolTreeEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree signs=null;
        List list_signs=null;

        try {
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:91:2: ( ^( SIGN (signs+= BCHAR )+ ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:91:4: ^( SIGN (signs+= BCHAR )+ )
            {
            match(input,SIGN,FOLLOW_SIGN_in_number264); 

            match(input, Token.DOWN, null); 
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:91:16: (signs+= BCHAR )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BCHAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 4\\grammars\\symbolTreeEmitter.g:91:16: signs+= BCHAR
            	    {
            	    signs=(CommonTree)match(input,BCHAR,FOLLOW_BCHAR_in_number268); 
            	    if (list_signs==null) list_signs=new ArrayList();
            	    list_signs.add(signs);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            }


            	retval.number = new Number();
            	retval.number.setDigits(list_signs);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_start69 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start73 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_line_in_start77 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_line146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_line150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_line152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_number_in_line156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_line158 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_number_in_line162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_column205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_column209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADD_in_column211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_number_in_column215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_column217 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_number_in_column221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGN_in_number264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BCHAR_in_number268 = new BitSet(new long[]{0x0000000000000028L});

}