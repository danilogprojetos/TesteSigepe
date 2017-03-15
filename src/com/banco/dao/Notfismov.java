package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the notfismov database table.
 * 
 */
@Entity
@Table(name="notfismov")
@NamedQuery(name="Notfismov.findAll", query="SELECT n FROM Notfismov n")
public class Notfismov implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NOTFISMOV_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NOTFISMOV_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer cnotfis;

	private Integer codmov;

	private Integer codtipmov;

	public Notfismov() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Integer getCodtipmov() {
		return this.codtipmov;
	}

	public void setCodtipmov(Integer codtipmov) {
		this.codtipmov = codtipmov;
	}

}