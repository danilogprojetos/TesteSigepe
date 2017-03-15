package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the movplaco database table.
 * 
 */
@Entity
@Table(name="movplaco")
@NamedQuery(name="Movplaco.findAll", query="SELECT m FROM Movplaco m")
public class Movplaco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVPLACO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVPLACO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcencus;

	private Integer codetapro;

	private Integer codmov;

	private Integer codpedsai;

	private Integer codplacon;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Integer tipmov;

	private double val;

	public Movplaco() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodetapro() {
		return this.codetapro;
	}

	public void setCodetapro(Integer codetapro) {
		this.codetapro = codetapro;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Integer getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(Integer tipmov) {
		this.tipmov = tipmov;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}