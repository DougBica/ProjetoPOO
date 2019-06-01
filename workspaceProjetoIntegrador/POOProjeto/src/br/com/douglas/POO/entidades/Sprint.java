package br.com.douglas.POO.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sprint implements Serializable{
	@EmbeddedId
	private SprintPK id;
	
	private Date dataIncReal;
	private Date dataFimReal;

	@ManyToOne
	@JoinColumn(name = "projeto_id", insertable = false, updatable = false)
	private Projeto fkProjeto;
	
	@ManyToOne
	private Release fkRelease;
	

	public Sprint() {
	
	}

	public Sprint(SprintPK id, Date dataIncReal, Date dataFimReal, Projeto fkProjeto, Release fkRelease) {
	
		this.id = id;
		this.dataIncReal = dataIncReal;
		this.dataFimReal = dataFimReal;
		this.fkProjeto = fkProjeto;
		this.fkRelease = fkRelease;
	}

	public Date getDataIncReal() {
		return this.dataIncReal;
	}

	public void setDataIncReal(Date dataIncReal) {
		this.dataIncReal = dataIncReal;
	}

	public Date getDataFimReal() {
		return this.dataFimReal;
	}

	public void setDataFimReal(Date dataFimReal) {
		this.dataFimReal = dataFimReal;
	}
}
