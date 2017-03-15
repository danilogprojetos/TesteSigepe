package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteacemer database table.
 * 
 */
@Entity
@Table(name="iteacemer")
@NamedQuery(name="Iteacemer.findAll", query="SELECT i FROM Iteacemer i")
public class Iteacemer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEACEMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEACEMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codacemer;

	private Integer codmer;

	private Integer pad;

	public Iteacemer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodacemer() {
		return this.codacemer;
	}

	public void setCodacemer(Integer codacemer) {
		this.codacemer = codacemer;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getPad() {
		return this.pad;
	}

	public void setPad(Integer pad) {
		this.pad = pad;
	}

}