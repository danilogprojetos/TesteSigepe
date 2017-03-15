package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itenotfi database table.
 * 
 */
@Entity
@Table(name="itenotfi")
@NamedQuery(name="Itenotfi.findAll", query="SELECT i FROM Itenotfi i")
public class Itenotfi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITENOTFI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITENOTFI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer cf;

	@Column(length=4)
	private String cfo;

	private Integer cnotfis;

	private Integer codanp;

	@Column(length=13)
	private String codbar;

	@Column(length=10)
	private String codclafis;

	private Integer codcli;

	@Column(length=9)
	private String codespsubtri;

	private Integer codmer;

	private Integer codnotfis;

	private Integer codorimer;

	@Column(length=5)
	private String codser;

	private Integer codtriicm;

	private Integer cupcan;

	@Column(length=120)
	private String mer;

	@Column(length=15)
	private String ncm;

	private Integer numitepedcom;

	@Column(length=15)
	private String numpedcom;

	private double pesbru;

	private double pesliq;

	private double qua;

	@Column(length=2)
	private String uni;

	private double valbascalstret;

	private double valcus;

	private double valdes;

	private double valicmstret;

	private double valliq;

	private double valunimoeest;

	private double valven;

	private double vol;

	public Itenotfi() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCf() {
		return this.cf;
	}

	public void setCf(Integer cf) {
		this.cf = cf;
	}

	public String getCfo() {
		return this.cfo;
	}

	public void setCfo(String cfo) {
		this.cfo = cfo;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public Integer getCodanp() {
		return this.codanp;
	}

	public void setCodanp(Integer codanp) {
		this.codanp = codanp;
	}

	public String getCodbar() {
		return this.codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	public String getCodclafis() {
		return this.codclafis;
	}

	public void setCodclafis(String codclafis) {
		this.codclafis = codclafis;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public String getCodespsubtri() {
		return this.codespsubtri;
	}

	public void setCodespsubtri(String codespsubtri) {
		this.codespsubtri = codespsubtri;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodnotfis() {
		return this.codnotfis;
	}

	public void setCodnotfis(Integer codnotfis) {
		this.codnotfis = codnotfis;
	}

	public Integer getCodorimer() {
		return this.codorimer;
	}

	public void setCodorimer(Integer codorimer) {
		this.codorimer = codorimer;
	}

	public String getCodser() {
		return this.codser;
	}

	public void setCodser(String codser) {
		this.codser = codser;
	}

	public Integer getCodtriicm() {
		return this.codtriicm;
	}

	public void setCodtriicm(Integer codtriicm) {
		this.codtriicm = codtriicm;
	}

	public Integer getCupcan() {
		return this.cupcan;
	}

	public void setCupcan(Integer cupcan) {
		this.cupcan = cupcan;
	}

	public String getMer() {
		return this.mer;
	}

	public void setMer(String mer) {
		this.mer = mer;
	}

	public String getNcm() {
		return this.ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public Integer getNumitepedcom() {
		return this.numitepedcom;
	}

	public void setNumitepedcom(Integer numitepedcom) {
		this.numitepedcom = numitepedcom;
	}

	public String getNumpedcom() {
		return this.numpedcom;
	}

	public void setNumpedcom(String numpedcom) {
		this.numpedcom = numpedcom;
	}

	public double getPesbru() {
		return this.pesbru;
	}

	public void setPesbru(double pesbru) {
		this.pesbru = pesbru;
	}

	public double getPesliq() {
		return this.pesliq;
	}

	public void setPesliq(double pesliq) {
		this.pesliq = pesliq;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public String getUni() {
		return this.uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public double getValbascalstret() {
		return this.valbascalstret;
	}

	public void setValbascalstret(double valbascalstret) {
		this.valbascalstret = valbascalstret;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

	public double getValicmstret() {
		return this.valicmstret;
	}

	public void setValicmstret(double valicmstret) {
		this.valicmstret = valicmstret;
	}

	public double getValliq() {
		return this.valliq;
	}

	public void setValliq(double valliq) {
		this.valliq = valliq;
	}

	public double getValunimoeest() {
		return this.valunimoeest;
	}

	public void setValunimoeest(double valunimoeest) {
		this.valunimoeest = valunimoeest;
	}

	public double getValven() {
		return this.valven;
	}

	public void setValven(double valven) {
		this.valven = valven;
	}

	public double getVol() {
		return this.vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

}