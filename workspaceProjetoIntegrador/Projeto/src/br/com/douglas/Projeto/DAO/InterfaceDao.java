package br.com.douglas.Projeto.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface InterfaceDao<T> {
	
	static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("Projeto");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listar(T t);
	
	public List<T> listarwhere(T t, String where, Map<String,Object> arg);


}
