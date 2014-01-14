/**
 */
package org.ollabaca.on.mm.om;

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
 * <!-- begin-model-doc -->
 * *
 * Observations & Measurement
 * <!-- end-model-doc -->
 * @see org.ollabaca.on.mm.om.OmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.mm'"
 * @generated
 */
public interface OmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "om";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ollabaca.on.mm.om";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "om";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OmPackage eINSTANCE = org.ollabaca.on.mm.om.impl.OmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.OmElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.OmElementImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getOmElement()
   * @generated
   */
  int OM_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OM_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.QuantityKindImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getQuantityKind()
   * @generated
   */
  int QUANTITY_KIND = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__EANNOTATIONS = UMLPackage.DATA_TYPE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_COMMENT = UMLPackage.DATA_TYPE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_ELEMENT = UMLPackage.DATA_TYPE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNER = UMLPackage.DATA_TYPE__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__CLIENT_DEPENDENCY = UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__NAME = UMLPackage.DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__NAME_EXPRESSION = UMLPackage.DATA_TYPE__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__NAMESPACE = UMLPackage.DATA_TYPE__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__QUALIFIED_NAME = UMLPackage.DATA_TYPE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__VISIBILITY = UMLPackage.DATA_TYPE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__ELEMENT_IMPORT = UMLPackage.DATA_TYPE__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__PACKAGE_IMPORT = UMLPackage.DATA_TYPE__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_RULE = UMLPackage.DATA_TYPE__OWNED_RULE;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_MEMBER = UMLPackage.DATA_TYPE__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__IMPORTED_MEMBER = UMLPackage.DATA_TYPE__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__MEMBER = UMLPackage.DATA_TYPE__MEMBER;

  /**
   * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__IS_LEAF = UMLPackage.DATA_TYPE__IS_LEAF;

  /**
   * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__REDEFINED_ELEMENT = UMLPackage.DATA_TYPE__REDEFINED_ELEMENT;

  /**
   * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__REDEFINITION_CONTEXT = UMLPackage.DATA_TYPE__REDEFINITION_CONTEXT;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNING_TEMPLATE_PARAMETER = UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__TEMPLATE_PARAMETER = UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__PACKAGE = UMLPackage.DATA_TYPE__PACKAGE;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_TEMPLATE_SIGNATURE = UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__TEMPLATE_BINDING = UMLPackage.DATA_TYPE__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__FEATURE = UMLPackage.DATA_TYPE__FEATURE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__ATTRIBUTE = UMLPackage.DATA_TYPE__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__COLLABORATION_USE = UMLPackage.DATA_TYPE__COLLABORATION_USE;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__GENERAL = UMLPackage.DATA_TYPE__GENERAL;

  /**
   * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__GENERALIZATION = UMLPackage.DATA_TYPE__GENERALIZATION;

  /**
   * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__POWERTYPE_EXTENT = UMLPackage.DATA_TYPE__POWERTYPE_EXTENT;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__INHERITED_MEMBER = UMLPackage.DATA_TYPE__INHERITED_MEMBER;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__IS_ABSTRACT = UMLPackage.DATA_TYPE__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__IS_FINAL_SPECIALIZATION = UMLPackage.DATA_TYPE__IS_FINAL_SPECIALIZATION;

  /**
   * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_USE_CASE = UMLPackage.DATA_TYPE__OWNED_USE_CASE;

  /**
   * The feature id for the '<em><b>Use Case</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__USE_CASE = UMLPackage.DATA_TYPE__USE_CASE;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__REDEFINED_CLASSIFIER = UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>Representation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__REPRESENTATION = UMLPackage.DATA_TYPE__REPRESENTATION;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__SUBSTITUTION = UMLPackage.DATA_TYPE__SUBSTITUTION;

  /**
   * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_ATTRIBUTE = UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__OWNED_OPERATION = UMLPackage.DATA_TYPE__OWNED_OPERATION;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND__DIMENSION = UMLPackage.DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quantity Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND_FEATURE_COUNT = UMLPackage.DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_EANNOTATION__STRING = UMLPackage.DATA_TYPE___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ADD_KEYWORD__STRING = UMLPackage.DATA_TYPE___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.DATA_TYPE___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_EANNOTATION__STRING = UMLPackage.DATA_TYPE___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___DESTROY = UMLPackage.DATA_TYPE___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_KEYWORDS = UMLPackage.DATA_TYPE___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.DATA_TYPE___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLICABLE_STEREOTYPES = UMLPackage.DATA_TYPE___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.DATA_TYPE___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLIED_STEREOTYPES = UMLPackage.DATA_TYPE___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.DATA_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.DATA_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_MODEL = UMLPackage.DATA_TYPE___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_NEAREST_PACKAGE = UMLPackage.DATA_TYPE___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_RELATIONSHIPS = UMLPackage.DATA_TYPE___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_RELATIONSHIPS__ECLASS = UMLPackage.DATA_TYPE___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.DATA_TYPE___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_REQUIRED_STEREOTYPES = UMLPackage.DATA_TYPE___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.DATA_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.DATA_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.DATA_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_STEREOTYPE_APPLICATIONS = UMLPackage.DATA_TYPE___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.DATA_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.DATA_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_VALUE__STEREOTYPE_STRING = UMLPackage.DATA_TYPE___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___HAS_KEYWORD__STRING = UMLPackage.DATA_TYPE___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.DATA_TYPE___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.DATA_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.DATA_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.DATA_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___REMOVE_KEYWORD__STRING = UMLPackage.DATA_TYPE___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.DATA_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.DATA_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ALL_OWNED_ELEMENTS = UMLPackage.DATA_TYPE___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___MUST_BE_OWNED = UMLPackage.DATA_TYPE___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.DATA_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_USAGE__NAMEDELEMENT = UMLPackage.DATA_TYPE___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_LABEL = UMLPackage.DATA_TYPE___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_LABEL__BOOLEAN = UMLPackage.DATA_TYPE___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ALL_NAMESPACES = UMLPackage.DATA_TYPE___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ALL_OWNING_PACKAGES = UMLPackage.DATA_TYPE___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.DATA_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_NAMESPACE = UMLPackage.DATA_TYPE___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_QUALIFIED_NAME = UMLPackage.DATA_TYPE___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___SEPARATOR = UMLPackage.DATA_TYPE___SEPARATOR;

  /**
   * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Element Import</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.DATA_TYPE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

  /**
   * The operation id for the '<em>Create Package Import</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.DATA_TYPE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

  /**
   * The operation id for the '<em>Get Imported Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_IMPORTED_ELEMENTS = UMLPackage.DATA_TYPE___GET_IMPORTED_ELEMENTS;

  /**
   * The operation id for the '<em>Get Imported Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_IMPORTED_PACKAGES = UMLPackage.DATA_TYPE___GET_IMPORTED_PACKAGES;

  /**
   * The operation id for the '<em>Exclude Collisions</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___EXCLUDE_COLLISIONS__ELIST = UMLPackage.DATA_TYPE___EXCLUDE_COLLISIONS__ELIST;

  /**
   * The operation id for the '<em>Get Names Of Member</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.DATA_TYPE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Import Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IMPORT_MEMBERS__ELIST = UMLPackage.DATA_TYPE___IMPORT_MEMBERS__ELIST;

  /**
   * The operation id for the '<em>Get Imported Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_IMPORTED_MEMBERS = UMLPackage.DATA_TYPE___GET_IMPORTED_MEMBERS;

  /**
   * The operation id for the '<em>Members Are Distinguishable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.DATA_TYPE___MEMBERS_ARE_DISTINGUISHABLE;

  /**
   * The operation id for the '<em>Get Owned Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_OWNED_MEMBERS = UMLPackage.DATA_TYPE___GET_OWNED_MEMBERS;

  /**
   * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Is Consistent With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.DATA_TYPE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

  /**
   * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.DATA_TYPE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.DATA_TYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_TEMPLATE_PARAMETER = UMLPackage.DATA_TYPE___IS_TEMPLATE_PARAMETER;

  /**
   * The operation id for the '<em>Create Association</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.DATA_TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

  /**
   * The operation id for the '<em>Get Associations</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_ASSOCIATIONS = UMLPackage.DATA_TYPE___GET_ASSOCIATIONS;

  /**
   * The operation id for the '<em>Conforms To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CONFORMS_TO__TYPE = UMLPackage.DATA_TYPE___CONFORMS_TO__TYPE;

  /**
   * The operation id for the '<em>Is Template</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___IS_TEMPLATE = UMLPackage.DATA_TYPE___IS_TEMPLATE;

  /**
   * The operation id for the '<em>Parameterable Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___PARAMETERABLE_ELEMENTS = UMLPackage.DATA_TYPE___PARAMETERABLE_ELEMENTS;

  /**
   * The operation id for the '<em>Validate Non Final Parents</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Specialize Type</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.DATA_TYPE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Get All Attributes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_ALL_ATTRIBUTES = UMLPackage.DATA_TYPE___GET_ALL_ATTRIBUTES;

  /**
   * The operation id for the '<em>Get All Operations</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_ALL_OPERATIONS = UMLPackage.DATA_TYPE___GET_ALL_OPERATIONS;

  /**
   * The operation id for the '<em>Get All Used Interfaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_ALL_USED_INTERFACES = UMLPackage.DATA_TYPE___GET_ALL_USED_INTERFACES;

  /**
   * The operation id for the '<em>Get Operation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.DATA_TYPE___GET_OPERATION__STRING_ELIST_ELIST;

  /**
   * The operation id for the '<em>Get Operation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.DATA_TYPE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

  /**
   * The operation id for the '<em>Get Operations</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_OPERATIONS = UMLPackage.DATA_TYPE___GET_OPERATIONS;

  /**
   * The operation id for the '<em>Get Used Interfaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_USED_INTERFACES = UMLPackage.DATA_TYPE___GET_USED_INTERFACES;

  /**
   * The operation id for the '<em>All Features</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ALL_FEATURES = UMLPackage.DATA_TYPE___ALL_FEATURES;

  /**
   * The operation id for the '<em>All Parents</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___ALL_PARENTS = UMLPackage.DATA_TYPE___ALL_PARENTS;

  /**
   * The operation id for the '<em>Conforms To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CONFORMS_TO__CLASSIFIER = UMLPackage.DATA_TYPE___CONFORMS_TO__CLASSIFIER;

  /**
   * The operation id for the '<em>Get Generals</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_GENERALS = UMLPackage.DATA_TYPE___GET_GENERALS;

  /**
   * The operation id for the '<em>Has Visibility Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.DATA_TYPE___HAS_VISIBILITY_OF__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Inherit</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___INHERIT__ELIST = UMLPackage.DATA_TYPE___INHERIT__ELIST;

  /**
   * The operation id for the '<em>Inheritable Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.DATA_TYPE___INHERITABLE_MEMBERS__CLASSIFIER;

  /**
   * The operation id for the '<em>Get Inherited Members</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___GET_INHERITED_MEMBERS = UMLPackage.DATA_TYPE___GET_INHERITED_MEMBERS;

  /**
   * The operation id for the '<em>May Specialize Type</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.DATA_TYPE___MAY_SPECIALIZE_TYPE__CLASSIFIER;

  /**
   * The operation id for the '<em>Parents</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___PARENTS = UMLPackage.DATA_TYPE___PARENTS;

  /**
   * The operation id for the '<em>Create Owned Attribute</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

  /**
   * The operation id for the '<em>Create Owned Operation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

  /**
   * The number of operations of the '<em>Quantity Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_KIND_OPERATION_COUNT = UMLPackage.DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.DimensionImpl <em>Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.DimensionImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getDimension()
   * @generated
   */
  int DIMENSION = 2;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION__QUANTITY = 0;

  /**
   * The feature id for the '<em><b>Magnitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION__MAGNITUDE = 1;

  /**
   * The number of structural features of the '<em>Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.UnitImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 3;

  /**
   * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__QUANTITY_KIND = OM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = OM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_OPERATION_COUNT = OM_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.ObseravtionImpl <em>Obseravtion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.ObseravtionImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getObseravtion()
   * @generated
   */
  int OBSERAVTION = 4;

  /**
   * The number of structural features of the '<em>Obseravtion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERAVTION_FEATURE_COUNT = OM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Obseravtion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERAVTION_OPERATION_COUNT = OM_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.MeasureImpl <em>Measure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.MeasureImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getMeasure()
   * @generated
   */
  int MEASURE = 5;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE__PROPERTY = OM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE__UNIT = OM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Measure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_FEATURE_COUNT = OM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Measure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_OPERATION_COUNT = OM_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.mm.om.impl.DataSetImpl <em>Data Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.mm.om.impl.DataSetImpl
   * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getDataSet()
   * @generated
   */
  int DATA_SET = 6;

  /**
   * The feature id for the '<em><b>Measures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SET__MEASURES = 0;

  /**
   * The number of structural features of the '<em>Data Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SET_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Data Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SET_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.OmElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.ollabaca.on.mm.om.OmElement
   * @generated
   */
  EClass getOmElement();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.QuantityKind <em>Quantity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantity Kind</em>'.
   * @see org.ollabaca.on.mm.om.QuantityKind
   * @generated
   */
  EClass getQuantityKind();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.mm.om.QuantityKind#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimension</em>'.
   * @see org.ollabaca.on.mm.om.QuantityKind#getDimension()
   * @see #getQuantityKind()
   * @generated
   */
  EReference getQuantityKind_Dimension();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.Dimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension</em>'.
   * @see org.ollabaca.on.mm.om.Dimension
   * @generated
   */
  EClass getDimension();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.mm.om.Dimension#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Quantity</em>'.
   * @see org.ollabaca.on.mm.om.Dimension#getQuantity()
   * @see #getDimension()
   * @generated
   */
  EReference getDimension_Quantity();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.mm.om.Dimension#getMagnitude <em>Magnitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magnitude</em>'.
   * @see org.ollabaca.on.mm.om.Dimension#getMagnitude()
   * @see #getDimension()
   * @generated
   */
  EAttribute getDimension_Magnitude();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see org.ollabaca.on.mm.om.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.mm.om.Unit#getQuantityKind <em>Quantity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Quantity Kind</em>'.
   * @see org.ollabaca.on.mm.om.Unit#getQuantityKind()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_QuantityKind();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.Obseravtion <em>Obseravtion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Obseravtion</em>'.
   * @see org.ollabaca.on.mm.om.Obseravtion
   * @generated
   */
  EClass getObseravtion();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.Measure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure</em>'.
   * @see org.ollabaca.on.mm.om.Measure
   * @generated
   */
  EClass getMeasure();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.mm.om.Measure#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.ollabaca.on.mm.om.Measure#getProperty()
   * @see #getMeasure()
   * @generated
   */
  EReference getMeasure_Property();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.mm.om.Measure#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see org.ollabaca.on.mm.om.Measure#getUnit()
   * @see #getMeasure()
   * @generated
   */
  EReference getMeasure_Unit();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.mm.om.DataSet <em>Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set</em>'.
   * @see org.ollabaca.on.mm.om.DataSet
   * @generated
   */
  EClass getDataSet();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.mm.om.DataSet#getMeasures <em>Measures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measures</em>'.
   * @see org.ollabaca.on.mm.om.DataSet#getMeasures()
   * @see #getDataSet()
   * @generated
   */
  EReference getDataSet_Measures();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OmFactory getOmFactory();

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
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.OmElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.OmElementImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getOmElement()
     * @generated
     */
    EClass OM_ELEMENT = eINSTANCE.getOmElement();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.QuantityKindImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getQuantityKind()
     * @generated
     */
    EClass QUANTITY_KIND = eINSTANCE.getQuantityKind();

    /**
     * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITY_KIND__DIMENSION = eINSTANCE.getQuantityKind_Dimension();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.DimensionImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getDimension()
     * @generated
     */
    EClass DIMENSION = eINSTANCE.getDimension();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION__QUANTITY = eINSTANCE.getDimension_Quantity();

    /**
     * The meta object literal for the '<em><b>Magnitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION__MAGNITUDE = eINSTANCE.getDimension_Magnitude();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.UnitImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '<em><b>Quantity Kind</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__QUANTITY_KIND = eINSTANCE.getUnit_QuantityKind();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.ObseravtionImpl <em>Obseravtion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.ObseravtionImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getObseravtion()
     * @generated
     */
    EClass OBSERAVTION = eINSTANCE.getObseravtion();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.MeasureImpl <em>Measure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.MeasureImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getMeasure()
     * @generated
     */
    EClass MEASURE = eINSTANCE.getMeasure();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASURE__PROPERTY = eINSTANCE.getMeasure_Property();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASURE__UNIT = eINSTANCE.getMeasure_Unit();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.mm.om.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.mm.om.impl.DataSetImpl
     * @see org.ollabaca.on.mm.om.impl.OmPackageImpl#getDataSet()
     * @generated
     */
    EClass DATA_SET = eINSTANCE.getDataSet();

    /**
     * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET__MEASURES = eINSTANCE.getDataSet_Measures();

  }

} //OmPackage
