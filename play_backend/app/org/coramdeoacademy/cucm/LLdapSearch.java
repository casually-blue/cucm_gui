
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLdapSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLdapSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="enableDirectorySearch" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="distinguishedName" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/>
 *         &lt;element name="userSearchBase1" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="userSearchBase2" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="userSearchBase3" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="enableRecursiveSearch" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="secondary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="tertiary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LLdapSearch", propOrder = {
    "enableDirectorySearch",
    "distinguishedName",
    "userSearchBase1",
    "userSearchBase2",
    "userSearchBase3",
    "enableRecursiveSearch",
    "primary",
    "secondary",
    "tertiary"
})
public class LLdapSearch {

    protected String enableDirectorySearch;
    protected String distinguishedName;
    protected String userSearchBase1;
    protected String userSearchBase2;
    protected String userSearchBase3;
    protected String enableRecursiveSearch;
    protected XFkType primary;
    protected XFkType secondary;
    protected XFkType tertiary;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the enableDirectorySearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDirectorySearch() {
        return enableDirectorySearch;
    }

    /**
     * Sets the value of the enableDirectorySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDirectorySearch(String value) {
        this.enableDirectorySearch = value;
    }

    /**
     * Gets the value of the distinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     * Sets the value of the distinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinguishedName(String value) {
        this.distinguishedName = value;
    }

    /**
     * Gets the value of the userSearchBase1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSearchBase1() {
        return userSearchBase1;
    }

    /**
     * Sets the value of the userSearchBase1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSearchBase1(String value) {
        this.userSearchBase1 = value;
    }

    /**
     * Gets the value of the userSearchBase2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSearchBase2() {
        return userSearchBase2;
    }

    /**
     * Sets the value of the userSearchBase2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSearchBase2(String value) {
        this.userSearchBase2 = value;
    }

    /**
     * Gets the value of the userSearchBase3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSearchBase3() {
        return userSearchBase3;
    }

    /**
     * Sets the value of the userSearchBase3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSearchBase3(String value) {
        this.userSearchBase3 = value;
    }

    /**
     * Gets the value of the enableRecursiveSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableRecursiveSearch() {
        return enableRecursiveSearch;
    }

    /**
     * Sets the value of the enableRecursiveSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableRecursiveSearch(String value) {
        this.enableRecursiveSearch = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimary(XFkType value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecondary(XFkType value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the tertiary property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTertiary() {
        return tertiary;
    }

    /**
     * Sets the value of the tertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTertiary(XFkType value) {
        this.tertiary = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
