//package br.com.douglas.Projeto.Testes;
//
//import static org.junit.Assert.assertEquals;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//
//import br.com.douglas.Projeto.DAO.GenericDAO;
//import br.com.douglas.Projeto.DAO.InterfaceDao;
//import br.com.douglas.Projeto.entidades.Projeto;
//import br.com.douglas.Projeto.entidades.Tecnologia;
//
//public class TesteUnitarioProjeto {
//	Tecnologia t = new Tecnologia();
//
//	List<Tecnologia> tec = new ArrayList<Tecnologia>();
//	InterfaceDao<Tecnologia> tecDAO = new GenericDAO<Tecnologia>();
//	
//	@Test
//	public void cadastrar() {
//		Projeto proj =  new Projeto();
//		
//		tec = tecDAO.listar(t);
//		proj.setTecnologia(tec.get(1));
//		proj.setNome("projeto");
//		proj.setObjetivo("fazer projeto");
//		LocalDate data = LocalDate.now();
//		proj.setDataIncPrev(java.sql.Date.valueOf(data));
//		proj.setTimeBox(15);
//		
//		InterfaceDao<Projeto> DAO = new GenericDAO<Projeto>();
//		
//		DAO.inserir(proj);
//		Integer i = proj.getCodProjeto() ;
//		assertEquals(false, i == null);
//	}
//	
//	@Test
//	public void listar() {
//		List<Projeto> lista =  new ArrayList<Projeto>();
//		Projeto proj =  new Projeto();
//		proj.setCodProjeto(1);
//		
//		InterfaceDao<Projeto> DAO = new GenericDAO<Projeto>();
//		
//		lista = DAO.listar(proj);
//		
//		assertEquals(true, lista.size() > 0);
//	}
//	
//	@Test
//	public void alterar() {
//		Projeto proj =  new Projeto();
//		tec = tecDAO.listar(t);
//		
//		proj.setCodProjeto(6);
//		proj.setTecnologia(tec.get(1));
//		proj.setTimeBox(25);
//		proj.setObjetivo("alterar tudo");
//		
//		InterfaceDao<Projeto> DAO = new GenericDAO<Projeto>();
//		
//		DAO.alterar(proj);
//		
//		assertEquals(true, proj.getTimeBox() == 25 );
//	}
//
//
//}
