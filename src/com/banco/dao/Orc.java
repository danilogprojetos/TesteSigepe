package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the orc database table.
 * 
 */
@Entity
@Table(name="orc")
@NamedQuery(name="Orc.findAll", query="SELECT o FROM Orc o")
public class Orc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codcli;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private byte[] obs;

	private double pordes;

	private Integer temped;

	private Integer temven;

	private double valdes;

	private double valpro;

	public Orc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
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

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getPordes() {
		return this.pordes;
	}

	public void setPordes(double pordes) {
		this.pordes = pordes;
	}

	public Integer getTemped() {
		return this.temped;
	}

	public void setTemped(Integer temped) {
		this.temped = temped;
	}

	public Integer getTemven() {
		return this.temven;
	}

	public void setTemven(Integer temven) {
		this.temven = temven;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

	public double getValpro() {
		return this.valpro;
	}

	public void setValpro(double valpro) {
		this.valpro = valpro;
	}

}