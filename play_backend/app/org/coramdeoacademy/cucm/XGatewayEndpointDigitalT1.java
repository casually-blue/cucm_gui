
package org.coramdeoacademy.cucm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XGatewayEndpointDigitalT1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewayEndpointDigitalT1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}UniqueString128"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/11.5}XProduct"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/11.5}XClass"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/11.5}XDeviceProtocol"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/11.5}XProtocolSide"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/11.5}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/11.5}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/11.5}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/11.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="sendGeoLocation" type="{http://www.cisco.com/AXL/API/11.5}boolean"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="v150" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="port" type="{http://www.cisco.com/AXL/API/11.5}XT1Port" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trunkSelectionOrder" type="{http://www.cisco.com/AXL/API/11.5}XTrunkSelectionOrder"/>
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/11.5}XClockReference"/>
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/11.5}XCSUParam"/>
 *         &lt;element name="digitSending" type="{http://www.cisco.com/AXL/API/11.5}XDigitSending"/>
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/11.5}XEncode"/>
 *         &lt;element name="fdlChannel" type="{http://www.cisco.com/AXL/API/11.5}XFDLChannel"/>
 *         &lt;element name="yellowAlarm" type="{http://www.cisco.com/AXL/API/11.5}XYellowAlarm"/>
 *         &lt;element name="zeroSupression" type="{http://www.cisco.com/AXL/API/11.5}XZeroSuppression"/>
 *         &lt;element name="smdiBasePort" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/>
 *         &lt;element name="handleDtmfPrecedenceSignals" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="encodeOutboundVoiceRouteClass" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="routeClassSignalling" type="{http://www.cisco.com/AXL/API/11.5}XStatus"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/11.5}XCALMode"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="connectCallBeforePlayingAnnouncement" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatewayEndpointDigitalT1", propOrder = {
    "index",
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "traceFlag",
    "mlppDomainId",
    "mlppIndicationStatus",
    "preemption",
    "useTrustedRelayPoint",
    "retryVideoCallAsAudio",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "sendGeoLocation",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "v150",
    "geoLocationFilterName",
    "ports",
    "trunkSelectionOrder",
    "clockReference",
    "csuParam",
    "digitSending",
    "pcmType",
    "fdlChannel",
    "yellowAlarm",
    "zeroSupression",
    "smdiBasePort",
    "handleDtmfPrecedenceSignals",
    "encodeOutboundVoiceRouteClass",
    "routeClassSignalling",
    "pstnAccess",
    "imeE164TransformationName",
    "confidentialAccess",
    "connectCallBeforePlayingAnnouncement"
})
public class XGatewayEndpointDigitalT1 {

    @XmlElement(defaultValue = "0")
    protected String index;
    protected String name;
    protected String description;
    protected String product;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    @XmlElement(defaultValue = "User")
    protected String protocolSide;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> devicePoolName;
    @XmlElementRef(name = "commonDeviceConfigName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> commonDeviceConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "loadInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<XLoadInformation> loadInformation;
    protected XVendorConfig vendorConfig;
    protected String traceFlag;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElement(defaultValue = "true")
    protected String retryVideoCallAsAudio;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> geoLocationName;
    protected String sendGeoLocation;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCdpnTransformCss;
    @XmlElement(defaultValue = "false")
    protected String v150;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> geoLocationFilterName;
    protected XGatewayEndpointDigitalT1 .Ports ports;
    protected String trunkSelectionOrder;
    protected String clockReference;
    protected String csuParam;
    @XmlElement(defaultValue = "DTMF")
    protected String digitSending;
    protected String pcmType;
    @XmlElement(defaultValue = "None")
    protected String fdlChannel;
    @XmlElement(defaultValue = "F-Bit")
    protected String yellowAlarm;
    @XmlElement(defaultValue = "B8ZS")
    protected String zeroSupression;
    @XmlElement(defaultValue = "0")
    protected String smdiBasePort;
    @XmlElement(defaultValue = "false")
    protected String handleDtmfPrecedenceSignals;
    @XmlElement(defaultValue = "false")
    protected String encodeOutboundVoiceRouteClass;
    @XmlElement(defaultValue = "Off")
    protected String routeClassSignalling;
    @XmlElement(defaultValue = "true")
    protected String pstnAccess;
    @XmlElementRef(name = "imeE164TransformationName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> imeE164TransformationName;
    protected XGatewayEndpointDigitalT1 .ConfidentialAccess confidentialAccess;
    protected String connectCallBeforePlayingAnnouncement;
    @XmlAttribute(name = "ctiid")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolSide(String value) {
        this.protocolSide = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDevicePoolName(JAXBElement<XFkType> value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCommonDeviceConfigName(JAXBElement<XFkType> value) {
        this.commonDeviceConfigName = value;
    }

    /**
     * Gets the value of the networkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocation() {
        return networkLocation;
    }

    /**
     * Sets the value of the networkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocation(String value) {
        this.networkLocation = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMediaResourceListName(JAXBElement<XFkType> value) {
        this.mediaResourceListName = value;
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAutomatedAlternateRoutingCssName(JAXBElement<XFkType> value) {
        this.automatedAlternateRoutingCssName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAarNeighborhoodName(JAXBElement<XFkType> value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public JAXBElement<XLoadInformation> getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public void setLoadInformation(JAXBElement<XLoadInformation> value) {
        this.loadInformation = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
    }

    /**
     * Gets the value of the traceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceFlag() {
        return traceFlag;
    }

    /**
     * Sets the value of the traceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceFlag(String value) {
        this.traceFlag = value;
    }

    /**
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppDomainId(JAXBElement<String> value) {
        this.mlppDomainId = value;
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the retryVideoCallAsAudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryVideoCallAsAudio() {
        return retryVideoCallAsAudio;
    }

    /**
     * Sets the value of the retryVideoCallAsAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryVideoCallAsAudio(String value) {
        this.retryVideoCallAsAudio = value;
    }

    /**
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCgpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCss() {
        return useDevicePoolCgpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCss(String value) {
        this.useDevicePoolCgpnTransformCss = value;
    }

    /**
     * Gets the value of the geoLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationName(JAXBElement<XFkType> value) {
        this.geoLocationName = value;
    }

    /**
     * Gets the value of the sendGeoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendGeoLocation() {
        return sendGeoLocation;
    }

    /**
     * Sets the value of the sendGeoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendGeoLocation(String value) {
        this.sendGeoLocation = value;
    }

    /**
     * Gets the value of the cdpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCdpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cdpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCdpnTransformCss() {
        return useDevicePoolCdpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCdpnTransformCss(String value) {
        this.useDevicePoolCdpnTransformCss = value;
    }

    /**
     * Gets the value of the v150 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV150() {
        return v150;
    }

    /**
     * Sets the value of the v150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV150(String value) {
        this.v150 = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationFilterName(JAXBElement<XFkType> value) {
        this.geoLocationFilterName = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalT1 .Ports }
     *     
     */
    public XGatewayEndpointDigitalT1 .Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalT1 .Ports }
     *     
     */
    public void setPorts(XGatewayEndpointDigitalT1 .Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the trunkSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkSelectionOrder() {
        return trunkSelectionOrder;
    }

    /**
     * Sets the value of the trunkSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkSelectionOrder(String value) {
        this.trunkSelectionOrder = value;
    }

    /**
     * Gets the value of the clockReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockReference() {
        return clockReference;
    }

    /**
     * Sets the value of the clockReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockReference(String value) {
        this.clockReference = value;
    }

    /**
     * Gets the value of the csuParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsuParam() {
        return csuParam;
    }

    /**
     * Sets the value of the csuParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsuParam(String value) {
        this.csuParam = value;
    }

    /**
     * Gets the value of the digitSending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitSending() {
        return digitSending;
    }

    /**
     * Sets the value of the digitSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitSending(String value) {
        this.digitSending = value;
    }

    /**
     * Gets the value of the pcmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcmType() {
        return pcmType;
    }

    /**
     * Sets the value of the pcmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcmType(String value) {
        this.pcmType = value;
    }

    /**
     * Gets the value of the fdlChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdlChannel() {
        return fdlChannel;
    }

    /**
     * Sets the value of the fdlChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdlChannel(String value) {
        this.fdlChannel = value;
    }

    /**
     * Gets the value of the yellowAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellowAlarm() {
        return yellowAlarm;
    }

    /**
     * Sets the value of the yellowAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowAlarm(String value) {
        this.yellowAlarm = value;
    }

    /**
     * Gets the value of the zeroSupression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroSupression() {
        return zeroSupression;
    }

    /**
     * Sets the value of the zeroSupression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroSupression(String value) {
        this.zeroSupression = value;
    }

    /**
     * Gets the value of the smdiBasePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmdiBasePort() {
        return smdiBasePort;
    }

    /**
     * Sets the value of the smdiBasePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmdiBasePort(String value) {
        this.smdiBasePort = value;
    }

    /**
     * Gets the value of the handleDtmfPrecedenceSignals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleDtmfPrecedenceSignals() {
        return handleDtmfPrecedenceSignals;
    }

    /**
     * Sets the value of the handleDtmfPrecedenceSignals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleDtmfPrecedenceSignals(String value) {
        this.handleDtmfPrecedenceSignals = value;
    }

    /**
     * Gets the value of the encodeOutboundVoiceRouteClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodeOutboundVoiceRouteClass() {
        return encodeOutboundVoiceRouteClass;
    }

    /**
     * Sets the value of the encodeOutboundVoiceRouteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodeOutboundVoiceRouteClass(String value) {
        this.encodeOutboundVoiceRouteClass = value;
    }

    /**
     * Gets the value of the routeClassSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteClassSignalling() {
        return routeClassSignalling;
    }

    /**
     * Sets the value of the routeClassSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteClassSignalling(String value) {
        this.routeClassSignalling = value;
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnAccess(String value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the imeE164TransformationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getImeE164TransformationName() {
        return imeE164TransformationName;
    }

    /**
     * Sets the value of the imeE164TransformationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setImeE164TransformationName(JAXBElement<XFkType> value) {
        this.imeE164TransformationName = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalT1 .ConfidentialAccess }
     *     
     */
    public XGatewayEndpointDigitalT1 .ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalT1 .ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(XGatewayEndpointDigitalT1 .ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the connectCallBeforePlayingAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectCallBeforePlayingAnnouncement() {
        return connectCallBeforePlayingAnnouncement;
    }

    /**
     * Sets the value of the connectCallBeforePlayingAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectCallBeforePlayingAnnouncement(String value) {
        this.connectCallBeforePlayingAnnouncement = value;
    }

    /**
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/11.5}XCALMode"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confidentialAccessMode",
        "confidentialAccessLevel"
    })
    public static class ConfidentialAccess {

        @XmlElementRef(name = "confidentialAccessMode", type = JAXBElement.class, required = false)
        protected JAXBElement<String> confidentialAccessMode;
        @XmlElementRef(name = "confidentialAccessLevel", type = JAXBElement.class, required = false)
        protected JAXBElement<String> confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessMode(JAXBElement<String> value) {
            this.confidentialAccessMode = value;
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessLevel(JAXBElement<String> value) {
            this.confidentialAccessLevel = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/11.5}XT1Port" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "port"
    })
    public static class Ports {

        protected List<XT1Port> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XT1Port }
         * 
         * 
         */
        public List<XT1Port> getPort() {
            if (port == null) {
                port = new ArrayList<XT1Port>();
            }
            return this.port;
        }

    }

}
