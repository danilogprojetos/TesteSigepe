package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conmdf database table.
 * 
 */
@Entity
@Table(name="conmdf")
@NamedQuery(name="Conmdf.findAll", query="SELECT c FROM Conmdf c")
public class Conmdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmandocfis;

	private Integer codven;

	public Conmdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmandocfis() {
		return this.codmandocfis;
	}

	public void setCodmandocfis(Integer codmandocfis) {
		this.codmandocfis = codmandocfis;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

}