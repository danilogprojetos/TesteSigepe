package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the itevenco database table.
 * 
 */
@Entity
@Table(name="itevenco")
@NamedQuery(name="Itevenco.findAll", query="SELECT i FROM Itevenco i")
public class Itevenco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEVENCO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEVENCO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	private Integer codvencon;

	private Time hor;

	private byte[] obs;

	private double qua;

	private double val;

	public Itevenco() {
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

	public Integer getCodvencon() {
		return this.codvencon;
	}

	public void setCodvencon(Integer codvencon) {
		this.codvencon = codvencon;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
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

}