package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the medtem database table.
 * 
 */
@Entity
@Table(name="medtem")
@NamedQuery(name="Medtem.findAll", query="SELECT m FROM Medtem m")
public class Medtem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEDTEM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEDTEM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddetope;

	private Time tem;

	public Medtem() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddetope() {
		return this.coddetope;
	}

	public void setCoddetope(Integer coddetope) {
		this.coddetope = coddetope;
	}

	public Time getTem() {
		return this.tem;
	}

	public void setTem(Time tem) {
		this.tem = tem;
	}

}