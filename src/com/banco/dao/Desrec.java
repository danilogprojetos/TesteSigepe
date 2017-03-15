package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the desrec database table.
 * 
 */
@Entity
@Table(name="desrec")
@NamedQuery(name="Desrec.findAll", query="SELECT d FROM Desrec d")
public class Desrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DESREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	private Integer codmov;

	private Integer tipmov;

	private double val;

	public Desrec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Integer getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(Integer tipmov) {
		this.tipmov = tipmov;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}