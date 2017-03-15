package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the merace database table.
 * 
 */
@Entity
@Table(name="merace")
@NamedQuery(name="Merace.findAll", query="SELECT m FROM Merace m")
public class Merace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MERACE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MERACE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codacemer;

	private Integer codacepad;

	private Integer codmer;

	private double qua;

	public Merace() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodacemer() {
		return this.codacemer;
	}

	public void setCodacemer(Integer codacemer) {
		this.codacemer = codacemer;
	}

	public Integer getCodacepad() {
		return this.codacepad;
	}

	public void setCodacepad(Integer codacepad) {
		this.codacepad = codacepad;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}