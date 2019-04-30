package br.com.douglas.Projeto.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Release implements java.io.Serializable {
	@EmbeddedId
	private ReleasePK id ;

	private Date dataPrevista;
	private Date dataReal;

	@ManyToOne
	@Column(name = "projeto_id", insertable = false, updatable = false)
	private Projeto fkProjeto;

	
	
	public Release() {
	
	}

	public Release(ReleasePK id, Date dataPrevista, Date dataReal, Projeto fkProjeto) {
	
		this.id = id;
		this.dataPrevista = dataPrevista;
		this.dataReal = dataReal;
		this.fkProjeto = fkProjeto;
	}

	public ReleasePK getId() {
		return id;
	}
	
	public void setId(ReleasePK id) {
		this.id = id;
	}
	
	public Projeto getFkProjeto() {
		return fkProjeto;
	}
	
	public void setFkProjeto(Projeto fkProjeto) {
		this.fkProjeto = fkProjeto;
	}

	public Date getDataPrevista() {
		return this.dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Date getDataReal() {
		return this.dataReal;
	}

	public void setDataReal(Date dataReal) {
		this.dataReal = dataReal;
	}


}
