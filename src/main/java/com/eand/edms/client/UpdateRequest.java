
package com.eand.edms.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "updateRequest", propOrder = {
    "dlKey",
    "filterCount",
    "filterName1",
    "filterName2",
    "filterName3",
    "filterName4",
    "filterName5",
    "filterValue1",
    "filterValue2",
    "filterValue3",
    "filterValue4",
    "filterValue5",
    "password",
    "propertyName",
    "propertyValue",
    "username"
})
public class UpdateRequest {

    protected String dlKey;
    protected int filterCount;
    protected String filterName1;
    protected String filterName2;
    protected String filterName3;
    protected String filterName4;
    protected String filterName5;
    protected String filterValue1;
    protected String filterValue2;
    protected String filterValue3;
    protected String filterValue4;
    protected String filterValue5;
    protected String password;
    protected String propertyName;
    protected String propertyValue;
    protected String username;

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
     * Gets the value of the filterCount property.
     * 
     */
    public int getFilterCount() {
        return filterCount;
    }

    /**
     * Sets the value of the filterCount property.
     * 
     */
    public void setFilterCount(int value) {
        this.filterCount = value;
    }

    /**
     * Gets the value of the filterName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName1() {
        return filterName1;
    }

    /**
     * Sets the value of the filterName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName1(String value) {
        this.filterName1 = value;
    }

    /**
     * Gets the value of the filterName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName2() {
        return filterName2;
    }

    /**
     * Sets the value of the filterName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName2(String value) {
        this.filterName2 = value;
    }

    /**
     * Gets the value of the filterName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName3() {
        return filterName3;
    }

    /**
     * Sets the value of the filterName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName3(String value) {
        this.filterName3 = value;
    }

    /**
     * Gets the value of the filterName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName4() {
        return filterName4;
    }

    /**
     * Sets the value of the filterName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName4(String value) {
        this.filterName4 = value;
    }

    /**
     * Gets the value of the filterName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName5() {
        return filterName5;
    }

    /**
     * Sets the value of the filterName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName5(String value) {
        this.filterName5 = value;
    }

    /**
     * Gets the value of the filterValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue1() {
        return filterValue1;
    }

    /**
     * Sets the value of the filterValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue1(String value) {
        this.filterValue1 = value;
    }

    /**
     * Gets the value of the filterValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue2() {
        return filterValue2;
    }

    /**
     * Sets the value of the filterValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue2(String value) {
        this.filterValue2 = value;
    }

    /**
     * Gets the value of the filterValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue3() {
        return filterValue3;
    }

    /**
     * Sets the value of the filterValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue3(String value) {
        this.filterValue3 = value;
    }

    /**
     * Gets the value of the filterValue4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue4() {
        return filterValue4;
    }

    /**
     * Sets the value of the filterValue4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue4(String value) {
        this.filterValue4 = value;
    }

    /**
     * Gets the value of the filterValue5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue5() {
        return filterValue5;
    }

    /**
     * Sets the value of the filterValue5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue5(String value) {
        this.filterValue5 = value;
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
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyValue(String value) {
        this.propertyValue = value;
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
