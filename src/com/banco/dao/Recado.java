package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the recado database table.
 * 
 */
@Entity
@Table(name="recado")
@NamedQuery(name="Recado.findAll", query="SELECT r FROM Recado r")
public class Recado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RECADO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECADO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmer;

	private Integer codpes;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private byte[] obs;

	private Integer sta;

	@Column(length=1)
	private String tip;

	public Recado() {
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

	public Integer getCodpes() {
		return this.codpes;
	}

	public void setCodpes(Integer codpes) {
		this.codpes = codpes;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getSta() {
		return this.sta;
	}

	public void setSta(Integer sta) {
		this.sta = sta;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}