/**
 */
package org.ollabaca.on.mm.gtbr.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.AccountingElement;
import org.ollabaca.on.mm.gtbr.Credit;
import org.ollabaca.on.mm.gtbr.Debit;
import org.ollabaca.on.mm.gtbr.GtbrFactory;
import org.ollabaca.on.mm.gtbr.GtbrPackage;
import org.ollabaca.on.mm.gtbr.Record;
import org.ollabaca.on.mm.gtbr.Transfer;

import org.ollabaca.on.mm.org.OrgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtbrPackageImpl extends EPackageImpl implements GtbrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountingElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass debitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creditEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transferEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dateEDataType = null;

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
   * @see org.ollabaca.on.mm.gtbr.GtbrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GtbrPackageImpl()
  {
    super(eNS_URI, GtbrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GtbrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GtbrPackage init()
  {
    if (isInited) return (GtbrPackage)EPackage.Registry.INSTANCE.getEPackage(GtbrPackage.eNS_URI);

    // Obtain or create and register package
    GtbrPackageImpl theGtbrPackage = (GtbrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GtbrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GtbrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    OrgPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGtbrPackage.createPackageContents();

    // Initialize created meta-data
    theGtbrPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGtbrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GtbrPackage.eNS_URI, theGtbrPackage);
    return theGtbrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccountingElement()
  {
    return accountingElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccount()
  {
    return accountEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccount_Institution()
  {
    return (EReference)accountEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccount_Holder()
  {
    return (EReference)accountEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccount_Records()
  {
    return (EReference)accountEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccount_Balance()
  {
    return (EAttribute)accountEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecord()
  {
    return recordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecord_Account()
  {
    return (EReference)recordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_Date()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_Amount()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getRecord__Apply__double()
  {
    return recordEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDebit()
  {
    return debitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDebit__Apply__double()
  {
    return debitEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCredit()
  {
    return creditEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getCredit__Apply__double()
  {
    return creditEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransfer()
  {
    return transferEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransfer_Date()
  {
    return (EAttribute)transferEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransfer_Amount()
  {
    return (EAttribute)transferEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransfer_From()
  {
    return (EReference)transferEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransfer_To()
  {
    return (EReference)transferEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransfer_Debit()
  {
    return (EReference)transferEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransfer_Credit()
  {
    return (EReference)transferEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDate()
  {
    return dateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GtbrFactory getGtbrFactory()
  {
    return (GtbrFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    accountingElementEClass = createEClass(ACCOUNTING_ELEMENT);

    accountEClass = createEClass(ACCOUNT);
    createEReference(accountEClass, ACCOUNT__INSTITUTION);
    createEReference(accountEClass, ACCOUNT__HOLDER);
    createEReference(accountEClass, ACCOUNT__RECORDS);
    createEAttribute(accountEClass, ACCOUNT__BALANCE);

    recordEClass = createEClass(RECORD);
    createEReference(recordEClass, RECORD__ACCOUNT);
    createEAttribute(recordEClass, RECORD__DATE);
    createEAttribute(recordEClass, RECORD__AMOUNT);
    createEOperation(recordEClass, RECORD___APPLY__DOUBLE);

    debitEClass = createEClass(DEBIT);
    createEOperation(debitEClass, DEBIT___APPLY__DOUBLE);

    creditEClass = createEClass(CREDIT);
    createEOperation(creditEClass, CREDIT___APPLY__DOUBLE);

    transferEClass = createEClass(TRANSFER);
    createEAttribute(transferEClass, TRANSFER__DATE);
    createEAttribute(transferEClass, TRANSFER__AMOUNT);
    createEReference(transferEClass, TRANSFER__FROM);
    createEReference(transferEClass, TRANSFER__TO);
    createEReference(transferEClass, TRANSFER__DEBIT);
    createEReference(transferEClass, TRANSFER__CREDIT);

    // Create data types
    dateEDataType = createEDataType(DATE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    OrgPackage theOrgPackage = (OrgPackage)EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    accountingElementEClass.getESuperTypes().add(theUMLPackage.getPackageableElement());
    accountEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
    accountEClass.getESuperTypes().add(this.getAccountingElement());
    recordEClass.getESuperTypes().add(this.getAccountingElement());
    debitEClass.getESuperTypes().add(this.getRecord());
    creditEClass.getESuperTypes().add(this.getRecord());
    transferEClass.getESuperTypes().add(this.getAccountingElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(accountingElementEClass, AccountingElement.class, "AccountingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccount_Institution(), theOrgPackage.getAgent(), null, "institution", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccount_Holder(), theOrgPackage.getAgent(), null, "holder", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccount_Records(), this.getRecord(), this.getRecord_Account(), "records", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAccount_Balance(), theEcorePackage.getEDouble(), "balance", null, 0, 1, Account.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(recordEClass, Record.class, "Record", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecord_Account(), this.getAccount(), this.getAccount_Records(), "account", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_Date(), this.getDate(), "date", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_Amount(), theEcorePackage.getEDouble(), "amount", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getRecord__Apply__double(), theEcorePackage.getEDouble(), "apply", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEDouble(), "balance", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(debitEClass, Debit.class, "Debit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getDebit__Apply__double(), theEcorePackage.getEDouble(), "apply", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEDouble(), "balance", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(creditEClass, Credit.class, "Credit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getCredit__Apply__double(), theEcorePackage.getEDouble(), "apply", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEDouble(), "balance", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(transferEClass, Transfer.class, "Transfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransfer_Date(), this.getDate(), "date", null, 1, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransfer_Amount(), theEcorePackage.getEDouble(), "amount", null, 0, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransfer_From(), this.getAccount(), null, "from", null, 0, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransfer_To(), this.getAccount(), null, "to", null, 0, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransfer_Debit(), this.getDebit(), null, "debit", null, 0, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransfer_Credit(), this.getCredit(), null, "credit", null, 0, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GtbrPackageImpl
