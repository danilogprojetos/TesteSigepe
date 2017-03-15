package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the triicm database table.
 * 
 */
@Entity
@Table(name="triicm")
@NamedQuery(name="Triicm.findAll", query="SELECT t FROM Triicm t")
public class Triicm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRIICM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRIICM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=60)
	private String triicm;

	public Triicm() {
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

	public String getTriicm() {
		return this.triicm;
	}

	public void setTriicm(String triicm) {
		this.triicm = triicm;
	}

}