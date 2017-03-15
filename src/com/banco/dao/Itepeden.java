package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itepeden database table.
 * 
 */
@Entity
@Table(name="itepeden")
@NamedQuery(name="Itepeden.findAll", query="SELECT i FROM Itepeden i")
public class Itepeden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEPEDEN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEPEDEN_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditereqmat;

	private Integer codmer;

	private Integer codped;

	@Column(length=100)
	private String des;

	@Column(length=30)
	private String numlot;

	private Integer oricon;

	private double qua;

	private double quacom;

	private double val;

	public Itepeden() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditereqmat() {
		return this.coditereqmat;
	}

	public void setCoditereqmat(Integer coditereqmat) {
		this.coditereqmat = coditereqmat;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getNumlot() {
		return this.numlot;
	}

	public void setNumlot(String numlot) {
		this.numlot = numlot;
	}

	public Integer getOricon() {
		return this.oricon;
	}

	public void setOricon(Integer oricon) {
		this.oricon = oricon;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getQuacom() {
		return this.quacom;
	}

	public void setQuacom(double quacom) {
		this.quacom = quacom;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}