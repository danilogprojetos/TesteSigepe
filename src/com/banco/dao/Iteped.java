package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteped database table.
 * 
 */
@Entity
@Table(name="iteped")
@NamedQuery(name="Iteped.findAll", query="SELECT i FROM Iteped i")
public class Iteped implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEPED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEPED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditeped;

	private Integer codmer;

	private Integer codped;

	@Column(length=100)
	private String obs;

	private double quaent;

	private double quaped;

	private double val;

	private double valcus;

	public Iteped() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditeped() {
		return this.coditeped;
	}

	public void setCoditeped(Integer coditeped) {
		this.coditeped = coditeped;
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

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public double getQuaent() {
		return this.quaent;
	}

	public void setQuaent(double quaent) {
		this.quaent = quaent;
	}

	public double getQuaped() {
		return this.quaped;
	}

	public void setQuaped(double quaped) {
		this.quaped = quaped;
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