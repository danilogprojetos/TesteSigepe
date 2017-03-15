package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the guiate database table.
 * 
 */
@Entity
@Table(name="guiate")
@NamedQuery(name="Guiate.findAll", query="SELECT g FROM Guiate g")
public class Guiate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GUIATE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GUIATE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcli;

	private Integer coddig;

	private Integer codesp;

	private Integer codlabexa;

	private Integer codmed;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Time hor;

	private byte[] obs;

	public Guiate() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCoddig() {
		return this.coddig;
	}

	public void setCoddig(Integer coddig) {
		this.coddig = coddig;
	}

	public Integer getCodesp() {
		return this.codesp;
	}

	public void setCodesp(Integer codesp) {
		this.codesp = codesp;
	}

	public Integer getCodlabexa() {
		return this.codlabexa;
	}

	public void setCodlabexa(Integer codlabexa) {
		this.codlabexa = codlabexa;
	}

	public Integer getCodmed() {
		return this.codmed;
	}

	public void setCodmed(Integer codmed) {
		this.codmed = codmed;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

}