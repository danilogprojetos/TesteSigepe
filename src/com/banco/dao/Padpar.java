package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the padpar database table.
 * 
 */
@Entity
@Table(name="padpar")
@NamedQuery(name="Padpar.findAll", query="SELECT p FROM Padpar p")
public class Padpar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PADPAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PADPAR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=30)
	private String padpar;

	public Padpar() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getPadpar() {
		return this.padpar;
	}

	public void setPadpar(String padpar) {
		this.padpar = padpar;
	}

}