package br.com.douglas.POO.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Tramitacao implements Serializable{
	@Id
	private Integer numTramitacao;
	
	@ManyToOne
	private Projeto projetoFK;
	
	@ManyToOne
	private Usuario usuarioFK;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "cod_casoUso", insertable = false, updatable = false),
		@JoinColumn(name = "projeto_id_casoUso", insertable = false, updatable = false),
		@JoinColumn(name = "num_sprint", insertable = false, updatable = false),
		@JoinColumn(name = "projeto_id_sprint", insertable = false, updatable = false),
		@JoinColumn(name = "cod_CasoUsoSprint", insertable = false, updatable = false)	
	})
	private CasoUsoSprint CasoUsoSprintFK;
	
	
	private Date dataTramitacao;
	
	
	
	public Tramitacao() {
	
	}
	public Tramitacao(Integer numTramitacao, Projeto projetoFK, Usuario usuarioFK, CasoUsoSprint casoUsoSprintFK,
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
	public CasoUsoSprint getCasoUsoSprintFK() {
		return CasoUsoSprintFK;
	}
	public void setCasoUsoSprintFK(CasoUsoSprint casoUsoSprintFK) {
		CasoUsoSprintFK = casoUsoSprintFK;
	}
	public Date getDataTramitacao() {
		return dataTramitacao;
	}
	public void setDataTramitacao(Date dataTramitacao) {
		this.dataTramitacao = dataTramitacao;
	}
}
