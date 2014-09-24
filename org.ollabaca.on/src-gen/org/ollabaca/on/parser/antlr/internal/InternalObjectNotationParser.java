package org.ollabaca.on.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ollabaca.on.services.ObjectNotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalObjectNotationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FQN", "RULE_MY_STRING", "RULE_ID", "RULE_VERSION", "RULE_NUMBER", "RULE_LONG_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parent'", "'import'", "'container'", "'#'", "'@title'", "'@abstract'", "'@doc'", "'@abbr'", "'@see'", "'@tag'", "'@since'", "'@version'", "'='", "'new'", "'{'", "'}'", "'['", "']'", "'true'", "'false'", "'null'"
    };
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


        public InternalObjectNotationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalObjectNotationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalObjectNotationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g"; }



     	private ObjectNotationGrammarAccess grammarAccess;
     	
        public InternalObjectNotationParser(TokenStream input, ObjectNotationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Unit";	
       	}
       	
       	@Override
       	protected ObjectNotationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleUnit"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:67:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:68:2: (iv_ruleUnit= ruleUnit EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:69:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit75);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:76:1: ruleUnit returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )? ( (lv_container_3_0= ruleContainer ) )? ( (lv_instances_4_0= ruleInstance ) )+ ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_imports_0_0 = null;

        EObject lv_container_3_0 = null;

        EObject lv_instances_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )+ (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )? ( (lv_container_3_0= ruleContainer ) )? ( (lv_instances_4_0= ruleInstance ) )+ ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )+ (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )? ( (lv_container_3_0= ruleContainer ) )? ( (lv_instances_4_0= ruleInstance ) )+ )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )+ (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )? ( (lv_container_3_0= ruleContainer ) )? ( (lv_instances_4_0= ruleInstance ) )+ )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:2: ( (lv_imports_0_0= ruleImport ) )+ (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )? ( (lv_container_3_0= ruleContainer ) )? ( (lv_instances_4_0= ruleInstance ) )+
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:2: ( (lv_imports_0_0= ruleImport ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnitAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleUnit131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:98:3: (otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:98:5: otherlv_1= 'parent' ( (otherlv_2= RULE_FQN ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUnit145); 

                        	newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getParentKeyword_1_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:102:1: ( (otherlv_2= RULE_FQN ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:103:1: (otherlv_2= RULE_FQN )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:103:1: (otherlv_2= RULE_FQN )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:104:3: otherlv_2= RULE_FQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnitRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleUnit165); 

                    		newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getParentInstanceCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:115:4: ( (lv_container_3_0= ruleContainer ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:116:1: (lv_container_3_0= ruleContainer )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:116:1: (lv_container_3_0= ruleContainer )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:117:3: lv_container_3_0= ruleContainer
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainer_in_ruleUnit188);
                    lv_container_3_0=ruleContainer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"container",
                            		lv_container_3_0, 
                            		"Container");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:133:3: ( (lv_instances_4_0= ruleInstance ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=20 && LA4_0<=27)||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:134:1: (lv_instances_4_0= ruleInstance )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:134:1: (lv_instances_4_0= ruleInstance )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:135:3: lv_instances_4_0= ruleInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstance_in_ruleUnit210);
            	    lv_instances_4_0=ruleInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_4_0, 
            	            		"Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:159:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:160:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:161:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue247);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:168:1: ruleValue returns [EObject current=null] : (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Instance_0 = null;

        EObject this_Array_1 = null;

        EObject this_InstanceRef_2 = null;

        EObject this_Literal_3 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:171:28: ( (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:172:1: (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:172:1: (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case RULE_FQN:
                {
                alt5=3;
                }
                break;
            case RULE_MY_STRING:
            case RULE_NUMBER:
            case 19:
            case 34:
            case 35:
            case 36:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:173:5: this_Instance_0= ruleInstance
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getInstanceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInstance_in_ruleValue304);
                    this_Instance_0=ruleInstance();

                    state._fsp--;

                     
                            current = this_Instance_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:183:5: this_Array_1= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleValue331);
                    this_Array_1=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:193:5: this_InstanceRef_2= ruleInstanceRef
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getInstanceRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstanceRef_in_ruleValue358);
                    this_InstanceRef_2=ruleInstanceRef();

                    state._fsp--;

                     
                            current = this_InstanceRef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:203:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleValue385);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleLiteral"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:219:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:220:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:221:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral420);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:228:1: ruleLiteral returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_NumberValue_3 = null;

        EObject this_EnumValue_4 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:231:28: ( (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:232:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:232:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_MY_STRING:
                {
                alt6=1;
                }
                break;
            case 34:
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:233:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLiteral477);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:243:5: this_BooleanValue_1= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral504);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:253:5: this_NullValue_2= ruleNullValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNullValue_in_ruleLiteral531);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;

                     
                            current = this_NullValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:263:5: this_NumberValue_3= ruleNumberValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleLiteral558);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;

                     
                            current = this_NumberValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:273:5: this_EnumValue_4= ruleEnumValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleLiteral585);
                    this_EnumValue_4=ruleEnumValue();

                    state._fsp--;

                     
                            current = this_EnumValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleImport"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:289:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:290:2: (iv_ruleImport= ruleImport EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:291:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport620);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:298:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:301:28: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:302:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:302:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:302:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport667); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:306:1: ( (lv_name_1_0= RULE_MY_STRING ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:307:1: (lv_name_1_0= RULE_MY_STRING )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:307:1: (lv_name_1_0= RULE_MY_STRING )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:308:3: lv_name_1_0= RULE_MY_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleImport684); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameMY_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"MY_STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleContainer"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:332:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:333:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:334:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer725);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:341:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:344:28: ( (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:345:1: (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:345:1: (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:345:3: otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleContainer772); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:349:1: ( (otherlv_1= RULE_FQN ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:350:1: (otherlv_1= RULE_FQN )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:350:1: (otherlv_1= RULE_FQN )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:351:3: otherlv_1= RULE_FQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleContainer792); 

            		newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getInstanceInstanceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleContainer804); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getNumberSignKeyword_2());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:366:1: ( (lv_feature_3_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:367:1: (lv_feature_3_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:367:1: (lv_feature_3_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:368:3: lv_feature_3_0= RULE_ID
            {
            lv_feature_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainer821); 

            			newLeafNode(lv_feature_3_0, grammarAccess.getContainerAccess().getFeatureIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleInstance"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:392:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:393:2: (iv_ruleInstance= ruleInstance EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:394:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance862);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:401:1: ruleInstance returns [EObject current=null] : ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )? (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )* (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )* (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )? (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )? ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )? otherlv_19= 'new' ( (lv_type_20_0= RULE_ID ) ) otherlv_21= '{' ( (lv_slots_22_0= ruleSlot ) )* otherlv_23= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token lv_abstract_4_0=null;
        Token otherlv_5=null;
        Token lv_documentation_6_0=null;
        Token otherlv_7=null;
        Token lv_abbr_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_tags_12_0=null;
        Token otherlv_13=null;
        Token lv_since_14_0=null;
        Token otherlv_15=null;
        Token lv_version_16_0=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_type_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_slots_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:404:28: ( ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )? (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )* (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )* (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )? (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )? ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )? otherlv_19= 'new' ( (lv_type_20_0= RULE_ID ) ) otherlv_21= '{' ( (lv_slots_22_0= ruleSlot ) )* otherlv_23= '}' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:405:1: ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )? (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )* (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )* (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )? (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )? ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )? otherlv_19= 'new' ( (lv_type_20_0= RULE_ID ) ) otherlv_21= '{' ( (lv_slots_22_0= ruleSlot ) )* otherlv_23= '}' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:405:1: ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )? (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )* (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )* (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )? (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )? ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )? otherlv_19= 'new' ( (lv_type_20_0= RULE_ID ) ) otherlv_21= '{' ( (lv_slots_22_0= ruleSlot ) )* otherlv_23= '}' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:405:2: () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )? (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )* (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )* (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )? (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )? ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )? otherlv_19= 'new' ( (lv_type_20_0= RULE_ID ) ) otherlv_21= '{' ( (lv_slots_22_0= ruleSlot ) )* otherlv_23= '}'
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:405:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:406:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInstanceAccess().getInstanceAction_0(),
                        current);
                

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:411:2: (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:411:4: otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInstance919); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getTitleKeyword_1_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:415:1: ( (lv_title_2_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:416:1: (lv_title_2_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:416:1: (lv_title_2_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:417:3: lv_title_2_0= RULE_MY_STRING
                    {
                    lv_title_2_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance936); 

                    			newLeafNode(lv_title_2_0, grammarAccess.getInstanceAccess().getTitleMY_STRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_2_0, 
                            		"MY_STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:433:4: (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:433:6: otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleInstance956); 

                        	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getAbstractKeyword_2_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:437:1: ( (lv_abstract_4_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:438:1: (lv_abstract_4_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:438:1: (lv_abstract_4_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:439:3: lv_abstract_4_0= RULE_MY_STRING
                    {
                    lv_abstract_4_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance973); 

                    			newLeafNode(lv_abstract_4_0, grammarAccess.getInstanceAccess().getAbstractMY_STRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"abstract",
                            		lv_abstract_4_0, 
                            		"MY_STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:455:4: (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:455:6: otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleInstance993); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getDocKeyword_3_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:459:1: ( (lv_documentation_6_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:460:1: (lv_documentation_6_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:460:1: (lv_documentation_6_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:461:3: lv_documentation_6_0= RULE_MY_STRING
                    {
                    lv_documentation_6_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance1010); 

                    			newLeafNode(lv_documentation_6_0, grammarAccess.getInstanceAccess().getDocumentationMY_STRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_6_0, 
                            		"MY_STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:477:4: (otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:477:6: otherlv_7= '@abbr' ( (lv_abbr_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleInstance1030); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getAbbrKeyword_4_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:481:1: ( (lv_abbr_8_0= RULE_ID ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:482:1: (lv_abbr_8_0= RULE_ID )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:482:1: (lv_abbr_8_0= RULE_ID )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:483:3: lv_abbr_8_0= RULE_ID
                    {
                    lv_abbr_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1047); 

                    			newLeafNode(lv_abbr_8_0, grammarAccess.getInstanceAccess().getAbbrIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"abbr",
                            		lv_abbr_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:499:4: (otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:499:6: otherlv_9= '@see' ( (otherlv_10= RULE_FQN ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleInstance1067); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getSeeKeyword_5_0());
            	        
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:503:1: ( (otherlv_10= RULE_FQN ) )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:504:1: (otherlv_10= RULE_FQN )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:504:1: (otherlv_10= RULE_FQN )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:505:3: otherlv_10= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInstanceRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleInstance1087); 

            	    		newLeafNode(otherlv_10, grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:516:4: (otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:516:6: otherlv_11= '@tag' ( (lv_tags_12_0= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleInstance1102); 

            	        	newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getTagKeyword_6_0());
            	        
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:520:1: ( (lv_tags_12_0= RULE_ID ) )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:521:1: (lv_tags_12_0= RULE_ID )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:521:1: (lv_tags_12_0= RULE_ID )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:522:3: lv_tags_12_0= RULE_ID
            	    {
            	    lv_tags_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1119); 

            	    			newLeafNode(lv_tags_12_0, grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInstanceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_12_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:538:4: (otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:538:6: otherlv_13= '@since' ( (lv_since_14_0= RULE_VERSION ) )
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleInstance1139); 

                        	newLeafNode(otherlv_13, grammarAccess.getInstanceAccess().getSinceKeyword_7_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:542:1: ( (lv_since_14_0= RULE_VERSION ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:543:1: (lv_since_14_0= RULE_VERSION )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:543:1: (lv_since_14_0= RULE_VERSION )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:544:3: lv_since_14_0= RULE_VERSION
                    {
                    lv_since_14_0=(Token)match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_ruleInstance1156); 

                    			newLeafNode(lv_since_14_0, grammarAccess.getInstanceAccess().getSinceVERSIONTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"since",
                            		lv_since_14_0, 
                            		"VERSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:560:4: (otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:560:6: otherlv_15= '@version' ( (lv_version_16_0= RULE_VERSION ) )
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleInstance1176); 

                        	newLeafNode(otherlv_15, grammarAccess.getInstanceAccess().getVersionKeyword_8_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:564:1: ( (lv_version_16_0= RULE_VERSION ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:565:1: (lv_version_16_0= RULE_VERSION )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:565:1: (lv_version_16_0= RULE_VERSION )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:566:3: lv_version_16_0= RULE_VERSION
                    {
                    lv_version_16_0=(Token)match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_ruleInstance1193); 

                    			newLeafNode(lv_version_16_0, grammarAccess.getInstanceAccess().getVersionVERSIONTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_16_0, 
                            		"VERSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:582:4: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '=' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:582:5: ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '='
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:582:5: ( (lv_name_17_0= RULE_ID ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:583:1: (lv_name_17_0= RULE_ID )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:583:1: (lv_name_17_0= RULE_ID )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:584:3: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1218); 

                    			newLeafNode(lv_name_17_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_17_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleInstance1235); 

                        	newLeafNode(otherlv_18, grammarAccess.getInstanceAccess().getEqualsSignKeyword_9_1());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_29_in_ruleInstance1249); 

                	newLeafNode(otherlv_19, grammarAccess.getInstanceAccess().getNewKeyword_10());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:608:1: ( (lv_type_20_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:609:1: (lv_type_20_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:609:1: (lv_type_20_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:610:3: lv_type_20_0= RULE_ID
            {
            lv_type_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1266); 

            			newLeafNode(lv_type_20_0, grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_20_0, 
                    		"ID");
            	    

            }


            }

            otherlv_21=(Token)match(input,30,FOLLOW_30_in_ruleInstance1283); 

                	newLeafNode(otherlv_21, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_12());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:630:1: ( (lv_slots_22_0= ruleSlot ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:631:1: (lv_slots_22_0= ruleSlot )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:631:1: (lv_slots_22_0= ruleSlot )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:632:3: lv_slots_22_0= ruleSlot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSlot_in_ruleInstance1304);
            	    lv_slots_22_0=ruleSlot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slots",
            	            		lv_slots_22_0, 
            	            		"Slot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_23=(Token)match(input,31,FOLLOW_31_in_ruleInstance1317); 

                	newLeafNode(otherlv_23, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleSlot"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:660:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:661:2: (iv_ruleSlot= ruleSlot EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:662:2: iv_ruleSlot= ruleSlot EOF
            {
             newCompositeNode(grammarAccess.getSlotRule()); 
            pushFollow(FOLLOW_ruleSlot_in_entryRuleSlot1353);
            iv_ruleSlot=ruleSlot();

            state._fsp--;

             current =iv_ruleSlot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlot1363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:669:1: ruleSlot returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:672:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:673:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:673:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:673:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:673:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:674:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSlotAccess().getSlotAction_0(),
                        current);
                

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:679:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:680:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:680:1: (lv_name_1_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:681:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSlot1414); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSlotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSlot1431); 

                	newLeafNode(otherlv_2, grammarAccess.getSlotAccess().getEqualsSignKeyword_2());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:701:1: ( (lv_value_3_0= ruleValue ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:702:1: (lv_value_3_0= ruleValue )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:702:1: (lv_value_3_0= ruleValue )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:703:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getSlotAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSlot1452);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSlotRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleArray"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:727:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:728:2: (iv_ruleArray= ruleArray EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:729:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1488);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:736:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:739:28: ( (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:740:1: (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:740:1: (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:740:3: otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleArray1535); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:744:1: ( (lv_value_1_0= ruleValue ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_FQN && LA17_0<=RULE_ID)||LA17_0==RULE_NUMBER||(LA17_0>=19 && LA17_0<=27)||LA17_0==29||LA17_0==32||(LA17_0>=34 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:745:1: (lv_value_1_0= ruleValue )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:745:1: (lv_value_1_0= ruleValue )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:746:3: lv_value_1_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray1556);
            	    lv_value_1_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_1_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleArray1569); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleStringValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:774:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:775:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:776:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1605);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:783:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_MY_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:786:28: ( ( (lv_value_0_0= RULE_MY_STRING ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:787:1: ( (lv_value_0_0= RULE_MY_STRING ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:787:1: ( (lv_value_0_0= RULE_MY_STRING ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:788:1: (lv_value_0_0= RULE_MY_STRING )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:788:1: (lv_value_0_0= RULE_MY_STRING )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:789:3: lv_value_0_0= RULE_MY_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleStringValue1656); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueMY_STRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"MY_STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:813:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:814:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:815:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1696);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:822:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:825:28: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:827:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:827:1: (lv_value_0_0= 'true' )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:828:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,34,FOLLOW_34_in_ruleBooleanValue1749); 

                            newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:842:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:842:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:843:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:843:1: (lv_value_1_0= 'false' )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:844:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,35,FOLLOW_35_in_ruleBooleanValue1786); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "false");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNullValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:865:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:866:2: (iv_ruleNullValue= ruleNullValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:867:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue1835);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullValue1845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:874:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:877:28: ( ( () otherlv_1= 'null' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:878:1: ( () otherlv_1= 'null' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:878:1: ( () otherlv_1= 'null' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:878:2: () otherlv_1= 'null'
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:878:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullValueAccess().getNullValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleNullValue1891); 

                	newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:896:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:897:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:898:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1927);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1937); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:905:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:908:28: ( ( (lv_value_0_0= RULE_NUMBER ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:909:1: ( (lv_value_0_0= RULE_NUMBER ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:909:1: ( (lv_value_0_0= RULE_NUMBER ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:1: (lv_value_0_0= RULE_NUMBER )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:910:1: (lv_value_0_0= RULE_NUMBER )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:911:3: lv_value_0_0= RULE_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberValue1978); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueNUMBERTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NUMBER");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleInstanceRef"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:935:1: entryRuleInstanceRef returns [EObject current=null] : iv_ruleInstanceRef= ruleInstanceRef EOF ;
    public final EObject entryRuleInstanceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceRef = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:936:2: (iv_ruleInstanceRef= ruleInstanceRef EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:937:2: iv_ruleInstanceRef= ruleInstanceRef EOF
            {
             newCompositeNode(grammarAccess.getInstanceRefRule()); 
            pushFollow(FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef2018);
            iv_ruleInstanceRef=ruleInstanceRef();

            state._fsp--;

             current =iv_ruleInstanceRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceRef2028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceRef"


    // $ANTLR start "ruleInstanceRef"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:944:1: ruleInstanceRef returns [EObject current=null] : ( (otherlv_0= RULE_FQN ) ) ;
    public final EObject ruleInstanceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:947:28: ( ( (otherlv_0= RULE_FQN ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:948:1: ( (otherlv_0= RULE_FQN ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:948:1: ( (otherlv_0= RULE_FQN ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:949:1: (otherlv_0= RULE_FQN )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:949:1: (otherlv_0= RULE_FQN )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:950:3: otherlv_0= RULE_FQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleInstanceRef2072); 

            		newLeafNode(otherlv_0, grammarAccess.getInstanceRefAccess().getValueInstanceCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceRef"


    // $ANTLR start "entryRuleEnumValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:969:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:970:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:971:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue2107);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue2117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:978:1: ruleEnumValue returns [EObject current=null] : (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:981:28: ( (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:982:1: (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:982:1: (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:982:3: otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnumValue2154); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumValueAccess().getNumberSignKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:986:1: ( (lv_value_1_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:987:1: (lv_value_1_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:987:1: (lv_value_1_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:988:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumValue2171); 

            			newLeafNode(lv_value_1_0, grammarAccess.getEnumValueAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleUnit131 = new BitSet(new long[]{0x000000002FF70040L});
    public static final BitSet FOLLOW_16_in_ruleUnit145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleUnit165 = new BitSet(new long[]{0x000000002FF50040L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleUnit188 = new BitSet(new long[]{0x000000002FF50040L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleUnit210 = new BitSet(new long[]{0x000000002FF50042L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleValue304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_ruleValue358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleValue385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLiteral477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_ruleLiteral531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleLiteral558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleLiteral585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleImport684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContainer772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleContainer792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContainer804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainer821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInstance919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance936 = new BitSet(new long[]{0x000000002FE00040L});
    public static final BitSet FOLLOW_21_in_ruleInstance956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance973 = new BitSet(new long[]{0x000000002FC00040L});
    public static final BitSet FOLLOW_22_in_ruleInstance993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance1010 = new BitSet(new long[]{0x000000002F800040L});
    public static final BitSet FOLLOW_23_in_ruleInstance1030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1047 = new BitSet(new long[]{0x000000002F000040L});
    public static final BitSet FOLLOW_24_in_ruleInstance1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleInstance1087 = new BitSet(new long[]{0x000000002F000040L});
    public static final BitSet FOLLOW_25_in_ruleInstance1102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1119 = new BitSet(new long[]{0x000000002E000040L});
    public static final BitSet FOLLOW_26_in_ruleInstance1139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_VERSION_in_ruleInstance1156 = new BitSet(new long[]{0x0000000028000040L});
    public static final BitSet FOLLOW_27_in_ruleInstance1176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_VERSION_in_ruleInstance1193 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1218 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInstance1235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInstance1249 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1266 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInstance1283 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_ruleSlot_in_ruleInstance1304 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_31_in_ruleInstance1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlot_in_entryRuleSlot1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlot1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSlot1414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSlot1431 = new BitSet(new long[]{0x0000001D2FFD0170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSlot1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArray1535 = new BitSet(new long[]{0x0000001D2FFD0170L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray1556 = new BitSet(new long[]{0x0000001F2FFD0170L});
    public static final BitSet FOLLOW_33_in_ruleArray1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleStringValue1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBooleanValue1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBooleanValue1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue1835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullValue1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNullValue1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberValue1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceRef2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleInstanceRef2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumValue2154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumValue2171 = new BitSet(new long[]{0x0000000000000002L});

}