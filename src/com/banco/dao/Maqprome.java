package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the maqprome database table.
 * 
 */
@Entity
@Table(name="maqprome")
@NamedQuery(name="Maqprome.findAll", query="SELECT m FROM Maqprome m")
public class Maqprome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MAQPROME_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAQPROME_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmermas;

	private Integer codmersla;

	private Integer codopepromer;

	private Time qua;

	public Maqprome() {
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

	public Time getQua() {
		return this.qua;
	}

	public void setQua(Time qua) {
		this.qua = qua;
	}

}