
package com.ndr.free.jaxws.client.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SampleService4", targetNamespace = "http://free.ndr.com", wsdlLocation = "http://localhost:7001/FreeJaxWsProject1/SampleService4?WSDL")
public class SampleService4
    extends Service
{

    private final static URL SAMPLESERVICE4_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ndr.free.jaxws.client.stubs.SampleService4 .class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.ndr.free.jaxws.client.stubs.SampleService4 .class.getResource(".");
            url = new URL(baseUrl, "http://localhost:7001/FreeJaxWsProject1/SampleService4?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:7001/FreeJaxWsProject1/SampleService4?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SAMPLESERVICE4_WSDL_LOCATION = url;
    }

    public SampleService4(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SampleService4() {
        super(SAMPLESERVICE4_WSDL_LOCATION, new QName("http://free.ndr.com", "SampleService4"));
    }

    /**
     * 
     * @return
     *     returns SampleService4Port
     */
    @WebEndpoint(name = "SampleService4PortPort")
    public SampleService4Port getSampleService4PortPort() {
        return super.getPort(new QName("http://free.ndr.com", "SampleService4PortPort"), SampleService4Port.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SampleService4Port
     */
    @WebEndpoint(name = "SampleService4PortPort")
    public SampleService4Port getSampleService4PortPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://free.ndr.com", "SampleService4PortPort"), SampleService4Port.class, features);
    }

}
