package br.com.douglas.POO.entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = new Persistence().createEntityManagerFactory("Projeto");
		
		EntityManager em = emf.createEntityManager();

	}

}
