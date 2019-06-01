package br.com.douglas.POO.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Entity
public class Anexo implements Serializable{
	@EmbeddedId
	private AnexoPK id;
	
	
	private Integer sequencial;
	

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "cod_casoUso", insertable = false, updatable = false),
		@JoinColumn(name = "projeto_id", insertable = false, updatable = false)
	})
	private CasoUso casoUso;
	
	private Date dataAnexo;
	
	public Anexo(AnexoPK id, Integer sequencial, CasoUso casoUso, Date dataAnexo) {
		super();
		this.id = id;
		this.sequencial = sequencial;
		this.casoUso = casoUso;
		this.dataAnexo = dataAnexo;
	}
	
	public Anexo() {
	
	}


	public AnexoPK getId() {
		return id;
	}

	public void setId(AnexoPK id) {
		this.id = id;
	}

	public CasoUso getCasoUso() {
		return casoUso;
	}

	public void setCasoUso(CasoUso casoUso) {
		this.casoUso = casoUso;
	}

	public Date getDataAnexo() {
		return this.dataAnexo;
	}

	public void setDataAnexo(Date dataAnexo) {
		this.dataAnexo = dataAnexo;
	}
}
