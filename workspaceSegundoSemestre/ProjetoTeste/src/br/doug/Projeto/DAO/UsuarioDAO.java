package br.doug.Projeto.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.doug.Projeto.Entidades.Usuario;

public class UsuarioDAO implements InterfaceDAO<Usuario>{
	
	public void inserir(Usuario usu) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usu);
		em.getTransaction().commit();
	}
	
	public void alterar(Usuario usu) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usu);
		em.getTransaction().commit();	
	}
	
	public List<Usuario> listar (Usuario us){
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select u from Usuario u");
		
		@SuppressWarnings("unchecked")
		List<Usuario> usuList = q.getResultList();
		em.close();
		return usuList;
	}
	
	public void excluir(Usuario usu) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(usu);
		em.getTransaction().commit();
	}

	@Override
	public List<Usuario> listarwhere(Usuario t, String where, Map<String, Object> arg) {
		// TODO Auto-generated method stub
		return null;
	}
}
