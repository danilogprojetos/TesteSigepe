package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itecotger database table.
 * 
 */
@Entity
@Table(name="itecotger")
@NamedQuery(name="Itecotger.findAll", query="SELECT i FROM Itecotger i")
public class Itecotger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITECOTGER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITECOTGER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcotger;

	private Integer coditecot;

	public Itecotger() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcotger() {
		return this.codcotger;
	}

	public void setCodcotger(Integer codcotger) {
		this.codcotger = codcotger;
	}

	public Integer getCoditecot() {
		return this.coditecot;
	}

	public void setCoditecot(Integer coditecot) {
		this.coditecot = coditecot;
	}

}