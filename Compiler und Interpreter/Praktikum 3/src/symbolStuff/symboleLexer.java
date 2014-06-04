// $ANTLR 3.4 Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g 2014-06-02 10:21:55
package symbolStuff;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class symboleLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public symboleLexer() {} 
    public symboleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public symboleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g"; }

    // $ANTLR start "BCHAR"
    public final void mBCHAR() throws RecognitionException {
        try {
            int _type = BCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:45:7: ( ( 'A' .. 'Z' ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:
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
    // $ANTLR end "BCHAR"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:51:5: ( '+' )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:51:7: '+'
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
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:54:5: ( '-' )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:54:7: '-'
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

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:57:4: ( '\\n' )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:57:6: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:60:4: ( '=' )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:60:6: '='
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
    // $ANTLR end "EQ"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:66:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='/') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='/') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='*') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:66:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:66:14: (~ ( '\\n' | '\\r' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:
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
                    	    break loop1;
                        }
                    } while (true);


                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:66:28: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:66:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:67:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:67:14: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='*') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='/') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:67:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:70:5: ( ( ' ' | '\\t' | '\\r' ) )
            // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:70:9: ( ' ' | '\\t' | '\\r' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
        // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:8: ( BCHAR | ADD | SUB | NL | EQ | COMMENT | WS )
        int alt5=7;
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
            {
            alt5=1;
            }
            break;
        case '+':
            {
            alt5=2;
            }
            break;
        case '-':
            {
            alt5=3;
            }
            break;
        case '\n':
            {
            alt5=4;
            }
            break;
        case '=':
            {
            alt5=5;
            }
            break;
        case '/':
            {
            alt5=6;
            }
            break;
        case '\t':
        case '\r':
        case ' ':
            {
            alt5=7;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:10: BCHAR
                {
                mBCHAR(); 


                }
                break;
            case 2 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:16: ADD
                {
                mADD(); 


                }
                break;
            case 3 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:20: SUB
                {
                mSUB(); 


                }
                break;
            case 4 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:24: NL
                {
                mNL(); 


                }
                break;
            case 5 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:27: EQ
                {
                mEQ(); 


                }
                break;
            case 6 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:30: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 7 :
                // Z:\\Projekte\\BAI4\\Compiler und Interpreter\\Praktikum 2\\symbole.g:1:38: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}