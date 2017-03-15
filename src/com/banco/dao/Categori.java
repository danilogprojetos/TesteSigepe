package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categori database table.
 * 
 */
@Entity
@Table(name="categori")
@NamedQuery(name="Categori.findAll", query="SELECT c FROM Categori c")
public class Categori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CATEGORI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CATEGORI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String cat;

	private Integer codest;

	@Column(length=60)
	private String dirfil;

	public Categori() {
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

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Integer getCodest() {
		return this.codest;
	}

	public void setCodest(Integer codest) {
		this.codest = codest;
	}

	public String getDirfil() {
		return this.dirfil;
	}

	public void setDirfil(String dirfil) {
		this.dirfil = dirfil;
	}

}