
package com.eand.edms.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CDMSWS", targetNamespace = "http://edmscestg.etisalat.corp.ae/1.0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CDMSWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.eand.cdms.client.StreamDownloadResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadEDMSDocument", targetNamespace = "http://edmscestg.etisalat.corp.ae/1.0", className = "com.eand.edms.client.DownloadEDMSDocument")
    @ResponseWrapper(localName = "downloadEDMSDocumentResponse", targetNamespace = "http://edmscestg.etisalat.corp.ae/1.0", className = "com.eand.edms.client.DownloadEDMSDocumentResponse")
    @Action(input = "http://edmscestg.etisalat.corp.ae/1.0/CDMSWS/downloadEDMSDocumentRequest", output = "http://edmscestg.etisalat.corp.ae/1.0/CDMSWS/downloadEDMSDocumentResponse")
    public StreamDownloadResponse downloadEDMSDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        StreamDownloadRequest arg0);
}