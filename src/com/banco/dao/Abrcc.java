package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the abrcc database table.
 * 
 */
@Entity
@Table(name="abrcc")
@NamedQuery(name="Abrcc.findAll", query="SELECT a FROM Abrcc a")
public class Abrcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ABRCC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ABRCC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcc;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Time horfin;

	private Time horini;

	private double valini;

	public Abrcc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcc() {
		return this.codcc;
	}

	public void setCodcc(Integer codcc) {
		this.codcc = codcc;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
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

	public double getValini() {
		return this.valini;
	}

	public void setValini(double valini) {
		this.valini = valini;
	}

}