package br.com.sms;

import java.io.Serializable;

public class SessionHelloBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name = "Sr(a): ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionid() {
		return serialVersionUID;
	}
	
}
