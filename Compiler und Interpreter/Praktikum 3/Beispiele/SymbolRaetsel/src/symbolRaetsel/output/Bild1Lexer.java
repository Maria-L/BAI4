// $ANTLR 3.4 D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g 2013-05-20 15:09:04
package symbolRaetsel.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Bild1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQUALS=5;
    public static final int PUZZLE=6;
    public static final int SUB=7;
    public static final int WS=8;
    public static final int ZAHL=9;
    public static final int ZIFFER=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Bild1Lexer() {} 
    public Bild1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Bild1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g"; }

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:38:5: ( '+' )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:38:7: '+'
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
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:39:5: ( '-' )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:39:7: '-'
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
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:40:9: ( '=' )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:40:11: '='
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

    // $ANTLR start "ZIFFER"
    public final void mZIFFER() throws RecognitionException {
        try {
            int _type = ZIFFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:41:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:
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
    // $ANTLR end "ZIFFER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:45:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:45:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:8: ( ADD | SUB | EQUALS | ZIFFER | WS )
        int alt1=5;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt1=1;
            }
            break;
        case '-':
            {
            alt1=2;
            }
            break;
        case '=':
            {
            alt1=3;
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
            alt1=4;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:10: ADD
                {
                mADD(); 


                }
                break;
            case 2 :
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:14: SUB
                {
                mSUB(); 


                }
                break;
            case 3 :
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:18: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 4 :
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:25: ZIFFER
                {
                mZIFFER(); 


                }
                break;
            case 5 :
                // D:\\Dropbox\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Jonny und Loki\\SymbolRaetsel\\src\\symbolRaetsel\\Bild1.g:1:32: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}