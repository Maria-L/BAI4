// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g 2013-07-03 18:26:19
 
package zahlenraetsel.generated;
import java.util.Map;
import java.util.HashMap;
import zahlenraetsel.main.DirectSolver;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ZahlenRaetselDirectSolver extends TreeParser {
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


	public ZahlenRaetselDirectSolver(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ZahlenRaetselDirectSolver(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ZahlenRaetselDirectSolver.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g"; }



	// $ANTLR start "raetsel"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:16:1: raetsel returns [ Map<String, Integer> ergebnis] : ^( RAETSEL ( equ[directSolver] )+ ) ;
	public final Map<String, Integer> raetsel() throws RecognitionException {
		Map<String, Integer> ergebnis = null;


		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:16:50: ( ^( RAETSEL ( equ[directSolver] )+ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:17:1: ^( RAETSEL ( equ[directSolver] )+ )
			{

			DirectSolver directSolver=new DirectSolver();

			match(input,RAETSEL,FOLLOW_RAETSEL_in_raetsel58); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:20:11: ( equ[directSolver] )+
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
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:20:12: equ[directSolver]
					{
					pushFollow(FOLLOW_equ_in_raetsel61);
					equ(directSolver);
					state._fsp--;

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

			 
			ergebnis =directSolver.solve();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ergebnis;
	}
	// $ANTLR end "raetsel"



	// $ANTLR start "equ"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:23:1: equ[DirectSolver directSolver] : ^( GLEICH n1= number n2= number n3= number ) ;
	public final void equ(DirectSolver directSolver) throws RecognitionException {
		Number n1 =null;
		Number n2 =null;
		Number n3 =null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:26:2: ( ^( GLEICH n1= number n2= number n3= number ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:27:3: ^( GLEICH n1= number n2= number n3= number )
			{
			match(input,GLEICH,FOLLOW_GLEICH_in_equ80); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_number_in_equ84);
			n1=number();
			state._fsp--;

			pushFollow(FOLLOW_number_in_equ88);
			n2=number();
			state._fsp--;

			pushFollow(FOLLOW_number_in_equ92);
			n3=number();
			state._fsp--;

			match(input, Token.UP, null); 

			}

			 
			directSolver.addConstraint(n1.getCharacters(), n2.getCharacters(), n3.getCharacters());

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "equ"



	// $ANTLR start "number"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:29:1: number returns [Number number] : ^( NUMBER (syms+= SYMBOL )+ ) ;
	public final Number number() throws RecognitionException {
		Number number = null;


		CommonTree syms=null;
		List<Object> list_syms=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:34:2: ( ^( NUMBER (syms+= SYMBOL )+ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:34:2: ^( NUMBER (syms+= SYMBOL )+ )
			{
			match(input,NUMBER,FOLLOW_NUMBER_in_number111); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:34:15: (syms+= SYMBOL )+
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
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenRaetselDirectSolver.g:34:15: syms+= SYMBOL
					{
					syms=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number115); 
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

			 
			number = new Number();
			number.setDigits(list_syms);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return number;
	}
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_RAETSEL_in_raetsel58 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_equ_in_raetsel61 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_GLEICH_in_equ80 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_number_in_equ84 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ88 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ92 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_number111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SYMBOL_in_number115 = new BitSet(new long[]{0x0000000000000808L});
}
