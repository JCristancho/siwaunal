package edu.jncl.siwaunal1.modelo;
// Generated Aug 31, 2016 1:34:36 PM by Hibernate Tools 4.3.4.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", schema = "public")
public class Log implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idlog;
	private Aspirante aspirante;
	private Date fecha;
	private Date hora;
	private String navegador;
	private String ip;
	private Character estado;

	public Log() {
	}

	public Log(int idlog, Date fecha) {
		this.idlog = idlog;
		this.fecha = fecha;
	}

	public Log(int idlog, Aspirante aspirante, Date fecha, Date hora, String navegador, String ip, Character estado) {
		this.idlog = idlog;
		this.aspirante = aspirante;
		this.fecha = fecha;
		this.hora = hora;
		this.navegador = navegador;
		this.ip = ip;
		this.estado = estado;
	}

	@Id

	@Column(name = "idlog", unique = true, nullable = false)
	public int getIdlog() {
		return this.idlog;
	}

	public void setIdlog(int idlog) {
		this.idlog = idlog;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedulaaspirante")
	public Aspirante getAspirante() {
		return this.aspirante;
	}

	public void setAspirante(Aspirante aspirante) {
		this.aspirante = aspirante;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora", length = 15)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "navegador", length = 45)
	public String getNavegador() {
		return this.navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

	@Column(name = "ip", length = 45)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "estado", length = 1)
	public Character getEstado() {
		return this.estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}