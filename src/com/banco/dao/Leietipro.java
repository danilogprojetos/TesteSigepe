package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the leietipro database table.
 * 
 */
@Entity
@Table(name="leietipro")
@NamedQuery(name="Leietipro.findAll", query="SELECT l FROM Leietipro l")
public class Leietipro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LEIETIPRO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LEIETIPRO_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codpedpro;

	private Integer codusu;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=255)
	private String obs;

	private double quatot;

	public Leietipro() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodpedpro() {
		return this.codpedpro;
	}

	public void setCodpedpro(Integer codpedpro) {
		this.codpedpro = codpedpro;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public double getQuatot() {
		return this.quatot;
	}

	public void setQuatot(double quatot) {
		this.quatot = quatot;
	}

}