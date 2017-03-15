package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the merfor database table.
 * 
 */
@Entity
@Table(name="merfor")
@NamedQuery(name="Merfor.findAll", query="SELECT m FROM Merfor m")
public class Merfor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MerforPK id;

	private Integer codsittriicm;

	private Integer codsittriipi;

	private Integer codsittripiscof;

	private double fre;

	private double ipi;

	@Column(length=20)
	private String mar;

	private double temche;

	private double valcom;

	public Merfor() {
	}

	public MerforPK getId() {
		return this.id;
	}

	public void setId(MerforPK id) {
		this.id = id;
	}

	public Integer getCodsittriicm() {
		return this.codsittriicm;
	}

	public void setCodsittriicm(Integer codsittriicm) {
		this.codsittriicm = codsittriicm;
	}

	public Integer getCodsittriipi() {
		return this.codsittriipi;
	}

	public void setCodsittriipi(Integer codsittriipi) {
		this.codsittriipi = codsittriipi;
	}

	public Integer getCodsittripiscof() {
		return this.codsittripiscof;
	}

	public void setCodsittripiscof(Integer codsittripiscof) {
		this.codsittripiscof = codsittripiscof;
	}

	public double getFre() {
		return this.fre;
	}

	public void setFre(double fre) {
		this.fre = fre;
	}

	public double getIpi() {
		return this.ipi;
	}

	public void setIpi(double ipi) {
		this.ipi = ipi;
	}

	public String getMar() {
		return this.mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}

	public double getTemche() {
		return this.temche;
	}

	public void setTemche(double temche) {
		this.temche = temche;
	}

	public double getValcom() {
		return this.valcom;
	}

	public void setValcom(double valcom) {
		this.valcom = valcom;
	}

}