package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mermed database table.
 * 
 */
@Entity
@Table(name="mermed")
@NamedQuery(name="Mermed.findAll", query="SELECT m FROM Mermed m")
public class Mermed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MERMED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MERMED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmed;

	private Integer codmer;

	@Column(length=12)
	private String codtam;

	private double med;

	public Mermed() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmed() {
		return this.codmed;
	}

	public void setCodmed(Integer codmed) {
		this.codmed = codmed;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public String getCodtam() {
		return this.codtam;
	}

	public void setCodtam(String codtam) {
		this.codtam = codtam;
	}

	public double getMed() {
		return this.med;
	}

	public void setMed(double med) {
		this.med = med;
	}

}