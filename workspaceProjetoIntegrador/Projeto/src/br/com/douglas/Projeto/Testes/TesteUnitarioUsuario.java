package br.com.douglas.Projeto.Testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import br.com.douglas.Projeto.DAO.GenericDAO;
import br.com.douglas.Projeto.DAO.InterfaceDao;
import br.com.douglas.Projeto.Tratamento.Trata;
import br.com.douglas.Projeto.entidades.Usuario;

public class TesteUnitarioUsuario {
	
	@Test
	public void cadastrarUsuario() throws Trata {
		Usuario usu =  new Usuario();
		String cpf = "92332618912";
		try {
			Long cpfInt = Long.valueOf(cpf);
			usu.setCpf(cpf);
		} catch (Trata e) {
			e.printStackTrace();
			throw new Trata("CPF: " + cpf +" contém letras");
		}
		
		try {
			String nome = "Douglas";
			Pattern p = Pattern.compile("[0-9]");
			Matcher m = p.matcher(nome);
			
			if(m.find()) {
				throw new Trata("Nome:" + nome + " contém numeros");
			}
			else {
				usu.setNome(nome);				
			}
			
		} catch (Trata e) {
			e.printStackTrace();
		}
		usu.setIdLog ("doug");
		
		try {
			String senha = "123456";
			if(senha.length() < 3 || senha.length() > 14) {
				throw new Trata("'" + senha + "menor que 3 ou maior que 14 caracteres");
			}
			else {
				usu.setSenha(senha);				
			}
		} catch (Trata e) {
			e.printStackTrace();
		}
		
		InterfaceDao<Usuario> usuDAO = new GenericDAO<Usuario>();
		
		usuDAO.inserir(usu);
		
		assertEquals(false, usu.getCpf().equals(null));
	}
	
	@Test
	public void listarUsuarios() {
		Usuario us = new Usuario();
		List<Usuario> usu =  new ArrayList<Usuario>();
		
		InterfaceDao<Usuario> usuDAO = new GenericDAO<Usuario>();
		
		usu = usuDAO.listar(us);
		
		assertEquals(true, usu.size() > 0);
	}
	
	@Test
	public void alterarUsuario() {
		Usuario usu = new Usuario();
		usu.setCpf("12312312312");
		usu.setNome("XXXXX");
		usu.setIdLog ("jj");
		usu.setSenha("1111567");
		
		InterfaceDao<Usuario> usuDAO = new GenericDAO<Usuario>();
		
		usuDAO.alterar(usu);
		
		assertEquals(true, usu.getIdLog().equals("jj"));
	}

	
}
