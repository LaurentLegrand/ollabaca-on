/**
 */
package org.ollabaca.on.mm.rest;

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
 * @see org.ollabaca.on.mm.rest.RestFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.mm'"
 * @generated
 */
public interface RestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.ollabaca.on.mm.rest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = org.ollabaca.on.mm.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.MimeTypeImpl <em>Mime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.MimeTypeImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__EANNOTATIONS = UMLPackage.CLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_COMMENT = UMLPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_ELEMENT = UMLPackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNER = UMLPackage.CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__CLIENT_DEPENDENCY = UMLPackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__NAME = UMLPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__NAME_EXPRESSION = UMLPackage.CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__NAMESPACE = UMLPackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__QUALIFIED_NAME = UMLPackage.CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__VISIBILITY = UMLPackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_RULE = UMLPackage.CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__ELEMENT_IMPORT = UMLPackage.CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__PACKAGE_IMPORT = UMLPackage.CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_MEMBER = UMLPackage.CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__IMPORTED_MEMBER = UMLPackage.CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__MEMBER = UMLPackage.CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__IS_LEAF = UMLPackage.CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__REDEFINED_ELEMENT = UMLPackage.CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__REDEFINITION_CONTEXT = UMLPackage.CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNING_TEMPLATE_PARAMETER = UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__TEMPLATE_PARAMETER = UMLPackage.CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__PACKAGE = UMLPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__TEMPLATE_BINDING = UMLPackage.CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__FEATURE = UMLPackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__ATTRIBUTE = UMLPackage.CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__COLLABORATION_USE = UMLPackage.CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__GENERAL = UMLPackage.CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__GENERALIZATION = UMLPackage.CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__POWERTYPE_EXTENT = UMLPackage.CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__INHERITED_MEMBER = UMLPackage.CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__IS_ABSTRACT = UMLPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__IS_FINAL_SPECIALIZATION = UMLPackage.CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_USE_CASE = UMLPackage.CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__USE_CASE = UMLPackage.CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__REDEFINED_CLASSIFIER = UMLPackage.CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__REPRESENTATION = UMLPackage.CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__SUBSTITUTION = UMLPackage.CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_ATTRIBUTE = UMLPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_CONNECTOR = UMLPackage.CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__PART = UMLPackage.CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__ROLE = UMLPackage.CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_PORT = UMLPackage.CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__CLASSIFIER_BEHAVIOR = UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__INTERFACE_REALIZATION = UMLPackage.CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_BEHAVIOR = UMLPackage.CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_OPERATION = UMLPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__EXTENSION = UMLPackage.CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__IS_ACTIVE = UMLPackage.CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__NESTED_CLASSIFIER = UMLPackage.CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__OWNED_RECEPTION = UMLPackage.CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__SUPER_CLASS = UMLPackage.CLASS__SUPER_CLASS;

	/**
	 * The number of structural features of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_FEATURE_COUNT = UMLPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_EANNOTATION__STRING = UMLPackage.CLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ADD_KEYWORD__STRING = UMLPackage.CLASS___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASS___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_EANNOTATION__STRING = UMLPackage.CLASS___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___DESTROY = UMLPackage.CLASS___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_KEYWORDS = UMLPackage.CLASS___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLICABLE_STEREOTYPES = UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.CLASS___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLIED_STEREOTYPES = UMLPackage.CLASS___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_MODEL = UMLPackage.CLASS___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_NEAREST_PACKAGE = UMLPackage.CLASS___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_RELATIONSHIPS = UMLPackage.CLASS___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.CLASS___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_REQUIRED_STEREOTYPES = UMLPackage.CLASS___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.CLASS___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.CLASS___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___HAS_KEYWORD__STRING = UMLPackage.CLASS___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.CLASS___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___REMOVE_KEYWORD__STRING = UMLPackage.CLASS___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_OWNED_ELEMENTS = UMLPackage.CLASS___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___MUST_BE_OWNED = UMLPackage.CLASS___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.CLASS___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.CLASS___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_LABEL = UMLPackage.CLASS___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_LABEL__BOOLEAN = UMLPackage.CLASS___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_NAMESPACE = UMLPackage.CLASS___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_NAMESPACES = UMLPackage.CLASS___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_OWNING_PACKAGES = UMLPackage.CLASS___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_QUALIFIED_NAME = UMLPackage.CLASS___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___SEPARATOR = UMLPackage.CLASS___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_CLIENT_DEPENDENCIES = UMLPackage.CLASS___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_IMPORTED_ELEMENTS = UMLPackage.CLASS___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_IMPORTED_PACKAGES = UMLPackage.CLASS___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_OWNED_MEMBERS = UMLPackage.CLASS___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___EXCLUDE_COLLISIONS__ELIST = UMLPackage.CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IMPORT_MEMBERS__ELIST = UMLPackage.CLASS___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_IMPORTED_MEMBERS = UMLPackage.CLASS___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_TEMPLATE_PARAMETER = UMLPackage.CLASS___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_ASSOCIATIONS = UMLPackage.CLASS___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CONFORMS_TO__TYPE = UMLPackage.CLASS___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_TEMPLATE = UMLPackage.CLASS___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___PARAMETERABLE_ELEMENTS = UMLPackage.CLASS___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_ALL_ATTRIBUTES = UMLPackage.CLASS___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_ALL_OPERATIONS = UMLPackage.CLASS___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_ALL_USED_INTERFACES = UMLPackage.CLASS___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_OPERATIONS = UMLPackage.CLASS___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_USED_INTERFACES = UMLPackage.CLASS___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_FEATURES = UMLPackage.CLASS___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_PARENTS = UMLPackage.CLASS___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_GENERALS = UMLPackage.CLASS___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___INHERIT__ELIST = UMLPackage.CLASS___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_INHERITED_MEMBERS = UMLPackage.CLASS___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___PARENTS = UMLPackage.CLASS___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___DIRECTLY_REALIZED_INTERFACES = UMLPackage.CLASS___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___DIRECTLY_USED_INTERFACES = UMLPackage.CLASS___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_REALIZED_INTERFACES = UMLPackage.CLASS___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_USED_INTERFACES = UMLPackage.CLASS___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_ATTRIBUTES = UMLPackage.CLASS___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_SLOTTABLE_FEATURES = UMLPackage.CLASS___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_PARTS = UMLPackage.CLASS___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___ALL_ROLES = UMLPackage.CLASS___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_OWNED_PORTS = UMLPackage.CLASS___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_IMPLEMENTED_INTERFACES = UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___IS_METACLASS = UMLPackage.CLASS___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_EXTENSIONS = UMLPackage.CLASS___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE___GET_SUPER_CLASSES = UMLPackage.CLASS___GET_SUPER_CLASSES;

	/**
	 * The number of operations of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_OPERATION_COUNT = UMLPackage.CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HttpResourceImpl <em>Http Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HttpResourceImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpResource()
	 * @generated
	 */
	int HTTP_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__EANNOTATIONS = UMLPackage.INTERFACE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_COMMENT = UMLPackage.INTERFACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_ELEMENT = UMLPackage.INTERFACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNER = UMLPackage.INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__CLIENT_DEPENDENCY = UMLPackage.INTERFACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__NAME = UMLPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__NAME_EXPRESSION = UMLPackage.INTERFACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__NAMESPACE = UMLPackage.INTERFACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__QUALIFIED_NAME = UMLPackage.INTERFACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__VISIBILITY = UMLPackage.INTERFACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_RULE = UMLPackage.INTERFACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__ELEMENT_IMPORT = UMLPackage.INTERFACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__PACKAGE_IMPORT = UMLPackage.INTERFACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_MEMBER = UMLPackage.INTERFACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__IMPORTED_MEMBER = UMLPackage.INTERFACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__MEMBER = UMLPackage.INTERFACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__IS_LEAF = UMLPackage.INTERFACE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REDEFINED_ELEMENT = UMLPackage.INTERFACE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REDEFINITION_CONTEXT = UMLPackage.INTERFACE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNING_TEMPLATE_PARAMETER = UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__TEMPLATE_PARAMETER = UMLPackage.INTERFACE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__PACKAGE = UMLPackage.INTERFACE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__TEMPLATE_BINDING = UMLPackage.INTERFACE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__FEATURE = UMLPackage.INTERFACE__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__ATTRIBUTE = UMLPackage.INTERFACE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__COLLABORATION_USE = UMLPackage.INTERFACE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__GENERAL = UMLPackage.INTERFACE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__GENERALIZATION = UMLPackage.INTERFACE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__POWERTYPE_EXTENT = UMLPackage.INTERFACE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__INHERITED_MEMBER = UMLPackage.INTERFACE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__IS_ABSTRACT = UMLPackage.INTERFACE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__IS_FINAL_SPECIALIZATION = UMLPackage.INTERFACE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_USE_CASE = UMLPackage.INTERFACE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__USE_CASE = UMLPackage.INTERFACE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REDEFINED_CLASSIFIER = UMLPackage.INTERFACE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REPRESENTATION = UMLPackage.INTERFACE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__SUBSTITUTION = UMLPackage.INTERFACE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__NESTED_CLASSIFIER = UMLPackage.INTERFACE__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_ATTRIBUTE = UMLPackage.INTERFACE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_RECEPTION = UMLPackage.INTERFACE__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__PROTOCOL = UMLPackage.INTERFACE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Redefined Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REDEFINED_INTERFACE = UMLPackage.INTERFACE__REDEFINED_INTERFACE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__OWNED_OPERATION = UMLPackage.INTERFACE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__PATH = UMLPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Http Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE_FEATURE_COUNT = UMLPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_EANNOTATION__STRING = UMLPackage.INTERFACE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ADD_KEYWORD__STRING = UMLPackage.INTERFACE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.INTERFACE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_EANNOTATION__STRING = UMLPackage.INTERFACE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___DESTROY = UMLPackage.INTERFACE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_KEYWORDS = UMLPackage.INTERFACE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.INTERFACE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLICABLE_STEREOTYPES = UMLPackage.INTERFACE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.INTERFACE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLIED_STEREOTYPES = UMLPackage.INTERFACE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.INTERFACE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.INTERFACE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_MODEL = UMLPackage.INTERFACE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_NEAREST_PACKAGE = UMLPackage.INTERFACE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_RELATIONSHIPS = UMLPackage.INTERFACE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_RELATIONSHIPS__ECLASS = UMLPackage.INTERFACE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.INTERFACE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_REQUIRED_STEREOTYPES = UMLPackage.INTERFACE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.INTERFACE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.INTERFACE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.INTERFACE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.INTERFACE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.INTERFACE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.INTERFACE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.INTERFACE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___HAS_KEYWORD__STRING = UMLPackage.INTERFACE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.INTERFACE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.INTERFACE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.INTERFACE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.INTERFACE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___REMOVE_KEYWORD__STRING = UMLPackage.INTERFACE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.INTERFACE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.INTERFACE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_OWNED_ELEMENTS = UMLPackage.INTERFACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___MUST_BE_OWNED = UMLPackage.INTERFACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.INTERFACE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.INTERFACE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_LABEL = UMLPackage.INTERFACE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_LABEL__BOOLEAN = UMLPackage.INTERFACE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_NAMESPACE = UMLPackage.INTERFACE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_NAMESPACES = UMLPackage.INTERFACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_OWNING_PACKAGES = UMLPackage.INTERFACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.INTERFACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_QUALIFIED_NAME = UMLPackage.INTERFACE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___SEPARATOR = UMLPackage.INTERFACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_CLIENT_DEPENDENCIES = UMLPackage.INTERFACE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.INTERFACE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.INTERFACE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_IMPORTED_ELEMENTS = UMLPackage.INTERFACE___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_IMPORTED_PACKAGES = UMLPackage.INTERFACE___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_OWNED_MEMBERS = UMLPackage.INTERFACE___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___EXCLUDE_COLLISIONS__ELIST = UMLPackage.INTERFACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.INTERFACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IMPORT_MEMBERS__ELIST = UMLPackage.INTERFACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_IMPORTED_MEMBERS = UMLPackage.INTERFACE___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.INTERFACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.INTERFACE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.INTERFACE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.INTERFACE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_TEMPLATE_PARAMETER = UMLPackage.INTERFACE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.INTERFACE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_ASSOCIATIONS = UMLPackage.INTERFACE___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CONFORMS_TO__TYPE = UMLPackage.INTERFACE___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_TEMPLATE = UMLPackage.INTERFACE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___PARAMETERABLE_ELEMENTS = UMLPackage.INTERFACE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_ALL_ATTRIBUTES = UMLPackage.INTERFACE___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_ALL_OPERATIONS = UMLPackage.INTERFACE___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_ALL_USED_INTERFACES = UMLPackage.INTERFACE___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.INTERFACE___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.INTERFACE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_OPERATIONS = UMLPackage.INTERFACE___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_USED_INTERFACES = UMLPackage.INTERFACE___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_FEATURES = UMLPackage.INTERFACE___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_PARENTS = UMLPackage.INTERFACE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_GENERALS = UMLPackage.INTERFACE___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.INTERFACE___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___INHERIT__ELIST = UMLPackage.INTERFACE___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.INTERFACE___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___GET_INHERITED_MEMBERS = UMLPackage.INTERFACE___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.INTERFACE___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___PARENTS = UMLPackage.INTERFACE___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___DIRECTLY_REALIZED_INTERFACES = UMLPackage.INTERFACE___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___DIRECTLY_USED_INTERFACES = UMLPackage.INTERFACE___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_REALIZED_INTERFACES = UMLPackage.INTERFACE___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_USED_INTERFACES = UMLPackage.INTERFACE___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.INTERFACE___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_ATTRIBUTES = UMLPackage.INTERFACE___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___ALL_SLOTTABLE_FEATURES = UMLPackage.INTERFACE___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Validate Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___VALIDATE_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.INTERFACE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.INTERFACE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The number of operations of the '<em>Http Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE_OPERATION_COUNT = UMLPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HttpMethodImpl <em>Http Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HttpMethodImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__EANNOTATIONS = UMLPackage.OPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_COMMENT = UMLPackage.OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_ELEMENT = UMLPackage.OPERATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNER = UMLPackage.OPERATION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__CLIENT_DEPENDENCY = UMLPackage.OPERATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__NAME = UMLPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__NAME_EXPRESSION = UMLPackage.OPERATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__NAMESPACE = UMLPackage.OPERATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__QUALIFIED_NAME = UMLPackage.OPERATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__VISIBILITY = UMLPackage.OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_RULE = UMLPackage.OPERATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__ELEMENT_IMPORT = UMLPackage.OPERATION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PACKAGE_IMPORT = UMLPackage.OPERATION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_MEMBER = UMLPackage.OPERATION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IMPORTED_MEMBER = UMLPackage.OPERATION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__MEMBER = UMLPackage.OPERATION__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_LEAF = UMLPackage.OPERATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__REDEFINED_ELEMENT = UMLPackage.OPERATION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__REDEFINITION_CONTEXT = UMLPackage.OPERATION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__FEATURING_CLASSIFIER = UMLPackage.OPERATION__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_STATIC = UMLPackage.OPERATION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__CONCURRENCY = UMLPackage.OPERATION__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_ABSTRACT = UMLPackage.OPERATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__METHOD = UMLPackage.OPERATION__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_PARAMETER = UMLPackage.OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_PARAMETER_SET = UMLPackage.OPERATION__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__RAISED_EXCEPTION = UMLPackage.OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNING_TEMPLATE_PARAMETER = UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__TEMPLATE_PARAMETER = UMLPackage.OPERATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__TEMPLATE_BINDING = UMLPackage.OPERATION__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE = UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__BODY_CONDITION = UMLPackage.OPERATION__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__CLASS = UMLPackage.OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__DATATYPE = UMLPackage.OPERATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__INTERFACE = UMLPackage.OPERATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_ORDERED = UMLPackage.OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_QUERY = UMLPackage.OPERATION__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__IS_UNIQUE = UMLPackage.OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__LOWER = UMLPackage.OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__POSTCONDITION = UMLPackage.OPERATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PRECONDITION = UMLPackage.OPERATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__REDEFINED_OPERATION = UMLPackage.OPERATION__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__TYPE = UMLPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__UPPER = UMLPackage.OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PATH = UMLPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__CONSUMES = UMLPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PRODUCES = UMLPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Http Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_FEATURE_COUNT = UMLPackage.OPERATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_EANNOTATION__STRING = UMLPackage.OPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___ADD_KEYWORD__STRING = UMLPackage.OPERATION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPERATION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_EANNOTATION__STRING = UMLPackage.OPERATION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___DESTROY = UMLPackage.OPERATION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_KEYWORDS = UMLPackage.OPERATION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLICABLE_STEREOTYPES = UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLIED_STEREOTYPES = UMLPackage.OPERATION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_MODEL = UMLPackage.OPERATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_NEAREST_PACKAGE = UMLPackage.OPERATION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_RELATIONSHIPS = UMLPackage.OPERATION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_REQUIRED_STEREOTYPES = UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS = UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING = UMLPackage.OPERATION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___HAS_KEYWORD__STRING = UMLPackage.OPERATION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.OPERATION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___REMOVE_KEYWORD__STRING = UMLPackage.OPERATION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___ALL_OWNED_ELEMENTS = UMLPackage.OPERATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___MUST_BE_OWNED = UMLPackage.OPERATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT = UMLPackage.OPERATION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_LABEL = UMLPackage.OPERATION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_LABEL__BOOLEAN = UMLPackage.OPERATION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_NAMESPACE = UMLPackage.OPERATION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___ALL_NAMESPACES = UMLPackage.OPERATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___ALL_OWNING_PACKAGES = UMLPackage.OPERATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_QUALIFIED_NAME = UMLPackage.OPERATION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SEPARATOR = UMLPackage.OPERATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_CLIENT_DEPENDENCIES = UMLPackage.OPERATION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.OPERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.OPERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_IMPORTED_ELEMENTS = UMLPackage.OPERATION___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_IMPORTED_PACKAGES = UMLPackage.OPERATION___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_OWNED_MEMBERS = UMLPackage.OPERATION___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST = UMLPackage.OPERATION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.OPERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IMPORT_MEMBERS__ELIST = UMLPackage.OPERATION___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_IMPORTED_MEMBERS = UMLPackage.OPERATION___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.OPERATION___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.OPERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.OPERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE = UMLPackage.OPERATION___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___INPUT_PARAMETERS = UMLPackage.OPERATION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___OUTPUT_PARAMETERS = UMLPackage.OPERATION___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_TEMPLATE_PARAMETER = UMLPackage.OPERATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_TEMPLATE = UMLPackage.OPERATION___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___PARAMETERABLE_ELEMENTS = UMLPackage.OPERATION___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_RETURN_RESULT = UMLPackage.OPERATION___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_IS_ORDERED__BOOLEAN = UMLPackage.OPERATION___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN = UMLPackage.OPERATION___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_LOWER__INT = UMLPackage.OPERATION___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_TYPE__TYPE = UMLPackage.OPERATION___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___SET_UPPER__INT = UMLPackage.OPERATION___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_ORDERED = UMLPackage.OPERATION___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___IS_UNIQUE = UMLPackage.OPERATION___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_LOWER = UMLPackage.OPERATION___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___RETURN_RESULT = UMLPackage.OPERATION___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_TYPE = UMLPackage.OPERATION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD___GET_UPPER = UMLPackage.OPERATION___GET_UPPER;

	/**
	 * The number of operations of the '<em>Http Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_OPERATION_COUNT = UMLPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.DELETEImpl <em>DELETE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.DELETEImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getDELETE()
	 * @generated
	 */
	int DELETE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__EANNOTATIONS = HTTP_METHOD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_COMMENT = HTTP_METHOD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_ELEMENT = HTTP_METHOD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNER = HTTP_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CLIENT_DEPENDENCY = HTTP_METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = HTTP_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME_EXPRESSION = HTTP_METHOD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAMESPACE = HTTP_METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__QUALIFIED_NAME = HTTP_METHOD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__VISIBILITY = HTTP_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_RULE = HTTP_METHOD__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ELEMENT_IMPORT = HTTP_METHOD__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PACKAGE_IMPORT = HTTP_METHOD__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_MEMBER = HTTP_METHOD__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IMPORTED_MEMBER = HTTP_METHOD__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__MEMBER = HTTP_METHOD__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_LEAF = HTTP_METHOD__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__REDEFINED_ELEMENT = HTTP_METHOD__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__REDEFINITION_CONTEXT = HTTP_METHOD__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__FEATURING_CLASSIFIER = HTTP_METHOD__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_STATIC = HTTP_METHOD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONCURRENCY = HTTP_METHOD__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_ABSTRACT = HTTP_METHOD__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__METHOD = HTTP_METHOD__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_PARAMETER = HTTP_METHOD__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_PARAMETER_SET = HTTP_METHOD__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__RAISED_EXCEPTION = HTTP_METHOD__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNING_TEMPLATE_PARAMETER = HTTP_METHOD__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TEMPLATE_PARAMETER = HTTP_METHOD__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TEMPLATE_BINDING = HTTP_METHOD__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNED_TEMPLATE_SIGNATURE = HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__BODY_CONDITION = HTTP_METHOD__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CLASS = HTTP_METHOD__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DATATYPE = HTTP_METHOD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__INTERFACE = HTTP_METHOD__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_ORDERED = HTTP_METHOD__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_QUERY = HTTP_METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_UNIQUE = HTTP_METHOD__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__LOWER = HTTP_METHOD__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__POSTCONDITION = HTTP_METHOD__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PRECONDITION = HTTP_METHOD__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__REDEFINED_OPERATION = HTTP_METHOD__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TYPE = HTTP_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__UPPER = HTTP_METHOD__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PATH = HTTP_METHOD__PATH;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONSUMES = HTTP_METHOD__CONSUMES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PRODUCES = HTTP_METHOD__PRODUCES;

	/**
	 * The number of structural features of the '<em>DELETE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = HTTP_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_EANNOTATION__STRING = HTTP_METHOD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___ADD_KEYWORD__STRING = HTTP_METHOD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___APPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_EANNOTATION__STRING = HTTP_METHOD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___DESTROY = HTTP_METHOD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_KEYWORDS = HTTP_METHOD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLICABLE_STEREOTYPES = HTTP_METHOD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLIED_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLIED_STEREOTYPES = HTTP_METHOD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_MODEL = HTTP_METHOD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_NEAREST_PACKAGE = HTTP_METHOD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_RELATIONSHIPS = HTTP_METHOD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_REQUIRED_STEREOTYPE__STRING = HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_REQUIRED_STEREOTYPES = HTTP_METHOD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_STEREOTYPE_APPLICATIONS = HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_VALUE__STEREOTYPE_STRING = HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___HAS_KEYWORD__STRING = HTTP_METHOD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___HAS_VALUE__STEREOTYPE_STRING = HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___REMOVE_KEYWORD__STRING = HTTP_METHOD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___ALL_OWNED_ELEMENTS = HTTP_METHOD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___MUST_BE_OWNED = HTTP_METHOD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_USAGE__NAMEDELEMENT = HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_LABEL = HTTP_METHOD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_LABEL__BOOLEAN = HTTP_METHOD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_NAMESPACE = HTTP_METHOD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___ALL_NAMESPACES = HTTP_METHOD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___ALL_OWNING_PACKAGES = HTTP_METHOD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_QUALIFIED_NAME = HTTP_METHOD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SEPARATOR = HTTP_METHOD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_CLIENT_DEPENDENCIES = HTTP_METHOD___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_IMPORTED_ELEMENTS = HTTP_METHOD___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_IMPORTED_PACKAGES = HTTP_METHOD___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_OWNED_MEMBERS = HTTP_METHOD___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___EXCLUDE_COLLISIONS__ELIST = HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IMPORT_MEMBERS__ELIST = HTTP_METHOD___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_IMPORTED_MEMBERS = HTTP_METHOD___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___MEMBERS_ARE_DISTINGUISHABLE = HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___CREATE_RETURN_RESULT__STRING_TYPE = HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___INPUT_PARAMETERS = HTTP_METHOD___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___OUTPUT_PARAMETERS = HTTP_METHOD___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_TEMPLATE_PARAMETER = HTTP_METHOD___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_TEMPLATE = HTTP_METHOD___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___PARAMETERABLE_ELEMENTS = HTTP_METHOD___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_RETURN_RESULT = HTTP_METHOD___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_IS_ORDERED__BOOLEAN = HTTP_METHOD___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_IS_UNIQUE__BOOLEAN = HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_LOWER__INT = HTTP_METHOD___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_TYPE__TYPE = HTTP_METHOD___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___SET_UPPER__INT = HTTP_METHOD___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_ORDERED = HTTP_METHOD___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___IS_UNIQUE = HTTP_METHOD___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_LOWER = HTTP_METHOD___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___RETURN_RESULT = HTTP_METHOD___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_TYPE = HTTP_METHOD___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___GET_UPPER = HTTP_METHOD___GET_UPPER;

	/**
	 * The number of operations of the '<em>DELETE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = HTTP_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.GETImpl <em>GET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.GETImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getGET()
	 * @generated
	 */
	int GET = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__EANNOTATIONS = HTTP_METHOD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_COMMENT = HTTP_METHOD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_ELEMENT = HTTP_METHOD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNER = HTTP_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CLIENT_DEPENDENCY = HTTP_METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__NAME = HTTP_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__NAME_EXPRESSION = HTTP_METHOD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__NAMESPACE = HTTP_METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__QUALIFIED_NAME = HTTP_METHOD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__VISIBILITY = HTTP_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_RULE = HTTP_METHOD__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__ELEMENT_IMPORT = HTTP_METHOD__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PACKAGE_IMPORT = HTTP_METHOD__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_MEMBER = HTTP_METHOD__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IMPORTED_MEMBER = HTTP_METHOD__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__MEMBER = HTTP_METHOD__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_LEAF = HTTP_METHOD__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__REDEFINED_ELEMENT = HTTP_METHOD__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__REDEFINITION_CONTEXT = HTTP_METHOD__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__FEATURING_CLASSIFIER = HTTP_METHOD__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_STATIC = HTTP_METHOD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CONCURRENCY = HTTP_METHOD__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_ABSTRACT = HTTP_METHOD__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__METHOD = HTTP_METHOD__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_PARAMETER = HTTP_METHOD__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_PARAMETER_SET = HTTP_METHOD__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__RAISED_EXCEPTION = HTTP_METHOD__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNING_TEMPLATE_PARAMETER = HTTP_METHOD__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__TEMPLATE_PARAMETER = HTTP_METHOD__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__TEMPLATE_BINDING = HTTP_METHOD__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OWNED_TEMPLATE_SIGNATURE = HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__BODY_CONDITION = HTTP_METHOD__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CLASS = HTTP_METHOD__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__DATATYPE = HTTP_METHOD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__INTERFACE = HTTP_METHOD__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_ORDERED = HTTP_METHOD__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_QUERY = HTTP_METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__IS_UNIQUE = HTTP_METHOD__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__LOWER = HTTP_METHOD__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__POSTCONDITION = HTTP_METHOD__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PRECONDITION = HTTP_METHOD__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__REDEFINED_OPERATION = HTTP_METHOD__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__TYPE = HTTP_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__UPPER = HTTP_METHOD__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PATH = HTTP_METHOD__PATH;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CONSUMES = HTTP_METHOD__CONSUMES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PRODUCES = HTTP_METHOD__PRODUCES;

	/**
	 * The number of structural features of the '<em>GET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_COUNT = HTTP_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_EANNOTATION__STRING = HTTP_METHOD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___ADD_KEYWORD__STRING = HTTP_METHOD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___APPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_EANNOTATION__STRING = HTTP_METHOD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___DESTROY = HTTP_METHOD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_KEYWORDS = HTTP_METHOD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLICABLE_STEREOTYPES = HTTP_METHOD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLIED_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLIED_STEREOTYPES = HTTP_METHOD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_MODEL = HTTP_METHOD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_NEAREST_PACKAGE = HTTP_METHOD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_RELATIONSHIPS = HTTP_METHOD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_REQUIRED_STEREOTYPE__STRING = HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_REQUIRED_STEREOTYPES = HTTP_METHOD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_STEREOTYPE_APPLICATIONS = HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_VALUE__STEREOTYPE_STRING = HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___HAS_KEYWORD__STRING = HTTP_METHOD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___HAS_VALUE__STEREOTYPE_STRING = HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___REMOVE_KEYWORD__STRING = HTTP_METHOD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___ALL_OWNED_ELEMENTS = HTTP_METHOD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___MUST_BE_OWNED = HTTP_METHOD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_USAGE__NAMEDELEMENT = HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_LABEL = HTTP_METHOD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_LABEL__BOOLEAN = HTTP_METHOD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_NAMESPACE = HTTP_METHOD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___ALL_NAMESPACES = HTTP_METHOD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___ALL_OWNING_PACKAGES = HTTP_METHOD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_QUALIFIED_NAME = HTTP_METHOD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SEPARATOR = HTTP_METHOD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_CLIENT_DEPENDENCIES = HTTP_METHOD___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_IMPORTED_ELEMENTS = HTTP_METHOD___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_IMPORTED_PACKAGES = HTTP_METHOD___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_OWNED_MEMBERS = HTTP_METHOD___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___EXCLUDE_COLLISIONS__ELIST = HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_NAMES_OF_MEMBER__NAMEDELEMENT = HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IMPORT_MEMBERS__ELIST = HTTP_METHOD___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_IMPORTED_MEMBERS = HTTP_METHOD___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___MEMBERS_ARE_DISTINGUISHABLE = HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___CREATE_RETURN_RESULT__STRING_TYPE = HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___INPUT_PARAMETERS = HTTP_METHOD___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___OUTPUT_PARAMETERS = HTTP_METHOD___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_TEMPLATE_PARAMETER = HTTP_METHOD___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_TEMPLATE = HTTP_METHOD___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___PARAMETERABLE_ELEMENTS = HTTP_METHOD___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_RETURN_RESULT = HTTP_METHOD___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_IS_ORDERED__BOOLEAN = HTTP_METHOD___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_IS_UNIQUE__BOOLEAN = HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_LOWER__INT = HTTP_METHOD___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_TYPE__TYPE = HTTP_METHOD___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___SET_UPPER__INT = HTTP_METHOD___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_ORDERED = HTTP_METHOD___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___IS_UNIQUE = HTTP_METHOD___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_LOWER = HTTP_METHOD___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___RETURN_RESULT = HTTP_METHOD___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_TYPE = HTTP_METHOD___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET___GET_UPPER = HTTP_METHOD___GET_UPPER;

	/**
	 * The number of operations of the '<em>GET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OPERATION_COUNT = HTTP_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HEADImpl <em>HEAD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HEADImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHEAD()
	 * @generated
	 */
	int HEAD = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__EANNOTATIONS = HTTP_METHOD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_COMMENT = HTTP_METHOD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_ELEMENT = HTTP_METHOD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNER = HTTP_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CLIENT_DEPENDENCY = HTTP_METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAME = HTTP_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAME_EXPRESSION = HTTP_METHOD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAMESPACE = HTTP_METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__QUALIFIED_NAME = HTTP_METHOD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__VISIBILITY = HTTP_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_RULE = HTTP_METHOD__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__ELEMENT_IMPORT = HTTP_METHOD__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__PACKAGE_IMPORT = HTTP_METHOD__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_MEMBER = HTTP_METHOD__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IMPORTED_MEMBER = HTTP_METHOD__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__MEMBER = HTTP_METHOD__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_LEAF = HTTP_METHOD__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__REDEFINED_ELEMENT = HTTP_METHOD__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__REDEFINITION_CONTEXT = HTTP_METHOD__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__FEATURING_CLASSIFIER = HTTP_METHOD__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_STATIC = HTTP_METHOD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CONCURRENCY = HTTP_METHOD__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_ABSTRACT = HTTP_METHOD__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__METHOD = HTTP_METHOD__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_PARAMETER = HTTP_METHOD__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_PARAMETER_SET = HTTP_METHOD__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__RAISED_EXCEPTION = HTTP_METHOD__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNING_TEMPLATE_PARAMETER = HTTP_METHOD__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TEMPLATE_PARAMETER = HTTP_METHOD__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TEMPLATE_BINDING = HTTP_METHOD__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_TEMPLATE_SIGNATURE = HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__BODY_CONDITION = HTTP_METHOD__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CLASS = HTTP_METHOD__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__DATATYPE = HTTP_METHOD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__INTERFACE = HTTP_METHOD__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_ORDERED = HTTP_METHOD__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_QUERY = HTTP_METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IS_UNIQUE = HTTP_METHOD__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__LOWER = HTTP_METHOD__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__POSTCONDITION = HTTP_METHOD__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__PRECONDITION = HTTP_METHOD__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__REDEFINED_OPERATION = HTTP_METHOD__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TYPE = HTTP_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__UPPER = HTTP_METHOD__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__PATH = HTTP_METHOD__PATH;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CONSUMES = HTTP_METHOD__CONSUMES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__PRODUCES = HTTP_METHOD__PRODUCES;

	/**
	 * The number of structural features of the '<em>HEAD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = HTTP_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_EANNOTATION__STRING = HTTP_METHOD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___ADD_KEYWORD__STRING = HTTP_METHOD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___APPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_EANNOTATION__STRING = HTTP_METHOD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___DESTROY = HTTP_METHOD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_KEYWORDS = HTTP_METHOD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLICABLE_STEREOTYPES = HTTP_METHOD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLIED_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLIED_STEREOTYPES = HTTP_METHOD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_MODEL = HTTP_METHOD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_NEAREST_PACKAGE = HTTP_METHOD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_RELATIONSHIPS = HTTP_METHOD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_REQUIRED_STEREOTYPE__STRING = HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_REQUIRED_STEREOTYPES = HTTP_METHOD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_STEREOTYPE_APPLICATIONS = HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_VALUE__STEREOTYPE_STRING = HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___HAS_KEYWORD__STRING = HTTP_METHOD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___HAS_VALUE__STEREOTYPE_STRING = HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___REMOVE_KEYWORD__STRING = HTTP_METHOD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___ALL_OWNED_ELEMENTS = HTTP_METHOD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___MUST_BE_OWNED = HTTP_METHOD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_USAGE__NAMEDELEMENT = HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_LABEL = HTTP_METHOD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_LABEL__BOOLEAN = HTTP_METHOD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_NAMESPACE = HTTP_METHOD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___ALL_NAMESPACES = HTTP_METHOD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___ALL_OWNING_PACKAGES = HTTP_METHOD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_QUALIFIED_NAME = HTTP_METHOD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SEPARATOR = HTTP_METHOD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_CLIENT_DEPENDENCIES = HTTP_METHOD___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_IMPORTED_ELEMENTS = HTTP_METHOD___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_IMPORTED_PACKAGES = HTTP_METHOD___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_OWNED_MEMBERS = HTTP_METHOD___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___EXCLUDE_COLLISIONS__ELIST = HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_NAMES_OF_MEMBER__NAMEDELEMENT = HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IMPORT_MEMBERS__ELIST = HTTP_METHOD___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_IMPORTED_MEMBERS = HTTP_METHOD___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___MEMBERS_ARE_DISTINGUISHABLE = HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___CREATE_RETURN_RESULT__STRING_TYPE = HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___INPUT_PARAMETERS = HTTP_METHOD___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___OUTPUT_PARAMETERS = HTTP_METHOD___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_TEMPLATE_PARAMETER = HTTP_METHOD___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_TEMPLATE = HTTP_METHOD___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___PARAMETERABLE_ELEMENTS = HTTP_METHOD___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_RETURN_RESULT = HTTP_METHOD___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_IS_ORDERED__BOOLEAN = HTTP_METHOD___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_IS_UNIQUE__BOOLEAN = HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_LOWER__INT = HTTP_METHOD___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_TYPE__TYPE = HTTP_METHOD___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___SET_UPPER__INT = HTTP_METHOD___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_ORDERED = HTTP_METHOD___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___IS_UNIQUE = HTTP_METHOD___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_LOWER = HTTP_METHOD___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___RETURN_RESULT = HTTP_METHOD___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_TYPE = HTTP_METHOD___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___GET_UPPER = HTTP_METHOD___GET_UPPER;

	/**
	 * The number of operations of the '<em>HEAD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = HTTP_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.POSTImpl <em>POST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.POSTImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getPOST()
	 * @generated
	 */
	int POST = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__EANNOTATIONS = HTTP_METHOD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_COMMENT = HTTP_METHOD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_ELEMENT = HTTP_METHOD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNER = HTTP_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CLIENT_DEPENDENCY = HTTP_METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__NAME = HTTP_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__NAME_EXPRESSION = HTTP_METHOD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__NAMESPACE = HTTP_METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__QUALIFIED_NAME = HTTP_METHOD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__VISIBILITY = HTTP_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_RULE = HTTP_METHOD__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__ELEMENT_IMPORT = HTTP_METHOD__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PACKAGE_IMPORT = HTTP_METHOD__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_MEMBER = HTTP_METHOD__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IMPORTED_MEMBER = HTTP_METHOD__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__MEMBER = HTTP_METHOD__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_LEAF = HTTP_METHOD__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__REDEFINED_ELEMENT = HTTP_METHOD__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__REDEFINITION_CONTEXT = HTTP_METHOD__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__FEATURING_CLASSIFIER = HTTP_METHOD__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_STATIC = HTTP_METHOD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONCURRENCY = HTTP_METHOD__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_ABSTRACT = HTTP_METHOD__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__METHOD = HTTP_METHOD__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_PARAMETER = HTTP_METHOD__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_PARAMETER_SET = HTTP_METHOD__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__RAISED_EXCEPTION = HTTP_METHOD__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNING_TEMPLATE_PARAMETER = HTTP_METHOD__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TEMPLATE_PARAMETER = HTTP_METHOD__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TEMPLATE_BINDING = HTTP_METHOD__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OWNED_TEMPLATE_SIGNATURE = HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__BODY_CONDITION = HTTP_METHOD__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CLASS = HTTP_METHOD__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__DATATYPE = HTTP_METHOD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__INTERFACE = HTTP_METHOD__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_ORDERED = HTTP_METHOD__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_QUERY = HTTP_METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_UNIQUE = HTTP_METHOD__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LOWER = HTTP_METHOD__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__POSTCONDITION = HTTP_METHOD__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PRECONDITION = HTTP_METHOD__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__REDEFINED_OPERATION = HTTP_METHOD__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TYPE = HTTP_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__UPPER = HTTP_METHOD__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PATH = HTTP_METHOD__PATH;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONSUMES = HTTP_METHOD__CONSUMES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PRODUCES = HTTP_METHOD__PRODUCES;

	/**
	 * The number of structural features of the '<em>POST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = HTTP_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_EANNOTATION__STRING = HTTP_METHOD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___ADD_KEYWORD__STRING = HTTP_METHOD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___APPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_EANNOTATION__STRING = HTTP_METHOD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___DESTROY = HTTP_METHOD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_KEYWORDS = HTTP_METHOD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLICABLE_STEREOTYPES = HTTP_METHOD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLIED_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLIED_STEREOTYPES = HTTP_METHOD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_MODEL = HTTP_METHOD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_NEAREST_PACKAGE = HTTP_METHOD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_RELATIONSHIPS = HTTP_METHOD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_REQUIRED_STEREOTYPE__STRING = HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_REQUIRED_STEREOTYPES = HTTP_METHOD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_STEREOTYPE_APPLICATIONS = HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_VALUE__STEREOTYPE_STRING = HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___HAS_KEYWORD__STRING = HTTP_METHOD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___HAS_VALUE__STEREOTYPE_STRING = HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___REMOVE_KEYWORD__STRING = HTTP_METHOD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___ALL_OWNED_ELEMENTS = HTTP_METHOD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___MUST_BE_OWNED = HTTP_METHOD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_USAGE__NAMEDELEMENT = HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_LABEL = HTTP_METHOD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_LABEL__BOOLEAN = HTTP_METHOD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_NAMESPACE = HTTP_METHOD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___ALL_NAMESPACES = HTTP_METHOD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___ALL_OWNING_PACKAGES = HTTP_METHOD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_QUALIFIED_NAME = HTTP_METHOD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SEPARATOR = HTTP_METHOD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_CLIENT_DEPENDENCIES = HTTP_METHOD___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_IMPORTED_ELEMENTS = HTTP_METHOD___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_IMPORTED_PACKAGES = HTTP_METHOD___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_OWNED_MEMBERS = HTTP_METHOD___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___EXCLUDE_COLLISIONS__ELIST = HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_NAMES_OF_MEMBER__NAMEDELEMENT = HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IMPORT_MEMBERS__ELIST = HTTP_METHOD___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_IMPORTED_MEMBERS = HTTP_METHOD___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___MEMBERS_ARE_DISTINGUISHABLE = HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___CREATE_RETURN_RESULT__STRING_TYPE = HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___INPUT_PARAMETERS = HTTP_METHOD___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___OUTPUT_PARAMETERS = HTTP_METHOD___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_TEMPLATE_PARAMETER = HTTP_METHOD___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_TEMPLATE = HTTP_METHOD___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___PARAMETERABLE_ELEMENTS = HTTP_METHOD___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_RETURN_RESULT = HTTP_METHOD___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_IS_ORDERED__BOOLEAN = HTTP_METHOD___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_IS_UNIQUE__BOOLEAN = HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_LOWER__INT = HTTP_METHOD___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_TYPE__TYPE = HTTP_METHOD___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___SET_UPPER__INT = HTTP_METHOD___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_ORDERED = HTTP_METHOD___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___IS_UNIQUE = HTTP_METHOD___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_LOWER = HTTP_METHOD___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___RETURN_RESULT = HTTP_METHOD___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_TYPE = HTTP_METHOD___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST___GET_UPPER = HTTP_METHOD___GET_UPPER;

	/**
	 * The number of operations of the '<em>POST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = HTTP_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.OPTIONSImpl <em>OPTIONS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.OPTIONSImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getOPTIONS()
	 * @generated
	 */
	int OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__EANNOTATIONS = HTTP_METHOD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_COMMENT = HTTP_METHOD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_ELEMENT = HTTP_METHOD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNER = HTTP_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CLIENT_DEPENDENCY = HTTP_METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__NAME = HTTP_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__NAME_EXPRESSION = HTTP_METHOD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__NAMESPACE = HTTP_METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__QUALIFIED_NAME = HTTP_METHOD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__VISIBILITY = HTTP_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_RULE = HTTP_METHOD__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__ELEMENT_IMPORT = HTTP_METHOD__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__PACKAGE_IMPORT = HTTP_METHOD__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_MEMBER = HTTP_METHOD__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IMPORTED_MEMBER = HTTP_METHOD__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__MEMBER = HTTP_METHOD__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_LEAF = HTTP_METHOD__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__REDEFINED_ELEMENT = HTTP_METHOD__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__REDEFINITION_CONTEXT = HTTP_METHOD__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__FEATURING_CLASSIFIER = HTTP_METHOD__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_STATIC = HTTP_METHOD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CONCURRENCY = HTTP_METHOD__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_ABSTRACT = HTTP_METHOD__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__METHOD = HTTP_METHOD__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_PARAMETER = HTTP_METHOD__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_PARAMETER_SET = HTTP_METHOD__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__RAISED_EXCEPTION = HTTP_METHOD__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNING_TEMPLATE_PARAMETER = HTTP_METHOD__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__TEMPLATE_PARAMETER = HTTP_METHOD__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__TEMPLATE_BINDING = HTTP_METHOD__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OWNED_TEMPLATE_SIGNATURE = HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__BODY_CONDITION = HTTP_METHOD__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CLASS = HTTP_METHOD__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__DATATYPE = HTTP_METHOD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__INTERFACE = HTTP_METHOD__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_ORDERED = HTTP_METHOD__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_QUERY = HTTP_METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__IS_UNIQUE = HTTP_METHOD__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__LOWER = HTTP_METHOD__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__POSTCONDITION = HTTP_METHOD__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__PRECONDITION = HTTP_METHOD__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__REDEFINED_OPERATION = HTTP_METHOD__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__TYPE = HTTP_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__UPPER = HTTP_METHOD__UPPER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__PATH = HTTP_METHOD__PATH;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CONSUMES = HTTP_METHOD__CONSUMES;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__PRODUCES = HTTP_METHOD__PRODUCES;

	/**
	 * The number of structural features of the '<em>OPTIONS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = HTTP_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_EANNOTATION__STRING = HTTP_METHOD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___ADD_KEYWORD__STRING = HTTP_METHOD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___APPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_EANNOTATION__STRING = HTTP_METHOD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___DESTROY = HTTP_METHOD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_KEYWORDS = HTTP_METHOD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLICABLE_STEREOTYPES = HTTP_METHOD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLIED_STEREOTYPE__STRING = HTTP_METHOD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLIED_STEREOTYPES = HTTP_METHOD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_METHOD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_MODEL = HTTP_METHOD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_NEAREST_PACKAGE = HTTP_METHOD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_RELATIONSHIPS = HTTP_METHOD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_REQUIRED_STEREOTYPE__STRING = HTTP_METHOD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_REQUIRED_STEREOTYPES = HTTP_METHOD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_METHOD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_STEREOTYPE_APPLICATIONS = HTTP_METHOD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_METHOD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_VALUE__STEREOTYPE_STRING = HTTP_METHOD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___HAS_KEYWORD__STRING = HTTP_METHOD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___HAS_VALUE__STEREOTYPE_STRING = HTTP_METHOD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_METHOD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___REMOVE_KEYWORD__STRING = HTTP_METHOD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_METHOD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_METHOD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___ALL_OWNED_ELEMENTS = HTTP_METHOD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___MUST_BE_OWNED = HTTP_METHOD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_METHOD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_USAGE__NAMEDELEMENT = HTTP_METHOD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_LABEL = HTTP_METHOD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_LABEL__BOOLEAN = HTTP_METHOD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_NAMESPACE = HTTP_METHOD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___ALL_NAMESPACES = HTTP_METHOD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___ALL_OWNING_PACKAGES = HTTP_METHOD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_METHOD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_QUALIFIED_NAME = HTTP_METHOD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SEPARATOR = HTTP_METHOD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_CLIENT_DEPENDENCIES = HTTP_METHOD___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = HTTP_METHOD___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = HTTP_METHOD___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_IMPORTED_ELEMENTS = HTTP_METHOD___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_IMPORTED_PACKAGES = HTTP_METHOD___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_OWNED_MEMBERS = HTTP_METHOD___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___EXCLUDE_COLLISIONS__ELIST = HTTP_METHOD___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_NAMES_OF_MEMBER__NAMEDELEMENT = HTTP_METHOD___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IMPORT_MEMBERS__ELIST = HTTP_METHOD___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_IMPORTED_MEMBERS = HTTP_METHOD___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___MEMBERS_ARE_DISTINGUISHABLE = HTTP_METHOD___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = HTTP_METHOD___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = HTTP_METHOD___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___CREATE_RETURN_RESULT__STRING_TYPE = HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___INPUT_PARAMETERS = HTTP_METHOD___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___OUTPUT_PARAMETERS = HTTP_METHOD___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_METHOD___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_TEMPLATE_PARAMETER = HTTP_METHOD___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_TEMPLATE = HTTP_METHOD___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___PARAMETERABLE_ELEMENTS = HTTP_METHOD___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = HTTP_METHOD___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_RETURN_RESULT = HTTP_METHOD___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_IS_ORDERED__BOOLEAN = HTTP_METHOD___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_IS_UNIQUE__BOOLEAN = HTTP_METHOD___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_LOWER__INT = HTTP_METHOD___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_TYPE__TYPE = HTTP_METHOD___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___SET_UPPER__INT = HTTP_METHOD___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_ORDERED = HTTP_METHOD___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___IS_UNIQUE = HTTP_METHOD___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_LOWER = HTTP_METHOD___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___RETURN_RESULT = HTTP_METHOD___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_TYPE = HTTP_METHOD___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS___GET_UPPER = HTTP_METHOD___GET_UPPER;

	/**
	 * The number of operations of the '<em>OPTIONS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = HTTP_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HttpParameterImpl <em>Http Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HttpParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpParameter()
	 * @generated
	 */
	int HTTP_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__EANNOTATIONS = UMLPackage.PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__OWNED_COMMENT = UMLPackage.PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__OWNED_ELEMENT = UMLPackage.PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__OWNER = UMLPackage.PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__CLIENT_DEPENDENCY = UMLPackage.PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__NAME = UMLPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__NAME_EXPRESSION = UMLPackage.PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__NAMESPACE = UMLPackage.PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__QUALIFIED_NAME = UMLPackage.PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__VISIBILITY = UMLPackage.PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__TYPE = UMLPackage.PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER = UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__TEMPLATE_PARAMETER = UMLPackage.PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__END = UMLPackage.PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__IS_ORDERED = UMLPackage.PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__IS_UNIQUE = UMLPackage.PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__LOWER = UMLPackage.PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__LOWER_VALUE = UMLPackage.PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__UPPER = UMLPackage.PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__UPPER_VALUE = UMLPackage.PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__DEFAULT = UMLPackage.PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__DEFAULT_VALUE = UMLPackage.PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__DIRECTION = UMLPackage.PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__EFFECT = UMLPackage.PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__IS_EXCEPTION = UMLPackage.PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__IS_STREAM = UMLPackage.PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__OPERATION = UMLPackage.PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER__PARAMETER_SET = UMLPackage.PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Http Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER_FEATURE_COUNT = UMLPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_EANNOTATION__STRING = UMLPackage.PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___ADD_KEYWORD__STRING = UMLPackage.PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___CREATE_EANNOTATION__STRING = UMLPackage.PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___DESTROY = UMLPackage.PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_KEYWORDS = UMLPackage.PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES = UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLIED_STEREOTYPES = UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_MODEL = UMLPackage.PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_NEAREST_PACKAGE = UMLPackage.PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_RELATIONSHIPS = UMLPackage.PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS = UMLPackage.PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES = UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___HAS_KEYWORD__STRING = UMLPackage.PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___REMOVE_KEYWORD__STRING = UMLPackage.PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___ALL_OWNED_ELEMENTS = UMLPackage.PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___MUST_BE_OWNED = UMLPackage.PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_LABEL = UMLPackage.PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_LABEL__BOOLEAN = UMLPackage.PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_NAMESPACE = UMLPackage.PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___ALL_NAMESPACES = UMLPackage.PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___ALL_OWNING_PACKAGES = UMLPackage.PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_QUALIFIED_NAME = UMLPackage.PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SEPARATOR = UMLPackage.PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES = UMLPackage.PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_TEMPLATE_PARAMETER = UMLPackage.PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_ENDS = UMLPackage.PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_LOWER__INT = UMLPackage.PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_UPPER__INT = UMLPackage.PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = UMLPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = UMLPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS__INT_INT = UMLPackage.PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_MULTIVALUED = UMLPackage.PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_LOWER = UMLPackage.PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___LOWER_BOUND = UMLPackage.PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_UPPER = UMLPackage.PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___UPPER_BOUND = UMLPackage.PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___IS_SET_DEFAULT = UMLPackage.PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = UMLPackage.PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_DEFAULT__STRING = UMLPackage.PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = UMLPackage.PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE = UMLPackage.PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = UMLPackage.PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = UMLPackage.PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = UMLPackage.PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___UNSET_DEFAULT = UMLPackage.PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER___GET_DEFAULT = UMLPackage.PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Http Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PARAMETER_OPERATION_COUNT = UMLPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.QueryParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__EANNOTATIONS = HTTP_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__OWNED_COMMENT = HTTP_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__OWNED_ELEMENT = HTTP_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__OWNER = HTTP_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__CLIENT_DEPENDENCY = HTTP_PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME = HTTP_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME_EXPRESSION = HTTP_PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAMESPACE = HTTP_PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__QUALIFIED_NAME = HTTP_PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__VISIBILITY = HTTP_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__TYPE = HTTP_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__OWNING_TEMPLATE_PARAMETER = HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__TEMPLATE_PARAMETER = HTTP_PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__END = HTTP_PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__IS_ORDERED = HTTP_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__IS_UNIQUE = HTTP_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__LOWER = HTTP_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__LOWER_VALUE = HTTP_PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__UPPER = HTTP_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__UPPER_VALUE = HTTP_PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__DEFAULT = HTTP_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__DEFAULT_VALUE = HTTP_PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__DIRECTION = HTTP_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__EFFECT = HTTP_PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__IS_EXCEPTION = HTTP_PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__IS_STREAM = HTTP_PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__OPERATION = HTTP_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__PARAMETER_SET = HTTP_PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = HTTP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_EANNOTATION__STRING = HTTP_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___ADD_KEYWORD__STRING = HTTP_PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___CREATE_EANNOTATION__STRING = HTTP_PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___DESTROY = HTTP_PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_KEYWORDS = HTTP_PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLICABLE_STEREOTYPES = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLIED_STEREOTYPES = HTTP_PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_MODEL = HTTP_PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_NEAREST_PACKAGE = HTTP_PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_RELATIONSHIPS = HTTP_PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_REQUIRED_STEREOTYPES = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_STEREOTYPE_APPLICATIONS = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___HAS_KEYWORD__STRING = HTTP_PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___REMOVE_KEYWORD__STRING = HTTP_PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___ALL_OWNED_ELEMENTS = HTTP_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___MUST_BE_OWNED = HTTP_PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___CREATE_USAGE__NAMEDELEMENT = HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_LABEL = HTTP_PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_LABEL__BOOLEAN = HTTP_PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_NAMESPACE = HTTP_PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___ALL_NAMESPACES = HTTP_PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___ALL_OWNING_PACKAGES = HTTP_PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_QUALIFIED_NAME = HTTP_PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SEPARATOR = HTTP_PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_CLIENT_DEPENDENCIES = HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_TEMPLATE_PARAMETER = HTTP_PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_ENDS = HTTP_PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_LOWER__INT = HTTP_PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_UPPER__INT = HTTP_PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS__INT_INT = HTTP_PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_MULTIVALUED = HTTP_PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_LOWER = HTTP_PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___LOWER_BOUND = HTTP_PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_UPPER = HTTP_PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___UPPER_BOUND = HTTP_PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___IS_SET_DEFAULT = HTTP_PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_DEFAULT__STRING = HTTP_PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_NULL_DEFAULT_VALUE = HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___UNSET_DEFAULT = HTTP_PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER___GET_DEFAULT = HTTP_PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_OPERATION_COUNT = HTTP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.PathParameterImpl <em>Path Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.PathParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getPathParameter()
	 * @generated
	 */
	int PATH_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__EANNOTATIONS = HTTP_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__OWNED_COMMENT = HTTP_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__OWNED_ELEMENT = HTTP_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__OWNER = HTTP_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__CLIENT_DEPENDENCY = HTTP_PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__NAME = HTTP_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__NAME_EXPRESSION = HTTP_PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__NAMESPACE = HTTP_PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__QUALIFIED_NAME = HTTP_PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__VISIBILITY = HTTP_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__TYPE = HTTP_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__OWNING_TEMPLATE_PARAMETER = HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__TEMPLATE_PARAMETER = HTTP_PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__END = HTTP_PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__IS_ORDERED = HTTP_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__IS_UNIQUE = HTTP_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__LOWER = HTTP_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__LOWER_VALUE = HTTP_PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__UPPER = HTTP_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__UPPER_VALUE = HTTP_PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__DEFAULT = HTTP_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__DEFAULT_VALUE = HTTP_PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__DIRECTION = HTTP_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__EFFECT = HTTP_PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__IS_EXCEPTION = HTTP_PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__IS_STREAM = HTTP_PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__OPERATION = HTTP_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER__PARAMETER_SET = HTTP_PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Path Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_FEATURE_COUNT = HTTP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_EANNOTATION__STRING = HTTP_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___ADD_KEYWORD__STRING = HTTP_PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___CREATE_EANNOTATION__STRING = HTTP_PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___DESTROY = HTTP_PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_KEYWORDS = HTTP_PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLICABLE_STEREOTYPES = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLIED_STEREOTYPES = HTTP_PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_MODEL = HTTP_PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_NEAREST_PACKAGE = HTTP_PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_RELATIONSHIPS = HTTP_PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_REQUIRED_STEREOTYPES = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_STEREOTYPE_APPLICATIONS = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___HAS_KEYWORD__STRING = HTTP_PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___REMOVE_KEYWORD__STRING = HTTP_PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___ALL_OWNED_ELEMENTS = HTTP_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___MUST_BE_OWNED = HTTP_PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___CREATE_USAGE__NAMEDELEMENT = HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_LABEL = HTTP_PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_LABEL__BOOLEAN = HTTP_PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_NAMESPACE = HTTP_PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___ALL_NAMESPACES = HTTP_PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___ALL_OWNING_PACKAGES = HTTP_PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_QUALIFIED_NAME = HTTP_PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SEPARATOR = HTTP_PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_CLIENT_DEPENDENCIES = HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_TEMPLATE_PARAMETER = HTTP_PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_ENDS = HTTP_PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_LOWER__INT = HTTP_PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_UPPER__INT = HTTP_PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS__INT_INT = HTTP_PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_MULTIVALUED = HTTP_PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_LOWER = HTTP_PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___LOWER_BOUND = HTTP_PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_UPPER = HTTP_PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___UPPER_BOUND = HTTP_PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___IS_SET_DEFAULT = HTTP_PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_DEFAULT__STRING = HTTP_PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_NULL_DEFAULT_VALUE = HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___UNSET_DEFAULT = HTTP_PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER___GET_DEFAULT = HTTP_PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Path Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAMETER_OPERATION_COUNT = HTTP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.FormParameterImpl <em>Form Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.FormParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getFormParameter()
	 * @generated
	 */
	int FORM_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__EANNOTATIONS = HTTP_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__OWNED_COMMENT = HTTP_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__OWNED_ELEMENT = HTTP_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__OWNER = HTTP_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__CLIENT_DEPENDENCY = HTTP_PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__NAME = HTTP_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__NAME_EXPRESSION = HTTP_PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__NAMESPACE = HTTP_PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__QUALIFIED_NAME = HTTP_PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__VISIBILITY = HTTP_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__TYPE = HTTP_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__OWNING_TEMPLATE_PARAMETER = HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__TEMPLATE_PARAMETER = HTTP_PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__END = HTTP_PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__IS_ORDERED = HTTP_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__IS_UNIQUE = HTTP_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__LOWER = HTTP_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__LOWER_VALUE = HTTP_PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__UPPER = HTTP_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__UPPER_VALUE = HTTP_PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__DEFAULT = HTTP_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__DEFAULT_VALUE = HTTP_PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__DIRECTION = HTTP_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__EFFECT = HTTP_PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__IS_EXCEPTION = HTTP_PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__IS_STREAM = HTTP_PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__OPERATION = HTTP_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER__PARAMETER_SET = HTTP_PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Form Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER_FEATURE_COUNT = HTTP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_EANNOTATION__STRING = HTTP_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___ADD_KEYWORD__STRING = HTTP_PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___CREATE_EANNOTATION__STRING = HTTP_PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___DESTROY = HTTP_PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_KEYWORDS = HTTP_PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLICABLE_STEREOTYPES = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLIED_STEREOTYPES = HTTP_PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_MODEL = HTTP_PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_NEAREST_PACKAGE = HTTP_PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_RELATIONSHIPS = HTTP_PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_REQUIRED_STEREOTYPES = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_STEREOTYPE_APPLICATIONS = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___HAS_KEYWORD__STRING = HTTP_PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___REMOVE_KEYWORD__STRING = HTTP_PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___ALL_OWNED_ELEMENTS = HTTP_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___MUST_BE_OWNED = HTTP_PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___CREATE_USAGE__NAMEDELEMENT = HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_LABEL = HTTP_PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_LABEL__BOOLEAN = HTTP_PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_NAMESPACE = HTTP_PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___ALL_NAMESPACES = HTTP_PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___ALL_OWNING_PACKAGES = HTTP_PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_QUALIFIED_NAME = HTTP_PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SEPARATOR = HTTP_PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_CLIENT_DEPENDENCIES = HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_TEMPLATE_PARAMETER = HTTP_PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_ENDS = HTTP_PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_LOWER__INT = HTTP_PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_UPPER__INT = HTTP_PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS__INT_INT = HTTP_PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_MULTIVALUED = HTTP_PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_LOWER = HTTP_PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___LOWER_BOUND = HTTP_PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_UPPER = HTTP_PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___UPPER_BOUND = HTTP_PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___IS_SET_DEFAULT = HTTP_PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_DEFAULT__STRING = HTTP_PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_NULL_DEFAULT_VALUE = HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___UNSET_DEFAULT = HTTP_PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER___GET_DEFAULT = HTTP_PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Form Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PARAMETER_OPERATION_COUNT = HTTP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.CookieParameterImpl <em>Cookie Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.CookieParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getCookieParameter()
	 * @generated
	 */
	int COOKIE_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__EANNOTATIONS = HTTP_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__OWNED_COMMENT = HTTP_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__OWNED_ELEMENT = HTTP_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__OWNER = HTTP_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__CLIENT_DEPENDENCY = HTTP_PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__NAME = HTTP_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__NAME_EXPRESSION = HTTP_PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__NAMESPACE = HTTP_PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__QUALIFIED_NAME = HTTP_PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__VISIBILITY = HTTP_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__TYPE = HTTP_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__OWNING_TEMPLATE_PARAMETER = HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__TEMPLATE_PARAMETER = HTTP_PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__END = HTTP_PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__IS_ORDERED = HTTP_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__IS_UNIQUE = HTTP_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__LOWER = HTTP_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__LOWER_VALUE = HTTP_PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__UPPER = HTTP_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__UPPER_VALUE = HTTP_PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__DEFAULT = HTTP_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__DEFAULT_VALUE = HTTP_PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__DIRECTION = HTTP_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__EFFECT = HTTP_PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__IS_EXCEPTION = HTTP_PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__IS_STREAM = HTTP_PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__OPERATION = HTTP_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER__PARAMETER_SET = HTTP_PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Cookie Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER_FEATURE_COUNT = HTTP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_EANNOTATION__STRING = HTTP_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___ADD_KEYWORD__STRING = HTTP_PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___CREATE_EANNOTATION__STRING = HTTP_PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___DESTROY = HTTP_PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_KEYWORDS = HTTP_PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLICABLE_STEREOTYPES = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLIED_STEREOTYPES = HTTP_PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_MODEL = HTTP_PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_NEAREST_PACKAGE = HTTP_PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_RELATIONSHIPS = HTTP_PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_REQUIRED_STEREOTYPES = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_STEREOTYPE_APPLICATIONS = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___HAS_KEYWORD__STRING = HTTP_PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___REMOVE_KEYWORD__STRING = HTTP_PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___ALL_OWNED_ELEMENTS = HTTP_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___MUST_BE_OWNED = HTTP_PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___CREATE_USAGE__NAMEDELEMENT = HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_LABEL = HTTP_PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_LABEL__BOOLEAN = HTTP_PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_NAMESPACE = HTTP_PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___ALL_NAMESPACES = HTTP_PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___ALL_OWNING_PACKAGES = HTTP_PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_QUALIFIED_NAME = HTTP_PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SEPARATOR = HTTP_PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_CLIENT_DEPENDENCIES = HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_TEMPLATE_PARAMETER = HTTP_PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_ENDS = HTTP_PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_LOWER__INT = HTTP_PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_UPPER__INT = HTTP_PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS__INT_INT = HTTP_PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_MULTIVALUED = HTTP_PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_LOWER = HTTP_PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___LOWER_BOUND = HTTP_PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_UPPER = HTTP_PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___UPPER_BOUND = HTTP_PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___IS_SET_DEFAULT = HTTP_PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_DEFAULT__STRING = HTTP_PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_NULL_DEFAULT_VALUE = HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___UNSET_DEFAULT = HTTP_PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER___GET_DEFAULT = HTTP_PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Cookie Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PARAMETER_OPERATION_COUNT = HTTP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HeaderParameterImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHeaderParameter()
	 * @generated
	 */
	int HEADER_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__EANNOTATIONS = HTTP_PARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__OWNED_COMMENT = HTTP_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__OWNED_ELEMENT = HTTP_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__OWNER = HTTP_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__CLIENT_DEPENDENCY = HTTP_PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__NAME = HTTP_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__NAME_EXPRESSION = HTTP_PARAMETER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__NAMESPACE = HTTP_PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__QUALIFIED_NAME = HTTP_PARAMETER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__VISIBILITY = HTTP_PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__TYPE = HTTP_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__OWNING_TEMPLATE_PARAMETER = HTTP_PARAMETER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__TEMPLATE_PARAMETER = HTTP_PARAMETER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__END = HTTP_PARAMETER__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__IS_ORDERED = HTTP_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__IS_UNIQUE = HTTP_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__LOWER = HTTP_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__LOWER_VALUE = HTTP_PARAMETER__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__UPPER = HTTP_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__UPPER_VALUE = HTTP_PARAMETER__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__DEFAULT = HTTP_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__DEFAULT_VALUE = HTTP_PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__DIRECTION = HTTP_PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__EFFECT = HTTP_PARAMETER__EFFECT;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__IS_EXCEPTION = HTTP_PARAMETER__IS_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__IS_STREAM = HTTP_PARAMETER__IS_STREAM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__OPERATION = HTTP_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER__PARAMETER_SET = HTTP_PARAMETER__PARAMETER_SET;

	/**
	 * The number of structural features of the '<em>Header Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_FEATURE_COUNT = HTTP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_EANNOTATION__STRING = HTTP_PARAMETER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___ADD_KEYWORD__STRING = HTTP_PARAMETER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___CREATE_EANNOTATION__STRING = HTTP_PARAMETER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___DESTROY = HTTP_PARAMETER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_KEYWORDS = HTTP_PARAMETER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLICABLE_STEREOTYPES = HTTP_PARAMETER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLIED_STEREOTYPES = HTTP_PARAMETER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = HTTP_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_MODEL = HTTP_PARAMETER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_NEAREST_PACKAGE = HTTP_PARAMETER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_RELATIONSHIPS = HTTP_PARAMETER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_REQUIRED_STEREOTYPES = HTTP_PARAMETER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_STEREOTYPE_APPLICATIONS = HTTP_PARAMETER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = HTTP_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___HAS_KEYWORD__STRING = HTTP_PARAMETER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = HTTP_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = HTTP_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___REMOVE_KEYWORD__STRING = HTTP_PARAMETER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = HTTP_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = HTTP_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___ALL_OWNED_ELEMENTS = HTTP_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___MUST_BE_OWNED = HTTP_PARAMETER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = HTTP_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___CREATE_USAGE__NAMEDELEMENT = HTTP_PARAMETER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_LABEL = HTTP_PARAMETER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_LABEL__BOOLEAN = HTTP_PARAMETER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_NAMESPACE = HTTP_PARAMETER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___ALL_NAMESPACES = HTTP_PARAMETER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___ALL_OWNING_PACKAGES = HTTP_PARAMETER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = HTTP_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_QUALIFIED_NAME = HTTP_PARAMETER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SEPARATOR = HTTP_PARAMETER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_CLIENT_DEPENDENCIES = HTTP_PARAMETER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = HTTP_PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_TEMPLATE_PARAMETER = HTTP_PARAMETER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_ENDS = HTTP_PARAMETER___GET_ENDS;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_LOWER__INT = HTTP_PARAMETER___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_UPPER__INT = HTTP_PARAMETER___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = HTTP_PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = HTTP_PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS__INT_INT = HTTP_PARAMETER___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_MULTIVALUED = HTTP_PARAMETER___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_LOWER = HTTP_PARAMETER___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___LOWER_BOUND = HTTP_PARAMETER___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_UPPER = HTTP_PARAMETER___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___UPPER_BOUND = HTTP_PARAMETER___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Validate In And Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Connector End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Stream And Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Object Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP = HTTP_PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___IS_SET_DEFAULT = HTTP_PARAMETER___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = HTTP_PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_DEFAULT__STRING = HTTP_PARAMETER___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_NULL_DEFAULT_VALUE = HTTP_PARAMETER___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE = HTTP_PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING = HTTP_PARAMETER___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = HTTP_PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___UNSET_DEFAULT = HTTP_PARAMETER___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER___GET_DEFAULT = HTTP_PARAMETER___GET_DEFAULT;

	/**
	 * The number of operations of the '<em>Header Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_OPERATION_COUNT = HTTP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ollabaca.on.mm.rest.impl.HttpMessageImpl <em>Http Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ollabaca.on.mm.rest.impl.HttpMessageImpl
	 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpMessage()
	 * @generated
	 */
	int HTTP_MESSAGE = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__EANNOTATIONS = UMLPackage.CLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_COMMENT = UMLPackage.CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_ELEMENT = UMLPackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNER = UMLPackage.CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__CLIENT_DEPENDENCY = UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__NAME = UMLPackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__NAME_EXPRESSION = UMLPackage.CLASSIFIER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__NAMESPACE = UMLPackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__QUALIFIED_NAME = UMLPackage.CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__VISIBILITY = UMLPackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_RULE = UMLPackage.CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__ELEMENT_IMPORT = UMLPackage.CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__PACKAGE_IMPORT = UMLPackage.CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_MEMBER = UMLPackage.CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__IMPORTED_MEMBER = UMLPackage.CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__MEMBER = UMLPackage.CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__IS_LEAF = UMLPackage.CLASSIFIER__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__REDEFINED_ELEMENT = UMLPackage.CLASSIFIER__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__REDEFINITION_CONTEXT = UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNING_TEMPLATE_PARAMETER = UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__TEMPLATE_PARAMETER = UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__PACKAGE = UMLPackage.CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__TEMPLATE_BINDING = UMLPackage.CLASSIFIER__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__FEATURE = UMLPackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__ATTRIBUTE = UMLPackage.CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__COLLABORATION_USE = UMLPackage.CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__GENERAL = UMLPackage.CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__GENERALIZATION = UMLPackage.CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__POWERTYPE_EXTENT = UMLPackage.CLASSIFIER__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__INHERITED_MEMBER = UMLPackage.CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__IS_ABSTRACT = UMLPackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__IS_FINAL_SPECIALIZATION = UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__OWNED_USE_CASE = UMLPackage.CLASSIFIER__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__USE_CASE = UMLPackage.CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__REDEFINED_CLASSIFIER = UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__REPRESENTATION = UMLPackage.CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__SUBSTITUTION = UMLPackage.CLASSIFIER__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__HEADERS = UMLPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE__CONTENT = UMLPackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Http Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE_FEATURE_COUNT = UMLPackage.CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_EANNOTATION__STRING = UMLPackage.CLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ADD_KEYWORD__STRING = UMLPackage.CLASSIFIER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASSIFIER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_EANNOTATION__STRING = UMLPackage.CLASSIFIER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___DESTROY = UMLPackage.CLASSIFIER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_KEYWORDS = UMLPackage.CLASSIFIER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLICABLE_STEREOTYPES = UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLIED_STEREOTYPES = UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_MODEL = UMLPackage.CLASSIFIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_NEAREST_PACKAGE = UMLPackage.CLASSIFIER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_RELATIONSHIPS = UMLPackage.CLASSIFIER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_RELATIONSHIPS__ECLASS = UMLPackage.CLASSIFIER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_REQUIRED_STEREOTYPES = UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.CLASSIFIER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___HAS_KEYWORD__STRING = UMLPackage.CLASSIFIER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.CLASSIFIER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.CLASSIFIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___REMOVE_KEYWORD__STRING = UMLPackage.CLASSIFIER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.CLASSIFIER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASSIFIER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_OWNED_ELEMENTS = UMLPackage.CLASSIFIER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___MUST_BE_OWNED = UMLPackage.CLASSIFIER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.CLASSIFIER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.CLASSIFIER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_LABEL = UMLPackage.CLASSIFIER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_LABEL__BOOLEAN = UMLPackage.CLASSIFIER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_NAMESPACE = UMLPackage.CLASSIFIER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_NAMESPACES = UMLPackage.CLASSIFIER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_OWNING_PACKAGES = UMLPackage.CLASSIFIER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_QUALIFIED_NAME = UMLPackage.CLASSIFIER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___SEPARATOR = UMLPackage.CLASSIFIER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_CLIENT_DEPENDENCIES = UMLPackage.CLASSIFIER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.CLASSIFIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.CLASSIFIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_IMPORTED_ELEMENTS = UMLPackage.CLASSIFIER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_IMPORTED_PACKAGES = UMLPackage.CLASSIFIER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_OWNED_MEMBERS = UMLPackage.CLASSIFIER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___EXCLUDE_COLLISIONS__ELIST = UMLPackage.CLASSIFIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IMPORT_MEMBERS__ELIST = UMLPackage.CLASSIFIER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_IMPORTED_MEMBERS = UMLPackage.CLASSIFIER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_TEMPLATE_PARAMETER = UMLPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_ASSOCIATIONS = UMLPackage.CLASSIFIER___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___CONFORMS_TO__TYPE = UMLPackage.CLASSIFIER___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_TEMPLATE = UMLPackage.CLASSIFIER___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___PARAMETERABLE_ELEMENTS = UMLPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_ALL_ATTRIBUTES = UMLPackage.CLASSIFIER___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_ALL_OPERATIONS = UMLPackage.CLASSIFIER___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_ALL_USED_INTERFACES = UMLPackage.CLASSIFIER___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_OPERATIONS = UMLPackage.CLASSIFIER___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_USED_INTERFACES = UMLPackage.CLASSIFIER___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_FEATURES = UMLPackage.CLASSIFIER___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_PARENTS = UMLPackage.CLASSIFIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_GENERALS = UMLPackage.CLASSIFIER___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___INHERIT__ELIST = UMLPackage.CLASSIFIER___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___GET_INHERITED_MEMBERS = UMLPackage.CLASSIFIER___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___PARENTS = UMLPackage.CLASSIFIER___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___DIRECTLY_REALIZED_INTERFACES = UMLPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___DIRECTLY_USED_INTERFACES = UMLPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_REALIZED_INTERFACES = UMLPackage.CLASSIFIER___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_USED_INTERFACES = UMLPackage.CLASSIFIER___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_ATTRIBUTES = UMLPackage.CLASSIFIER___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE___ALL_SLOTTABLE_FEATURES = UMLPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES;

	/**
	 * The number of operations of the '<em>Http Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_MESSAGE_OPERATION_COUNT = UMLPackage.CLASSIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type</em>'.
	 * @see org.ollabaca.on.mm.rest.MimeType
	 * @generated
	 */
	EClass getMimeType();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HttpResource <em>Http Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Resource</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpResource
	 * @generated
	 */
	EClass getHttpResource();

	/**
	 * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.rest.HttpResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpResource#getPath()
	 * @see #getHttpResource()
	 * @generated
	 */
	EAttribute getHttpResource_Path();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Method</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMethod
	 * @generated
	 */
	EClass getHttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.rest.HttpMethod#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMethod#getPath()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.ollabaca.on.mm.rest.HttpMethod#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMethod#getConsumes()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EReference getHttpMethod_Consumes();

	/**
	 * Returns the meta object for the reference list '{@link org.ollabaca.on.mm.rest.HttpMethod#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMethod#getProduces()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EReference getHttpMethod_Produces();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.DELETE <em>DELETE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DELETE</em>'.
	 * @see org.ollabaca.on.mm.rest.DELETE
	 * @generated
	 */
	EClass getDELETE();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.GET <em>GET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GET</em>'.
	 * @see org.ollabaca.on.mm.rest.GET
	 * @generated
	 */
	EClass getGET();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HEAD <em>HEAD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEAD</em>'.
	 * @see org.ollabaca.on.mm.rest.HEAD
	 * @generated
	 */
	EClass getHEAD();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.POST <em>POST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POST</em>'.
	 * @see org.ollabaca.on.mm.rest.POST
	 * @generated
	 */
	EClass getPOST();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.OPTIONS <em>OPTIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPTIONS</em>'.
	 * @see org.ollabaca.on.mm.rest.OPTIONS
	 * @generated
	 */
	EClass getOPTIONS();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HttpParameter <em>Http Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpParameter
	 * @generated
	 */
	EClass getHttpParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.PathParameter <em>Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.PathParameter
	 * @generated
	 */
	EClass getPathParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.FormParameter <em>Form Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.FormParameter
	 * @generated
	 */
	EClass getFormParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.CookieParameter <em>Cookie Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookie Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.CookieParameter
	 * @generated
	 */
	EClass getCookieParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HeaderParameter <em>Header Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Parameter</em>'.
	 * @see org.ollabaca.on.mm.rest.HeaderParameter
	 * @generated
	 */
	EClass getHeaderParameter();

	/**
	 * Returns the meta object for class '{@link org.ollabaca.on.mm.rest.HttpMessage <em>Http Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Message</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMessage
	 * @generated
	 */
	EClass getHttpMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ollabaca.on.mm.rest.HttpMessage#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMessage#getHeaders()
	 * @see #getHttpMessage()
	 * @generated
	 */
	EReference getHttpMessage_Headers();

	/**
	 * Returns the meta object for the containment reference '{@link org.ollabaca.on.mm.rest.HttpMessage#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.ollabaca.on.mm.rest.HttpMessage#getContent()
	 * @see #getHttpMessage()
	 * @generated
	 */
	EReference getHttpMessage_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

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
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.MimeTypeImpl <em>Mime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.MimeTypeImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getMimeType()
		 * @generated
		 */
		EClass MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HttpResourceImpl <em>Http Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HttpResourceImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpResource()
		 * @generated
		 */
		EClass HTTP_RESOURCE = eINSTANCE.getHttpResource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESOURCE__PATH = eINSTANCE.getHttpResource_Path();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HttpMethodImpl <em>Http Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HttpMethodImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpMethod()
		 * @generated
		 */
		EClass HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__PATH = eINSTANCE.getHttpMethod_Path();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_METHOD__CONSUMES = eINSTANCE.getHttpMethod_Consumes();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_METHOD__PRODUCES = eINSTANCE.getHttpMethod_Produces();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.DELETEImpl <em>DELETE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.DELETEImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getDELETE()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDELETE();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.GETImpl <em>GET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.GETImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getGET()
		 * @generated
		 */
		EClass GET = eINSTANCE.getGET();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HEADImpl <em>HEAD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HEADImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHEAD()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHEAD();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.POSTImpl <em>POST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.POSTImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getPOST()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPOST();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.OPTIONSImpl <em>OPTIONS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.OPTIONSImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getOPTIONS()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOPTIONS();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HttpParameterImpl <em>Http Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HttpParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpParameter()
		 * @generated
		 */
		EClass HTTP_PARAMETER = eINSTANCE.getHttpParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.QueryParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.PathParameterImpl <em>Path Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.PathParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getPathParameter()
		 * @generated
		 */
		EClass PATH_PARAMETER = eINSTANCE.getPathParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.FormParameterImpl <em>Form Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.FormParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getFormParameter()
		 * @generated
		 */
		EClass FORM_PARAMETER = eINSTANCE.getFormParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.CookieParameterImpl <em>Cookie Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.CookieParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getCookieParameter()
		 * @generated
		 */
		EClass COOKIE_PARAMETER = eINSTANCE.getCookieParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HeaderParameterImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHeaderParameter()
		 * @generated
		 */
		EClass HEADER_PARAMETER = eINSTANCE.getHeaderParameter();

		/**
		 * The meta object literal for the '{@link org.ollabaca.on.mm.rest.impl.HttpMessageImpl <em>Http Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ollabaca.on.mm.rest.impl.HttpMessageImpl
		 * @see org.ollabaca.on.mm.rest.impl.RestPackageImpl#getHttpMessage()
		 * @generated
		 */
		EClass HTTP_MESSAGE = eINSTANCE.getHttpMessage();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_MESSAGE__HEADERS = eINSTANCE.getHttpMessage_Headers();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_MESSAGE__CONTENT = eINSTANCE.getHttpMessage_Content();

	}

} //RestPackage
