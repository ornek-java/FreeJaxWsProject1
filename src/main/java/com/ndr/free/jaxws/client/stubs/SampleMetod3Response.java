
package com.ndr.free.jaxws.client.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampleMetod3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampleMetod3Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleMetod3Response", propOrder = {
    "sampleResponse"
})
public class SampleMetod3Response {

    protected boolean sampleResponse;

    /**
     * Gets the value of the sampleResponse property.
     * 
     */
    public boolean isSampleResponse() {
        return sampleResponse;
    }

    /**
     * Sets the value of the sampleResponse property.
     * 
     */
    public void setSampleResponse(boolean value) {
        this.sampleResponse = value;
    }

}
