package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the chemi database table.
 * 
 */
@Entity
@Table(name="chemi")
@NamedQuery(name="Chemi.findAll", query="SELECT c FROM Chemi c")
public class Chemi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChemiPK id;

	private Integer con;

	@Temporal(TemporalType.DATE)
	private Date datcon;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Temporal(TemporalType.DATE)
	private Date datlan;

	@Temporal(TemporalType.DATE)
	private Date datpre;

	@Column(length=30)
	private String his;

	@Column(length=60)
	private String nom;

	private double vlr;

	public Chemi() {
	}

	public ChemiPK getId() {
		return this.id;
	}

	public void setId(ChemiPK id) {
		this.id = id;
	}

	public Integer getCon() {
		return this.con;
	}

	public void setCon(Integer con) {
		this.con = con;
	}

	public Date getDatcon() {
		return this.datcon;
	}

	public void setDatcon(Date datcon) {
		this.datcon = datcon;
	}

	public Date getDatemi() {
		return this.datemi;
	}

	public void setDatemi(Date datemi) {
		this.datemi = datemi;
	}

	public Date getDatlan() {
		return this.datlan;
	}

	public void setDatlan(Date datlan) {
		this.datlan = datlan;
	}

	public Date getDatpre() {
		return this.datpre;
	}

	public void setDatpre(Date datpre) {
		this.datpre = datpre;
	}

	public String getHis() {
		return this.his;
	}

	public void setHis(String his) {
		this.his = his;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getVlr() {
		return this.vlr;
	}

	public void setVlr(double vlr) {
		this.vlr = vlr;
	}

}