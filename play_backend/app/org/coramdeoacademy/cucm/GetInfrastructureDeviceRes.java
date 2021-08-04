
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInfrastructureDeviceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInfrastructureDeviceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}RInfrastructureDevice"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfrastructureDeviceRes", propOrder = {
    "_return"
})
public class GetInfrastructureDeviceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetInfrastructureDeviceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetInfrastructureDeviceRes.Return }
     *     
     */
    public GetInfrastructureDeviceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfrastructureDeviceRes.Return }
     *     
     */
    public void setReturn(GetInfrastructureDeviceRes.Return value) {
        this._return = value;
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
     *       &lt;sequence>
     *         &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}RInfrastructureDevice"/>
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
        "infrastructureDevice"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RInfrastructureDevice infrastructureDevice;

        /**
         * Gets the value of the infrastructureDevice property.
         * 
         * @return
         *     possible object is
         *     {@link RInfrastructureDevice }
         *     
         */
        public RInfrastructureDevice getInfrastructureDevice() {
            return infrastructureDevice;
        }

        /**
         * Sets the value of the infrastructureDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link RInfrastructureDevice }
         *     
         */
        public void setInfrastructureDevice(RInfrastructureDevice value) {
            this.infrastructureDevice = value;
        }

    }

}
