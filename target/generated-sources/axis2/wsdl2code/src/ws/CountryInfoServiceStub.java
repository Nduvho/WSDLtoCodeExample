/**
 * CountryInfoServiceStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package ws;

/*
 *  CountryInfoServiceStub java implementation
 */

public class CountryInfoServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultExceptionNameMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultExceptionClassNameMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service =
        new org.apache.axis2.description.AxisService("CountryInfoService" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[21];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "fullCountryInfo"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countryFlag"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countryName"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countryCurrency"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfCountryNamesByCode"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByName"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countryIntPhoneCode"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "currencyName"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByCode"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByCode"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "languageISOCode"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "capitalCity"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByName"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo",
            "listOfCountryNamesGroupedByContinent"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfCountryNamesByName"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByName"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "languageName"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByCode"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countriesUsingCurrency"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "countryISOCode"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.oorsprong.org/websamples.countryinfo", "fullCountryInfoAllCountries"));
    _service.addOperation(__operation);

    _operations[20] = __operation;
  }

  // populates the faults
  private void populateFaults() {}

  /** Constructor that takes in a configContext */
  public CountryInfoServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public CountryInfoServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    // Set the soap version
    _serviceClient
        .getOptions()
        .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
  }

  /** Default Constructor */
  public CountryInfoServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(
        configurationContext,
        "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");
  }

  /** Default Constructor */
  public CountryInfoServiceStub() throws org.apache.axis2.AxisFault {

    this("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");
  }

  /** Constructor taking the target endpoint */
  public CountryInfoServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature Returns a struct with all the stored country information. Pass
   * the ISO country code
   *
   * @see ws.CountryInfoService#fullCountryInfo
   * @param fullCountryInfo0
   */
  public org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument fullCountryInfo(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument fullCountryInfo0)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/FullCountryInfoRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              fullCountryInfo0,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "fullCountryInfo")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "FullCountryInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a struct with all the
   * stored country information. Pass the ISO country code
   *
   * @see ws.CountryInfoService#startfullCountryInfo
   * @param fullCountryInfo0
   */
  public void startfullCountryInfo(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument fullCountryInfo0,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[0].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/FullCountryInfoRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            fullCountryInfo0,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "fullCountryInfo")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfo"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument
                          .class);
              callback.receiveResultfullCountryInfo(
                  (org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorfullCountryInfo(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfo"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "FullCountryInfo"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "FullCountryInfo"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorfullCountryInfo(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfo(f);
                  }
                } else {
                  callback.receiveErrorfullCountryInfo(f);
                }
              } else {
                callback.receiveErrorfullCountryInfo(f);
              }
            } else {
              callback.receiveErrorfullCountryInfo(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorfullCountryInfo(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[0].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[0].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a link to a picture of the country flag
   *
   * @see ws.CountryInfoService#countryFlag
   * @param countryFlag2
   */
  public org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument countryFlag(
      org.oorsprong.www.websamples_countryinfo.CountryFlagDocument countryFlag2)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryFlagRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countryFlag2,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countryFlag")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountryFlag"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryFlag"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryFlag"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryFlag"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a link to a picture of the
   * country flag
   *
   * @see ws.CountryInfoService#startcountryFlag
   * @param countryFlag2
   */
  public void startcountryFlag(
      org.oorsprong.www.websamples_countryinfo.CountryFlagDocument countryFlag2,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[1].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryFlagRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countryFlag2,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countryFlag")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountryFlag"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.class);
              callback.receiveResultcountryFlag(
                  (org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountryFlag(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryFlag"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryFlag"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryFlag"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountryFlag(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryFlag(f);
                  }
                } else {
                  callback.receiveErrorcountryFlag(f);
                }
              } else {
                callback.receiveErrorcountryFlag(f);
              }
            } else {
              callback.receiveErrorcountryFlag(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountryFlag(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[1].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[1].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Searches the database for a country by the passed ISO country
   * code
   *
   * @see ws.CountryInfoService#countryName
   * @param countryName4
   */
  public org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument countryName(
      org.oorsprong.www.websamples_countryinfo.CountryNameDocument countryName4)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countryName4,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countryName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountryName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Searches the database for a
   * country by the passed ISO country code
   *
   * @see ws.CountryInfoService#startcountryName
   * @param countryName4
   */
  public void startcountryName(
      org.oorsprong.www.websamples_countryinfo.CountryNameDocument countryName4,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[2].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countryName4,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countryName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountryName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.class);
              callback.receiveResultcountryName(
                  (org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountryName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountryName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryName(f);
                  }
                } else {
                  callback.receiveErrorcountryName(f);
                }
              } else {
                callback.receiveErrorcountryName(f);
              }
            } else {
              callback.receiveErrorcountryName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountryName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[2].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[2].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns the currency ISO code and name for the passed country
   * ISO code
   *
   * @see ws.CountryInfoService#countryCurrency
   * @param countryCurrency6
   */
  public org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument countryCurrency(
      org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument countryCurrency6)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryCurrencyRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countryCurrency6,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countryCurrency")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountryCurrency"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryCurrency"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryCurrency"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryCurrency"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns the currency ISO code and
   * name for the passed country ISO code
   *
   * @see ws.CountryInfoService#startcountryCurrency
   * @param countryCurrency6
   */
  public void startcountryCurrency(
      org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument countryCurrency6,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[3].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryCurrencyRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countryCurrency6,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countryCurrency")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountryCurrency"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument
                          .class);
              callback.receiveResultcountryCurrency(
                  (org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountryCurrency(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryCurrency"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryCurrency"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryCurrency"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountryCurrency(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryCurrency(f);
                  }
                } else {
                  callback.receiveErrorcountryCurrency(f);
                }
              } else {
                callback.receiveErrorcountryCurrency(f);
              }
            } else {
              callback.receiveErrorcountryCurrency(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountryCurrency(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[3].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[3].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of all stored counties ordered by ISO code
   *
   * @see ws.CountryInfoService#listOfCountryNamesByCode
   * @param listOfCountryNamesByCode8
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument
      listOfCountryNamesByCode(
          org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument
              listOfCountryNamesByCode8)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesByCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfCountryNamesByCode8,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo",
                      "listOfCountryNamesByCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfCountryNamesByCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of all stored
   * counties ordered by ISO code
   *
   * @see ws.CountryInfoService#startlistOfCountryNamesByCode
   * @param listOfCountryNamesByCode8
   */
  public void startlistOfCountryNamesByCode(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument
          listOfCountryNamesByCode8,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[4].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesByCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfCountryNamesByCode8,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfCountryNamesByCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesByCodeResponseDocument.class);
              callback.receiveResultlistOfCountryNamesByCode(
                  (org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesByCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfCountryNamesByCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesByCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesByCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfCountryNamesByCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByCode(f);
                  }
                } else {
                  callback.receiveErrorlistOfCountryNamesByCode(f);
                }
              } else {
                callback.receiveErrorlistOfCountryNamesByCode(f);
              }
            } else {
              callback.receiveErrorlistOfCountryNamesByCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfCountryNamesByCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[4].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[4].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of currencies ordered by name.
   *
   * @see ws.CountryInfoService#listOfCurrenciesByName
   * @param listOfCurrenciesByName10
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument
      listOfCurrenciesByName(
          org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument
              listOfCurrenciesByName10)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCurrenciesByNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfCurrenciesByName10,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfCurrenciesByName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of currencies
   * ordered by name.
   *
   * @see ws.CountryInfoService#startlistOfCurrenciesByName
   * @param listOfCurrenciesByName10
   */
  public void startlistOfCurrenciesByName(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument
          listOfCurrenciesByName10,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[5].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCurrenciesByNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfCurrenciesByName10,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfCurrenciesByNameResponseDocument.class);
              callback.receiveResultlistOfCurrenciesByName(
                  (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfCurrenciesByName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCurrenciesByName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCurrenciesByName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfCurrenciesByName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByName(f);
                  }
                } else {
                  callback.receiveErrorlistOfCurrenciesByName(f);
                }
              } else {
                callback.receiveErrorlistOfCurrenciesByName(f);
              }
            } else {
              callback.receiveErrorlistOfCurrenciesByName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfCurrenciesByName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[5].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[5].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns the internation phone code for the passed ISO country
   * code
   *
   * @see ws.CountryInfoService#countryIntPhoneCode
   * @param countryIntPhoneCode12
   */
  public org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument
      countryIntPhoneCode(
          org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument
              countryIntPhoneCode12)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryIntPhoneCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countryIntPhoneCode12,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countryIntPhoneCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountryIntPhoneCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryIntPhoneCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryIntPhoneCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryIntPhoneCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns the internation phone code
   * for the passed ISO country code
   *
   * @see ws.CountryInfoService#startcountryIntPhoneCode
   * @param countryIntPhoneCode12
   */
  public void startcountryIntPhoneCode(
      org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument countryIntPhoneCode12,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[6].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryIntPhoneCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countryIntPhoneCode12,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countryIntPhoneCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountryIntPhoneCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument
                          .class);
              callback.receiveResultcountryIntPhoneCode(
                  (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountryIntPhoneCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryIntPhoneCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryIntPhoneCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryIntPhoneCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountryIntPhoneCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryIntPhoneCode(f);
                  }
                } else {
                  callback.receiveErrorcountryIntPhoneCode(f);
                }
              } else {
                callback.receiveErrorcountryIntPhoneCode(f);
              }
            } else {
              callback.receiveErrorcountryIntPhoneCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountryIntPhoneCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[6].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[6].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns the name of the currency (if found)
   *
   * @see ws.CountryInfoService#currencyName
   * @param currencyName14
   */
  public org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument currencyName(
      org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument currencyName14)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CurrencyNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              currencyName14,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "currencyName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CurrencyName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CurrencyName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CurrencyName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CurrencyName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns the name of the currency
   * (if found)
   *
   * @see ws.CountryInfoService#startcurrencyName
   * @param currencyName14
   */
  public void startcurrencyName(
      org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument currencyName14,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[7].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CurrencyNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            currencyName14,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "currencyName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CurrencyName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.class);
              callback.receiveResultcurrencyName(
                  (org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcurrencyName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CurrencyName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CurrencyName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CurrencyName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcurrencyName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcurrencyName(f);
                  }
                } else {
                  callback.receiveErrorcurrencyName(f);
                }
              } else {
                callback.receiveErrorcurrencyName(f);
              }
            } else {
              callback.receiveErrorcurrencyName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcurrencyName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[7].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[7].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of currencies ordered by code.
   *
   * @see ws.CountryInfoService#listOfCurrenciesByCode
   * @param listOfCurrenciesByCode16
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument
      listOfCurrenciesByCode(
          org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument
              listOfCurrenciesByCode16)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCurrenciesByCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfCurrenciesByCode16,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfCurrenciesByCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of currencies
   * ordered by code.
   *
   * @see ws.CountryInfoService#startlistOfCurrenciesByCode
   * @param listOfCurrenciesByCode16
   */
  public void startlistOfCurrenciesByCode(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument
          listOfCurrenciesByCode16,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[8].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCurrenciesByCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfCurrenciesByCode16,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfCurrenciesByCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfCurrenciesByCodeResponseDocument.class);
              callback.receiveResultlistOfCurrenciesByCode(
                  (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfCurrenciesByCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCurrenciesByCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCurrenciesByCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCurrenciesByCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfCurrenciesByCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCurrenciesByCode(f);
                  }
                } else {
                  callback.receiveErrorlistOfCurrenciesByCode(f);
                }
              } else {
                callback.receiveErrorlistOfCurrenciesByCode(f);
              }
            } else {
              callback.receiveErrorlistOfCurrenciesByCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfCurrenciesByCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[8].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[8].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns an array of languages ordered by code
   *
   * @see ws.CountryInfoService#listOfLanguagesByCode
   * @param listOfLanguagesByCode18
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument
      listOfLanguagesByCode(
          org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument
              listOfLanguagesByCode18)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfLanguagesByCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfLanguagesByCode18,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfLanguagesByCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns an array of languages
   * ordered by code
   *
   * @see ws.CountryInfoService#startlistOfLanguagesByCode
   * @param listOfLanguagesByCode18
   */
  public void startlistOfLanguagesByCode(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument
          listOfLanguagesByCode18,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[9].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfLanguagesByCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfLanguagesByCode18,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument
                          .class);
              callback.receiveResultlistOfLanguagesByCode(
                  (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfLanguagesByCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfLanguagesByCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfLanguagesByCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfLanguagesByCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByCode(f);
                  }
                } else {
                  callback.receiveErrorlistOfLanguagesByCode(f);
                }
              } else {
                callback.receiveErrorlistOfLanguagesByCode(f);
              }
            } else {
              callback.receiveErrorlistOfLanguagesByCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfLanguagesByCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[9].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[9].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Find a language ISO code based on the passed language name
   *
   * @see ws.CountryInfoService#languageISOCode
   * @param languageISOCode20
   */
  public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument languageISOCode(
      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument languageISOCode20)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/LanguageISOCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              languageISOCode20,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "languageISOCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "LanguageISOCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "LanguageISOCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "LanguageISOCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "LanguageISOCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Find a language ISO code based on
   * the passed language name
   *
   * @see ws.CountryInfoService#startlanguageISOCode
   * @param languageISOCode20
   */
  public void startlanguageISOCode(
      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument languageISOCode20,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[10].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/LanguageISOCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            languageISOCode20,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "languageISOCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "LanguageISOCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument
                          .class);
              callback.receiveResultlanguageISOCode(
                  (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlanguageISOCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "LanguageISOCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "LanguageISOCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "LanguageISOCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlanguageISOCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageISOCode(f);
                  }
                } else {
                  callback.receiveErrorlanguageISOCode(f);
                }
              } else {
                callback.receiveErrorlanguageISOCode(f);
              }
            } else {
              callback.receiveErrorlanguageISOCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlanguageISOCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[10].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[10].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns the name of the captial city for the passed country
   * code
   *
   * @see ws.CountryInfoService#capitalCity
   * @param capitalCity22
   */
  public org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument capitalCity(
      org.oorsprong.www.websamples_countryinfo.CapitalCityDocument capitalCity22)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CapitalCityRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              capitalCity22,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "capitalCity")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CapitalCity"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CapitalCity"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CapitalCity"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CapitalCity"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns the name of the captial
   * city for the passed country code
   *
   * @see ws.CountryInfoService#startcapitalCity
   * @param capitalCity22
   */
  public void startcapitalCity(
      org.oorsprong.www.websamples_countryinfo.CapitalCityDocument capitalCity22,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[11].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CapitalCityRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            capitalCity22,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "capitalCity")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CapitalCity"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.class);
              callback.receiveResultcapitalCity(
                  (org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcapitalCity(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CapitalCity"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CapitalCity"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CapitalCity"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcapitalCity(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcapitalCity(f);
                  }
                } else {
                  callback.receiveErrorcapitalCity(f);
                }
              } else {
                callback.receiveErrorcapitalCity(f);
              }
            } else {
              callback.receiveErrorcapitalCity(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcapitalCity(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[11].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[11].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns an array of languages ordered by name
   *
   * @see ws.CountryInfoService#listOfLanguagesByName
   * @param listOfLanguagesByName24
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument
      listOfLanguagesByName(
          org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument
              listOfLanguagesByName24)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfLanguagesByNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfLanguagesByName24,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfLanguagesByName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns an array of languages
   * ordered by name
   *
   * @see ws.CountryInfoService#startlistOfLanguagesByName
   * @param listOfLanguagesByName24
   */
  public void startlistOfLanguagesByName(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument
          listOfLanguagesByName24,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[12].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfLanguagesByNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfLanguagesByName24,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfLanguagesByName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument
                          .class);
              callback.receiveResultlistOfLanguagesByName(
                  (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfLanguagesByName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfLanguagesByName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfLanguagesByName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfLanguagesByName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfLanguagesByName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfLanguagesByName(f);
                  }
                } else {
                  callback.receiveErrorlistOfLanguagesByName(f);
                }
              } else {
                callback.receiveErrorlistOfLanguagesByName(f);
              }
            } else {
              callback.receiveErrorlistOfLanguagesByName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfLanguagesByName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[12].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[12].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of all stored counties grouped per continent
   *
   * @see ws.CountryInfoService#listOfCountryNamesGroupedByContinent
   * @param listOfCountryNamesGroupedByContinent26
   */
  public org.oorsprong.www.websamples_countryinfo
          .ListOfCountryNamesGroupedByContinentResponseDocument
      listOfCountryNamesGroupedByContinent(
          org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
              listOfCountryNamesGroupedByContinent26)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesGroupedByContinentRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfCountryNamesGroupedByContinent26,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo",
                      "listOfCountryNamesGroupedByContinent")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo",
                  "ListOfCountryNamesGroupedByContinent"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo
                  .ListOfCountryNamesGroupedByContinentResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo
              .ListOfCountryNamesGroupedByContinentResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of all stored
   * counties grouped per continent
   *
   * @see ws.CountryInfoService#startlistOfCountryNamesGroupedByContinent
   * @param listOfCountryNamesGroupedByContinent26
   */
  public void startlistOfCountryNamesGroupedByContinent(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
          listOfCountryNamesGroupedByContinent26,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[13].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesGroupedByContinentRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfCountryNamesGroupedByContinent26,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo",
                    "listOfCountryNamesGroupedByContinent")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo",
                "ListOfCountryNamesGroupedByContinent"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesGroupedByContinentResponseDocument.class);
              callback.receiveResultlistOfCountryNamesGroupedByContinent(
                  (org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesGroupedByContinentResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfCountryNamesGroupedByContinent(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesGroupedByContinent"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                  }
                } else {
                  callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
                }
              } else {
                callback.receiveErrorlistOfCountryNamesGroupedByContinent(f);
              }
            } else {
              callback.receiveErrorlistOfCountryNamesGroupedByContinent(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfCountryNamesGroupedByContinent(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[13].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[13].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of all stored counties ordered by country name
   *
   * @see ws.CountryInfoService#listOfCountryNamesByName
   * @param listOfCountryNamesByName28
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument
      listOfCountryNamesByName(
          org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument
              listOfCountryNamesByName28)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesByNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfCountryNamesByName28,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo",
                      "listOfCountryNamesByName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfCountryNamesByName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of all stored
   * counties ordered by country name
   *
   * @see ws.CountryInfoService#startlistOfCountryNamesByName
   * @param listOfCountryNamesByName28
   */
  public void startlistOfCountryNamesByName(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument
          listOfCountryNamesByName28,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[14].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfCountryNamesByNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfCountryNamesByName28,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfCountryNamesByName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesByNameResponseDocument.class);
              callback.receiveResultlistOfCountryNamesByName(
                  (org.oorsprong.www.websamples_countryinfo
                          .ListOfCountryNamesByNameResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfCountryNamesByName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfCountryNamesByName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesByName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfCountryNamesByName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfCountryNamesByName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfCountryNamesByName(f);
                  }
                } else {
                  callback.receiveErrorlistOfCountryNamesByName(f);
                }
              } else {
                callback.receiveErrorlistOfCountryNamesByName(f);
              }
            } else {
              callback.receiveErrorlistOfCountryNamesByName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfCountryNamesByName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[14].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[14].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of continents ordered by name.
   *
   * @see ws.CountryInfoService#listOfContinentsByName
   * @param listOfContinentsByName30
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument
      listOfContinentsByName(
          org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument
              listOfContinentsByName30)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfContinentsByNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfContinentsByName30,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfContinentsByName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of continents
   * ordered by name.
   *
   * @see ws.CountryInfoService#startlistOfContinentsByName
   * @param listOfContinentsByName30
   */
  public void startlistOfContinentsByName(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument
          listOfContinentsByName30,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[15].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfContinentsByNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfContinentsByName30,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfContinentsByNameResponseDocument.class);
              callback.receiveResultlistOfContinentsByName(
                  (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfContinentsByName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfContinentsByName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfContinentsByName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfContinentsByName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByName(f);
                  }
                } else {
                  callback.receiveErrorlistOfContinentsByName(f);
                }
              } else {
                callback.receiveErrorlistOfContinentsByName(f);
              }
            } else {
              callback.receiveErrorlistOfContinentsByName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfContinentsByName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[15].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[15].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Find a language name based on the passed ISO language code
   *
   * @see ws.CountryInfoService#languageName
   * @param languageName32
   */
  public org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument languageName(
      org.oorsprong.www.websamples_countryinfo.LanguageNameDocument languageName32)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/LanguageNameRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              languageName32,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "languageName")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "LanguageName"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "LanguageName"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "LanguageName"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "LanguageName"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Find a language name based on the
   * passed ISO language code
   *
   * @see ws.CountryInfoService#startlanguageName
   * @param languageName32
   */
  public void startlanguageName(
      org.oorsprong.www.websamples_countryinfo.LanguageNameDocument languageName32,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[16].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/LanguageNameRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            languageName32,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "languageName")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "LanguageName"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.class);
              callback.receiveResultlanguageName(
                  (org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlanguageName(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "LanguageName"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "LanguageName"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "LanguageName"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlanguageName(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlanguageName(f);
                  }
                } else {
                  callback.receiveErrorlanguageName(f);
                }
              } else {
                callback.receiveErrorlanguageName(f);
              }
            } else {
              callback.receiveErrorlanguageName(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlanguageName(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[16].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[16].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of continents ordered by code.
   *
   * @see ws.CountryInfoService#listOfContinentsByCode
   * @param listOfContinentsByCode34
   */
  public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument
      listOfContinentsByCode(
          org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument
              listOfContinentsByCode34)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfContinentsByCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listOfContinentsByCode34,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "ListOfContinentsByCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of continents
   * ordered by code.
   *
   * @see ws.CountryInfoService#startlistOfContinentsByCode
   * @param listOfContinentsByCode34
   */
  public void startlistOfContinentsByCode(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument
          listOfContinentsByCode34,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[17].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/ListOfContinentsByCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            listOfContinentsByCode34,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "listOfContinentsByCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .ListOfContinentsByCodeResponseDocument.class);
              callback.receiveResultlistOfContinentsByCode(
                  (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorlistOfContinentsByCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ListOfContinentsByCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfContinentsByCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListOfContinentsByCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorlistOfContinentsByCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorlistOfContinentsByCode(f);
                  }
                } else {
                  callback.receiveErrorlistOfContinentsByCode(f);
                }
              } else {
                callback.receiveErrorlistOfContinentsByCode(f);
              }
            } else {
              callback.receiveErrorlistOfContinentsByCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorlistOfContinentsByCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[17].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[17].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns a list of all countries that use the same currency
   * code. Pass a ISO currency code
   *
   * @see ws.CountryInfoService#countriesUsingCurrency
   * @param countriesUsingCurrency36
   */
  public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument
      countriesUsingCurrency(
          org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument
              countriesUsingCurrency36)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountriesUsingCurrencyRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countriesUsingCurrency36,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countriesUsingCurrency")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountriesUsingCurrency"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "CountriesUsingCurrency"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountriesUsingCurrency"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountriesUsingCurrency"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns a list of all countries
   * that use the same currency code. Pass a ISO currency code
   *
   * @see ws.CountryInfoService#startcountriesUsingCurrency
   * @param countriesUsingCurrency36
   */
  public void startcountriesUsingCurrency(
      org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument
          countriesUsingCurrency36,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[18].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountriesUsingCurrencyRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countriesUsingCurrency36,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countriesUsingCurrency")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountriesUsingCurrency"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .CountriesUsingCurrencyResponseDocument.class);
              callback.receiveResultcountriesUsingCurrency(
                  (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountriesUsingCurrency(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountriesUsingCurrency"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountriesUsingCurrency"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountriesUsingCurrency"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountriesUsingCurrency(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountriesUsingCurrency(f);
                  }
                } else {
                  callback.receiveErrorcountriesUsingCurrency(f);
                }
              } else {
                callback.receiveErrorcountriesUsingCurrency(f);
              }
            } else {
              callback.receiveErrorcountriesUsingCurrency(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountriesUsingCurrency(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[18].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[18].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature This function tries to found a country based on the passed
   * country name.
   *
   * @see ws.CountryInfoService#countryISOCode
   * @param countryISOCode38
   */
  public org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument countryISOCode(
      org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument countryISOCode38)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryISOCodeRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              countryISOCode38,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo", "countryISOCode")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo", "CountryISOCode"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryISOCode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryISOCode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CountryISOCode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations This function tries to found a
   * country based on the passed country name.
   *
   * @see ws.CountryInfoService#startcountryISOCode
   * @param countryISOCode38
   */
  public void startcountryISOCode(
      org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument countryISOCode38,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[19].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/CountryISOCodeRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            countryISOCode38,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo", "countryISOCode")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "CountryISOCode"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument
                          .class);
              callback.receiveResultcountryISOCode(
                  (org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcountryISOCode(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CountryISOCode"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryISOCode"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CountryISOCode"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorcountryISOCode(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcountryISOCode(f);
                  }
                } else {
                  callback.receiveErrorcountryISOCode(f);
                }
              } else {
                callback.receiveErrorcountryISOCode(f);
              }
            } else {
              callback.receiveErrorcountryISOCode(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcountryISOCode(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[19].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[19].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature Returns an array with all countries and all the language
   * information stored
   *
   * @see ws.CountryInfoService#fullCountryInfoAllCountries
   * @param fullCountryInfoAllCountries40
   */
  public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
      fullCountryInfoAllCountries(
          org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument
              fullCountryInfoAllCountries40)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/FullCountryInfoAllCountriesRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              fullCountryInfoAllCountries40,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.oorsprong.org/websamples.countryinfo",
                      "fullCountryInfoAllCountries")),
              new javax.xml.namespace.QName(
                  "http://www.oorsprong.org/websamples.countryinfo",
                  "FullCountryInfoAllCountries"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
                  .class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "FullCountryInfoAllCountries"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfoAllCountries"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfoAllCountries"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations Returns an array with all
   * countries and all the language information stored
   *
   * @see ws.CountryInfoService#startfullCountryInfoAllCountries
   * @param fullCountryInfoAllCountries40
   */
  public void startfullCountryInfoAllCountries(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument
          fullCountryInfoAllCountries40,
      final ws.CountryInfoServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[20].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://www.oorsprong.org/websamples.countryinfo/CountryInfoServiceSoapType/FullCountryInfoAllCountriesRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            fullCountryInfoAllCountries40,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://www.oorsprong.org/websamples.countryinfo",
                    "fullCountryInfoAllCountries")),
            new javax.xml.namespace.QName(
                "http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoAllCountries"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      org.oorsprong.www.websamples_countryinfo
                          .FullCountryInfoAllCountriesResponseDocument.class);
              callback.receiveResultfullCountryInfoAllCountries(
                  (org.oorsprong.www.websamples_countryinfo
                          .FullCountryInfoAllCountriesResponseDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorfullCountryInfoAllCountries(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "FullCountryInfoAllCountries"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "FullCountryInfoAllCountries"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "FullCountryInfoAllCountries"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorfullCountryInfoAllCountries(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorfullCountryInfoAllCountries(f);
                  }
                } else {
                  callback.receiveErrorfullCountryInfoAllCountries(f);
                }
              } else {
                callback.receiveErrorfullCountryInfoAllCountries(f);
              }
            } else {
              callback.receiveErrorfullCountryInfoAllCountries(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorfullCountryInfoAllCountries(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[20].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[20].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso

  private final org.apache.xmlbeans.XmlOptions _xmlOptions;

  {
    _xmlOptions = new org.apache.xmlbeans.XmlOptions();
    _xmlOptions.setSaveNoXmlDecl();
    _xmlOptions.setSaveAggressiveNamespaces();
    _xmlOptions.setSaveNamespacesFirst();
  }

  /**
   * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when serializing
   * objects to XML.
   *
   * @return the options used for serialization
   */
  public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
    return _xmlOptions;
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryFlagDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryFlagDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryNameDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CapitalCityDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CapitalCityDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
          param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument
          param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo
              .ListOfCountryNamesGroupedByContinentResponseDocument
          param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.LanguageNameDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.LanguageNameDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
          param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountryFlagDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountryNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CapitalCityDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.LanguageNameDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  public org.apache.xmlbeans.XmlObject fromOM(
      org.apache.axiom.om.OMElement param, java.lang.Class type) throws org.apache.axis2.AxisFault {
    try {

      if (org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryNameDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryNameDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryCurrencyDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
          .class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo
          .ListOfCountryNamesGroupedByContinentResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo
            .ListOfCountryNamesGroupedByContinentResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
