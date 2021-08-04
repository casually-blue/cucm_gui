
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneTypeDisplayInstanceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneTypeDisplayInstanceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="productName" type="{http://www.cisco.com/AXL/API/11.5}String32"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/11.5}String32"/>
 *         &lt;element name="trunkType" type="{http://www.cisco.com/AXL/API/11.5}String32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPhoneTypeDisplayInstanceReq", propOrder = {
    "productName",
    "protocol",
    "trunkType"
})
public class GetPhoneTypeDisplayInstanceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String protocol;
    protected String trunkType;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
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
     * Gets the value of the trunkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkType() {
        return trunkType;
    }

    /**
     * Sets the value of the trunkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkType(String value) {
        this.trunkType = value;
    }

}
