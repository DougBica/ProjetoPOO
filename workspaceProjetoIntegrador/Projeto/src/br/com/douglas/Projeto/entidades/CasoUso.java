package br.com.douglas.Projeto.entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class CasoUso implements java.io.Serializable {
	
	@EmbeddedId
	private CasoUsoPK id;
	
	private String nomeCs;
	private String objetivo;
	private Integer prioridade;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sequencial;
	
	@ManyToOne
	@Column(name = "projeto_id", insertable = false, updatable = false)
	private Projeto fkProjeto;
	
	@ManyToOne
	private Fase fkFase;
	
	
	
	public CasoUso() {
	
	}

	public CasoUso(CasoUsoPK id, String nomeCs, String objetivo, Integer prioridade, Integer sequencial,
			Projeto fkProjeto, Fase fkFase) {
	
		this.id = id;
		this.nomeCs = nomeCs;
		this.objetivo = objetivo;
		this.prioridade = prioridade;
		this.sequencial = sequencial;
		this.fkProjeto = fkProjeto;
		this.fkFase = fkFase;
	}

	public Integer getSequencial() {
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		this.sequencial = sequencial;
	}

	public Projeto getFkProjeto() {
		return fkProjeto;
	}

	public void setFkProjeto(Projeto fkProjeto) {
		this.fkProjeto = fkProjeto;
	}

	public Fase getFkFase() {
		return fkFase;
	}

	public void setFkFase(Fase fkFase) {
		this.fkFase = fkFase;
	}

	public String getNomeCs() {
		return this.nomeCs;
	}

	public void setNomeCs(String nomeCs) {
		this.nomeCs = nomeCs;
	}


	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public Integer getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

}
