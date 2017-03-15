package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subtipre database table.
 * 
 */
@Entity
@Table(name="subtipre")
@NamedQuery(name="Subtipre.findAll", query="SELECT s FROM Subtipre s")
public class Subtipre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBTIPRE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBTIPRE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer codtiprec;

	@Column(length=40)
	private String subtiprec;

	public Subtipre() {
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

	public Integer getCodtiprec() {
		return this.codtiprec;
	}

	public void setCodtiprec(Integer codtiprec) {
		this.codtiprec = codtiprec;
	}

	public String getSubtiprec() {
		return this.subtiprec;
	}

	public void setSubtiprec(String subtiprec) {
		this.subtiprec = subtiprec;
	}

}