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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MY_STRING", "RULE_FQN", "RULE_ID", "RULE_NUMBER", "RULE_LONG_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'container'", "'#'", "'@title'", "'@abstract'", "'@doc'", "'@see'", "'@tag'", "'='", "'new'", "'{'", "'}'", "'['", "']'", "'true'", "'false'", "'null'"
    };
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:76:1: ruleUnit returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_container_1_0= ruleContainer ) )? ( (lv_instances_2_0= ruleInstance ) )+ ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_container_1_0 = null;

        EObject lv_instances_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_container_1_0= ruleContainer ) )? ( (lv_instances_2_0= ruleInstance ) )+ ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_container_1_0= ruleContainer ) )? ( (lv_instances_2_0= ruleInstance ) )+ )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_container_1_0= ruleContainer ) )? ( (lv_instances_2_0= ruleInstance ) )+ )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:2: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_container_1_0= ruleContainer ) )? ( (lv_instances_2_0= ruleInstance ) )+
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:80:2: ( (lv_imports_0_0= ruleImport ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
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

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:98:3: ( (lv_container_1_0= ruleContainer ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:99:1: (lv_container_1_0= ruleContainer )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:99:1: (lv_container_1_0= ruleContainer )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:100:3: lv_container_1_0= ruleContainer
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainer_in_ruleUnit153);
                    lv_container_1_0=ruleContainer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"container",
                            		lv_container_1_0, 
                            		"Container");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:116:3: ( (lv_instances_2_0= ruleInstance ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=18 && LA3_0<=22)||LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:117:1: (lv_instances_2_0= ruleInstance )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:117:1: (lv_instances_2_0= ruleInstance )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:118:3: lv_instances_2_0= ruleInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstance_in_ruleUnit175);
            	    lv_instances_2_0=ruleInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_2_0, 
            	            		"Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:142:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:143:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:144:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue212);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue222); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:151:1: ruleValue returns [EObject current=null] : (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Instance_0 = null;

        EObject this_Array_1 = null;

        EObject this_InstanceRef_2 = null;

        EObject this_Literal_3 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:154:28: ( (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:155:1: (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:155:1: (this_Instance_0= ruleInstance | this_Array_1= ruleArray | this_InstanceRef_2= ruleInstanceRef | this_Literal_3= ruleLiteral )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case RULE_FQN:
                {
                alt4=3;
                }
                break;
            case RULE_MY_STRING:
            case RULE_NUMBER:
            case 17:
            case 29:
            case 30:
            case 31:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:156:5: this_Instance_0= ruleInstance
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getInstanceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInstance_in_ruleValue269);
                    this_Instance_0=ruleInstance();

                    state._fsp--;

                     
                            current = this_Instance_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:166:5: this_Array_1= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleValue296);
                    this_Array_1=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:176:5: this_InstanceRef_2= ruleInstanceRef
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getInstanceRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstanceRef_in_ruleValue323);
                    this_InstanceRef_2=ruleInstanceRef();

                    state._fsp--;

                     
                            current = this_InstanceRef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:186:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleValue350);
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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:202:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:203:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:204:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral385);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral395); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:211:1: ruleLiteral returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_NumberValue_3 = null;

        EObject this_EnumValue_4 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:214:28: ( (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:215:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:215:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_EnumValue_4= ruleEnumValue )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_MY_STRING:
                {
                alt5=1;
                }
                break;
            case 29:
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:216:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLiteral442);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:226:5: this_BooleanValue_1= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral469);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:236:5: this_NullValue_2= ruleNullValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNullValue_in_ruleLiteral496);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;

                     
                            current = this_NullValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:246:5: this_NumberValue_3= ruleNumberValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleLiteral523);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;

                     
                            current = this_NumberValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:256:5: this_EnumValue_4= ruleEnumValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleLiteral550);
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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:272:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:273:2: (iv_ruleImport= ruleImport EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:274:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport585);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport595); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:281:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:284:28: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:285:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:285:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:285:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_MY_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport632); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:289:1: ( (lv_name_1_0= RULE_MY_STRING ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:290:1: (lv_name_1_0= RULE_MY_STRING )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:290:1: (lv_name_1_0= RULE_MY_STRING )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:291:3: lv_name_1_0= RULE_MY_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleImport649); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:315:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:316:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:317:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer690);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer700); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:324:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:327:28: ( (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:328:1: (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:328:1: (otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:328:3: otherlv_0= 'container' ( (otherlv_1= RULE_FQN ) ) otherlv_2= '#' ( (lv_feature_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleContainer737); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:332:1: ( (otherlv_1= RULE_FQN ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:333:1: (otherlv_1= RULE_FQN )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:333:1: (otherlv_1= RULE_FQN )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:334:3: otherlv_1= RULE_FQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleContainer757); 

            		newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getInstanceInstanceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleContainer769); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getNumberSignKeyword_2());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:349:1: ( (lv_feature_3_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:350:1: (lv_feature_3_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:350:1: (lv_feature_3_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:351:3: lv_feature_3_0= RULE_ID
            {
            lv_feature_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainer786); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:375:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:376:2: (iv_ruleInstance= ruleInstance EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:377:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance827);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance837); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:384:1: ruleInstance returns [EObject current=null] : ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )* (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )* ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )? otherlv_13= 'new' ( (lv_type_14_0= RULE_ID ) ) otherlv_15= '{' ( (lv_slots_16_0= ruleSlot ) )* otherlv_17= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token lv_abstract_4_0=null;
        Token otherlv_5=null;
        Token lv_documentation_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_tags_10_0=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_type_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_slots_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:387:28: ( ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )* (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )* ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )? otherlv_13= 'new' ( (lv_type_14_0= RULE_ID ) ) otherlv_15= '{' ( (lv_slots_16_0= ruleSlot ) )* otherlv_17= '}' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:388:1: ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )* (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )* ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )? otherlv_13= 'new' ( (lv_type_14_0= RULE_ID ) ) otherlv_15= '{' ( (lv_slots_16_0= ruleSlot ) )* otherlv_17= '}' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:388:1: ( () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )* (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )* ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )? otherlv_13= 'new' ( (lv_type_14_0= RULE_ID ) ) otherlv_15= '{' ( (lv_slots_16_0= ruleSlot ) )* otherlv_17= '}' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:388:2: () (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )? (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )? (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )? (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )* (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )* ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )? otherlv_13= 'new' ( (lv_type_14_0= RULE_ID ) ) otherlv_15= '{' ( (lv_slots_16_0= ruleSlot ) )* otherlv_17= '}'
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:388:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:389:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInstanceAccess().getInstanceAction_0(),
                        current);
                

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:394:2: (otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:394:4: otherlv_1= '@title' ( (lv_title_2_0= RULE_MY_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInstance884); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getTitleKeyword_1_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:398:1: ( (lv_title_2_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:399:1: (lv_title_2_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:399:1: (lv_title_2_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:400:3: lv_title_2_0= RULE_MY_STRING
                    {
                    lv_title_2_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance901); 

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

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:416:4: (otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:416:6: otherlv_3= '@abstract' ( (lv_abstract_4_0= RULE_MY_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInstance921); 

                        	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getAbstractKeyword_2_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:420:1: ( (lv_abstract_4_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:421:1: (lv_abstract_4_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:421:1: (lv_abstract_4_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:422:3: lv_abstract_4_0= RULE_MY_STRING
                    {
                    lv_abstract_4_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance938); 

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

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:438:4: (otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:438:6: otherlv_5= '@doc' ( (lv_documentation_6_0= RULE_MY_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleInstance958); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getDocKeyword_3_0());
                        
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:442:1: ( (lv_documentation_6_0= RULE_MY_STRING ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:443:1: (lv_documentation_6_0= RULE_MY_STRING )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:443:1: (lv_documentation_6_0= RULE_MY_STRING )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:444:3: lv_documentation_6_0= RULE_MY_STRING
                    {
                    lv_documentation_6_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleInstance975); 

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

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:460:4: (otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:460:6: otherlv_7= '@see' ( (otherlv_8= RULE_FQN ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleInstance995); 

            	        	newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getSeeKeyword_4_0());
            	        
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:464:1: ( (otherlv_8= RULE_FQN ) )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:465:1: (otherlv_8= RULE_FQN )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:465:1: (otherlv_8= RULE_FQN )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:466:3: otherlv_8= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInstanceRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleInstance1015); 

            	    		newLeafNode(otherlv_8, grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:477:4: (otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:477:6: otherlv_9= '@tag' ( (lv_tags_10_0= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleInstance1030); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getTagKeyword_5_0());
            	        
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:481:1: ( (lv_tags_10_0= RULE_ID ) )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:482:1: (lv_tags_10_0= RULE_ID )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:482:1: (lv_tags_10_0= RULE_ID )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:483:3: lv_tags_10_0= RULE_ID
            	    {
            	    lv_tags_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1047); 

            	    			newLeafNode(lv_tags_10_0, grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInstanceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_10_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:499:4: ( ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '=' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:499:5: ( (lv_name_11_0= RULE_ID ) ) otherlv_12= '='
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:499:5: ( (lv_name_11_0= RULE_ID ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:500:1: (lv_name_11_0= RULE_ID )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:500:1: (lv_name_11_0= RULE_ID )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:501:3: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1072); 

                    			newLeafNode(lv_name_11_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_6_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_11_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleInstance1089); 

                        	newLeafNode(otherlv_12, grammarAccess.getInstanceAccess().getEqualsSignKeyword_6_1());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleInstance1103); 

                	newLeafNode(otherlv_13, grammarAccess.getInstanceAccess().getNewKeyword_7());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:525:1: ( (lv_type_14_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:526:1: (lv_type_14_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:526:1: (lv_type_14_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:527:3: lv_type_14_0= RULE_ID
            {
            lv_type_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1120); 

            			newLeafNode(lv_type_14_0, grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleInstance1137); 

                	newLeafNode(otherlv_15, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:547:1: ( (lv_slots_16_0= ruleSlot ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:548:1: (lv_slots_16_0= ruleSlot )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:548:1: (lv_slots_16_0= ruleSlot )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:549:3: lv_slots_16_0= ruleSlot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSlot_in_ruleInstance1158);
            	    lv_slots_16_0=ruleSlot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slots",
            	            		lv_slots_16_0, 
            	            		"Slot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleInstance1171); 

                	newLeafNode(otherlv_17, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:577:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:578:2: (iv_ruleSlot= ruleSlot EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:579:2: iv_ruleSlot= ruleSlot EOF
            {
             newCompositeNode(grammarAccess.getSlotRule()); 
            pushFollow(FOLLOW_ruleSlot_in_entryRuleSlot1207);
            iv_ruleSlot=ruleSlot();

            state._fsp--;

             current =iv_ruleSlot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlot1217); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:586:1: ruleSlot returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:589:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:590:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:590:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:590:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:590:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSlotAccess().getSlotAction_0(),
                        current);
                

            }

            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:596:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:597:1: (lv_name_1_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSlot1268); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSlot1285); 

                	newLeafNode(otherlv_2, grammarAccess.getSlotAccess().getEqualsSignKeyword_2());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:618:1: ( (lv_value_3_0= ruleValue ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:619:1: (lv_value_3_0= ruleValue )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:619:1: (lv_value_3_0= ruleValue )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:620:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getSlotAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSlot1306);
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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:644:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:645:2: (iv_ruleArray= ruleArray EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:646:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1342);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1352); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:653:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:656:28: ( (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:657:1: (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:657:1: (otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:657:3: otherlv_0= '[' ( (lv_value_1_0= ruleValue ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleArray1389); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:661:1: ( (lv_value_1_0= ruleValue ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_MY_STRING && LA13_0<=RULE_NUMBER)||(LA13_0>=17 && LA13_0<=22)||LA13_0==24||LA13_0==27||(LA13_0>=29 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:662:1: (lv_value_1_0= ruleValue )
            	    {
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:662:1: (lv_value_1_0= ruleValue )
            	    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:663:3: lv_value_1_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray1410);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleArray1423); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:691:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:692:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:693:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1459);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1469); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:700:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_MY_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:703:28: ( ( (lv_value_0_0= RULE_MY_STRING ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:704:1: ( (lv_value_0_0= RULE_MY_STRING ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:704:1: ( (lv_value_0_0= RULE_MY_STRING ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:705:1: (lv_value_0_0= RULE_MY_STRING )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:705:1: (lv_value_0_0= RULE_MY_STRING )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:706:3: lv_value_0_0= RULE_MY_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_ruleStringValue1510); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:730:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:731:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:732:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1550);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1560); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:739:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:742:28: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:743:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:743:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:743:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:743:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:744:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:744:1: (lv_value_0_0= 'true' )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:745:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,29,FOLLOW_29_in_ruleBooleanValue1603); 

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
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:759:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:759:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:760:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:760:1: (lv_value_1_0= 'false' )
                    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:761:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,30,FOLLOW_30_in_ruleBooleanValue1640); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:782:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:783:2: (iv_ruleNullValue= ruleNullValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:784:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue1689);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullValue1699); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:791:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:794:28: ( ( () otherlv_1= 'null' ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:795:1: ( () otherlv_1= 'null' )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:795:1: ( () otherlv_1= 'null' )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:795:2: () otherlv_1= 'null'
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:795:2: ()
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:796:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullValueAccess().getNullValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNullValue1745); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:813:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:814:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:815:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1781);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1791); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:822:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:825:28: ( ( (lv_value_0_0= RULE_NUMBER ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:1: ( (lv_value_0_0= RULE_NUMBER ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:826:1: ( (lv_value_0_0= RULE_NUMBER ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:827:1: (lv_value_0_0= RULE_NUMBER )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:827:1: (lv_value_0_0= RULE_NUMBER )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:828:3: lv_value_0_0= RULE_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberValue1832); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:852:1: entryRuleInstanceRef returns [EObject current=null] : iv_ruleInstanceRef= ruleInstanceRef EOF ;
    public final EObject entryRuleInstanceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceRef = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:853:2: (iv_ruleInstanceRef= ruleInstanceRef EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:854:2: iv_ruleInstanceRef= ruleInstanceRef EOF
            {
             newCompositeNode(grammarAccess.getInstanceRefRule()); 
            pushFollow(FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef1872);
            iv_ruleInstanceRef=ruleInstanceRef();

            state._fsp--;

             current =iv_ruleInstanceRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceRef1882); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:861:1: ruleInstanceRef returns [EObject current=null] : ( (otherlv_0= RULE_FQN ) ) ;
    public final EObject ruleInstanceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:864:28: ( ( (otherlv_0= RULE_FQN ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:865:1: ( (otherlv_0= RULE_FQN ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:865:1: ( (otherlv_0= RULE_FQN ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:866:1: (otherlv_0= RULE_FQN )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:866:1: (otherlv_0= RULE_FQN )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:867:3: otherlv_0= RULE_FQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_FQN,FOLLOW_RULE_FQN_in_ruleInstanceRef1926); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:886:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:887:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:888:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue1961);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue1971); 

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
    // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:895:1: ruleEnumValue returns [EObject current=null] : (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:898:28: ( (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:899:1: (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:899:1: (otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:899:3: otherlv_0= '#' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnumValue2008); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumValueAccess().getNumberSignKeyword_0());
                
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:903:1: ( (lv_value_1_0= RULE_ID ) )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:904:1: (lv_value_1_0= RULE_ID )
            {
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:904:1: (lv_value_1_0= RULE_ID )
            // ../org.ollabaca.on/src-gen/org/ollabaca/on/parser/antlr/internal/InternalObjectNotation.g:905:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumValue2025); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleUnit131 = new BitSet(new long[]{0x00000000017D8040L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleUnit153 = new BitSet(new long[]{0x00000000017D0040L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleUnit175 = new BitSet(new long[]{0x00000000017D0042L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleValue269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_ruleValue323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleValue350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLiteral442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_ruleLiteral496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleLiteral523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleLiteral550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleImport649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleContainer737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleContainer757 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContainer769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainer786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInstance884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance901 = new BitSet(new long[]{0x0000000001780040L});
    public static final BitSet FOLLOW_19_in_ruleInstance921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance938 = new BitSet(new long[]{0x0000000001700040L});
    public static final BitSet FOLLOW_20_in_ruleInstance958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleInstance975 = new BitSet(new long[]{0x0000000001600040L});
    public static final BitSet FOLLOW_21_in_ruleInstance995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleInstance1015 = new BitSet(new long[]{0x0000000001600040L});
    public static final BitSet FOLLOW_22_in_ruleInstance1030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1047 = new BitSet(new long[]{0x0000000001400040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1072 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstance1089 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInstance1103 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1120 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInstance1137 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_ruleSlot_in_ruleInstance1158 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26_in_ruleInstance1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlot_in_entryRuleSlot1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlot1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSlot1268 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSlot1285 = new BitSet(new long[]{0x00000000E97F00F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSlot1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleArray1389 = new BitSet(new long[]{0x00000000E97F00F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray1410 = new BitSet(new long[]{0x00000000F97F00F0L});
    public static final BitSet FOLLOW_28_in_ruleArray1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_ruleStringValue1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBooleanValue1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanValue1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullValue1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNullValue1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberValue1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef1872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceRef1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_ruleInstanceRef1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEnumValue2008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumValue2025 = new BitSet(new long[]{0x0000000000000002L});

}