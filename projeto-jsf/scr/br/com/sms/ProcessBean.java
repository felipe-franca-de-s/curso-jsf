package br.com.sms;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProcessBean implements Serializable{

	public String processPage1() {
		System.out.println("Pagina 1");
		return "Success2";
	}
	
	public String processPage2() {
		System.out.println("Pagina 2");
		return "Success1";
	}
}
