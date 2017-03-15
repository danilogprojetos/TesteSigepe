package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tamanho database table.
 * 
 */
@Entity
@Table(name="tamanho")
@NamedQuery(name="Tamanho.findAll", query="SELECT t FROM Tamanho t")
public class Tamanho implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAMANHO_TAM_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAMANHO_TAM_GENERATOR")
	@Column(unique=true, nullable=false, length=3)
	private String tam;

	private Integer ord;

	public Tamanho() {
	}

	public String getTam() {
		return this.tam;
	}

	public void setTam(String tam) {
		this.tam = tam;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

}