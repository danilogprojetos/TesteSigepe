package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the maoobr database table.
 * 
 */
@Entity
@Table(name="maoobr")
@NamedQuery(name="Maoobr.findAll", query="SELECT m FROM Maoobr m")
public class Maoobr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MAOOBR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAOOBR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditepedsai;

	private Integer codmaoobr;

	private Integer codpag;

	private double com;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Integer forcom;

	private Time horfin;

	private Time horini;

	public Maoobr() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditepedsai() {
		return this.coditepedsai;
	}

	public void setCoditepedsai(Integer coditepedsai) {
		this.coditepedsai = coditepedsai;
	}

	public Integer getCodmaoobr() {
		return this.codmaoobr;
	}

	public void setCodmaoobr(Integer codmaoobr) {
		this.codmaoobr = codmaoobr;
	}

	public Integer getCodpag() {
		return this.codpag;
	}

	public void setCodpag(Integer codpag) {
		this.codpag = codpag;
	}

	public double getCom() {
		return this.com;
	}

	public void setCom(double com) {
		this.com = com;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Integer getForcom() {
		return this.forcom;
	}

	public void setForcom(Integer forcom) {
		this.forcom = forcom;
	}

	public Time getHorfin() {
		return this.horfin;
	}

	public void setHorfin(Time horfin) {
		this.horfin = horfin;
	}

	public Time getHorini() {
		return this.horini;
	}

	public void setHorini(Time horini) {
		this.horini = horini;
	}

}