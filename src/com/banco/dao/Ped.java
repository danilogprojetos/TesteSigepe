package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ped database table.
 * 
 */
@Entity
@Table(name="ped")
@NamedQuery(name="Ped.findAll", query="SELECT p FROM Ped p")
public class Ped implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codcli;

	private Integer codpedrec;

	private Integer codven;

	private Integer conrec;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datprefat;

	private byte[] obs;

	private double porcom;

	private double pordes;

	private Integer pro;

	private Integer temven;

	private double valbru;

	public Ped() {
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

	public Integer getCodpedrec() {
		return this.codpedrec;
	}

	public void setCodpedrec(Integer codpedrec) {
		this.codpedrec = codpedrec;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Integer getConrec() {
		return this.conrec;
	}

	public void setConrec(Integer conrec) {
		this.conrec = conrec;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatprefat() {
		return this.datprefat;
	}

	public void setDatprefat(Date datprefat) {
		this.datprefat = datprefat;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getPordes() {
		return this.pordes;
	}

	public void setPordes(double pordes) {
		this.pordes = pordes;
	}

	public Integer getPro() {
		return this.pro;
	}

	public void setPro(Integer pro) {
		this.pro = pro;
	}

	public Integer getTemven() {
		return this.temven;
	}

	public void setTemven(Integer temven) {
		this.temven = temven;
	}

	public double getValbru() {
		return this.valbru;
	}

	public void setValbru(double valbru) {
		this.valbru = valbru;
	}

}