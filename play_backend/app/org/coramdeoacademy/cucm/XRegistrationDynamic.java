
package org.coramdeoacademy.cucm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRegistrationDynamic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRegistrationDynamic">
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRegistrationDynamic", propOrder = {
    "device",
    "lastKnownIpAddress",
    "lastKnownUcm",
    "lastKnownConfigVersion",
    "locationDetails",
    "endpointConnection",
    "portOrSsid",
    "lastSeen"
})
public class XRegistrationDynamic {

    protected XFkType device;
    protected String lastKnownIpAddress;
    protected String lastKnownUcm;
    @XmlElementRef(name = "lastKnownConfigVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastKnownConfigVersion;
    @XmlElementRef(name = "locationDetails", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDetails;
    @XmlElementRef(name = "endpointConnection", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointConnection;
    protected String portOrSsid;
    protected String lastSeen;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastKnownConfigVersion() {
        return lastKnownConfigVersion;
    }

    /**
     * Sets the value of the lastKnownConfigVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastKnownConfigVersion(JAXBElement<String> value) {
        this.lastKnownConfigVersion = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDetails(JAXBElement<String> value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the endpointConnection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointConnection() {
        return endpointConnection;
    }

    /**
     * Sets the value of the endpointConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointConnection(JAXBElement<String> value) {
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

}
