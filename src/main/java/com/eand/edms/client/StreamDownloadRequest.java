
package com.eand.edms.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streamDownloadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamDownloadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmLOAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcrmOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docOcrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="download" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extraParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamDownloadRequest", propOrder = {
    "accountNo",
    "areaCode",
    "bcrmContactID",
    "bcrmCustomerID",
    "bcrmLOAID",
    "bcrmOrderID",
    "dlKey",
    "docCount",
    "docExpDate",
    "docNumber",
    "docOcrStatus",
    "docType",
    "documentId",
    "download",
    "extraParams",
    "fromDate",
    "partyId",
    "password",
    "remarks",
    "senderID",
    "smsSC",
    "toDate",
    "uid",
    "username"
})
public class StreamDownloadRequest {

    protected long accountNo;
    protected String areaCode;
    protected String bcrmContactID;
    protected String bcrmCustomerID;
    protected String bcrmLOAID;
    protected String bcrmOrderID;
    protected String dlKey;
    protected int docCount;
    protected String docExpDate;
    protected String docNumber;
    protected String docOcrStatus;
    protected String docType;
    protected String documentId;
    protected boolean download;
    protected String extraParams;
    protected String fromDate;
    protected long partyId;
    protected String password;
    protected String remarks;
    protected String senderID;
    protected String smsSC;
    protected String toDate;
    protected String uid;
    protected String username;

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
     * Gets the value of the dlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlKey() {
        return dlKey;
    }

    /**
     * Sets the value of the dlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlKey(String value) {
        this.dlKey = value;
    }

    /**
     * Gets the value of the docCount property.
     * 
     */
    public int getDocCount() {
        return docCount;
    }

    /**
     * Sets the value of the docCount property.
     * 
     */
    public void setDocCount(int value) {
        this.docCount = value;
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
     * Gets the value of the download property.
     * 
     */
    public boolean isDownload() {
        return download;
    }

    /**
     * Sets the value of the download property.
     * 
     */
    public void setDownload(boolean value) {
        this.download = value;
    }

    /**
     * Gets the value of the extraParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraParams() {
        return extraParams;
    }

    /**
     * Sets the value of the extraParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraParams(String value) {
        this.extraParams = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
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

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
