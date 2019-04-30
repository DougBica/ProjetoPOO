package br.com.douglas.Projeto.entidades;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CasoUsoSprintPK {
	@ManyToOne
	@JoinColumn(name = "casoUso_id")
	private CasoUsoPK casoUsoPk;
	
	@ManyToOne
	@JoinColumn(name = "sprint_id")
	private SprintPK sprintPk;
	
	private Integer cod_CasoUsoSprint;
	
	public CasoUsoSprintPK() {
	
	}
	

	public CasoUsoSprintPK(CasoUsoPK casoUsoPk, SprintPK sprintPk, Integer cod_CasoUsoSprint) {
		this.casoUsoPk = casoUsoPk;
		this.sprintPk = sprintPk;
		this.cod_CasoUsoSprint = cod_CasoUsoSprint;
	}


	public CasoUsoPK getCasoUsoPk() {
		return casoUsoPk;
	}

	public void setCasoUsoPk(CasoUsoPK casoUsoPk) {
		this.casoUsoPk = casoUsoPk;
	}

	public SprintPK getSprintPk() {
		return sprintPk;
	}

	public void setSprintPk(SprintPK sprintPk) {
		this.sprintPk = sprintPk;
	}

	public Integer getCod_CasoUsoSprint() {
		return cod_CasoUsoSprint;
	}

	public void setCod_CasoUsoSprint(Integer cod_CasoUsoSprint) {
		this.cod_CasoUsoSprint = cod_CasoUsoSprint;
	}
	
	

}
