package br.com.douglas.Projeto.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ReleasePK implements Serializable{
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	
	@Column(name = "num_release")
	private Integer num_release;
	
	public ReleasePK() {
		
	}

	public ReleasePK(Projeto projeto, Integer num_release) {
		
		this.projeto = projeto;
		this.num_release = num_release;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Integer getNum_release() {
		return num_release;
	}

	public void setNum_release(Integer num_release) {
		this.num_release = num_release;
	}
	
}
