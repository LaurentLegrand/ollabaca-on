package org.ollabaca.on.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalObjectNotationLexer extends Lexer {
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_VERSION=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_FQN=4;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_MY_STRING=5;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=8;
    public static final int RULE_LONG_STRING=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalObjectNotationLexer() {;} 
    public InternalObjectNotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalObjectNotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:11:7: ( 'parent' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:11:9: 'parent'
            {
            match("parent"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:12:7: ( 'import' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:12:9: 'import'
            {
            match("import"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:13:7: ( 'container' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:13:9: 'container'
            {
            match("container"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:14:7: ( '#' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:14:9: '#'
            {
            match('#'); 

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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:15:7: ( 'new' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:15:9: 'new'
            {
            match("new"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:16:7: ( '{' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:16:9: '{'
            {
            match('{'); 

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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:17:7: ( '}' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:17:9: '}'
            {
            match('}'); 

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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:18:7: ( '@title' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:18:9: '@title'
            {
            match("@title"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:19:7: ( '@abstract' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:19:9: '@abstract'
            {
            match("@abstract"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:20:7: ( '@doc' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:20:9: '@doc'
            {
            match("@doc"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:21:7: ( '@abbr' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:21:9: '@abbr'
            {
            match("@abbr"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:22:7: ( '@see' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:22:9: '@see'
            {
            match("@see"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:23:7: ( '@tag' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:23:9: '@tag'
            {
            match("@tag"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:24:7: ( '@since' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:24:9: '@since'
            {
            match("@since"); 


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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:25:7: ( '@version' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:25:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:26:7: ( '=' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:27:7: ( '[' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:28:7: ( ']' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:29:7: ( 'null' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:29:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:30:7: ( 'true' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:30:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:31:7: ( 'false' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:31:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_MY_STRING"
    public final void mRULE_MY_STRING() throws RecognitionException {
        try {
            int _type = RULE_MY_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2779:16: ( '\"' ( '\\\\\"' | ~ ( '\"' ) )* '\"' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2779:18: '\"' ( '\\\\\"' | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2779:22: ( '\\\\\"' | ~ ( '\"' ) )*
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
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2779:23: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 2 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2779:29: ~ ( '\"' )
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:13: ( ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:15: ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:15: ( '0' | ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )? )
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
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:20: ( '-' )? '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )?
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:20: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:20: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    matchRange('1','9'); 
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:34: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:46: ( '.' ( '0' .. '9' )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:47: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:51: ( '0' .. '9' )+
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
                            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:52: '0' .. '9'
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

                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:65: ( 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:66: 'e' ( '+' | '-' ) '1' .. '9' ( '0' .. '9' )*
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
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:89: ( '0' .. '9' )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2781:90: '0' .. '9'
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2783:10: ( ( '/' RULE_ID )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2783:12: ( '/' RULE_ID )*
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2783:12: ( '/' RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='/') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2783:13: '/' RULE_ID
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2785:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2785:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )*
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2785:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2785:11: '^'
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

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2785:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' | '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='-' && LA11_0<='.')||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2787:18: ( '(\"' ( options {greedy=false; } : . )* '\")' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2787:20: '(\"' ( options {greedy=false; } : . )* '\")'
            {
            match("(\""); 

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2787:25: ( options {greedy=false; } : . )*
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
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2787:53: .
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

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:14: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )+ )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:16: ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )+
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:16: ( '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:28: ( '.' ( '0' .. '9' )* )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='.') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:29: '.' ( '0' .. '9' )*
            	    {
            	    match('.'); 
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:33: ( '0' .. '9' )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2789:34: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2791:10: ( ( '0' .. '9' )+ )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2791:12: ( '0' .. '9' )+
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2791:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2791:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2793:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2795:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2795:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2795:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2795:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2797:41: '\\r'
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2799:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2799:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2799:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2801:16: ( . )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2801:18: .
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
        // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_MY_STRING | RULE_NUMBER | RULE_FQN | RULE_ID | RULE_LONG_STRING | RULE_VERSION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=33;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:136: RULE_MY_STRING
                {
                mRULE_MY_STRING(); 

                }
                break;
            case 23 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:151: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 24 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:163: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 25 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:172: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:180: RULE_LONG_STRING
                {
                mRULE_LONG_STRING(); 

                }
                break;
            case 27 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:197: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 28 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:210: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:219: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:231: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:247: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:263: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1:271: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\23\3\34\1\uffff\1\34\2\uffff\1\32\3\uffff\2\34\1\32\1\63\1\32"+
        "\1\63\1\32\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32\2\uffff\1\34\1"+
        "\uffff\2\34\1\uffff\2\34\12\uffff\2\34\4\uffff\1\113\1\uffff\1\63"+
        "\1\61\5\uffff\3\34\1\120\1\34\5\uffff\2\34\1\112\4\uffff\1\63\3"+
        "\34\1\uffff\1\132\2\uffff\1\133\1\34\1\uffff\3\34\2\uffff\1\140"+
        "\1\141\1\142\1\34\3\uffff\2\34\1\146\1\uffff";
    static final String DFA25_eofS =
        "\147\uffff";
    static final String DFA25_minS =
        "\1\0\1\141\1\155\1\157\1\uffff\1\145\2\uffff\1\141\3\uffff\1\162"+
        "\1\141\1\0\1\56\1\61\1\56\1\52\1\uffff\1\101\1\uffff\1\42\1\uffff"+
        "\1\0\2\uffff\1\162\1\uffff\1\160\1\156\1\uffff\1\167\1\154\2\uffff"+
        "\1\141\1\142\1\uffff\1\145\4\uffff\1\165\1\154\2\0\2\uffff\1\56"+
        "\1\uffff\1\56\1\60\5\uffff\1\145\1\157\1\164\1\55\1\154\2\uffff"+
        "\1\142\2\uffff\1\145\1\163\3\0\2\uffff\1\56\1\156\1\162\1\141\1"+
        "\uffff\1\55\2\uffff\1\55\1\145\1\uffff\2\164\1\151\2\uffff\3\55"+
        "\1\156\3\uffff\1\145\1\162\1\55\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\141\1\155\1\157\1\uffff\1\165\2\uffff\1\166\3\uffff"+
        "\1\162\1\141\1\uffff\3\71\1\172\1\uffff\1\172\1\uffff\1\42\1\uffff"+
        "\1\uffff\2\uffff\1\162\1\uffff\1\160\1\156\1\uffff\1\167\1\154\2"+
        "\uffff\1\151\1\142\1\uffff\1\151\4\uffff\1\165\1\154\2\uffff\2\uffff"+
        "\1\71\1\uffff\2\71\5\uffff\1\145\1\157\1\164\1\172\1\154\2\uffff"+
        "\1\163\2\uffff\1\145\1\163\3\uffff\2\uffff\1\71\1\156\1\162\1\141"+
        "\1\uffff\1\172\2\uffff\1\172\1\145\1\uffff\2\164\1\151\2\uffff\3"+
        "\172\1\156\3\uffff\1\145\1\162\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\20\1\21\1\22\7\uffff\1\30"+
        "\1\uffff\1\31\1\uffff\1\33\1\uffff\1\40\1\41\1\uffff\1\31\2\uffff"+
        "\1\4\2\uffff\1\6\1\7\2\uffff\1\12\1\uffff\1\17\1\20\1\21\1\22\4"+
        "\uffff\1\26\1\33\1\uffff\1\27\2\uffff\1\36\1\37\1\32\1\35\1\40\5"+
        "\uffff\1\10\1\15\1\uffff\1\14\1\16\5\uffff\1\26\1\34\4\uffff\1\5"+
        "\1\uffff\1\11\1\13\2\uffff\1\26\3\uffff\1\23\1\24\4\uffff\1\25\1"+
        "\1\1\2\3\uffff\1\3";
    static final String DFA25_specialS =
        "\1\3\15\uffff\1\7\11\uffff\1\4\25\uffff\1\6\1\2\27\uffff\1\5\1"+
        "\0\1\1\35\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\16\1\4\3\32\1\30\1"+
            "\26\4\32\1\20\1\27\1\22\1\17\11\21\3\32\1\11\2\32\1\10\32\25"+
            "\1\12\1\32\1\13\1\24\1\25\1\32\2\25\1\3\2\25\1\15\2\25\1\2\4"+
            "\25\1\5\1\25\1\1\3\25\1\14\6\25\1\6\1\32\1\7\uff82\32",
            "\1\33",
            "\1\35",
            "\1\36",
            "",
            "\1\40\17\uffff\1\41",
            "",
            "",
            "\1\45\2\uffff\1\46\16\uffff\1\47\1\44\1\uffff\1\50",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\42\57\1\60\71\57\1\56\uffa3\57",
            "\1\61\1\uffff\12\62",
            "\11\63",
            "\1\65\1\uffff\12\64",
            "\1\66\4\uffff\1\67\21\uffff\32\23\3\uffff\2\23\1\uffff\32"+
            "\23",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\70",
            "",
            "\0\71",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "\1\101\7\uffff\1\100",
            "\1\102",
            "",
            "\1\103\3\uffff\1\104",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\42\111\1\107\71\111\1\110\uffa3\111",
            "\42\57\1\60\71\57\1\56\uffa3\57",
            "",
            "",
            "\1\61\1\uffff\12\62",
            "",
            "\1\65\1\uffff\12\64",
            "\12\114",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\121",
            "",
            "",
            "\1\123\20\uffff\1\122",
            "",
            "",
            "\1\124",
            "\1\125",
            "\42\57\1\60\71\57\1\56\uffa3\57",
            "\42\57\1\126\71\57\1\56\uffa3\57",
            "\42\57\1\60\71\57\1\56\uffa3\57",
            "",
            "",
            "\1\61\1\uffff\12\114",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\2\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_MY_STRING | RULE_NUMBER | RULE_FQN | RULE_ID | RULE_LONG_STRING | RULE_VERSION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_72 = input.LA(1);

                        s = -1;
                        if ( (LA25_72=='\"') ) {s = 86;}

                        else if ( (LA25_72=='\\') ) {s = 46;}

                        else if ( ((LA25_72>='\u0000' && LA25_72<='!')||(LA25_72>='#' && LA25_72<='[')||(LA25_72>=']' && LA25_72<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_73 = input.LA(1);

                        s = -1;
                        if ( (LA25_73=='\"') ) {s = 48;}

                        else if ( (LA25_73=='\\') ) {s = 46;}

                        else if ( ((LA25_73>='\u0000' && LA25_73<='!')||(LA25_73>='#' && LA25_73<='[')||(LA25_73>=']' && LA25_73<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_47 = input.LA(1);

                        s = -1;
                        if ( (LA25_47=='\"') ) {s = 48;}

                        else if ( (LA25_47=='\\') ) {s = 46;}

                        else if ( ((LA25_47>='\u0000' && LA25_47<='!')||(LA25_47>='#' && LA25_47<='[')||(LA25_47>=']' && LA25_47<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='p') ) {s = 1;}

                        else if ( (LA25_0=='i') ) {s = 2;}

                        else if ( (LA25_0=='c') ) {s = 3;}

                        else if ( (LA25_0=='#') ) {s = 4;}

                        else if ( (LA25_0=='n') ) {s = 5;}

                        else if ( (LA25_0=='{') ) {s = 6;}

                        else if ( (LA25_0=='}') ) {s = 7;}

                        else if ( (LA25_0=='@') ) {s = 8;}

                        else if ( (LA25_0=='=') ) {s = 9;}

                        else if ( (LA25_0=='[') ) {s = 10;}

                        else if ( (LA25_0==']') ) {s = 11;}

                        else if ( (LA25_0=='t') ) {s = 12;}

                        else if ( (LA25_0=='f') ) {s = 13;}

                        else if ( (LA25_0=='\"') ) {s = 14;}

                        else if ( (LA25_0=='0') ) {s = 15;}

                        else if ( (LA25_0=='-') ) {s = 16;}

                        else if ( ((LA25_0>='1' && LA25_0<='9')) ) {s = 17;}

                        else if ( (LA25_0=='/') ) {s = 18;}

                        else if ( (LA25_0=='^') ) {s = 20;}

                        else if ( ((LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='b')||(LA25_0>='d' && LA25_0<='e')||(LA25_0>='g' && LA25_0<='h')||(LA25_0>='j' && LA25_0<='m')||LA25_0=='o'||(LA25_0>='q' && LA25_0<='s')||(LA25_0>='u' && LA25_0<='z')) ) {s = 21;}

                        else if ( (LA25_0=='(') ) {s = 22;}

                        else if ( (LA25_0=='.') ) {s = 23;}

                        else if ( (LA25_0=='\'') ) {s = 24;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 25;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='$' && LA25_0<='&')||(LA25_0>=')' && LA25_0<=',')||(LA25_0>=':' && LA25_0<='<')||(LA25_0>='>' && LA25_0<='?')||LA25_0=='\\'||LA25_0=='`'||LA25_0=='|'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 26;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_24 = input.LA(1);

                        s = -1;
                        if ( ((LA25_24>='\u0000' && LA25_24<='\uFFFF')) ) {s = 57;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_71 = input.LA(1);

                        s = -1;
                        if ( (LA25_71=='\"') ) {s = 48;}

                        else if ( (LA25_71=='\\') ) {s = 46;}

                        else if ( ((LA25_71>='\u0000' && LA25_71<='!')||(LA25_71>='#' && LA25_71<='[')||(LA25_71>=']' && LA25_71<='\uFFFF')) ) {s = 47;}

                        else s = 74;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_46 = input.LA(1);

                        s = -1;
                        if ( (LA25_46=='\"') ) {s = 71;}

                        else if ( (LA25_46=='\\') ) {s = 72;}

                        else if ( ((LA25_46>='\u0000' && LA25_46<='!')||(LA25_46>='#' && LA25_46<='[')||(LA25_46>=']' && LA25_46<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_14 = input.LA(1);

                        s = -1;
                        if ( (LA25_14=='\\') ) {s = 46;}

                        else if ( ((LA25_14>='\u0000' && LA25_14<='!')||(LA25_14>='#' && LA25_14<='[')||(LA25_14>=']' && LA25_14<='\uFFFF')) ) {s = 47;}

                        else if ( (LA25_14=='\"') ) {s = 48;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}