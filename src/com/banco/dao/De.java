package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the des database table.
 * 
 */
@Entity
@Table(name="des")
@NamedQuery(name="De.findAll", query="SELECT d FROM De d")
public class De implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DES_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DES_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=10)
	private String camnotfis;

	@Column(length=30)
	private String des;

	private double somondusa;

	public De() {
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

	public String getCamnotfis() {
		return this.camnotfis;
	}

	public void setCamnotfis(String camnotfis) {
		this.camnotfis = camnotfis;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getSomondusa() {
		return this.somondusa;
	}

	public void setSomondusa(double somondusa) {
		this.somondusa = somondusa;
	}

}