package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the chrec database table.
 * 
 */
@Entity
@Table(name="chrec")
@NamedQuery(name="Chrec.findAll", query="SELECT c FROM Chrec c")
public class Chrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CHREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CHREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer age;

	private Integer ch;

	private Integer codban;

	private Integer codcat;

	private Integer codcc;

	private Integer con;

	@Temporal(TemporalType.DATE)
	private Date datcon;

	@Temporal(TemporalType.DATE)
	private Date datdev;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Temporal(TemporalType.DATE)
	private Date datlan;

	@Temporal(TemporalType.DATE)
	private Date datpre;

	@Column(length=60)
	private String emi;

	@Column(length=15)
	private String his;

	@Column(length=15)
	private String numcon;

	@Column(length=30)
	private String rep;

	private double vlr;

	public Chrec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCh() {
		return this.ch;
	}

	public void setCh(Integer ch) {
		this.ch = ch;
	}

	public Integer getCodban() {
		return this.codban;
	}

	public void setCodban(Integer codban) {
		this.codban = codban;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodcc() {
		return this.codcc;
	}

	public void setCodcc(Integer codcc) {
		this.codcc = codcc;
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

	public Date getDatdev() {
		return this.datdev;
	}

	public void setDatdev(Date datdev) {
		this.datdev = datdev;
	}

	public Date getDatemi() {
		return this.datemi;
	}

	public void setDatemi(Date datemi) {
		this.datemi = datemi;
	}

	public Date getDatlan() {
		return this.datlan;
	}

	public void setDatlan(Date datlan) {
		this.datlan = datlan;
	}

	public Date getDatpre() {
		return this.datpre;
	}

	public void setDatpre(Date datpre) {
		this.datpre = datpre;
	}

	public String getEmi() {
		return this.emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getHis() {
		return this.his;
	}

	public void setHis(String his) {
		this.his = his;
	}

	public String getNumcon() {
		return this.numcon;
	}

	public void setNumcon(String numcon) {
		this.numcon = numcon;
	}

	public String getRep() {
		return this.rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public double getVlr() {
		return this.vlr;
	}

	public void setVlr(double vlr) {
		this.vlr = vlr;
	}

}