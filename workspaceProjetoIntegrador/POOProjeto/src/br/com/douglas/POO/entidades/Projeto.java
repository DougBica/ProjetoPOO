package br.com.douglas.POO.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Projeto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer codProjeto;
	
	private Integer tecnologia;
	private String nome;
	private String objetivo;
	private Date dataIncPrev;
	private Date dataFimPrev;
	private Date dataIncReal;
	private Date dataFimReal;
	private Integer totalFp;
	private LocalTime esforcoHoras;
	private Double esforcoMeses;
	private BigDecimal custoTotal;
	private Integer timeBox;
	
	@ManyToOne
	private Tecnologia fkTecnologia;
	
	@ManyToMany(targetEntity = Usuario.class, mappedBy = "projetos")
	private Set usuarios;

	public Set getUsuarios() {
		return usuarios;
	}
	
	public Projeto() {

	}
	public Projeto(Integer codProjeto, Integer tecnologia, String nome, String objetivo, Date dataIncPrev,
			Date dataFimPrev, Date dataIncReal, Date dataFimReal, Integer totalFp, LocalTime esforcoHoras,
			Double esforcoMeses, BigDecimal custoTotal, Integer timeBox, Tecnologia fkTecnologia, Set usuarios) {
		this.codProjeto = codProjeto;
		this.tecnologia = tecnologia;
		this.nome = nome;
		this.objetivo = objetivo;
		this.dataIncPrev = dataIncPrev;
		this.dataFimPrev = dataFimPrev;
		this.dataIncReal = dataIncReal;
		this.dataFimReal = dataFimReal;
		this.totalFp = totalFp;
		this.esforcoHoras = esforcoHoras;
		this.esforcoMeses = esforcoMeses;
		this.custoTotal = custoTotal;
		this.timeBox = timeBox;
		this.fkTecnologia = fkTecnologia;
		this.usuarios = usuarios;
	}




	public void setUsuarios(Set usuario) {
		this.usuarios = usuarios;
	}

	
	public Double getEsforcoMeses() {
		return esforcoMeses;
	}


	public void setEsforcoMeses(Double esforcoMeses) {
		this.esforcoMeses = esforcoMeses;
	}


	public Tecnologia getFkTecnologia() {
		return fkTecnologia;
	}


	public void setFkTecnologia(Tecnologia fkTecnologia) {
		this.fkTecnologia = fkTecnologia;
	}

	public void setCodProjeto(Integer codProjeto) {
		this.codProjeto = codProjeto;
	}

	public int getCodProjeto() {
		return this.codProjeto;
	}

	public void setCodProjeto(int codProjeto) {
		this.codProjeto = codProjeto;
	}

	public Integer getTecnologia() {
		return this.tecnologia;
	}

	public void setTecnologia(Integer tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Date getDataIncPrev() {
		return this.dataIncPrev;
	}

	public void setDataIncPrev(Date dataIncPrev) {
		this.dataIncPrev = dataIncPrev;
	}

	public Date getDataFimPrev() {
		return this.dataFimPrev;
	}

	public void setDataFimPrev(Date dataFimPrev) {
		this.dataFimPrev = dataFimPrev;
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

	public Integer getTotalFp() {
		return this.totalFp;
	}

	public void setTotalFp(Integer totalFp) {
		this.totalFp = totalFp;
	}

	public LocalTime getEsforcoHoras() {
		return this.esforcoHoras;
	}

	public void setEsforcoHoras(LocalTime esforcoHoras) {
		this.esforcoHoras = esforcoHoras;
	}

	public Double getEsf0rc0Meses() {
		return this.esforcoMeses;
	}

	public void setEsf0rc0Meses(Double esf0rc0Meses) {
		this.esforcoMeses = esf0rc0Meses;
	}

	public BigDecimal getCustoTotal() {
		return this.custoTotal;
	}

	public void setCustoTotal(BigDecimal custoTotal) {
		this.custoTotal = custoTotal;
	}

	
	public Integer getTimeBox() {
		return this.timeBox;
	}

	public void setTimeBox(Integer timeBox) {
		this.timeBox = timeBox;
	}
}
