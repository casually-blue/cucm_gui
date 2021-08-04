
package org.coramdeoacademy.cucm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLdapSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLdapSearchReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="enableDirectorySearch" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="distinguishedName" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/>
 *         &lt;element name="userSearchBase1" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="userSearchBase2" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="userSearchBase3" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="ldapFilterForUser" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ldapFilterForGroups" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableRecursiveSearch" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="secondary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="tertiary" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLdapSearchReq", propOrder = {
    "uuid",
    "enableDirectorySearch",
    "distinguishedName",
    "password",
    "userSearchBase1",
    "userSearchBase2",
    "userSearchBase3",
    "ldapFilterForUser",
    "ldapFilterForGroups",
    "enableRecursiveSearch",
    "primary",
    "secondary",
    "tertiary"
})
public class UpdateLdapSearchReq
    extends APIRequest
{

    protected String uuid;
    @XmlElementRef(name = "enableDirectorySearch", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enableDirectorySearch;
    protected String distinguishedName;
    protected String password;
    protected String userSearchBase1;
    protected String userSearchBase2;
    protected String userSearchBase3;
    @XmlElementRef(name = "ldapFilterForUser", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> ldapFilterForUser;
    @XmlElementRef(name = "ldapFilterForGroups", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> ldapFilterForGroups;
    @XmlElement(defaultValue = "false")
    protected String enableRecursiveSearch;
    @XmlElementRef(name = "primary", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> primary;
    @XmlElementRef(name = "secondary", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> secondary;
    @XmlElementRef(name = "tertiary", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> tertiary;

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

    /**
     * Gets the value of the enableDirectorySearch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnableDirectorySearch() {
        return enableDirectorySearch;
    }

    /**
     * Sets the value of the enableDirectorySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnableDirectorySearch(JAXBElement<String> value) {
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
     * Gets the value of the ldapFilterForUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLdapFilterForUser() {
        return ldapFilterForUser;
    }

    /**
     * Sets the value of the ldapFilterForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLdapFilterForUser(JAXBElement<XFkType> value) {
        this.ldapFilterForUser = value;
    }

    /**
     * Gets the value of the ldapFilterForGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLdapFilterForGroups() {
        return ldapFilterForGroups;
    }

    /**
     * Sets the value of the ldapFilterForGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLdapFilterForGroups(JAXBElement<XFkType> value) {
        this.ldapFilterForGroups = value;
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPrimary(JAXBElement<XFkType> value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSecondary(JAXBElement<XFkType> value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the tertiary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getTertiary() {
        return tertiary;
    }

    /**
     * Sets the value of the tertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setTertiary(JAXBElement<XFkType> value) {
        this.tertiary = value;
    }

}
