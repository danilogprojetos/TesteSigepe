package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detmer database table.
 * 
 */
@Entity
@Table(name="detmer")
@NamedQuery(name="Detmer.findAll", query="SELECT d FROM Detmer d")
public class Detmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=30)
	private String detmer;

	public Detmer() {
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

	public String getDetmer() {
		return this.detmer;
	}

	public void setDetmer(String detmer) {
		this.detmer = detmer;
	}

}