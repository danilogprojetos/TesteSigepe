package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docfismdf database table.
 * 
 */
@Entity
@Table(name="docfismdf")
@NamedQuery(name="Docfismdf.findAll", query="SELECT d FROM Docfismdf d")
public class Docfismdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCFISMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCFISMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=44)
	private String chaace;

	private Integer coddocfis;

	private Integer codmundesmdf;

	private Integer numdocfis;

	private Integer tip;

	public Docfismdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getChaace() {
		return this.chaace;
	}

	public void setChaace(String chaace) {
		this.chaace = chaace;
	}

	public Integer getCoddocfis() {
		return this.coddocfis;
	}

	public void setCoddocfis(Integer coddocfis) {
		this.coddocfis = coddocfis;
	}

	public Integer getCodmundesmdf() {
		return this.codmundesmdf;
	}

	public void setCodmundesmdf(Integer codmundesmdf) {
		this.codmundesmdf = codmundesmdf;
	}

	public Integer getNumdocfis() {
		return this.numdocfis;
	}

	public void setNumdocfis(Integer numdocfis) {
		this.numdocfis = numdocfis;
	}

	public Integer getTip() {
		return this.tip;
	}

	public void setTip(Integer tip) {
		this.tip = tip;
	}

}