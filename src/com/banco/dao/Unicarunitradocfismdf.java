package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unicarunitradocfismdf database table.
 * 
 */
@Entity
@Table(name="unicarunitradocfismdf")
@NamedQuery(name="Unicarunitradocfismdf.findAll", query="SELECT u FROM Unicarunitradocfismdf u")
public class Unicarunitradocfismdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UNICARUNITRADOCFISMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UNICARUNITRADOCFISMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codtipunicar;

	private Integer codunitradocfismdf;

	@Column(length=20)
	private String ide;

	private double qualac;

	private double quarat;

	public Unicarunitradocfismdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodtipunicar() {
		return this.codtipunicar;
	}

	public void setCodtipunicar(Integer codtipunicar) {
		this.codtipunicar = codtipunicar;
	}

	public Integer getCodunitradocfismdf() {
		return this.codunitradocfismdf;
	}

	public void setCodunitradocfismdf(Integer codunitradocfismdf) {
		this.codunitradocfismdf = codunitradocfismdf;
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