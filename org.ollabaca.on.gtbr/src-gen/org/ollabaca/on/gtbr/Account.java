/**
 */
package org.ollabaca.on.gtbr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

import org.ollabaca.on.mm.org.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getRecords <em>Records</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends NamedElement, AccountingElement
{
  /**
   * Returns the value of the '<em><b>Institution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Institution</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Institution</em>' reference.
   * @see #setInstitution(Agent)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Institution()
   * @model
   * @generated
   */
  Agent getInstitution();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Account#getInstitution <em>Institution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Institution</em>' reference.
   * @see #getInstitution()
   * @generated
   */
  void setInstitution(Agent value);

  /**
   * Returns the value of the '<em><b>Holder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Holder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Holder</em>' reference.
   * @see #setHolder(Agent)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Holder()
   * @model
   * @generated
   */
  Agent getHolder();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Account#getHolder <em>Holder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Holder</em>' reference.
   * @see #getHolder()
   * @generated
   */
  void setHolder(Agent value);

  /**
   * Returns the value of the '<em><b>Records</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.gtbr.Record}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.gtbr.Record#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Records</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Records</em>' reference list.
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Records()
   * @see org.ollabaca.on.gtbr.Record#getAccount
   * @model opposite="account"
   * @generated
   */
  EList<Record> getRecords();

  /**
   * Returns the value of the '<em><b>Balance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Balance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Balance</em>' attribute.
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Balance()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel get='double b = 0;\n<%org.ollabaca.on.gtbr.Account%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.gtbr.Record%>> _records = _this.getRecords();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.gtbr.Record%>,<%java.util.Date%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.gtbr.Record%>,<%java.util.Date%>>()\n{\n\tpublic <%java.util.Date%> apply(final <%org.ollabaca.on.gtbr.Record%> it)\n\t{\n\t\t<%java.util.Date%> _date = it.getDate();\n\t\treturn _date;\n\t}\n};\n<%java.util.List%><<%org.ollabaca.on.gtbr.Record%>> _sortBy = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.gtbr.Record%>, <%java.util.Date%>>sortBy(_records, _function);\nfor (final <%org.ollabaca.on.gtbr.Record%> e : _sortBy)\n{\n\tdouble _apply = e.apply(b);\n\tb = _apply;\n}\nreturn b;'"
   * @generated
   */
  double getBalance();

} // Account
