package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commerpr database table.
 * 
 */
@Entity
@Table(name="commerpr")
@NamedQuery(name="Commerpr.findAll", query="SELECT c FROM Commerpr c")
public class Commerpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMMERPR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMMERPR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmermas;

	private Integer codmersla;

	private Integer codopepromer;

	private Integer niv;

	private double quapre;

	private double quaprepro;

	private double quarea;

	private double quareapro;

	private Integer sit;

	private double valcuscal;

	public Commerpr() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmermas() {
		return this.codmermas;
	}

	public void setCodmermas(Integer codmermas) {
		this.codmermas = codmermas;
	}

	public Integer getCodmersla() {
		return this.codmersla;
	}

	public void setCodmersla(Integer codmersla) {
		this.codmersla = codmersla;
	}

	public Integer getCodopepromer() {
		return this.codopepromer;
	}

	public void setCodopepromer(Integer codopepromer) {
		this.codopepromer = codopepromer;
	}

	public Integer getNiv() {
		return this.niv;
	}

	public void setNiv(Integer niv) {
		this.niv = niv;
	}

	public double getQuapre() {
		return this.quapre;
	}

	public void setQuapre(double quapre) {
		this.quapre = quapre;
	}

	public double getQuaprepro() {
		return this.quaprepro;
	}

	public void setQuaprepro(double quaprepro) {
		this.quaprepro = quaprepro;
	}

	public double getQuarea() {
		return this.quarea;
	}

	public void setQuarea(double quarea) {
		this.quarea = quarea;
	}

	public double getQuareapro() {
		return this.quareapro;
	}

	public void setQuareapro(double quareapro) {
		this.quareapro = quareapro;
	}

	public Integer getSit() {
		return this.sit;
	}

	public void setSit(Integer sit) {
		this.sit = sit;
	}

	public double getValcuscal() {
		return this.valcuscal;
	}

	public void setValcuscal(double valcuscal) {
		this.valcuscal = valcuscal;
	}

}