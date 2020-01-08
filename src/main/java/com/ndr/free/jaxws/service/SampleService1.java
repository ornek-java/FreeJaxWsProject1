package com.ndr.free.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="SampleService1", name="SampleService1Port", targetNamespace="http://free.ndr.com")
public class SampleService1 {

	@WebMethod
	public String sampleMetod(){ 
		return "test1";
	}
	
}
