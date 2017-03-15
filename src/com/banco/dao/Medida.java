package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the medida database table.
 * 
 */
@Entity
@Table(name="medida")
@NamedQuery(name="Medida.findAll", query="SELECT m FROM Medida m")
public class Medida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEDIDA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEDIDA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=50)
	private String med;

	public Medida() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getMed() {
		return this.med;
	}

	public void setMed(String med) {
		this.med = med;
	}

}