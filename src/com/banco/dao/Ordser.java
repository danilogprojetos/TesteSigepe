package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the ordser database table.
 * 
 */
@Entity
@Table(name="ordser")
@NamedQuery(name="Ordser.findAll", query="SELECT o FROM Ordser o")
public class Ordser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDSER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDSER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcli;

	private Integer coddig;

	private Integer codmotordser;

	private Integer codtec;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datage;

	@Temporal(TemporalType.DATE)
	private Date datbai;

	private byte[] dia;

	private Time hor;

	private byte[] obs;

	private Integer pen;

	public Ordser() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCoddig() {
		return this.coddig;
	}

	public void setCoddig(Integer coddig) {
		this.coddig = coddig;
	}

	public Integer getCodmotordser() {
		return this.codmotordser;
	}

	public void setCodmotordser(Integer codmotordser) {
		this.codmotordser = codmotordser;
	}

	public Integer getCodtec() {
		return this.codtec;
	}

	public void setCodtec(Integer codtec) {
		this.codtec = codtec;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatage() {
		return this.datage;
	}

	public void setDatage(Date datage) {
		this.datage = datage;
	}

	public Date getDatbai() {
		return this.datbai;
	}

	public void setDatbai(Date datbai) {
		this.datbai = datbai;
	}

	public byte[] getDia() {
		return this.dia;
	}

	public void setDia(byte[] dia) {
		this.dia = dia;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getPen() {
		return this.pen;
	}

	public void setPen(Integer pen) {
		this.pen = pen;
	}

}