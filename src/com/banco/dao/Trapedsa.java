package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trapedsa database table.
 * 
 */
@Entity
@Table(name="trapedsa")
@NamedQuery(name="Trapedsa.findAll", query="SELECT t FROM Trapedsa t")
public class Trapedsa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRAPEDSA_CODPEDSAI_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRAPEDSA_CODPEDSAI_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codpedsai;

	private Integer codtra;

	private Integer codtrared;

	private Integer sitfre;

	public Trapedsa() {
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodtra() {
		return this.codtra;
	}

	public void setCodtra(Integer codtra) {
		this.codtra = codtra;
	}

	public Integer getCodtrared() {
		return this.codtrared;
	}

	public void setCodtrared(Integer codtrared) {
		this.codtrared = codtrared;
	}

	public Integer getSitfre() {
		return this.sitfre;
	}

	public void setSitfre(Integer sitfre) {
		this.sitfre = sitfre;
	}

}