package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the devcom database table.
 * 
 */
@Entity
@Table(name="devcom")
@NamedQuery(name="Devcom.findAll", query="SELECT d FROM Devcom d")
public class Devcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEVCOM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEVCOM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer blo;

	private Integer codcat;

	private Integer codfor;

	private Integer codpedsai;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private double valliq;

	public Devcom() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getBlo() {
		return this.blo;
	}

	public void setBlo(Integer blo) {
		this.blo = blo;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
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

	public double getValliq() {
		return this.valliq;
	}

	public void setValliq(double valliq) {
		this.valliq = valliq;
	}

}