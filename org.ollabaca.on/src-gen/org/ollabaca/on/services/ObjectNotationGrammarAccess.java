/*
* generated by Xtext
*/
package org.ollabaca.on.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ObjectNotationGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class UnitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Unit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cParentKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cParentAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cParentInstanceCrossReference_1_1_0 = (CrossReference)cParentAssignment_1_1.eContents().get(0);
		private final RuleCall cParentInstanceFQNTerminalRuleCall_1_1_0_1 = (RuleCall)cParentInstanceCrossReference_1_1_0.eContents().get(1);
		private final Assignment cContainerAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContainerContainerParserRuleCall_2_0 = (RuleCall)cContainerAssignment_2.eContents().get(0);
		private final Assignment cInstancesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInstancesInstanceParserRuleCall_3_0 = (RuleCall)cInstancesAssignment_3.eContents().get(0);
		
		//Unit:
		//	imports+=Import+ ("parent" parent=[Instance|FQN])? container=Container? instances+=Instance+;
		public ParserRule getRule() { return rule; }

		//imports+=Import+ ("parent" parent=[Instance|FQN])? container=Container? instances+=Instance+
		public Group getGroup() { return cGroup; }

		//imports+=Import+
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//("parent" parent=[Instance|FQN])?
		public Group getGroup_1() { return cGroup_1; }

		//"parent"
		public Keyword getParentKeyword_1_0() { return cParentKeyword_1_0; }

		//parent=[Instance|FQN]
		public Assignment getParentAssignment_1_1() { return cParentAssignment_1_1; }

		//[Instance|FQN]
		public CrossReference getParentInstanceCrossReference_1_1_0() { return cParentInstanceCrossReference_1_1_0; }

		//FQN
		public RuleCall getParentInstanceFQNTerminalRuleCall_1_1_0_1() { return cParentInstanceFQNTerminalRuleCall_1_1_0_1; }

		//container=Container?
		public Assignment getContainerAssignment_2() { return cContainerAssignment_2; }

		//Container
		public RuleCall getContainerContainerParserRuleCall_2_0() { return cContainerContainerParserRuleCall_2_0; }

		//instances+=Instance+
		public Assignment getInstancesAssignment_3() { return cInstancesAssignment_3; }

		//Instance
		public RuleCall getInstancesInstanceParserRuleCall_3_0() { return cInstancesInstanceParserRuleCall_3_0; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInstanceRefParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Value:
		//	Instance | Array | InstanceRef | Literal;
		public ParserRule getRule() { return rule; }

		//Instance | Array | InstanceRef | Literal
		public Alternatives getAlternatives() { return cAlternatives; }

		//Instance
		public RuleCall getInstanceParserRuleCall_0() { return cInstanceParserRuleCall_0; }

		//Array
		public RuleCall getArrayParserRuleCall_1() { return cArrayParserRuleCall_1; }

		//InstanceRef
		public RuleCall getInstanceRefParserRuleCall_2() { return cInstanceRefParserRuleCall_2; }

		//Literal
		public RuleCall getLiteralParserRuleCall_3() { return cLiteralParserRuleCall_3; }
	}

	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBooleanValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNullValueParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNumberValueParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cEnumValueParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Literal:
		//	StringValue | BooleanValue | NullValue | NumberValue | EnumValue;
		public ParserRule getRule() { return rule; }

		//StringValue | BooleanValue | NullValue | NumberValue | EnumValue
		public Alternatives getAlternatives() { return cAlternatives; }

		//StringValue
		public RuleCall getStringValueParserRuleCall_0() { return cStringValueParserRuleCall_0; }

		//BooleanValue
		public RuleCall getBooleanValueParserRuleCall_1() { return cBooleanValueParserRuleCall_1; }

		//NullValue
		public RuleCall getNullValueParserRuleCall_2() { return cNullValueParserRuleCall_2; }

		//NumberValue
		public RuleCall getNumberValueParserRuleCall_3() { return cNumberValueParserRuleCall_3; }

		//EnumValue
		public RuleCall getEnumValueParserRuleCall_4() { return cEnumValueParserRuleCall_4; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameMY_STRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" name=MY_STRING;
		public ParserRule getRule() { return rule; }

		//"import" name=MY_STRING
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//name=MY_STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//MY_STRING
		public RuleCall getNameMY_STRINGTerminalRuleCall_1_0() { return cNameMY_STRINGTerminalRuleCall_1_0; }
	}

	public class ContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Container");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInstanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInstanceInstanceCrossReference_1_0 = (CrossReference)cInstanceAssignment_1.eContents().get(0);
		private final RuleCall cInstanceInstanceFQNTerminalRuleCall_1_0_1 = (RuleCall)cInstanceInstanceCrossReference_1_0.eContents().get(1);
		private final Keyword cNumberSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeatureAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeatureIDTerminalRuleCall_3_0 = (RuleCall)cFeatureAssignment_3.eContents().get(0);
		
		//Container:
		//	"container" instance=[Instance|FQN] "#" feature=ID;
		public ParserRule getRule() { return rule; }

		//"container" instance=[Instance|FQN] "#" feature=ID
		public Group getGroup() { return cGroup; }

		//"container"
		public Keyword getContainerKeyword_0() { return cContainerKeyword_0; }

		//instance=[Instance|FQN]
		public Assignment getInstanceAssignment_1() { return cInstanceAssignment_1; }

		//[Instance|FQN]
		public CrossReference getInstanceInstanceCrossReference_1_0() { return cInstanceInstanceCrossReference_1_0; }

		//FQN
		public RuleCall getInstanceInstanceFQNTerminalRuleCall_1_0_1() { return cInstanceInstanceFQNTerminalRuleCall_1_0_1; }

		//"#"
		public Keyword getNumberSignKeyword_2() { return cNumberSignKeyword_2; }

		//feature=ID
		public Assignment getFeatureAssignment_3() { return cFeatureAssignment_3; }

		//ID
		public RuleCall getFeatureIDTerminalRuleCall_3_0() { return cFeatureIDTerminalRuleCall_3_0; }
	}

	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInstanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cTitleKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTitleAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTitleMY_STRINGTerminalRuleCall_1_1_0 = (RuleCall)cTitleAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAbstractKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAbstractAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAbstractMY_STRINGTerminalRuleCall_2_1_0 = (RuleCall)cAbstractAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDocKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDocumentationAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDocumentationMY_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cDocumentationAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAbbrKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAbbrAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAbbrIDTerminalRuleCall_4_1_0 = (RuleCall)cAbbrAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSeeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSeeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cSeeInstanceCrossReference_5_1_0 = (CrossReference)cSeeAssignment_5_1.eContents().get(0);
		private final RuleCall cSeeInstanceFQNTerminalRuleCall_5_1_0_1 = (RuleCall)cSeeInstanceCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTagKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTagsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTagsIDTerminalRuleCall_6_1_0 = (RuleCall)cTagsAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cSinceKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cSinceAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cSinceVERSIONTerminalRuleCall_7_1_0 = (RuleCall)cSinceAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cVersionKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cVersionAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cVersionVERSIONTerminalRuleCall_8_1_0 = (RuleCall)cVersionAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Assignment cNameAssignment_9_0 = (Assignment)cGroup_9.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_9_0_0 = (RuleCall)cNameAssignment_9_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Keyword cNewKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cTypeAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cTypeIDTerminalRuleCall_11_0 = (RuleCall)cTypeAssignment_11.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cSlotsAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSlotsSlotParserRuleCall_13_0 = (RuleCall)cSlotsAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//Instance:
		//	{Instance} ("@title" title=MY_STRING)? ("@abstract" abstract=MY_STRING)? ("@doc" documentation=MY_STRING)? ("@abbr"
		//	abbr=ID)? ("@see" see+=[Instance|FQN])* ("@tag" tags+=ID)* ("@since" since=VERSION)? ("@version" version=VERSION)?
		//	(name=ID "=")? "new" type=ID "{" slots+=Slot* "}";
		public ParserRule getRule() { return rule; }

		//{Instance} ("@title" title=MY_STRING)? ("@abstract" abstract=MY_STRING)? ("@doc" documentation=MY_STRING)? ("@abbr"
		//abbr=ID)? ("@see" see+=[Instance|FQN])* ("@tag" tags+=ID)* ("@since" since=VERSION)? ("@version" version=VERSION)?
		//(name=ID "=")? "new" type=ID "{" slots+=Slot* "}"
		public Group getGroup() { return cGroup; }

		//{Instance}
		public Action getInstanceAction_0() { return cInstanceAction_0; }

		//("@title" title=MY_STRING)?
		public Group getGroup_1() { return cGroup_1; }

		//"@title"
		public Keyword getTitleKeyword_1_0() { return cTitleKeyword_1_0; }

		//title=MY_STRING
		public Assignment getTitleAssignment_1_1() { return cTitleAssignment_1_1; }

		//MY_STRING
		public RuleCall getTitleMY_STRINGTerminalRuleCall_1_1_0() { return cTitleMY_STRINGTerminalRuleCall_1_1_0; }

		//("@abstract" abstract=MY_STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//"@abstract"
		public Keyword getAbstractKeyword_2_0() { return cAbstractKeyword_2_0; }

		//abstract=MY_STRING
		public Assignment getAbstractAssignment_2_1() { return cAbstractAssignment_2_1; }

		//MY_STRING
		public RuleCall getAbstractMY_STRINGTerminalRuleCall_2_1_0() { return cAbstractMY_STRINGTerminalRuleCall_2_1_0; }

		//("@doc" documentation=MY_STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"@doc"
		public Keyword getDocKeyword_3_0() { return cDocKeyword_3_0; }

		//documentation=MY_STRING
		public Assignment getDocumentationAssignment_3_1() { return cDocumentationAssignment_3_1; }

		//MY_STRING
		public RuleCall getDocumentationMY_STRINGTerminalRuleCall_3_1_0() { return cDocumentationMY_STRINGTerminalRuleCall_3_1_0; }

		//("@abbr" abbr=ID)?
		public Group getGroup_4() { return cGroup_4; }

		//"@abbr"
		public Keyword getAbbrKeyword_4_0() { return cAbbrKeyword_4_0; }

		//abbr=ID
		public Assignment getAbbrAssignment_4_1() { return cAbbrAssignment_4_1; }

		//ID
		public RuleCall getAbbrIDTerminalRuleCall_4_1_0() { return cAbbrIDTerminalRuleCall_4_1_0; }

		//("@see" see+=[Instance|FQN])*
		public Group getGroup_5() { return cGroup_5; }

		//"@see"
		public Keyword getSeeKeyword_5_0() { return cSeeKeyword_5_0; }

		//see+=[Instance|FQN]
		public Assignment getSeeAssignment_5_1() { return cSeeAssignment_5_1; }

		//[Instance|FQN]
		public CrossReference getSeeInstanceCrossReference_5_1_0() { return cSeeInstanceCrossReference_5_1_0; }

		//FQN
		public RuleCall getSeeInstanceFQNTerminalRuleCall_5_1_0_1() { return cSeeInstanceFQNTerminalRuleCall_5_1_0_1; }

		//("@tag" tags+=ID)*
		public Group getGroup_6() { return cGroup_6; }

		//"@tag"
		public Keyword getTagKeyword_6_0() { return cTagKeyword_6_0; }

		//tags+=ID
		public Assignment getTagsAssignment_6_1() { return cTagsAssignment_6_1; }

		//ID
		public RuleCall getTagsIDTerminalRuleCall_6_1_0() { return cTagsIDTerminalRuleCall_6_1_0; }

		//("@since" since=VERSION)?
		public Group getGroup_7() { return cGroup_7; }

		//"@since"
		public Keyword getSinceKeyword_7_0() { return cSinceKeyword_7_0; }

		//since=VERSION
		public Assignment getSinceAssignment_7_1() { return cSinceAssignment_7_1; }

		//VERSION
		public RuleCall getSinceVERSIONTerminalRuleCall_7_1_0() { return cSinceVERSIONTerminalRuleCall_7_1_0; }

		//("@version" version=VERSION)?
		public Group getGroup_8() { return cGroup_8; }

		//"@version"
		public Keyword getVersionKeyword_8_0() { return cVersionKeyword_8_0; }

		//version=VERSION
		public Assignment getVersionAssignment_8_1() { return cVersionAssignment_8_1; }

		//VERSION
		public RuleCall getVersionVERSIONTerminalRuleCall_8_1_0() { return cVersionVERSIONTerminalRuleCall_8_1_0; }

		//(name=ID "=")?
		public Group getGroup_9() { return cGroup_9; }

		//name=ID
		public Assignment getNameAssignment_9_0() { return cNameAssignment_9_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_9_0_0() { return cNameIDTerminalRuleCall_9_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_9_1() { return cEqualsSignKeyword_9_1; }

		//"new"
		public Keyword getNewKeyword_10() { return cNewKeyword_10; }

		//type=ID
		public Assignment getTypeAssignment_11() { return cTypeAssignment_11; }

		//ID
		public RuleCall getTypeIDTerminalRuleCall_11_0() { return cTypeIDTerminalRuleCall_11_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_12() { return cLeftCurlyBracketKeyword_12; }

		//slots+=Slot*
		public Assignment getSlotsAssignment_13() { return cSlotsAssignment_13; }

		//Slot
		public RuleCall getSlotsSlotParserRuleCall_13_0() { return cSlotsSlotParserRuleCall_13_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
	}

	public class SlotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Slot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlotAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueValueParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Slot:
		//	{Slot} name=ID "=" value=Value;
		public ParserRule getRule() { return rule; }

		//{Slot} name=ID "=" value=Value
		public Group getGroup() { return cGroup; }

		//{Slot}
		public Action getSlotAction_0() { return cSlotAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=Value
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//Value
		public RuleCall getValueValueParserRuleCall_3_0() { return cValueValueParserRuleCall_3_0; }
	}

	public class ArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Array");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueValueParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Array:
		//	"[" //( "," value+=Value)*  
		//	value+=Value+ "]";
		public ParserRule getRule() { return rule; }

		//"[" //( "," value+=Value)*  
		//value+=Value+ "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		////( "," value+=Value)*  
		//value+=Value+
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//Value
		public RuleCall getValueValueParserRuleCall_1_0() { return cValueValueParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class StringValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueMY_STRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringValue:
		//	value=MY_STRING;
		public ParserRule getRule() { return rule; }

		//value=MY_STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//MY_STRING
		public RuleCall getValueMY_STRINGTerminalRuleCall_0() { return cValueMY_STRINGTerminalRuleCall_0; }
	}

	public class BooleanValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cValueTrueKeyword_0_0 = (Keyword)cValueAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cValueFalseKeyword_1_0 = (Keyword)cValueAssignment_1.eContents().get(0);
		
		//BooleanValue:
		//	value="true" | value="false";
		public ParserRule getRule() { return rule; }

		//value="true" | value="false"
		public Alternatives getAlternatives() { return cAlternatives; }

		//value="true"
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//"true"
		public Keyword getValueTrueKeyword_0_0() { return cValueTrueKeyword_0_0; }

		//value="false"
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//"false"
		public Keyword getValueFalseKeyword_1_0() { return cValueFalseKeyword_1_0; }
	}

	public class NullValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NullValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNullValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNullKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//NullValue:
		//	{NullValue} "null";
		public ParserRule getRule() { return rule; }

		//{NullValue} "null"
		public Group getGroup() { return cGroup; }

		//{NullValue}
		public Action getNullValueAction_0() { return cNullValueAction_0; }

		//"null"
		public Keyword getNullKeyword_1() { return cNullKeyword_1; }
	}

	public class NumberValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumberValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNUMBERTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NumberValue:
		//	value=NUMBER;
		public ParserRule getRule() { return rule; }

		//value=NUMBER
		public Assignment getValueAssignment() { return cValueAssignment; }

		//NUMBER
		public RuleCall getValueNUMBERTerminalRuleCall_0() { return cValueNUMBERTerminalRuleCall_0; }
	}

	public class InstanceRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstanceRef");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cValueInstanceCrossReference_0 = (CrossReference)cValueAssignment.eContents().get(0);
		private final RuleCall cValueInstanceFQNTerminalRuleCall_0_1 = (RuleCall)cValueInstanceCrossReference_0.eContents().get(1);
		
		//InstanceRef:
		//	value=[Instance|FQN];
		public ParserRule getRule() { return rule; }

		//value=[Instance|FQN]
		public Assignment getValueAssignment() { return cValueAssignment; }

		//[Instance|FQN]
		public CrossReference getValueInstanceCrossReference_0() { return cValueInstanceCrossReference_0; }

		//FQN
		public RuleCall getValueInstanceFQNTerminalRuleCall_0_1() { return cValueInstanceFQNTerminalRuleCall_0_1; }
	}

	public class EnumValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//EnumValue:
		//	"#" value=ID;
		public ParserRule getRule() { return rule; }

		//"#" value=ID
		public Group getGroup() { return cGroup; }

		//"#"
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }

		//value=ID
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_1_0() { return cValueIDTerminalRuleCall_1_0; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLONG_STRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | LONG_STRING;
		public ParserRule getRule() { return rule; }

		//STRING | LONG_STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//LONG_STRING
		public RuleCall getLONG_STRINGTerminalRuleCall_1() { return cLONG_STRINGTerminalRuleCall_1; }
	}
	
	
	private final UnitElements pUnit;
	private final ValueElements pValue;
	private final LiteralElements pLiteral;
	private final ImportElements pImport;
	private final ContainerElements pContainer;
	private final InstanceElements pInstance;
	private final SlotElements pSlot;
	private final ArrayElements pArray;
	private final StringValueElements pStringValue;
	private final BooleanValueElements pBooleanValue;
	private final NullValueElements pNullValue;
	private final NumberValueElements pNumberValue;
	private final InstanceRefElements pInstanceRef;
	private final EnumValueElements pEnumValue;
	private final EStringElements pEString;
	private final TerminalRule tMY_STRING;
	private final TerminalRule tNUMBER;
	private final TerminalRule tFQN;
	private final TerminalRule tID;
	private final TerminalRule tLONG_STRING;
	private final TerminalRule tVERSION;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ObjectNotationGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pUnit = new UnitElements();
		this.pValue = new ValueElements();
		this.pLiteral = new LiteralElements();
		this.pImport = new ImportElements();
		this.pContainer = new ContainerElements();
		this.pInstance = new InstanceElements();
		this.pSlot = new SlotElements();
		this.pArray = new ArrayElements();
		this.pStringValue = new StringValueElements();
		this.pBooleanValue = new BooleanValueElements();
		this.pNullValue = new NullValueElements();
		this.pNumberValue = new NumberValueElements();
		this.pInstanceRef = new InstanceRefElements();
		this.pEnumValue = new EnumValueElements();
		this.pEString = new EStringElements();
		this.tMY_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "MY_STRING");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER");
		this.tFQN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID");
		this.tLONG_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LONG_STRING");
		this.tVERSION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VERSION");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.ollabaca.on.ObjectNotation".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Unit:
	//	imports+=Import+ ("parent" parent=[Instance|FQN])? container=Container? instances+=Instance+;
	public UnitElements getUnitAccess() {
		return pUnit;
	}
	
	public ParserRule getUnitRule() {
		return getUnitAccess().getRule();
	}

	//Value:
	//	Instance | Array | InstanceRef | Literal;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//Literal:
	//	StringValue | BooleanValue | NullValue | NumberValue | EnumValue;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}

	//Import:
	//	"import" name=MY_STRING;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Container:
	//	"container" instance=[Instance|FQN] "#" feature=ID;
	public ContainerElements getContainerAccess() {
		return pContainer;
	}
	
	public ParserRule getContainerRule() {
		return getContainerAccess().getRule();
	}

	//Instance:
	//	{Instance} ("@title" title=MY_STRING)? ("@abstract" abstract=MY_STRING)? ("@doc" documentation=MY_STRING)? ("@abbr"
	//	abbr=ID)? ("@see" see+=[Instance|FQN])* ("@tag" tags+=ID)* ("@since" since=VERSION)? ("@version" version=VERSION)?
	//	(name=ID "=")? "new" type=ID "{" slots+=Slot* "}";
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}

	//Slot:
	//	{Slot} name=ID "=" value=Value;
	public SlotElements getSlotAccess() {
		return pSlot;
	}
	
	public ParserRule getSlotRule() {
		return getSlotAccess().getRule();
	}

	//Array:
	//	"[" //( "," value+=Value)*  
	//	value+=Value+ "]";
	public ArrayElements getArrayAccess() {
		return pArray;
	}
	
	public ParserRule getArrayRule() {
		return getArrayAccess().getRule();
	}

	//StringValue:
	//	value=MY_STRING;
	public StringValueElements getStringValueAccess() {
		return pStringValue;
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//BooleanValue:
	//	value="true" | value="false";
	public BooleanValueElements getBooleanValueAccess() {
		return pBooleanValue;
	}
	
	public ParserRule getBooleanValueRule() {
		return getBooleanValueAccess().getRule();
	}

	//NullValue:
	//	{NullValue} "null";
	public NullValueElements getNullValueAccess() {
		return pNullValue;
	}
	
	public ParserRule getNullValueRule() {
		return getNullValueAccess().getRule();
	}

	//NumberValue:
	//	value=NUMBER;
	public NumberValueElements getNumberValueAccess() {
		return pNumberValue;
	}
	
	public ParserRule getNumberValueRule() {
		return getNumberValueAccess().getRule();
	}

	//InstanceRef:
	//	value=[Instance|FQN];
	public InstanceRefElements getInstanceRefAccess() {
		return pInstanceRef;
	}
	
	public ParserRule getInstanceRefRule() {
		return getInstanceRefAccess().getRule();
	}

	//EnumValue:
	//	"#" value=ID;
	public EnumValueElements getEnumValueAccess() {
		return pEnumValue;
	}
	
	public ParserRule getEnumValueRule() {
		return getEnumValueAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | LONG_STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//terminal MY_STRING:
	//	"\"" ("\\\"" | !"\"")* "\"";
	public TerminalRule getMY_STRINGRule() {
		return tMY_STRING;
	} 

	//terminal NUMBER:
	//	"0" | "-"? "1".."9" "0".."9"* ("." "0".."9"+)? ("e" ("+" | "-") "1".."9" "0".."9"*)?;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	} 

	//terminal FQN:
	//	("/" ID)*;
	public TerminalRule getFQNRule() {
		return tFQN;
	} 

	////	ID ('/' ID)*;
	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9" | "-" | ".")*;
	public TerminalRule getIDRule() {
		return tID;
	} 

	//terminal LONG_STRING:
	//	"(\""->"\")";
	public TerminalRule getLONG_STRINGRule() {
		return tLONG_STRING;
	} 

	//terminal VERSION:
	//	"0".."9"* ("." "0".."9"*)+;
	public TerminalRule getVERSIONRule() {
		return tVERSION;
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
