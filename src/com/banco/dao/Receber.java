package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the receber database table.
 * 
 */
@Entity
@Table(name="receber")
@NamedQuery(name="Receber.findAll", query="SELECT r FROM Receber r")
public class Receber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RECEBER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECEBER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codcli;

	private Integer codmov;

	private Integer codped;

	private Integer codpedsairec;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Temporal(TemporalType.DATE)
	private Date datlan;

	@Column(length=10)
	private String doc;

	@Column(length=100)
	private String obs;

	private Integer pag;

	private Integer tipcodmov;

	public Receber() {
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

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public Integer getCodpedsairec() {
		return this.codpedsairec;
	}

	public void setCodpedsairec(Integer codpedsairec) {
		this.codpedsairec = codpedsairec;
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

	public String getDoc() {
		return this.doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getPag() {
		return this.pag;
	}

	public void setPag(Integer pag) {
		this.pag = pag;
	}

	public Integer getTipcodmov() {
		return this.tipcodmov;
	}

	public void setTipcodmov(Integer tipcodmov) {
		this.tipcodmov = tipcodmov;
	}

}