package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acemaq database table.
 * 
 */
@Entity
@Table(name="acemaq")
@NamedQuery(name="Acemaq.findAll", query="SELECT a FROM Acemaq a")
public class Acemaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACEMAQ_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACEMAQ_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmaq;

	private Integer codmaqpromer;

	public Acemaq() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmaq() {
		return this.codmaq;
	}

	public void setCodmaq(Integer codmaq) {
		this.codmaq = codmaq;
	}

	public Integer getCodmaqpromer() {
		return this.codmaqpromer;
	}

	public void setCodmaqpromer(Integer codmaqpromer) {
		this.codmaqpromer = codmaqpromer;
	}

}