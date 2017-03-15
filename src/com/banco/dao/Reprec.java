package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reprec database table.
 * 
 */
@Entity
@Table(name="reprec")
@NamedQuery(name="Reprec.findAll", query="SELECT r FROM Reprec r")
public class Reprec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REPREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codrec;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date datrep;

	public Reprec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodrec() {
		return this.codrec;
	}

	public void setCodrec(Integer codrec) {
		this.codrec = codrec;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDatrep() {
		return this.datrep;
	}

	public void setDatrep(Date datrep) {
		this.datrep = datrep;
	}

}