package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dadcobrec database table.
 * 
 */
@Entity
@Table(name="dadcobrec")
@NamedQuery(name="Dadcobrec.findAll", query="SELECT d FROM Dadcobrec d")
public class Dadcobrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DADCOBREC_CODPARREC_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DADCOBREC_CODPARREC_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codparrec;

	private Integer bai;

	@Column(length=20)
	private String car;

	private Integer codforpag;

	@Column(length=40)
	private String codmovrem;

	private double descob;

	private Integer diabai;

	private Integer diapro;

	@Column(length=20)
	private String disblo;

	@Column(length=20)
	private String emiblo;

	private Integer pro;

	private double taxmenjur;

	private double taxmul;

	@Column(length=3)
	private String tipcob;

	private double valblo;

	public Dadcobrec() {
	}

	public Integer getCodparrec() {
		return this.codparrec;
	}

	public void setCodparrec(Integer codparrec) {
		this.codparrec = codparrec;
	}

	public Integer getBai() {
		return this.bai;
	}

	public void setBai(Integer bai) {
		this.bai = bai;
	}

	public String getCar() {
		return this.car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public Integer getCodforpag() {
		return this.codforpag;
	}

	public void setCodforpag(Integer codforpag) {
		this.codforpag = codforpag;
	}

	public String getCodmovrem() {
		return this.codmovrem;
	}

	public void setCodmovrem(String codmovrem) {
		this.codmovrem = codmovrem;
	}

	public double getDescob() {
		return this.descob;
	}

	public void setDescob(double descob) {
		this.descob = descob;
	}

	public Integer getDiabai() {
		return this.diabai;
	}

	public void setDiabai(Integer diabai) {
		this.diabai = diabai;
	}

	public Integer getDiapro() {
		return this.diapro;
	}

	public void setDiapro(Integer diapro) {
		this.diapro = diapro;
	}

	public String getDisblo() {
		return this.disblo;
	}

	public void setDisblo(String disblo) {
		this.disblo = disblo;
	}

	public String getEmiblo() {
		return this.emiblo;
	}

	public void setEmiblo(String emiblo) {
		this.emiblo = emiblo;
	}

	public Integer getPro() {
		return this.pro;
	}

	public void setPro(Integer pro) {
		this.pro = pro;
	}

	public double getTaxmenjur() {
		return this.taxmenjur;
	}

	public void setTaxmenjur(double taxmenjur) {
		this.taxmenjur = taxmenjur;
	}

	public double getTaxmul() {
		return this.taxmul;
	}

	public void setTaxmul(double taxmul) {
		this.taxmul = taxmul;
	}

	public String getTipcob() {
		return this.tipcob;
	}

	public void setTipcob(String tipcob) {
		this.tipcob = tipcob;
	}

	public double getValblo() {
		return this.valblo;
	}

	public void setValblo(double valblo) {
		this.valblo = valblo;
	}

}