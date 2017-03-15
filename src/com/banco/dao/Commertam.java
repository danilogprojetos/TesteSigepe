package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commertam database table.
 * 
 */
@Entity
@Table(name="commertam")
@NamedQuery(name="Commertam.findAll", query="SELECT c FROM Commertam c")
public class Commertam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMMERTAM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMMERTAM_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmermas;

	private Integer codmersla;

	private Integer codopepromer;

	private double qua;

	public Commertam() {
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

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}