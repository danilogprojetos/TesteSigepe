package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the difest database table.
 * 
 */
@Entity
@Table(name="difest")
@NamedQuery(name="Difest.findAll", query="SELECT d FROM Difest d")
public class Difest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIFEST_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIFEST_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codbal;

	private Integer codcat;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=1)
	private String entsai;

	private byte[] obs;

	private Integer oribal;

	public Difest() {
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

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getEntsai() {
		return this.entsai;
	}

	public void setEntsai(String entsai) {
		this.entsai = entsai;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getOribal() {
		return this.oribal;
	}

	public void setOribal(Integer oribal) {
		this.oribal = oribal;
	}

}