/**
 */
package org.ollabaca.on.mm.org.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.eclipse.uml2.uml.util.UMLValidator;

import org.ollabaca.on.mm.org.Agent;
import org.ollabaca.on.mm.org.Membership;
import org.ollabaca.on.mm.org.OrgElement;
import org.ollabaca.on.mm.org.OrgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.org.impl.AgentImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.AgentImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.AgentImpl#getMemberships <em>Memberships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AgentImpl extends NamedElementImpl implements Agent {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getMemberships() <em>Memberships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberships()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> memberships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID() != OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgPackage.AGENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgPackage.AGENT__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.AGENT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getMemberships() {
		if (memberships == null) {
			memberships = new EObjectWithInverseResolvingEList.ManyInverse<Membership>(Membership.class, this, OrgPackage.AGENT__MEMBERSHIPS, OrgPackage.MEMBERSHIP__MEMBERS);
		}
		return memberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceNeedsVisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.PACKAGEABLE_ELEMENT__NAMESPACE_NEEDS_VISIBILITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNamespaceNeedsVisibility", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case OrgPackage.AGENT__MEMBERSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberships()).basicAdd(otherEnd, msgs);
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case OrgPackage.AGENT__MEMBERSHIPS:
				return ((InternalEList<?>)getMemberships()).basicRemove(otherEnd, msgs);
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				if (resolve) return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case OrgPackage.AGENT__MEMBERSHIPS:
				return getMemberships();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
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
			case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER:
				return basicGetOwningTemplateParameter() != null;
			case OrgPackage.AGENT__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case OrgPackage.AGENT__MEMBERSHIPS:
				return memberships != null && !memberships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case OrgPackage.AGENT__TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OrgElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return OrgPackage.AGENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return OrgPackage.AGENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OrgElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return OrgPackage.AGENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return OrgPackage.AGENT___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP: return OrgPackage.AGENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == OrgElement.class) {
			switch (baseOperationID) {
				default: return -1;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OrgPackage.AGENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
				return validateNamespaceNeedsVisibility((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OrgPackage.AGENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case OrgPackage.AGENT___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AgentImpl
