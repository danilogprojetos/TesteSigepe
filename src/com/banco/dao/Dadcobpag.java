package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dadcobpag database table.
 * 
 */
@Entity
@Table(name="dadcobpag")
@NamedQuery(name="Dadcobpag.findAll", query="SELECT d FROM Dadcobpag d")
public class Dadcobpag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DADCOBPAG_CODPARPAG_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DADCOBPAG_CODPARPAG_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codparpag;

	private Integer recdup;

	public Dadcobpag() {
	}

	public Integer getCodparpag() {
		return this.codparpag;
	}

	public void setCodparpag(Integer codparpag) {
		this.codparpag = codparpag;
	}

	public Integer getRecdup() {
		return this.recdup;
	}

	public void setRecdup(Integer recdup) {
		this.recdup = recdup;
	}

}