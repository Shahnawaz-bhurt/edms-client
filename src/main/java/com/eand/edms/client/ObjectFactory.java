
package com.eand.edms.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eand.cdms.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DownloadEDMSDocument_QNAME = new QName("http://edmscestg.etisalat.corp.ae/1.0", "downloadEDMSDocument");
    private final static QName _DownloadEDMSDocumentResponse_QNAME = new QName("http://edmscestg.etisalat.corp.ae/1.0", "downloadEDMSDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ae.corp.etisalat.edmscestg._1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DownloadEDMSDocument }
     *
     */
    public DownloadEDMSDocument createDownloadEDMSDocument() {
        return new DownloadEDMSDocument();
    }

    /**
     * Create an instance of {@link DownloadEDMSDocumentResponse }
     *
     */
    public DownloadEDMSDocumentResponse createDownloadEDMSDocumentResponse() {
        return new DownloadEDMSDocumentResponse();
    }

    /**
     * Create an instance of {@link StatusObject }
     *
     */
    public StatusObject createStatusObject() {
        return new StatusObject();
    }

    /**
     * Create an instance of {@link StreamDownloadRequest }
     *
     */
    public StreamDownloadRequest createStreamDownloadRequest() {
        return new StreamDownloadRequest();
    }

    /**
     * Create an instance of {@link StreamDownloadResponse }
     *
     */
    public StreamDownloadResponse createStreamDownloadResponse() {
        return new StreamDownloadResponse();
    }

    /**
     * Create an instance of {@link StreamCDMSDocument }
     *
     */
    public StreamCDMSDocument createStreamCDMSDocument() {
        return new StreamCDMSDocument();
    }

    /**
     * Create an instance of {@link CdmsDocument }
     *
     */
    public CdmsDocument createCdmsDocument() {
        return new CdmsDocument();
    }


    /**
     * Create an instance of {@link CdmsParamElement }
     *
     */
    public CdmsParamElement createCdmsParamElement() {
        return new CdmsParamElement();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     *
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     *
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link VariablePropertiesSet }
     *
     */
    public VariablePropertiesSet createVariablePropertiesSet() {
        return new VariablePropertiesSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadEDMSDocument }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadEDMSDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://edmscestg.etisalat.corp.ae/1.0", name = "downloadEDMSDocument")
    public JAXBElement<DownloadEDMSDocument> createDownloadEDMSDocument(DownloadEDMSDocument value) {
        return new JAXBElement<DownloadEDMSDocument>(_DownloadEDMSDocument_QNAME, DownloadEDMSDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadEDMSDocumentResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadEDMSDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://edmscestg.etisalat.corp.ae/1.0", name = "downloadEDMSDocumentResponse")
    public JAXBElement<DownloadEDMSDocumentResponse> createDownloadEDMSDocumentResponse(DownloadEDMSDocumentResponse value) {
        return new JAXBElement<DownloadEDMSDocumentResponse>(_DownloadEDMSDocumentResponse_QNAME, DownloadEDMSDocumentResponse.class, null, value);
    }
}