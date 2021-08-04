
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRegistrationDynamicRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRegistrationDynamicRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registrationDynamic" type="{http://www.cisco.com/AXL/API/11.5}RRegistrationDynamic"/>
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
@XmlType(name = "GetRegistrationDynamicRes", propOrder = {
    "_return"
})
public class GetRegistrationDynamicRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRegistrationDynamicRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationDynamicRes.Return }
     *     
     */
    public GetRegistrationDynamicRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationDynamicRes.Return }
     *     
     */
    public void setReturn(GetRegistrationDynamicRes.Return value) {
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
     *         &lt;element name="registrationDynamic" type="{http://www.cisco.com/AXL/API/11.5}RRegistrationDynamic"/>
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
        "registrationDynamic"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRegistrationDynamic registrationDynamic;

        /**
         * Gets the value of the registrationDynamic property.
         * 
         * @return
         *     possible object is
         *     {@link RRegistrationDynamic }
         *     
         */
        public RRegistrationDynamic getRegistrationDynamic() {
            return registrationDynamic;
        }

        /**
         * Sets the value of the registrationDynamic property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRegistrationDynamic }
         *     
         */
        public void setRegistrationDynamic(RRegistrationDynamic value) {
            this.registrationDynamic = value;
        }

    }

}
