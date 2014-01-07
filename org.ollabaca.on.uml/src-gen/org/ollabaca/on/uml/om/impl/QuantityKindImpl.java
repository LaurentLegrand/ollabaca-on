/**
 */
package org.ollabaca.on.uml.om.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.DataTypeImpl;

import org.ollabaca.on.uml.om.Dimension;
import org.ollabaca.on.uml.om.OmPackage;
import org.ollabaca.on.uml.om.QuantityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.om.impl.QuantityKindImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantityKindImpl extends DataTypeImpl implements QuantityKind
{
  /**
   * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimension()
   * @generated
   * @ordered
   */
  protected EList<Dimension> dimension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantityKindImpl()
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
    return OmPackage.Literals.QUANTITY_KIND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dimension> getDimension()
  {
    if (dimension == null)
    {
      dimension = new EObjectContainmentEList<Dimension>(Dimension.class, this, OmPackage.QUANTITY_KIND__DIMENSION);
    }
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OmPackage.QUANTITY_KIND__DIMENSION:
        return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OmPackage.QUANTITY_KIND__DIMENSION:
        return getDimension();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OmPackage.QUANTITY_KIND__DIMENSION:
        getDimension().clear();
        getDimension().addAll((Collection<? extends Dimension>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OmPackage.QUANTITY_KIND__DIMENSION:
        getDimension().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OmPackage.QUANTITY_KIND__DIMENSION:
        return dimension != null && !dimension.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QuantityKindImpl
