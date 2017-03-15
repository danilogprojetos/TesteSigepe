package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the volnotfi database table.
 * 
 */
@Entity
@Table(name="volnotfi")
@NamedQuery(name="Volnotfi.findAll", query="SELECT v FROM Volnotfi v")
public class Volnotfi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VOLNOTFI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VOLNOTFI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codnotfis;

	@Column(length=20)
	private String esp;

	@Column(length=20)
	private String mar;

	@Column(length=10)
	private String num;

	private double pesbru;

	private double pesliq;

	private Integer qua;

	public Volnotfi() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodnotfis() {
		return this.codnotfis;
	}

	public void setCodnotfis(Integer codnotfis) {
		this.codnotfis = codnotfis;
	}

	public String getEsp() {
		return this.esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public String getMar() {
		return this.mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getPesbru() {
		return this.pesbru;
	}

	public void setPesbru(double pesbru) {
		this.pesbru = pesbru;
	}

	public double getPesliq() {
		return this.pesliq;
	}

	public void setPesliq(double pesliq) {
		this.pesliq = pesliq;
	}

	public Integer getQua() {
		return this.qua;
	}

	public void setQua(Integer qua) {
		this.qua = qua;
	}

}