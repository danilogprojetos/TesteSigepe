package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the parpag database table.
 * 
 */
@Entity
@Table(name="parpag")
@NamedQuery(name="Parpag.findAll", query="SELECT p FROM Parpag p")
public class Parpag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARPAG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARPAG_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codforpag;

	private Integer codlancc;

	private Integer codpag;

	private Integer codparori;

	private Integer codparpagadi;

	private Integer codsubtippag;

	private Integer codtippag;

	@Temporal(TemporalType.DATE)
	private Date datlanpag;

	@Temporal(TemporalType.DATE)
	private Date datpag;

	@Temporal(TemporalType.DATE)
	private Date datven;

	@Column(length=3)
	private String numpar;

	private byte[] obs;

	private Integer pag;

	private double vlrdif;

	private double vlrpag;

	public Parpag() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodforpag() {
		return this.codforpag;
	}

	public void setCodforpag(Integer codforpag) {
		this.codforpag = codforpag;
	}

	public Integer getCodlancc() {
		return this.codlancc;
	}

	public void setCodlancc(Integer codlancc) {
		this.codlancc = codlancc;
	}

	public Integer getCodpag() {
		return this.codpag;
	}

	public void setCodpag(Integer codpag) {
		this.codpag = codpag;
	}

	public Integer getCodparori() {
		return this.codparori;
	}

	public void setCodparori(Integer codparori) {
		this.codparori = codparori;
	}

	public Integer getCodparpagadi() {
		return this.codparpagadi;
	}

	public void setCodparpagadi(Integer codparpagadi) {
		this.codparpagadi = codparpagadi;
	}

	public Integer getCodsubtippag() {
		return this.codsubtippag;
	}

	public void setCodsubtippag(Integer codsubtippag) {
		this.codsubtippag = codsubtippag;
	}

	public Integer getCodtippag() {
		return this.codtippag;
	}

	public void setCodtippag(Integer codtippag) {
		this.codtippag = codtippag;
	}

	public Date getDatlanpag() {
		return this.datlanpag;
	}

	public void setDatlanpag(Date datlanpag) {
		this.datlanpag = datlanpag;
	}

	public Date getDatpag() {
		return this.datpag;
	}

	public void setDatpag(Date datpag) {
		this.datpag = datpag;
	}

	public Date getDatven() {
		return this.datven;
	}

	public void setDatven(Date datven) {
		this.datven = datven;
	}

	public String getNumpar() {
		return this.numpar;
	}

	public void setNumpar(String numpar) {
		this.numpar = numpar;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getPag() {
		return this.pag;
	}

	public void setPag(Integer pag) {
		this.pag = pag;
	}

	public double getVlrdif() {
		return this.vlrdif;
	}

	public void setVlrdif(double vlrdif) {
		this.vlrdif = vlrdif;
	}

	public double getVlrpag() {
		return this.vlrpag;
	}

	public void setVlrpag(double vlrpag) {
		this.vlrpag = vlrpag;
	}

}