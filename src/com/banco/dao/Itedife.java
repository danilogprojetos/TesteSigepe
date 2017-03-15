package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itedifes database table.
 * 
 */
@Entity
@Table(name="itedifes")
@NamedQuery(name="Itedife.findAll", query="SELECT i FROM Itedife i")
public class Itedife implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEDIFES_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEDIFES_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddifest;

	private Integer codmer;

	private double estantbal;

	private double qua;

	private double val;

	public Itedife() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddifest() {
		return this.coddifest;
	}

	public void setCoddifest(Integer coddifest) {
		this.coddifest = coddifest;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public double getEstantbal() {
		return this.estantbal;
	}

	public void setEstantbal(double estantbal) {
		this.estantbal = estantbal;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}