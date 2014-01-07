/**
 */
package org.ollabaca.on.uml.om.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.uml.om.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmFactoryImpl extends EFactoryImpl implements OmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OmFactory init()
  {
    try
    {
      OmFactory theOmFactory = (OmFactory)EPackage.Registry.INSTANCE.getEFactory(OmPackage.eNS_URI);
      if (theOmFactory != null)
      {
        return theOmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OmPackage.OM_ELEMENT: return createOmElement();
      case OmPackage.QUANTITY_KIND: return createQuantityKind();
      case OmPackage.DIMENSION: return createDimension();
      case OmPackage.UNIT: return createUnit();
      case OmPackage.OBSERAVTION: return createObseravtion();
      case OmPackage.MEASURE: return createMeasure();
      case OmPackage.DATA_SET: return createDataSet();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmElement createOmElement()
  {
    OmElementImpl omElement = new OmElementImpl();
    return omElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantityKind createQuantityKind()
  {
    QuantityKindImpl quantityKind = new QuantityKindImpl();
    return quantityKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimension createDimension()
  {
    DimensionImpl dimension = new DimensionImpl();
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Obseravtion createObseravtion()
  {
    ObseravtionImpl obseravtion = new ObseravtionImpl();
    return obseravtion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measure createMeasure()
  {
    MeasureImpl measure = new MeasureImpl();
    return measure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSet createDataSet()
  {
    DataSetImpl dataSet = new DataSetImpl();
    return dataSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmPackage getOmPackage()
  {
    return (OmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OmPackage getPackage()
  {
    return OmPackage.eINSTANCE;
  }

} //OmFactoryImpl
