package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comissao database table.
 * 
 */
@Entity
@Table(name="comissao")
@NamedQuery(name="Comissao.findAll", query="SELECT c FROM Comissao c")
public class Comissao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMISSAO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMISSAO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer acrjur;

	private Integer codpag;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=12)
	private String divpra;

	private Integer forcal;

	private Integer locind;

	private Integer subdes;

	private Integer unival;

	private double val;

	public Comissao() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAcrjur() {
		return this.acrjur;
	}

	public void setAcrjur(Integer acrjur) {
		this.acrjur = acrjur;
	}

	public Integer getCodpag() {
		return this.codpag;
	}

	public void setCodpag(Integer codpag) {
		this.codpag = codpag;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getDivpra() {
		return this.divpra;
	}

	public void setDivpra(String divpra) {
		this.divpra = divpra;
	}

	public Integer getForcal() {
		return this.forcal;
	}

	public void setForcal(Integer forcal) {
		this.forcal = forcal;
	}

	public Integer getLocind() {
		return this.locind;
	}

	public void setLocind(Integer locind) {
		this.locind = locind;
	}

	public Integer getSubdes() {
		return this.subdes;
	}

	public void setSubdes(Integer subdes) {
		this.subdes = subdes;
	}

	public Integer getUnival() {
		return this.unival;
	}

	public void setUnival(Integer unival) {
		this.unival = unival;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}