package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the devaut database table.
 * 
 */
@Entity
@Table(name="devaut")
@NamedQuery(name="Devaut.findAll", query="SELECT d FROM Devaut d")
public class Devaut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEVAUT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEVAUT_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmermas;

	private Integer codmersla;

	private double qua;

	public Devaut() {
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

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}