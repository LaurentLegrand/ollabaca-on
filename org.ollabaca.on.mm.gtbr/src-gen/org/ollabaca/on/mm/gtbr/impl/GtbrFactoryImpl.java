/**
 */
package org.ollabaca.on.mm.gtbr.impl;

import com.google.common.base.Objects;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.mm.gtbr.*;

import org.ollabaca.on.mm.gtbr.util.Dates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtbrFactoryImpl extends EFactoryImpl implements GtbrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GtbrFactory init()
  {
    try
    {
      GtbrFactory theGtbrFactory = (GtbrFactory)EPackage.Registry.INSTANCE.getEFactory(GtbrPackage.eNS_URI);
      if (theGtbrFactory != null)
      {
        return theGtbrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GtbrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GtbrFactoryImpl()
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
      case GtbrPackage.ACCOUNT: return createAccount();
      case GtbrPackage.DEBIT: return createDebit();
      case GtbrPackage.CREDIT: return createCredit();
      case GtbrPackage.TRANSFER: return createTransfer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GtbrPackage.DATE:
        return createDateFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GtbrPackage.DATE:
        return convertDateToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account createAccount()
  {
    AccountImpl account = new AccountImpl();
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Debit createDebit()
  {
    DebitImpl debit = new DebitImpl();
    return debit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Credit createCredit()
  {
    CreditImpl credit = new CreditImpl();
    return credit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transfer createTransfer()
  {
    TransferImpl transfer = new TransferImpl();
    return transfer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate(final String it)
  {
    Date _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals)
    {
      Date _fromString = Dates.fromString(it);
      _xifexpression = _fromString;
    }
    return _xifexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDateFromString(EDataType eDataType, String initialValue)
  {
    return createDate(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDate(final Date it)
  {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals)
    {
      String _string = Dates.toString(it);
      _xifexpression = _string;
    }
    return _xifexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDateToString(EDataType eDataType, Object instanceValue)
  {
    return convertDate((Date)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GtbrPackage getGtbrPackage()
  {
    return (GtbrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GtbrPackage getPackage()
  {
    return GtbrPackage.eINSTANCE;
  }

} //GtbrFactoryImpl
