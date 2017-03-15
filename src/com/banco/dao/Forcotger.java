package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the forcotger database table.
 * 
 */
@Entity
@Table(name="forcotger")
@NamedQuery(name="Forcotger.findAll", query="SELECT f FROM Forcotger f")
public class Forcotger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORCOTGER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORCOTGER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codfor;

	private Integer coditecotger;

	private double perdes;

	private double valite;

	public Forcotger() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCoditecotger() {
		return this.coditecotger;
	}

	public void setCoditecotger(Integer coditecotger) {
		this.coditecotger = coditecotger;
	}

	public double getPerdes() {
		return this.perdes;
	}

	public void setPerdes(double perdes) {
		this.perdes = perdes;
	}

	public double getValite() {
		return this.valite;
	}

	public void setValite(double valite) {
		this.valite = valite;
	}

}