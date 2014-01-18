/**
 */
package org.ollabaca.on.mm.gtbr.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.ollabaca.on.mm.gtbr.Debit;
import org.ollabaca.on.mm.gtbr.GtbrPackage;
import org.ollabaca.on.mm.gtbr.Record;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DebitImpl extends RecordImpl implements Debit
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DebitImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GtbrPackage.Literals.DEBIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double apply(final double balance)
  {
    double _amount = this.getAmount();
    return (balance - _amount);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
    if (baseClass == Record.class)
    {
      switch (baseOperationID)
      {
        case GtbrPackage.RECORD___APPLY__DOUBLE: return GtbrPackage.DEBIT___APPLY__DOUBLE;
        default: return super.eDerivedOperationID(baseOperationID, baseClass);
      }
    }
    return super.eDerivedOperationID(baseOperationID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case GtbrPackage.DEBIT___APPLY__DOUBLE:
        return apply((Double)arguments.get(0));
    }
    return super.eInvoke(operationID, arguments);
  }

} //DebitImpl
