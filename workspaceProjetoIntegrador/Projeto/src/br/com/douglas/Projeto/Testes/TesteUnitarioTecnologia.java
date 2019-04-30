package br.com.douglas.Projeto.Testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.douglas.Projeto.DAO.GenericDAO;
import br.com.douglas.Projeto.DAO.InterfaceDao;
import br.com.douglas.Projeto.entidades.Tecnologia;

public class TesteUnitarioTecnologia {
	
	@Test
	public void cadastrar() {
		Tecnologia tec =  new Tecnologia();
		tec.setDescricao("descriçao");
		tec.setProdutividadePf(12);
		
		InterfaceDao<Tecnologia> DAO = new GenericDAO<Tecnologia>();
		
		DAO.inserir(tec);
		Integer i = tec.getCodTecnologia() ;
		assertEquals(false, i == null);
	}
	
	@Test
	public void listar() {
		List<Tecnologia> teci =  new ArrayList<Tecnologia>();
		Tecnologia tec =  new Tecnologia();
		tec.setDescricao("descriçao");
		tec.setProdutividadePf(12);
		
		InterfaceDao<Tecnologia> DAO = new GenericDAO<Tecnologia>();
		
		teci = DAO.listar(tec);
		
		assertEquals(true, teci.size() > 0);
	}
	
	@Test
	public void alterar() {
		Tecnologia tec =  new Tecnologia();
		tec.setCodTecnologia(1);
		tec.setProdutividadePf(25);
		tec.setDescricao("alterando");
		
		InterfaceDao<Tecnologia> usuDAO = new GenericDAO<Tecnologia>();
		
		usuDAO.alterar(tec);
		
		assertEquals(true, tec.getProdutividadePf() == 25 );
	}

	
}
