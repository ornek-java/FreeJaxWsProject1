
package com.ndr.free.jaxws.client.stubs;

import javax.jws.WebMethod;
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
@WebService(name = "SampleService3Port", targetNamespace = "http://free.ndr.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SampleService3Port {


    /**
     * 
     * @return
     *     returns boolean
     * @throws SampleException_Exception
     */
    @WebMethod
    @WebResult(name = "sampleResponse", targetNamespace = "")
    @RequestWrapper(localName = "sampleMetod3", targetNamespace = "http://free.ndr.com", className = "com.ndr.free.jaxws.client.stubs.SampleMetod3")
    @ResponseWrapper(localName = "sampleMetod3Response", targetNamespace = "http://free.ndr.com", className = "com.ndr.free.jaxws.client.stubs.SampleMetod3Response")
    public boolean sampleMetod3()
        throws SampleException_Exception
    ;

}
