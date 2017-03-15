package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the itepedsa database table.
 * 
 */
@Entity
@Table(name="itepedsa")
@NamedQuery(name="Itepedsa.findAll", query="SELECT i FROM Itepedsa i")
public class Itepedsa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEPEDSA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEPEDSA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double aliicm;

	private Integer coditeped;

	private Integer coditepedsai;

	private Integer codlan;

	private Integer codmer;

	private Integer codped;

	private Integer cupcan;

	private Time hor;

	@Column(length=30)
	private String numlot;

	private Integer oricon;

	private double porcom;

	private double quaent;

	private double quaven;

	private double valcus;

	private double valdes;

	private double valven;

	private Integer valvenpro;

	public Itepedsa() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAliicm() {
		return this.aliicm;
	}

	public void setAliicm(double aliicm) {
		this.aliicm = aliicm;
	}

	public Integer getCoditeped() {
		return this.coditeped;
	}

	public void setCoditeped(Integer coditeped) {
		this.coditeped = coditeped;
	}

	public Integer getCoditepedsai() {
		return this.coditepedsai;
	}

	public void setCoditepedsai(Integer coditepedsai) {
		this.coditepedsai = coditepedsai;
	}

	public Integer getCodlan() {
		return this.codlan;
	}

	public void setCodlan(Integer codlan) {
		this.codlan = codlan;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public Integer getCupcan() {
		return this.cupcan;
	}

	public void setCupcan(Integer cupcan) {
		this.cupcan = cupcan;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public String getNumlot() {
		return this.numlot;
	}

	public void setNumlot(String numlot) {
		this.numlot = numlot;
	}

	public Integer getOricon() {
		return this.oricon;
	}

	public void setOricon(Integer oricon) {
		this.oricon = oricon;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getQuaent() {
		return this.quaent;
	}

	public void setQuaent(double quaent) {
		this.quaent = quaent;
	}

	public double getQuaven() {
		return this.quaven;
	}

	public void setQuaven(double quaven) {
		this.quaven = quaven;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

	public double getValven() {
		return this.valven;
	}

	public void setValven(double valven) {
		this.valven = valven;
	}

	public Integer getValvenpro() {
		return this.valvenpro;
	}

	public void setValvenpro(Integer valvenpro) {
		this.valvenpro = valvenpro;
	}

}