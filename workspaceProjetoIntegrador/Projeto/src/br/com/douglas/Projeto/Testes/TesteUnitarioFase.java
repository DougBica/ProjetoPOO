//package br.com.douglas.Projeto.Testes;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//
//import br.com.douglas.Projeto.DAO.GenericDAO;
//import br.com.douglas.Projeto.DAO.InterfaceDao;
//import br.com.douglas.Projeto.entidades.Fases;
//
//public class TesteUnitarioFase {
//	
//	@Test
//	public void cadastrar() {
//		Fases fase =  new Fases();
//		fase.setNomeFase("backlog");
//		
//		InterfaceDao<Fases> DAO = new GenericDAO<Fases>();
//		
//		DAO.inserir(fase);
//		Integer i = fase.getCodFases() ;
//		assertEquals(false, i == null);
//	}
//	
//	@Test
//	public void listar() {
//		List<Fases> lista =  new ArrayList<Fases>();
//		Fases fase =  new Fases();
//		InterfaceDao<Fases> DAO = new GenericDAO<Fases>();
//		
//		lista = DAO.listar(fase);
//		
//		assertEquals(true, lista.size() > 0);
//	}
//	
//	@Test
//	public void alterar() {
//		Fases fase =  new Fases();
//		fase.setCodFases(11);
//		fase.setNomeFase("para fazer");
//		
//		InterfaceDao<Fases> DAO = new GenericDAO<Fases>();
//		
//		DAO.alterar(fase);
//		
//		assertEquals(true, fase.getNomeFase().equals("para fazer") );
//	}
//
//	
//}
