package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the log database table.
 * 
 */
@Entity
@Table(name="log")
@NamedQuery(name="Log.findAll", query="SELECT l FROM Log l")
public class Log implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOG_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=20)
	private String camalt;

	private Integer codmov;

	@Column(length=20)
	private String com;

	@Column(length=30)
	private String conant;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Time hor;

	@Column(length=255)
	private String mot;

	private byte[] obs;

	@Column(length=10)
	private String ope;

	@Column(length=10)
	private String tipmov;

	@Column(length=20)
	private String usu;

	public Log() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCamalt() {
		return this.camalt;
	}

	public void setCamalt(String camalt) {
		this.camalt = camalt;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public String getCom() {
		return this.com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public String getConant() {
		return this.conant;
	}

	public void setConant(String conant) {
		this.conant = conant;
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

	public String getMot() {
		return this.mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public String getOpe() {
		return this.ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

	public String getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(String tipmov) {
		this.tipmov = tipmov;
	}

	public String getUsu() {
		return this.usu;
	}

	public void setUsu(String usu) {
		this.usu = usu;
	}

}