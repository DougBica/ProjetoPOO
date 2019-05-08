package br.doug.Projeto.Teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.doug.Projeto.DAO.GenericDAO;
import br.doug.Projeto.DAO.InterfaceDAO;
import br.doug.Projeto.Entidades.Usuario;

public class Teste {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setNome("Douglas");

		
		InterfaceDAO<Usuario> dao = new GenericDAO<Usuario>(); 
		dao.inserir(u);
		List<Usuario> usuList = dao.listar(u);
		
		
		Map<String,Object> argumentos =  new HashMap<String, Object>();
		
		argumentos.put("nome","Douglas");
		String where = "where t.nome = :nome ";
		
		InterfaceDAO<Usuario> usuDAO = new  GenericDAO<Usuario>();
		
		usuList = usuDAO.listarwhere(u, where, argumentos);
		
//		for (String indice : argumentos.keySet()) {
//			System.out.printf(indice,argumentos.get(indice));
//		}
		
		for(Usuario us: usuList) {
			System.out.println(us.getNome());
		}
	}

}
