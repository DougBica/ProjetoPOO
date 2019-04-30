package br.com.douglas.Projeto.entidades;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Anexo implements java.io.Serializable {
	@EmbeddedId
	private AnexoPK id;
	
	@Column(name = "sequencial", insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sequencial;
	
	@Column(name = "casoUso_id", insertable = false, updatable = false)
	private CasoUsoPK casoUso;
	
	private Date dataAnexo;
	
	public Anexo() {
	
	}

	public Anexo(AnexoPK id, Integer sequencial, CasoUsoPK casoUso, Date dataAnexo) {
		this.id = id;
		this.sequencial = sequencial;
		this.casoUso = casoUso;
		this.dataAnexo = dataAnexo;
	}

	public Date getDataAnexo() {
		return this.dataAnexo;
	}

	public void setDataAnexo(Date dataAnexo) {
		this.dataAnexo = dataAnexo;
	}
}
