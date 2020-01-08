package com.ndr.free.jaxws.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService(serviceName="SampleService4", name="SampleService4Port", targetNamespace="http://free.ndr.com")
public class SampleService4 {

	@Resource
	private WebServiceContext webServiceContext;
	
	@WebMethod
	public String sampleMetod(String strParam)   
	{
		for(String key: webServiceContext.getMessageContext().keySet()){
			System.out.println(key + " - " +  webServiceContext.getMessageContext().get(key));
		}
		
		return strParam;
	}
}
