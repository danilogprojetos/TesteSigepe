package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the placon database table.
 * 
 */
@Entity
@Table(name="placon")
@NamedQuery(name="Placon.findAll", query="SELECT p FROM Placon p")
public class Placon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PLACON_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLACON_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer blo;

	private Integer codorddre;

	private Integer codplacon;

	@Column(length=15)
	private String codseq;

	@Column(length=1)
	private String credeb;

	@Column(length=30)
	private String placon;

	public Placon() {
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

	public Integer getBlo() {
		return this.blo;
	}

	public void setBlo(Integer blo) {
		this.blo = blo;
	}

	public Integer getCodorddre() {
		return this.codorddre;
	}

	public void setCodorddre(Integer codorddre) {
		this.codorddre = codorddre;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public String getCodseq() {
		return this.codseq;
	}

	public void setCodseq(String codseq) {
		this.codseq = codseq;
	}

	public String getCredeb() {
		return this.credeb;
	}

	public void setCredeb(String credeb) {
		this.credeb = credeb;
	}

	public String getPlacon() {
		return this.placon;
	}

	public void setPlacon(String placon) {
		this.placon = placon;
	}

}