/**
 */
package org.ollabaca.on.mm.uml.todo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.ollabaca.on.mm.uml.todo.Back;
import org.ollabaca.on.mm.uml.todo.Environment;
import org.ollabaca.on.mm.uml.todo.Front;
import org.ollabaca.on.mm.uml.todo.Middle;
import org.ollabaca.on.mm.uml.todo.Tier;
import org.ollabaca.on.mm.uml.todo.TodoFactory;
import org.ollabaca.on.mm.uml.todo.TodoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TodoPackageImpl extends EPackageImpl implements TodoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ollabaca.on.mm.uml.todo.TodoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TodoPackageImpl() {
		super(eNS_URI, TodoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TodoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TodoPackage init() {
		if (isInited) return (TodoPackage)EPackage.Registry.INSTANCE.getEPackage(TodoPackage.eNS_URI);

		// Obtain or create and register package
		TodoPackageImpl theTodoPackage = (TodoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TodoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TodoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTodoPackage.createPackageContents();

		// Initialize created meta-data
		theTodoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTodoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TodoPackage.eNS_URI, theTodoPackage);
		return theTodoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTier() {
		return tierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFront() {
		return frontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddle() {
		return middleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBack() {
		return backEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodoFactory getTodoFactory() {
		return (TodoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tierEClass = createEClass(TIER);

		frontEClass = createEClass(FRONT);

		middleEClass = createEClass(MIDDLE);

		backEClass = createEClass(BACK);

		environmentEClass = createEClass(ENVIRONMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tierEClass.getESuperTypes().add(theUMLPackage.getNode());
		frontEClass.getESuperTypes().add(this.getTier());
		middleEClass.getESuperTypes().add(this.getTier());
		backEClass.getESuperTypes().add(this.getTier());
		environmentEClass.getESuperTypes().add(theUMLPackage.getExecutionEnvironment());

		// Initialize classes, features, and operations; add parameters
		initEClass(tierEClass, Tier.class, "Tier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontEClass, Front.class, "Front", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(middleEClass, Middle.class, "Middle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backEClass, Back.class, "Back", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TodoPackageImpl
