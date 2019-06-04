package br.com.douglas.POO.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class CasoUsoSprint implements Serializable{
	@EmbeddedId
	private CasoUsoSprintPK id;
	
	private LocalDate dataInicioPrev;
	private LocalDate dataFimPrev;
	private LocalDate dataInicioReal;
	private LocalDate dataFimReal;
	private LocalTime horasEsforco;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "cod_casoUso", insertable = false, updatable = false),
		@JoinColumn(name = "projeto_id_casoUso", insertable = false, updatable = false)
	})
	private CasoUso casoUso;
	
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "num_sprint", insertable = false, updatable = false),
		@JoinColumn(name = "projeto_id_sprint", insertable = false, updatable = false)
	})
	private Sprint sprint;
	 
	@ManyToOne
	private Usuario usuario;
	
	public CasoUsoSprint() {
		
	}
	
	public CasoUsoSprint(CasoUsoSprintPK id, LocalDate dataInicioPrev, LocalDate dataFimPrev, LocalDate dataInicioReal,
			LocalDate dataFimReal, LocalTime horasEsforco, CasoUso casoUso, Sprint sprint, Usuario usuario) {
		
		this.id = id;
		this.dataInicioPrev = dataInicioPrev;
		this.dataFimPrev = dataFimPrev;
		this.dataInicioReal = dataInicioReal;
		this.dataFimReal = dataFimReal;
		this.horasEsforco = horasEsforco;
		this.casoUso = casoUso;
		this.sprint = sprint;
		this.usuario = usuario;
	}
	public CasoUsoSprintPK getId() {
		return id;
	}

	public void setId(CasoUsoSprintPK id) {
		this.id = id;
	}

	public CasoUso getCasoUso() {
		return casoUso;
	}

	public void setCasoUso(CasoUso casoUso) {
		this.casoUso = casoUso;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}


	public LocalDate getDataInicioPrev() {
		return dataInicioPrev;
	}

	public void setDataInicioPrev(LocalDate dataInicioPrev) {
		this.dataInicioPrev = dataInicioPrev;
	}

	public LocalDate getDataFimPrev() {
		return dataFimPrev;
	}

	public void setDataFimPrev(LocalDate dataFimPrev) {
		this.dataFimPrev = dataFimPrev;
	}

	public LocalDate getDataInicioReal() {
		return dataInicioReal;
	}

	public void setDataInicioReal(LocalDate dataInicioReal) {
		this.dataInicioReal = dataInicioReal;
	}

	public LocalDate getDataFimReal() {
		return dataFimReal;
	}

	public void setDataFimReal(LocalDate dataFimReal) {
		this.dataFimReal = dataFimReal;
	}

	public LocalTime getHorasEsforco() {
		return horasEsforco;
	}

	public void setHorasEsforco(LocalTime horasEsforco) {
		this.horasEsforco = horasEsforco;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
