/**
 */
package org.ollabaca.on.mm.uml.rest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.ollabaca.on.mm.uml.rest.RestFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.mm.uml'"
 * @generated
 */
public interface RestPackage extends EPackage
{
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
  String eNS_URI = "org.ollabaca.on.mm.uml.rest";

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
  RestPackage eINSTANCE = org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpResourceImpl <em>Http Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.impl.HttpResourceImpl
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpResource()
   * @generated
   */
  int HTTP_RESOURCE = 0;

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
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE__OWNED_RULE = UMLPackage.INTERFACE__OWNED_RULE;

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
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE__TEMPLATE_BINDING = UMLPackage.INTERFACE__TEMPLATE_BINDING;

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
   * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE__OWNED_OPERATION = UMLPackage.INTERFACE__OWNED_OPERATION;

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
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE___GET_NAMESPACE = UMLPackage.INTERFACE___GET_NAMESPACE;

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
   * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERFACE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Owned Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE___GET_OWNED_MEMBERS = UMLPackage.INTERFACE___GET_OWNED_MEMBERS;

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
   * The operation id for the '<em>Conforms To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_RESOURCE___CONFORMS_TO__CLASSIFIER = UMLPackage.INTERFACE___CONFORMS_TO__CLASSIFIER;

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
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpMethodImpl <em>Http Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.impl.HttpMethodImpl
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMethod()
   * @generated
   */
  int HTTP_METHOD = 1;

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
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__OWNED_RULE = UMLPackage.OPERATION__OWNED_RULE;

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
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__OWNED_TEMPLATE_SIGNATURE = UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__TEMPLATE_BINDING = UMLPackage.OPERATION__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Interface</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__INTERFACE = UMLPackage.OPERATION__INTERFACE;

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
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__KIND = UMLPackage.OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Consumes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__CONSUMES = UMLPackage.OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Produces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__PRODUCES = UMLPackage.OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Http Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_FEATURE_COUNT = UMLPackage.OPERATION_FEATURE_COUNT + 4;

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
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD___GET_NAMESPACE = UMLPackage.OPERATION___GET_NAMESPACE;

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
   * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Owned Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD___GET_OWNED_MEMBERS = UMLPackage.OPERATION___GET_OWNED_MEMBERS;

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
   * The operation id for the '<em>Create Return Result</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD___CREATE_RETURN_RESULT__STRING_TYPE = UMLPackage.OPERATION___CREATE_RETURN_RESULT__STRING_TYPE;

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
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpParameterImpl <em>Http Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.impl.HttpParameterImpl
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpParameter()
   * @generated
   */
  int HTTP_PARAMETER = 2;

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
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER__KIND = UMLPackage.PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Http Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER_FEATURE_COUNT = UMLPackage.PARAMETER_FEATURE_COUNT + 1;

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
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___GET_NAMESPACE = UMLPackage.PARAMETER___GET_NAMESPACE;

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
   * The operation id for the '<em>Validate Lower Ge0</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Includes Cardinality</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___INCLUDES_CARDINALITY__INT = UMLPackage.PARAMETER___INCLUDES_CARDINALITY__INT;

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
   * The operation id for the '<em>Validate Reentrant Behaviors</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Connector End</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Exception</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate In And Out</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Stream And Exception</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP = UMLPackage.PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP;

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
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl <em>Http Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMessage()
   * @generated
   */
  int HTTP_MESSAGE = 3;

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
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE__OWNED_RULE = UMLPackage.CLASSIFIER__OWNED_RULE;

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
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE__TEMPLATE_BINDING = UMLPackage.CLASSIFIER__TEMPLATE_BINDING;

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
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE___GET_NAMESPACE = UMLPackage.CLASSIFIER___GET_NAMESPACE;

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
   * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASSIFIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

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
   * The operation id for the '<em>Get Owned Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE___GET_OWNED_MEMBERS = UMLPackage.CLASSIFIER___GET_OWNED_MEMBERS;

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
   * The operation id for the '<em>Conforms To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE___CONFORMS_TO__CLASSIFIER = UMLPackage.CLASSIFIER___CONFORMS_TO__CLASSIFIER;

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
   * The number of operations of the '<em>Http Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_MESSAGE_OPERATION_COUNT = UMLPackage.CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.HttpMethodKind <em>Http Method Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.HttpMethodKind
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMethodKind()
   * @generated
   */
  int HTTP_METHOD_KIND = 4;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.uml.rest.HttpParameterKind <em>Http Parameter Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.uml.rest.HttpParameterKind
   * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpParameterKind()
   * @generated
   */
  int HTTP_PARAMETER_KIND = 5;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.rest.HttpResource <em>Http Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Resource</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpResource
   * @generated
   */
  EClass getHttpResource();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.uml.rest.HttpResource#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpResource#getPath()
   * @see #getHttpResource()
   * @generated
   */
  EAttribute getHttpResource_Path();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.rest.HttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethod
   * @generated
   */
  EClass getHttpMethod();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.uml.rest.HttpMethod#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethod#getPath()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Path();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.uml.rest.HttpMethod#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethod#getKind()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Kind();

  /**
   * Returns the meta object for the attribute list '{@link org.ollabaca.on.mm.uml.rest.HttpMethod#getConsumes <em>Consumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Consumes</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethod#getConsumes()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Consumes();

  /**
   * Returns the meta object for the attribute list '{@link org.ollabaca.on.mm.uml.rest.HttpMethod#getProduces <em>Produces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Produces</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethod#getProduces()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Produces();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.rest.HttpParameter <em>Http Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Parameter</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpParameter
   * @generated
   */
  EClass getHttpParameter();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.uml.rest.HttpParameter#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpParameter#getKind()
   * @see #getHttpParameter()
   * @generated
   */
  EAttribute getHttpParameter_Kind();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.uml.rest.HttpMessage <em>Http Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Message</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMessage
   * @generated
   */
  EClass getHttpMessage();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.mm.uml.rest.HttpMessage#getHeaders <em>Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Headers</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMessage#getHeaders()
   * @see #getHttpMessage()
   * @generated
   */
  EReference getHttpMessage_Headers();

  /**
   * Returns the meta object for the containment reference '{@link org.ollabaca.on.mm.uml.rest.HttpMessage#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMessage#getContent()
   * @see #getHttpMessage()
   * @generated
   */
  EReference getHttpMessage_Content();

  /**
   * Returns the meta object for enum '{@link org.ollabaca.on.mm.uml.rest.HttpMethodKind <em>Http Method Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Method Kind</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpMethodKind
   * @generated
   */
  EEnum getHttpMethodKind();

  /**
   * Returns the meta object for enum '{@link org.ollabaca.on.mm.uml.rest.HttpParameterKind <em>Http Parameter Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Parameter Kind</em>'.
   * @see org.ollabaca.on.mm.uml.rest.HttpParameterKind
   * @generated
   */
  EEnum getHttpParameterKind();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpResourceImpl <em>Http Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.impl.HttpResourceImpl
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpResource()
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
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpMethodImpl <em>Http Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.impl.HttpMethodImpl
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMethod()
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
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__KIND = eINSTANCE.getHttpMethod_Kind();

    /**
     * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__CONSUMES = eINSTANCE.getHttpMethod_Consumes();

    /**
     * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__PRODUCES = eINSTANCE.getHttpMethod_Produces();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpParameterImpl <em>Http Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.impl.HttpParameterImpl
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpParameter()
     * @generated
     */
    EClass HTTP_PARAMETER = eINSTANCE.getHttpParameter();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_PARAMETER__KIND = eINSTANCE.getHttpParameter_Kind();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl <em>Http Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMessage()
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

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.HttpMethodKind <em>Http Method Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.HttpMethodKind
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpMethodKind()
     * @generated
     */
    EEnum HTTP_METHOD_KIND = eINSTANCE.getHttpMethodKind();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.uml.rest.HttpParameterKind <em>Http Parameter Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.uml.rest.HttpParameterKind
     * @see org.ollabaca.on.mm.uml.rest.impl.RestPackageImpl#getHttpParameterKind()
     * @generated
     */
    EEnum HTTP_PARAMETER_KIND = eINSTANCE.getHttpParameterKind();

  }

} //RestPackage
