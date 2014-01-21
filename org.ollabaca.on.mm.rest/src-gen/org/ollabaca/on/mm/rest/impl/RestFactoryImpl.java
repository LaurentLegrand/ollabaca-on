/**
 */
package org.ollabaca.on.mm.rest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.mm.rest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestFactoryImpl extends EFactoryImpl implements RestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestFactory init()
  {
    try
    {
      RestFactory theRestFactory = (RestFactory)EPackage.Registry.INSTANCE.getEFactory(RestPackage.eNS_URI);
      if (theRestFactory != null)
      {
        return theRestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestFactoryImpl()
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
      case RestPackage.HTTP_RESOURCE: return createHttpResource();
      case RestPackage.HTTP_METHOD: return createHttpMethod();
      case RestPackage.HTTP_PARAMETER: return createHttpParameter();
      case RestPackage.HTTP_MESSAGE: return createHttpMessage();
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
      case RestPackage.HTTP_METHOD_KIND:
        return createHttpMethodKindFromString(eDataType, initialValue);
      case RestPackage.HTTP_PARAMETER_KIND:
        return createHttpParameterKindFromString(eDataType, initialValue);
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
      case RestPackage.HTTP_METHOD_KIND:
        return convertHttpMethodKindToString(eDataType, instanceValue);
      case RestPackage.HTTP_PARAMETER_KIND:
        return convertHttpParameterKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpResource createHttpResource()
  {
    HttpResourceImpl httpResource = new HttpResourceImpl();
    return httpResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethod createHttpMethod()
  {
    HttpMethodImpl httpMethod = new HttpMethodImpl();
    return httpMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpParameter createHttpParameter()
  {
    HttpParameterImpl httpParameter = new HttpParameterImpl();
    return httpParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMessage createHttpMessage()
  {
    HttpMessageImpl httpMessage = new HttpMessageImpl();
    return httpMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethodKind createHttpMethodKindFromString(EDataType eDataType, String initialValue)
  {
    HttpMethodKind result = HttpMethodKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpMethodKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpParameterKind createHttpParameterKindFromString(EDataType eDataType, String initialValue)
  {
    HttpParameterKind result = HttpParameterKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpParameterKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestPackage getRestPackage()
  {
    return (RestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestPackage getPackage()
  {
    return RestPackage.eINSTANCE;
  }

} //RestFactoryImpl
