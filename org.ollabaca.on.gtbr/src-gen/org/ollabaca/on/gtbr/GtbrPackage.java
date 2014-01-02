/**
 */
package org.ollabaca.on.gtbr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.ollabaca.on.gtbr.GtbrFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on'"
 * @generated
 */
public interface GtbrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gtbr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ollabaca.on.gtbr";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gtbr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GtbrPackage eINSTANCE = org.ollabaca.on.gtbr.impl.GtbrPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.AccountingElementImpl <em>Accounting Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.AccountingElementImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccountingElement()
   * @generated
   */
  int ACCOUNTING_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__EANNOTATIONS = UMLPackage.PACKAGEABLE_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__OWNED_COMMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__OWNED_ELEMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__OWNER = UMLPackage.PACKAGEABLE_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__CLIENT_DEPENDENCY = UMLPackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__NAME = UMLPackage.PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__NAME_EXPRESSION = UMLPackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__VISIBILITY = UMLPackage.PACKAGEABLE_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__OWNING_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT__TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Accounting Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT_FEATURE_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___ADD_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___CREATE_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___DESTROY = UMLPackage.PACKAGEABLE_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_KEYWORDS = UMLPackage.PACKAGEABLE_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_MODEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_NEAREST_PACKAGE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___HAS_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___REMOVE_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PACKAGEABLE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___ALL_OWNED_ELEMENTS = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___MUST_BE_OWNED = UMLPackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_LABEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_LABEL__BOOLEAN = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___ALL_NAMESPACES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___ALL_OWNING_PACKAGES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___GET_QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___SEPARATOR = UMLPackage.PACKAGEABLE_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT___IS_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Accounting Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_ELEMENT_OPERATION_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.AccountImpl <em>Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.AccountImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccount()
   * @generated
   */
  int ACCOUNT = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__EANNOTATIONS = UMLPackage.NAMED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__OWNED_COMMENT = UMLPackage.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__OWNED_ELEMENT = UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__OWNER = UMLPackage.NAMED_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__CLIENT_DEPENDENCY = UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__NAME = UMLPackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__NAME_EXPRESSION = UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__NAMESPACE = UMLPackage.NAMED_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__VISIBILITY = UMLPackage.NAMED_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__OWNING_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Institution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__INSTITUTION = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Holder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__HOLDER = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__OPERATIONS = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Balance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__BALANCE = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_FEATURE_COUNT = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___ADD_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___CREATE_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___DESTROY = UMLPackage.NAMED_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_KEYWORDS = UMLPackage.NAMED_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLICABLE_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLIED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_MODEL = UMLPackage.NAMED_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_NEAREST_PACKAGE = UMLPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_REQUIRED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___HAS_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___REMOVE_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___ALL_OWNED_ELEMENTS = UMLPackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___MUST_BE_OWNED = UMLPackage.NAMED_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_LABEL = UMLPackage.NAMED_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_LABEL__BOOLEAN = UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___ALL_NAMESPACES = UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___ALL_OWNING_PACKAGES = UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_NAMESPACE = UMLPackage.NAMED_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___GET_QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___SEPARATOR = UMLPackage.NAMED_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT___IS_TEMPLATE_PARAMETER = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_OPERATION_COUNT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.AccountingOperationImpl <em>Accounting Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.AccountingOperationImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccountingOperation()
   * @generated
   */
  int ACCOUNTING_OPERATION = 2;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__EANNOTATIONS = ACCOUNTING_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__OWNED_COMMENT = ACCOUNTING_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__OWNED_ELEMENT = ACCOUNTING_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__OWNER = ACCOUNTING_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__CLIENT_DEPENDENCY = ACCOUNTING_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__NAME = ACCOUNTING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__NAME_EXPRESSION = ACCOUNTING_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__NAMESPACE = ACCOUNTING_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__QUALIFIED_NAME = ACCOUNTING_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__VISIBILITY = ACCOUNTING_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__OWNING_TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__ACCOUNT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__DATE = ACCOUNTING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION__AMOUNT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Accounting Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION_FEATURE_COUNT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_EANNOTATION__STRING = ACCOUNTING_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___ADD_KEYWORD__STRING = ACCOUNTING_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___APPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___CREATE_EANNOTATION__STRING = ACCOUNTING_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___DESTROY = ACCOUNTING_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_KEYWORDS = ACCOUNTING_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPES = ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPES = ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_MODEL = ACCOUNTING_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_NEAREST_PACKAGE = ACCOUNTING_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPES = ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATIONS = ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_VALUE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___HAS_KEYWORD__STRING = ACCOUNTING_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___HAS_VALUE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___REMOVE_KEYWORD__STRING = ACCOUNTING_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT = ACCOUNTING_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___ALL_OWNED_ELEMENTS = ACCOUNTING_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___MUST_BE_OWNED = ACCOUNTING_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT = ACCOUNTING_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___CREATE_USAGE__NAMEDELEMENT = ACCOUNTING_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_LABEL = ACCOUNTING_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_LABEL__BOOLEAN = ACCOUNTING_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___ALL_NAMESPACES = ACCOUNTING_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___ALL_OWNING_PACKAGES = ACCOUNTING_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACCOUNTING_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_NAMESPACE = ACCOUNTING_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___GET_QUALIFIED_NAME = ACCOUNTING_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___SEPARATOR = ACCOUNTING_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ACCOUNTING_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION___IS_TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Accounting Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_OPERATION_OPERATION_COUNT = ACCOUNTING_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.DebitImpl <em>Debit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.DebitImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getDebit()
   * @generated
   */
  int DEBIT = 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__EANNOTATIONS = ACCOUNTING_OPERATION__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__OWNED_COMMENT = ACCOUNTING_OPERATION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__OWNED_ELEMENT = ACCOUNTING_OPERATION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__OWNER = ACCOUNTING_OPERATION__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__CLIENT_DEPENDENCY = ACCOUNTING_OPERATION__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__NAME = ACCOUNTING_OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__NAME_EXPRESSION = ACCOUNTING_OPERATION__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__NAMESPACE = ACCOUNTING_OPERATION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__QUALIFIED_NAME = ACCOUNTING_OPERATION__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__VISIBILITY = ACCOUNTING_OPERATION__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__OWNING_TEMPLATE_PARAMETER = ACCOUNTING_OPERATION__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__TEMPLATE_PARAMETER = ACCOUNTING_OPERATION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__ACCOUNT = ACCOUNTING_OPERATION__ACCOUNT;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__DATE = ACCOUNTING_OPERATION__DATE;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT__AMOUNT = ACCOUNTING_OPERATION__AMOUNT;

  /**
   * The number of structural features of the '<em>Debit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT_FEATURE_COUNT = ACCOUNTING_OPERATION_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_EANNOTATION__STRING = ACCOUNTING_OPERATION___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___ADD_KEYWORD__STRING = ACCOUNTING_OPERATION___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___APPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_OPERATION___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___CREATE_EANNOTATION__STRING = ACCOUNTING_OPERATION___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___DESTROY = ACCOUNTING_OPERATION___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_KEYWORDS = ACCOUNTING_OPERATION___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLICABLE_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLICABLE_STEREOTYPES = ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLIED_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLIED_STEREOTYPES = ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_MODEL = ACCOUNTING_OPERATION___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_NEAREST_PACKAGE = ACCOUNTING_OPERATION___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_REQUIRED_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_REQUIRED_STEREOTYPES = ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_SOURCE_DIRECTED_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_STEREOTYPE_APPLICATIONS = ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_TARGET_DIRECTED_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_VALUE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___HAS_KEYWORD__STRING = ACCOUNTING_OPERATION___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___HAS_VALUE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_STEREOTYPE_APPLIED__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___REMOVE_KEYWORD__STRING = ACCOUNTING_OPERATION___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___SET_VALUE__STEREOTYPE_STRING_OBJECT = ACCOUNTING_OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___UNAPPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___ALL_OWNED_ELEMENTS = ACCOUNTING_OPERATION___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___MUST_BE_OWNED = ACCOUNTING_OPERATION___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___CREATE_DEPENDENCY__NAMEDELEMENT = ACCOUNTING_OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___CREATE_USAGE__NAMEDELEMENT = ACCOUNTING_OPERATION___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_LABEL = ACCOUNTING_OPERATION___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_LABEL__BOOLEAN = ACCOUNTING_OPERATION___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___ALL_NAMESPACES = ACCOUNTING_OPERATION___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___ALL_OWNING_PACKAGES = ACCOUNTING_OPERATION___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACCOUNTING_OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_NAMESPACE = ACCOUNTING_OPERATION___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___GET_QUALIFIED_NAME = ACCOUNTING_OPERATION___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___SEPARATOR = ACCOUNTING_OPERATION___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ACCOUNTING_OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT___IS_TEMPLATE_PARAMETER = ACCOUNTING_OPERATION___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Debit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBIT_OPERATION_COUNT = ACCOUNTING_OPERATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.CreditImpl <em>Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.CreditImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getCredit()
   * @generated
   */
  int CREDIT = 4;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__EANNOTATIONS = ACCOUNTING_OPERATION__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__OWNED_COMMENT = ACCOUNTING_OPERATION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__OWNED_ELEMENT = ACCOUNTING_OPERATION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__OWNER = ACCOUNTING_OPERATION__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__CLIENT_DEPENDENCY = ACCOUNTING_OPERATION__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__NAME = ACCOUNTING_OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__NAME_EXPRESSION = ACCOUNTING_OPERATION__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__NAMESPACE = ACCOUNTING_OPERATION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__QUALIFIED_NAME = ACCOUNTING_OPERATION__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__VISIBILITY = ACCOUNTING_OPERATION__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__OWNING_TEMPLATE_PARAMETER = ACCOUNTING_OPERATION__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__TEMPLATE_PARAMETER = ACCOUNTING_OPERATION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__ACCOUNT = ACCOUNTING_OPERATION__ACCOUNT;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__DATE = ACCOUNTING_OPERATION__DATE;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__AMOUNT = ACCOUNTING_OPERATION__AMOUNT;

  /**
   * The number of structural features of the '<em>Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_FEATURE_COUNT = ACCOUNTING_OPERATION_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_EANNOTATION__STRING = ACCOUNTING_OPERATION___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___ADD_KEYWORD__STRING = ACCOUNTING_OPERATION___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___APPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_OPERATION___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___CREATE_EANNOTATION__STRING = ACCOUNTING_OPERATION___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___DESTROY = ACCOUNTING_OPERATION___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_KEYWORDS = ACCOUNTING_OPERATION___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLICABLE_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLICABLE_STEREOTYPES = ACCOUNTING_OPERATION___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLIED_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLIED_STEREOTYPES = ACCOUNTING_OPERATION___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = ACCOUNTING_OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_MODEL = ACCOUNTING_OPERATION___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_NEAREST_PACKAGE = ACCOUNTING_OPERATION___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_REQUIRED_STEREOTYPE__STRING = ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_REQUIRED_STEREOTYPES = ACCOUNTING_OPERATION___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_SOURCE_DIRECTED_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_STEREOTYPE_APPLICATIONS = ACCOUNTING_OPERATION___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_TARGET_DIRECTED_RELATIONSHIPS = ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_VALUE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___HAS_KEYWORD__STRING = ACCOUNTING_OPERATION___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___HAS_VALUE__STEREOTYPE_STRING = ACCOUNTING_OPERATION___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_STEREOTYPE_APPLIED__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = ACCOUNTING_OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___REMOVE_KEYWORD__STRING = ACCOUNTING_OPERATION___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___SET_VALUE__STEREOTYPE_STRING_OBJECT = ACCOUNTING_OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___UNAPPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___ALL_OWNED_ELEMENTS = ACCOUNTING_OPERATION___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___MUST_BE_OWNED = ACCOUNTING_OPERATION___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = ACCOUNTING_OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___CREATE_DEPENDENCY__NAMEDELEMENT = ACCOUNTING_OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___CREATE_USAGE__NAMEDELEMENT = ACCOUNTING_OPERATION___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_LABEL = ACCOUNTING_OPERATION___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_LABEL__BOOLEAN = ACCOUNTING_OPERATION___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___ALL_NAMESPACES = ACCOUNTING_OPERATION___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___ALL_OWNING_PACKAGES = ACCOUNTING_OPERATION___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACCOUNTING_OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_NAMESPACE = ACCOUNTING_OPERATION___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___GET_QUALIFIED_NAME = ACCOUNTING_OPERATION___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___SEPARATOR = ACCOUNTING_OPERATION___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ACCOUNTING_OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT___IS_TEMPLATE_PARAMETER = ACCOUNTING_OPERATION___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_OPERATION_COUNT = ACCOUNTING_OPERATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.gtbr.impl.TransferImpl <em>Transfer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.gtbr.impl.TransferImpl
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getTransfer()
   * @generated
   */
  int TRANSFER = 5;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__EANNOTATIONS = ACCOUNTING_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__OWNED_COMMENT = ACCOUNTING_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__OWNED_ELEMENT = ACCOUNTING_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__OWNER = ACCOUNTING_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__CLIENT_DEPENDENCY = ACCOUNTING_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__NAME = ACCOUNTING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__NAME_EXPRESSION = ACCOUNTING_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__NAMESPACE = ACCOUNTING_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__QUALIFIED_NAME = ACCOUNTING_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__VISIBILITY = ACCOUNTING_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__OWNING_TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__DATE = ACCOUNTING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__AMOUNT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__FROM = ACCOUNTING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__TO = ACCOUNTING_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Debit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__DEBIT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Credit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER__CREDIT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Transfer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER_FEATURE_COUNT = ACCOUNTING_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_EANNOTATION__STRING = ACCOUNTING_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___ADD_KEYWORD__STRING = ACCOUNTING_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___APPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___CREATE_EANNOTATION__STRING = ACCOUNTING_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___DESTROY = ACCOUNTING_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_KEYWORDS = ACCOUNTING_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLICABLE_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLICABLE_STEREOTYPES = ACCOUNTING_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLIED_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLIED_STEREOTYPES = ACCOUNTING_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = ACCOUNTING_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_MODEL = ACCOUNTING_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_NEAREST_PACKAGE = ACCOUNTING_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_REQUIRED_STEREOTYPE__STRING = ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_REQUIRED_STEREOTYPES = ACCOUNTING_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_SOURCE_DIRECTED_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_STEREOTYPE_APPLICATIONS = ACCOUNTING_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_TARGET_DIRECTED_RELATIONSHIPS = ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = ACCOUNTING_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_VALUE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___HAS_KEYWORD__STRING = ACCOUNTING_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___HAS_VALUE__STEREOTYPE_STRING = ACCOUNTING_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_STEREOTYPE_APPLIED__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = ACCOUNTING_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___REMOVE_KEYWORD__STRING = ACCOUNTING_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___SET_VALUE__STEREOTYPE_STRING_OBJECT = ACCOUNTING_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___UNAPPLY_STEREOTYPE__STEREOTYPE = ACCOUNTING_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___ALL_OWNED_ELEMENTS = ACCOUNTING_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___MUST_BE_OWNED = ACCOUNTING_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = ACCOUNTING_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___CREATE_DEPENDENCY__NAMEDELEMENT = ACCOUNTING_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___CREATE_USAGE__NAMEDELEMENT = ACCOUNTING_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_LABEL = ACCOUNTING_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_LABEL__BOOLEAN = ACCOUNTING_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___ALL_NAMESPACES = ACCOUNTING_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___ALL_OWNING_PACKAGES = ACCOUNTING_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACCOUNTING_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_NAMESPACE = ACCOUNTING_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___GET_QUALIFIED_NAME = ACCOUNTING_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___SEPARATOR = ACCOUNTING_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ACCOUNTING_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER___IS_TEMPLATE_PARAMETER = ACCOUNTING_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Transfer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFER_OPERATION_COUNT = ACCOUNTING_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '<em>Date</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Date
   * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getDate()
   * @generated
   */
  int DATE = 6;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.AccountingElement <em>Accounting Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accounting Element</em>'.
   * @see org.ollabaca.on.gtbr.AccountingElement
   * @generated
   */
  EClass getAccountingElement();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account</em>'.
   * @see org.ollabaca.on.gtbr.Account
   * @generated
   */
  EClass getAccount();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.gtbr.Account#getInstitution <em>Institution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Institution</em>'.
   * @see org.ollabaca.on.gtbr.Account#getInstitution()
   * @see #getAccount()
   * @generated
   */
  EReference getAccount_Institution();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.gtbr.Account#getHolder <em>Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Holder</em>'.
   * @see org.ollabaca.on.gtbr.Account#getHolder()
   * @see #getAccount()
   * @generated
   */
  EReference getAccount_Holder();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.gtbr.Account#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Operations</em>'.
   * @see org.ollabaca.on.gtbr.Account#getOperations()
   * @see #getAccount()
   * @generated
   */
  EReference getAccount_Operations();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.gtbr.Account#getBalance <em>Balance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Balance</em>'.
   * @see org.ollabaca.on.gtbr.Account#getBalance()
   * @see #getAccount()
   * @generated
   */
  EAttribute getAccount_Balance();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.AccountingOperation <em>Accounting Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accounting Operation</em>'.
   * @see org.ollabaca.on.gtbr.AccountingOperation
   * @generated
   */
  EClass getAccountingOperation();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.gtbr.AccountingOperation#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see org.ollabaca.on.gtbr.AccountingOperation#getAccount()
   * @see #getAccountingOperation()
   * @generated
   */
  EReference getAccountingOperation_Account();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.gtbr.AccountingOperation#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.ollabaca.on.gtbr.AccountingOperation#getDate()
   * @see #getAccountingOperation()
   * @generated
   */
  EAttribute getAccountingOperation_Date();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.gtbr.AccountingOperation#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see org.ollabaca.on.gtbr.AccountingOperation#getAmount()
   * @see #getAccountingOperation()
   * @generated
   */
  EAttribute getAccountingOperation_Amount();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.Debit <em>Debit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Debit</em>'.
   * @see org.ollabaca.on.gtbr.Debit
   * @generated
   */
  EClass getDebit();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.Credit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credit</em>'.
   * @see org.ollabaca.on.gtbr.Credit
   * @generated
   */
  EClass getCredit();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.gtbr.Transfer <em>Transfer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transfer</em>'.
   * @see org.ollabaca.on.gtbr.Transfer
   * @generated
   */
  EClass getTransfer();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.gtbr.Transfer#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getDate()
   * @see #getTransfer()
   * @generated
   */
  EAttribute getTransfer_Date();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.gtbr.Transfer#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getAmount()
   * @see #getTransfer()
   * @generated
   */
  EAttribute getTransfer_Amount();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.gtbr.Transfer#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getFrom()
   * @see #getTransfer()
   * @generated
   */
  EReference getTransfer_From();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.gtbr.Transfer#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getTo()
   * @see #getTransfer()
   * @generated
   */
  EReference getTransfer_To();

  /**
   * Returns the meta object for the containment reference '{@link org.ollabaca.on.gtbr.Transfer#getDebit <em>Debit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debit</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getDebit()
   * @see #getTransfer()
   * @generated
   */
  EReference getTransfer_Debit();

  /**
   * Returns the meta object for the containment reference '{@link org.ollabaca.on.gtbr.Transfer#getCredit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credit</em>'.
   * @see org.ollabaca.on.gtbr.Transfer#getCredit()
   * @see #getTransfer()
   * @generated
   */
  EReference getTransfer_Credit();

  /**
   * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Date</em>'.
   * @see java.util.Date
   * @model instanceClass="java.util.Date"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel create='<%java.util.Date%> _xifexpression = null;\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\nif (_notEquals)\n{\n\t<%java.util.Date%> _fromString = <%org.ollabaca.on.gtbr.util.Dates%>.fromString(it);\n\t_xifexpression = _fromString;\n}\nreturn _xifexpression;' convert='<%java.lang.String%> _xifexpression = null;\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\nif (_notEquals)\n{\n\t<%java.lang.String%> _string = <%org.ollabaca.on.gtbr.util.Dates%>.toString(it);\n\t_xifexpression = _string;\n}\nreturn _xifexpression;'"
   * @generated
   */
  EDataType getDate();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GtbrFactory getGtbrFactory();

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
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.AccountingElementImpl <em>Accounting Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.AccountingElementImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccountingElement()
     * @generated
     */
    EClass ACCOUNTING_ELEMENT = eINSTANCE.getAccountingElement();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.AccountImpl <em>Account</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.AccountImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccount()
     * @generated
     */
    EClass ACCOUNT = eINSTANCE.getAccount();

    /**
     * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCOUNT__INSTITUTION = eINSTANCE.getAccount_Institution();

    /**
     * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCOUNT__HOLDER = eINSTANCE.getAccount_Holder();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCOUNT__OPERATIONS = eINSTANCE.getAccount_Operations();

    /**
     * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCOUNT__BALANCE = eINSTANCE.getAccount_Balance();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.AccountingOperationImpl <em>Accounting Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.AccountingOperationImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getAccountingOperation()
     * @generated
     */
    EClass ACCOUNTING_OPERATION = eINSTANCE.getAccountingOperation();

    /**
     * The meta object literal for the '<em><b>Account</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCOUNTING_OPERATION__ACCOUNT = eINSTANCE.getAccountingOperation_Account();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCOUNTING_OPERATION__DATE = eINSTANCE.getAccountingOperation_Date();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCOUNTING_OPERATION__AMOUNT = eINSTANCE.getAccountingOperation_Amount();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.DebitImpl <em>Debit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.DebitImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getDebit()
     * @generated
     */
    EClass DEBIT = eINSTANCE.getDebit();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.CreditImpl <em>Credit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.CreditImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getCredit()
     * @generated
     */
    EClass CREDIT = eINSTANCE.getCredit();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.gtbr.impl.TransferImpl <em>Transfer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.gtbr.impl.TransferImpl
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getTransfer()
     * @generated
     */
    EClass TRANSFER = eINSTANCE.getTransfer();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFER__DATE = eINSTANCE.getTransfer_Date();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFER__AMOUNT = eINSTANCE.getTransfer_Amount();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFER__FROM = eINSTANCE.getTransfer_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFER__TO = eINSTANCE.getTransfer_To();

    /**
     * The meta object literal for the '<em><b>Debit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFER__DEBIT = eINSTANCE.getTransfer_Debit();

    /**
     * The meta object literal for the '<em><b>Credit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFER__CREDIT = eINSTANCE.getTransfer_Credit();

    /**
     * The meta object literal for the '<em>Date</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Date
     * @see org.ollabaca.on.gtbr.impl.GtbrPackageImpl#getDate()
     * @generated
     */
    EDataType DATE = eINSTANCE.getDate();

  }

} //GtbrPackage
