// $ANTLR 3.4 /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g 2013-05-28 10:47:19
package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PuzzleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int ADD=4;
    public static final int CALCULATION=5;
    public static final int COMMENT=6;
    public static final int ID=7;
    public static final int NEWLINE=8;
    public static final int OPERAND=9;
    public static final int OPERATION=10;
    public static final int SUB=11;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PuzzleLexer() {} 
    public PuzzleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PuzzleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:4:7: ( '=' )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:4:9: '='
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
    // $ANTLR end "T__12"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:43:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:
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

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:50:5: ( '+' )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:50:7: '+'
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
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:51:5: ( '-' )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:51:7: '-'
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:54:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:54:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:54:14: (~ ( '\\n' | '\\r' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:
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


                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:54:28: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:54:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                     skip(); 

                    }
                    break;
                case 2 :
                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:55:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:55:14: ( options {greedy=false; } : . )*
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
                    	    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:55:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match("*/"); 



                     skip(); 

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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:59:2: ( ( '\\r' )? '\\n' )
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:59:4: ( '\\r' )? '\\n'
            {
            // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:59:4: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:59:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:8: ( T__12 | ID | ADD | SUB | COMMENT | NEWLINE )
        int alt6=6;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt6=1;
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
            alt6=2;
            }
            break;
        case '+':
            {
            alt6=3;
            }
            break;
        case '-':
            {
            alt6=4;
            }
            break;
        case '/':
            {
            alt6=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt6=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:16: ID
                {
                mID(); 


                }
                break;
            case 3 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:19: ADD
                {
                mADD(); 


                }
                break;
            case 4 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:23: SUB
                {
                mSUB(); 


                }
                break;
            case 5 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:27: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // /Users/maiwald/Dropbox/Shared/Uni/BAI-1 Lerngruppe/B-AI4/CI/Aufgaben/SS2013/Team Jan und Luciano/aufgabe_3/Puzzle.g:1:35: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}