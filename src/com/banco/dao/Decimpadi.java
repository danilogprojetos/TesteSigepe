package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the decimpadi database table.
 * 
 */
@Entity
@Table(name="decimpadi")
@NamedQuery(name="Decimpadi.findAll", query="SELECT d FROM Decimpadi d")
public class Decimpadi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DECIMPADI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DECIMPADI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddecimp;

	@Column(length=60)
	private String codfab;

	private double des;

	@Column(length=20)
	private String num;

	public Decimpadi() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddecimp() {
		return this.coddecimp;
	}

	public void setCoddecimp(Integer coddecimp) {
		this.coddecimp = coddecimp;
	}

	public String getCodfab() {
		return this.codfab;
	}

	public void setCodfab(String codfab) {
		this.codfab = codfab;
	}

	public double getDes() {
		return this.des;
	}

	public void setDes(double des) {
		this.des = des;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}