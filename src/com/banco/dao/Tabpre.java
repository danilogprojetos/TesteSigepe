package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tabpre database table.
 * 
 */
@Entity
@Table(name="tabpre")
@NamedQuery(name="Tabpre.findAll", query="SELECT t FROM Tabpre t")
public class Tabpre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TABPRE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TABPRE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer insnovmer;

	private byte[] obs;

	private double porluc;

	@Column(length=25)
	private String tabpre;

	public Tabpre() {
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

	public Integer getInsnovmer() {
		return this.insnovmer;
	}

	public void setInsnovmer(Integer insnovmer) {
		this.insnovmer = insnovmer;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getPorluc() {
		return this.porluc;
	}

	public void setPorluc(double porluc) {
		this.porluc = porluc;
	}

	public String getTabpre() {
		return this.tabpre;
	}

	public void setTabpre(String tabpre) {
		this.tabpre = tabpre;
	}

}