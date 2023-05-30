package com.wiley.springcore.ci;

public class Perrson {
	private String name;
	private int id;
	
	private Cert cert;

	public Perrson(String name, int id, Cert cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return this.name+" : " + this.id+"{"+ this.cert.name+ "}";
	}

}
