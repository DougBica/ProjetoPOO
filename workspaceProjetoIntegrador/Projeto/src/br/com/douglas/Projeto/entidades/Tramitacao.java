package br.com.douglas.Projeto.entidades;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tramitacao implements java.io.Serializable {

	@Id
	private Integer numTramitacao;
	
	@ManyToOne
	private Projeto projetoFK;
	
	@ManyToOne
	private Usuario usuarioFK;
	
	@ManyToOne
	private CasoUsoSprintPK CasoUsoSprintFK;
	
	
	private Date dataTramitacao;
	
	
	
	public Tramitacao() {
	
	}
	public Tramitacao(Integer numTramitacao, Projeto projetoFK, Usuario usuarioFK, CasoUsoSprintPK casoUsoSprintFK,
			Date dataTramitacao) {
		this.numTramitacao = numTramitacao;
		this.projetoFK = projetoFK;
		this.usuarioFK = usuarioFK;
		CasoUsoSprintFK = casoUsoSprintFK;
		this.dataTramitacao = dataTramitacao;
	}
	public Integer getNumTramitacao() {
		return numTramitacao;
	}
	public void setNumTramitacao(Integer numTramitacao) {
		this.numTramitacao = numTramitacao;
	}

	public Projeto getProjetoFK() {
		return projetoFK;
	}
	public void setProjetoFK(Projeto projetoFK) {
		this.projetoFK = projetoFK;
	}
	public Usuario getUsuarioFK() {
		return usuarioFK;
	}
	public void setUsuarioFK(Usuario usuarioFK) {
		this.usuarioFK = usuarioFK;
	}
	public CasoUsoSprintPK getCasoUsoSprintFK() {
		return CasoUsoSprintFK;
	}
	public void setCasoUsoSprintFK(CasoUsoSprintPK casoUsoSprintFK) {
		CasoUsoSprintFK = casoUsoSprintFK;
	}
	public Date getDataTramitacao() {
		return dataTramitacao;
	}
	public void setDataTramitacao(Date dataTramitacao) {
		this.dataTramitacao = dataTramitacao;
	}



}
