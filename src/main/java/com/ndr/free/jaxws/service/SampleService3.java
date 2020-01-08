package com.ndr.free.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ndr.free.jaxws.model.SampleException;
import com.ndr.free.jaxws.model.SampleException;

@WebService(serviceName="SampleService3", name="SampleService3Port", targetNamespace="http://free.ndr.com")
public class SampleService3 {

	@WebMethod
	public @WebResult(name="sampleResponse") boolean sampleMetod3() throws  SampleException
	{
		SampleException sampleException = new SampleException("Error!");
		if (true) throw sampleException;
		return false;
	}
}
