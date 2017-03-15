package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the impordcom database table.
 * 
 */
@Entity
@Table(name="impordcom")
@NamedQuery(name="Impordcom.findAll", query="SELECT i FROM Impordcom i")
public class Impordcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ImpordcomPK id;

	private double ali;

	private double bascal;

	private Integer codsittri;

	private double porbascal;

	private double valimp;

	public Impordcom() {
	}

	public ImpordcomPK getId() {
		return this.id;
	}

	public void setId(ImpordcomPK id) {
		this.id = id;
	}

	public double getAli() {
		return this.ali;
	}

	public void setAli(double ali) {
		this.ali = ali;
	}

	public double getBascal() {
		return this.bascal;
	}

	public void setBascal(double bascal) {
		this.bascal = bascal;
	}

	public Integer getCodsittri() {
		return this.codsittri;
	}

	public void setCodsittri(Integer codsittri) {
		this.codsittri = codsittri;
	}

	public double getPorbascal() {
		return this.porbascal;
	}

	public void setPorbascal(double porbascal) {
		this.porbascal = porbascal;
	}

	public double getValimp() {
		return this.valimp;
	}

	public void setValimp(double valimp) {
		this.valimp = valimp;
	}

}