
package com.eand.edms.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cdmsDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cdmsDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmLOAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docOcrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intDocID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cdmsDocument", propOrder = {
    "accountNo",
    "areaCode",
    "bcrmContactID",
    "bcrmCustomerID",
    "bcrmLOAID",
    "bcrmOrderID",
    "docDate",
    "docExpDate",
    "docName",
    "docNum",
    "docOcrStatus",
    "docType",
    "docURL",
    "documentId",
    "fileName",
    "intDocID",
    "partyId",
    "remarks",
    "senderID",
    "smsSC",
    "uid"
})
public class CdmsDocument {

    protected String accountNo;
    protected String areaCode;
    protected String bcrmContactID;
    protected String bcrmCustomerID;
    protected String bcrmLOAID;
    protected String bcrmOrderID;
    protected String docDate;
    protected String docExpDate;
    protected String docName;
    protected String docNum;
    protected String docOcrStatus;
    protected String docType;
    protected String docURL;
    protected String documentId;
    protected String fileName;
    protected String intDocID;
    protected String partyId;
    protected String remarks;
    protected String senderID;
    protected String smsSC;
    protected String uid;

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
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
     * Gets the value of the bcrmContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcrmContactID() {
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
    public void setBcrmContactID(String value) {
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
    public String getBcrmCustomerID() {
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
    public void setBcrmCustomerID(String value) {
        this.bcrmCustomerID = value;
    }

    /**
     * Gets the value of the bcrmLOAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcrmLOAID() {
        return bcrmLOAID;
    }

    /**
     * Sets the value of the bcrmLOAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcrmLOAID(String value) {
        this.bcrmLOAID = value;
    }

    /**
     * Gets the value of the bcrmOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcrmOrderID() {
        return bcrmOrderID;
    }

    /**
     * Sets the value of the bcrmOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcrmOrderID(String value) {
        this.bcrmOrderID = value;
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
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the docOcrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocOcrStatus() {
        return docOcrStatus;
    }

    /**
     * Sets the value of the docOcrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocOcrStatus(String value) {
        this.docOcrStatus = value;
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
     * Gets the value of the docURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocURL() {
        return docURL;
    }

    /**
     * Sets the value of the docURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocURL(String value) {
        this.docURL = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the intDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDocID() {
        return intDocID;
    }

    /**
     * Sets the value of the intDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDocID(String value) {
        this.intDocID = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
