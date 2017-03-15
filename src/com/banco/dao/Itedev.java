package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itedev database table.
 * 
 */
@Entity
@Table(name="itedev")
@NamedQuery(name="Itedev.findAll", query="SELECT i FROM Itedev i")
public class Itedev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEDEV_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEDEV_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditeped;

	private Integer codmer;

	private Integer codmov;

	private double porcom;

	private double qua;

	@Column(length=6)
	private String tipmov;

	private double val;

	public Itedev() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditeped() {
		return this.coditeped;
	}

	public void setCoditeped(Integer coditeped) {
		this.coditeped = coditeped;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public String getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(String tipmov) {
		this.tipmov = tipmov;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}