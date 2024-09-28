
package com.eand.edms.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "statusObject", propOrder = {
    "doctype",
    "newSR",
    "oldSR",
    "remark",
    "status",
    "uid"
})
public class StatusObject {

    protected String doctype;
    protected String newSR;
    protected String oldSR;
    protected String remark;
    protected String status;
    protected String uid;

    /**
     * Gets the value of the doctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctype() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctype(String value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the newSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSR() {
        return newSR;
    }

    /**
     * Sets the value of the newSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSR(String value) {
        this.newSR = value;
    }

    /**
     * Gets the value of the oldSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSR() {
        return oldSR;
    }

    /**
     * Sets the value of the oldSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSR(String value) {
        this.oldSR = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
