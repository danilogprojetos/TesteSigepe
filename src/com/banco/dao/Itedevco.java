package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itedevco database table.
 * 
 */
@Entity
@Table(name="itedevco")
@NamedQuery(name="Itedevco.findAll", query="SELECT i FROM Itedevco i")
public class Itedevco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEDEVCO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEDEVCO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddevcom;

	private Integer codmer;

	private double qua;

	private double val;

	public Itedevco() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddevcom() {
		return this.coddevcom;
	}

	public void setCoddevcom(Integer coddevcom) {
		this.coddevcom = coddevcom;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
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