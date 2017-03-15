package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the saladipag database table.
 * 
 */
@Entity
@Table(name="saladipag")
@NamedQuery(name="Saladipag.findAll", query="SELECT s FROM Saladipag s")
public class Saladipag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SALADIPAG_CODPARPAG_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALADIPAG_CODPARPAG_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codparpag;

	private double sal;

	public Saladipag() {
	}

	public Integer getCodparpag() {
		return this.codparpag;
	}

	public void setCodparpag(Integer codparpag) {
		this.codparpag = codparpag;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}