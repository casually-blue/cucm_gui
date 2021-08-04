
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LWirelessAccessPointControllers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LWirelessAccessPointControllers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snmpVersion" type="{http://www.cisco.com/AXL/API/11.5}XSNMPVersion" minOccurs="0"/>
 *         &lt;element name="snmpUserIdOrCommunityString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snmpAuthenticationProtocol" type="{http://www.cisco.com/AXL/API/11.5}XSNMPAuthenticationProtocol" minOccurs="0"/>
 *         &lt;element name="snmpAuthenticationPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snmpPrivacyProtocol" type="{http://www.cisco.com/AXL/API/11.5}XSNMPPrivacyProtocol" minOccurs="0"/>
 *         &lt;element name="snmpPrivacyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncNow" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="syncStatus" type="{http://www.cisco.com/AXL/API/11.5}XSyncStatus" minOccurs="0"/>
 *         &lt;element name="resyncInterval" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/>
 *         &lt;element name="nextSyncTime" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/>
 *         &lt;element name="scheduleUnit" type="{http://www.cisco.com/AXL/API/11.5}XScheduleUnit" minOccurs="0"/>
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
@XmlType(name = "LWirelessAccessPointControllers", propOrder = {
    "name",
    "description",
    "snmpVersion",
    "snmpUserIdOrCommunityString",
    "snmpAuthenticationProtocol",
    "snmpAuthenticationPassword",
    "snmpPrivacyProtocol",
    "snmpPrivacyPassword",
    "syncNow",
    "syncStatus",
    "resyncInterval",
    "nextSyncTime",
    "scheduleUnit"
})
public class LWirelessAccessPointControllers {

    protected String name;
    protected String description;
    protected String snmpVersion;
    protected String snmpUserIdOrCommunityString;
    protected String snmpAuthenticationProtocol;
    protected String snmpAuthenticationPassword;
    protected String snmpPrivacyProtocol;
    protected String snmpPrivacyPassword;
    protected String syncNow;
    protected String syncStatus;
    protected String resyncInterval;
    protected String nextSyncTime;
    protected String scheduleUnit;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpVersion(String value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the snmpUserIdOrCommunityString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpUserIdOrCommunityString() {
        return snmpUserIdOrCommunityString;
    }

    /**
     * Sets the value of the snmpUserIdOrCommunityString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpUserIdOrCommunityString(String value) {
        this.snmpUserIdOrCommunityString = value;
    }

    /**
     * Gets the value of the snmpAuthenticationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpAuthenticationProtocol() {
        return snmpAuthenticationProtocol;
    }

    /**
     * Sets the value of the snmpAuthenticationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpAuthenticationProtocol(String value) {
        this.snmpAuthenticationProtocol = value;
    }

    /**
     * Gets the value of the snmpAuthenticationPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpAuthenticationPassword() {
        return snmpAuthenticationPassword;
    }

    /**
     * Sets the value of the snmpAuthenticationPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpAuthenticationPassword(String value) {
        this.snmpAuthenticationPassword = value;
    }

    /**
     * Gets the value of the snmpPrivacyProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPrivacyProtocol() {
        return snmpPrivacyProtocol;
    }

    /**
     * Sets the value of the snmpPrivacyProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPrivacyProtocol(String value) {
        this.snmpPrivacyProtocol = value;
    }

    /**
     * Gets the value of the snmpPrivacyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPrivacyPassword() {
        return snmpPrivacyPassword;
    }

    /**
     * Sets the value of the snmpPrivacyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPrivacyPassword(String value) {
        this.snmpPrivacyPassword = value;
    }

    /**
     * Gets the value of the syncNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncNow() {
        return syncNow;
    }

    /**
     * Sets the value of the syncNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncNow(String value) {
        this.syncNow = value;
    }

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStatus(String value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the resyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResyncInterval() {
        return resyncInterval;
    }

    /**
     * Sets the value of the resyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResyncInterval(String value) {
        this.resyncInterval = value;
    }

    /**
     * Gets the value of the nextSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSyncTime() {
        return nextSyncTime;
    }

    /**
     * Sets the value of the nextSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextSyncTime(String value) {
        this.nextSyncTime = value;
    }

    /**
     * Gets the value of the scheduleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleUnit() {
        return scheduleUnit;
    }

    /**
     * Sets the value of the scheduleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleUnit(String value) {
        this.scheduleUnit = value;
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
