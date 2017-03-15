package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notfisref database table.
 * 
 */
@Entity
@Table(name="notfisref")
@NamedQuery(name="Notfisref.findAll", query="SELECT n FROM Notfisref n")
public class Notfisref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=20)
	private String cgc;

	@Column(length=44)
	private String chaace;

	private Integer cnotfis;

	private Integer codnotfis;

	@Column(length=2)
	private String coduf;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Column(length=3)
	private String mod;

	@Column(length=3)
	private String ser;

	public Notfisref() {
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public String getChaace() {
		return this.chaace;
	}

	public void setChaace(String chaace) {
		this.chaace = chaace;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public Integer getCodnotfis() {
		return this.codnotfis;
	}

	public void setCodnotfis(Integer codnotfis) {
		this.codnotfis = codnotfis;
	}

	public String getCoduf() {
		return this.coduf;
	}

	public void setCoduf(String coduf) {
		this.coduf = coduf;
	}

	public Date getDatemi() {
		return this.datemi;
	}

	public void setDatemi(Date datemi) {
		this.datemi = datemi;
	}

	public String getMod() {
		return this.mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSer() {
		return this.ser;
	}

	public void setSer(String ser) {
		this.ser = ser;
	}

}