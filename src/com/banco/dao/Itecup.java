package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itecup database table.
 * 
 */
@Entity
@Table(name="itecup")
@NamedQuery(name="Itecup.findAll", query="SELECT i FROM Itecup i")
public class Itecup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITECUP_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITECUP_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double aliicm;

	private Integer codcup;

	@Column(length=13)
	private String codmer;

	@Column(length=29)
	private String mer;

	private double qua;

	@Column(length=2)
	private String uni;

	private double valuni;

	public Itecup() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAliicm() {
		return this.aliicm;
	}

	public void setAliicm(double aliicm) {
		this.aliicm = aliicm;
	}

	public Integer getCodcup() {
		return this.codcup;
	}

	public void setCodcup(Integer codcup) {
		this.codcup = codcup;
	}

	public String getCodmer() {
		return this.codmer;
	}

	public void setCodmer(String codmer) {
		this.codmer = codmer;
	}

	public String getMer() {
		return this.mer;
	}

	public void setMer(String mer) {
		this.mer = mer;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public String getUni() {
		return this.uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public double getValuni() {
		return this.valuni;
	}

	public void setValuni(double valuni) {
		this.valuni = valuni;
	}

}