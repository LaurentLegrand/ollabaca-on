/**
 */
package org.ollabaca.on.uml.rest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Parameter Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.uml.rest.RestPackage#getHttpParameterKind()
 * @model
 * @generated
 */
public enum HttpParameterKind implements Enumerator
{
  /**
   * The '<em><b>Query</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUERY_VALUE
   * @generated
   * @ordered
   */
  QUERY(0, "query", "query"),

  /**
   * The '<em><b>Path</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PATH_VALUE
   * @generated
   * @ordered
   */
  PATH(0, "path", "path"),

  /**
   * The '<em><b>Form</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FORM_VALUE
   * @generated
   * @ordered
   */
  FORM(0, "form", "form"),

  /**
   * The '<em><b>Cookie</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COOKIE_VALUE
   * @generated
   * @ordered
   */
  COOKIE(0, "cookie", "cookie"),

  /**
   * The '<em><b>Header</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEADER_VALUE
   * @generated
   * @ordered
   */
  HEADER(0, "header", "header");

  /**
   * The '<em><b>Query</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Query</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #QUERY
   * @model name="query"
   * @generated
   * @ordered
   */
  public static final int QUERY_VALUE = 0;

  /**
   * The '<em><b>Path</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Path</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PATH
   * @model name="path"
   * @generated
   * @ordered
   */
  public static final int PATH_VALUE = 0;

  /**
   * The '<em><b>Form</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Form</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FORM
   * @model name="form"
   * @generated
   * @ordered
   */
  public static final int FORM_VALUE = 0;

  /**
   * The '<em><b>Cookie</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cookie</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COOKIE
   * @model name="cookie"
   * @generated
   * @ordered
   */
  public static final int COOKIE_VALUE = 0;

  /**
   * The '<em><b>Header</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Header</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEADER
   * @model name="header"
   * @generated
   * @ordered
   */
  public static final int HEADER_VALUE = 0;

  /**
   * An array of all the '<em><b>Http Parameter Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final HttpParameterKind[] VALUES_ARRAY =
    new HttpParameterKind[]
    {
      QUERY,
      PATH,
      FORM,
      COOKIE,
      HEADER,
    };

  /**
   * A public read-only list of all the '<em><b>Http Parameter Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<HttpParameterKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Http Parameter Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HttpParameterKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HttpParameterKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Http Parameter Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HttpParameterKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HttpParameterKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Http Parameter Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HttpParameterKind get(int value)
  {
    switch (value)
    {
      case QUERY_VALUE: return QUERY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private HttpParameterKind(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //HttpParameterKind
