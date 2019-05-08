package br.doug.Projeto.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.doug.Projeto.Entidades.Carro;

public class CarroDAO implements InterfaceDAO<Carro>{
	
	public void inserir(Carro car) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(car);
		em.getTransaction().commit();
	}
	public void alterar (Carro car) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(car);
		em.getTransaction().commit();
	}
	public void excluir(Carro car) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(car);
		em.getTransaction().commit();
	}
	public List<Carro> listar(Carro car){
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select c from Carro c");
		
		@SuppressWarnings("unchecked")
		List<Carro> carList = q.getResultList();
		em.close();
		return carList;
	}
//	@Override
//	public List<Carro> listarwhere(Carro t) {
//		EntityManager em = emf.createEntityManager();
//		//Query q = em.createQuery("select u from " + t.getClass().getName() +" u");
//		Query q = em.createQuery("select t from Carro t where t.placa: ");
//		//q.setParameter("placa", "hnc-4845");
//		
//		
//		
//		@SuppressWarnings("unchecked")
//		List<T> list = q.getResultList();
//		em.close();
//		return list;
//	}
	@Override
	public List<Carro> listarwhere(Carro t, String where, Map<String, Object> arg) {
		// TODO Auto-generated method stub
		return null;
	}
}
