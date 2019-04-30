package br.com.douglas.Projeto.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class SprintPK implements Serializable{
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	
	@Column(name = "num_sprint")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer num_sprint;
	
	public SprintPK() {
		
	}
	
	public SprintPK(Projeto projeto, Integer num_sprint) {
		
		this.projeto = projeto;
		this.num_sprint = num_sprint;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Integer getNum_sprint() {
		return num_sprint;
	}

	public void setNum_sprint(Integer num_sprint) {
		this.num_sprint = num_sprint;
	}


}
