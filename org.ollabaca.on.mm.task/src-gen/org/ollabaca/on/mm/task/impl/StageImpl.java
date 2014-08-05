/**
 */
package org.ollabaca.on.mm.task.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.ollabaca.on.mm.task.Stage;
import org.ollabaca.on.mm.task.TaskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.impl.StageImpl#getNestedStages <em>Nested Stages</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.StageImpl#getNestingStage <em>Nesting Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StageImpl extends NamedElementImpl implements Stage {
	/**
	 * The cached value of the '{@link #getNestedStages() <em>Nested Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> nestedStages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getNestedStages() {
		if (nestedStages == null) {
			nestedStages = new EObjectContainmentWithInverseEList<Stage>(Stage.class, this, TaskPackage.STAGE__NESTED_STAGES, TaskPackage.STAGE__NESTING_STAGE);
		}
		return nestedStages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getNestingStage() {
		if (eContainerFeatureID() != TaskPackage.STAGE__NESTING_STAGE) return null;
		return (Stage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetNestingStage() {
		if (eContainerFeatureID() != TaskPackage.STAGE__NESTING_STAGE) return null;
		return (Stage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingStage(Stage newNestingStage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingStage, TaskPackage.STAGE__NESTING_STAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingStage(Stage newNestingStage) {
		if (newNestingStage != eInternalContainer() || (eContainerFeatureID() != TaskPackage.STAGE__NESTING_STAGE && newNestingStage != null)) {
			if (EcoreUtil.isAncestor(this, newNestingStage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingStage != null)
				msgs = ((InternalEObject)newNestingStage).eInverseAdd(this, TaskPackage.STAGE__NESTED_STAGES, Stage.class, msgs);
			msgs = basicSetNestingStage(newNestingStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STAGE__NESTING_STAGE, newNestingStage, newNestingStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedStages()).basicAdd(otherEnd, msgs);
			case TaskPackage.STAGE__NESTING_STAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingStage((Stage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				return ((InternalEList<?>)getNestedStages()).basicRemove(otherEnd, msgs);
			case TaskPackage.STAGE__NESTING_STAGE:
				return basicSetNestingStage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TaskPackage.STAGE__NESTING_STAGE:
				return eInternalContainer().eInverseRemove(this, TaskPackage.STAGE__NESTED_STAGES, Stage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				return getNestedStages();
			case TaskPackage.STAGE__NESTING_STAGE:
				if (resolve) return getNestingStage();
				return basicGetNestingStage();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				getNestedStages().clear();
				getNestedStages().addAll((Collection<? extends Stage>)newValue);
				return;
			case TaskPackage.STAGE__NESTING_STAGE:
				setNestingStage((Stage)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				getNestedStages().clear();
				return;
			case TaskPackage.STAGE__NESTING_STAGE:
				setNestingStage((Stage)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskPackage.STAGE__NESTED_STAGES:
				return nestedStages != null && !nestedStages.isEmpty();
			case TaskPackage.STAGE__NESTING_STAGE:
				return basicGetNestingStage() != null;
		}
		return super.eIsSet(featureID);
	}

} //StageImpl
