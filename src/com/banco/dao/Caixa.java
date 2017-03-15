package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the caixa database table.
 * 
 */
@Entity
@Table(name="caixa")
@NamedQuery(name="Caixa.findAll", query="SELECT c FROM Caixa c")
public class Caixa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CAIXA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAIXA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer cup;

	@Column(length=25)
	private String nomcom;

	private Integer notfis;

	@Column(length=20)
	private String porcup;

	@Column(length=20)
	private String pornotfis;

	private double salche;

	private double saldin;

	public Caixa() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getCup() {
		return this.cup;
	}

	public void setCup(Integer cup) {
		this.cup = cup;
	}

	public String getNomcom() {
		return this.nomcom;
	}

	public void setNomcom(String nomcom) {
		this.nomcom = nomcom;
	}

	public Integer getNotfis() {
		return this.notfis;
	}

	public void setNotfis(Integer notfis) {
		this.notfis = notfis;
	}

	public String getPorcup() {
		return this.porcup;
	}

	public void setPorcup(String porcup) {
		this.porcup = porcup;
	}

	public String getPornotfis() {
		return this.pornotfis;
	}

	public void setPornotfis(String pornotfis) {
		this.pornotfis = pornotfis;
	}

	public double getSalche() {
		return this.salche;
	}

	public void setSalche(double salche) {
		this.salche = salche;
	}

	public double getSaldin() {
		return this.saldin;
	}

	public void setSaldin(double saldin) {
		this.saldin = saldin;
	}

}