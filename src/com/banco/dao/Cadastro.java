package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cadastro database table.
 * 
 */
@Entity
@Table(name="cadastro")
@NamedQuery(name="Cadastro.findAll", query="SELECT c FROM Cadastro c")
public class Cadastro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CADASTRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CADASTRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=30)
	private String cad;

	@Column(length=30)
	private String des;

	@Column(length=20)
	private String mod;

	private Integer valdef;

	public Cadastro() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCad() {
		return this.cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getMod() {
		return this.mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public Integer getValdef() {
		return this.valdef;
	}

	public void setValdef(Integer valdef) {
		this.valdef = valdef;
	}

}