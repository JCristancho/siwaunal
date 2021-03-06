package edu.jncl.siwaunal1.modelo;
// Generated Aug 31, 2016 1:34:36 PM by Hibernate Tools 4.3.4.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name = "departamento", schema = "public")
public class Departamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int iddepartamento;
	private String nombre;
	private Character estado;
	private Set<Ciudad> ciudads = new HashSet<Ciudad>(0);
	private Set<Aspirante> aspirantes = new HashSet<Aspirante>(0);

	public Departamento() {
	}

	public Departamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public Departamento(int iddepartamento, String nombre, Character estado, Set<Ciudad> ciudads,
			Set<Aspirante> aspirantes) {
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
		this.estado = estado;
		this.ciudads = ciudads;
		this.aspirantes = aspirantes;
	}

	@Id

	@Column(name = "iddepartamento", unique = true, nullable = false)
	public int getIddepartamento() {
		return this.iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estado", length = 1)
	public Character getEstado() {
		return this.estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	public Set<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(Set<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	public Set<Aspirante> getAspirantes() {
		return this.aspirantes;
	}

	public void setAspirantes(Set<Aspirante> aspirantes) {
		this.aspirantes = aspirantes;
	}

}
