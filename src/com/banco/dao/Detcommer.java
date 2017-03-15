package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detcommer database table.
 * 
 */
@Entity
@Table(name="detcommer")
@NamedQuery(name="Detcommer.findAll", query="SELECT d FROM Detcommer d")
public class Detcommer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETCOMMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETCOMMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double alt;

	private Integer codcommer;

	@Column(length=30)
	private String des;

	private double lar;

	public Detcommer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAlt() {
		return this.alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public Integer getCodcommer() {
		return this.codcommer;
	}

	public void setCodcommer(Integer codcommer) {
		this.codcommer = codcommer;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getLar() {
		return this.lar;
	}

	public void setLar(double lar) {
		this.lar = lar;
	}

}