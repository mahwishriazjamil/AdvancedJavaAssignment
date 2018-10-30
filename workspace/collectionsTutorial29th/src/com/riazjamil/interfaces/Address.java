package com.riazjamil.interfaces;

public class Address implements Printable {

	private String firstLine;
	private String secondLine;
	private String postcode;

	public Address(String firstLine, String secondLine, String postcode) {
		super();
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.postcode = postcode;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}



}
