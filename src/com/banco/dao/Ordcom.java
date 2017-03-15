package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ordcom database table.
 * 
 */
@Entity
@Table(name="ordcom")
@NamedQuery(name="Ordcom.findAll", query="SELECT o FROM Ordcom o")
public class Ordcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDCOM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDCOM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codcencus;

	private Integer codfor;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datprefat;

	private byte[] obs;

	private double pordes;

	private Integer temcom;

	private double valbru;

	private double valdes;

	private double valfre;

	private double valimp;

	public Ordcom() {
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

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
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

	public double getPordes() {
		return this.pordes;
	}

	public void setPordes(double pordes) {
		this.pordes = pordes;
	}

	public Integer getTemcom() {
		return this.temcom;
	}

	public void setTemcom(Integer temcom) {
		this.temcom = temcom;
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

}