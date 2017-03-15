package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lacunicarunitradocfismdf database table.
 * 
 */
@Entity
@Table(name="lacunicarunitradocfismdf")
@NamedQuery(name="Lacunicarunitradocfismdf.findAll", query="SELECT l FROM Lacunicarunitradocfismdf l")
public class Lacunicarunitradocfismdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LACUNICARUNITRADOCFISMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LACUNICARUNITRADOCFISMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codunicarunitradocfismdf;

	@Column(length=20)
	private String lacunicarunitradocfismdf;

	private double numlac;

	public Lacunicarunitradocfismdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodunicarunitradocfismdf() {
		return this.codunicarunitradocfismdf;
	}

	public void setCodunicarunitradocfismdf(Integer codunicarunitradocfismdf) {
		this.codunicarunitradocfismdf = codunicarunitradocfismdf;
	}

	public String getLacunicarunitradocfismdf() {
		return this.lacunicarunitradocfismdf;
	}

	public void setLacunicarunitradocfismdf(String lacunicarunitradocfismdf) {
		this.lacunicarunitradocfismdf = lacunicarunitradocfismdf;
	}

	public double getNumlac() {
		return this.numlac;
	}

	public void setNumlac(double numlac) {
		this.numlac = numlac;
	}

}