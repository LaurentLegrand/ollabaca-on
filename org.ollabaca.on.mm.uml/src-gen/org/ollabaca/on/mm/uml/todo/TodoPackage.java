/**
 */
package org.ollabaca.on.mm.uml.todo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.ollabaca.on.mm.uml.todo.TodoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.mm.uml'"
 * @generated
 */
public interface TodoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "todo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.ollabaca.on.mm.uml.todo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "todo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TodoPackage eINSTANCE = org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.uml.todo.impl.TierImpl <em>Tier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.uml.todo.impl.TierImpl
	 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getTier()
	 * @generated
	 */
	int TIER = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__EANNOTATIONS = UMLPackage.NODE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_COMMENT = UMLPackage.NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_ELEMENT = UMLPackage.NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNER = UMLPackage.NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__CLIENT_DEPENDENCY = UMLPackage.NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__NAME = UMLPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__NAME_EXPRESSION = UMLPackage.NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__NAMESPACE = UMLPackage.NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__QUALIFIED_NAME = UMLPackage.NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__VISIBILITY = UMLPackage.NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_RULE = UMLPackage.NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ELEMENT_IMPORT = UMLPackage.NODE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__PACKAGE_IMPORT = UMLPackage.NODE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_MEMBER = UMLPackage.NODE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__IMPORTED_MEMBER = UMLPackage.NODE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__MEMBER = UMLPackage.NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__IS_LEAF = UMLPackage.NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__REDEFINED_ELEMENT = UMLPackage.NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__REDEFINITION_CONTEXT = UMLPackage.NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNING_TEMPLATE_PARAMETER = UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__TEMPLATE_PARAMETER = UMLPackage.NODE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__PACKAGE = UMLPackage.NODE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__TEMPLATE_BINDING = UMLPackage.NODE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_TEMPLATE_SIGNATURE = UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__FEATURE = UMLPackage.NODE__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ATTRIBUTE = UMLPackage.NODE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__COLLABORATION_USE = UMLPackage.NODE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__GENERAL = UMLPackage.NODE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__GENERALIZATION = UMLPackage.NODE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__POWERTYPE_EXTENT = UMLPackage.NODE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__INHERITED_MEMBER = UMLPackage.NODE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__IS_ABSTRACT = UMLPackage.NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__IS_FINAL_SPECIALIZATION = UMLPackage.NODE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_USE_CASE = UMLPackage.NODE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__USE_CASE = UMLPackage.NODE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__REDEFINED_CLASSIFIER = UMLPackage.NODE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__REPRESENTATION = UMLPackage.NODE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__SUBSTITUTION = UMLPackage.NODE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_ATTRIBUTE = UMLPackage.NODE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_CONNECTOR = UMLPackage.NODE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__PART = UMLPackage.NODE__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ROLE = UMLPackage.NODE__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_PORT = UMLPackage.NODE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__CLASSIFIER_BEHAVIOR = UMLPackage.NODE__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__INTERFACE_REALIZATION = UMLPackage.NODE__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_BEHAVIOR = UMLPackage.NODE__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_OPERATION = UMLPackage.NODE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__EXTENSION = UMLPackage.NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__IS_ACTIVE = UMLPackage.NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__NESTED_CLASSIFIER = UMLPackage.NODE__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__OWNED_RECEPTION = UMLPackage.NODE__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__SUPER_CLASS = UMLPackage.NODE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__DEPLOYED_ELEMENT = UMLPackage.NODE__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__DEPLOYMENT = UMLPackage.NODE__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__NESTED_NODE = UMLPackage.NODE__NESTED_NODE;

	/**
	 * The number of structural features of the '<em>Tier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER_FEATURE_COUNT = UMLPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_EANNOTATION__STRING = UMLPackage.NODE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ADD_KEYWORD__STRING = UMLPackage.NODE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NODE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_EANNOTATION__STRING = UMLPackage.NODE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___DESTROY = UMLPackage.NODE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_KEYWORDS = UMLPackage.NODE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.NODE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLICABLE_STEREOTYPES = UMLPackage.NODE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.NODE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLIED_STEREOTYPES = UMLPackage.NODE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_MODEL = UMLPackage.NODE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_NEAREST_PACKAGE = UMLPackage.NODE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_RELATIONSHIPS = UMLPackage.NODE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_RELATIONSHIPS__ECLASS = UMLPackage.NODE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.NODE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_REQUIRED_STEREOTYPES = UMLPackage.NODE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_STEREOTYPE_APPLICATIONS = UMLPackage.NODE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.NODE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_VALUE__STEREOTYPE_STRING = UMLPackage.NODE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___HAS_KEYWORD__STRING = UMLPackage.NODE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.NODE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___REMOVE_KEYWORD__STRING = UMLPackage.NODE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NODE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_OWNED_ELEMENTS = UMLPackage.NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___MUST_BE_OWNED = UMLPackage.NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.NODE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_USAGE__NAMEDELEMENT = UMLPackage.NODE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_LABEL = UMLPackage.NODE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_LABEL__BOOLEAN = UMLPackage.NODE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_NAMESPACE = UMLPackage.NODE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_NAMESPACES = UMLPackage.NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_OWNING_PACKAGES = UMLPackage.NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_QUALIFIED_NAME = UMLPackage.NODE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___SEPARATOR = UMLPackage.NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_CLIENT_DEPENDENCIES = UMLPackage.NODE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.NODE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.NODE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_IMPORTED_ELEMENTS = UMLPackage.NODE___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_IMPORTED_PACKAGES = UMLPackage.NODE___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_OWNED_MEMBERS = UMLPackage.NODE___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___EXCLUDE_COLLISIONS__ELIST = UMLPackage.NODE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IMPORT_MEMBERS__ELIST = UMLPackage.NODE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_IMPORTED_MEMBERS = UMLPackage.NODE___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.NODE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.NODE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_TEMPLATE_PARAMETER = UMLPackage.NODE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.NODE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_ASSOCIATIONS = UMLPackage.NODE___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CONFORMS_TO__TYPE = UMLPackage.NODE___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_TEMPLATE = UMLPackage.NODE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___PARAMETERABLE_ELEMENTS = UMLPackage.NODE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_ALL_ATTRIBUTES = UMLPackage.NODE___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_ALL_OPERATIONS = UMLPackage.NODE___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_ALL_USED_INTERFACES = UMLPackage.NODE___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.NODE___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.NODE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_OPERATIONS = UMLPackage.NODE___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_USED_INTERFACES = UMLPackage.NODE___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_FEATURES = UMLPackage.NODE___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_PARENTS = UMLPackage.NODE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_GENERALS = UMLPackage.NODE___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.NODE___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___INHERIT__ELIST = UMLPackage.NODE___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.NODE___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_INHERITED_MEMBERS = UMLPackage.NODE___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.NODE___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___PARENTS = UMLPackage.NODE___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___DIRECTLY_REALIZED_INTERFACES = UMLPackage.NODE___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___DIRECTLY_USED_INTERFACES = UMLPackage.NODE___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_REALIZED_INTERFACES = UMLPackage.NODE___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_USED_INTERFACES = UMLPackage.NODE___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.NODE___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_ATTRIBUTES = UMLPackage.NODE___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_SLOTTABLE_FEATURES = UMLPackage.NODE___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.NODE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_PARTS = UMLPackage.NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___ALL_ROLES = UMLPackage.NODE___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_OWNED_PORTS = UMLPackage.NODE___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.NODE___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_IMPLEMENTED_INTERFACES = UMLPackage.NODE___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.NODE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___IS_METACLASS = UMLPackage.NODE___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_EXTENSIONS = UMLPackage.NODE___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_SUPER_CLASSES = UMLPackage.NODE___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_DEPLOYED_ELEMENTS = UMLPackage.NODE___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Internal Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP = UMLPackage.NODE___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Communication Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.NODE___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Communication Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER___GET_COMMUNICATION_PATHS = UMLPackage.NODE___GET_COMMUNICATION_PATHS;

	/**
	 * The number of operations of the '<em>Tier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER_OPERATION_COUNT = UMLPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.uml.todo.impl.FrontImpl <em>Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.uml.todo.impl.FrontImpl
	 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getFront()
	 * @generated
	 */
	int FRONT = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__EANNOTATIONS = TIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_COMMENT = TIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_ELEMENT = TIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNER = TIER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__CLIENT_DEPENDENCY = TIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__NAME = TIER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__NAME_EXPRESSION = TIER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__NAMESPACE = TIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__QUALIFIED_NAME = TIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__VISIBILITY = TIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_RULE = TIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__ELEMENT_IMPORT = TIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__PACKAGE_IMPORT = TIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_MEMBER = TIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__IMPORTED_MEMBER = TIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__MEMBER = TIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__IS_LEAF = TIER__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__REDEFINED_ELEMENT = TIER__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__REDEFINITION_CONTEXT = TIER__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNING_TEMPLATE_PARAMETER = TIER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__TEMPLATE_PARAMETER = TIER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__PACKAGE = TIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__TEMPLATE_BINDING = TIER__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_TEMPLATE_SIGNATURE = TIER__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__FEATURE = TIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__ATTRIBUTE = TIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__COLLABORATION_USE = TIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__GENERAL = TIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__GENERALIZATION = TIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__POWERTYPE_EXTENT = TIER__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__INHERITED_MEMBER = TIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__IS_ABSTRACT = TIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__IS_FINAL_SPECIALIZATION = TIER__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_USE_CASE = TIER__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__USE_CASE = TIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__REDEFINED_CLASSIFIER = TIER__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__REPRESENTATION = TIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__SUBSTITUTION = TIER__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_ATTRIBUTE = TIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_CONNECTOR = TIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__PART = TIER__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__ROLE = TIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_PORT = TIER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__CLASSIFIER_BEHAVIOR = TIER__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__INTERFACE_REALIZATION = TIER__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_BEHAVIOR = TIER__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_OPERATION = TIER__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__EXTENSION = TIER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__IS_ACTIVE = TIER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__NESTED_CLASSIFIER = TIER__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__OWNED_RECEPTION = TIER__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__SUPER_CLASS = TIER__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__DEPLOYED_ELEMENT = TIER__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__DEPLOYMENT = TIER__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__NESTED_NODE = TIER__NESTED_NODE;

	/**
	 * The number of structural features of the '<em>Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT_FEATURE_COUNT = TIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_EANNOTATION__STRING = TIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ADD_KEYWORD__STRING = TIER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___APPLY_STEREOTYPE__STEREOTYPE = TIER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_EANNOTATION__STRING = TIER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___DESTROY = TIER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_KEYWORDS = TIER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLICABLE_STEREOTYPE__STRING = TIER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLICABLE_STEREOTYPES = TIER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLIED_STEREOTYPE__STRING = TIER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLIED_STEREOTYPES = TIER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = TIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = TIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_MODEL = TIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_NEAREST_PACKAGE = TIER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_RELATIONSHIPS = TIER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_RELATIONSHIPS__ECLASS = TIER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_REQUIRED_STEREOTYPE__STRING = TIER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_REQUIRED_STEREOTYPES = TIER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_SOURCE_DIRECTED_RELATIONSHIPS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = TIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_STEREOTYPE_APPLICATIONS = TIER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_TARGET_DIRECTED_RELATIONSHIPS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_VALUE__STEREOTYPE_STRING = TIER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___HAS_KEYWORD__STRING = TIER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___HAS_VALUE__STEREOTYPE_STRING = TIER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = TIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_STEREOTYPE_APPLIED__STEREOTYPE = TIER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = TIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___REMOVE_KEYWORD__STRING = TIER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___SET_VALUE__STEREOTYPE_STRING_OBJECT = TIER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___UNAPPLY_STEREOTYPE__STEREOTYPE = TIER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_OWNED_ELEMENTS = TIER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___MUST_BE_OWNED = TIER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_DEPENDENCY__NAMEDELEMENT = TIER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_USAGE__NAMEDELEMENT = TIER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_LABEL = TIER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_LABEL__BOOLEAN = TIER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_NAMESPACE = TIER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_NAMESPACES = TIER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_OWNING_PACKAGES = TIER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = TIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_QUALIFIED_NAME = TIER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___SEPARATOR = TIER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_CLIENT_DEPENDENCIES = TIER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = TIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = TIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_IMPORTED_ELEMENTS = TIER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_IMPORTED_PACKAGES = TIER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_OWNED_MEMBERS = TIER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___EXCLUDE_COLLISIONS__ELIST = TIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_NAMES_OF_MEMBER__NAMEDELEMENT = TIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IMPORT_MEMBERS__ELIST = TIER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_IMPORTED_MEMBERS = TIER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___MEMBERS_ARE_DISTINGUISHABLE = TIER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = TIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = TIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = TIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_TEMPLATE_PARAMETER = TIER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_ASSOCIATIONS = TIER___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CONFORMS_TO__TYPE = TIER___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_TEMPLATE = TIER___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___PARAMETERABLE_ELEMENTS = TIER___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_ALL_ATTRIBUTES = TIER___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_ALL_OPERATIONS = TIER___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_ALL_USED_INTERFACES = TIER___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_OPERATION__STRING_ELIST_ELIST = TIER___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = TIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_OPERATIONS = TIER___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_USED_INTERFACES = TIER___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_FEATURES = TIER___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_PARENTS = TIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_GENERALS = TIER___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___HAS_VISIBILITY_OF__NAMEDELEMENT = TIER___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___INHERIT__ELIST = TIER___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___INHERITABLE_MEMBERS__CLASSIFIER = TIER___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_INHERITED_MEMBERS = TIER___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___MAY_SPECIALIZE_TYPE__CLASSIFIER = TIER___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___PARENTS = TIER___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___DIRECTLY_REALIZED_INTERFACES = TIER___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___DIRECTLY_USED_INTERFACES = TIER___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_REALIZED_INTERFACES = TIER___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_USED_INTERFACES = TIER___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_SUBSTITUTABLE_FOR__CLASSIFIER = TIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_ATTRIBUTES = TIER___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_SLOTTABLE_FEATURES = TIER___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = TIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_PARTS = TIER___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___ALL_ROLES = TIER___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_OWNED_PORTS = TIER___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_ALL_IMPLEMENTED_INTERFACES = TIER___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_IMPLEMENTED_INTERFACES = TIER___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = TIER___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___IS_METACLASS = TIER___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_EXTENSIONS = TIER___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_SUPER_CLASSES = TIER___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_DEPLOYED_ELEMENTS = TIER___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Internal Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Communication Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Communication Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT___GET_COMMUNICATION_PATHS = TIER___GET_COMMUNICATION_PATHS;

	/**
	 * The number of operations of the '<em>Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT_OPERATION_COUNT = TIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.uml.todo.impl.MiddleImpl <em>Middle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.uml.todo.impl.MiddleImpl
	 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getMiddle()
	 * @generated
	 */
	int MIDDLE = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__EANNOTATIONS = TIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_COMMENT = TIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_ELEMENT = TIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNER = TIER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__CLIENT_DEPENDENCY = TIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__NAME = TIER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__NAME_EXPRESSION = TIER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__NAMESPACE = TIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__QUALIFIED_NAME = TIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__VISIBILITY = TIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_RULE = TIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__ELEMENT_IMPORT = TIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__PACKAGE_IMPORT = TIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_MEMBER = TIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__IMPORTED_MEMBER = TIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__MEMBER = TIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__IS_LEAF = TIER__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__REDEFINED_ELEMENT = TIER__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__REDEFINITION_CONTEXT = TIER__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNING_TEMPLATE_PARAMETER = TIER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__TEMPLATE_PARAMETER = TIER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__PACKAGE = TIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__TEMPLATE_BINDING = TIER__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_TEMPLATE_SIGNATURE = TIER__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__FEATURE = TIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__ATTRIBUTE = TIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__COLLABORATION_USE = TIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__GENERAL = TIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__GENERALIZATION = TIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__POWERTYPE_EXTENT = TIER__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__INHERITED_MEMBER = TIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__IS_ABSTRACT = TIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__IS_FINAL_SPECIALIZATION = TIER__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_USE_CASE = TIER__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__USE_CASE = TIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__REDEFINED_CLASSIFIER = TIER__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__REPRESENTATION = TIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__SUBSTITUTION = TIER__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_ATTRIBUTE = TIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_CONNECTOR = TIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__PART = TIER__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__ROLE = TIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_PORT = TIER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__CLASSIFIER_BEHAVIOR = TIER__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__INTERFACE_REALIZATION = TIER__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_BEHAVIOR = TIER__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_OPERATION = TIER__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__EXTENSION = TIER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__IS_ACTIVE = TIER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__NESTED_CLASSIFIER = TIER__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__OWNED_RECEPTION = TIER__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__SUPER_CLASS = TIER__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__DEPLOYED_ELEMENT = TIER__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__DEPLOYMENT = TIER__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE__NESTED_NODE = TIER__NESTED_NODE;

	/**
	 * The number of structural features of the '<em>Middle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_FEATURE_COUNT = TIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_EANNOTATION__STRING = TIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ADD_KEYWORD__STRING = TIER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___APPLY_STEREOTYPE__STEREOTYPE = TIER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_EANNOTATION__STRING = TIER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___DESTROY = TIER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_KEYWORDS = TIER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLICABLE_STEREOTYPE__STRING = TIER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLICABLE_STEREOTYPES = TIER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLIED_STEREOTYPE__STRING = TIER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLIED_STEREOTYPES = TIER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = TIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = TIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_MODEL = TIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_NEAREST_PACKAGE = TIER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_RELATIONSHIPS = TIER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_RELATIONSHIPS__ECLASS = TIER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_REQUIRED_STEREOTYPE__STRING = TIER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_REQUIRED_STEREOTYPES = TIER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = TIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_STEREOTYPE_APPLICATIONS = TIER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_TARGET_DIRECTED_RELATIONSHIPS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_VALUE__STEREOTYPE_STRING = TIER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___HAS_KEYWORD__STRING = TIER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___HAS_VALUE__STEREOTYPE_STRING = TIER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = TIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = TIER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = TIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___REMOVE_KEYWORD__STRING = TIER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = TIER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___UNAPPLY_STEREOTYPE__STEREOTYPE = TIER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_OWNED_ELEMENTS = TIER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___MUST_BE_OWNED = TIER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_DEPENDENCY__NAMEDELEMENT = TIER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_USAGE__NAMEDELEMENT = TIER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_LABEL = TIER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_LABEL__BOOLEAN = TIER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_NAMESPACE = TIER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_NAMESPACES = TIER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_OWNING_PACKAGES = TIER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = TIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_QUALIFIED_NAME = TIER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___SEPARATOR = TIER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_CLIENT_DEPENDENCIES = TIER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = TIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = TIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_IMPORTED_ELEMENTS = TIER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_IMPORTED_PACKAGES = TIER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_OWNED_MEMBERS = TIER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___EXCLUDE_COLLISIONS__ELIST = TIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = TIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IMPORT_MEMBERS__ELIST = TIER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_IMPORTED_MEMBERS = TIER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___MEMBERS_ARE_DISTINGUISHABLE = TIER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = TIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = TIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = TIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_TEMPLATE_PARAMETER = TIER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_ASSOCIATIONS = TIER___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CONFORMS_TO__TYPE = TIER___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_TEMPLATE = TIER___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___PARAMETERABLE_ELEMENTS = TIER___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_ALL_ATTRIBUTES = TIER___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_ALL_OPERATIONS = TIER___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_ALL_USED_INTERFACES = TIER___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_OPERATION__STRING_ELIST_ELIST = TIER___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = TIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_OPERATIONS = TIER___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_USED_INTERFACES = TIER___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_FEATURES = TIER___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_PARENTS = TIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_GENERALS = TIER___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___HAS_VISIBILITY_OF__NAMEDELEMENT = TIER___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___INHERIT__ELIST = TIER___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___INHERITABLE_MEMBERS__CLASSIFIER = TIER___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_INHERITED_MEMBERS = TIER___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___MAY_SPECIALIZE_TYPE__CLASSIFIER = TIER___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___PARENTS = TIER___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___DIRECTLY_REALIZED_INTERFACES = TIER___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___DIRECTLY_USED_INTERFACES = TIER___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_REALIZED_INTERFACES = TIER___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_USED_INTERFACES = TIER___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = TIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_ATTRIBUTES = TIER___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_SLOTTABLE_FEATURES = TIER___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = TIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_PARTS = TIER___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___ALL_ROLES = TIER___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_OWNED_PORTS = TIER___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_ALL_IMPLEMENTED_INTERFACES = TIER___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_IMPLEMENTED_INTERFACES = TIER___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = TIER___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___IS_METACLASS = TIER___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_EXTENSIONS = TIER___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_SUPER_CLASSES = TIER___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_DEPLOYED_ELEMENTS = TIER___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Internal Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Communication Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Communication Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE___GET_COMMUNICATION_PATHS = TIER___GET_COMMUNICATION_PATHS;

	/**
	 * The number of operations of the '<em>Middle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_OPERATION_COUNT = TIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.uml.todo.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.uml.todo.impl.BackImpl
	 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getBack()
	 * @generated
	 */
	int BACK = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__EANNOTATIONS = TIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_COMMENT = TIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_ELEMENT = TIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNER = TIER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__CLIENT_DEPENDENCY = TIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__NAME = TIER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__NAME_EXPRESSION = TIER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__NAMESPACE = TIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__QUALIFIED_NAME = TIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__VISIBILITY = TIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_RULE = TIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__ELEMENT_IMPORT = TIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__PACKAGE_IMPORT = TIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_MEMBER = TIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__IMPORTED_MEMBER = TIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__MEMBER = TIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__IS_LEAF = TIER__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__REDEFINED_ELEMENT = TIER__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__REDEFINITION_CONTEXT = TIER__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNING_TEMPLATE_PARAMETER = TIER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__TEMPLATE_PARAMETER = TIER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__PACKAGE = TIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__TEMPLATE_BINDING = TIER__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_TEMPLATE_SIGNATURE = TIER__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__FEATURE = TIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__ATTRIBUTE = TIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__COLLABORATION_USE = TIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__GENERAL = TIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__GENERALIZATION = TIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__POWERTYPE_EXTENT = TIER__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__INHERITED_MEMBER = TIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__IS_ABSTRACT = TIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__IS_FINAL_SPECIALIZATION = TIER__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_USE_CASE = TIER__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__USE_CASE = TIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__REDEFINED_CLASSIFIER = TIER__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__REPRESENTATION = TIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__SUBSTITUTION = TIER__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_ATTRIBUTE = TIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_CONNECTOR = TIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__PART = TIER__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__ROLE = TIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_PORT = TIER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__CLASSIFIER_BEHAVIOR = TIER__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__INTERFACE_REALIZATION = TIER__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_BEHAVIOR = TIER__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_OPERATION = TIER__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__EXTENSION = TIER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__IS_ACTIVE = TIER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__NESTED_CLASSIFIER = TIER__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__OWNED_RECEPTION = TIER__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__SUPER_CLASS = TIER__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__DEPLOYED_ELEMENT = TIER__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__DEPLOYMENT = TIER__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__NESTED_NODE = TIER__NESTED_NODE;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = TIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_EANNOTATION__STRING = TIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ADD_KEYWORD__STRING = TIER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___APPLY_STEREOTYPE__STEREOTYPE = TIER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_EANNOTATION__STRING = TIER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___DESTROY = TIER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_KEYWORDS = TIER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLICABLE_STEREOTYPE__STRING = TIER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLICABLE_STEREOTYPES = TIER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLIED_STEREOTYPE__STRING = TIER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLIED_STEREOTYPES = TIER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = TIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = TIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_MODEL = TIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_NEAREST_PACKAGE = TIER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_RELATIONSHIPS = TIER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_RELATIONSHIPS__ECLASS = TIER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_REQUIRED_STEREOTYPE__STRING = TIER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_REQUIRED_STEREOTYPES = TIER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_SOURCE_DIRECTED_RELATIONSHIPS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_STEREOTYPE_APPLICATION__STEREOTYPE = TIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_STEREOTYPE_APPLICATIONS = TIER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_TARGET_DIRECTED_RELATIONSHIPS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = TIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_VALUE__STEREOTYPE_STRING = TIER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___HAS_KEYWORD__STRING = TIER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___HAS_VALUE__STEREOTYPE_STRING = TIER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = TIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_STEREOTYPE_APPLIED__STEREOTYPE = TIER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_STEREOTYPE_REQUIRED__STEREOTYPE = TIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___REMOVE_KEYWORD__STRING = TIER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___SET_VALUE__STEREOTYPE_STRING_OBJECT = TIER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___UNAPPLY_STEREOTYPE__STEREOTYPE = TIER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_OWNED_ELEMENTS = TIER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___MUST_BE_OWNED = TIER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_DEPENDENCY__NAMEDELEMENT = TIER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_USAGE__NAMEDELEMENT = TIER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_LABEL = TIER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_LABEL__BOOLEAN = TIER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_NAMESPACE = TIER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_NAMESPACES = TIER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_OWNING_PACKAGES = TIER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = TIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_QUALIFIED_NAME = TIER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___SEPARATOR = TIER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_CLIENT_DEPENDENCIES = TIER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = TIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = TIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_IMPORTED_ELEMENTS = TIER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_IMPORTED_PACKAGES = TIER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_OWNED_MEMBERS = TIER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___EXCLUDE_COLLISIONS__ELIST = TIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_NAMES_OF_MEMBER__NAMEDELEMENT = TIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IMPORT_MEMBERS__ELIST = TIER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_IMPORTED_MEMBERS = TIER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___MEMBERS_ARE_DISTINGUISHABLE = TIER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = TIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = TIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = TIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_TEMPLATE_PARAMETER = TIER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_ASSOCIATIONS = TIER___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CONFORMS_TO__TYPE = TIER___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_TEMPLATE = TIER___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___PARAMETERABLE_ELEMENTS = TIER___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_ALL_ATTRIBUTES = TIER___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_ALL_OPERATIONS = TIER___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_ALL_USED_INTERFACES = TIER___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_OPERATION__STRING_ELIST_ELIST = TIER___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = TIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_OPERATIONS = TIER___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_USED_INTERFACES = TIER___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_FEATURES = TIER___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_PARENTS = TIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_GENERALS = TIER___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___HAS_VISIBILITY_OF__NAMEDELEMENT = TIER___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___INHERIT__ELIST = TIER___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___INHERITABLE_MEMBERS__CLASSIFIER = TIER___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_INHERITED_MEMBERS = TIER___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___MAY_SPECIALIZE_TYPE__CLASSIFIER = TIER___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___PARENTS = TIER___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___DIRECTLY_REALIZED_INTERFACES = TIER___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___DIRECTLY_USED_INTERFACES = TIER___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_REALIZED_INTERFACES = TIER___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_USED_INTERFACES = TIER___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_SUBSTITUTABLE_FOR__CLASSIFIER = TIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_ATTRIBUTES = TIER___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_SLOTTABLE_FEATURES = TIER___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = TIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_PARTS = TIER___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___ALL_ROLES = TIER___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_OWNED_PORTS = TIER___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_ALL_IMPLEMENTED_INTERFACES = TIER___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_IMPLEMENTED_INTERFACES = TIER___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = TIER___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___IS_METACLASS = TIER___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_EXTENSIONS = TIER___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_SUPER_CLASSES = TIER___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_DEPLOYED_ELEMENTS = TIER___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Internal Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP = TIER___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Communication Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = TIER___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Communication Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___GET_COMMUNICATION_PATHS = TIER___GET_COMMUNICATION_PATHS;

	/**
	 * The number of operations of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_OPERATION_COUNT = TIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.uml.todo.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.uml.todo.impl.EnvironmentImpl
	 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__EANNOTATIONS = UMLPackage.EXECUTION_ENVIRONMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_COMMENT = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_ELEMENT = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNER = UMLPackage.EXECUTION_ENVIRONMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CLIENT_DEPENDENCY = UMLPackage.EXECUTION_ENVIRONMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = UMLPackage.EXECUTION_ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME_EXPRESSION = UMLPackage.EXECUTION_ENVIRONMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAMESPACE = UMLPackage.EXECUTION_ENVIRONMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__QUALIFIED_NAME = UMLPackage.EXECUTION_ENVIRONMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VISIBILITY = UMLPackage.EXECUTION_ENVIRONMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_RULE = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ELEMENT_IMPORT = UMLPackage.EXECUTION_ENVIRONMENT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PACKAGE_IMPORT = UMLPackage.EXECUTION_ENVIRONMENT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_MEMBER = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IMPORTED_MEMBER = UMLPackage.EXECUTION_ENVIRONMENT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MEMBER = UMLPackage.EXECUTION_ENVIRONMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IS_LEAF = UMLPackage.EXECUTION_ENVIRONMENT__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__REDEFINED_ELEMENT = UMLPackage.EXECUTION_ENVIRONMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__REDEFINITION_CONTEXT = UMLPackage.EXECUTION_ENVIRONMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNING_TEMPLATE_PARAMETER = UMLPackage.EXECUTION_ENVIRONMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TEMPLATE_PARAMETER = UMLPackage.EXECUTION_ENVIRONMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PACKAGE = UMLPackage.EXECUTION_ENVIRONMENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TEMPLATE_BINDING = UMLPackage.EXECUTION_ENVIRONMENT__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_TEMPLATE_SIGNATURE = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__FEATURE = UMLPackage.EXECUTION_ENVIRONMENT__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ATTRIBUTE = UMLPackage.EXECUTION_ENVIRONMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__COLLABORATION_USE = UMLPackage.EXECUTION_ENVIRONMENT__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__GENERAL = UMLPackage.EXECUTION_ENVIRONMENT__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__GENERALIZATION = UMLPackage.EXECUTION_ENVIRONMENT__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__POWERTYPE_EXTENT = UMLPackage.EXECUTION_ENVIRONMENT__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__INHERITED_MEMBER = UMLPackage.EXECUTION_ENVIRONMENT__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IS_ABSTRACT = UMLPackage.EXECUTION_ENVIRONMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IS_FINAL_SPECIALIZATION = UMLPackage.EXECUTION_ENVIRONMENT__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_USE_CASE = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__USE_CASE = UMLPackage.EXECUTION_ENVIRONMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__REDEFINED_CLASSIFIER = UMLPackage.EXECUTION_ENVIRONMENT__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__REPRESENTATION = UMLPackage.EXECUTION_ENVIRONMENT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SUBSTITUTION = UMLPackage.EXECUTION_ENVIRONMENT__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_ATTRIBUTE = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_CONNECTOR = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PART = UMLPackage.EXECUTION_ENVIRONMENT__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ROLE = UMLPackage.EXECUTION_ENVIRONMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_PORT = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CLASSIFIER_BEHAVIOR = UMLPackage.EXECUTION_ENVIRONMENT__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__INTERFACE_REALIZATION = UMLPackage.EXECUTION_ENVIRONMENT__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_BEHAVIOR = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_OPERATION = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__EXTENSION = UMLPackage.EXECUTION_ENVIRONMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IS_ACTIVE = UMLPackage.EXECUTION_ENVIRONMENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NESTED_CLASSIFIER = UMLPackage.EXECUTION_ENVIRONMENT__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__OWNED_RECEPTION = UMLPackage.EXECUTION_ENVIRONMENT__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SUPER_CLASS = UMLPackage.EXECUTION_ENVIRONMENT__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DEPLOYED_ELEMENT = UMLPackage.EXECUTION_ENVIRONMENT__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DEPLOYMENT = UMLPackage.EXECUTION_ENVIRONMENT__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NESTED_NODE = UMLPackage.EXECUTION_ENVIRONMENT__NESTED_NODE;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = UMLPackage.EXECUTION_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_EANNOTATION__STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ADD_KEYWORD__STRING = UMLPackage.EXECUTION_ENVIRONMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_EANNOTATION__STRING = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___DESTROY = UMLPackage.EXECUTION_ENVIRONMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_KEYWORDS = UMLPackage.EXECUTION_ENVIRONMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLIED_STEREOTYPES = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_MODEL = UMLPackage.EXECUTION_ENVIRONMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_NEAREST_PACKAGE = UMLPackage.EXECUTION_ENVIRONMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_RELATIONSHIPS = UMLPackage.EXECUTION_ENVIRONMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_ENVIRONMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_REQUIRED_STEREOTYPES = UMLPackage.EXECUTION_ENVIRONMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.EXECUTION_ENVIRONMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_ENVIRONMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.EXECUTION_ENVIRONMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.EXECUTION_ENVIRONMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_ENVIRONMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.EXECUTION_ENVIRONMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___HAS_KEYWORD__STRING = UMLPackage.EXECUTION_ENVIRONMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.EXECUTION_ENVIRONMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___REMOVE_KEYWORD__STRING = UMLPackage.EXECUTION_ENVIRONMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.EXECUTION_ENVIRONMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.EXECUTION_ENVIRONMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_OWNED_ELEMENTS = UMLPackage.EXECUTION_ENVIRONMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___MUST_BE_OWNED = UMLPackage.EXECUTION_ENVIRONMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_LABEL = UMLPackage.EXECUTION_ENVIRONMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_LABEL__BOOLEAN = UMLPackage.EXECUTION_ENVIRONMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_NAMESPACE = UMLPackage.EXECUTION_ENVIRONMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_NAMESPACES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_OWNING_PACKAGES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.EXECUTION_ENVIRONMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_QUALIFIED_NAME = UMLPackage.EXECUTION_ENVIRONMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___SEPARATOR = UMLPackage.EXECUTION_ENVIRONMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_CLIENT_DEPENDENCIES = UMLPackage.EXECUTION_ENVIRONMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_IMPORTED_ELEMENTS = UMLPackage.EXECUTION_ENVIRONMENT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_IMPORTED_PACKAGES = UMLPackage.EXECUTION_ENVIRONMENT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_OWNED_MEMBERS = UMLPackage.EXECUTION_ENVIRONMENT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___EXCLUDE_COLLISIONS__ELIST = UMLPackage.EXECUTION_ENVIRONMENT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IMPORT_MEMBERS__ELIST = UMLPackage.EXECUTION_ENVIRONMENT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_IMPORTED_MEMBERS = UMLPackage.EXECUTION_ENVIRONMENT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.EXECUTION_ENVIRONMENT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_TEMPLATE_PARAMETER = UMLPackage.EXECUTION_ENVIRONMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_ASSOCIATIONS = UMLPackage.EXECUTION_ENVIRONMENT___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CONFORMS_TO__TYPE = UMLPackage.EXECUTION_ENVIRONMENT___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_TEMPLATE = UMLPackage.EXECUTION_ENVIRONMENT___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___PARAMETERABLE_ELEMENTS = UMLPackage.EXECUTION_ENVIRONMENT___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_ALL_ATTRIBUTES = UMLPackage.EXECUTION_ENVIRONMENT___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_ALL_OPERATIONS = UMLPackage.EXECUTION_ENVIRONMENT___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_ALL_USED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.EXECUTION_ENVIRONMENT___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.EXECUTION_ENVIRONMENT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_OPERATIONS = UMLPackage.EXECUTION_ENVIRONMENT___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_USED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_FEATURES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_PARENTS = UMLPackage.EXECUTION_ENVIRONMENT___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_GENERALS = UMLPackage.EXECUTION_ENVIRONMENT___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.EXECUTION_ENVIRONMENT___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___INHERIT__ELIST = UMLPackage.EXECUTION_ENVIRONMENT___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.EXECUTION_ENVIRONMENT___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_INHERITED_MEMBERS = UMLPackage.EXECUTION_ENVIRONMENT___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.EXECUTION_ENVIRONMENT___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___PARENTS = UMLPackage.EXECUTION_ENVIRONMENT___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___DIRECTLY_REALIZED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___DIRECTLY_USED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_REALIZED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_USED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.EXECUTION_ENVIRONMENT___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_ATTRIBUTES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_SLOTTABLE_FEATURES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_PARTS = UMLPackage.EXECUTION_ENVIRONMENT___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___ALL_ROLES = UMLPackage.EXECUTION_ENVIRONMENT___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_OWNED_PORTS = UMLPackage.EXECUTION_ENVIRONMENT___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_IMPLEMENTED_INTERFACES = UMLPackage.EXECUTION_ENVIRONMENT___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___IS_METACLASS = UMLPackage.EXECUTION_ENVIRONMENT___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_EXTENSIONS = UMLPackage.EXECUTION_ENVIRONMENT___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_SUPER_CLASSES = UMLPackage.EXECUTION_ENVIRONMENT___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_DEPLOYED_ELEMENTS = UMLPackage.EXECUTION_ENVIRONMENT___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Internal Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_ENVIRONMENT___VALIDATE_INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Communication Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.EXECUTION_ENVIRONMENT___CREATE_COMMUNICATION_PATH__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_NODE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Communication Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___GET_COMMUNICATION_PATHS = UMLPackage.EXECUTION_ENVIRONMENT___GET_COMMUNICATION_PATHS;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = UMLPackage.EXECUTION_ENVIRONMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.todo.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tier</em>'.
	 * @see org.ollabaca.on.mm.uml.todo.Tier
	 * @generated
	 */
	EClass getTier();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.todo.Front <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Front</em>'.
	 * @see org.ollabaca.on.mm.uml.todo.Front
	 * @generated
	 */
	EClass getFront();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.todo.Middle <em>Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middle</em>'.
	 * @see org.ollabaca.on.mm.uml.todo.Middle
	 * @generated
	 */
	EClass getMiddle();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.todo.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see org.ollabaca.on.mm.uml.todo.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.todo.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.ollabaca.on.mm.uml.todo.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TodoFactory getTodoFactory();

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
		 * The meta object literal for the '{@link org.ollabaca.on.mm.uml.todo.impl.TierImpl <em>Tier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.uml.todo.impl.TierImpl
		 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getTier()
		 * @generated
		 */
		EClass TIER = eINSTANCE.getTier();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.uml.todo.impl.FrontImpl <em>Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.uml.todo.impl.FrontImpl
		 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getFront()
		 * @generated
		 */
		EClass FRONT = eINSTANCE.getFront();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.uml.todo.impl.MiddleImpl <em>Middle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.uml.todo.impl.MiddleImpl
		 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getMiddle()
		 * @generated
		 */
		EClass MIDDLE = eINSTANCE.getMiddle();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.uml.todo.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.uml.todo.impl.BackImpl
		 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.uml.todo.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.uml.todo.impl.EnvironmentImpl
		 * @see org.ollabaca.on.mm.uml.todo.impl.TodoPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

	}

} //TodoPackage
