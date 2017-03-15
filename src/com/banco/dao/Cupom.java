package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cupom database table.
 * 
 */
@Entity
@Table(name="cupom")
@NamedQuery(name="Cupom.findAll", query="SELECT c FROM Cupom c")
public class Cupom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUPOM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUPOM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codconrec;

	private Integer codimp;

	private Integer codpedsai;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Integer exc;

	private Integer imp;

	@Column(length=20)
	private String numserimp;

	private double valbru;

	private double valdif;

	public Cupom() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodconrec() {
		return this.codconrec;
	}

	public void setCodconrec(Integer codconrec) {
		this.codconrec = codconrec;
	}

	public Integer getCodimp() {
		return this.codimp;
	}

	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Integer getExc() {
		return this.exc;
	}

	public void setExc(Integer exc) {
		this.exc = exc;
	}

	public Integer getImp() {
		return this.imp;
	}

	public void setImp(Integer imp) {
		this.imp = imp;
	}

	public String getNumserimp() {
		return this.numserimp;
	}

	public void setNumserimp(String numserimp) {
		this.numserimp = numserimp;
	}

	public double getValbru() {
		return this.valbru;
	}

	public void setValbru(double valbru) {
		this.valbru = valbru;
	}

	public double getValdif() {
		return this.valdif;
	}

	public void setValdif(double valdif) {
		this.valdif = valdif;
	}

}