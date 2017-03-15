package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commer database table.
 * 
 */
@Entity
@Table(name="commer")
@NamedQuery(name="Commer.findAll", query="SELECT c FROM Commer c")
public class Commer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmermas;

	private Integer codmersla;

	private Integer codopepromer;

	@Column(length=30)
	private String obs;

	private double qua;

	private double quarec;

	public Commer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmermas() {
		return this.codmermas;
	}

	public void setCodmermas(Integer codmermas) {
		this.codmermas = codmermas;
	}

	public Integer getCodmersla() {
		return this.codmersla;
	}

	public void setCodmersla(Integer codmersla) {
		this.codmersla = codmersla;
	}

	public Integer getCodopepromer() {
		return this.codopepromer;
	}

	public void setCodopepromer(Integer codopepromer) {
		this.codopepromer = codopepromer;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getQuarec() {
		return this.quarec;
	}

	public void setQuarec(double quarec) {
		this.quarec = quarec;
	}

}