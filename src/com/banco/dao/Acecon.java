package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acecon database table.
 * 
 */
@Entity
@Table(name="acecon")
@NamedQuery(name="Acecon.findAll", query="SELECT a FROM Acecon a")
public class Acecon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACECON_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACECON_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codacepri;

	private Integer codacesec;

	private double qua;

	public Acecon() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodacepri() {
		return this.codacepri;
	}

	public void setCodacepri(Integer codacepri) {
		this.codacepri = codacepri;
	}

	public Integer getCodacesec() {
		return this.codacesec;
	}

	public void setCodacesec(Integer codacesec) {
		this.codacesec = codacesec;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}