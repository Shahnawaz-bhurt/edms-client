
package com.eand.edms.client;

import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.*;

import javax.xml.namespace.QName;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CDMSWS-Service", targetNamespace = "http://edmscestg.etisalat.corp.ae/1.0", wsdlLocation = "file:/C:/Users/user/Desktop/New%20folder/CDMSWS-Service.wsdl")
public class CDMSWSService
    extends Service
{

    private final static URL CDMSWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CDMSWSSERVICE_EXCEPTION;
    private final static QName CDMSWSSERVICE_QNAME = new QName("http://edmscestg.etisalat.corp.ae/1.0", "CDMSWS-Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/user/Desktop/New%20folder/CDMSWS-Service.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CDMSWSSERVICE_WSDL_LOCATION = url;
        CDMSWSSERVICE_EXCEPTION = e;
    }

    public CDMSWSService() {
        super(__getWsdlLocation(), CDMSWSSERVICE_QNAME);
    }

    public CDMSWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CDMSWSSERVICE_QNAME, features);
    }

    public CDMSWSService(URL wsdlLocation) {
        super(wsdlLocation, CDMSWSSERVICE_QNAME);
    }

    public CDMSWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CDMSWSSERVICE_QNAME, features);
    }

    public CDMSWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CDMSWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CDMSWS
     */
    @WebEndpoint(name = "CDMSPort")
    public CDMSWS getCDMSPort() {
        return super.getPort(new QName("http://edmscestg.etisalat.corp.ae/1.0", "CDMSPort"), CDMSWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CDMSWS
     */
    @WebEndpoint(name = "CDMSPort")
    public CDMSWS getCDMSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://edmscestg.etisalat.corp.ae/1.0", "CDMSPort"), CDMSWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CDMSWSSERVICE_EXCEPTION!= null) {
            throw CDMSWSSERVICE_EXCEPTION;
        }
        return CDMSWSSERVICE_WSDL_LOCATION;
    }

}
