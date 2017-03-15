package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lancc database table.
 * 
 */
@Entity
@Table(name="lancc")
@NamedQuery(name="Lancc.findAll", query="SELECT l FROM Lancc l")
public class Lancc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LANCC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LANCC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codabrcc;

	private Integer codcc;

	private Integer codplacon;

	private Integer codtipcc;

	@Temporal(TemporalType.DATE)
	private Date datlan;

	@Column(length=45)
	private String doc;

	private Integer tem;

	private double vlr;

	public Lancc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodabrcc() {
		return this.codabrcc;
	}

	public void setCodabrcc(Integer codabrcc) {
		this.codabrcc = codabrcc;
	}

	public Integer getCodcc() {
		return this.codcc;
	}

	public void setCodcc(Integer codcc) {
		this.codcc = codcc;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Integer getCodtipcc() {
		return this.codtipcc;
	}

	public void setCodtipcc(Integer codtipcc) {
		this.codtipcc = codtipcc;
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

	public Integer getTem() {
		return this.tem;
	}

	public void setTem(Integer tem) {
		this.tem = tem;
	}

	public double getVlr() {
		return this.vlr;
	}

	public void setVlr(double vlr) {
		this.vlr = vlr;
	}

}