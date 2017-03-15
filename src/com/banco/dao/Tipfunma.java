package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipfunma database table.
 * 
 */
@Entity
@Table(name="tipfunma")
@NamedQuery(name="Tipfunma.findAll", query="SELECT t FROM Tipfunma t")
public class Tipfunma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPFUNMA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPFUNMA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmaqpromer;

	private Integer codtipfun;

	public Tipfunma() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmaqpromer() {
		return this.codmaqpromer;
	}

	public void setCodmaqpromer(Integer codmaqpromer) {
		this.codmaqpromer = codmaqpromer;
	}

	public Integer getCodtipfun() {
		return this.codtipfun;
	}

	public void setCodtipfun(Integer codtipfun) {
		this.codtipfun = codtipfun;
	}

}