/**
 */
package org.ollabaca.on.mm.task.impl;

import com.google.common.base.Objects;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.mm.task.*;

import org.ollabaca.on.mm.task.util.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskFactoryImpl extends EFactoryImpl implements TaskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskFactory init() {
		try {
			TaskFactory theTaskFactory = (TaskFactory)EPackage.Registry.INSTANCE.getEFactory(TaskPackage.eNS_URI);
			if (theTaskFactory != null) {
				return theTaskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaskPackage.PHASE: return createPhase();
			case TaskPackage.STAGE: return createStage();
			case TaskPackage.ACCOUNT: return createAccount();
			case TaskPackage.TASK: return createTask();
			case TaskPackage.WORK: return createWork();
			case TaskPackage.WARNING: return createWarning();
			case TaskPackage.NOTE: return createNote();
			case TaskPackage.IMPORTANT: return createImportant();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TaskPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case TaskPackage.PERIOD:
				return createPeriodFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TaskPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case TaskPackage.PERIOD:
				return convertPeriodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work createWork() {
		WorkImpl work = new WorkImpl();
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warning createWarning() {
		WarningImpl warning = new WarningImpl();
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Important createImportant() {
		ImportantImpl important = new ImportantImpl();
		return important;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod(final String it) {
		Period _xifexpression = null;
		boolean _notEquals = (!Objects.equal(it, null));
		if (_notEquals) {
			_xifexpression = Period.parse(it);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriodFromString(EDataType eDataType, String initialValue) {
		return createPeriod(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriod(final Period it) {
		String _xifexpression = null;
		boolean _notEquals = (!Objects.equal(it, null));
		if (_notEquals) {
			_xifexpression = it.toString();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodToString(EDataType eDataType, Object instanceValue) {
		return convertPeriod((Period)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPackage getTaskPackage() {
		return (TaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskPackage getPackage() {
		return TaskPackage.eINSTANCE;
	}

} //TaskFactoryImpl
