package com.ndr.free.jaxws.main;

import javax.xml.ws.Endpoint;

import com.ndr.free.jaxws.service.SampleService2;

public class SampleServicePublisher2 {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService2", new SampleService2());
	}
}
