package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lancai database table.
 * 
 */
@Entity
@Table(name="lancai")
@NamedQuery(name="Lancai.findAll", query="SELECT l FROM Lancai l")
public class Lancai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LANCAI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LANCAI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcai;

	private Integer codcon;

	private Integer codtipcai;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private double val;

	public Lancai() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcai() {
		return this.codcai;
	}

	public void setCodcai(Integer codcai) {
		this.codcai = codcai;
	}

	public Integer getCodcon() {
		return this.codcon;
	}

	public void setCodcon(Integer codcon) {
		this.codcon = codcon;
	}

	public Integer getCodtipcai() {
		return this.codtipcai;
	}

	public void setCodtipcai(Integer codtipcai) {
		this.codtipcai = codtipcai;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}