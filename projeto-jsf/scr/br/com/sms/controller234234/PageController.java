package br.com.sms.controller234234;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PageController /* implements Serializable */ {
	
//	private static final long serialVersionUID = 1L;

	public String moveToPage1() {
		System.out.println("Page 1");
		return "page1";
	}
	
	public String moveToPage2() {
		System.out.println("Page 2");
		return "page2";
	}
}
