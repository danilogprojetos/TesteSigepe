package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteleietipro database table.
 * 
 */
@Entity
@Table(name="iteleietipro")
@NamedQuery(name="Iteleietipro.findAll", query="SELECT i FROM Iteleietipro i")
public class Iteleietipro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITELEIETIPRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITELEIETIPRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddetope;

	private Integer codleietipro;

	private Integer codmer;

	private Integer codpedpro;

	private double qua;

	public Iteleietipro() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddetope() {
		return this.coddetope;
	}

	public void setCoddetope(Integer coddetope) {
		this.coddetope = coddetope;
	}

	public Integer getCodleietipro() {
		return this.codleietipro;
	}

	public void setCodleietipro(Integer codleietipro) {
		this.codleietipro = codleietipro;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodpedpro() {
		return this.codpedpro;
	}

	public void setCodpedpro(Integer codpedpro) {
		this.codpedpro = codpedpro;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}