package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the crimer database table.
 * 
 */
@Entity
@Table(name="crimer")
@NamedQuery(name="Crimer.findAll", query="SELECT c FROM Crimer c")
public class Crimer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CRIMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CRIMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	private Integer codopecrimer;

	@Temporal(TemporalType.DATE)
	private Date datfin;

	@Temporal(TemporalType.DATE)
	private Date datini;

	@Column(length=150)
	private String obs;

	private Integer quaref;

	public Crimer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodopecrimer() {
		return this.codopecrimer;
	}

	public void setCodopecrimer(Integer codopecrimer) {
		this.codopecrimer = codopecrimer;
	}

	public Date getDatfin() {
		return this.datfin;
	}

	public void setDatfin(Date datfin) {
		this.datfin = datfin;
	}

	public Date getDatini() {
		return this.datini;
	}

	public void setDatini(Date datini) {
		this.datini = datini;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getQuaref() {
		return this.quaref;
	}

	public void setQuaref(Integer quaref) {
		this.quaref = quaref;
	}

}