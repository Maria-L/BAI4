// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g 2013-07-03 18:26:17
 
package zahlenraetsel.generated;
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
@SuppressWarnings("all")
public class ZahlenRaetselEmitter extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "GLEICH", "MINUS", "NUMBER", "PLUS", 
		"RAETSEL", "STAT_END", "STAT_START", "SYMBOL", "WS"
	};
	public static final int EOF=-1;
	public static final int GLEICH=4;
	public static final int MINUS=5;
	public static final int NUMBER=6;
	public static final int PLUS=7;
	public static final int RAETSEL=8;
	public static final int STAT_END=9;
	public static final int STAT_START=10;
	public static final int SYMBOL=11;
	public static final int WS=12;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ZahlenRaetselEmitter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ZahlenRaetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("ZahlenRaetselEmitterTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return ZahlenRaetselEmitter.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g"; }


	public static class raetsel_return extends TreeRuleReturnScope {
		public Set<Character> letters;
		public Set<String> constraints;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "raetsel"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:17:1: raetsel[String packagePath, String className, String pathToPuzzleFile] returns [Set<Character> letters, Set<String> constraints] : ^( RAETSEL (eque= equ )+ ) -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile);
	public final ZahlenRaetselEmitter.raetsel_return raetsel(String packagePath, String className, String pathToPuzzleFile) throws RecognitionException {
		ZahlenRaetselEmitter.raetsel_return retval = new ZahlenRaetselEmitter.raetsel_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope eque =null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:17:130: ( ^( RAETSEL (eque= equ )+ ) -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile))
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:18:1: ^( RAETSEL (eque= equ )+ )
			{
			retval.letters =new HashSet<Character>(); 
			 retval.constraints =new HashSet<String>();

			match(input,RAETSEL,FOLLOW_RAETSEL_in_raetsel68); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:21:11: (eque= equ )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==GLEICH) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:21:12: eque= equ
					{
					pushFollow(FOLLOW_equ_in_raetsel73);
					eque=equ();
					state._fsp--;

					retval.letters.addAll((eque!=null?((ZahlenRaetselEmitter.equ_return)eque).letters:null));
					             retval.constraints.add((eque!=null?((StringTemplate)eque.getTemplate()):null).toString());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 25:8: -> sums(constraints=$constraintsletters=$letterspackage=$packagePathclassName=$classNamepathToPuzzleFile=$pathToPuzzleFile)
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
	// $ANTLR end "raetsel"


	public static class equ_return extends TreeRuleReturnScope {
		public Set<Character> letters;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "equ"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:27:1: equ returns [Set<Character> letters] : ^( GLEICH n1= number n2= number n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
	public final ZahlenRaetselEmitter.equ_return equ() throws RecognitionException {
		ZahlenRaetselEmitter.equ_return retval = new ZahlenRaetselEmitter.equ_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n1 =null;
		TreeRuleReturnScope n2 =null;
		TreeRuleReturnScope n3 =null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:33:2: ( ^( GLEICH n1= number n2= number n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:34:3: ^( GLEICH n1= number n2= number n3= number )
			{
			match(input,GLEICH,FOLLOW_GLEICH_in_equ149); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_number_in_equ153);
			n1=number();
			state._fsp--;

			pushFollow(FOLLOW_number_in_equ157);
			n2=number();
			state._fsp--;

			pushFollow(FOLLOW_number_in_equ161);
			n3=number();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 35:7: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
			{
				retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?((ZahlenRaetselEmitter.number_return)n1).number:null)).put("number2", (n2!=null?((ZahlenRaetselEmitter.number_return)n2).number:null)).put("number3", (n3!=null?((ZahlenRaetselEmitter.number_return)n3).number:null)));
			}



			}

			 
			retval.letters = new HashSet<Character>();
			retval.letters.addAll((n1!=null?((ZahlenRaetselEmitter.number_return)n1).number:null).getCharacters());
			retval.letters.addAll((n2!=null?((ZahlenRaetselEmitter.number_return)n2).number:null).getCharacters());
			retval.letters.addAll((n3!=null?((ZahlenRaetselEmitter.number_return)n3).number:null).getCharacters());

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
	// $ANTLR end "equ"


	public static class number_return extends TreeRuleReturnScope {
		public Number number;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "number"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:37:1: number returns [Number number] : ^( NUMBER (syms+= SYMBOL )+ ) ;
	public final ZahlenRaetselEmitter.number_return number() throws RecognitionException {
		ZahlenRaetselEmitter.number_return retval = new ZahlenRaetselEmitter.number_return();
		retval.start = input.LT(1);

		CommonTree syms=null;
		List<Object> list_syms=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:42:2: ( ^( NUMBER (syms+= SYMBOL )+ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:42:2: ^( NUMBER (syms+= SYMBOL )+ )
			{
			match(input,NUMBER,FOLLOW_NUMBER_in_number199); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:42:15: (syms+= SYMBOL )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==SYMBOL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselEmitter.g:42:15: syms+= SYMBOL
					{
					syms=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number203); 
					if (list_syms==null) list_syms=new ArrayList<Object>();
					list_syms.add(syms);
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 

			}

			 
			retval.number = new Number();
			retval.number.setDigits(list_syms);

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



	public static final BitSet FOLLOW_RAETSEL_in_raetsel68 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_equ_in_raetsel73 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_GLEICH_in_equ149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_number_in_equ153 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ157 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ161 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_number199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SYMBOL_in_number203 = new BitSet(new long[]{0x0000000000000808L});
}
