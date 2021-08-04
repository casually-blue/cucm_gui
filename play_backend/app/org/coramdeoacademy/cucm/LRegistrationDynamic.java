
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRegistrationDynamic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRegistrationDynamic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="device" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="lastKnownIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastKnownUcm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastKnownConfigVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endpointConnection" type="{http://www.cisco.com/AXL/API/11.5}XEndpointConnection" minOccurs="0"/>
 *         &lt;element name="portOrSsid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSeen" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/>
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
@XmlType(name = "LRegistrationDynamic", propOrder = {
    "device",
    "lastKnownIpAddress",
    "lastKnownUcm",
    "lastKnownConfigVersion",
    "locationDetails",
    "endpointConnection",
    "portOrSsid",
    "lastSeen"
})
public class LRegistrationDynamic {

    protected XFkType device;
    protected String lastKnownIpAddress;
    protected String lastKnownUcm;
    protected String lastKnownConfigVersion;
    protected String locationDetails;
    protected String endpointConnection;
    protected String portOrSsid;
    protected String lastSeen;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevice(XFkType value) {
        this.device = value;
    }

    /**
     * Gets the value of the lastKnownIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownIpAddress() {
        return lastKnownIpAddress;
    }

    /**
     * Sets the value of the lastKnownIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownIpAddress(String value) {
        this.lastKnownIpAddress = value;
    }

    /**
     * Gets the value of the lastKnownUcm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownUcm() {
        return lastKnownUcm;
    }

    /**
     * Sets the value of the lastKnownUcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownUcm(String value) {
        this.lastKnownUcm = value;
    }

    /**
     * Gets the value of the lastKnownConfigVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownConfigVersion() {
        return lastKnownConfigVersion;
    }

    /**
     * Sets the value of the lastKnownConfigVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownConfigVersion(String value) {
        this.lastKnownConfigVersion = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetails(String value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the endpointConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointConnection() {
        return endpointConnection;
    }

    /**
     * Sets the value of the endpointConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointConnection(String value) {
        this.endpointConnection = value;
    }

    /**
     * Gets the value of the portOrSsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOrSsid() {
        return portOrSsid;
    }

    /**
     * Sets the value of the portOrSsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOrSsid(String value) {
        this.portOrSsid = value;
    }

    /**
     * Gets the value of the lastSeen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSeen() {
        return lastSeen;
    }

    /**
     * Sets the value of the lastSeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSeen(String value) {
        this.lastSeen = value;
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
