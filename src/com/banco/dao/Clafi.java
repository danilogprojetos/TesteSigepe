package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clafis database table.
 * 
 */
@Entity
@Table(name="clafis")
@NamedQuery(name="Clafi.findAll", query="SELECT c FROM Clafi c")
public class Clafi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLAFIS_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLAFIS_COD_GENERATOR")
	@Column(unique=true, nullable=false, length=10)
	private String cod;

	private Integer ativo;

	@Column(length=40)
	private String clafis;

	public Clafi() {
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getClafis() {
		return this.clafis;
	}

	public void setClafis(String clafis) {
		this.clafis = clafis;
	}

}