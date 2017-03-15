package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mundesmdf database table.
 * 
 */
@Entity
@Table(name="mundesmdf")
@NamedQuery(name="Mundesmdf.findAll", query="SELECT m FROM Mundesmdf m")
public class Mundesmdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MUNDESMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MUNDESMDF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcid;

	private Integer codmandocfis;

	public Mundesmdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public Integer getCodmandocfis() {
		return this.codmandocfis;
	}

	public void setCodmandocfis(Integer codmandocfis) {
		this.codmandocfis = codmandocfis;
	}

}