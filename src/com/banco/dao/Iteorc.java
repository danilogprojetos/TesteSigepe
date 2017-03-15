package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteorc database table.
 * 
 */
@Entity
@Table(name="iteorc")
@NamedQuery(name="Iteorc.findAll", query="SELECT i FROM Iteorc i")
public class Iteorc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEORC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEORC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	private Integer codorc;

	@Column(length=30)
	private String numlot;

	private byte[] obs;

	private double qua;

	private double val;

	private double valcus;

	public Iteorc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodorc() {
		return this.codorc;
	}

	public void setCodorc(Integer codorc) {
		this.codorc = codorc;
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

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

}