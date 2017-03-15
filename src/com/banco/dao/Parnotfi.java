package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the parnotfi database table.
 * 
 */
@Entity
@Table(name="parnotfi")
@NamedQuery(name="Parnotfi.findAll", query="SELECT p FROM Parnotfi p")
public class Parnotfi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARNOTFI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARNOTFI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer cnotfis;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=3)
	private String num;

	private double val;

	public Parnotfi() {
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

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}