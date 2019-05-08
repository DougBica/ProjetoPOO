package br.doug.Projeto.RotinasTeste;

import org.junit.jupiter.api.Test;

import br.doug.Projeto.DAO.GenericDAO;
import br.doug.Projeto.DAO.InterfaceDAO;
import br.doug.Projeto.Entidades.Usuario;

public class TesteAutomatizado {
	
	
	@Test
	public void deveriaCadastrarUsuario() {
		
		
		Usuario usu = new Usuario();
		
		usu.setLogin("123456");
		usu.setNome("Jose");
		usu.setSenha("5555");
		
		InterfaceDAO<Usuario> usuDAO = new GenericDAO<Usuario>();
		usuDAO.inserir(usu);
		
		
	}

}
