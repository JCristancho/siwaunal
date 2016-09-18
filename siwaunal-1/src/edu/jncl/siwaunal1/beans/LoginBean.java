package edu.jncl.siwaunal1.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.jncl.siwaunal1.controlador.AspiranteC;

@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean {

	private Integer cedula;
		
	@EJB
	private AspiranteC aspiranteC;
	private NavigationBean nb= new NavigationBean();
		
	public void validar(){		
		nb.setDestino("aspirantesList");
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}		
	
}
