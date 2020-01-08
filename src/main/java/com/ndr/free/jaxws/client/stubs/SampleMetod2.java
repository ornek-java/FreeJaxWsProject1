
package com.ndr.free.jaxws.client.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampleMetod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampleMetod2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleRequest2" type="{http://free.ndr.com}sampleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleMetod2", propOrder = {
    "sampleRequest2"
})
public class SampleMetod2 {

    protected SampleRequest sampleRequest2;

    /**
     * Gets the value of the sampleRequest2 property.
     * 
     * @return
     *     possible object is
     *     {@link SampleRequest }
     *     
     */
    public SampleRequest getSampleRequest2() {
        return sampleRequest2;
    }

    /**
     * Sets the value of the sampleRequest2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleRequest }
     *     
     */
    public void setSampleRequest2(SampleRequest value) {
        this.sampleRequest2 = value;
    }

}
