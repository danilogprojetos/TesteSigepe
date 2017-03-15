package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itetra database table.
 * 
 */
@Entity
@Table(name="itetra")
@NamedQuery(name="Itetra.findAll", query="SELECT i FROM Itetra i")
public class Itetra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITETRA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITETRA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditepedpro;

	private Integer codmer;

	private Integer codtra;

	@Column(length=10)
	private String numlot;

	private byte[] obs;

	private double qua;

	private Integer tipmer;

	private double val;

	public Itetra() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditepedpro() {
		return this.coditepedpro;
	}

	public void setCoditepedpro(Integer coditepedpro) {
		this.coditepedpro = coditepedpro;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodtra() {
		return this.codtra;
	}

	public void setCodtra(Integer codtra) {
		this.codtra = codtra;
	}

	public String getNumlot() {
		return this.numlot;
	}

	public void setNumlot(String numlot) {
		this.numlot = numlot;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public Integer getTipmer() {
		return this.tipmer;
	}

	public void setTipmer(Integer tipmer) {
		this.tipmer = tipmer;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}