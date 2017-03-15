package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the traped database table.
 * 
 */
@Entity
@Table(name="traped")
@NamedQuery(name="Traped.findAll", query="SELECT t FROM Traped t")
public class Traped implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRAPED_CODPED_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRAPED_CODPED_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codped;

	private Integer codtra;

	private Integer codtrared;

	private Integer sitfre;

	public Traped() {
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
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