package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dadprorur database table.
 * 
 */
@Entity
@Table(name="dadprorur")
@NamedQuery(name="Dadprorur.findAll", query="SELECT d FROM Dadprorur d")
public class Dadprorur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DADPRORUR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DADPRORUR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=18)
	private String cgc;

	private Integer cnotfis;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Column(length=18)
	private String insest;

	@Column(length=2)
	private String mod;

	private Integer numnot;

	private Integer ser;

	@Column(length=2)
	private String uf;

	public Dadprorur() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public Date getDatemi() {
		return this.datemi;
	}

	public void setDatemi(Date datemi) {
		this.datemi = datemi;
	}

	public String getInsest() {
		return this.insest;
	}

	public void setInsest(String insest) {
		this.insest = insest;
	}

	public String getMod() {
		return this.mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public Integer getNumnot() {
		return this.numnot;
	}

	public void setNumnot(Integer numnot) {
		this.numnot = numnot;
	}

	public Integer getSer() {
		return this.ser;
	}

	public void setSer(Integer ser) {
		this.ser = ser;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}