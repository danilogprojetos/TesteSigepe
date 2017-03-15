package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subtippa database table.
 * 
 */
@Entity
@Table(name="subtippa")
@NamedQuery(name="Subtippa.findAll", query="SELECT s FROM Subtippa s")
public class Subtippa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBTIPPA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBTIPPA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer codtippag;

	@Column(length=40)
	private String subtippag;

	public Subtippa() {
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

	public Integer getCodtippag() {
		return this.codtippag;
	}

	public void setCodtippag(Integer codtippag) {
		this.codtippag = codtippag;
	}

	public String getSubtippag() {
		return this.subtippag;
	}

	public void setSubtippag(String subtippag) {
		this.subtippag = subtippag;
	}

}