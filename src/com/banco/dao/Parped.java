package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the parped database table.
 * 
 */
@Entity
@Table(name="parped")
@NamedQuery(name="Parped.findAll", query="SELECT p FROM Parped p")
public class Parped implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARPED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARPED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codped;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=1)
	private String tip;

	private double val;

	public Parped() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}