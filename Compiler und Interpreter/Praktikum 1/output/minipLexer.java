// $ANTLR 3.4 E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g 2014-04-13 10:20:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class minipLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int BOOLEAN=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INTEGER=11;
    public static final int K_BEGIN=12;
    public static final int K_BOOLEAN=13;
    public static final int K_DO=14;
    public static final int K_ELSE=15;
    public static final int K_END=16;
    public static final int K_FI=17;
    public static final int K_IF=18;
    public static final int K_INTEGER=19;
    public static final int K_OD=20;
    public static final int K_PRINTLN=21;
    public static final int K_PROGRAM=22;
    public static final int K_READ=23;
    public static final int K_REAL=24;
    public static final int K_SEM=25;
    public static final int K_STRING=26;
    public static final int K_THEN=27;
    public static final int K_WHILE=28;
    public static final int OCTAL_ESC=29;
    public static final int OP_LOGICAL=30;
    public static final int OP_PRAEDICATE=31;
    public static final int REAL=32;
    public static final int STRING=33;
    public static final int UNICODE_ESC=34;
    public static final int WS=35;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public minipLexer() {} 
    public minipLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public minipLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:2:7: ( '(' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:7: ( ')' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:4:7: ( '*' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:5:7: ( '+' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:5:9: '+'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:6:7: ( ',' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:7: ( '-' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:7:9: '-'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:8:7: ( '/' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:8:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:9:7: ( ':=' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:9:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "K_PROGRAM"
    public final void mK_PROGRAM() throws RecognitionException {
        try {
            int _type = K_PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:114:2: ( 'program' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:114:4: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PROGRAM"

    // $ANTLR start "K_BEGIN"
    public final void mK_BEGIN() throws RecognitionException {
        try {
            int _type = K_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:117:9: ( 'begin' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:117:11: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_BEGIN"

    // $ANTLR start "K_END"
    public final void mK_END() throws RecognitionException {
        try {
            int _type = K_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:120:7: ( 'end' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:120:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_END"

    // $ANTLR start "K_INTEGER"
    public final void mK_INTEGER() throws RecognitionException {
        try {
            int _type = K_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:124:2: ( 'integer' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:124:4: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_INTEGER"

    // $ANTLR start "K_REAL"
    public final void mK_REAL() throws RecognitionException {
        try {
            int _type = K_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:127:8: ( 'real' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:127:10: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_REAL"

    // $ANTLR start "K_STRING"
    public final void mK_STRING() throws RecognitionException {
        try {
            int _type = K_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:130:9: ( 'string' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:130:11: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_STRING"

    // $ANTLR start "K_BOOLEAN"
    public final void mK_BOOLEAN() throws RecognitionException {
        try {
            int _type = K_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:134:2: ( 'boolean' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:134:4: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_BOOLEAN"

    // $ANTLR start "K_READ"
    public final void mK_READ() throws RecognitionException {
        try {
            int _type = K_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:137:8: ( 'read' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:137:10: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_READ"

    // $ANTLR start "K_PRINTLN"
    public final void mK_PRINTLN() throws RecognitionException {
        try {
            int _type = K_PRINTLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:141:2: ( 'println' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:141:4: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_PRINTLN"

    // $ANTLR start "K_IF"
    public final void mK_IF() throws RecognitionException {
        try {
            int _type = K_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:144:6: ( 'if' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:144:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_IF"

    // $ANTLR start "K_THEN"
    public final void mK_THEN() throws RecognitionException {
        try {
            int _type = K_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:147:8: ( 'then' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:147:10: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_THEN"

    // $ANTLR start "K_ELSE"
    public final void mK_ELSE() throws RecognitionException {
        try {
            int _type = K_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:150:8: ( 'else' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:150:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_ELSE"

    // $ANTLR start "K_FI"
    public final void mK_FI() throws RecognitionException {
        try {
            int _type = K_FI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:153:6: ( 'fi' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:153:8: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_FI"

    // $ANTLR start "K_WHILE"
    public final void mK_WHILE() throws RecognitionException {
        try {
            int _type = K_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:156:9: ( 'while' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:156:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_WHILE"

    // $ANTLR start "K_DO"
    public final void mK_DO() throws RecognitionException {
        try {
            int _type = K_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:159:6: ( 'do' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:159:8: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_DO"

    // $ANTLR start "K_OD"
    public final void mK_OD() throws RecognitionException {
        try {
            int _type = K_OD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:162:6: ( 'od' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:162:8: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_OD"

    // $ANTLR start "K_SEM"
    public final void mK_SEM() throws RecognitionException {
        try {
            int _type = K_SEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:165:7: ( ';' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:165:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_SEM"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:168:9: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:168:11: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:168:20: 'false'
                    {
                    match("false"); 



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
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "OP_PRAEDICATE"
    public final void mOP_PRAEDICATE() throws RecognitionException {
        try {
            int _type = OP_PRAEDICATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:2: ( '=' | '<' | '>' | '!=' | '<>' | '>=' | '<=' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt2=5;
                    }
                    break;
                case '=':
                    {
                    alt2=7;
                    }
                    break;
                default:
                    alt2=2;
                }

                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=3;
                }
                }
                break;
            case '!':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:7: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:12: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:20: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 5 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:25: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 6 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:30: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 7 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:172:35: '<='
                    {
                    match("<="); 



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
    // $ANTLR end "OP_PRAEDICATE"

    // $ANTLR start "OP_LOGICAL"
    public final void mOP_LOGICAL() throws RecognitionException {
        try {
            int _type = OP_LOGICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:176:2: ( '&&' | '||' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='&') ) {
                alt3=1;
            }
            else if ( (LA3_0=='|') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:176:4: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:176:11: '||'
                    {
                    match("||"); 



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
    // $ANTLR end "OP_LOGICAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:179:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:179:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:179:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:183:2: ( ( '0' .. '9' )+ )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:183:4: ( '0' .. '9' )+
            {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:183:4: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:6: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:10: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('.'); 

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:26: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    break loop7;
                        }
                    } while (true);


                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:38: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:187:38: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:188:10: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:188:14: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:188:26: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:188:26: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:189:10: ( '0' .. '9' )+ EXPONENT
                    {
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:189:10: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mEXPONENT(); 


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
    // $ANTLR end "REAL"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:193:6: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:193:8: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:193:13: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:193:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:196:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:196:10: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:204:6: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:204:9: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:204:13: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:204:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:204:25: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop14;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:207:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:207:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:207:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:207:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:207:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:212:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:212:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:212:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
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
                    break;

            }


            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:212:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:215:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:219:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:219:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:220:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:221:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:226:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:226:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:227:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:228:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:233:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:233:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | K_PROGRAM | K_BEGIN | K_END | K_INTEGER | K_REAL | K_STRING | K_BOOLEAN | K_READ | K_PRINTLN | K_IF | K_THEN | K_ELSE | K_FI | K_WHILE | K_DO | K_OD | K_SEM | BOOLEAN | OP_PRAEDICATE | OP_LOGICAL | ID | INTEGER | REAL | COMMENT | WS | STRING | CHAR )
        int alt20=35;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:10: T__36
                {
                mT__36(); 


                }
                break;
            case 2 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:16: T__37
                {
                mT__37(); 


                }
                break;
            case 3 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:22: T__38
                {
                mT__38(); 


                }
                break;
            case 4 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:28: T__39
                {
                mT__39(); 


                }
                break;
            case 5 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:34: T__40
                {
                mT__40(); 


                }
                break;
            case 6 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:40: T__41
                {
                mT__41(); 


                }
                break;
            case 7 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:46: T__42
                {
                mT__42(); 


                }
                break;
            case 8 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:52: T__43
                {
                mT__43(); 


                }
                break;
            case 9 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:58: K_PROGRAM
                {
                mK_PROGRAM(); 


                }
                break;
            case 10 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:68: K_BEGIN
                {
                mK_BEGIN(); 


                }
                break;
            case 11 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:76: K_END
                {
                mK_END(); 


                }
                break;
            case 12 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:82: K_INTEGER
                {
                mK_INTEGER(); 


                }
                break;
            case 13 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:92: K_REAL
                {
                mK_REAL(); 


                }
                break;
            case 14 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:99: K_STRING
                {
                mK_STRING(); 


                }
                break;
            case 15 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:108: K_BOOLEAN
                {
                mK_BOOLEAN(); 


                }
                break;
            case 16 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:118: K_READ
                {
                mK_READ(); 


                }
                break;
            case 17 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:125: K_PRINTLN
                {
                mK_PRINTLN(); 


                }
                break;
            case 18 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:135: K_IF
                {
                mK_IF(); 


                }
                break;
            case 19 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:140: K_THEN
                {
                mK_THEN(); 


                }
                break;
            case 20 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:147: K_ELSE
                {
                mK_ELSE(); 


                }
                break;
            case 21 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:154: K_FI
                {
                mK_FI(); 


                }
                break;
            case 22 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:159: K_WHILE
                {
                mK_WHILE(); 


                }
                break;
            case 23 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:167: K_DO
                {
                mK_DO(); 


                }
                break;
            case 24 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:172: K_OD
                {
                mK_OD(); 


                }
                break;
            case 25 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:177: K_SEM
                {
                mK_SEM(); 


                }
                break;
            case 26 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:183: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 27 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:191: OP_PRAEDICATE
                {
                mOP_PRAEDICATE(); 


                }
                break;
            case 28 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:205: OP_LOGICAL
                {
                mOP_LOGICAL(); 


                }
                break;
            case 29 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:216: ID
                {
                mID(); 


                }
                break;
            case 30 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:219: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 31 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:227: REAL
                {
                mREAL(); 


                }
                break;
            case 32 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:232: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 33 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:240: WS
                {
                mWS(); 


                }
                break;
            case 34 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:243: STRING
                {
                mSTRING(); 


                }
                break;
            case 35 :
                // E:\\GitDaten\\BAI4\\Compiler und Interpreter\\Praktikum 1\\minip.g:1:250: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\2\56\3\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "186:1: REAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\7\uffff\1\36\1\uffff\13\27\4\uffff\1\57\6\uffff\6\27\1\67\4\27"+
        "\1\74\2\27\1\77\1\100\1\uffff\4\27\1\105\2\27\1\uffff\4\27\1\uffff"+
        "\2\27\2\uffff\4\27\1\uffff\1\123\1\27\1\125\1\126\1\27\1\130\1\131"+
        "\4\27\1\136\1\27\1\uffff\1\27\2\uffff\1\27\2\uffff\1\131\1\142\2"+
        "\27\1\uffff\2\27\1\147\1\uffff\1\150\1\151\1\152\1\153\5\uffff";
    static final String DFA20_eofS =
        "\154\uffff";
    static final String DFA20_minS =
        "\1\11\6\uffff\1\52\1\uffff\1\162\1\145\1\154\1\146\1\145\1\164\1"+
        "\150\1\141\1\150\1\157\1\144\4\uffff\1\56\6\uffff\1\151\1\147\1"+
        "\157\1\144\1\163\1\164\1\60\1\141\1\162\1\145\1\165\1\60\1\154\1"+
        "\151\2\60\1\uffff\1\147\1\156\1\151\1\154\1\60\2\145\1\uffff\1\144"+
        "\1\151\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\162\1\164\1\156"+
        "\1\145\1\uffff\1\60\1\147\2\60\1\156\2\60\2\145\1\141\1\154\1\60"+
        "\1\141\1\uffff\1\145\2\uffff\1\147\2\uffff\2\60\1\155\1\156\1\uffff"+
        "\1\156\1\162\1\60\1\uffff\4\60\5\uffff";
    static final String DFA20_maxS =
        "\1\174\6\uffff\1\52\1\uffff\1\162\1\157\2\156\1\145\1\164\1\162"+
        "\1\151\1\150\1\157\1\144\4\uffff\1\145\6\uffff\1\157\1\147\1\157"+
        "\1\144\1\163\1\164\1\172\1\141\1\162\1\145\1\165\1\172\1\154\1\151"+
        "\2\172\1\uffff\1\147\1\156\1\151\1\154\1\172\2\145\1\uffff\1\154"+
        "\1\151\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\162\1\164\1\156"+
        "\1\145\1\uffff\1\172\1\147\2\172\1\156\2\172\2\145\1\141\1\154\1"+
        "\172\1\141\1\uffff\1\145\2\uffff\1\147\2\uffff\2\172\1\155\1\156"+
        "\1\uffff\1\156\1\162\1\172\1\uffff\4\172\5\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\13\uffff\1\31\1\33"+
        "\1\34\1\35\1\uffff\1\37\1\41\1\42\1\43\1\40\1\7\20\uffff\1\36\7"+
        "\uffff\1\22\4\uffff\1\25\2\uffff\1\27\1\30\4\uffff\1\13\15\uffff"+
        "\1\24\1\uffff\1\15\1\20\1\uffff\1\23\1\32\4\uffff\1\12\3\uffff\1"+
        "\26\4\uffff\1\16\1\11\1\21\1\17\1\14";
    static final String DFA20_specialS =
        "\154\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\25\1\33\3\uffff\1\26\1\34"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\31\1\7\12\30\1\10\1\24\3\25\2\uffff"+
            "\32\27\4\uffff\1\27\1\uffff\1\27\1\12\1\27\1\22\1\13\1\20\2"+
            "\27\1\14\5\27\1\23\1\11\1\27\1\15\1\16\1\17\2\27\1\21\3\27\1"+
            "\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "",
            "\1\37",
            "\1\40\11\uffff\1\41",
            "\1\43\1\uffff\1\42",
            "\1\45\7\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50\11\uffff\1\51",
            "\1\53\7\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\30\13\uffff\1\31\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\5\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\75",
            "\1\76",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "\1\107",
            "",
            "\1\111\7\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\124",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\127",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\137",
            "",
            "\1\140",
            "",
            "",
            "\1\141",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | K_PROGRAM | K_BEGIN | K_END | K_INTEGER | K_REAL | K_STRING | K_BOOLEAN | K_READ | K_PRINTLN | K_IF | K_THEN | K_ELSE | K_FI | K_WHILE | K_DO | K_OD | K_SEM | BOOLEAN | OP_PRAEDICATE | OP_LOGICAL | ID | INTEGER | REAL | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}