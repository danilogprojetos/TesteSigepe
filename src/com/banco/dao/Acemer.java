package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acemer database table.
 * 
 */
@Entity
@Table(name="acemer")
@NamedQuery(name="Acemer.findAll", query="SELECT a FROM Acemer a")
public class Acemer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACEMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACEMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=30)
	private String acemer;

	private Integer ativo;

	@Column(length=30)
	private String des;

	private Integer mosdes;

	private Integer ord;

	public Acemer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getAcemer() {
		return this.acemer;
	}

	public void setAcemer(String acemer) {
		this.acemer = acemer;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Integer getMosdes() {
		return this.mosdes;
	}

	public void setMosdes(Integer mosdes) {
		this.mosdes = mosdes;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

}