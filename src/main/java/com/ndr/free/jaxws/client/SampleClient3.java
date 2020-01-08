package com.ndr.free.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ndr.free.jaxws.client.stubs.SampleException_Exception;
import com.ndr.free.jaxws.client.stubs.SampleRequest;
import com.ndr.free.jaxws.client.stubs.SampleService3Port;

public class SampleClient3 {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService3?WSDL");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		QName qname = new QName("http://free.ndr.com", "SampleService3");
		Service service = Service.create(url, qname);
		SampleService3Port sampleService3port = service.getPort(SampleService3Port.class);
		boolean boolVar;
		try {
			boolVar = sampleService3port.sampleMetod3();
			System.out.println(boolVar);
		} catch (SampleException_Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		
	}
}
