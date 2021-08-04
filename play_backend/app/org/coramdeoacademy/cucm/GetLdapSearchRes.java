
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSearchRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSearchRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapSearch" type="{http://www.cisco.com/AXL/API/11.5}RLdapSearch"/>
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
@XmlType(name = "GetLdapSearchRes", propOrder = {
    "_return"
})
public class GetLdapSearchRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSearchRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSearchRes.Return }
     *     
     */
    public GetLdapSearchRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSearchRes.Return }
     *     
     */
    public void setReturn(GetLdapSearchRes.Return value) {
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
     *         &lt;element name="ldapSearch" type="{http://www.cisco.com/AXL/API/11.5}RLdapSearch"/>
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
        "ldapSearch"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapSearch ldapSearch;

        /**
         * Gets the value of the ldapSearch property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapSearch }
         *     
         */
        public RLdapSearch getLdapSearch() {
            return ldapSearch;
        }

        /**
         * Sets the value of the ldapSearch property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapSearch }
         *     
         */
        public void setLdapSearch(RLdapSearch value) {
            this.ldapSearch = value;
        }

    }

}
