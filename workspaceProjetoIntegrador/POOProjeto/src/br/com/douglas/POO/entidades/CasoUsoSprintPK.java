package br.com.douglas.POO.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class CasoUsoSprintPK implements Serializable{
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "cod_casoUso"),
		@JoinColumn(name = "projeto_id_casoUso")
	})
	private CasoUso casoUsoPk;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "num_sprint"),
		@JoinColumn(name = "projeto_id_sprint")
	})
	private Sprint sprintPk;
	
	private Integer cod_CasoUsoSprint;
	
	public CasoUsoSprintPK() {
	
	}
	

	public CasoUsoSprintPK(CasoUso casoUsoPk, Sprint sprintPk, Integer cod_CasoUsoSprint) {
		this.casoUsoPk = casoUsoPk;
		this.sprintPk = sprintPk;
		this.cod_CasoUsoSprint = cod_CasoUsoSprint;
	}


	public CasoUso getCasoUsoPk() {
		return casoUsoPk;
	}

	public void setCasoUsoPk(CasoUso casoUsoPk) {
		this.casoUsoPk = casoUsoPk;
	}

	public Sprint getSprintPk() {
		return sprintPk;
	}

	public void setSprintPk(Sprint sprintPk) {
		this.sprintPk = sprintPk;
	}

	public Integer getCod_CasoUsoSprint() {
		return cod_CasoUsoSprint;
	}

	public void setCod_CasoUsoSprint(Integer cod_CasoUsoSprint) {
		this.cod_CasoUsoSprint = cod_CasoUsoSprint;
	}
}
