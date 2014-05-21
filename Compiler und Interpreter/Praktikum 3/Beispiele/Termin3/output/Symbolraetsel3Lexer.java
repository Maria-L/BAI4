// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g 2011-05-26 13:21:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Symbolraetsel3Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int PLUS_=4;
    public static final int PLUS=5;
    public static final int ERGEBNIS=6;
    public static final int MINUS=7;
    public static final int STRING=8;
    public static final int NEWLINE=9;

    // delegates
    // delegators

    public Symbolraetsel3Lexer() {;} 
    public Symbolraetsel3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Symbolraetsel3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g"; }

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:27:8: ( ( 'a' .. 'z' )+ )
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:27:10: ( 'a' .. 'z' )+
            {
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:27:10: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:27:11: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:28:6: ( '+' )
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:28:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:29:7: ( '-' )
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:30:9: ( '\\n' )
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:30:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ERGEBNIS"
    public final void mERGEBNIS() throws RecognitionException {
        try {
            int _type = ERGEBNIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:31:9: ( '=' )
            // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:31:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ERGEBNIS"

    public void mTokens() throws RecognitionException {
        // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:8: ( STRING | PLUS | MINUS | NEWLINE | ERGEBNIS )
        int alt2=5;
        switch ( input.LA(1) ) {
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
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '\n':
            {
            alt2=4;
            }
            break;
        case '=':
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
                // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:10: STRING
                {
                mSTRING(); 

                }
                break;
            case 2 :
                // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:17: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:22: MINUS
                {
                mMINUS(); 

                }
                break;
            case 4 :
                // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:28: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 5 :
                // /Users/Jana/Dropbox/HAW/Semester4/CI/Praktikum/Termin3/Symbolraetsel3.g:1:36: ERGEBNIS
                {
                mERGEBNIS(); 

                }
                break;

        }

    }


 

}