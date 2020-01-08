
package com.ndr.free.jaxws.client.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleStrProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleRequest", propOrder = {
    "sampleStrProperty"
})
public class SampleRequest {

    protected String sampleStrProperty;

    /**
     * Gets the value of the sampleStrProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleStrProperty() {
        return sampleStrProperty;
    }

    /**
     * Sets the value of the sampleStrProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleStrProperty(String value) {
        this.sampleStrProperty = value;
    }

}
