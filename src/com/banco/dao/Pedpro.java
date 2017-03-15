package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pedpro database table.
 * 
 */
@Entity
@Table(name="pedpro")
@NamedQuery(name="Pedpro.findAll", query="SELECT p FROM Pedpro p")
public class Pedpro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PEDPRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PEDPRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Temporal(TemporalType.DATE)
	private Date datpedpro;

	@Column(length=250)
	private String obs;

	private Integer sit;

	public Pedpro() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Date getDatpedpro() {
		return this.datpedpro;
	}

	public void setDatpedpro(Date datpedpro) {
		this.datpedpro = datpedpro;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getSit() {
		return this.sit;
	}

	public void setSit(Integer sit) {
		this.sit = sit;
	}

}