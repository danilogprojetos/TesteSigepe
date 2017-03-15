package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reqcom database table.
 * 
 */
@Entity
@Table(name="reqcom")
@NamedQuery(name="Reqcom.findAll", query="SELECT r FROM Reqcom r")
public class Reqcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REQCOM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQCOM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private double qua;

	private Integer sta;

	public Reqcom() {
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

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public Integer getSta() {
		return this.sta;
	}

	public void setSta(Integer sta) {
		this.sta = sta;
	}

}