
package com.ndr.free.jaxws.client.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SampleService2Port", targetNamespace = "http://free.ndr.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SampleService2Port {


    /**
     * 
     * @param sampleRequest2
     * @return
     *     returns com.ndr.free.jaxws.client.stubs.SampleResponse
     */
    @WebMethod
    @WebResult(name = "sampleResponse2", targetNamespace = "")
    @RequestWrapper(localName = "sampleMetod2", targetNamespace = "http://free.ndr.com", className = "com.ndr.free.jaxws.client.stubs.SampleMetod2")
    @ResponseWrapper(localName = "sampleMetod2Response", targetNamespace = "http://free.ndr.com", className = "com.ndr.free.jaxws.client.stubs.SampleMetod2Response")
    public SampleResponse sampleMetod2(
        @WebParam(name = "sampleRequest2", targetNamespace = "")
        SampleRequest sampleRequest2);

}
