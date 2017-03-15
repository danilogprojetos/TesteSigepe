package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bal database table.
 * 
 */
@Entity
@Table(name="bal")
@NamedQuery(name="Bal.findAll", query="SELECT b FROM Bal b")
public class Bal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BAL_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BAL_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer balpar;

	private Integer codcat;

	private Integer con;

	@Temporal(TemporalType.DATE)
	private Date datcon;

	@Temporal(TemporalType.DATE)
	private Date datini;

	public Bal() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getBalpar() {
		return this.balpar;
	}

	public void setBalpar(Integer balpar) {
		this.balpar = balpar;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCon() {
		return this.con;
	}

	public void setCon(Integer con) {
		this.con = con;
	}

	public Date getDatcon() {
		return this.datcon;
	}

	public void setDatcon(Date datcon) {
		this.datcon = datcon;
	}

	public Date getDatini() {
		return this.datini;
	}

	public void setDatini(Date datini) {
		this.datini = datini;
	}

}