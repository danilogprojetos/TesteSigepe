package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unitradocfismdf database table.
 * 
 */
@Entity
@Table(name="unitradocfismdf")
@NamedQuery(name="Unitradocfismdf.findAll", query="SELECT u FROM Unitradocfismdf u")
public class Unitradocfismdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UNITRADOCFISMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UNITRADOCFISMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddocfismdf;

	private Integer codtipunitra;

	@Column(length=20)
	private String ide;

	private double qualac;

	private double quarat;

	public Unitradocfismdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddocfismdf() {
		return this.coddocfismdf;
	}

	public void setCoddocfismdf(Integer coddocfismdf) {
		this.coddocfismdf = coddocfismdf;
	}

	public Integer getCodtipunitra() {
		return this.codtipunitra;
	}

	public void setCodtipunitra(Integer codtipunitra) {
		this.codtipunitra = codtipunitra;
	}

	public String getIde() {
		return this.ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public double getQualac() {
		return this.qualac;
	}

	public void setQualac(double qualac) {
		this.qualac = qualac;
	}

	public double getQuarat() {
		return this.quarat;
	}

	public void setQuarat(double quarat) {
		this.quarat = quarat;
	}

}