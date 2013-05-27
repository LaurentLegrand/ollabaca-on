package org.ollabaca.on.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalObjectNotationLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_MY_STRING=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_LONG_STRING=8;
    public static final int RULE_FQN=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int RULE_INT=9;
    public static final int RULE_WS=13;

    // delegates
    // delegators

    public InternalObjectNotationLexer() {;} 
    public InternalObjectNotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalObjectNotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:11:7: ( 'import' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:12:7: ( 'container' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:12:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:13:7: ( '#' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:13:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:14:7: ( '@title' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:14:9: '@title'
            {
            match("@title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:15:7: ( '@abstract' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:15:9: '@abstract'
            {
            match("@abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:16:7: ( '@doc' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:16:9: '@doc'
            {
            match("@doc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:17:7: ( '@see' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:17:9: '@see'
            {
            match("@see"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:18:7: ( '=' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:19:7: ( 'new' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:19:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:20:7: ( '{' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:21:7: ( '}' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:22:7: ( '[' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:23:7: ( ']' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:24:7: ( 'true' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:24:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:25:7: ( 'false' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:25:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:26:7: ( 'null' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:26:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_MY_STRING"
    public final void mRULE_MY_STRING() throws RecognitionException {
        try {
            int _type = RULE_MY_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:16: ( '\"' ( '\\\\\"' | ~ ( '\"' ) )* '\"' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:18: '\"' ( '\\\\\"' | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:22: ( '\\\\\"' | ~ ( '\"' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='\"') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }

                        else {
                            alt1=2;
                        }

                    }
                    else if ( ((LA1_2>='\u0000' && LA1_2<='!')||(LA1_2>='#' && LA1_2<='\uFFFF')) ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:23: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 2 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:29: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MY_STRING"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:13: ( ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:15: ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:15: ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            else if ( (LA8_0=='-'||(LA8_0>='1' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:20: ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )?
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:20: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:20: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    matchRange('1','9'); 
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:34: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:46: ( '.' ( '0' .. '9' )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:47: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:51: ( '0' .. '9' )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:52: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            }
                            break;

                    }

                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:65: ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:66: 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )*
                            {
                            match('e'); 
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            matchRange('1','9'); 
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:89: ( '0' .. '9' )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:90: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_FQN"
    public final void mRULE_FQN() throws RecognitionException {
        try {
            int _type = RULE_FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:912:10: ( ( '/' RULE_ID )* )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:912:12: ( '/' RULE_ID )*
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:912:12: ( '/' RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='/') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:912:13: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:914:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )* )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:914:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )*
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:914:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:914:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:914:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='-' && LA11_0<='.')||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_LONG_STRING"
    public final void mRULE_LONG_STRING() throws RecognitionException {
        try {
            int _type = RULE_LONG_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:916:18: ( '(\"' ( options {greedy=false; } : . )* '\")' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:916:20: '(\"' ( options {greedy=false; } : . )* '\")'
            {
            match("(\""); 

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:916:25: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\"') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==')') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='(')||(LA12_1>='*' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:916:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("\")"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:918:10: ( ( '0' .. '9' )+ )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:918:12: ( '0' .. '9' )+
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:918:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:918:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:920:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:922:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:922:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:922:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:922:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:924:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:926:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:926:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:926:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:928:16: ( . )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:928:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_MY_STRING | RULE_NUMBER | RULE_FQN | RULE_ID | RULE_LONG_STRING | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=27;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:106: RULE_MY_STRING
                {
                mRULE_MY_STRING(); 

                }
                break;
            case 18 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:121: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 19 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:133: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 20 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:150: RULE_LONG_STRING
                {
                mRULE_LONG_STRING(); 

                }
                break;
            case 22 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:167: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:176: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:188: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:204: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:220: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:1:228: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\22\2\32\1\uffff\1\30\1\uffff\1\32\4\uffff\2\32\1\30\1\55\1\30"+
        "\1\55\1\30\1\uffff\1\30\1\uffff\2\30\2\uffff\1\32\1\uffff\1\32\6"+
        "\uffff\2\32\4\uffff\2\32\5\uffff\1\55\5\uffff\2\32\1\101\3\32\1"+
        "\76\3\uffff\2\32\1\uffff\1\110\1\111\1\32\1\uffff\2\32\2\uffff\1"+
        "\115\1\116\1\32\2\uffff\2\32\1\122\1\uffff";
    static final String DFA22_eofS =
        "\123\uffff";
    static final String DFA22_minS =
        "\1\0\1\155\1\157\1\uffff\1\141\1\uffff\1\145\4\uffff\1\162\1\141"+
        "\1\0\1\60\1\61\1\60\1\52\1\uffff\1\101\1\uffff\1\42\1\0\2\uffff"+
        "\1\160\1\uffff\1\156\6\uffff\1\167\1\154\4\uffff\1\165\1\154\2\0"+
        "\3\uffff\1\60\5\uffff\1\157\1\164\1\55\1\154\1\145\1\163\3\0\1\uffff"+
        "\1\162\1\141\1\uffff\2\55\1\145\1\uffff\1\164\1\151\2\uffff\2\55"+
        "\1\156\2\uffff\1\145\1\162\1\55\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\155\1\157\1\uffff\1\164\1\uffff\1\165\4\uffff\1\162"+
        "\1\141\1\uffff\3\71\1\172\1\uffff\1\172\1\uffff\1\42\1\uffff\2\uffff"+
        "\1\160\1\uffff\1\156\6\uffff\1\167\1\154\4\uffff\1\165\1\154\2\uffff"+
        "\3\uffff\1\71\5\uffff\1\157\1\164\1\172\1\154\1\145\1\163\3\uffff"+
        "\1\uffff\1\162\1\141\1\uffff\2\172\1\145\1\uffff\1\164\1\151\2\uffff"+
        "\2\172\1\156\2\uffff\1\145\1\162\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\1\uffff\1\10\1\uffff\1\12\1\13\1\14\1\15\7\uffff\1"+
        "\23\1\uffff\1\24\2\uffff\1\32\1\33\1\uffff\1\24\1\uffff\1\3\1\4"+
        "\1\5\1\6\1\7\1\10\2\uffff\1\12\1\13\1\14\1\15\4\uffff\1\21\1\22"+
        "\1\26\1\uffff\1\30\1\31\1\25\1\27\1\32\11\uffff\1\21\2\uffff\1\11"+
        "\3\uffff\1\21\2\uffff\1\20\1\16\3\uffff\1\17\1\1\3\uffff\1\2";
    static final String DFA22_specialS =
        "\1\0\14\uffff\1\3\10\uffff\1\2\23\uffff\1\1\1\4\17\uffff\1\6\1"+
        "\7\1\5\25\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\15\1\3\3\30\1\26\1"+
            "\25\4\30\1\17\1\30\1\21\1\16\11\20\3\30\1\5\2\30\1\4\32\24\1"+
            "\11\1\30\1\12\1\23\1\24\1\30\2\24\1\2\2\24\1\14\2\24\1\1\4\24"+
            "\1\6\5\24\1\13\6\24\1\7\1\30\1\10\uff82\30",
            "\1\31",
            "\1\33",
            "",
            "\1\36\2\uffff\1\37\16\uffff\1\40\1\35",
            "",
            "\1\42\17\uffff\1\43",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "\12\56",
            "\11\55",
            "\12\57",
            "\1\60\4\uffff\1\61\21\uffff\32\22\3\uffff\2\22\1\uffff\32"+
            "\22",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\62",
            "\0\63",
            "",
            "",
            "\1\65",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\42\76\1\73\4\76\1\75\64\76\1\74\5\76\1\75\3\76\1\75\7\76"+
            "\1\75\3\76\1\75\1\76\2\75\uff8a\76",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "",
            "",
            "",
            "\12\57",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\102",
            "\1\103",
            "\1\104",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "\42\53\1\105\71\53\1\52\uffa3\53",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "",
            "\1\106",
            "\1\107",
            "",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_MY_STRING | RULE_NUMBER | RULE_FQN | RULE_ID | RULE_LONG_STRING | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='i') ) {s = 1;}

                        else if ( (LA22_0=='c') ) {s = 2;}

                        else if ( (LA22_0=='#') ) {s = 3;}

                        else if ( (LA22_0=='@') ) {s = 4;}

                        else if ( (LA22_0=='=') ) {s = 5;}

                        else if ( (LA22_0=='n') ) {s = 6;}

                        else if ( (LA22_0=='{') ) {s = 7;}

                        else if ( (LA22_0=='}') ) {s = 8;}

                        else if ( (LA22_0=='[') ) {s = 9;}

                        else if ( (LA22_0==']') ) {s = 10;}

                        else if ( (LA22_0=='t') ) {s = 11;}

                        else if ( (LA22_0=='f') ) {s = 12;}

                        else if ( (LA22_0=='\"') ) {s = 13;}

                        else if ( (LA22_0=='0') ) {s = 14;}

                        else if ( (LA22_0=='-') ) {s = 15;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 16;}

                        else if ( (LA22_0=='/') ) {s = 17;}

                        else if ( (LA22_0=='^') ) {s = 19;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='b')||(LA22_0>='d' && LA22_0<='e')||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='j' && LA22_0<='m')||(LA22_0>='o' && LA22_0<='s')||(LA22_0>='u' && LA22_0<='z')) ) {s = 20;}

                        else if ( (LA22_0=='(') ) {s = 21;}

                        else if ( (LA22_0=='\'') ) {s = 22;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 23;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='$' && LA22_0<='&')||(LA22_0>=')' && LA22_0<=',')||LA22_0=='.'||(LA22_0>=':' && LA22_0<='<')||(LA22_0>='>' && LA22_0<='?')||LA22_0=='\\'||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 24;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_42 = input.LA(1);

                        s = -1;
                        if ( (LA22_42=='\"') ) {s = 59;}

                        else if ( (LA22_42=='\\') ) {s = 60;}

                        else if ( (LA22_42=='\''||LA22_42=='b'||LA22_42=='f'||LA22_42=='n'||LA22_42=='r'||(LA22_42>='t' && LA22_42<='u')) ) {s = 61;}

                        else if ( ((LA22_42>='\u0000' && LA22_42<='!')||(LA22_42>='#' && LA22_42<='&')||(LA22_42>='(' && LA22_42<='[')||(LA22_42>=']' && LA22_42<='a')||(LA22_42>='c' && LA22_42<='e')||(LA22_42>='g' && LA22_42<='m')||(LA22_42>='o' && LA22_42<='q')||LA22_42=='s'||(LA22_42>='v' && LA22_42<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_22 = input.LA(1);

                        s = -1;
                        if ( ((LA22_22>='\u0000' && LA22_22<='\uFFFF')) ) {s = 51;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_13 = input.LA(1);

                        s = -1;
                        if ( (LA22_13=='\\') ) {s = 42;}

                        else if ( ((LA22_13>='\u0000' && LA22_13<='!')||(LA22_13>='#' && LA22_13<='[')||(LA22_13>=']' && LA22_13<='\uFFFF')) ) {s = 43;}

                        else if ( (LA22_13=='\"') ) {s = 44;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_43 = input.LA(1);

                        s = -1;
                        if ( (LA22_43=='\"') ) {s = 44;}

                        else if ( (LA22_43=='\\') ) {s = 42;}

                        else if ( ((LA22_43>='\u0000' && LA22_43<='!')||(LA22_43>='#' && LA22_43<='[')||(LA22_43>=']' && LA22_43<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_61 = input.LA(1);

                        s = -1;
                        if ( (LA22_61=='\"') ) {s = 44;}

                        else if ( (LA22_61=='\\') ) {s = 42;}

                        else if ( ((LA22_61>='\u0000' && LA22_61<='!')||(LA22_61>='#' && LA22_61<='[')||(LA22_61>=']' && LA22_61<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_59 = input.LA(1);

                        s = -1;
                        if ( (LA22_59=='\"') ) {s = 44;}

                        else if ( (LA22_59=='\\') ) {s = 42;}

                        else if ( ((LA22_59>='\u0000' && LA22_59<='!')||(LA22_59>='#' && LA22_59<='[')||(LA22_59>=']' && LA22_59<='\uFFFF')) ) {s = 43;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_60 = input.LA(1);

                        s = -1;
                        if ( (LA22_60=='\"') ) {s = 69;}

                        else if ( (LA22_60=='\\') ) {s = 42;}

                        else if ( ((LA22_60>='\u0000' && LA22_60<='!')||(LA22_60>='#' && LA22_60<='[')||(LA22_60>=']' && LA22_60<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}