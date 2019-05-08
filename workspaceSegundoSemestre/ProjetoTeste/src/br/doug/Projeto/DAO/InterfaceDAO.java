package br.doug.Projeto.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface InterfaceDAO<T> {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listar(T t);
	
	public List<T> listarwhere(T t, String where, Map<String,Object> arg);
	
	public void excluir(T t);

}
