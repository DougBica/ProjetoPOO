package br.com.douglas.Projeto.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class CasoUsoSprint {
	@EmbeddedId
	private CasoUsoSprintPK id;
	private LocalDate dataInicioPrev;
	private LocalDate dataFimPrev;
	private LocalDate dataInicioReal;
	private LocalDate dataFimReal;
	private LocalTime horasEsforco;
	
	@ManyToOne
	@Column(name = "casoUso_id", insertable = false, updatable = false)
	private CasoUsoPK casoUso;
	
	@ManyToOne
	@Column(name = "sprint_id", insertable = false, updatable = false)
	private SprintPK sprint;
	 
	@ManyToOne
	private Usuario usuario;
	 
	public CasoUsoSprint() {
	
	}

	public CasoUsoSprint(CasoUsoSprintPK id, LocalDate dataInicioPrev, LocalDate dataFimPrev, LocalDate dataInicioReal,
			LocalDate dataFimReal, LocalTime horasEsforco, CasoUsoPK casoUso, SprintPK sprint, Usuario usuario) {
	
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
