package com.ndr.free.jaxws.main;

import javax.xml.ws.Endpoint;

import com.ndr.free.jaxws.service.SampleService4;

public class SampleServicePublisher4 {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:7001/FreeJaxWsProject1/SampleService4", new SampleService4());
	}
}
