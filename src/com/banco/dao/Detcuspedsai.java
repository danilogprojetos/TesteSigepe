package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detcuspedsai database table.
 * 
 */
@Entity
@Table(name="detcuspedsai")
@NamedQuery(name="Detcuspedsai.findAll", query="SELECT d FROM Detcuspedsai d")
public class Detcuspedsai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETCUSPEDSAI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETCUSPEDSAI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcusmer;

	private Integer codpedsai;

	private double por;

	public Detcuspedsai() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcusmer() {
		return this.codcusmer;
	}

	public void setCodcusmer(Integer codcusmer) {
		this.codcusmer = codcusmer;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public double getPor() {
		return this.por;
	}

	public void setPor(double por) {
		this.por = por;
	}

}