package com.ndr.free.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ndr.free.jaxws.client.stubs.SampleService1;
import com.ndr.free.jaxws.client.stubs.SampleService1Port;

public class SampleClient1 {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService1?WSDL");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qname = new QName("http://free.ndr.com", "SampleService1");
		Service service = Service.create(url, qname);
		SampleService1Port sampleService1port = service.getPort(SampleService1Port.class);
		System.out.println(sampleService1port.sampleMetod());
	}
	
}
