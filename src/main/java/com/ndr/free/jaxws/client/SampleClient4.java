package com.ndr.free.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ndr.free.jaxws.client.stubs.SampleService4Port;

public class SampleClient4 {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService4?WSDL");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qname = new QName("http://free.ndr.com", "SampleService4");
		Service service = Service.create(url, qname);
		SampleService4Port sampleService4port = service.getPort(SampleService4Port.class);
		System.out.println(sampleService4port.sampleMetod("Hello world!"));
		
		
	}
}
