package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the imposto database table.
 * 
 */
@Entity
@Table(name="imposto")
@NamedQuery(name="Imposto.findAll", query="SELECT i FROM Imposto i")
public class Imposto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="IMPOSTO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMPOSTO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer exiped;

	@Column(length=10)
	private String imp;

	@Column(length=1)
	private String ope;

	public Imposto() {
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

	public Integer getExiped() {
		return this.exiped;
	}

	public void setExiped(Integer exiped) {
		this.exiped = exiped;
	}

	public String getImp() {
		return this.imp;
	}

	public void setImp(String imp) {
		this.imp = imp;
	}

	public String getOpe() {
		return this.ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

}