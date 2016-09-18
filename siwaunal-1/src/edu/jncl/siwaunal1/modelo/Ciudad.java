package edu.jncl.siwaunal1.modelo;
// Generated Aug 31, 2016 1:34:36 PM by Hibernate Tools 4.3.4.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ciudad generated by hbm2java
 */
@Entity
@Table(name = "ciudad", schema = "public")
public class Ciudad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idciudad;
	private Departamento departamento;
	private String nombre;
	private Character estado;
	private Set<Aspirante> aspirantes = new HashSet<Aspirante>(0);

	public Ciudad() {
	}

	public Ciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	public Ciudad(int idciudad, Departamento departamento, String nombre, Character estado, Set<Aspirante> aspirantes) {
		this.idciudad = idciudad;
		this.departamento = departamento;
		this.nombre = nombre;
		this.estado = estado;
		this.aspirantes = aspirantes;
	}

	@Id

	@Column(name = "idciudad", unique = true, nullable = false)
	public int getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddepartamentociudad")
	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudad")
	public Set<Aspirante> getAspirantes() {
		return this.aspirantes;
	}

	public void setAspirantes(Set<Aspirante> aspirantes) {
		this.aspirantes = aspirantes;
	}

}