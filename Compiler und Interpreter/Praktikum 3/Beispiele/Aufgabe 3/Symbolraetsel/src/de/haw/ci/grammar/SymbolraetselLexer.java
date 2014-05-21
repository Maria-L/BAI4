package de.haw.ci.grammar;

// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g 2013-05-14 15:30:34

import org.antlr.runtime.*;

public class SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int NUMBER=4;
    public static final int EQ=5;
    public static final int ADD=6;
    public static final int SUB=7;
    public static final int SYM=8;
    public static final int WS=9;

    // delegates
    // delegators

    public SymbolraetselLexer() {;} 
    public SymbolraetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g"; }

    // $ANTLR start "SYM"
    public final void mSYM() throws RecognitionException {
        try {
            int _type = SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:33:4: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYM"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:34:3: ( '=' )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:34:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:35:4: ( '+' )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:35:6: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:36:4: ( '-' )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:36:6: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:37:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:37:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:37:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:8: ( SYM | EQ | ADD | SUB | WS )
        int alt2=5;
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
            alt2=1;
            }
            break;
        case '=':
            {
            alt2=2;
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
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:10: SYM
                {
                mSYM(); 

                }
                break;
            case 2 :
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:14: EQ
                {
                mEQ(); 

                }
                break;
            case 3 :
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:17: ADD
                {
                mADD(); 

                }
                break;
            case 4 :
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:21: SUB
                {
                mSUB(); 

                }
                break;
            case 5 :
                // C:\\Users\\Erwin\\Desktop\\Aufgabe 2\\Symbolraetsel\\Symbolraetsel.g:1:25: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}