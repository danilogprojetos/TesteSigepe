package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conimp database table.
 * 
 */
@Entity
@Table(name="conimp")
@NamedQuery(name="Conimp.findAll", query="SELECT c FROM Conimp c")
public class Conimp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONIMP_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONIMP_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double ali;

	private double alides;

	@Column(length=4)
	private String codcfo;

	@Column(length=10)
	private String codclafis;

	private Integer codimp;

	private Integer codtipclifat;

	private Integer codtriicm;

	@Column(length=2)
	private String coduf;

	private byte[] obs;

	private double pordif;

	private double poriva;

	private double porval;

	public Conimp() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAli() {
		return this.ali;
	}

	public void setAli(double ali) {
		this.ali = ali;
	}

	public double getAlides() {
		return this.alides;
	}

	public void setAlides(double alides) {
		this.alides = alides;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public String getCodclafis() {
		return this.codclafis;
	}

	public void setCodclafis(String codclafis) {
		this.codclafis = codclafis;
	}

	public Integer getCodimp() {
		return this.codimp;
	}

	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public Integer getCodtipclifat() {
		return this.codtipclifat;
	}

	public void setCodtipclifat(Integer codtipclifat) {
		this.codtipclifat = codtipclifat;
	}

	public Integer getCodtriicm() {
		return this.codtriicm;
	}

	public void setCodtriicm(Integer codtriicm) {
		this.codtriicm = codtriicm;
	}

	public String getCoduf() {
		return this.coduf;
	}

	public void setCoduf(String coduf) {
		this.coduf = coduf;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getPordif() {
		return this.pordif;
	}

	public void setPordif(double pordif) {
		this.pordif = pordif;
	}

	public double getPoriva() {
		return this.poriva;
	}

	public void setPoriva(double poriva) {
		this.poriva = poriva;
	}

	public double getPorval() {
		return this.porval;
	}

	public void setPorval(double porval) {
		this.porval = porval;
	}

}