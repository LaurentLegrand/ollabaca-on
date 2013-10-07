/**
 */
package org.ollabaca.on.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ollabaca.on";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = org.ollabaca.on.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.UnitImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__PARENT = 1;

  /**
   * The feature id for the '<em><b>Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__CONTAINER = 2;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__INSTANCES = 3;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.ValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getValue()
   * @generated
   */
  int VALUE = 1;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.LiteralImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 2;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.ImportImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.ContainerImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 4;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.InstanceImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 5;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TITLE = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ABSTRACT = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__DOCUMENTATION = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Abbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ABBR = VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>See</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__SEE = VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TAGS = VALUE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = VALUE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = VALUE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Slots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__SLOTS = VALUE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.SlotImpl <em>Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.SlotImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getSlot()
   * @generated
   */
  int SLOT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Slot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.ArrayImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.StringValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.BooleanValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.NullValueImpl <em>Null Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.NullValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getNullValue()
   * @generated
   */
  int NULL_VALUE = 10;

  /**
   * The number of structural features of the '<em>Null Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.NumberValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.InstanceRefImpl <em>Instance Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.InstanceRefImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getInstanceRef()
   * @generated
   */
  int INSTANCE_REF = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_REF__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_REF_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ollabaca.on.model.impl.EnumValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.model.impl.EnumValueImpl
   * @see org.ollabaca.on.model.impl.ModelPackageImpl#getEnumValue()
   * @generated
   */
  int ENUM_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see org.ollabaca.on.model.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.model.Unit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.ollabaca.on.model.Unit#getImports()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Imports();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.model.Unit#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.ollabaca.on.model.Unit#getParent()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Parent();

  /**
   * Returns the meta object for the containment reference '{@link org.ollabaca.on.model.Unit#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Container</em>'.
   * @see org.ollabaca.on.model.Unit#getContainer()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Container();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.model.Unit#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.ollabaca.on.model.Unit#getInstances()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Instances();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.ollabaca.on.model.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.ollabaca.on.model.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.ollabaca.on.model.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ollabaca.on.model.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.ollabaca.on.model.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.model.Container#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see org.ollabaca.on.model.Container#getInstance()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Instance();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Container#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see org.ollabaca.on.model.Container#getFeature()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Feature();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.ollabaca.on.model.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.ollabaca.on.model.Instance#getTitle()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Title();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.ollabaca.on.model.Instance#getAbstract()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.ollabaca.on.model.Instance#getDocumentation()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getAbbr <em>Abbr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr</em>'.
   * @see org.ollabaca.on.model.Instance#getAbbr()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Abbr();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.model.Instance#getSee <em>See</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>See</em>'.
   * @see org.ollabaca.on.model.Instance#getSee()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_See();

  /**
   * Returns the meta object for the attribute list '{@link org.ollabaca.on.model.Instance#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see org.ollabaca.on.model.Instance#getTags()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Tags();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ollabaca.on.model.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.ollabaca.on.model.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.model.Instance#getSlots <em>Slots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Slots</em>'.
   * @see org.ollabaca.on.model.Instance#getSlots()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Slots();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Slot <em>Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slot</em>'.
   * @see org.ollabaca.on.model.Slot
   * @generated
   */
  EClass getSlot();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.Slot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ollabaca.on.model.Slot#getName()
   * @see #getSlot()
   * @generated
   */
  EAttribute getSlot_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ollabaca.on.model.Slot#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ollabaca.on.model.Slot#getValue()
   * @see #getSlot()
   * @generated
   */
  EReference getSlot_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see org.ollabaca.on.model.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.model.Array#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.ollabaca.on.model.Array#getValue()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.ollabaca.on.model.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ollabaca.on.model.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.ollabaca.on.model.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ollabaca.on.model.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.NullValue <em>Null Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Value</em>'.
   * @see org.ollabaca.on.model.NullValue
   * @generated
   */
  EClass getNullValue();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see org.ollabaca.on.model.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.NumberValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ollabaca.on.model.NumberValue#getValue()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.InstanceRef <em>Instance Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Ref</em>'.
   * @see org.ollabaca.on.model.InstanceRef
   * @generated
   */
  EClass getInstanceRef();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.model.InstanceRef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.ollabaca.on.model.InstanceRef#getValue()
   * @see #getInstanceRef()
   * @generated
   */
  EReference getInstanceRef_Value();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.model.EnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see org.ollabaca.on.model.EnumValue
   * @generated
   */
  EClass getEnumValue();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.model.EnumValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ollabaca.on.model.EnumValue#getValue()
   * @see #getEnumValue()
   * @generated
   */
  EAttribute getEnumValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.UnitImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__IMPORTS = eINSTANCE.getUnit_Imports();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__PARENT = eINSTANCE.getUnit_Parent();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__CONTAINER = eINSTANCE.getUnit_Container();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__INSTANCES = eINSTANCE.getUnit_Instances();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.ValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.LiteralImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.ImportImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.ContainerImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__INSTANCE = eINSTANCE.getContainer_Instance();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__FEATURE = eINSTANCE.getContainer_Feature();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.InstanceImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__TITLE = eINSTANCE.getInstance_Title();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__ABSTRACT = eINSTANCE.getInstance_Abstract();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__DOCUMENTATION = eINSTANCE.getInstance_Documentation();

    /**
     * The meta object literal for the '<em><b>Abbr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__ABBR = eINSTANCE.getInstance_Abbr();

    /**
     * The meta object literal for the '<em><b>See</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__SEE = eINSTANCE.getInstance_See();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__TAGS = eINSTANCE.getInstance_Tags();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__SLOTS = eINSTANCE.getInstance_Slots();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.SlotImpl <em>Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.SlotImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getSlot()
     * @generated
     */
    EClass SLOT = eINSTANCE.getSlot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLOT__NAME = eINSTANCE.getSlot_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT__VALUE = eINSTANCE.getSlot_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.ArrayImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__VALUE = eINSTANCE.getArray_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.StringValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.BooleanValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.NullValueImpl <em>Null Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.NullValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getNullValue()
     * @generated
     */
    EClass NULL_VALUE = eINSTANCE.getNullValue();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.NumberValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.InstanceRefImpl <em>Instance Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.InstanceRefImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getInstanceRef()
     * @generated
     */
    EClass INSTANCE_REF = eINSTANCE.getInstanceRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_REF__VALUE = eINSTANCE.getInstanceRef_Value();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.model.impl.EnumValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.model.impl.EnumValueImpl
     * @see org.ollabaca.on.model.impl.ModelPackageImpl#getEnumValue()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getEnumValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

  }

} //ModelPackage
