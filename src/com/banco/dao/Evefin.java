package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the evefin database table.
 * 
 */
@Entity
@Table(name="evefin")
@NamedQuery(name="Evefin.findAll", query="SELECT e FROM Evefin e")
public class Evefin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EVEFIN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVEFIN_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=1)
	private String agrrec;

	private Integer ativo;

	private Integer codcatevefin;

	@Column(length=25)
	private String eve;

	public Evefin() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getAgrrec() {
		return this.agrrec;
	}

	public void setAgrrec(String agrrec) {
		this.agrrec = agrrec;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getCodcatevefin() {
		return this.codcatevefin;
	}

	public void setCodcatevefin(Integer codcatevefin) {
		this.codcatevefin = codcatevefin;
	}

	public String getEve() {
		return this.eve;
	}

	public void setEve(String eve) {
		this.eve = eve;
	}

}