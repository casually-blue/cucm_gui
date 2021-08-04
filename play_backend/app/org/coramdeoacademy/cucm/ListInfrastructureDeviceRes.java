
package org.coramdeoacademy.cucm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListInfrastructureDeviceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListInfrastructureDeviceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}LInfrastructureDevice" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListInfrastructureDeviceRes", propOrder = {
    "_return"
})
public class ListInfrastructureDeviceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListInfrastructureDeviceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListInfrastructureDeviceRes.Return }
     *     
     */
    public ListInfrastructureDeviceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInfrastructureDeviceRes.Return }
     *     
     */
    public void setReturn(ListInfrastructureDeviceRes.Return value) {
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
     *         &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}LInfrastructureDevice" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<LInfrastructureDevice> infrastructureDevice;

        /**
         * Gets the value of the infrastructureDevice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infrastructureDevice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfrastructureDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LInfrastructureDevice }
         * 
         * 
         */
        public List<LInfrastructureDevice> getInfrastructureDevice() {
            if (infrastructureDevice == null) {
                infrastructureDevice = new ArrayList<LInfrastructureDevice>();
            }
            return this.infrastructureDevice;
        }

    }

}
