package br.com.sms;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable{
	
	private static final long serialVersionID = 1L;
	
	private String name = "Sr(a): ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}
	
	
	
}
