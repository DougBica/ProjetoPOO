package br.com.douglas.Projeto.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
class Fase implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codFases;
	
	private String nomeFase;
	
	public Fase() {
		
	}
	
	public Fase(Integer codFases, String nomeFase) {
		this.codFases = codFases;
		this.nomeFase = nomeFase;
	}

	public int getCodFases() {
		return this.codFases;
	}

	public void setCodFases(Integer codFases) {
		this.codFases = codFases;
	}

	public String getNomeFase() {
		return this.nomeFase;
	}

	public void setNomeFase(String nomeFase) {
		this.nomeFase = nomeFase;
	}

}
