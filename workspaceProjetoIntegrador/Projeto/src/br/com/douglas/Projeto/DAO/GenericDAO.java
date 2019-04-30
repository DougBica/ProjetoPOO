package br.com.douglas.Projeto.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;



public class GenericDAO<T> implements InterfaceDao<T> {

	@Override
	public void inserir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void alterar(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<T> listar(T t) {
		EntityManager em = emf.createEntityManager();
		//Query q = em.createQuery("select u from " + t.getClass().getName() +" u");
		Query q = em.createQuery("from " + t.getClass().getName());
		
		@SuppressWarnings("unchecked")
		List<T> list = q.getResultList();
		em.close();
		return list;
	}
	
	public List<T> listarwhere(T t, String where, Map<String,Object> arg) {
		EntityManager em = emf.createEntityManager();
		//Query q = em.createQuery("select u from " + t.getClass().getName() +" u");
		String nomeClasse = t.getClass().getName();
		String testeMaroto = "select t from " + t.getClass().getName() + " t " + where ;
		Query q = em.createQuery("select t from " + t.getClass().getName() + " t " + where);
		
		
		for (String indice : arg.keySet()) {
			q.setParameter(indice, arg.get(indice));
		}
		
		@SuppressWarnings("unchecked")
		List<T> list = q.getResultList();
		em.close();
		return list;
	}

}
