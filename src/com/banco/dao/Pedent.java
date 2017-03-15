package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pedent database table.
 * 
 */
@Entity
@Table(name="pedent")
@NamedQuery(name="Pedent.findAll", query="SELECT p FROM Pedent p")
public class Pedent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PEDENT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PEDENT_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer aplcus;

	private Integer bai;

	private Integer codcat;

	@Column(length=4)
	private String codcfo;

	private Integer codfor;

	private Integer codordcom;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=10)
	private String numnot;

	@Column(length=10)
	private String numped;

	private byte[] obs;

	private double valbru;

	private double valdes;

	private double valfre;

	private double valimp;

	private Integer vencon;

	public Pedent() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAplcus() {
		return this.aplcus;
	}

	public void setAplcus(Integer aplcus) {
		this.aplcus = aplcus;
	}

	public Integer getBai() {
		return this.bai;
	}

	public void setBai(Integer bai) {
		this.bai = bai;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCodordcom() {
		return this.codordcom;
	}

	public void setCodordcom(Integer codordcom) {
		this.codordcom = codordcom;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getNumnot() {
		return this.numnot;
	}

	public void setNumnot(String numnot) {
		this.numnot = numnot;
	}

	public String getNumped() {
		return this.numped;
	}

	public void setNumped(String numped) {
		this.numped = numped;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getValbru() {
		return this.valbru;
	}

	public void setValbru(double valbru) {
		this.valbru = valbru;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

	public double getValfre() {
		return this.valfre;
	}

	public void setValfre(double valfre) {
		this.valfre = valfre;
	}

	public double getValimp() {
		return this.valimp;
	}

	public void setValimp(double valimp) {
		this.valimp = valimp;
	}

	public Integer getVencon() {
		return this.vencon;
	}

	public void setVencon(Integer vencon) {
		this.vencon = vencon;
	}

}