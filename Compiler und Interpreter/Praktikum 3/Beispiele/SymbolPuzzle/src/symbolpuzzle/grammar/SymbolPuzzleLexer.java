// $ANTLR 3.4 C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g 2013-05-13 22:09:37
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolPuzzleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK_COMMENT=5;
    public static final int EQUALS=6;
    public static final int LINE_COMMENT=7;
    public static final int NEWLINE=8;
    public static final int NUMBER=9;
    public static final int PUZZLE=10;
    public static final int SUB=11;
    public static final int SYMBOL=12;
    public static final int WS=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolPuzzleLexer() {} 
    public SymbolPuzzleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolPuzzleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g"; }

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:43:5: ( '+' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:43:7: '+'
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
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:45:5: ( '-' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:45:7: '-'
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
    // $ANTLR end "SUB"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:47:8: ( '=' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:47:10: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:49:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:51:4: ( ( ' ' | '\\t' ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:51:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:9: ( ( ( '\\r' )? '\\n' ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:11: ( ( '\\r' )? '\\n' )
            {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:11: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:12: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:12: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:53:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "BLOCK_COMMENT"
    public final void mBLOCK_COMMENT() throws RecognitionException {
        try {
            int _type = BLOCK_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:55:15: ( '/*' ( . )* '*/' )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:55:17: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:55:22: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:55:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK_COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:14: ( ( '//' | '#' ) ( (~ ( '\\r' | '\\n' ) )* ) )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:16: ( '//' | '#' ) ( (~ ( '\\r' | '\\n' ) )* )
            {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:16: ( '//' | '#' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='/') ) {
                alt3=1;
            }
            else if ( (LA3_0=='#') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:17: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:24: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:29: ( (~ ( '\\r' | '\\n' ) )* )
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:30: (~ ( '\\r' | '\\n' ) )*
            {
            // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:57:30: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:8: ( ADD | SUB | EQUALS | SYMBOL | WS | NEWLINE | BLOCK_COMMENT | LINE_COMMENT )
        int alt5=8;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt5=1;
            }
            break;
        case '-':
            {
            alt5=2;
            }
            break;
        case '=':
            {
            alt5=3;
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
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=4;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=6;
            }
            break;
        case '/':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='*') ) {
                alt5=7;
            }
            else if ( (LA5_7=='/') ) {
                alt5=8;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 7, input);

                throw nvae;

            }
            }
            break;
        case '#':
            {
            alt5=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:10: ADD
                {
                mADD(); 


                }
                break;
            case 2 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:14: SUB
                {
                mSUB(); 


                }
                break;
            case 3 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:18: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 4 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:25: SYMBOL
                {
                mSYMBOL(); 


                }
                break;
            case 5 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:32: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:35: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 7 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:43: BLOCK_COMMENT
                {
                mBLOCK_COMMENT(); 


                }
                break;
            case 8 :
                // C:\\Users\\Eike-Christian\\Dropbox\\Studium\\Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Andreas und Christian\\Aufgabe 3\\SymbolPuzzle\\src\\symbolpuzzle\\grammar\\SymbolPuzzle.g:1:57: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


 

}