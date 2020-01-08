package com.ndr.free.jaxws.main;

import javax.xml.ws.Endpoint;

import com.ndr.free.jaxws.service.SampleService1;

public class SampleServicePublisher1 {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService1", new SampleService1());
	}
}
