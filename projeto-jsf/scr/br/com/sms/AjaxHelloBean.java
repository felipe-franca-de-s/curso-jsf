package br.com.sms;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjaxHelloBean implements Serializable {

//	private static final long serialVersionUID = 1L;

	private String name = "Ajax ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public static long getSerialversionid() { return serialVersionUID; }
	 */

	public String getSayWelcome() {
		if("".equals(name) || name == null) {
			return "";
		} else {			
			return "Mensagem Ajax " + name;
		}
	}

}
