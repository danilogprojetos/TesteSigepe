package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the desimp database table.
 * 
 */
@Entity
@Table(name="desimp")
@NamedQuery(name="Desimp.findAll", query="SELECT d FROM Desimp d")
public class Desimp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DESIMP_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESIMP_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer cnotfis;

	@Column(length=20)
	private String des;

	private double valdes;

	public Desimp() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

}