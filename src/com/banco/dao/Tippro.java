package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tippro database table.
 * 
 */
@Entity
@Table(name="tippro")
@NamedQuery(name="Tippro.findAll", query="SELECT t FROM Tippro t")
public class Tippro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPPRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPPRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String tippro;

	public Tippro() {
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

	public String getTippro() {
		return this.tippro;
	}

	public void setTippro(String tippro) {
		this.tippro = tippro;
	}

}