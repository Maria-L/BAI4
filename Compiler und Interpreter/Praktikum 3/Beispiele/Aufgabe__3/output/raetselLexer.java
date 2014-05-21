// $ANTLR 3.4 /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g 2013-06-04 08:57:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class raetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK=5;
    public static final int EQS=6;
    public static final int ID=7;
    public static final int RAETSEL=8;
    public static final int SUB=9;
    public static final int WS=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public raetselLexer() {} 
    public raetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public raetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:47:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:49:6: ( ( ID )+ )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:49:13: ( ID )+
            {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:49:13: ( ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:
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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:51:4: ( ( '+' ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:51:13: ( '+' )
            {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:51:13: ( '+' )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:51:14: '+'
            {
            match('+'); 

            }


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
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:52:4: ( ( '-' ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:52:13: ( '-' )
            {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:52:13: ( '-' )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:52:14: '-'
            {
            match('-'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "EQS"
    public final void mEQS() throws RecognitionException {
        try {
            int _type = EQS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:53:4: ( ( '=' ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:53:13: ( '=' )
            {
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:53:13: ( '=' )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:53:14: '='
            {
            match('='); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:55:3: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:55:13: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

    public void mTokens() throws RecognitionException {
        // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:8: ( ID | BLOCK | ADD | SUB | EQS | WS )
        int alt2=6;
        switch ( input.LA(1) ) {
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
            int LA2_1 = input.LA(2);

            if ( ((LA2_1 >= 'A' && LA2_1 <= 'Z')||(LA2_1 >= 'a' && LA2_1 <= 'z')) ) {
                alt2=2;
            }
            else {
                alt2=1;
            }
            }
            break;
        case '+':
            {
            alt2=3;
            }
            break;
        case '-':
            {
            alt2=4;
            }
            break;
        case '=':
            {
            alt2=5;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:13: BLOCK
                {
                mBLOCK(); 


                }
                break;
            case 3 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:19: ADD
                {
                mADD(); 


                }
                break;
            case 4 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:23: SUB
                {
                mSUB(); 


                }
                break;
            case 5 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:27: EQS
                {
                mEQS(); 


                }
                break;
            case 6 :
                // /Users/r3l4x/Dropbox/__AKTUELLES/Geteilte Ordner/BAI Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Thorsten und Bjoern/Aufgabe 3/raetsel.g:1:31: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}