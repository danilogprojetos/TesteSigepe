package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lacunitradocfismdf database table.
 * 
 */
@Entity
@Table(name="lacunitradocfismdf")
@NamedQuery(name="Lacunitradocfismdf.findAll", query="SELECT l FROM Lacunitradocfismdf l")
public class Lacunitradocfismdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LACUNITRADOCFISMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LACUNITRADOCFISMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codunitradocfismdf;

	@Column(length=20)
	private String lacunitradocfismdf;

	public Lacunitradocfismdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodunitradocfismdf() {
		return this.codunitradocfismdf;
	}

	public void setCodunitradocfismdf(Integer codunitradocfismdf) {
		this.codunitradocfismdf = codunitradocfismdf;
	}

	public String getLacunitradocfismdf() {
		return this.lacunitradocfismdf;
	}

	public void setLacunitradocfismdf(String lacunitradocfismdf) {
		this.lacunitradocfismdf = lacunitradocfismdf;
	}

}