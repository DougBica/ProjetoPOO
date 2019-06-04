package br.com.douglas.POO.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CasoUsoPK implements Serializable {
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	
	
	private Integer cod_casoUso;
	
	public CasoUsoPK() {

	}

	public CasoUsoPK(Projeto projeto, Integer num_casoUso, Integer cod_casoUso) {
		
		this.projeto = projeto;
		this.cod_casoUso = cod_casoUso;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Integer getCod_casoUso() {
		return cod_casoUso;
	}

	public void setCod_casoUso(Integer cod_casoUso) {
		this.cod_casoUso = cod_casoUso;
	}
}
