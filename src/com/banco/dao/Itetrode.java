package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itetrode database table.
 * 
 */
@Entity
@Table(name="itetrode")
@NamedQuery(name="Itetrode.findAll", query="SELECT i FROM Itetrode i")
public class Itetrode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITETRODE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITETRODE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coditepedsai;

	private Integer codmer;

	private Integer codtrodev;

	private double qua;

	private double val;

	private double valcus;

	public Itetrode() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditepedsai() {
		return this.coditepedsai;
	}

	public void setCoditepedsai(Integer coditepedsai) {
		this.coditepedsai = coditepedsai;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodtrodev() {
		return this.codtrodev;
	}

	public void setCodtrodev(Integer codtrodev) {
		this.codtrodev = codtrodev;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

}