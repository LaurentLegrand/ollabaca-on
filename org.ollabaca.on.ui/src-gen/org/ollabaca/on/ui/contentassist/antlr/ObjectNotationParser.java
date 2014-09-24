/*
* generated by Xtext
*/
package org.ollabaca.on.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.ollabaca.on.services.ObjectNotationGrammarAccess;

public class ObjectNotationParser extends AbstractContentAssistParser {
	
	@Inject
	private ObjectNotationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ollabaca.on.ui.contentassist.antlr.internal.InternalObjectNotationParser createParser() {
		org.ollabaca.on.ui.contentassist.antlr.internal.InternalObjectNotationParser result = new org.ollabaca.on.ui.contentassist.antlr.internal.InternalObjectNotationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getUnitAccess().getGroup(), "rule__Unit__Group__0");
					put(grammarAccess.getUnitAccess().getGroup_1(), "rule__Unit__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup_1(), "rule__Instance__Group_1__0");
					put(grammarAccess.getInstanceAccess().getGroup_2(), "rule__Instance__Group_2__0");
					put(grammarAccess.getInstanceAccess().getGroup_3(), "rule__Instance__Group_3__0");
					put(grammarAccess.getInstanceAccess().getGroup_4(), "rule__Instance__Group_4__0");
					put(grammarAccess.getInstanceAccess().getGroup_5(), "rule__Instance__Group_5__0");
					put(grammarAccess.getInstanceAccess().getGroup_6(), "rule__Instance__Group_6__0");
					put(grammarAccess.getInstanceAccess().getGroup_7(), "rule__Instance__Group_7__0");
					put(grammarAccess.getInstanceAccess().getGroup_8(), "rule__Instance__Group_8__0");
					put(grammarAccess.getInstanceAccess().getGroup_9(), "rule__Instance__Group_9__0");
					put(grammarAccess.getSlotAccess().getGroup(), "rule__Slot__Group__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getNullValueAccess().getGroup(), "rule__NullValue__Group__0");
					put(grammarAccess.getEnumValueAccess().getGroup(), "rule__EnumValue__Group__0");
					put(grammarAccess.getUnitAccess().getImportsAssignment_0(), "rule__Unit__ImportsAssignment_0");
					put(grammarAccess.getUnitAccess().getParentAssignment_1_1(), "rule__Unit__ParentAssignment_1_1");
					put(grammarAccess.getUnitAccess().getContainerAssignment_2(), "rule__Unit__ContainerAssignment_2");
					put(grammarAccess.getUnitAccess().getInstancesAssignment_3(), "rule__Unit__InstancesAssignment_3");
					put(grammarAccess.getImportAccess().getNameAssignment_1(), "rule__Import__NameAssignment_1");
					put(grammarAccess.getContainerAccess().getInstanceAssignment_1(), "rule__Container__InstanceAssignment_1");
					put(grammarAccess.getContainerAccess().getFeatureAssignment_3(), "rule__Container__FeatureAssignment_3");
					put(grammarAccess.getInstanceAccess().getTitleAssignment_1_1(), "rule__Instance__TitleAssignment_1_1");
					put(grammarAccess.getInstanceAccess().getAbstractAssignment_2_1(), "rule__Instance__AbstractAssignment_2_1");
					put(grammarAccess.getInstanceAccess().getDocumentationAssignment_3_1(), "rule__Instance__DocumentationAssignment_3_1");
					put(grammarAccess.getInstanceAccess().getAbbrAssignment_4_1(), "rule__Instance__AbbrAssignment_4_1");
					put(grammarAccess.getInstanceAccess().getSeeAssignment_5_1(), "rule__Instance__SeeAssignment_5_1");
					put(grammarAccess.getInstanceAccess().getTagsAssignment_6_1(), "rule__Instance__TagsAssignment_6_1");
					put(grammarAccess.getInstanceAccess().getSinceAssignment_7_1(), "rule__Instance__SinceAssignment_7_1");
					put(grammarAccess.getInstanceAccess().getVersionAssignment_8_1(), "rule__Instance__VersionAssignment_8_1");
					put(grammarAccess.getInstanceAccess().getNameAssignment_9_0(), "rule__Instance__NameAssignment_9_0");
					put(grammarAccess.getInstanceAccess().getTypeAssignment_11(), "rule__Instance__TypeAssignment_11");
					put(grammarAccess.getInstanceAccess().getSlotsAssignment_13(), "rule__Instance__SlotsAssignment_13");
					put(grammarAccess.getSlotAccess().getNameAssignment_1(), "rule__Slot__NameAssignment_1");
					put(grammarAccess.getSlotAccess().getValueAssignment_3(), "rule__Slot__ValueAssignment_3");
					put(grammarAccess.getArrayAccess().getValueAssignment_1(), "rule__Array__ValueAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment_0(), "rule__BooleanValue__ValueAssignment_0");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment_1(), "rule__BooleanValue__ValueAssignment_1");
					put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
					put(grammarAccess.getInstanceRefAccess().getValueAssignment(), "rule__InstanceRef__ValueAssignment");
					put(grammarAccess.getEnumValueAccess().getValueAssignment_1(), "rule__EnumValue__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ollabaca.on.ui.contentassist.antlr.internal.InternalObjectNotationParser typedParser = (org.ollabaca.on.ui.contentassist.antlr.internal.InternalObjectNotationParser) parser;
			typedParser.entryRuleUnit();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ObjectNotationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ObjectNotationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
