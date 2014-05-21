// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g 2013-07-03 18:26:18
package zahlenraetsel.generated;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ZahlenraetselLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ZahlenraetselLexer() {} 
	public ZahlenraetselLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ZahlenraetselLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g"; }

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:31:6: ( '-' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:31:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:32:5: ( '+' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:32:6: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "GLEICH"
	public final void mGLEICH() throws RecognitionException {
		try {
			int _type = GLEICH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:33:7: ( '=' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:33:8: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GLEICH"

	// $ANTLR start "STAT_START"
	public final void mSTAT_START() throws RecognitionException {
		try {
			int _type = STAT_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:34:11: ( '{' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:34:13: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAT_START"

	// $ANTLR start "STAT_END"
	public final void mSTAT_END() throws RecognitionException {
		try {
			int _type = STAT_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:35:9: ( '}' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:35:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAT_END"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:37:7: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:38:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:38:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:38:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:8: ( MINUS | PLUS | GLEICH | STAT_START | STAT_END | SYMBOL | WS )
		int alt2=7;
		switch ( input.LA(1) ) {
		case '-':
			{
			alt2=1;
			}
			break;
		case '+':
			{
			alt2=2;
			}
			break;
		case '=':
			{
			alt2=3;
			}
			break;
		case '{':
			{
			alt2=4;
			}
			break;
		case '}':
			{
			alt2=5;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			{
			alt2=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt2=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:10: MINUS
				{
				mMINUS(); 

				}
				break;
			case 2 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:16: PLUS
				{
				mPLUS(); 

				}
				break;
			case 3 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:21: GLEICH
				{
				mGLEICH(); 

				}
				break;
			case 4 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:28: STAT_START
				{
				mSTAT_START(); 

				}
				break;
			case 5 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:39: STAT_END
				{
				mSTAT_END(); 

				}
				break;
			case 6 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:48: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 7 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:1:55: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
