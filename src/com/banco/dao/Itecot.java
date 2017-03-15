package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itecot database table.
 * 
 */
@Entity
@Table(name="itecot")
@NamedQuery(name="Itecot.findAll", query="SELECT i FROM Itecot i")
public class Itecot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITECOT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITECOT_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcot;

	private Integer codmer;

	private byte[] desite;

	private Integer envcot;

	private Integer envreqcom;

	private Integer exdtet;

	private byte[] obs;

	private double qua;

	private double val;

	public Itecot() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcot() {
		return this.codcot;
	}

	public void setCodcot(Integer codcot) {
		this.codcot = codcot;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public byte[] getDesite() {
		return this.desite;
	}

	public void setDesite(byte[] desite) {
		this.desite = desite;
	}

	public Integer getEnvcot() {
		return this.envcot;
	}

	public void setEnvcot(Integer envcot) {
		this.envcot = envcot;
	}

	public Integer getEnvreqcom() {
		return this.envreqcom;
	}

	public void setEnvreqcom(Integer envreqcom) {
		this.envreqcom = envreqcom;
	}

	public Integer getExdtet() {
		return this.exdtet;
	}

	public void setExdtet(Integer exdtet) {
		this.exdtet = exdtet;
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