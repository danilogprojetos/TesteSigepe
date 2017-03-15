package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipfun database table.
 * 
 */
@Entity
@Table(name="tipfun")
@NamedQuery(name="Tipfun.findAll", query="SELECT t FROM Tipfun t")
public class Tipfun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPFUN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPFUN_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String tipfun;

	public Tipfun() {
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

	public String getTipfun() {
		return this.tipfun;
	}

	public void setTipfun(String tipfun) {
		this.tipfun = tipfun;
	}

}