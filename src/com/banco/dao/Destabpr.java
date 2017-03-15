package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the destabpr database table.
 * 
 */
@Entity
@Table(name="destabpr")
@NamedQuery(name="Destabpr.findAll", query="SELECT d FROM Destabpr d")
public class Destabpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DESTABPR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESTABPR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codtabpre;

	private double pordes;

	private double pramed;

	public Destabpr() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodtabpre() {
		return this.codtabpre;
	}

	public void setCodtabpre(Integer codtabpre) {
		this.codtabpre = codtabpre;
	}

	public double getPordes() {
		return this.pordes;
	}

	public void setPordes(double pordes) {
		this.pordes = pordes;
	}

	public double getPramed() {
		return this.pramed;
	}

	public void setPramed(double pramed) {
		this.pramed = pramed;
	}

}