package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the impsuf database table.
 * 
 */
@Entity
@Table(name="impsuf")
@NamedQuery(name="Impsuf.findAll", query="SELECT i FROM Impsuf i")
public class Impsuf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="IMPSUF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMPSUF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double alides;

	private Integer codimp;

	private Integer codpedsai;

	@Column(length=20)
	private String desimp;

	private double valdes;

	public Impsuf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAlides() {
		return this.alides;
	}

	public void setAlides(double alides) {
		this.alides = alides;
	}

	public Integer getCodimp() {
		return this.codimp;
	}

	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public String getDesimp() {
		return this.desimp;
	}

	public void setDesimp(String desimp) {
		this.desimp = desimp;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

}