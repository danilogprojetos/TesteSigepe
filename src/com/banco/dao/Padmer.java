package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the padmer database table.
 * 
 */
@Entity
@Table(name="padmer")
@NamedQuery(name="Padmer.findAll", query="SELECT p FROM Padmer p")
public class Padmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PADMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PADMER_COD_GENERATOR")
	@Column(unique=true, nullable=false, length=6)
	private String cod;

	private Integer ativo;

	@Column(length=20)
	private String padmer;

	public Padmer() {
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

	public String getPadmer() {
		return this.padmer;
	}

	public void setPadmer(String padmer) {
		this.padmer = padmer;
	}

}