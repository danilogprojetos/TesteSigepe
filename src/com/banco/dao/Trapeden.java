package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trapeden database table.
 * 
 */
@Entity
@Table(name="trapeden")
@NamedQuery(name="Trapeden.findAll", query="SELECT t FROM Trapeden t")
public class Trapeden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRAPEDEN_CODPEDENT_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRAPEDEN_CODPEDENT_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codpedent;

	private Integer codtra;

	private Integer codtrafre;

	private Integer codtrared;

	private Integer sitfre;

	public Trapeden() {
	}

	public Integer getCodpedent() {
		return this.codpedent;
	}

	public void setCodpedent(Integer codpedent) {
		this.codpedent = codpedent;
	}

	public Integer getCodtra() {
		return this.codtra;
	}

	public void setCodtra(Integer codtra) {
		this.codtra = codtra;
	}

	public Integer getCodtrafre() {
		return this.codtrafre;
	}

	public void setCodtrafre(Integer codtrafre) {
		this.codtrafre = codtrafre;
	}

	public Integer getCodtrared() {
		return this.codtrared;
	}

	public void setCodtrared(Integer codtrared) {
		this.codtrared = codtrared;
	}

	public Integer getSitfre() {
		return this.sitfre;
	}

	public void setSitfre(Integer sitfre) {
		this.sitfre = sitfre;
	}

}