package org.ollabaca.on.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.ollabaca.on.services.ObjectNotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalObjectNotationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MY_STRING", "RULE_FQN", "RULE_ID", "RULE_NUMBER", "RULE_LONG_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'container'", "'#'", "'new'", "'{'", "'}'", "'@title'", "'@abstract'", "'@doc'", "'@see'", "'@tag'", "'='", "'['", "']'", "'null'", "'true'", "'false'"
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
    public String getGrammarFileName() { return "../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g"; }


     
     	private ObjectNotationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ObjectNotationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleUnit"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:60:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:61:1: ( ruleUnit EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:62:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit61);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:69:1: ruleUnit : ( ( rule__Unit__Group__0 ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:73:2: ( ( ( rule__Unit__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:74:1: ( ( rule__Unit__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:74:1: ( ( rule__Unit__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:75:1: ( rule__Unit__Group__0 )
            {
             before(grammarAccess.getUnitAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:76:1: ( rule__Unit__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:76:2: rule__Unit__Group__0
            {
            pushFollow(FOLLOW_rule__Unit__Group__0_in_ruleUnit94);
            rule__Unit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:88:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:89:1: ( ruleValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:90:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue121);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:97:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:101:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:102:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:102:1: ( ( rule__Value__Alternatives ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:103:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:104:1: ( rule__Value__Alternatives )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:104:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue154);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleLiteral"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:116:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:117:1: ( ruleLiteral EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:118:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral181);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:125:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:129:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:130:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:130:1: ( ( rule__Literal__Alternatives ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:131:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:132:1: ( rule__Literal__Alternatives )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:132:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral214);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleImport"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:145:1: ( ruleImport EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:160:1: ( rule__Import__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleContainer"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:172:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:173:1: ( ruleContainer EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:174:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer301);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:181:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:185:2: ( ( ( rule__Container__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:186:1: ( ( rule__Container__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:186:1: ( ( rule__Container__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:187:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:188:1: ( rule__Container__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:188:2: rule__Container__Group__0
            {
            pushFollow(FOLLOW_rule__Container__Group__0_in_ruleContainer334);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleInstance"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:200:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:201:1: ( ruleInstance EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:202:1: ruleInstance EOF
            {
             before(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance361);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:209:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:213:2: ( ( ( rule__Instance__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:214:1: ( ( rule__Instance__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:214:1: ( ( rule__Instance__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:215:1: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:216:1: ( rule__Instance__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:216:2: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_rule__Instance__Group__0_in_ruleInstance394);
            rule__Instance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleSlot"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:228:1: entryRuleSlot : ruleSlot EOF ;
    public final void entryRuleSlot() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:229:1: ( ruleSlot EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:230:1: ruleSlot EOF
            {
             before(grammarAccess.getSlotRule()); 
            pushFollow(FOLLOW_ruleSlot_in_entryRuleSlot421);
            ruleSlot();

            state._fsp--;

             after(grammarAccess.getSlotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlot428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:237:1: ruleSlot : ( ( rule__Slot__Group__0 ) ) ;
    public final void ruleSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:241:2: ( ( ( rule__Slot__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:242:1: ( ( rule__Slot__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:242:1: ( ( rule__Slot__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:243:1: ( rule__Slot__Group__0 )
            {
             before(grammarAccess.getSlotAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:244:1: ( rule__Slot__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:244:2: rule__Slot__Group__0
            {
            pushFollow(FOLLOW_rule__Slot__Group__0_in_ruleSlot454);
            rule__Slot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleArray"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:256:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:257:1: ( ruleArray EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:258:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray481);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:265:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:269:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:270:1: ( ( rule__Array__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:270:1: ( ( rule__Array__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:271:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:272:1: ( rule__Array__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:272:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray514);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleStringValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:284:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:285:1: ( ruleStringValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:286:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue541);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:293:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:297:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:298:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:298:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:299:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:300:1: ( rule__StringValue__ValueAssignment )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:300:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue574);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:312:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:313:1: ( ruleBooleanValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:314:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue601);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:321:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:325:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:326:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:326:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:327:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:328:1: ( rule__BooleanValue__Alternatives )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:328:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue634);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNullValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:340:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:341:1: ( ruleNullValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:342:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue661);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullValue668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:349:1: ruleNullValue : ( ( rule__NullValue__Group__0 ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:353:2: ( ( ( rule__NullValue__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:354:1: ( ( rule__NullValue__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:354:1: ( ( rule__NullValue__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:355:1: ( rule__NullValue__Group__0 )
            {
             before(grammarAccess.getNullValueAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:356:1: ( rule__NullValue__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:356:2: rule__NullValue__Group__0
            {
            pushFollow(FOLLOW_rule__NullValue__Group__0_in_ruleNullValue694);
            rule__NullValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:368:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:369:1: ( ruleNumberValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:370:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue721);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:377:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:381:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:382:1: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:382:1: ( ( rule__NumberValue__ValueAssignment ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:383:1: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:384:1: ( rule__NumberValue__ValueAssignment )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:384:2: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue754);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleInstanceRef"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:396:1: entryRuleInstanceRef : ruleInstanceRef EOF ;
    public final void entryRuleInstanceRef() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:397:1: ( ruleInstanceRef EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:398:1: ruleInstanceRef EOF
            {
             before(grammarAccess.getInstanceRefRule()); 
            pushFollow(FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef781);
            ruleInstanceRef();

            state._fsp--;

             after(grammarAccess.getInstanceRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceRef788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceRef"


    // $ANTLR start "ruleInstanceRef"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:405:1: ruleInstanceRef : ( ( rule__InstanceRef__ValueAssignment ) ) ;
    public final void ruleInstanceRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:409:2: ( ( ( rule__InstanceRef__ValueAssignment ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:410:1: ( ( rule__InstanceRef__ValueAssignment ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:410:1: ( ( rule__InstanceRef__ValueAssignment ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:411:1: ( rule__InstanceRef__ValueAssignment )
            {
             before(grammarAccess.getInstanceRefAccess().getValueAssignment()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:412:1: ( rule__InstanceRef__ValueAssignment )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:412:2: rule__InstanceRef__ValueAssignment
            {
            pushFollow(FOLLOW_rule__InstanceRef__ValueAssignment_in_ruleInstanceRef814);
            rule__InstanceRef__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstanceRefAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceRef"


    // $ANTLR start "entryRuleEnumValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:424:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:425:1: ( ruleEnumValue EOF )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:426:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue841);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:433:1: ruleEnumValue : ( ( rule__EnumValue__Group__0 ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:437:2: ( ( ( rule__EnumValue__Group__0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:438:1: ( ( rule__EnumValue__Group__0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:438:1: ( ( rule__EnumValue__Group__0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:439:1: ( rule__EnumValue__Group__0 )
            {
             before(grammarAccess.getEnumValueAccess().getGroup()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:440:1: ( rule__EnumValue__Group__0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:440:2: rule__EnumValue__Group__0
            {
            pushFollow(FOLLOW_rule__EnumValue__Group__0_in_ruleEnumValue874);
            rule__EnumValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:454:1: rule__Value__Alternatives : ( ( ruleInstance ) | ( ruleArray ) | ( ruleInstanceRef ) | ( ruleLiteral ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:458:1: ( ( ruleInstance ) | ( ruleArray ) | ( ruleInstanceRef ) | ( ruleLiteral ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case RULE_FQN:
                {
                alt1=3;
                }
                break;
            case RULE_MY_STRING:
            case RULE_NUMBER:
            case 17:
            case 29:
            case 30:
            case 31:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:459:1: ( ruleInstance )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:459:1: ( ruleInstance )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:460:1: ruleInstance
                    {
                     before(grammarAccess.getValueAccess().getInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInstance_in_rule__Value__Alternatives912);
                    ruleInstance();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:465:6: ( ruleArray )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:465:6: ( ruleArray )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:466:1: ruleArray
                    {
                     before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArray_in_rule__Value__Alternatives929);
                    ruleArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:471:6: ( ruleInstanceRef )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:471:6: ( ruleInstanceRef )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:472:1: ruleInstanceRef
                    {
                     before(grammarAccess.getValueAccess().getInstanceRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInstanceRef_in_rule__Value__Alternatives946);
                    ruleInstanceRef();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getInstanceRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:477:6: ( ruleLiteral )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:477:6: ( ruleLiteral )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:478:1: ruleLiteral
                    {
                     before(grammarAccess.getValueAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Value__Alternatives963);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:488:1: rule__Literal__Alternatives : ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleEnumValue ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:492:1: ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleEnumValue ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_MY_STRING:
                {
                alt2=1;
                }
                break;
            case 30:
            case 31:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt2=4;
                }
                break;
            case 17:
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
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:493:1: ( ruleStringValue )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:493:1: ( ruleStringValue )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:494:1: ruleStringValue
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Literal__Alternatives995);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:499:6: ( ruleBooleanValue )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:499:6: ( ruleBooleanValue )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:500:1: ruleBooleanValue
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__Alternatives1012);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:505:6: ( ruleNullValue )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:505:6: ( ruleNullValue )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:506:1: ruleNullValue
                    {
                     before(grammarAccess.getLiteralAccess().getNullValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullValue_in_rule__Literal__Alternatives1029);
                    ruleNullValue();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNullValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:511:6: ( ruleNumberValue )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:511:6: ( ruleNumberValue )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:512:1: ruleNumberValue
                    {
                     before(grammarAccess.getLiteralAccess().getNumberValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__Literal__Alternatives1046);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:517:6: ( ruleEnumValue )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:517:6: ( ruleEnumValue )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:518:1: ruleEnumValue
                    {
                     before(grammarAccess.getLiteralAccess().getEnumValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumValue_in_rule__Literal__Alternatives1063);
                    ruleEnumValue();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getEnumValueParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:528:1: rule__BooleanValue__Alternatives : ( ( ( rule__BooleanValue__ValueAssignment_0 ) ) | ( ( rule__BooleanValue__ValueAssignment_1 ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:532:1: ( ( ( rule__BooleanValue__ValueAssignment_0 ) ) | ( ( rule__BooleanValue__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:533:1: ( ( rule__BooleanValue__ValueAssignment_0 ) )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:533:1: ( ( rule__BooleanValue__ValueAssignment_0 ) )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:534:1: ( rule__BooleanValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueAssignment_0()); 
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:535:1: ( rule__BooleanValue__ValueAssignment_0 )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:535:2: rule__BooleanValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_0_in_rule__BooleanValue__Alternatives1095);
                    rule__BooleanValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:539:6: ( ( rule__BooleanValue__ValueAssignment_1 ) )
                    {
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:539:6: ( ( rule__BooleanValue__ValueAssignment_1 ) )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:540:1: ( rule__BooleanValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueAssignment_1()); 
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:541:1: ( rule__BooleanValue__ValueAssignment_1 )
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:541:2: rule__BooleanValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_1_in_rule__BooleanValue__Alternatives1113);
                    rule__BooleanValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__Unit__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:553:1: rule__Unit__Group__0 : rule__Unit__Group__0__Impl rule__Unit__Group__1 ;
    public final void rule__Unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:557:1: ( rule__Unit__Group__0__Impl rule__Unit__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:558:2: rule__Unit__Group__0__Impl rule__Unit__Group__1
            {
            pushFollow(FOLLOW_rule__Unit__Group__0__Impl_in_rule__Unit__Group__01145);
            rule__Unit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unit__Group__1_in_rule__Unit__Group__01148);
            rule__Unit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__0"


    // $ANTLR start "rule__Unit__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:565:1: rule__Unit__Group__0__Impl : ( ( ( rule__Unit__ImportsAssignment_0 ) ) ( ( rule__Unit__ImportsAssignment_0 )* ) ) ;
    public final void rule__Unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:569:1: ( ( ( ( rule__Unit__ImportsAssignment_0 ) ) ( ( rule__Unit__ImportsAssignment_0 )* ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:570:1: ( ( ( rule__Unit__ImportsAssignment_0 ) ) ( ( rule__Unit__ImportsAssignment_0 )* ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:570:1: ( ( ( rule__Unit__ImportsAssignment_0 ) ) ( ( rule__Unit__ImportsAssignment_0 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:571:1: ( ( rule__Unit__ImportsAssignment_0 ) ) ( ( rule__Unit__ImportsAssignment_0 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:571:1: ( ( rule__Unit__ImportsAssignment_0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:572:1: ( rule__Unit__ImportsAssignment_0 )
            {
             before(grammarAccess.getUnitAccess().getImportsAssignment_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:573:1: ( rule__Unit__ImportsAssignment_0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:573:2: rule__Unit__ImportsAssignment_0
            {
            pushFollow(FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1177);
            rule__Unit__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getImportsAssignment_0()); 

            }

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:576:1: ( ( rule__Unit__ImportsAssignment_0 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:577:1: ( rule__Unit__ImportsAssignment_0 )*
            {
             before(grammarAccess.getUnitAccess().getImportsAssignment_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:578:1: ( rule__Unit__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:578:2: rule__Unit__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1189);
            	    rule__Unit__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUnitAccess().getImportsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__0__Impl"


    // $ANTLR start "rule__Unit__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:589:1: rule__Unit__Group__1 : rule__Unit__Group__1__Impl rule__Unit__Group__2 ;
    public final void rule__Unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:593:1: ( rule__Unit__Group__1__Impl rule__Unit__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:594:2: rule__Unit__Group__1__Impl rule__Unit__Group__2
            {
            pushFollow(FOLLOW_rule__Unit__Group__1__Impl_in_rule__Unit__Group__11222);
            rule__Unit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unit__Group__2_in_rule__Unit__Group__11225);
            rule__Unit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__1"


    // $ANTLR start "rule__Unit__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:601:1: rule__Unit__Group__1__Impl : ( ( rule__Unit__ContainerAssignment_1 )? ) ;
    public final void rule__Unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:605:1: ( ( ( rule__Unit__ContainerAssignment_1 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:606:1: ( ( rule__Unit__ContainerAssignment_1 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:606:1: ( ( rule__Unit__ContainerAssignment_1 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:607:1: ( rule__Unit__ContainerAssignment_1 )?
            {
             before(grammarAccess.getUnitAccess().getContainerAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:608:1: ( rule__Unit__ContainerAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:608:2: rule__Unit__ContainerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Unit__ContainerAssignment_1_in_rule__Unit__Group__1__Impl1252);
                    rule__Unit__ContainerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitAccess().getContainerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__1__Impl"


    // $ANTLR start "rule__Unit__Group__2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:618:1: rule__Unit__Group__2 : rule__Unit__Group__2__Impl ;
    public final void rule__Unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:622:1: ( rule__Unit__Group__2__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:623:2: rule__Unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Unit__Group__2__Impl_in_rule__Unit__Group__21283);
            rule__Unit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__2"


    // $ANTLR start "rule__Unit__Group__2__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:629:1: rule__Unit__Group__2__Impl : ( ( ( rule__Unit__InstancesAssignment_2 ) ) ( ( rule__Unit__InstancesAssignment_2 )* ) ) ;
    public final void rule__Unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:633:1: ( ( ( ( rule__Unit__InstancesAssignment_2 ) ) ( ( rule__Unit__InstancesAssignment_2 )* ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:634:1: ( ( ( rule__Unit__InstancesAssignment_2 ) ) ( ( rule__Unit__InstancesAssignment_2 )* ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:634:1: ( ( ( rule__Unit__InstancesAssignment_2 ) ) ( ( rule__Unit__InstancesAssignment_2 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:635:1: ( ( rule__Unit__InstancesAssignment_2 ) ) ( ( rule__Unit__InstancesAssignment_2 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:635:1: ( ( rule__Unit__InstancesAssignment_2 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:636:1: ( rule__Unit__InstancesAssignment_2 )
            {
             before(grammarAccess.getUnitAccess().getInstancesAssignment_2()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:637:1: ( rule__Unit__InstancesAssignment_2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:637:2: rule__Unit__InstancesAssignment_2
            {
            pushFollow(FOLLOW_rule__Unit__InstancesAssignment_2_in_rule__Unit__Group__2__Impl1312);
            rule__Unit__InstancesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getInstancesAssignment_2()); 

            }

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:640:1: ( ( rule__Unit__InstancesAssignment_2 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:641:1: ( rule__Unit__InstancesAssignment_2 )*
            {
             before(grammarAccess.getUnitAccess().getInstancesAssignment_2()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:642:1: ( rule__Unit__InstancesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==18||(LA6_0>=21 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:642:2: rule__Unit__InstancesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Unit__InstancesAssignment_2_in_rule__Unit__Group__2__Impl1324);
            	    rule__Unit__InstancesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUnitAccess().getInstancesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:659:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:663:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:664:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01363);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01366);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:671:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:675:1: ( ( 'import' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:676:1: ( 'import' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:676:1: ( 'import' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:677:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1394); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:690:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:694:1: ( rule__Import__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:695:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11425);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:701:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:705:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:706:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:706:1: ( ( rule__Import__NameAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:707:1: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:708:1: ( rule__Import__NameAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:708:2: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__NameAssignment_1_in_rule__Import__Group__1__Impl1452);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:722:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:726:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:727:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__01486);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__1_in_rule__Container__Group__01489);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:734:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:738:1: ( ( 'container' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:739:1: ( 'container' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:739:1: ( 'container' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:740:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Container__Group__0__Impl1517); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:753:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:757:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:758:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__11548);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__2_in_rule__Container__Group__11551);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:765:1: rule__Container__Group__1__Impl : ( ( rule__Container__InstanceAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:769:1: ( ( ( rule__Container__InstanceAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:770:1: ( ( rule__Container__InstanceAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:770:1: ( ( rule__Container__InstanceAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:771:1: ( rule__Container__InstanceAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getInstanceAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:772:1: ( rule__Container__InstanceAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:772:2: rule__Container__InstanceAssignment_1
            {
            pushFollow(FOLLOW_rule__Container__InstanceAssignment_1_in_rule__Container__Group__1__Impl1578);
            rule__Container__InstanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getInstanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:782:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:786:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:787:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__21608);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__3_in_rule__Container__Group__21611);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:794:1: rule__Container__Group__2__Impl : ( '#' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:798:1: ( ( '#' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:799:1: ( '#' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:799:1: ( '#' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:800:1: '#'
            {
             before(grammarAccess.getContainerAccess().getNumberSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Container__Group__2__Impl1639); 
             after(grammarAccess.getContainerAccess().getNumberSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:813:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:817:1: ( rule__Container__Group__3__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:818:2: rule__Container__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__31670);
            rule__Container__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:824:1: rule__Container__Group__3__Impl : ( ( rule__Container__FeatureAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:828:1: ( ( ( rule__Container__FeatureAssignment_3 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:829:1: ( ( rule__Container__FeatureAssignment_3 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:829:1: ( ( rule__Container__FeatureAssignment_3 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:830:1: ( rule__Container__FeatureAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getFeatureAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:831:1: ( rule__Container__FeatureAssignment_3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:831:2: rule__Container__FeatureAssignment_3
            {
            pushFollow(FOLLOW_rule__Container__FeatureAssignment_3_in_rule__Container__Group__3__Impl1697);
            rule__Container__FeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:849:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:853:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:854:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__01735);
            rule__Instance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__01738);
            rule__Instance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0"


    // $ANTLR start "rule__Instance__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:861:1: rule__Instance__Group__0__Impl : ( () ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:865:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:866:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:866:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:867:1: ()
            {
             before(grammarAccess.getInstanceAccess().getInstanceAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:868:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:870:1: 
            {
            }

             after(grammarAccess.getInstanceAccess().getInstanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:880:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:884:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:885:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__11796);
            rule__Instance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__11799);
            rule__Instance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1"


    // $ANTLR start "rule__Instance__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:892:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__Group_1__0 )? ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:896:1: ( ( ( rule__Instance__Group_1__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:897:1: ( ( rule__Instance__Group_1__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:897:1: ( ( rule__Instance__Group_1__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:898:1: ( rule__Instance__Group_1__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:899:1: ( rule__Instance__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:899:2: rule__Instance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_1__0_in_rule__Instance__Group__1__Impl1826);
                    rule__Instance__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:909:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:913:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:914:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__21857);
            rule__Instance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__21860);
            rule__Instance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2"


    // $ANTLR start "rule__Instance__Group__2__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:921:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__Group_2__0 )? ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:925:1: ( ( ( rule__Instance__Group_2__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:926:1: ( ( rule__Instance__Group_2__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:926:1: ( ( rule__Instance__Group_2__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:927:1: ( rule__Instance__Group_2__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_2()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:928:1: ( rule__Instance__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:928:2: rule__Instance__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_2__0_in_rule__Instance__Group__2__Impl1887);
                    rule__Instance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:938:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:942:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:943:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__31918);
            rule__Instance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__4_in_rule__Instance__Group__31921);
            rule__Instance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3"


    // $ANTLR start "rule__Instance__Group__3__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:950:1: rule__Instance__Group__3__Impl : ( ( rule__Instance__Group_3__0 )? ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:954:1: ( ( ( rule__Instance__Group_3__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:955:1: ( ( rule__Instance__Group_3__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:955:1: ( ( rule__Instance__Group_3__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:956:1: ( rule__Instance__Group_3__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:957:1: ( rule__Instance__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:957:2: rule__Instance__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl1948);
                    rule__Instance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3__Impl"


    // $ANTLR start "rule__Instance__Group__4"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:967:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:971:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:972:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_rule__Instance__Group__4__Impl_in_rule__Instance__Group__41979);
            rule__Instance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__5_in_rule__Instance__Group__41982);
            rule__Instance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4"


    // $ANTLR start "rule__Instance__Group__4__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:979:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__Group_4__0 )* ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:983:1: ( ( ( rule__Instance__Group_4__0 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:984:1: ( ( rule__Instance__Group_4__0 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:984:1: ( ( rule__Instance__Group_4__0 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:985:1: ( rule__Instance__Group_4__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_4()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:986:1: ( rule__Instance__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:986:2: rule__Instance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Instance__Group_4__0_in_rule__Instance__Group__4__Impl2009);
            	    rule__Instance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4__Impl"


    // $ANTLR start "rule__Instance__Group__5"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:996:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1000:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1001:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_rule__Instance__Group__5__Impl_in_rule__Instance__Group__52040);
            rule__Instance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__6_in_rule__Instance__Group__52043);
            rule__Instance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5"


    // $ANTLR start "rule__Instance__Group__5__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1008:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1012:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1013:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1013:1: ( ( rule__Instance__Group_5__0 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1014:1: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1015:1: ( rule__Instance__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1015:2: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Instance__Group_5__0_in_rule__Instance__Group__5__Impl2070);
            	    rule__Instance__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5__Impl"


    // $ANTLR start "rule__Instance__Group__6"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1025:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl rule__Instance__Group__7 ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1029:1: ( rule__Instance__Group__6__Impl rule__Instance__Group__7 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1030:2: rule__Instance__Group__6__Impl rule__Instance__Group__7
            {
            pushFollow(FOLLOW_rule__Instance__Group__6__Impl_in_rule__Instance__Group__62101);
            rule__Instance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__7_in_rule__Instance__Group__62104);
            rule__Instance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6"


    // $ANTLR start "rule__Instance__Group__6__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1037:1: rule__Instance__Group__6__Impl : ( ( rule__Instance__Group_6__0 )? ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1041:1: ( ( ( rule__Instance__Group_6__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1042:1: ( ( rule__Instance__Group_6__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1042:1: ( ( rule__Instance__Group_6__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1043:1: ( rule__Instance__Group_6__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_6()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1044:1: ( rule__Instance__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1044:2: rule__Instance__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_6__0_in_rule__Instance__Group__6__Impl2131);
                    rule__Instance__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6__Impl"


    // $ANTLR start "rule__Instance__Group__7"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1054:1: rule__Instance__Group__7 : rule__Instance__Group__7__Impl rule__Instance__Group__8 ;
    public final void rule__Instance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1058:1: ( rule__Instance__Group__7__Impl rule__Instance__Group__8 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1059:2: rule__Instance__Group__7__Impl rule__Instance__Group__8
            {
            pushFollow(FOLLOW_rule__Instance__Group__7__Impl_in_rule__Instance__Group__72162);
            rule__Instance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__8_in_rule__Instance__Group__72165);
            rule__Instance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__7"


    // $ANTLR start "rule__Instance__Group__7__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1066:1: rule__Instance__Group__7__Impl : ( 'new' ) ;
    public final void rule__Instance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1070:1: ( ( 'new' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1071:1: ( 'new' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1071:1: ( 'new' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1072:1: 'new'
            {
             before(grammarAccess.getInstanceAccess().getNewKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Instance__Group__7__Impl2193); 
             after(grammarAccess.getInstanceAccess().getNewKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__7__Impl"


    // $ANTLR start "rule__Instance__Group__8"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1085:1: rule__Instance__Group__8 : rule__Instance__Group__8__Impl rule__Instance__Group__9 ;
    public final void rule__Instance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1089:1: ( rule__Instance__Group__8__Impl rule__Instance__Group__9 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1090:2: rule__Instance__Group__8__Impl rule__Instance__Group__9
            {
            pushFollow(FOLLOW_rule__Instance__Group__8__Impl_in_rule__Instance__Group__82224);
            rule__Instance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__9_in_rule__Instance__Group__82227);
            rule__Instance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__8"


    // $ANTLR start "rule__Instance__Group__8__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1097:1: rule__Instance__Group__8__Impl : ( ( rule__Instance__TypeAssignment_8 ) ) ;
    public final void rule__Instance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1101:1: ( ( ( rule__Instance__TypeAssignment_8 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1102:1: ( ( rule__Instance__TypeAssignment_8 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1102:1: ( ( rule__Instance__TypeAssignment_8 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1103:1: ( rule__Instance__TypeAssignment_8 )
            {
             before(grammarAccess.getInstanceAccess().getTypeAssignment_8()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1104:1: ( rule__Instance__TypeAssignment_8 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1104:2: rule__Instance__TypeAssignment_8
            {
            pushFollow(FOLLOW_rule__Instance__TypeAssignment_8_in_rule__Instance__Group__8__Impl2254);
            rule__Instance__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__8__Impl"


    // $ANTLR start "rule__Instance__Group__9"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1114:1: rule__Instance__Group__9 : rule__Instance__Group__9__Impl rule__Instance__Group__10 ;
    public final void rule__Instance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1118:1: ( rule__Instance__Group__9__Impl rule__Instance__Group__10 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1119:2: rule__Instance__Group__9__Impl rule__Instance__Group__10
            {
            pushFollow(FOLLOW_rule__Instance__Group__9__Impl_in_rule__Instance__Group__92284);
            rule__Instance__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__10_in_rule__Instance__Group__92287);
            rule__Instance__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__9"


    // $ANTLR start "rule__Instance__Group__9__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1126:1: rule__Instance__Group__9__Impl : ( '{' ) ;
    public final void rule__Instance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1130:1: ( ( '{' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1131:1: ( '{' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1131:1: ( '{' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1132:1: '{'
            {
             before(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_19_in_rule__Instance__Group__9__Impl2315); 
             after(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__9__Impl"


    // $ANTLR start "rule__Instance__Group__10"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1145:1: rule__Instance__Group__10 : rule__Instance__Group__10__Impl rule__Instance__Group__11 ;
    public final void rule__Instance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1149:1: ( rule__Instance__Group__10__Impl rule__Instance__Group__11 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1150:2: rule__Instance__Group__10__Impl rule__Instance__Group__11
            {
            pushFollow(FOLLOW_rule__Instance__Group__10__Impl_in_rule__Instance__Group__102346);
            rule__Instance__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__11_in_rule__Instance__Group__102349);
            rule__Instance__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__10"


    // $ANTLR start "rule__Instance__Group__10__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1157:1: rule__Instance__Group__10__Impl : ( ( rule__Instance__SlotsAssignment_10 )* ) ;
    public final void rule__Instance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1161:1: ( ( ( rule__Instance__SlotsAssignment_10 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1162:1: ( ( rule__Instance__SlotsAssignment_10 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1162:1: ( ( rule__Instance__SlotsAssignment_10 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1163:1: ( rule__Instance__SlotsAssignment_10 )*
            {
             before(grammarAccess.getInstanceAccess().getSlotsAssignment_10()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1164:1: ( rule__Instance__SlotsAssignment_10 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1164:2: rule__Instance__SlotsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Instance__SlotsAssignment_10_in_rule__Instance__Group__10__Impl2376);
            	    rule__Instance__SlotsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getSlotsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__10__Impl"


    // $ANTLR start "rule__Instance__Group__11"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1174:1: rule__Instance__Group__11 : rule__Instance__Group__11__Impl ;
    public final void rule__Instance__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1178:1: ( rule__Instance__Group__11__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1179:2: rule__Instance__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group__11__Impl_in_rule__Instance__Group__112407);
            rule__Instance__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__11"


    // $ANTLR start "rule__Instance__Group__11__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1185:1: rule__Instance__Group__11__Impl : ( '}' ) ;
    public final void rule__Instance__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1189:1: ( ( '}' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1190:1: ( '}' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1190:1: ( '}' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1191:1: '}'
            {
             before(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_20_in_rule__Instance__Group__11__Impl2435); 
             after(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__11__Impl"


    // $ANTLR start "rule__Instance__Group_1__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1228:1: rule__Instance__Group_1__0 : rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1 ;
    public final void rule__Instance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1232:1: ( rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1233:2: rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_1__0__Impl_in_rule__Instance__Group_1__02490);
            rule__Instance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_1__1_in_rule__Instance__Group_1__02493);
            rule__Instance__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_1__0"


    // $ANTLR start "rule__Instance__Group_1__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1240:1: rule__Instance__Group_1__0__Impl : ( '@title' ) ;
    public final void rule__Instance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1244:1: ( ( '@title' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1245:1: ( '@title' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1245:1: ( '@title' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1246:1: '@title'
            {
             before(grammarAccess.getInstanceAccess().getTitleKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Instance__Group_1__0__Impl2521); 
             after(grammarAccess.getInstanceAccess().getTitleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_1__0__Impl"


    // $ANTLR start "rule__Instance__Group_1__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1259:1: rule__Instance__Group_1__1 : rule__Instance__Group_1__1__Impl ;
    public final void rule__Instance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1263:1: ( rule__Instance__Group_1__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1264:2: rule__Instance__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_1__1__Impl_in_rule__Instance__Group_1__12552);
            rule__Instance__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_1__1"


    // $ANTLR start "rule__Instance__Group_1__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1270:1: rule__Instance__Group_1__1__Impl : ( ( rule__Instance__TitleAssignment_1_1 ) ) ;
    public final void rule__Instance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1274:1: ( ( ( rule__Instance__TitleAssignment_1_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1275:1: ( ( rule__Instance__TitleAssignment_1_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1275:1: ( ( rule__Instance__TitleAssignment_1_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1276:1: ( rule__Instance__TitleAssignment_1_1 )
            {
             before(grammarAccess.getInstanceAccess().getTitleAssignment_1_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1277:1: ( rule__Instance__TitleAssignment_1_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1277:2: rule__Instance__TitleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Instance__TitleAssignment_1_1_in_rule__Instance__Group_1__1__Impl2579);
            rule__Instance__TitleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTitleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_1__1__Impl"


    // $ANTLR start "rule__Instance__Group_2__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1291:1: rule__Instance__Group_2__0 : rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1 ;
    public final void rule__Instance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1295:1: ( rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1296:2: rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_2__0__Impl_in_rule__Instance__Group_2__02613);
            rule__Instance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_2__1_in_rule__Instance__Group_2__02616);
            rule__Instance__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_2__0"


    // $ANTLR start "rule__Instance__Group_2__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1303:1: rule__Instance__Group_2__0__Impl : ( '@abstract' ) ;
    public final void rule__Instance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1307:1: ( ( '@abstract' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1308:1: ( '@abstract' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1308:1: ( '@abstract' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1309:1: '@abstract'
            {
             before(grammarAccess.getInstanceAccess().getAbstractKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Instance__Group_2__0__Impl2644); 
             after(grammarAccess.getInstanceAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_2__0__Impl"


    // $ANTLR start "rule__Instance__Group_2__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1322:1: rule__Instance__Group_2__1 : rule__Instance__Group_2__1__Impl ;
    public final void rule__Instance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1326:1: ( rule__Instance__Group_2__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1327:2: rule__Instance__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_2__1__Impl_in_rule__Instance__Group_2__12675);
            rule__Instance__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_2__1"


    // $ANTLR start "rule__Instance__Group_2__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1333:1: rule__Instance__Group_2__1__Impl : ( ( rule__Instance__AbstractAssignment_2_1 ) ) ;
    public final void rule__Instance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1337:1: ( ( ( rule__Instance__AbstractAssignment_2_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1338:1: ( ( rule__Instance__AbstractAssignment_2_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1338:1: ( ( rule__Instance__AbstractAssignment_2_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1339:1: ( rule__Instance__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getInstanceAccess().getAbstractAssignment_2_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1340:1: ( rule__Instance__AbstractAssignment_2_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1340:2: rule__Instance__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Instance__AbstractAssignment_2_1_in_rule__Instance__Group_2__1__Impl2702);
            rule__Instance__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_2__1__Impl"


    // $ANTLR start "rule__Instance__Group_3__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1354:1: rule__Instance__Group_3__0 : rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 ;
    public final void rule__Instance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1358:1: ( rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1359:2: rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__02736);
            rule__Instance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__02739);
            rule__Instance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3__0"


    // $ANTLR start "rule__Instance__Group_3__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1366:1: rule__Instance__Group_3__0__Impl : ( '@doc' ) ;
    public final void rule__Instance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1370:1: ( ( '@doc' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1371:1: ( '@doc' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1371:1: ( '@doc' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1372:1: '@doc'
            {
             before(grammarAccess.getInstanceAccess().getDocKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Instance__Group_3__0__Impl2767); 
             after(grammarAccess.getInstanceAccess().getDocKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3__0__Impl"


    // $ANTLR start "rule__Instance__Group_3__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1385:1: rule__Instance__Group_3__1 : rule__Instance__Group_3__1__Impl ;
    public final void rule__Instance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1389:1: ( rule__Instance__Group_3__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1390:2: rule__Instance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__12798);
            rule__Instance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3__1"


    // $ANTLR start "rule__Instance__Group_3__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1396:1: rule__Instance__Group_3__1__Impl : ( ( rule__Instance__DocumentationAssignment_3_1 ) ) ;
    public final void rule__Instance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1400:1: ( ( ( rule__Instance__DocumentationAssignment_3_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1401:1: ( ( rule__Instance__DocumentationAssignment_3_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1401:1: ( ( rule__Instance__DocumentationAssignment_3_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1402:1: ( rule__Instance__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getInstanceAccess().getDocumentationAssignment_3_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1403:1: ( rule__Instance__DocumentationAssignment_3_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1403:2: rule__Instance__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Instance__DocumentationAssignment_3_1_in_rule__Instance__Group_3__1__Impl2825);
            rule__Instance__DocumentationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getDocumentationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3__1__Impl"


    // $ANTLR start "rule__Instance__Group_4__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1417:1: rule__Instance__Group_4__0 : rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1 ;
    public final void rule__Instance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1421:1: ( rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1422:2: rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_4__0__Impl_in_rule__Instance__Group_4__02859);
            rule__Instance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_4__1_in_rule__Instance__Group_4__02862);
            rule__Instance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_4__0"


    // $ANTLR start "rule__Instance__Group_4__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1429:1: rule__Instance__Group_4__0__Impl : ( '@see' ) ;
    public final void rule__Instance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1433:1: ( ( '@see' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1434:1: ( '@see' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1434:1: ( '@see' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1435:1: '@see'
            {
             before(grammarAccess.getInstanceAccess().getSeeKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Instance__Group_4__0__Impl2890); 
             after(grammarAccess.getInstanceAccess().getSeeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_4__0__Impl"


    // $ANTLR start "rule__Instance__Group_4__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1448:1: rule__Instance__Group_4__1 : rule__Instance__Group_4__1__Impl ;
    public final void rule__Instance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1452:1: ( rule__Instance__Group_4__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1453:2: rule__Instance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_4__1__Impl_in_rule__Instance__Group_4__12921);
            rule__Instance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_4__1"


    // $ANTLR start "rule__Instance__Group_4__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1459:1: rule__Instance__Group_4__1__Impl : ( ( rule__Instance__SeeAssignment_4_1 ) ) ;
    public final void rule__Instance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1463:1: ( ( ( rule__Instance__SeeAssignment_4_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1464:1: ( ( rule__Instance__SeeAssignment_4_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1464:1: ( ( rule__Instance__SeeAssignment_4_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1465:1: ( rule__Instance__SeeAssignment_4_1 )
            {
             before(grammarAccess.getInstanceAccess().getSeeAssignment_4_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1466:1: ( rule__Instance__SeeAssignment_4_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1466:2: rule__Instance__SeeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Instance__SeeAssignment_4_1_in_rule__Instance__Group_4__1__Impl2948);
            rule__Instance__SeeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getSeeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_4__1__Impl"


    // $ANTLR start "rule__Instance__Group_5__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1480:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1484:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1485:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_5__0__Impl_in_rule__Instance__Group_5__02982);
            rule__Instance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_5__1_in_rule__Instance__Group_5__02985);
            rule__Instance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__0"


    // $ANTLR start "rule__Instance__Group_5__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1492:1: rule__Instance__Group_5__0__Impl : ( '@tag' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1496:1: ( ( '@tag' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1497:1: ( '@tag' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1497:1: ( '@tag' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1498:1: '@tag'
            {
             before(grammarAccess.getInstanceAccess().getTagKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Instance__Group_5__0__Impl3013); 
             after(grammarAccess.getInstanceAccess().getTagKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__0__Impl"


    // $ANTLR start "rule__Instance__Group_5__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1511:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1515:1: ( rule__Instance__Group_5__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1516:2: rule__Instance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_5__1__Impl_in_rule__Instance__Group_5__13044);
            rule__Instance__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__1"


    // $ANTLR start "rule__Instance__Group_5__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1522:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__TagsAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1526:1: ( ( ( rule__Instance__TagsAssignment_5_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1527:1: ( ( rule__Instance__TagsAssignment_5_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1527:1: ( ( rule__Instance__TagsAssignment_5_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1528:1: ( rule__Instance__TagsAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getTagsAssignment_5_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1529:1: ( rule__Instance__TagsAssignment_5_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1529:2: rule__Instance__TagsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Instance__TagsAssignment_5_1_in_rule__Instance__Group_5__1__Impl3071);
            rule__Instance__TagsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTagsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__1__Impl"


    // $ANTLR start "rule__Instance__Group_6__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1543:1: rule__Instance__Group_6__0 : rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1 ;
    public final void rule__Instance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1547:1: ( rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1548:2: rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_6__0__Impl_in_rule__Instance__Group_6__03105);
            rule__Instance__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_6__1_in_rule__Instance__Group_6__03108);
            rule__Instance__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_6__0"


    // $ANTLR start "rule__Instance__Group_6__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1555:1: rule__Instance__Group_6__0__Impl : ( ( rule__Instance__NameAssignment_6_0 ) ) ;
    public final void rule__Instance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1559:1: ( ( ( rule__Instance__NameAssignment_6_0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1560:1: ( ( rule__Instance__NameAssignment_6_0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1560:1: ( ( rule__Instance__NameAssignment_6_0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1561:1: ( rule__Instance__NameAssignment_6_0 )
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_6_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1562:1: ( rule__Instance__NameAssignment_6_0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1562:2: rule__Instance__NameAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Instance__NameAssignment_6_0_in_rule__Instance__Group_6__0__Impl3135);
            rule__Instance__NameAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_6__0__Impl"


    // $ANTLR start "rule__Instance__Group_6__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1572:1: rule__Instance__Group_6__1 : rule__Instance__Group_6__1__Impl ;
    public final void rule__Instance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1576:1: ( rule__Instance__Group_6__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1577:2: rule__Instance__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_6__1__Impl_in_rule__Instance__Group_6__13165);
            rule__Instance__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_6__1"


    // $ANTLR start "rule__Instance__Group_6__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1583:1: rule__Instance__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Instance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1587:1: ( ( '=' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1588:1: ( '=' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1588:1: ( '=' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1589:1: '='
            {
             before(grammarAccess.getInstanceAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_26_in_rule__Instance__Group_6__1__Impl3193); 
             after(grammarAccess.getInstanceAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_6__1__Impl"


    // $ANTLR start "rule__Slot__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1606:1: rule__Slot__Group__0 : rule__Slot__Group__0__Impl rule__Slot__Group__1 ;
    public final void rule__Slot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1610:1: ( rule__Slot__Group__0__Impl rule__Slot__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1611:2: rule__Slot__Group__0__Impl rule__Slot__Group__1
            {
            pushFollow(FOLLOW_rule__Slot__Group__0__Impl_in_rule__Slot__Group__03228);
            rule__Slot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__1_in_rule__Slot__Group__03231);
            rule__Slot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0"


    // $ANTLR start "rule__Slot__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1618:1: rule__Slot__Group__0__Impl : ( () ) ;
    public final void rule__Slot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1622:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1623:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1623:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1624:1: ()
            {
             before(grammarAccess.getSlotAccess().getSlotAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1625:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1627:1: 
            {
            }

             after(grammarAccess.getSlotAccess().getSlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0__Impl"


    // $ANTLR start "rule__Slot__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1637:1: rule__Slot__Group__1 : rule__Slot__Group__1__Impl rule__Slot__Group__2 ;
    public final void rule__Slot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1641:1: ( rule__Slot__Group__1__Impl rule__Slot__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1642:2: rule__Slot__Group__1__Impl rule__Slot__Group__2
            {
            pushFollow(FOLLOW_rule__Slot__Group__1__Impl_in_rule__Slot__Group__13289);
            rule__Slot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__2_in_rule__Slot__Group__13292);
            rule__Slot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1"


    // $ANTLR start "rule__Slot__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1649:1: rule__Slot__Group__1__Impl : ( ( rule__Slot__NameAssignment_1 ) ) ;
    public final void rule__Slot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1653:1: ( ( ( rule__Slot__NameAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1654:1: ( ( rule__Slot__NameAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1654:1: ( ( rule__Slot__NameAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1655:1: ( rule__Slot__NameAssignment_1 )
            {
             before(grammarAccess.getSlotAccess().getNameAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1656:1: ( rule__Slot__NameAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1656:2: rule__Slot__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Slot__NameAssignment_1_in_rule__Slot__Group__1__Impl3319);
            rule__Slot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1__Impl"


    // $ANTLR start "rule__Slot__Group__2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1666:1: rule__Slot__Group__2 : rule__Slot__Group__2__Impl rule__Slot__Group__3 ;
    public final void rule__Slot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1670:1: ( rule__Slot__Group__2__Impl rule__Slot__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1671:2: rule__Slot__Group__2__Impl rule__Slot__Group__3
            {
            pushFollow(FOLLOW_rule__Slot__Group__2__Impl_in_rule__Slot__Group__23349);
            rule__Slot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__3_in_rule__Slot__Group__23352);
            rule__Slot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2"


    // $ANTLR start "rule__Slot__Group__2__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1678:1: rule__Slot__Group__2__Impl : ( '=' ) ;
    public final void rule__Slot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1682:1: ( ( '=' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1683:1: ( '=' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1683:1: ( '=' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1684:1: '='
            {
             before(grammarAccess.getSlotAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Slot__Group__2__Impl3380); 
             after(grammarAccess.getSlotAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2__Impl"


    // $ANTLR start "rule__Slot__Group__3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1697:1: rule__Slot__Group__3 : rule__Slot__Group__3__Impl ;
    public final void rule__Slot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1701:1: ( rule__Slot__Group__3__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1702:2: rule__Slot__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Slot__Group__3__Impl_in_rule__Slot__Group__33411);
            rule__Slot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__3"


    // $ANTLR start "rule__Slot__Group__3__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1708:1: rule__Slot__Group__3__Impl : ( ( rule__Slot__ValueAssignment_3 ) ) ;
    public final void rule__Slot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1712:1: ( ( ( rule__Slot__ValueAssignment_3 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1713:1: ( ( rule__Slot__ValueAssignment_3 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1713:1: ( ( rule__Slot__ValueAssignment_3 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1714:1: ( rule__Slot__ValueAssignment_3 )
            {
             before(grammarAccess.getSlotAccess().getValueAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1715:1: ( rule__Slot__ValueAssignment_3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1715:2: rule__Slot__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Slot__ValueAssignment_3_in_rule__Slot__Group__3__Impl3438);
            rule__Slot__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlotAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__3__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1733:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1737:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1738:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__03476);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__03479);
            rule__Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1745:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1749:1: ( ( '[' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1750:1: ( '[' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1750:1: ( '[' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1751:1: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Array__Group__0__Impl3507); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1764:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1768:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1769:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__13538);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__13541);
            rule__Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1776:1: rule__Array__Group__1__Impl : ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1780:1: ( ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1781:1: ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1781:1: ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1782:1: ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1782:1: ( ( rule__Array__ValueAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1783:1: ( rule__Array__ValueAssignment_1 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1784:1: ( rule__Array__ValueAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1784:2: rule__Array__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl3570);
            rule__Array__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValueAssignment_1()); 

            }

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1787:1: ( ( rule__Array__ValueAssignment_1 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1788:1: ( rule__Array__ValueAssignment_1 )*
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1789:1: ( rule__Array__ValueAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_MY_STRING && LA14_0<=RULE_NUMBER)||(LA14_0>=17 && LA14_0<=18)||(LA14_0>=21 && LA14_0<=25)||LA14_0==27||(LA14_0>=29 && LA14_0<=31)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1789:2: rule__Array__ValueAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl3582);
            	    rule__Array__ValueAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getValueAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1800:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1804:1: ( rule__Array__Group__2__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1805:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__23615);
            rule__Array__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1811:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1815:1: ( ( ']' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1816:1: ( ']' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1816:1: ( ']' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1817:1: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Array__Group__2__Impl3643); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__NullValue__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1836:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1840:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1841:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
            {
            pushFollow(FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__03680);
            rule__NullValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__03683);
            rule__NullValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0"


    // $ANTLR start "rule__NullValue__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1848:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1852:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1853:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1853:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1854:1: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1855:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1857:1: 
            {
            }

             after(grammarAccess.getNullValueAccess().getNullValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0__Impl"


    // $ANTLR start "rule__NullValue__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1867:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1871:1: ( rule__NullValue__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1872:2: rule__NullValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__13741);
            rule__NullValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1"


    // $ANTLR start "rule__NullValue__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1878:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1882:1: ( ( 'null' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1883:1: ( 'null' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1883:1: ( 'null' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1884:1: 'null'
            {
             before(grammarAccess.getNullValueAccess().getNullKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__NullValue__Group__1__Impl3769); 
             after(grammarAccess.getNullValueAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1901:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1905:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1906:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_rule__EnumValue__Group__0__Impl_in_rule__EnumValue__Group__03804);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumValue__Group__1_in_rule__EnumValue__Group__03807);
            rule__EnumValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0"


    // $ANTLR start "rule__EnumValue__Group__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1913:1: rule__EnumValue__Group__0__Impl : ( '#' ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1917:1: ( ( '#' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1918:1: ( '#' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1918:1: ( '#' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1919:1: '#'
            {
             before(grammarAccess.getEnumValueAccess().getNumberSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__EnumValue__Group__0__Impl3835); 
             after(grammarAccess.getEnumValueAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0__Impl"


    // $ANTLR start "rule__EnumValue__Group__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1932:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1936:1: ( rule__EnumValue__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1937:2: rule__EnumValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumValue__Group__1__Impl_in_rule__EnumValue__Group__13866);
            rule__EnumValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1"


    // $ANTLR start "rule__EnumValue__Group__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1943:1: rule__EnumValue__Group__1__Impl : ( ( rule__EnumValue__ValueAssignment_1 ) ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1947:1: ( ( ( rule__EnumValue__ValueAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1948:1: ( ( rule__EnumValue__ValueAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1948:1: ( ( rule__EnumValue__ValueAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1949:1: ( rule__EnumValue__ValueAssignment_1 )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1950:1: ( rule__EnumValue__ValueAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1950:2: rule__EnumValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumValue__ValueAssignment_1_in_rule__EnumValue__Group__1__Impl3893);
            rule__EnumValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1__Impl"


    // $ANTLR start "rule__Unit__ImportsAssignment_0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1965:1: rule__Unit__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Unit__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1969:1: ( ( ruleImport ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1970:1: ( ruleImport )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1970:1: ( ruleImport )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1971:1: ruleImport
            {
             before(grammarAccess.getUnitAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Unit__ImportsAssignment_03932);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__ImportsAssignment_0"


    // $ANTLR start "rule__Unit__ContainerAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1980:1: rule__Unit__ContainerAssignment_1 : ( ruleContainer ) ;
    public final void rule__Unit__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1984:1: ( ( ruleContainer ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1985:1: ( ruleContainer )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1985:1: ( ruleContainer )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1986:1: ruleContainer
            {
             before(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Unit__ContainerAssignment_13963);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__ContainerAssignment_1"


    // $ANTLR start "rule__Unit__InstancesAssignment_2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1995:1: rule__Unit__InstancesAssignment_2 : ( ruleInstance ) ;
    public final void rule__Unit__InstancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1999:1: ( ( ruleInstance ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2000:1: ( ruleInstance )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2000:1: ( ruleInstance )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2001:1: ruleInstance
            {
             before(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInstance_in_rule__Unit__InstancesAssignment_23994);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__InstancesAssignment_2"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2010:1: rule__Import__NameAssignment_1 : ( RULE_MY_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2014:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2015:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2015:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2016:1: RULE_MY_STRING
            {
             before(grammarAccess.getImportAccess().getNameMY_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Import__NameAssignment_14025); 
             after(grammarAccess.getImportAccess().getNameMY_STRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__Container__InstanceAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2025:1: rule__Container__InstanceAssignment_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Container__InstanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2029:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2030:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2030:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2031:1: ( RULE_FQN )
            {
             before(grammarAccess.getContainerAccess().getInstanceInstanceCrossReference_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2032:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2033:1: RULE_FQN
            {
             before(grammarAccess.getContainerAccess().getInstanceInstanceFQNTerminalRuleCall_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__Container__InstanceAssignment_14060); 
             after(grammarAccess.getContainerAccess().getInstanceInstanceFQNTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getInstanceInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__InstanceAssignment_1"


    // $ANTLR start "rule__Container__FeatureAssignment_3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2044:1: rule__Container__FeatureAssignment_3 : ( RULE_ID ) ;
    public final void rule__Container__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2048:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2049:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2049:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2050:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getFeatureIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Container__FeatureAssignment_34095); 
             after(grammarAccess.getContainerAccess().getFeatureIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__FeatureAssignment_3"


    // $ANTLR start "rule__Instance__TitleAssignment_1_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2059:1: rule__Instance__TitleAssignment_1_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__TitleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2063:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2064:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2064:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2065:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getTitleMY_STRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__TitleAssignment_1_14126); 
             after(grammarAccess.getInstanceAccess().getTitleMY_STRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__TitleAssignment_1_1"


    // $ANTLR start "rule__Instance__AbstractAssignment_2_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2074:1: rule__Instance__AbstractAssignment_2_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2078:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2079:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2079:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2080:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getAbstractMY_STRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__AbstractAssignment_2_14157); 
             after(grammarAccess.getInstanceAccess().getAbstractMY_STRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__AbstractAssignment_2_1"


    // $ANTLR start "rule__Instance__DocumentationAssignment_3_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2089:1: rule__Instance__DocumentationAssignment_3_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2093:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2094:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2094:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2095:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getDocumentationMY_STRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__DocumentationAssignment_3_14188); 
             after(grammarAccess.getInstanceAccess().getDocumentationMY_STRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__DocumentationAssignment_3_1"


    // $ANTLR start "rule__Instance__SeeAssignment_4_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2104:1: rule__Instance__SeeAssignment_4_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Instance__SeeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2108:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2109:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2109:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2110:1: ( RULE_FQN )
            {
             before(grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_4_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2111:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2112:1: RULE_FQN
            {
             before(grammarAccess.getInstanceAccess().getSeeInstanceFQNTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__Instance__SeeAssignment_4_14223); 
             after(grammarAccess.getInstanceAccess().getSeeInstanceFQNTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__SeeAssignment_4_1"


    // $ANTLR start "rule__Instance__TagsAssignment_5_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2123:1: rule__Instance__TagsAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Instance__TagsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2127:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2128:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2128:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2129:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__TagsAssignment_5_14258); 
             after(grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__TagsAssignment_5_1"


    // $ANTLR start "rule__Instance__NameAssignment_6_0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2138:1: rule__Instance__NameAssignment_6_0 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2142:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2143:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2143:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2144:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_6_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_6_04289); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_6_0"


    // $ANTLR start "rule__Instance__TypeAssignment_8"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2153:1: rule__Instance__TypeAssignment_8 : ( RULE_ID ) ;
    public final void rule__Instance__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2157:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2158:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2158:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2159:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__TypeAssignment_84320); 
             after(grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__TypeAssignment_8"


    // $ANTLR start "rule__Instance__SlotsAssignment_10"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2168:1: rule__Instance__SlotsAssignment_10 : ( ruleSlot ) ;
    public final void rule__Instance__SlotsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2172:1: ( ( ruleSlot ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2173:1: ( ruleSlot )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2173:1: ( ruleSlot )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2174:1: ruleSlot
            {
             before(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleSlot_in_rule__Instance__SlotsAssignment_104351);
            ruleSlot();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__SlotsAssignment_10"


    // $ANTLR start "rule__Slot__NameAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2183:1: rule__Slot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2187:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2188:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2188:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2189:1: RULE_ID
            {
             before(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Slot__NameAssignment_14382); 
             after(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__NameAssignment_1"


    // $ANTLR start "rule__Slot__ValueAssignment_3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2198:1: rule__Slot__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Slot__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2202:1: ( ( ruleValue ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2203:1: ( ruleValue )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2203:1: ( ruleValue )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2204:1: ruleValue
            {
             before(grammarAccess.getSlotAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Slot__ValueAssignment_34413);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSlotAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__ValueAssignment_3"


    // $ANTLR start "rule__Array__ValueAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2213:1: rule__Array__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2217:1: ( ( ruleValue ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2218:1: ( ruleValue )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2218:1: ( ruleValue )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2219:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValueAssignment_14444);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValueAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2228:1: rule__StringValue__ValueAssignment : ( RULE_MY_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2232:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2233:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2233:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2234:1: RULE_MY_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueMY_STRINGTerminalRuleCall_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__StringValue__ValueAssignment4475); 
             after(grammarAccess.getStringValueAccess().getValueMY_STRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment_0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2243:1: rule__BooleanValue__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2247:1: ( ( ( 'true' ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2248:1: ( ( 'true' ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2248:1: ( ( 'true' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2249:1: ( 'true' )
            {
             before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2250:1: ( 'true' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2251:1: 'true'
            {
             before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__BooleanValue__ValueAssignment_04511); 
             after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment_0"


    // $ANTLR start "rule__BooleanValue__ValueAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2266:1: rule__BooleanValue__ValueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BooleanValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2270:1: ( ( ( 'false' ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2271:1: ( ( 'false' ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2271:1: ( ( 'false' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2272:1: ( 'false' )
            {
             before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2273:1: ( 'false' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2274:1: 'false'
            {
             before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__BooleanValue__ValueAssignment_14555); 
             after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment_1"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2289:1: rule__NumberValue__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2293:1: ( ( RULE_NUMBER ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2294:1: ( RULE_NUMBER )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2294:1: ( RULE_NUMBER )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2295:1: RULE_NUMBER
            {
             before(grammarAccess.getNumberValueAccess().getValueNUMBERTerminalRuleCall_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__NumberValue__ValueAssignment4594); 
             after(grammarAccess.getNumberValueAccess().getValueNUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__InstanceRef__ValueAssignment"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2304:1: rule__InstanceRef__ValueAssignment : ( ( RULE_FQN ) ) ;
    public final void rule__InstanceRef__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2308:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2309:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2309:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2310:1: ( RULE_FQN )
            {
             before(grammarAccess.getInstanceRefAccess().getValueInstanceCrossReference_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2311:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2312:1: RULE_FQN
            {
             before(grammarAccess.getInstanceRefAccess().getValueInstanceFQNTerminalRuleCall_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__InstanceRef__ValueAssignment4629); 
             after(grammarAccess.getInstanceRefAccess().getValueInstanceFQNTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getInstanceRefAccess().getValueInstanceCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRef__ValueAssignment"


    // $ANTLR start "rule__EnumValue__ValueAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2323:1: rule__EnumValue__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2327:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2328:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2328:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2329:1: RULE_ID
            {
             before(grammarAccess.getEnumValueAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumValue__ValueAssignment_14664); 
             after(grammarAccess.getEnumValueAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group__0_in_ruleUnit94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0_in_ruleContainer334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0_in_ruleInstance394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlot_in_entryRuleSlot421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlot428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__0_in_ruleSlot454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullValue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__0_in_ruleNullValue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_entryRuleInstanceRef781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceRef788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceRef__ValueAssignment_in_ruleInstanceRef814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__0_in_ruleEnumValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_rule__Value__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceRef_in_rule__Value__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Value__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Literal__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__Alternatives1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_rule__Literal__Alternatives1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__Literal__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__Literal__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_0_in_rule__BooleanValue__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_1_in_rule__BooleanValue__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group__0__Impl_in_rule__Unit__Group__01145 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Unit__Group__1_in_rule__Unit__Group__01148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1177 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1189 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Unit__Group__1__Impl_in_rule__Unit__Group__11222 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Unit__Group__2_in_rule__Unit__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__ContainerAssignment_1_in_rule__Unit__Group__1__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group__2__Impl_in_rule__Unit__Group__21283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__InstancesAssignment_2_in_rule__Unit__Group__2__Impl1312 = new BitSet(new long[]{0x0000000003E50042L});
    public static final BitSet FOLLOW_rule__Unit__InstancesAssignment_2_in_rule__Unit__Group__2__Impl1324 = new BitSet(new long[]{0x0000000003E50042L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__NameAssignment_1_in_rule__Import__Group__1__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__01486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__01489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Container__Group__0__Impl1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__11548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__InstanceAssignment_1_in_rule__Container__Group__1__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__21608 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__21611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Container__Group__2__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__31670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__FeatureAssignment_3_in_rule__Container__Group__3__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__01735 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__11796 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__11799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__0_in_rule__Instance__Group__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__21857 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__21860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__0_in_rule__Instance__Group__2__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__31918 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__4_in_rule__Instance__Group__31921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__4__Impl_in_rule__Instance__Group__41979 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__5_in_rule__Instance__Group__41982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__0_in_rule__Instance__Group__4__Impl2009 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__5__Impl_in_rule__Instance__Group__52040 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__6_in_rule__Instance__Group__52043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__0_in_rule__Instance__Group__5__Impl2070 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__6__Impl_in_rule__Instance__Group__62101 = new BitSet(new long[]{0x0000000003E50040L});
    public static final BitSet FOLLOW_rule__Instance__Group__7_in_rule__Instance__Group__62104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__0_in_rule__Instance__Group__6__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__7__Impl_in_rule__Instance__Group__72162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instance__Group__8_in_rule__Instance__Group__72165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Instance__Group__7__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__8__Impl_in_rule__Instance__Group__82224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Instance__Group__9_in_rule__Instance__Group__82227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TypeAssignment_8_in_rule__Instance__Group__8__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__9__Impl_in_rule__Instance__Group__92284 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__Instance__Group__10_in_rule__Instance__Group__92287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Instance__Group__9__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__10__Impl_in_rule__Instance__Group__102346 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__Instance__Group__11_in_rule__Instance__Group__102349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__SlotsAssignment_10_in_rule__Instance__Group__10__Impl2376 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Instance__Group__11__Impl_in_rule__Instance__Group__112407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Instance__Group__11__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__0__Impl_in_rule__Instance__Group_1__02490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__1_in_rule__Instance__Group_1__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instance__Group_1__0__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__1__Impl_in_rule__Instance__Group_1__12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TitleAssignment_1_1_in_rule__Instance__Group_1__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__0__Impl_in_rule__Instance__Group_2__02613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__1_in_rule__Instance__Group_2__02616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instance__Group_2__0__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__1__Impl_in_rule__Instance__Group_2__12675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__AbstractAssignment_2_1_in_rule__Instance__Group_2__1__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__02736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__02739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Instance__Group_3__0__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__DocumentationAssignment_3_1_in_rule__Instance__Group_3__1__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__0__Impl_in_rule__Instance__Group_4__02859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__1_in_rule__Instance__Group_4__02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Instance__Group_4__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__1__Impl_in_rule__Instance__Group_4__12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__SeeAssignment_4_1_in_rule__Instance__Group_4__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__0__Impl_in_rule__Instance__Group_5__02982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__1_in_rule__Instance__Group_5__02985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Instance__Group_5__0__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__1__Impl_in_rule__Instance__Group_5__13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TagsAssignment_5_1_in_rule__Instance__Group_5__1__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__0__Impl_in_rule__Instance__Group_6__03105 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__1_in_rule__Instance__Group_6__03108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__NameAssignment_6_0_in_rule__Instance__Group_6__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__1__Impl_in_rule__Instance__Group_6__13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Instance__Group_6__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__0__Impl_in_rule__Slot__Group__03228 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Slot__Group__1_in_rule__Slot__Group__03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__1__Impl_in_rule__Slot__Group__13289 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Slot__Group__2_in_rule__Slot__Group__13292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__NameAssignment_1_in_rule__Slot__Group__1__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__2__Impl_in_rule__Slot__Group__23349 = new BitSet(new long[]{0x00000000EBE700F0L});
    public static final BitSet FOLLOW_rule__Slot__Group__3_in_rule__Slot__Group__23352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Slot__Group__2__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__3__Impl_in_rule__Slot__Group__33411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__ValueAssignment_3_in_rule__Slot__Group__3__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__03476 = new BitSet(new long[]{0x00000000EBE700F0L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Array__Group__0__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__13538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__13541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl3570 = new BitSet(new long[]{0x00000000EBE700F2L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl3582 = new BitSet(new long[]{0x00000000EBE700F2L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__23615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Array__Group__2__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__03680 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__03683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__13741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NullValue__Group__1__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__0__Impl_in_rule__EnumValue__Group__03804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__1_in_rule__EnumValue__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumValue__Group__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__1__Impl_in_rule__EnumValue__Group__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__ValueAssignment_1_in_rule__EnumValue__Group__1__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Unit__ImportsAssignment_03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Unit__ContainerAssignment_13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_rule__Unit__InstancesAssignment_23994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Import__NameAssignment_14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__Container__InstanceAssignment_14060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Container__FeatureAssignment_34095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__TitleAssignment_1_14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__AbstractAssignment_2_14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__DocumentationAssignment_3_14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__Instance__SeeAssignment_4_14223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__TagsAssignment_5_14258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_6_04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__TypeAssignment_84320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlot_in_rule__Instance__SlotsAssignment_104351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Slot__NameAssignment_14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Slot__ValueAssignment_34413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValueAssignment_14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__StringValue__ValueAssignment4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BooleanValue__ValueAssignment_04511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BooleanValue__ValueAssignment_14555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__NumberValue__ValueAssignment4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__InstanceRef__ValueAssignment4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumValue__ValueAssignment_14664 = new BitSet(new long[]{0x0000000000000002L});

}