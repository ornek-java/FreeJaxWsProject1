package com.ndr.free.jaxws.main;

import javax.xml.ws.Endpoint;

import com.ndr.free.jaxws.service.SampleService3;

public class SampleServicePublisher3 {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService3", new SampleService3());
	}
	
}
