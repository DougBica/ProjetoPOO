package br.com.douglas.POO.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class AnexoPK implements Serializable {
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "cod_casoUso"),
		@JoinColumn(name = "projeto_id")
	})
	private CasoUso casoUsoPk;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cod_anexo;
	
	

	public AnexoPK(CasoUso casoUsoPk, Integer cod_anexo) {
		
		this.casoUsoPk = casoUsoPk;
		this.cod_anexo = cod_anexo;
	}

	public AnexoPK() {
		
	}

	public CasoUso getCasoUsoPk() {
		return casoUsoPk;
	}

	public void setCasoUsoPk(CasoUso casoUsoPk) {
		this.casoUsoPk = casoUsoPk;
	}

	public Integer getSeq() {
		return cod_anexo;
	}

	public void setSeq(Integer seq) {
		this.cod_anexo = seq;
	}
}
