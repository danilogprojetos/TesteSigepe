package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opecrimer database table.
 * 
 */
@Entity
@Table(name="opecrimer")
@NamedQuery(name="Opecrimer.findAll", query="SELECT o FROM Opecrimer o")
public class Opecrimer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPECRIMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPECRIMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Boolean ativo;

	@Column(length=20)
	private String opecrimer;

	private Integer tip;

	public Opecrimer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getOpecrimer() {
		return this.opecrimer;
	}

	public void setOpecrimer(String opecrimer) {
		this.opecrimer = opecrimer;
	}

	public Integer getTip() {
		return this.tip;
	}

	public void setTip(Integer tip) {
		this.tip = tip;
	}

}