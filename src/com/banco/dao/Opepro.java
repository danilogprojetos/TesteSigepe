package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opepro database table.
 * 
 */
@Entity
@Table(name="opepro")
@NamedQuery(name="Opepro.findAll", query="SELECT o FROM Opepro o")
public class Opepro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPEPRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPEPRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer codcencus;

	@Column(length=20)
	private String opepro;

	private Integer ord;

	private double pertol;

	private double tem;

	private Integer tip;

	public Opepro() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public String getOpepro() {
		return this.opepro;
	}

	public void setOpepro(String opepro) {
		this.opepro = opepro;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public double getPertol() {
		return this.pertol;
	}

	public void setPertol(double pertol) {
		this.pertol = pertol;
	}

	public double getTem() {
		return this.tem;
	}

	public void setTem(double tem) {
		this.tem = tem;
	}

	public Integer getTip() {
		return this.tip;
	}

	public void setTip(Integer tip) {
		this.tip = tip;
	}

}