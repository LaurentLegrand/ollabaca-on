/**
 */
package org.ollabaca.on.mm.org;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.org.OrgFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.mm'"
 * @generated
 */
public interface OrgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.ollabaca.on.mm.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrgPackage eINSTANCE = org.ollabaca.on.mm.org.impl.OrgPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.OrgElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.OrgElementImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getOrgElement()
	 * @generated
	 */
	int ORG_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__EANNOTATIONS = UMLPackage.PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__OWNED_COMMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__OWNED_ELEMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__OWNER = UMLPackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__CLIENT_DEPENDENCY = UMLPackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__NAME = UMLPackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__NAME_EXPRESSION = UMLPackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__VISIBILITY = UMLPackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__OWNING_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT__TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT_FEATURE_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___ADD_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___CREATE_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___DESTROY = UMLPackage.PACKAGEABLE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_KEYWORDS = UMLPackage.PACKAGEABLE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLIED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_MODEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_NEAREST_PACKAGE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_REQUIRED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___HAS_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___REMOVE_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PACKAGEABLE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___ALL_OWNED_ELEMENTS = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___MUST_BE_OWNED = UMLPackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_LABEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_LABEL__BOOLEAN = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___ALL_NAMESPACES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___ALL_OWNING_PACKAGES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___SEPARATOR = UMLPackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___GET_CLIENT_DEPENDENCIES = UMLPackage.PACKAGEABLE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___IS_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ELEMENT_OPERATION_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.AgentImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EANNOTATIONS = UMLPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OWNED_COMMENT = UMLPackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OWNED_ELEMENT = UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OWNER = UMLPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CLIENT_DEPENDENCY = UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = UMLPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME_EXPRESSION = UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAMESPACE = UMLPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__VISIBILITY = UMLPackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__OWNING_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memberships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MEMBERSHIPS = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ADD_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___CREATE_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___DESTROY = UMLPackage.NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_KEYWORDS = UMLPackage.NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLIED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_MODEL = UMLPackage.NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_NEAREST_PACKAGE = UMLPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_REQUIRED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___HAS_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___REMOVE_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ALL_OWNED_ELEMENTS = UMLPackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___MUST_BE_OWNED = UMLPackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_LABEL = UMLPackage.NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_LABEL__BOOLEAN = UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_NAMESPACE = UMLPackage.NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ALL_NAMESPACES = UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ALL_OWNING_PACKAGES = UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___SEPARATOR = UMLPackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_CLIENT_DEPENDENCIES = UMLPackage.NAMED_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.PersonImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EANNOTATIONS = AGENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNED_COMMENT = AGENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNED_ELEMENT = AGENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNER = AGENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CLIENT_DEPENDENCY = AGENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME_EXPRESSION = AGENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAMESPACE = AGENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__QUALIFIED_NAME = AGENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VISIBILITY = AGENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNING_TEMPLATE_PARAMETER = AGENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TEMPLATE_PARAMETER = AGENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Memberships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBERSHIPS = AGENT__MEMBERSHIPS;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_EANNOTATION__STRING = AGENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_KEYWORD__STRING = AGENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___APPLY_STEREOTYPE__STEREOTYPE = AGENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CREATE_EANNOTATION__STRING = AGENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___DESTROY = AGENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_KEYWORDS = AGENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLICABLE_STEREOTYPE__STRING = AGENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLICABLE_STEREOTYPES = AGENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLIED_STEREOTYPE__STRING = AGENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLIED_STEREOTYPES = AGENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = AGENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = AGENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_MODEL = AGENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_NEAREST_PACKAGE = AGENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_RELATIONSHIPS = AGENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_RELATIONSHIPS__ECLASS = AGENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_REQUIRED_STEREOTYPE__STRING = AGENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_REQUIRED_STEREOTYPES = AGENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_SOURCE_DIRECTED_RELATIONSHIPS = AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_STEREOTYPE_APPLICATION__STEREOTYPE = AGENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_STEREOTYPE_APPLICATIONS = AGENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_TARGET_DIRECTED_RELATIONSHIPS = AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_VALUE__STEREOTYPE_STRING = AGENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___HAS_KEYWORD__STRING = AGENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___HAS_VALUE__STEREOTYPE_STRING = AGENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = AGENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_STEREOTYPE_APPLIED__STEREOTYPE = AGENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_STEREOTYPE_REQUIRED__STEREOTYPE = AGENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___REMOVE_KEYWORD__STRING = AGENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_VALUE__STEREOTYPE_STRING_OBJECT = AGENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___UNAPPLY_STEREOTYPE__STEREOTYPE = AGENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ALL_OWNED_ELEMENTS = AGENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___MUST_BE_OWNED = AGENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CREATE_DEPENDENCY__NAMEDELEMENT = AGENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CREATE_USAGE__NAMEDELEMENT = AGENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LABEL = AGENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LABEL__BOOLEAN = AGENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_NAMESPACE = AGENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ALL_NAMESPACES = AGENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ALL_OWNING_PACKAGES = AGENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = AGENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_QUALIFIED_NAME = AGENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SEPARATOR = AGENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CLIENT_DEPENDENCIES = AGENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = AGENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_TEMPLATE_PARAMETER = AGENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.RoleImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EANNOTATIONS = UMLPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_COMMENT = UMLPackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_ELEMENT = UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNER = UMLPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CLIENT_DEPENDENCY = UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = UMLPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME_EXPRESSION = UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAMESPACE = UMLPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VISIBILITY = UMLPackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNING_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ADD_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___DESTROY = UMLPackage.NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_KEYWORDS = UMLPackage.NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLICABLE_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_MODEL = UMLPackage.NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_NEAREST_PACKAGE = UMLPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REQUIRED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___HAS_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___REMOVE_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_OWNED_ELEMENTS = UMLPackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___MUST_BE_OWNED = UMLPackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_LABEL = UMLPackage.NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_LABEL__BOOLEAN = UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_NAMESPACE = UMLPackage.NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_NAMESPACES = UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_OWNING_PACKAGES = UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SEPARATOR = UMLPackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_CLIENT_DEPENDENCIES = UMLPackage.NAMED_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.MembershipImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 4;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBERS = 2;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.org.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.org.impl.OrganizationImpl
	 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EANNOTATIONS = AGENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNED_COMMENT = AGENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNED_ELEMENT = AGENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNER = AGENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CLIENT_DEPENDENCY = AGENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME_EXPRESSION = AGENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAMESPACE = AGENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__QUALIFIED_NAME = AGENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__VISIBILITY = AGENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__OWNING_TEMPLATE_PARAMETER = AGENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TEMPLATE_PARAMETER = AGENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Memberships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERSHIPS = AGENT__MEMBERSHIPS;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PURPOSE = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERS = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATIONS = AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PARENT = AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = AGENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_EANNOTATION__STRING = AGENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ADD_KEYWORD__STRING = AGENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___APPLY_STEREOTYPE__STEREOTYPE = AGENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___CREATE_EANNOTATION__STRING = AGENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___DESTROY = AGENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_KEYWORDS = AGENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLICABLE_STEREOTYPE__STRING = AGENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLICABLE_STEREOTYPES = AGENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLIED_STEREOTYPE__STRING = AGENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLIED_STEREOTYPES = AGENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = AGENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = AGENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_MODEL = AGENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_NEAREST_PACKAGE = AGENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_RELATIONSHIPS = AGENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_RELATIONSHIPS__ECLASS = AGENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_REQUIRED_STEREOTYPE__STRING = AGENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_REQUIRED_STEREOTYPES = AGENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_SOURCE_DIRECTED_RELATIONSHIPS = AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = AGENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = AGENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_STEREOTYPE_APPLICATIONS = AGENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_TARGET_DIRECTED_RELATIONSHIPS = AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = AGENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_VALUE__STEREOTYPE_STRING = AGENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___HAS_KEYWORD__STRING = AGENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___HAS_VALUE__STEREOTYPE_STRING = AGENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = AGENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_STEREOTYPE_APPLIED__STEREOTYPE = AGENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = AGENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___REMOVE_KEYWORD__STRING = AGENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_VALUE__STEREOTYPE_STRING_OBJECT = AGENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___UNAPPLY_STEREOTYPE__STEREOTYPE = AGENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ALL_OWNED_ELEMENTS = AGENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___MUST_BE_OWNED = AGENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___CREATE_DEPENDENCY__NAMEDELEMENT = AGENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___CREATE_USAGE__NAMEDELEMENT = AGENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_LABEL = AGENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_LABEL__BOOLEAN = AGENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_NAMESPACE = AGENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ALL_NAMESPACES = AGENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ALL_OWNING_PACKAGES = AGENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = AGENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_QUALIFIED_NAME = AGENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SEPARATOR = AGENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_CLIENT_DEPENDENCIES = AGENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = AGENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___IS_TEMPLATE_PARAMETER = AGENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = AGENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.OrgElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.ollabaca.on.mm.org.OrgElement
	 * @generated
	 */
	EClass getOrgElement();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.ollabaca.on.mm.org.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link org.ollabaca.on.mm.org.Agent#getMemberships <em>Memberships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memberships</em>'.
	 * @see org.ollabaca.on.mm.org.Agent#getMemberships()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Memberships();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.ollabaca.on.mm.org.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.ollabaca.on.mm.org.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see org.ollabaca.on.mm.org.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the container reference '{@link org.ollabaca.on.mm.org.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.ollabaca.on.mm.org.Membership#getOrganization()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.ollabaca.on.mm.org.Membership#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.ollabaca.on.mm.org.Membership#getRole()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Role();

	/**
	 * Returns the meta object for the reference list '{@link org.ollabaca.on.mm.org.Membership#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see org.ollabaca.on.mm.org.Membership#getMembers()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Members();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.org.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.ollabaca.on.mm.org.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.org.Organization#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.ollabaca.on.mm.org.Organization#getPurpose()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ollabaca.on.mm.org.Organization#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.ollabaca.on.mm.org.Organization#getMembers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ollabaca.on.mm.org.Organization#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.ollabaca.on.mm.org.Organization#getOrganizations()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Organizations();

	/**
	 * Returns the meta object for the container reference '{@link org.ollabaca.on.mm.org.Organization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.ollabaca.on.mm.org.Organization#getParent()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrgFactory getOrgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.OrgElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.OrgElementImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getOrgElement()
		 * @generated
		 */
		EClass ORG_ELEMENT = eINSTANCE.getOrgElement();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.AgentImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Memberships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MEMBERSHIPS = eINSTANCE.getAgent_Memberships();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.PersonImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.RoleImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.MembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.MembershipImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ORGANIZATION = eINSTANCE.getMembership_Organization();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ROLE = eINSTANCE.getMembership_Role();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__MEMBERS = eINSTANCE.getMembership_Members();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.org.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.org.impl.OrganizationImpl
		 * @see org.ollabaca.on.mm.org.impl.OrgPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__PURPOSE = eINSTANCE.getOrganization_Purpose();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERS = eINSTANCE.getOrganization_Members();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__ORGANIZATIONS = eINSTANCE.getOrganization_Organizations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PARENT = eINSTANCE.getOrganization_Parent();

	}

} //OrgPackage
