package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the imppedsa database table.
 * 
 */
@Entity
@Table(name="imppedsa")
@NamedQuery(name="Imppedsa.findAll", query="SELECT i FROM Imppedsa i")
public class Imppedsa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ImppedsaPK id;

	private double ali;

	private double bascal;

	private Integer codsittri;

	private double porbascal;

	private double valimp;

	public Imppedsa() {
	}

	public ImppedsaPK getId() {
		return this.id;
	}

	public void setId(ImppedsaPK id) {
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