package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the decimp database table.
 * 
 */
@Entity
@Table(name="decimp")
@NamedQuery(name="Decimp.findAll", query="SELECT d FROM Decimp d")
public class Decimp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DECIMP_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DECIMP_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=60)
	private String codexp;

	private Integer coditenotfis;

	@Column(length=5)
	private String codser;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datdes;

	@Column(length=30)
	private String locdes;

	@Column(length=20)
	private String num;

	@Column(length=2)
	private String ufdes;

	private double valbascal;

	private double valdesadu;

	private double valimp;

	private double valiof;

	public Decimp() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCodexp() {
		return this.codexp;
	}

	public void setCodexp(String codexp) {
		this.codexp = codexp;
	}

	public Integer getCoditenotfis() {
		return this.coditenotfis;
	}

	public void setCoditenotfis(Integer coditenotfis) {
		this.coditenotfis = coditenotfis;
	}

	public String getCodser() {
		return this.codser;
	}

	public void setCodser(String codser) {
		this.codser = codser;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatdes() {
		return this.datdes;
	}

	public void setDatdes(Date datdes) {
		this.datdes = datdes;
	}

	public String getLocdes() {
		return this.locdes;
	}

	public void setLocdes(String locdes) {
		this.locdes = locdes;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getUfdes() {
		return this.ufdes;
	}

	public void setUfdes(String ufdes) {
		this.ufdes = ufdes;
	}

	public double getValbascal() {
		return this.valbascal;
	}

	public void setValbascal(double valbascal) {
		this.valbascal = valbascal;
	}

	public double getValdesadu() {
		return this.valdesadu;
	}

	public void setValdesadu(double valdesadu) {
		this.valdesadu = valdesadu;
	}

	public double getValimp() {
		return this.valimp;
	}

	public void setValimp(double valimp) {
		this.valimp = valimp;
	}

	public double getValiof() {
		return this.valiof;
	}

	public void setValiof(double valiof) {
		this.valiof = valiof;
	}

}