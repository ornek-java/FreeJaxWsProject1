
package com.ndr.free.jaxws.client.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ndr.free.jaxws.client.stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SampleException_QNAME = new QName("http://free.ndr.com", "SampleException");
    private final static QName _SampleMetod3Response_QNAME = new QName("http://free.ndr.com", "sampleMetod3Response");
    private final static QName _SampleMetod3_QNAME = new QName("http://free.ndr.com", "sampleMetod3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ndr.free.jaxws.client.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SampleMetod3 }
     * 
     */
    public SampleMetod3 createSampleMetod3() {
        return new SampleMetod3();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link SampleMetod3Response }
     * 
     */
    public SampleMetod3Response createSampleMetod3Response() {
        return new SampleMetod3Response();
    }

    /**
     * Create an instance of {@link SampleException }
     * 
     */
    public SampleException createSampleException() {
        return new SampleException();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://free.ndr.com", name = "SampleException")
    public JAXBElement<SampleException> createSampleException(SampleException value) {
        return new JAXBElement<SampleException>(_SampleException_QNAME, SampleException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleMetod3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://free.ndr.com", name = "sampleMetod3Response")
    public JAXBElement<SampleMetod3Response> createSampleMetod3Response(SampleMetod3Response value) {
        return new JAXBElement<SampleMetod3Response>(_SampleMetod3Response_QNAME, SampleMetod3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleMetod3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://free.ndr.com", name = "sampleMetod3")
    public JAXBElement<SampleMetod3> createSampleMetod3(SampleMetod3 value) {
        return new JAXBElement<SampleMetod3>(_SampleMetod3_QNAME, SampleMetod3 .class, null, value);
    }

}
