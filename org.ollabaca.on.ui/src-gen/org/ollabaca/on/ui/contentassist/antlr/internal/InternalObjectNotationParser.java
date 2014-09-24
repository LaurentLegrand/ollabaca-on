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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FQN", "RULE_MY_STRING", "RULE_ID", "RULE_VERSION", "RULE_NUMBER", "RULE_LONG_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parent'", "'import'", "'container'", "'#'", "'new'", "'{'", "'}'", "'@title'", "'@abstract'", "'@doc'", "'@abbr'", "'@see'", "'@tag'", "'@since'", "'@version'", "'='", "'['", "']'", "'null'", "'true'", "'false'"
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
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt1=1;
                }
                break;
            case 32:
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
            case 19:
            case 34:
            case 35:
            case 36:
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
            case 35:
            case 36:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt2=4;
                }
                break;
            case 19:
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

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
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

                if ( (LA4_0==17) ) {
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:601:1: rule__Unit__Group__1__Impl : ( ( rule__Unit__Group_1__0 )? ) ;
    public final void rule__Unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:605:1: ( ( ( rule__Unit__Group_1__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:606:1: ( ( rule__Unit__Group_1__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:606:1: ( ( rule__Unit__Group_1__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:607:1: ( rule__Unit__Group_1__0 )?
            {
             before(grammarAccess.getUnitAccess().getGroup_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:608:1: ( rule__Unit__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:608:2: rule__Unit__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Unit__Group_1__0_in_rule__Unit__Group__1__Impl1252);
                    rule__Unit__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitAccess().getGroup_1()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:618:1: rule__Unit__Group__2 : rule__Unit__Group__2__Impl rule__Unit__Group__3 ;
    public final void rule__Unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:622:1: ( rule__Unit__Group__2__Impl rule__Unit__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:623:2: rule__Unit__Group__2__Impl rule__Unit__Group__3
            {
            pushFollow(FOLLOW_rule__Unit__Group__2__Impl_in_rule__Unit__Group__21283);
            rule__Unit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unit__Group__3_in_rule__Unit__Group__21286);
            rule__Unit__Group__3();

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:630:1: rule__Unit__Group__2__Impl : ( ( rule__Unit__ContainerAssignment_2 )? ) ;
    public final void rule__Unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:634:1: ( ( ( rule__Unit__ContainerAssignment_2 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:635:1: ( ( rule__Unit__ContainerAssignment_2 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:635:1: ( ( rule__Unit__ContainerAssignment_2 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:636:1: ( rule__Unit__ContainerAssignment_2 )?
            {
             before(grammarAccess.getUnitAccess().getContainerAssignment_2()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:637:1: ( rule__Unit__ContainerAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:637:2: rule__Unit__ContainerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Unit__ContainerAssignment_2_in_rule__Unit__Group__2__Impl1313);
                    rule__Unit__ContainerAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitAccess().getContainerAssignment_2()); 

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


    // $ANTLR start "rule__Unit__Group__3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:647:1: rule__Unit__Group__3 : rule__Unit__Group__3__Impl ;
    public final void rule__Unit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:651:1: ( rule__Unit__Group__3__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:652:2: rule__Unit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Unit__Group__3__Impl_in_rule__Unit__Group__31344);
            rule__Unit__Group__3__Impl();

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
    // $ANTLR end "rule__Unit__Group__3"


    // $ANTLR start "rule__Unit__Group__3__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:658:1: rule__Unit__Group__3__Impl : ( ( ( rule__Unit__InstancesAssignment_3 ) ) ( ( rule__Unit__InstancesAssignment_3 )* ) ) ;
    public final void rule__Unit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:662:1: ( ( ( ( rule__Unit__InstancesAssignment_3 ) ) ( ( rule__Unit__InstancesAssignment_3 )* ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:663:1: ( ( ( rule__Unit__InstancesAssignment_3 ) ) ( ( rule__Unit__InstancesAssignment_3 )* ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:663:1: ( ( ( rule__Unit__InstancesAssignment_3 ) ) ( ( rule__Unit__InstancesAssignment_3 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:664:1: ( ( rule__Unit__InstancesAssignment_3 ) ) ( ( rule__Unit__InstancesAssignment_3 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:664:1: ( ( rule__Unit__InstancesAssignment_3 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:665:1: ( rule__Unit__InstancesAssignment_3 )
            {
             before(grammarAccess.getUnitAccess().getInstancesAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:666:1: ( rule__Unit__InstancesAssignment_3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:666:2: rule__Unit__InstancesAssignment_3
            {
            pushFollow(FOLLOW_rule__Unit__InstancesAssignment_3_in_rule__Unit__Group__3__Impl1373);
            rule__Unit__InstancesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getInstancesAssignment_3()); 

            }

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:669:1: ( ( rule__Unit__InstancesAssignment_3 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:670:1: ( rule__Unit__InstancesAssignment_3 )*
            {
             before(grammarAccess.getUnitAccess().getInstancesAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:671:1: ( rule__Unit__InstancesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==20||(LA7_0>=23 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:671:2: rule__Unit__InstancesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Unit__InstancesAssignment_3_in_rule__Unit__Group__3__Impl1385);
            	    rule__Unit__InstancesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUnitAccess().getInstancesAssignment_3()); 

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
    // $ANTLR end "rule__Unit__Group__3__Impl"


    // $ANTLR start "rule__Unit__Group_1__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:690:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:694:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:695:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_rule__Unit__Group_1__0__Impl_in_rule__Unit__Group_1__01426);
            rule__Unit__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unit__Group_1__1_in_rule__Unit__Group_1__01429);
            rule__Unit__Group_1__1();

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
    // $ANTLR end "rule__Unit__Group_1__0"


    // $ANTLR start "rule__Unit__Group_1__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:702:1: rule__Unit__Group_1__0__Impl : ( 'parent' ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:706:1: ( ( 'parent' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:707:1: ( 'parent' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:707:1: ( 'parent' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:708:1: 'parent'
            {
             before(grammarAccess.getUnitAccess().getParentKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Unit__Group_1__0__Impl1457); 
             after(grammarAccess.getUnitAccess().getParentKeyword_1_0()); 

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
    // $ANTLR end "rule__Unit__Group_1__0__Impl"


    // $ANTLR start "rule__Unit__Group_1__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:721:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:725:1: ( rule__Unit__Group_1__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:726:2: rule__Unit__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Unit__Group_1__1__Impl_in_rule__Unit__Group_1__11488);
            rule__Unit__Group_1__1__Impl();

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
    // $ANTLR end "rule__Unit__Group_1__1"


    // $ANTLR start "rule__Unit__Group_1__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:732:1: rule__Unit__Group_1__1__Impl : ( ( rule__Unit__ParentAssignment_1_1 ) ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:736:1: ( ( ( rule__Unit__ParentAssignment_1_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:737:1: ( ( rule__Unit__ParentAssignment_1_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:737:1: ( ( rule__Unit__ParentAssignment_1_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:738:1: ( rule__Unit__ParentAssignment_1_1 )
            {
             before(grammarAccess.getUnitAccess().getParentAssignment_1_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:739:1: ( rule__Unit__ParentAssignment_1_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:739:2: rule__Unit__ParentAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Unit__ParentAssignment_1_1_in_rule__Unit__Group_1__1__Impl1515);
            rule__Unit__ParentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getParentAssignment_1_1()); 

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
    // $ANTLR end "rule__Unit__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:753:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:757:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:758:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01549);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01552);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:765:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:769:1: ( ( 'import' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:770:1: ( 'import' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:770:1: ( 'import' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:771:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1580); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:784:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:788:1: ( rule__Import__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:789:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11611);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:795:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:799:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:800:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:800:1: ( ( rule__Import__NameAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:801:1: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:802:1: ( rule__Import__NameAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:802:2: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__NameAssignment_1_in_rule__Import__Group__1__Impl1638);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:816:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:820:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:821:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__01672);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__1_in_rule__Container__Group__01675);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:828:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:832:1: ( ( 'container' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:833:1: ( 'container' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:833:1: ( 'container' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:834:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Container__Group__0__Impl1703); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:847:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:851:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:852:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__11734);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__2_in_rule__Container__Group__11737);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:859:1: rule__Container__Group__1__Impl : ( ( rule__Container__InstanceAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:863:1: ( ( ( rule__Container__InstanceAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:864:1: ( ( rule__Container__InstanceAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:864:1: ( ( rule__Container__InstanceAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:865:1: ( rule__Container__InstanceAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getInstanceAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:866:1: ( rule__Container__InstanceAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:866:2: rule__Container__InstanceAssignment_1
            {
            pushFollow(FOLLOW_rule__Container__InstanceAssignment_1_in_rule__Container__Group__1__Impl1764);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:876:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:880:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:881:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__21794);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__3_in_rule__Container__Group__21797);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:888:1: rule__Container__Group__2__Impl : ( '#' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:892:1: ( ( '#' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:893:1: ( '#' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:893:1: ( '#' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:894:1: '#'
            {
             before(grammarAccess.getContainerAccess().getNumberSignKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Container__Group__2__Impl1825); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:907:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:911:1: ( rule__Container__Group__3__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:912:2: rule__Container__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__31856);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:918:1: rule__Container__Group__3__Impl : ( ( rule__Container__FeatureAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:922:1: ( ( ( rule__Container__FeatureAssignment_3 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:923:1: ( ( rule__Container__FeatureAssignment_3 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:923:1: ( ( rule__Container__FeatureAssignment_3 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:924:1: ( rule__Container__FeatureAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getFeatureAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:925:1: ( rule__Container__FeatureAssignment_3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:925:2: rule__Container__FeatureAssignment_3
            {
            pushFollow(FOLLOW_rule__Container__FeatureAssignment_3_in_rule__Container__Group__3__Impl1883);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:943:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:947:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:948:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__01921);
            rule__Instance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__01924);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:955:1: rule__Instance__Group__0__Impl : ( () ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:959:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:960:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:960:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:961:1: ()
            {
             before(grammarAccess.getInstanceAccess().getInstanceAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:962:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:964:1: 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:974:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:978:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:979:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__11982);
            rule__Instance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__11985);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:986:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__Group_1__0 )? ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:990:1: ( ( ( rule__Instance__Group_1__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:991:1: ( ( rule__Instance__Group_1__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:991:1: ( ( rule__Instance__Group_1__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:992:1: ( rule__Instance__Group_1__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:993:1: ( rule__Instance__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:993:2: rule__Instance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_1__0_in_rule__Instance__Group__1__Impl2012);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1003:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1007:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1008:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__22043);
            rule__Instance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__22046);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1015:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__Group_2__0 )? ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1019:1: ( ( ( rule__Instance__Group_2__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1020:1: ( ( rule__Instance__Group_2__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1020:1: ( ( rule__Instance__Group_2__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1021:1: ( rule__Instance__Group_2__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_2()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1022:1: ( rule__Instance__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1022:2: rule__Instance__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_2__0_in_rule__Instance__Group__2__Impl2073);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1032:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1036:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1037:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__32104);
            rule__Instance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__4_in_rule__Instance__Group__32107);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1044:1: rule__Instance__Group__3__Impl : ( ( rule__Instance__Group_3__0 )? ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1048:1: ( ( ( rule__Instance__Group_3__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1049:1: ( ( rule__Instance__Group_3__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1049:1: ( ( rule__Instance__Group_3__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1050:1: ( rule__Instance__Group_3__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1051:1: ( rule__Instance__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1051:2: rule__Instance__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl2134);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1061:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1065:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1066:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_rule__Instance__Group__4__Impl_in_rule__Instance__Group__42165);
            rule__Instance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__5_in_rule__Instance__Group__42168);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1073:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__Group_4__0 )? ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1077:1: ( ( ( rule__Instance__Group_4__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1078:1: ( ( rule__Instance__Group_4__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1078:1: ( ( rule__Instance__Group_4__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1079:1: ( rule__Instance__Group_4__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_4()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1080:1: ( rule__Instance__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1080:2: rule__Instance__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_4__0_in_rule__Instance__Group__4__Impl2195);
                    rule__Instance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1090:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1094:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1095:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_rule__Instance__Group__5__Impl_in_rule__Instance__Group__52226);
            rule__Instance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__6_in_rule__Instance__Group__52229);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1102:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1106:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1107:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1107:1: ( ( rule__Instance__Group_5__0 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1108:1: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1109:1: ( rule__Instance__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1109:2: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Instance__Group_5__0_in_rule__Instance__Group__5__Impl2256);
            	    rule__Instance__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1119:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl rule__Instance__Group__7 ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1123:1: ( rule__Instance__Group__6__Impl rule__Instance__Group__7 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1124:2: rule__Instance__Group__6__Impl rule__Instance__Group__7
            {
            pushFollow(FOLLOW_rule__Instance__Group__6__Impl_in_rule__Instance__Group__62287);
            rule__Instance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__7_in_rule__Instance__Group__62290);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1131:1: rule__Instance__Group__6__Impl : ( ( rule__Instance__Group_6__0 )* ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1135:1: ( ( ( rule__Instance__Group_6__0 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1136:1: ( ( rule__Instance__Group_6__0 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1136:1: ( ( rule__Instance__Group_6__0 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1137:1: ( rule__Instance__Group_6__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_6()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1138:1: ( rule__Instance__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1138:2: rule__Instance__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Instance__Group_6__0_in_rule__Instance__Group__6__Impl2317);
            	    rule__Instance__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1148:1: rule__Instance__Group__7 : rule__Instance__Group__7__Impl rule__Instance__Group__8 ;
    public final void rule__Instance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1152:1: ( rule__Instance__Group__7__Impl rule__Instance__Group__8 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1153:2: rule__Instance__Group__7__Impl rule__Instance__Group__8
            {
            pushFollow(FOLLOW_rule__Instance__Group__7__Impl_in_rule__Instance__Group__72348);
            rule__Instance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__8_in_rule__Instance__Group__72351);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1160:1: rule__Instance__Group__7__Impl : ( ( rule__Instance__Group_7__0 )? ) ;
    public final void rule__Instance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1164:1: ( ( ( rule__Instance__Group_7__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1165:1: ( ( rule__Instance__Group_7__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1165:1: ( ( rule__Instance__Group_7__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1166:1: ( rule__Instance__Group_7__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_7()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1167:1: ( rule__Instance__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1167:2: rule__Instance__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_7__0_in_rule__Instance__Group__7__Impl2378);
                    rule__Instance__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_7()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1177:1: rule__Instance__Group__8 : rule__Instance__Group__8__Impl rule__Instance__Group__9 ;
    public final void rule__Instance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1181:1: ( rule__Instance__Group__8__Impl rule__Instance__Group__9 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1182:2: rule__Instance__Group__8__Impl rule__Instance__Group__9
            {
            pushFollow(FOLLOW_rule__Instance__Group__8__Impl_in_rule__Instance__Group__82409);
            rule__Instance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__9_in_rule__Instance__Group__82412);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1189:1: rule__Instance__Group__8__Impl : ( ( rule__Instance__Group_8__0 )? ) ;
    public final void rule__Instance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1193:1: ( ( ( rule__Instance__Group_8__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1194:1: ( ( rule__Instance__Group_8__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1194:1: ( ( rule__Instance__Group_8__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1195:1: ( rule__Instance__Group_8__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_8()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1196:1: ( rule__Instance__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1196:2: rule__Instance__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_8__0_in_rule__Instance__Group__8__Impl2439);
                    rule__Instance__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_8()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1206:1: rule__Instance__Group__9 : rule__Instance__Group__9__Impl rule__Instance__Group__10 ;
    public final void rule__Instance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1210:1: ( rule__Instance__Group__9__Impl rule__Instance__Group__10 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1211:2: rule__Instance__Group__9__Impl rule__Instance__Group__10
            {
            pushFollow(FOLLOW_rule__Instance__Group__9__Impl_in_rule__Instance__Group__92470);
            rule__Instance__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__10_in_rule__Instance__Group__92473);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1218:1: rule__Instance__Group__9__Impl : ( ( rule__Instance__Group_9__0 )? ) ;
    public final void rule__Instance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1222:1: ( ( ( rule__Instance__Group_9__0 )? ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1223:1: ( ( rule__Instance__Group_9__0 )? )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1223:1: ( ( rule__Instance__Group_9__0 )? )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1224:1: ( rule__Instance__Group_9__0 )?
            {
             before(grammarAccess.getInstanceAccess().getGroup_9()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1225:1: ( rule__Instance__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1225:2: rule__Instance__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Instance__Group_9__0_in_rule__Instance__Group__9__Impl2500);
                    rule__Instance__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getGroup_9()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1235:1: rule__Instance__Group__10 : rule__Instance__Group__10__Impl rule__Instance__Group__11 ;
    public final void rule__Instance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1239:1: ( rule__Instance__Group__10__Impl rule__Instance__Group__11 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1240:2: rule__Instance__Group__10__Impl rule__Instance__Group__11
            {
            pushFollow(FOLLOW_rule__Instance__Group__10__Impl_in_rule__Instance__Group__102531);
            rule__Instance__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__11_in_rule__Instance__Group__102534);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1247:1: rule__Instance__Group__10__Impl : ( 'new' ) ;
    public final void rule__Instance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1251:1: ( ( 'new' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1252:1: ( 'new' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1252:1: ( 'new' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1253:1: 'new'
            {
             before(grammarAccess.getInstanceAccess().getNewKeyword_10()); 
            match(input,20,FOLLOW_20_in_rule__Instance__Group__10__Impl2562); 
             after(grammarAccess.getInstanceAccess().getNewKeyword_10()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1266:1: rule__Instance__Group__11 : rule__Instance__Group__11__Impl rule__Instance__Group__12 ;
    public final void rule__Instance__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1270:1: ( rule__Instance__Group__11__Impl rule__Instance__Group__12 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1271:2: rule__Instance__Group__11__Impl rule__Instance__Group__12
            {
            pushFollow(FOLLOW_rule__Instance__Group__11__Impl_in_rule__Instance__Group__112593);
            rule__Instance__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__12_in_rule__Instance__Group__112596);
            rule__Instance__Group__12();

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1278:1: rule__Instance__Group__11__Impl : ( ( rule__Instance__TypeAssignment_11 ) ) ;
    public final void rule__Instance__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1282:1: ( ( ( rule__Instance__TypeAssignment_11 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1283:1: ( ( rule__Instance__TypeAssignment_11 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1283:1: ( ( rule__Instance__TypeAssignment_11 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1284:1: ( rule__Instance__TypeAssignment_11 )
            {
             before(grammarAccess.getInstanceAccess().getTypeAssignment_11()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1285:1: ( rule__Instance__TypeAssignment_11 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1285:2: rule__Instance__TypeAssignment_11
            {
            pushFollow(FOLLOW_rule__Instance__TypeAssignment_11_in_rule__Instance__Group__11__Impl2623);
            rule__Instance__TypeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTypeAssignment_11()); 

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


    // $ANTLR start "rule__Instance__Group__12"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1295:1: rule__Instance__Group__12 : rule__Instance__Group__12__Impl rule__Instance__Group__13 ;
    public final void rule__Instance__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1299:1: ( rule__Instance__Group__12__Impl rule__Instance__Group__13 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1300:2: rule__Instance__Group__12__Impl rule__Instance__Group__13
            {
            pushFollow(FOLLOW_rule__Instance__Group__12__Impl_in_rule__Instance__Group__122653);
            rule__Instance__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__13_in_rule__Instance__Group__122656);
            rule__Instance__Group__13();

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
    // $ANTLR end "rule__Instance__Group__12"


    // $ANTLR start "rule__Instance__Group__12__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1307:1: rule__Instance__Group__12__Impl : ( '{' ) ;
    public final void rule__Instance__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1311:1: ( ( '{' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1312:1: ( '{' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1312:1: ( '{' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1313:1: '{'
            {
             before(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_21_in_rule__Instance__Group__12__Impl2684); 
             after(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Instance__Group__12__Impl"


    // $ANTLR start "rule__Instance__Group__13"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1326:1: rule__Instance__Group__13 : rule__Instance__Group__13__Impl rule__Instance__Group__14 ;
    public final void rule__Instance__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1330:1: ( rule__Instance__Group__13__Impl rule__Instance__Group__14 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1331:2: rule__Instance__Group__13__Impl rule__Instance__Group__14
            {
            pushFollow(FOLLOW_rule__Instance__Group__13__Impl_in_rule__Instance__Group__132715);
            rule__Instance__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group__14_in_rule__Instance__Group__132718);
            rule__Instance__Group__14();

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
    // $ANTLR end "rule__Instance__Group__13"


    // $ANTLR start "rule__Instance__Group__13__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1338:1: rule__Instance__Group__13__Impl : ( ( rule__Instance__SlotsAssignment_13 )* ) ;
    public final void rule__Instance__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1342:1: ( ( ( rule__Instance__SlotsAssignment_13 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1343:1: ( ( rule__Instance__SlotsAssignment_13 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1343:1: ( ( rule__Instance__SlotsAssignment_13 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1344:1: ( rule__Instance__SlotsAssignment_13 )*
            {
             before(grammarAccess.getInstanceAccess().getSlotsAssignment_13()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1345:1: ( rule__Instance__SlotsAssignment_13 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1345:2: rule__Instance__SlotsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__Instance__SlotsAssignment_13_in_rule__Instance__Group__13__Impl2745);
            	    rule__Instance__SlotsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getSlotsAssignment_13()); 

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
    // $ANTLR end "rule__Instance__Group__13__Impl"


    // $ANTLR start "rule__Instance__Group__14"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1355:1: rule__Instance__Group__14 : rule__Instance__Group__14__Impl ;
    public final void rule__Instance__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1359:1: ( rule__Instance__Group__14__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1360:2: rule__Instance__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group__14__Impl_in_rule__Instance__Group__142776);
            rule__Instance__Group__14__Impl();

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
    // $ANTLR end "rule__Instance__Group__14"


    // $ANTLR start "rule__Instance__Group__14__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1366:1: rule__Instance__Group__14__Impl : ( '}' ) ;
    public final void rule__Instance__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1370:1: ( ( '}' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1371:1: ( '}' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1371:1: ( '}' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1372:1: '}'
            {
             before(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_22_in_rule__Instance__Group__14__Impl2804); 
             after(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Instance__Group__14__Impl"


    // $ANTLR start "rule__Instance__Group_1__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1415:1: rule__Instance__Group_1__0 : rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1 ;
    public final void rule__Instance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1419:1: ( rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1420:2: rule__Instance__Group_1__0__Impl rule__Instance__Group_1__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_1__0__Impl_in_rule__Instance__Group_1__02865);
            rule__Instance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_1__1_in_rule__Instance__Group_1__02868);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1427:1: rule__Instance__Group_1__0__Impl : ( '@title' ) ;
    public final void rule__Instance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1431:1: ( ( '@title' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1432:1: ( '@title' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1432:1: ( '@title' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1433:1: '@title'
            {
             before(grammarAccess.getInstanceAccess().getTitleKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Instance__Group_1__0__Impl2896); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1446:1: rule__Instance__Group_1__1 : rule__Instance__Group_1__1__Impl ;
    public final void rule__Instance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1450:1: ( rule__Instance__Group_1__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1451:2: rule__Instance__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_1__1__Impl_in_rule__Instance__Group_1__12927);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1457:1: rule__Instance__Group_1__1__Impl : ( ( rule__Instance__TitleAssignment_1_1 ) ) ;
    public final void rule__Instance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1461:1: ( ( ( rule__Instance__TitleAssignment_1_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1462:1: ( ( rule__Instance__TitleAssignment_1_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1462:1: ( ( rule__Instance__TitleAssignment_1_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1463:1: ( rule__Instance__TitleAssignment_1_1 )
            {
             before(grammarAccess.getInstanceAccess().getTitleAssignment_1_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1464:1: ( rule__Instance__TitleAssignment_1_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1464:2: rule__Instance__TitleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Instance__TitleAssignment_1_1_in_rule__Instance__Group_1__1__Impl2954);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1478:1: rule__Instance__Group_2__0 : rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1 ;
    public final void rule__Instance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1482:1: ( rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1483:2: rule__Instance__Group_2__0__Impl rule__Instance__Group_2__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_2__0__Impl_in_rule__Instance__Group_2__02988);
            rule__Instance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_2__1_in_rule__Instance__Group_2__02991);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1490:1: rule__Instance__Group_2__0__Impl : ( '@abstract' ) ;
    public final void rule__Instance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1494:1: ( ( '@abstract' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1495:1: ( '@abstract' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1495:1: ( '@abstract' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1496:1: '@abstract'
            {
             before(grammarAccess.getInstanceAccess().getAbstractKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Instance__Group_2__0__Impl3019); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1509:1: rule__Instance__Group_2__1 : rule__Instance__Group_2__1__Impl ;
    public final void rule__Instance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1513:1: ( rule__Instance__Group_2__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1514:2: rule__Instance__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_2__1__Impl_in_rule__Instance__Group_2__13050);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1520:1: rule__Instance__Group_2__1__Impl : ( ( rule__Instance__AbstractAssignment_2_1 ) ) ;
    public final void rule__Instance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1524:1: ( ( ( rule__Instance__AbstractAssignment_2_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1525:1: ( ( rule__Instance__AbstractAssignment_2_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1525:1: ( ( rule__Instance__AbstractAssignment_2_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1526:1: ( rule__Instance__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getInstanceAccess().getAbstractAssignment_2_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1527:1: ( rule__Instance__AbstractAssignment_2_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1527:2: rule__Instance__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Instance__AbstractAssignment_2_1_in_rule__Instance__Group_2__1__Impl3077);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1541:1: rule__Instance__Group_3__0 : rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 ;
    public final void rule__Instance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1545:1: ( rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1546:2: rule__Instance__Group_3__0__Impl rule__Instance__Group_3__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__03111);
            rule__Instance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__03114);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1553:1: rule__Instance__Group_3__0__Impl : ( '@doc' ) ;
    public final void rule__Instance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1557:1: ( ( '@doc' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1558:1: ( '@doc' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1558:1: ( '@doc' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1559:1: '@doc'
            {
             before(grammarAccess.getInstanceAccess().getDocKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Instance__Group_3__0__Impl3142); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1572:1: rule__Instance__Group_3__1 : rule__Instance__Group_3__1__Impl ;
    public final void rule__Instance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1576:1: ( rule__Instance__Group_3__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1577:2: rule__Instance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__13173);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1583:1: rule__Instance__Group_3__1__Impl : ( ( rule__Instance__DocumentationAssignment_3_1 ) ) ;
    public final void rule__Instance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1587:1: ( ( ( rule__Instance__DocumentationAssignment_3_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1588:1: ( ( rule__Instance__DocumentationAssignment_3_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1588:1: ( ( rule__Instance__DocumentationAssignment_3_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1589:1: ( rule__Instance__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getInstanceAccess().getDocumentationAssignment_3_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1590:1: ( rule__Instance__DocumentationAssignment_3_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1590:2: rule__Instance__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Instance__DocumentationAssignment_3_1_in_rule__Instance__Group_3__1__Impl3200);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1604:1: rule__Instance__Group_4__0 : rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1 ;
    public final void rule__Instance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1608:1: ( rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1609:2: rule__Instance__Group_4__0__Impl rule__Instance__Group_4__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_4__0__Impl_in_rule__Instance__Group_4__03234);
            rule__Instance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_4__1_in_rule__Instance__Group_4__03237);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1616:1: rule__Instance__Group_4__0__Impl : ( '@abbr' ) ;
    public final void rule__Instance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1620:1: ( ( '@abbr' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1621:1: ( '@abbr' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1621:1: ( '@abbr' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1622:1: '@abbr'
            {
             before(grammarAccess.getInstanceAccess().getAbbrKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Instance__Group_4__0__Impl3265); 
             after(grammarAccess.getInstanceAccess().getAbbrKeyword_4_0()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1635:1: rule__Instance__Group_4__1 : rule__Instance__Group_4__1__Impl ;
    public final void rule__Instance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1639:1: ( rule__Instance__Group_4__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1640:2: rule__Instance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_4__1__Impl_in_rule__Instance__Group_4__13296);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1646:1: rule__Instance__Group_4__1__Impl : ( ( rule__Instance__AbbrAssignment_4_1 ) ) ;
    public final void rule__Instance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1650:1: ( ( ( rule__Instance__AbbrAssignment_4_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1651:1: ( ( rule__Instance__AbbrAssignment_4_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1651:1: ( ( rule__Instance__AbbrAssignment_4_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1652:1: ( rule__Instance__AbbrAssignment_4_1 )
            {
             before(grammarAccess.getInstanceAccess().getAbbrAssignment_4_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1653:1: ( rule__Instance__AbbrAssignment_4_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1653:2: rule__Instance__AbbrAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Instance__AbbrAssignment_4_1_in_rule__Instance__Group_4__1__Impl3323);
            rule__Instance__AbbrAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getAbbrAssignment_4_1()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1667:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1671:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1672:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_5__0__Impl_in_rule__Instance__Group_5__03357);
            rule__Instance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_5__1_in_rule__Instance__Group_5__03360);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1679:1: rule__Instance__Group_5__0__Impl : ( '@see' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1683:1: ( ( '@see' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1684:1: ( '@see' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1684:1: ( '@see' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1685:1: '@see'
            {
             before(grammarAccess.getInstanceAccess().getSeeKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Instance__Group_5__0__Impl3388); 
             after(grammarAccess.getInstanceAccess().getSeeKeyword_5_0()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1698:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1702:1: ( rule__Instance__Group_5__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1703:2: rule__Instance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_5__1__Impl_in_rule__Instance__Group_5__13419);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1709:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__SeeAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1713:1: ( ( ( rule__Instance__SeeAssignment_5_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1714:1: ( ( rule__Instance__SeeAssignment_5_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1714:1: ( ( rule__Instance__SeeAssignment_5_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1715:1: ( rule__Instance__SeeAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getSeeAssignment_5_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1716:1: ( rule__Instance__SeeAssignment_5_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1716:2: rule__Instance__SeeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Instance__SeeAssignment_5_1_in_rule__Instance__Group_5__1__Impl3446);
            rule__Instance__SeeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getSeeAssignment_5_1()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1730:1: rule__Instance__Group_6__0 : rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1 ;
    public final void rule__Instance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1734:1: ( rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1735:2: rule__Instance__Group_6__0__Impl rule__Instance__Group_6__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_6__0__Impl_in_rule__Instance__Group_6__03480);
            rule__Instance__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_6__1_in_rule__Instance__Group_6__03483);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1742:1: rule__Instance__Group_6__0__Impl : ( '@tag' ) ;
    public final void rule__Instance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1746:1: ( ( '@tag' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1747:1: ( '@tag' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1747:1: ( '@tag' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1748:1: '@tag'
            {
             before(grammarAccess.getInstanceAccess().getTagKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__Instance__Group_6__0__Impl3511); 
             after(grammarAccess.getInstanceAccess().getTagKeyword_6_0()); 

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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1761:1: rule__Instance__Group_6__1 : rule__Instance__Group_6__1__Impl ;
    public final void rule__Instance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1765:1: ( rule__Instance__Group_6__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1766:2: rule__Instance__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_6__1__Impl_in_rule__Instance__Group_6__13542);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1772:1: rule__Instance__Group_6__1__Impl : ( ( rule__Instance__TagsAssignment_6_1 ) ) ;
    public final void rule__Instance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1776:1: ( ( ( rule__Instance__TagsAssignment_6_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1777:1: ( ( rule__Instance__TagsAssignment_6_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1777:1: ( ( rule__Instance__TagsAssignment_6_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1778:1: ( rule__Instance__TagsAssignment_6_1 )
            {
             before(grammarAccess.getInstanceAccess().getTagsAssignment_6_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1779:1: ( rule__Instance__TagsAssignment_6_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1779:2: rule__Instance__TagsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Instance__TagsAssignment_6_1_in_rule__Instance__Group_6__1__Impl3569);
            rule__Instance__TagsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTagsAssignment_6_1()); 

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


    // $ANTLR start "rule__Instance__Group_7__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1793:1: rule__Instance__Group_7__0 : rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 ;
    public final void rule__Instance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1797:1: ( rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1798:2: rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_7__0__Impl_in_rule__Instance__Group_7__03603);
            rule__Instance__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_7__1_in_rule__Instance__Group_7__03606);
            rule__Instance__Group_7__1();

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
    // $ANTLR end "rule__Instance__Group_7__0"


    // $ANTLR start "rule__Instance__Group_7__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1805:1: rule__Instance__Group_7__0__Impl : ( '@since' ) ;
    public final void rule__Instance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1809:1: ( ( '@since' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1810:1: ( '@since' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1810:1: ( '@since' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1811:1: '@since'
            {
             before(grammarAccess.getInstanceAccess().getSinceKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__Instance__Group_7__0__Impl3634); 
             after(grammarAccess.getInstanceAccess().getSinceKeyword_7_0()); 

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
    // $ANTLR end "rule__Instance__Group_7__0__Impl"


    // $ANTLR start "rule__Instance__Group_7__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1824:1: rule__Instance__Group_7__1 : rule__Instance__Group_7__1__Impl ;
    public final void rule__Instance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1828:1: ( rule__Instance__Group_7__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1829:2: rule__Instance__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_7__1__Impl_in_rule__Instance__Group_7__13665);
            rule__Instance__Group_7__1__Impl();

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
    // $ANTLR end "rule__Instance__Group_7__1"


    // $ANTLR start "rule__Instance__Group_7__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1835:1: rule__Instance__Group_7__1__Impl : ( ( rule__Instance__SinceAssignment_7_1 ) ) ;
    public final void rule__Instance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1839:1: ( ( ( rule__Instance__SinceAssignment_7_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1840:1: ( ( rule__Instance__SinceAssignment_7_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1840:1: ( ( rule__Instance__SinceAssignment_7_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1841:1: ( rule__Instance__SinceAssignment_7_1 )
            {
             before(grammarAccess.getInstanceAccess().getSinceAssignment_7_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1842:1: ( rule__Instance__SinceAssignment_7_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1842:2: rule__Instance__SinceAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Instance__SinceAssignment_7_1_in_rule__Instance__Group_7__1__Impl3692);
            rule__Instance__SinceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getSinceAssignment_7_1()); 

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
    // $ANTLR end "rule__Instance__Group_7__1__Impl"


    // $ANTLR start "rule__Instance__Group_8__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1856:1: rule__Instance__Group_8__0 : rule__Instance__Group_8__0__Impl rule__Instance__Group_8__1 ;
    public final void rule__Instance__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1860:1: ( rule__Instance__Group_8__0__Impl rule__Instance__Group_8__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1861:2: rule__Instance__Group_8__0__Impl rule__Instance__Group_8__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_8__0__Impl_in_rule__Instance__Group_8__03726);
            rule__Instance__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_8__1_in_rule__Instance__Group_8__03729);
            rule__Instance__Group_8__1();

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
    // $ANTLR end "rule__Instance__Group_8__0"


    // $ANTLR start "rule__Instance__Group_8__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1868:1: rule__Instance__Group_8__0__Impl : ( '@version' ) ;
    public final void rule__Instance__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1872:1: ( ( '@version' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1873:1: ( '@version' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1873:1: ( '@version' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1874:1: '@version'
            {
             before(grammarAccess.getInstanceAccess().getVersionKeyword_8_0()); 
            match(input,30,FOLLOW_30_in_rule__Instance__Group_8__0__Impl3757); 
             after(grammarAccess.getInstanceAccess().getVersionKeyword_8_0()); 

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
    // $ANTLR end "rule__Instance__Group_8__0__Impl"


    // $ANTLR start "rule__Instance__Group_8__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1887:1: rule__Instance__Group_8__1 : rule__Instance__Group_8__1__Impl ;
    public final void rule__Instance__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1891:1: ( rule__Instance__Group_8__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1892:2: rule__Instance__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_8__1__Impl_in_rule__Instance__Group_8__13788);
            rule__Instance__Group_8__1__Impl();

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
    // $ANTLR end "rule__Instance__Group_8__1"


    // $ANTLR start "rule__Instance__Group_8__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1898:1: rule__Instance__Group_8__1__Impl : ( ( rule__Instance__VersionAssignment_8_1 ) ) ;
    public final void rule__Instance__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1902:1: ( ( ( rule__Instance__VersionAssignment_8_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1903:1: ( ( rule__Instance__VersionAssignment_8_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1903:1: ( ( rule__Instance__VersionAssignment_8_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1904:1: ( rule__Instance__VersionAssignment_8_1 )
            {
             before(grammarAccess.getInstanceAccess().getVersionAssignment_8_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1905:1: ( rule__Instance__VersionAssignment_8_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1905:2: rule__Instance__VersionAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Instance__VersionAssignment_8_1_in_rule__Instance__Group_8__1__Impl3815);
            rule__Instance__VersionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getVersionAssignment_8_1()); 

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
    // $ANTLR end "rule__Instance__Group_8__1__Impl"


    // $ANTLR start "rule__Instance__Group_9__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1919:1: rule__Instance__Group_9__0 : rule__Instance__Group_9__0__Impl rule__Instance__Group_9__1 ;
    public final void rule__Instance__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1923:1: ( rule__Instance__Group_9__0__Impl rule__Instance__Group_9__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1924:2: rule__Instance__Group_9__0__Impl rule__Instance__Group_9__1
            {
            pushFollow(FOLLOW_rule__Instance__Group_9__0__Impl_in_rule__Instance__Group_9__03849);
            rule__Instance__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instance__Group_9__1_in_rule__Instance__Group_9__03852);
            rule__Instance__Group_9__1();

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
    // $ANTLR end "rule__Instance__Group_9__0"


    // $ANTLR start "rule__Instance__Group_9__0__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1931:1: rule__Instance__Group_9__0__Impl : ( ( rule__Instance__NameAssignment_9_0 ) ) ;
    public final void rule__Instance__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1935:1: ( ( ( rule__Instance__NameAssignment_9_0 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1936:1: ( ( rule__Instance__NameAssignment_9_0 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1936:1: ( ( rule__Instance__NameAssignment_9_0 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1937:1: ( rule__Instance__NameAssignment_9_0 )
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_9_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1938:1: ( rule__Instance__NameAssignment_9_0 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1938:2: rule__Instance__NameAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Instance__NameAssignment_9_0_in_rule__Instance__Group_9__0__Impl3879);
            rule__Instance__NameAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_9_0()); 

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
    // $ANTLR end "rule__Instance__Group_9__0__Impl"


    // $ANTLR start "rule__Instance__Group_9__1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1948:1: rule__Instance__Group_9__1 : rule__Instance__Group_9__1__Impl ;
    public final void rule__Instance__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1952:1: ( rule__Instance__Group_9__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1953:2: rule__Instance__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group_9__1__Impl_in_rule__Instance__Group_9__13909);
            rule__Instance__Group_9__1__Impl();

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
    // $ANTLR end "rule__Instance__Group_9__1"


    // $ANTLR start "rule__Instance__Group_9__1__Impl"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1959:1: rule__Instance__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Instance__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1963:1: ( ( '=' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1964:1: ( '=' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1964:1: ( '=' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1965:1: '='
            {
             before(grammarAccess.getInstanceAccess().getEqualsSignKeyword_9_1()); 
            match(input,31,FOLLOW_31_in_rule__Instance__Group_9__1__Impl3937); 
             after(grammarAccess.getInstanceAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Instance__Group_9__1__Impl"


    // $ANTLR start "rule__Slot__Group__0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1982:1: rule__Slot__Group__0 : rule__Slot__Group__0__Impl rule__Slot__Group__1 ;
    public final void rule__Slot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1986:1: ( rule__Slot__Group__0__Impl rule__Slot__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1987:2: rule__Slot__Group__0__Impl rule__Slot__Group__1
            {
            pushFollow(FOLLOW_rule__Slot__Group__0__Impl_in_rule__Slot__Group__03972);
            rule__Slot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__1_in_rule__Slot__Group__03975);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1994:1: rule__Slot__Group__0__Impl : ( () ) ;
    public final void rule__Slot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1998:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1999:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:1999:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2000:1: ()
            {
             before(grammarAccess.getSlotAccess().getSlotAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2001:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2003:1: 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2013:1: rule__Slot__Group__1 : rule__Slot__Group__1__Impl rule__Slot__Group__2 ;
    public final void rule__Slot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2017:1: ( rule__Slot__Group__1__Impl rule__Slot__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2018:2: rule__Slot__Group__1__Impl rule__Slot__Group__2
            {
            pushFollow(FOLLOW_rule__Slot__Group__1__Impl_in_rule__Slot__Group__14033);
            rule__Slot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__2_in_rule__Slot__Group__14036);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2025:1: rule__Slot__Group__1__Impl : ( ( rule__Slot__NameAssignment_1 ) ) ;
    public final void rule__Slot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2029:1: ( ( ( rule__Slot__NameAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2030:1: ( ( rule__Slot__NameAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2030:1: ( ( rule__Slot__NameAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2031:1: ( rule__Slot__NameAssignment_1 )
            {
             before(grammarAccess.getSlotAccess().getNameAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2032:1: ( rule__Slot__NameAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2032:2: rule__Slot__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Slot__NameAssignment_1_in_rule__Slot__Group__1__Impl4063);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2042:1: rule__Slot__Group__2 : rule__Slot__Group__2__Impl rule__Slot__Group__3 ;
    public final void rule__Slot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2046:1: ( rule__Slot__Group__2__Impl rule__Slot__Group__3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2047:2: rule__Slot__Group__2__Impl rule__Slot__Group__3
            {
            pushFollow(FOLLOW_rule__Slot__Group__2__Impl_in_rule__Slot__Group__24093);
            rule__Slot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Slot__Group__3_in_rule__Slot__Group__24096);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2054:1: rule__Slot__Group__2__Impl : ( '=' ) ;
    public final void rule__Slot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2058:1: ( ( '=' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2059:1: ( '=' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2059:1: ( '=' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2060:1: '='
            {
             before(grammarAccess.getSlotAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Slot__Group__2__Impl4124); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2073:1: rule__Slot__Group__3 : rule__Slot__Group__3__Impl ;
    public final void rule__Slot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2077:1: ( rule__Slot__Group__3__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2078:2: rule__Slot__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Slot__Group__3__Impl_in_rule__Slot__Group__34155);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2084:1: rule__Slot__Group__3__Impl : ( ( rule__Slot__ValueAssignment_3 ) ) ;
    public final void rule__Slot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2088:1: ( ( ( rule__Slot__ValueAssignment_3 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2089:1: ( ( rule__Slot__ValueAssignment_3 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2089:1: ( ( rule__Slot__ValueAssignment_3 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2090:1: ( rule__Slot__ValueAssignment_3 )
            {
             before(grammarAccess.getSlotAccess().getValueAssignment_3()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2091:1: ( rule__Slot__ValueAssignment_3 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2091:2: rule__Slot__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Slot__ValueAssignment_3_in_rule__Slot__Group__3__Impl4182);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2109:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2113:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2114:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04220);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04223);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2121:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2125:1: ( ( '[' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2126:1: ( '[' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2126:1: ( '[' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2127:1: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Array__Group__0__Impl4251); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2140:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2144:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2145:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14282);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14285);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2152:1: rule__Array__Group__1__Impl : ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2156:1: ( ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2157:1: ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2157:1: ( ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2158:1: ( ( rule__Array__ValueAssignment_1 ) ) ( ( rule__Array__ValueAssignment_1 )* )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2158:1: ( ( rule__Array__ValueAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2159:1: ( rule__Array__ValueAssignment_1 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2160:1: ( rule__Array__ValueAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2160:2: rule__Array__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl4314);
            rule__Array__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValueAssignment_1()); 

            }

            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2163:1: ( ( rule__Array__ValueAssignment_1 )* )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2164:1: ( rule__Array__ValueAssignment_1 )*
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2165:1: ( rule__Array__ValueAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_FQN && LA18_0<=RULE_ID)||LA18_0==RULE_NUMBER||(LA18_0>=19 && LA18_0<=20)||(LA18_0>=23 && LA18_0<=30)||LA18_0==32||(LA18_0>=34 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2165:2: rule__Array__ValueAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl4326);
            	    rule__Array__ValueAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2176:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2180:1: ( rule__Array__Group__2__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2181:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24359);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2187:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2191:1: ( ( ']' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2192:1: ( ']' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2192:1: ( ']' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2193:1: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Array__Group__2__Impl4387); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2212:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2216:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2217:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
            {
            pushFollow(FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04424);
            rule__NullValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04427);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2224:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2228:1: ( ( () ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2229:1: ( () )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2229:1: ( () )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2230:1: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2231:1: ()
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2233:1: 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2243:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2247:1: ( rule__NullValue__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2248:2: rule__NullValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14485);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2254:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2258:1: ( ( 'null' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2259:1: ( 'null' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2259:1: ( 'null' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2260:1: 'null'
            {
             before(grammarAccess.getNullValueAccess().getNullKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__NullValue__Group__1__Impl4513); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2277:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2281:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2282:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_rule__EnumValue__Group__0__Impl_in_rule__EnumValue__Group__04548);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumValue__Group__1_in_rule__EnumValue__Group__04551);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2289:1: rule__EnumValue__Group__0__Impl : ( '#' ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2293:1: ( ( '#' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2294:1: ( '#' )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2294:1: ( '#' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2295:1: '#'
            {
             before(grammarAccess.getEnumValueAccess().getNumberSignKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__EnumValue__Group__0__Impl4579); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2308:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2312:1: ( rule__EnumValue__Group__1__Impl )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2313:2: rule__EnumValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumValue__Group__1__Impl_in_rule__EnumValue__Group__14610);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2319:1: rule__EnumValue__Group__1__Impl : ( ( rule__EnumValue__ValueAssignment_1 ) ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2323:1: ( ( ( rule__EnumValue__ValueAssignment_1 ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2324:1: ( ( rule__EnumValue__ValueAssignment_1 ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2324:1: ( ( rule__EnumValue__ValueAssignment_1 ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2325:1: ( rule__EnumValue__ValueAssignment_1 )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment_1()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2326:1: ( rule__EnumValue__ValueAssignment_1 )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2326:2: rule__EnumValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumValue__ValueAssignment_1_in_rule__EnumValue__Group__1__Impl4637);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2341:1: rule__Unit__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Unit__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2345:1: ( ( ruleImport ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2346:1: ( ruleImport )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2346:1: ( ruleImport )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2347:1: ruleImport
            {
             before(grammarAccess.getUnitAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Unit__ImportsAssignment_04676);
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


    // $ANTLR start "rule__Unit__ParentAssignment_1_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2356:1: rule__Unit__ParentAssignment_1_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Unit__ParentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2360:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2361:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2361:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2362:1: ( RULE_FQN )
            {
             before(grammarAccess.getUnitAccess().getParentInstanceCrossReference_1_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2363:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2364:1: RULE_FQN
            {
             before(grammarAccess.getUnitAccess().getParentInstanceFQNTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__Unit__ParentAssignment_1_14711); 
             after(grammarAccess.getUnitAccess().getParentInstanceFQNTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getUnitAccess().getParentInstanceCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Unit__ParentAssignment_1_1"


    // $ANTLR start "rule__Unit__ContainerAssignment_2"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2375:1: rule__Unit__ContainerAssignment_2 : ( ruleContainer ) ;
    public final void rule__Unit__ContainerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2379:1: ( ( ruleContainer ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2380:1: ( ruleContainer )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2380:1: ( ruleContainer )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2381:1: ruleContainer
            {
             before(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Unit__ContainerAssignment_24746);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getContainerContainerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Unit__ContainerAssignment_2"


    // $ANTLR start "rule__Unit__InstancesAssignment_3"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2390:1: rule__Unit__InstancesAssignment_3 : ( ruleInstance ) ;
    public final void rule__Unit__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2394:1: ( ( ruleInstance ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2395:1: ( ruleInstance )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2395:1: ( ruleInstance )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2396:1: ruleInstance
            {
             before(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstance_in_rule__Unit__InstancesAssignment_34777);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getInstancesInstanceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Unit__InstancesAssignment_3"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2405:1: rule__Import__NameAssignment_1 : ( RULE_MY_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2409:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2410:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2410:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2411:1: RULE_MY_STRING
            {
             before(grammarAccess.getImportAccess().getNameMY_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Import__NameAssignment_14808); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2420:1: rule__Container__InstanceAssignment_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Container__InstanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2424:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2425:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2425:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2426:1: ( RULE_FQN )
            {
             before(grammarAccess.getContainerAccess().getInstanceInstanceCrossReference_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2427:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2428:1: RULE_FQN
            {
             before(grammarAccess.getContainerAccess().getInstanceInstanceFQNTerminalRuleCall_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__Container__InstanceAssignment_14843); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2439:1: rule__Container__FeatureAssignment_3 : ( RULE_ID ) ;
    public final void rule__Container__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2443:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2444:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2444:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2445:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getFeatureIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Container__FeatureAssignment_34878); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2454:1: rule__Instance__TitleAssignment_1_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__TitleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2458:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2459:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2459:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2460:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getTitleMY_STRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__TitleAssignment_1_14909); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2469:1: rule__Instance__AbstractAssignment_2_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2473:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2474:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2474:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2475:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getAbstractMY_STRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__AbstractAssignment_2_14940); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2484:1: rule__Instance__DocumentationAssignment_3_1 : ( RULE_MY_STRING ) ;
    public final void rule__Instance__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2488:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2489:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2489:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2490:1: RULE_MY_STRING
            {
             before(grammarAccess.getInstanceAccess().getDocumentationMY_STRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__Instance__DocumentationAssignment_3_14971); 
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


    // $ANTLR start "rule__Instance__AbbrAssignment_4_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2499:1: rule__Instance__AbbrAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Instance__AbbrAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2503:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2504:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2504:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2505:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getAbbrIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__AbbrAssignment_4_15002); 
             after(grammarAccess.getInstanceAccess().getAbbrIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Instance__AbbrAssignment_4_1"


    // $ANTLR start "rule__Instance__SeeAssignment_5_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2514:1: rule__Instance__SeeAssignment_5_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Instance__SeeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2518:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2519:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2519:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2520:1: ( RULE_FQN )
            {
             before(grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_5_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2521:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2522:1: RULE_FQN
            {
             before(grammarAccess.getInstanceAccess().getSeeInstanceFQNTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__Instance__SeeAssignment_5_15037); 
             after(grammarAccess.getInstanceAccess().getSeeInstanceFQNTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getSeeInstanceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Instance__SeeAssignment_5_1"


    // $ANTLR start "rule__Instance__TagsAssignment_6_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2533:1: rule__Instance__TagsAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Instance__TagsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2537:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2538:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2538:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2539:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__TagsAssignment_6_15072); 
             after(grammarAccess.getInstanceAccess().getTagsIDTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Instance__TagsAssignment_6_1"


    // $ANTLR start "rule__Instance__SinceAssignment_7_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2548:1: rule__Instance__SinceAssignment_7_1 : ( RULE_VERSION ) ;
    public final void rule__Instance__SinceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2552:1: ( ( RULE_VERSION ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2553:1: ( RULE_VERSION )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2553:1: ( RULE_VERSION )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2554:1: RULE_VERSION
            {
             before(grammarAccess.getInstanceAccess().getSinceVERSIONTerminalRuleCall_7_1_0()); 
            match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_rule__Instance__SinceAssignment_7_15103); 
             after(grammarAccess.getInstanceAccess().getSinceVERSIONTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Instance__SinceAssignment_7_1"


    // $ANTLR start "rule__Instance__VersionAssignment_8_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2563:1: rule__Instance__VersionAssignment_8_1 : ( RULE_VERSION ) ;
    public final void rule__Instance__VersionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2567:1: ( ( RULE_VERSION ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2568:1: ( RULE_VERSION )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2568:1: ( RULE_VERSION )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2569:1: RULE_VERSION
            {
             before(grammarAccess.getInstanceAccess().getVersionVERSIONTerminalRuleCall_8_1_0()); 
            match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_rule__Instance__VersionAssignment_8_15134); 
             after(grammarAccess.getInstanceAccess().getVersionVERSIONTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Instance__VersionAssignment_8_1"


    // $ANTLR start "rule__Instance__NameAssignment_9_0"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2578:1: rule__Instance__NameAssignment_9_0 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2582:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2583:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2583:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2584:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_9_05165); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__Instance__NameAssignment_9_0"


    // $ANTLR start "rule__Instance__TypeAssignment_11"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2593:1: rule__Instance__TypeAssignment_11 : ( RULE_ID ) ;
    public final void rule__Instance__TypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2597:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2598:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2598:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2599:1: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__TypeAssignment_115196); 
             after(grammarAccess.getInstanceAccess().getTypeIDTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Instance__TypeAssignment_11"


    // $ANTLR start "rule__Instance__SlotsAssignment_13"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2608:1: rule__Instance__SlotsAssignment_13 : ( ruleSlot ) ;
    public final void rule__Instance__SlotsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2612:1: ( ( ruleSlot ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2613:1: ( ruleSlot )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2613:1: ( ruleSlot )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2614:1: ruleSlot
            {
             before(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleSlot_in_rule__Instance__SlotsAssignment_135227);
            ruleSlot();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getSlotsSlotParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Instance__SlotsAssignment_13"


    // $ANTLR start "rule__Slot__NameAssignment_1"
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2623:1: rule__Slot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2627:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2628:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2628:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2629:1: RULE_ID
            {
             before(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Slot__NameAssignment_15258); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2638:1: rule__Slot__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Slot__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2642:1: ( ( ruleValue ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2643:1: ( ruleValue )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2643:1: ( ruleValue )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2644:1: ruleValue
            {
             before(grammarAccess.getSlotAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Slot__ValueAssignment_35289);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2653:1: rule__Array__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2657:1: ( ( ruleValue ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2658:1: ( ruleValue )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2658:1: ( ruleValue )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2659:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValueAssignment_15320);
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2668:1: rule__StringValue__ValueAssignment : ( RULE_MY_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2672:1: ( ( RULE_MY_STRING ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2673:1: ( RULE_MY_STRING )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2673:1: ( RULE_MY_STRING )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2674:1: RULE_MY_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueMY_STRINGTerminalRuleCall_0()); 
            match(input,RULE_MY_STRING,FOLLOW_RULE_MY_STRING_in_rule__StringValue__ValueAssignment5351); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2683:1: rule__BooleanValue__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2687:1: ( ( ( 'true' ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2688:1: ( ( 'true' ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2688:1: ( ( 'true' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2689:1: ( 'true' )
            {
             before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2690:1: ( 'true' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2691:1: 'true'
            {
             before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__BooleanValue__ValueAssignment_05387); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2706:1: rule__BooleanValue__ValueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BooleanValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2710:1: ( ( ( 'false' ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2711:1: ( ( 'false' ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2711:1: ( ( 'false' ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2712:1: ( 'false' )
            {
             before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2713:1: ( 'false' )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2714:1: 'false'
            {
             before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__BooleanValue__ValueAssignment_15431); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2729:1: rule__NumberValue__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2733:1: ( ( RULE_NUMBER ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2734:1: ( RULE_NUMBER )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2734:1: ( RULE_NUMBER )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2735:1: RULE_NUMBER
            {
             before(grammarAccess.getNumberValueAccess().getValueNUMBERTerminalRuleCall_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__NumberValue__ValueAssignment5470); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2744:1: rule__InstanceRef__ValueAssignment : ( ( RULE_FQN ) ) ;
    public final void rule__InstanceRef__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2748:1: ( ( ( RULE_FQN ) ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2749:1: ( ( RULE_FQN ) )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2749:1: ( ( RULE_FQN ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2750:1: ( RULE_FQN )
            {
             before(grammarAccess.getInstanceRefAccess().getValueInstanceCrossReference_0()); 
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2751:1: ( RULE_FQN )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2752:1: RULE_FQN
            {
             before(grammarAccess.getInstanceRefAccess().getValueInstanceFQNTerminalRuleCall_0_1()); 
            match(input,RULE_FQN,FOLLOW_RULE_FQN_in_rule__InstanceRef__ValueAssignment5505); 
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
    // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2763:1: rule__EnumValue__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2767:1: ( ( RULE_ID ) )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2768:1: ( RULE_ID )
            {
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2768:1: ( RULE_ID )
            // ../org.ollabaca.on.ui/src-gen/org/ollabaca/on/ui/contentassist/antlr/internal/InternalObjectNotation.g:2769:1: RULE_ID
            {
             before(grammarAccess.getEnumValueAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumValue__ValueAssignment_15540); 
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
    public static final BitSet FOLLOW_rule__Unit__Group__0__Impl_in_rule__Unit__Group__01145 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Unit__Group__1_in_rule__Unit__Group__01148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1177 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Unit__ImportsAssignment_0_in_rule__Unit__Group__0__Impl1189 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Unit__Group__1__Impl_in_rule__Unit__Group__11222 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Unit__Group__2_in_rule__Unit__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group_1__0_in_rule__Unit__Group__1__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group__2__Impl_in_rule__Unit__Group__21283 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Unit__Group__3_in_rule__Unit__Group__21286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__ContainerAssignment_2_in_rule__Unit__Group__2__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group__3__Impl_in_rule__Unit__Group__31344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__InstancesAssignment_3_in_rule__Unit__Group__3__Impl1373 = new BitSet(new long[]{0x000000007F950042L});
    public static final BitSet FOLLOW_rule__Unit__InstancesAssignment_3_in_rule__Unit__Group__3__Impl1385 = new BitSet(new long[]{0x000000007F950042L});
    public static final BitSet FOLLOW_rule__Unit__Group_1__0__Impl_in_rule__Unit__Group_1__01426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Unit__Group_1__1_in_rule__Unit__Group_1__01429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Unit__Group_1__0__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Group_1__1__Impl_in_rule__Unit__Group_1__11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__ParentAssignment_1_1_in_rule__Unit__Group_1__1__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__NameAssignment_1_in_rule__Import__Group__1__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__01672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Container__Group__0__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__11734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__InstanceAssignment_1_in_rule__Container__Group__1__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__21794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__21797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Container__Group__2__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__31856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__FeatureAssignment_3_in_rule__Container__Group__3__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__01921 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__01924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__11982 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__0_in_rule__Instance__Group__1__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__22043 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__3_in_rule__Instance__Group__22046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__0_in_rule__Instance__Group__2__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__3__Impl_in_rule__Instance__Group__32104 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__4_in_rule__Instance__Group__32107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0_in_rule__Instance__Group__3__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__4__Impl_in_rule__Instance__Group__42165 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__5_in_rule__Instance__Group__42168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__0_in_rule__Instance__Group__4__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__5__Impl_in_rule__Instance__Group__52226 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__6_in_rule__Instance__Group__52229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__0_in_rule__Instance__Group__5__Impl2256 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__6__Impl_in_rule__Instance__Group__62287 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__7_in_rule__Instance__Group__62290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__0_in_rule__Instance__Group__6__Impl2317 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__7__Impl_in_rule__Instance__Group__72348 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__8_in_rule__Instance__Group__72351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_7__0_in_rule__Instance__Group__7__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__8__Impl_in_rule__Instance__Group__82409 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__9_in_rule__Instance__Group__82412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_8__0_in_rule__Instance__Group__8__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__9__Impl_in_rule__Instance__Group__92470 = new BitSet(new long[]{0x000000007F950040L});
    public static final BitSet FOLLOW_rule__Instance__Group__10_in_rule__Instance__Group__92473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_9__0_in_rule__Instance__Group__9__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__10__Impl_in_rule__Instance__Group__102531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instance__Group__11_in_rule__Instance__Group__102534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Instance__Group__10__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__11__Impl_in_rule__Instance__Group__112593 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instance__Group__12_in_rule__Instance__Group__112596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TypeAssignment_11_in_rule__Instance__Group__11__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__12__Impl_in_rule__Instance__Group__122653 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_rule__Instance__Group__13_in_rule__Instance__Group__122656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instance__Group__12__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__13__Impl_in_rule__Instance__Group__132715 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_rule__Instance__Group__14_in_rule__Instance__Group__132718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__SlotsAssignment_13_in_rule__Instance__Group__13__Impl2745 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Instance__Group__14__Impl_in_rule__Instance__Group__142776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instance__Group__14__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__0__Impl_in_rule__Instance__Group_1__02865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__1_in_rule__Instance__Group_1__02868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Instance__Group_1__0__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_1__1__Impl_in_rule__Instance__Group_1__12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TitleAssignment_1_1_in_rule__Instance__Group_1__1__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__0__Impl_in_rule__Instance__Group_2__02988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__1_in_rule__Instance__Group_2__02991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Instance__Group_2__0__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_2__1__Impl_in_rule__Instance__Group_2__13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__AbstractAssignment_2_1_in_rule__Instance__Group_2__1__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__0__Impl_in_rule__Instance__Group_3__03111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1_in_rule__Instance__Group_3__03114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Instance__Group_3__0__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_3__1__Impl_in_rule__Instance__Group_3__13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__DocumentationAssignment_3_1_in_rule__Instance__Group_3__1__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__0__Impl_in_rule__Instance__Group_4__03234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__1_in_rule__Instance__Group_4__03237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Instance__Group_4__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_4__1__Impl_in_rule__Instance__Group_4__13296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__AbbrAssignment_4_1_in_rule__Instance__Group_4__1__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__0__Impl_in_rule__Instance__Group_5__03357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__1_in_rule__Instance__Group_5__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Instance__Group_5__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_5__1__Impl_in_rule__Instance__Group_5__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__SeeAssignment_5_1_in_rule__Instance__Group_5__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__0__Impl_in_rule__Instance__Group_6__03480 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__1_in_rule__Instance__Group_6__03483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Instance__Group_6__0__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_6__1__Impl_in_rule__Instance__Group_6__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TagsAssignment_6_1_in_rule__Instance__Group_6__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_7__0__Impl_in_rule__Instance__Group_7__03603 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Instance__Group_7__1_in_rule__Instance__Group_7__03606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Instance__Group_7__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_7__1__Impl_in_rule__Instance__Group_7__13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__SinceAssignment_7_1_in_rule__Instance__Group_7__1__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_8__0__Impl_in_rule__Instance__Group_8__03726 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Instance__Group_8__1_in_rule__Instance__Group_8__03729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Instance__Group_8__0__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_8__1__Impl_in_rule__Instance__Group_8__13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__VersionAssignment_8_1_in_rule__Instance__Group_8__1__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_9__0__Impl_in_rule__Instance__Group_9__03849 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Instance__Group_9__1_in_rule__Instance__Group_9__03852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__NameAssignment_9_0_in_rule__Instance__Group_9__0__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group_9__1__Impl_in_rule__Instance__Group_9__13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Instance__Group_9__1__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__0__Impl_in_rule__Slot__Group__03972 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Slot__Group__1_in_rule__Slot__Group__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__1__Impl_in_rule__Slot__Group__14033 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Slot__Group__2_in_rule__Slot__Group__14036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__NameAssignment_1_in_rule__Slot__Group__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__2__Impl_in_rule__Slot__Group__24093 = new BitSet(new long[]{0x0000001D7F9D0170L});
    public static final BitSet FOLLOW_rule__Slot__Group__3_in_rule__Slot__Group__24096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Slot__Group__2__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__Group__3__Impl_in_rule__Slot__Group__34155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slot__ValueAssignment_3_in_rule__Slot__Group__3__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04220 = new BitSet(new long[]{0x0000001D7F9D0170L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Array__Group__0__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14282 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl4314 = new BitSet(new long[]{0x0000001D7F9D0172L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_1_in_rule__Array__Group__1__Impl4326 = new BitSet(new long[]{0x0000001D7F9D0172L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Array__Group__2__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04424 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NullValue__Group__1__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__0__Impl_in_rule__EnumValue__Group__04548 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__1_in_rule__EnumValue__Group__04551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumValue__Group__0__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__Group__1__Impl_in_rule__EnumValue__Group__14610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__ValueAssignment_1_in_rule__EnumValue__Group__1__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Unit__ImportsAssignment_04676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__Unit__ParentAssignment_1_14711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Unit__ContainerAssignment_24746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_rule__Unit__InstancesAssignment_34777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Import__NameAssignment_14808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__Container__InstanceAssignment_14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Container__FeatureAssignment_34878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__TitleAssignment_1_14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__AbstractAssignment_2_14940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__Instance__DocumentationAssignment_3_14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__AbbrAssignment_4_15002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__Instance__SeeAssignment_5_15037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__TagsAssignment_6_15072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_in_rule__Instance__SinceAssignment_7_15103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_in_rule__Instance__VersionAssignment_8_15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_9_05165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__TypeAssignment_115196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlot_in_rule__Instance__SlotsAssignment_135227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Slot__NameAssignment_15258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Slot__ValueAssignment_35289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValueAssignment_15320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MY_STRING_in_rule__StringValue__ValueAssignment5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BooleanValue__ValueAssignment_05387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BooleanValue__ValueAssignment_15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__NumberValue__ValueAssignment5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FQN_in_rule__InstanceRef__ValueAssignment5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumValue__ValueAssignment_15540 = new BitSet(new long[]{0x0000000000000002L});

}