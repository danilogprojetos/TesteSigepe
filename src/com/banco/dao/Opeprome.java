package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opeprome database table.
 * 
 */
@Entity
@Table(name="opeprome")
@NamedQuery(name="Opeprome.findAll", query="SELECT o FROM Opeprome o")
public class Opeprome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPEPROME_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPEPROME_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcencus;

	private Integer codmerpro;

	private Integer codopepro;

	private double tem;

	private double valuni;

	public Opeprome() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodmerpro() {
		return this.codmerpro;
	}

	public void setCodmerpro(Integer codmerpro) {
		this.codmerpro = codmerpro;
	}

	public Integer getCodopepro() {
		return this.codopepro;
	}

	public void setCodopepro(Integer codopepro) {
		this.codopepro = codopepro;
	}

	public double getTem() {
		return this.tem;
	}

	public void setTem(double tem) {
		this.tem = tem;
	}

	public double getValuni() {
		return this.valuni;
	}

	public void setValuni(double valuni) {
		this.valuni = valuni;
	}

}