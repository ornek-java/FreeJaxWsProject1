
package com.ndr.free.jaxws.client.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampleMetod2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampleMetod2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleResponse2" type="{http://free.ndr.com}sampleResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleMetod2Response", propOrder = {
    "sampleResponse2"
})
public class SampleMetod2Response {

    protected SampleResponse sampleResponse2;

    /**
     * Gets the value of the sampleResponse2 property.
     * 
     * @return
     *     possible object is
     *     {@link SampleResponse }
     *     
     */
    public SampleResponse getSampleResponse2() {
        return sampleResponse2;
    }

    /**
     * Sets the value of the sampleResponse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleResponse }
     *     
     */
    public void setSampleResponse2(SampleResponse value) {
        this.sampleResponse2 = value;
    }

}
