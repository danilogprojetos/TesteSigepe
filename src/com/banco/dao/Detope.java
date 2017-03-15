package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the detope database table.
 * 
 */
@Entity
@Table(name="detope")
@NamedQuery(name="Detope.findAll", query="SELECT d FROM Detope d")
public class Detope implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETOPE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETOPE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codopepromer;

	@Column(length=30)
	private String detope;

	private Time temtot;

	public Detope() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodopepromer() {
		return this.codopepromer;
	}

	public void setCodopepromer(Integer codopepromer) {
		this.codopepromer = codopepromer;
	}

	public String getDetope() {
		return this.detope;
	}

	public void setDetope(String detope) {
		this.detope = detope;
	}

	public Time getTemtot() {
		return this.temtot;
	}

	public void setTemtot(Time temtot) {
		this.temtot = temtot;
	}

}