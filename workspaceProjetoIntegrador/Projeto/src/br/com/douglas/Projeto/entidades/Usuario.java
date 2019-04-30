package br.com.douglas.Projeto.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cpf;
	private String nome;
	private String idLog;
	private String senha;

	@ManyToMany(targetEntity = Projeto.class )
	private Set projetos;

	public Usuario() {
	
	}
	
	public Usuario(String cpf, String nome, String idLog, String senha, Set projetos) {
	
		this.cpf = cpf;
		this.nome = nome;
		this.idLog = idLog;
		this.senha = senha;
		this.projetos = projetos;
	}



	public Set getFkProjeto() {
		return projetos;
	}

	public void setFkProjeto(Set fkProjeto) {
		this.projetos = fkProjeto;
	}

	public Set getProjetos() {
		return projetos;
	}

	public void setProjetos(Set projetos) {
		this.projetos = projetos;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdLog() {
		return this.idLog;
	}

	public void setIdLog(String idLog) {
		this.idLog = idLog;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
