package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipunicar database table.
 * 
 */
@Entity
@Table(name="tipunicar")
@NamedQuery(name="Tipunicar.findAll", query="SELECT t FROM Tipunicar t")
public class Tipunicar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPUNICAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPUNICAR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String tipunicar;

	public Tipunicar() {
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

	public String getTipunicar() {
		return this.tipunicar;
	}

	public void setTipunicar(String tipunicar) {
		this.tipunicar = tipunicar;
	}

}