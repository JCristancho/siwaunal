package edu.jncl.siwaunal1.controlador;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.jncl.siwaunal1.modelo.Aspirante;

@Stateless
public class AspiranteC {

	@PersistenceContext
	EntityManager em;
	
	private Aspirante aspirante;

	public List<Aspirante> findAspirantes() {
		TypedQuery<Aspirante> query = em.createNamedQuery("Aspirante.findAll", Aspirante.class);
		return query.getResultList();
	}
	
	  public AspiranteC() { aspirante = new Aspirante(); }
	  
	  public boolean consultarAspirante(int cedula) { boolean creado = false;
	  aspirante =
	  (Aspirante)this.em.createNamedQuery("Aspirante.findAll").setParameter(
	  "cedula",cedula).getResultList(); return creado; }
	 
}
