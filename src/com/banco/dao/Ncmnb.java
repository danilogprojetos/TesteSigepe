package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ncmnbs database table.
 * 
 */
@Entity
@Table(name="ncmnbs")
@NamedQuery(name="Ncmnb.findAll", query="SELECT n FROM Ncmnb n")
public class Ncmnb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NCMNBS_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NCMNBS_COD_GENERATOR")
	@Column(unique=true, nullable=false, length=10)
	private String cod;

	private double aliimp;

	private double alinac;

	@Column(length=255)
	private String des;

	@Column(length=2)
	private String ex;

	private Integer tab;

	public Ncmnb() {
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getAliimp() {
		return this.aliimp;
	}

	public void setAliimp(double aliimp) {
		this.aliimp = aliimp;
	}

	public double getAlinac() {
		return this.alinac;
	}

	public void setAlinac(double alinac) {
		this.alinac = alinac;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getEx() {
		return this.ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public Integer getTab() {
		return this.tab;
	}

	public void setTab(Integer tab) {
		this.tab = tab;
	}

}