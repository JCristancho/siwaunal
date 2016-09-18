package edu.jncl.siwaunal1.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="navBean")
@RequestScoped
public class NavigationBean {
	
	private final String index = "login";
	private static final String extension = ".xhtml";
	private String destino;
	
	public NavigationBean() {
		this.destino = index;
	}
	
	public String getDestino() {
		return destino + extension;
	}
	
	public void setDestino(String newDestino) {
		this.destino = newDestino;
	}

}
