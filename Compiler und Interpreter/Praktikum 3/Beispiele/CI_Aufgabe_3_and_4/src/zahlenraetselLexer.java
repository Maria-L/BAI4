// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g 2013-07-03 18:26:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class zahlenraetselLexer extends Lexer {
	public static final int EOF=-1;
	public static final int GLEICH=4;
	public static final int NEWLINE=5;
	public static final int OPERATOR=6;
	public static final int STAT_END=7;
	public static final int STAT_START=8;
	public static final int WS=9;
	public static final int ZIFFERNBLOCK=10;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public zahlenraetselLexer() {} 
	public zahlenraetselLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public zahlenraetselLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g"; }

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:11:9: ( '+' | '-' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
	// $ANTLR end "OPERATOR"

	// $ANTLR start "GLEICH"
	public final void mGLEICH() throws RecognitionException {
		try {
			int _type = GLEICH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:12:7: ( '=' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:12:8: '='
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
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:13:11: ( '{' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:13:13: '{'
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
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:14:9: ( '}' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:14:11: '}'
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

	// $ANTLR start "ZIFFERNBLOCK"
	public final void mZIFFERNBLOCK() throws RecognitionException {
		try {
			int _type = ZIFFERNBLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:15:14: ( ( 'A' .. 'Z' )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:15:16: ( 'A' .. 'Z' )+
			{
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:15:16: ( 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:
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
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZIFFERNBLOCK"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:16:8: ( ( '\\r' )? '\\n' )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:16:9: ( '\\r' )? '\\n'
			{
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:16:9: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:16:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:17:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:17:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:17:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
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
		// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:8: ( OPERATOR | GLEICH | STAT_START | STAT_END | ZIFFERNBLOCK | NEWLINE | WS )
		int alt4=7;
		switch ( input.LA(1) ) {
		case '+':
		case '-':
			{
			alt4=1;
			}
			break;
		case '=':
			{
			alt4=2;
			}
			break;
		case '{':
			{
			alt4=3;
			}
			break;
		case '}':
			{
			alt4=4;
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
			alt4=5;
			}
			break;
		case '\r':
			{
			int LA4_6 = input.LA(2);
			if ( (LA4_6=='\n') ) {
				int LA4_7 = input.LA(3);
				if ( ((LA4_7 >= '\t' && LA4_7 <= '\n')||LA4_7=='\r'||LA4_7==' ') ) {
					alt4=7;
				}

				else {
					alt4=6;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case '\n':
			{
			int LA4_7 = input.LA(2);
			if ( ((LA4_7 >= '\t' && LA4_7 <= '\n')||LA4_7=='\r'||LA4_7==' ') ) {
				alt4=7;
			}

			else {
				alt4=6;
			}

			}
			break;
		case '\t':
		case ' ':
			{
			alt4=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:10: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 2 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:19: GLEICH
				{
				mGLEICH(); 

				}
				break;
			case 3 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:26: STAT_START
				{
				mSTAT_START(); 

				}
				break;
			case 4 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:37: STAT_END
				{
				mSTAT_END(); 

				}
				break;
			case 5 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:46: ZIFFERNBLOCK
				{
				mZIFFERNBLOCK(); 

				}
				break;
			case 6 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:59: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 7 :
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:1:67: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
