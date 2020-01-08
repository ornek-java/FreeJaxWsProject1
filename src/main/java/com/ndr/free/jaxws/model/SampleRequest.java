package com.ndr.free.jaxws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleRequest {

	private String sampleStrProperty;

	public String getSampleStrProperty() {
		return sampleStrProperty;
	}

	public void setSampleStrProperty(String sampleStrProperty) {
		this.sampleStrProperty = sampleStrProperty;
	}
	
	
}
