package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cusmer database table.
 * 
 */
@Entity
@Table(name="cusmer")
@NamedQuery(name="Cusmer.findAll", query="SELECT c FROM Cusmer c")
public class Cusmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=25)
	private String cusmer;

	private double por;

	public Cusmer() {
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

	public String getCusmer() {
		return this.cusmer;
	}

	public void setCusmer(String cusmer) {
		this.cusmer = cusmer;
	}

	public double getPor() {
		return this.por;
	}

	public void setPor(double por) {
		this.por = por;
	}

}