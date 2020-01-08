package com.ndr.free.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ndr.free.jaxws.model.SampleRequest;
import com.ndr.free.jaxws.model.SampleResponse;

@WebService(serviceName="SampleService2", name="SampleService2Port", targetNamespace="http://free.ndr.com")
public class SampleService2 {

	@WebMethod
	public @WebResult(name="sampleResponse2") SampleResponse sampleMetod2(@WebParam(name="sampleRequest2") SampleRequest sampleRequest){
		SampleResponse sampleResponse = new SampleResponse();
		sampleResponse.setSampleStrProperty(sampleRequest.getSampleStrProperty());
		return sampleResponse;
	}
}
