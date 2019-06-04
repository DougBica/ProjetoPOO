package br.com.douglas.POO.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tecnologia implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codTecnologia;
	
	private String descricao;
	private Integer produtividadePf;



	public int getCodTecnologia() {
		return this.codTecnologia;
	}

	public void setCodTecnologia(int codTecnologia) {
		this.codTecnologia = codTecnologia;
	}
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getProdutividadePf() {
		return this.produtividadePf;
	}

	public void setProdutividadePf(Integer produtividadePf) {
		this.produtividadePf = produtividadePf;
	}
}
