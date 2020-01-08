package com.ndr.free.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ndr.free.jaxws.client.stubs.SampleRequest;
import com.ndr.free.jaxws.client.stubs.SampleResponse;
import com.ndr.free.jaxws.client.stubs.SampleService2Port;

public class SampleClient2 {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService2?WSDL");
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		QName qname = new QName("http://free.ndr.com", "SampleService2");
		Service service = Service.create(url, qname);
		SampleService2Port sampleService2port = service.getPort(SampleService2Port.class);
		SampleRequest sampleRequest = new SampleRequest();
		sampleRequest.setSampleStrProperty("Hello World!");
		SampleResponse sampleResponse =sampleService2port.sampleMetod2(sampleRequest); 
		System.out.println(sampleResponse.getSampleStrProperty());
		
	}
}
