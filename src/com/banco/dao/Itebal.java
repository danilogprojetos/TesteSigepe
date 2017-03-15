package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the itebal database table.
 * 
 */
@Entity
@Table(name="itebal")
@NamedQuery(name="Itebal.findAll", query="SELECT i FROM Itebal i")
public class Itebal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEBAL_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEBAL_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codbal;

	@Column(length=13)
	private String codbar;

	private Integer codmer;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Time hor;

	private double qua;

	@Column(length=20)
	private String setbal;

	public Itebal() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodbal() {
		return this.codbal;
	}

	public void setCodbal(Integer codbal) {
		this.codbal = codbal;
	}

	public String getCodbar() {
		return this.codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public String getSetbal() {
		return this.setbal;
	}

	public void setSetbal(String setbal) {
		this.setbal = setbal;
	}

}