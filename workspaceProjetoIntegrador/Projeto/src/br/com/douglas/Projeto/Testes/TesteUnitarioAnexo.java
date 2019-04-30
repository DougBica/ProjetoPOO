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
//import br.com.douglas.Projeto.entidades.Anexo;
//import br.com.douglas.Projeto.entidades.AnexoId;
//import br.com.douglas.Projeto.entidades.CasoUso;
//import br.com.douglas.Projeto.entidades.Projeto;
//
//public class TesteUnitarioAnexo {
//	CasoUso caso =  new CasoUso();
//	Projeto pro =  new Projeto();
//	List<CasoUso> listaCaso =  new ArrayList<CasoUso>();
//	List<Projeto> listaPro =  new ArrayList<Projeto>();
//	InterfaceDao<CasoUso> casoDAO = new GenericDAO<CasoUso>();
//	InterfaceDao<Projeto> projDAO = new GenericDAO<Projeto>();
//	@Test
//	public void cadastrar() {
//		Anexo anex =  new Anexo();
//		AnexoId anexId =  new AnexoId();
//		listaPro =  projDAO.listar(pro);
//		pro = listaPro.get(4);
//		listaCaso = casoDAO.listar(caso);
//		caso = listaCaso.get(0);
//		caso.setProjeto(pro);
//		anex.setCasoUso(caso);
//		anexId.setCasoUsoCodCasoUso(caso.getId().getCodCasoUso());
//		anexId.setCasoUsoProjetoCodProjeto(caso.getProjeto().getCodProjeto());
//		anexId.setCodAnexo(1);
//		anex.setId(anexId);
//		LocalDate data = LocalDate.now();
//		anex.setDataAnexo(java.sql.Date.valueOf(data));
//	
//		
//		InterfaceDao<Anexo> DAO = new GenericDAO<Anexo>();
//		
//		DAO.inserir(anex);
//		AnexoId i = anex.getId() ;
//		Integer j = i.getCodAnexo();
//		assertEquals(false, j == null);
//	}
//	
//	@Test
//	public void listar() {
//		List<Anexo> lista =  new ArrayList<Anexo>();
//		Anexo anex =  new Anexo();
//		InterfaceDao<Anexo> DAO = new GenericDAO<Anexo>();
//		
//		lista = DAO.listar(anex);
//		
//		assertEquals(false, lista.size() > 0);
//	}
//	
////	@Test
////	public void alterar() {
////		Anexo anex =  new Anexo();
////		AnexoId anexId =  new AnexoId();
////		anexId.setCasoUsoCodCasoUso(1);
////		anexId.setCasoUsoProjetoCodProjeto(16);
////		anexId.setCodAnexo(1);
////		listaCaso = casoDAO.listar(caso);
////		caso = listaCaso.get(0);
////		anex.setCasoUso(caso);
////		anex.setId(anexId);
////		LocalDate data = LocalDate.now().plusDays(5);
////		anex.setDataAnexo(java.sql.Date.valueOf(data));
////		
////		InterfaceDao<Anexo> DAO = new GenericDAO<Anexo>();
////		
////		DAO.alterar(anex);
////		
////		assertEquals(true, anex.getDataAnexo().equals(data) );
////	}
//
//	
//}
