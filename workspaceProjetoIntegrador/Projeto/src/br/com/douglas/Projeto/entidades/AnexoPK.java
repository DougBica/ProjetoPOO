package br.com.douglas.Projeto.entidades;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AnexoPK {
	@ManyToOne
	@JoinColumn(name = "casoUso_id")
	private CasoUsoPK casoUsoPk;
	
	@JoinColumn(name = "sequencial")
	private Integer seq;
	
	

	public AnexoPK(CasoUsoPK casoUsoPk, Integer seq) {
		
		this.casoUsoPk = casoUsoPk;
		this.seq = seq;
	}

	public AnexoPK() {
		
	}

	public CasoUsoPK getCasoUsoPk() {
		return casoUsoPk;
	}

	public void setCasoUsoPk(CasoUsoPK casoUsoPk) {
		this.casoUsoPk = casoUsoPk;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	
	
}
