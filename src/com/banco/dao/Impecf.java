package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the impecf database table.
 * 
 */
@Entity
@Table(name="impecf")
@NamedQuery(name="Impecf.findAll", query="SELECT i FROM Impecf i")
public class Impecf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="IMPECF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMPECF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double ali;

	@Column(length=6)
	private String codaliecf;

	private Integer codimp;

	@Column(length=20)
	private String numecf;

	public Impecf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAli() {
		return this.ali;
	}

	public void setAli(double ali) {
		this.ali = ali;
	}

	public String getCodaliecf() {
		return this.codaliecf;
	}

	public void setCodaliecf(String codaliecf) {
		this.codaliecf = codaliecf;
	}

	public Integer getCodimp() {
		return this.codimp;
	}

	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public String getNumecf() {
		return this.numecf;
	}

	public void setNumecf(String numecf) {
		this.numecf = numecf;
	}

}