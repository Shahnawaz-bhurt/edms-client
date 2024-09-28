
package com.eand.edms.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variablePropertiesSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variablePropertiesSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BCRMContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCRMCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCRMloaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docOCRResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docStream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="manDocVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variablePropertiesSet", propOrder = {
    "bcrmContactID",
    "bcrmCustomerID",
    "bcrMloaID",
    "accountCat",
    "accountNo",
    "areaCode",
    "branch",
    "customerId",
    "docDate",
    "docExpDate",
    "docName",
    "docNumber",
    "docOCRResult",
    "docStream",
    "docType",
    "documentID",
    "internalNo",
    "manDocVerified",
    "partyId",
    "remarks",
    "requestType",
    "senderID",
    "serviceType",
    "smsSC",
    "suffix"
})
public class VariablePropertiesSet {

    @XmlElement(name = "BCRMContactID")
    protected String bcrmContactID;
    @XmlElement(name = "BCRMCustomerID")
    protected String bcrmCustomerID;
    @XmlElement(name = "BCRMloaID")
    protected String bcrMloaID;
    protected String accountCat;
    protected long accountNo;
    protected String areaCode;
    protected String branch;
    protected String customerId;
    protected String docDate;
    protected String docExpDate;
    protected String docName;
    protected String docNumber;
    protected String docOCRResult;
    protected byte[] docStream;
    protected String docType;
    protected String documentID;
    protected long internalNo;
    protected String manDocVerified;
    protected long partyId;
    protected String remarks;
    protected String requestType;
    protected String senderID;
    protected String serviceType;
    protected String smsSC;
    protected String suffix;

    /**
     * Gets the value of the bcrmContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCRMContactID() {
        return bcrmContactID;
    }

    /**
     * Sets the value of the bcrmContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCRMContactID(String value) {
        this.bcrmContactID = value;
    }

    /**
     * Gets the value of the bcrmCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCRMCustomerID() {
        return bcrmCustomerID;
    }

    /**
     * Sets the value of the bcrmCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCRMCustomerID(String value) {
        this.bcrmCustomerID = value;
    }

    /**
     * Gets the value of the bcrMloaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCRMloaID() {
        return bcrMloaID;
    }

    /**
     * Sets the value of the bcrMloaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCRMloaID(String value) {
        this.bcrMloaID = value;
    }

    /**
     * Gets the value of the accountCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCat() {
        return accountCat;
    }

    /**
     * Sets the value of the accountCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCat(String value) {
        this.accountCat = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     */
    public long getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     */
    public void setAccountNo(long value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDate(String value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocExpDate() {
        return docExpDate;
    }

    /**
     * Sets the value of the docExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocExpDate(String value) {
        this.docExpDate = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docOCRResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocOCRResult() {
        return docOCRResult;
    }

    /**
     * Sets the value of the docOCRResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocOCRResult(String value) {
        this.docOCRResult = value;
    }

    /**
     * Gets the value of the docStream property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocStream() {
        return docStream;
    }

    /**
     * Sets the value of the docStream property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocStream(byte[] value) {
        this.docStream = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the internalNo property.
     * 
     */
    public long getInternalNo() {
        return internalNo;
    }

    /**
     * Sets the value of the internalNo property.
     * 
     */
    public void setInternalNo(long value) {
        this.internalNo = value;
    }

    /**
     * Gets the value of the manDocVerified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManDocVerified() {
        return manDocVerified;
    }

    /**
     * Sets the value of the manDocVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManDocVerified(String value) {
        this.manDocVerified = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     */
    public long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     */
    public void setPartyId(long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the smsSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSC() {
        return smsSC;
    }

    /**
     * Sets the value of the smsSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSC(String value) {
        this.smsSC = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
