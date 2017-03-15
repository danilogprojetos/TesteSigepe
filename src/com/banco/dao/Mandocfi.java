package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mandocfis database table.
 * 
 */
@Entity
@Table(name="mandocfis")
@NamedQuery(name="Mandocfi.findAll", query="SELECT m FROM Mandocfi m")
public class Mandocfi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MANDOCFIS_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MANDOCFIS_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double capmetcub;

	private double capqui;

	@Column(length=14)
	private String cgcpro;

	@Column(length=16)
	private String codagepor;

	@Column(length=12)
	private String codideopetra;

	private Integer codmodmdf;

	private Integer codpai;

	private Integer codtipcar;

	private Integer codtippro;

	private Integer codtiprod;

	@Column(length=2)
	private String codunifeddes;

	@Column(length=2)
	private String codunifedpro;

	@Column(length=2)
	private String codunifedvei;

	private Integer codvei;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Temporal(TemporalType.DATE)
	private Date datsai;

	@Column(length=5)
	private String horemi;

	@Column(length=5)
	private String horsai;

	private Integer imp;

	@Column(length=14)
	private String insestpro;

	@Column(length=2)
	private String mod;

	@Column(length=60)
	private String nompro;

	private Integer num;

	private byte[] obs;

	@Column(length=30)
	private String pai;

	private double pesbru;

	@Column(length=7)
	private String plavei;

	@Column(length=8)
	private String regnactrarodcar;

	@Column(length=8)
	private String regnactrarodcarpro;

	@Column(length=11)
	private String ren;

	@Column(length=3)
	private String ser;

	private Integer sitmdf;

	private double tar;

	@Column(length=3)
	private String unicar;

	private double valtot;

	public Mandocfi() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getCapmetcub() {
		return this.capmetcub;
	}

	public void setCapmetcub(double capmetcub) {
		this.capmetcub = capmetcub;
	}

	public double getCapqui() {
		return this.capqui;
	}

	public void setCapqui(double capqui) {
		this.capqui = capqui;
	}

	public String getCgcpro() {
		return this.cgcpro;
	}

	public void setCgcpro(String cgcpro) {
		this.cgcpro = cgcpro;
	}

	public String getCodagepor() {
		return this.codagepor;
	}

	public void setCodagepor(String codagepor) {
		this.codagepor = codagepor;
	}

	public String getCodideopetra() {
		return this.codideopetra;
	}

	public void setCodideopetra(String codideopetra) {
		this.codideopetra = codideopetra;
	}

	public Integer getCodmodmdf() {
		return this.codmodmdf;
	}

	public void setCodmodmdf(Integer codmodmdf) {
		this.codmodmdf = codmodmdf;
	}

	public Integer getCodpai() {
		return this.codpai;
	}

	public void setCodpai(Integer codpai) {
		this.codpai = codpai;
	}

	public Integer getCodtipcar() {
		return this.codtipcar;
	}

	public void setCodtipcar(Integer codtipcar) {
		this.codtipcar = codtipcar;
	}

	public Integer getCodtippro() {
		return this.codtippro;
	}

	public void setCodtippro(Integer codtippro) {
		this.codtippro = codtippro;
	}

	public Integer getCodtiprod() {
		return this.codtiprod;
	}

	public void setCodtiprod(Integer codtiprod) {
		this.codtiprod = codtiprod;
	}

	public String getCodunifeddes() {
		return this.codunifeddes;
	}

	public void setCodunifeddes(String codunifeddes) {
		this.codunifeddes = codunifeddes;
	}

	public String getCodunifedpro() {
		return this.codunifedpro;
	}

	public void setCodunifedpro(String codunifedpro) {
		this.codunifedpro = codunifedpro;
	}

	public String getCodunifedvei() {
		return this.codunifedvei;
	}

	public void setCodunifedvei(String codunifedvei) {
		this.codunifedvei = codunifedvei;
	}

	public Integer getCodvei() {
		return this.codvei;
	}

	public void setCodvei(Integer codvei) {
		this.codvei = codvei;
	}

	public Date getDatemi() {
		return this.datemi;
	}

	public void setDatemi(Date datemi) {
		this.datemi = datemi;
	}

	public Date getDatsai() {
		return this.datsai;
	}

	public void setDatsai(Date datsai) {
		this.datsai = datsai;
	}

	public String getHoremi() {
		return this.horemi;
	}

	public void setHoremi(String horemi) {
		this.horemi = horemi;
	}

	public String getHorsai() {
		return this.horsai;
	}

	public void setHorsai(String horsai) {
		this.horsai = horsai;
	}

	public Integer getImp() {
		return this.imp;
	}

	public void setImp(Integer imp) {
		this.imp = imp;
	}

	public String getInsestpro() {
		return this.insestpro;
	}

	public void setInsestpro(String insestpro) {
		this.insestpro = insestpro;
	}

	public String getMod() {
		return this.mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getNompro() {
		return this.nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public String getPai() {
		return this.pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public double getPesbru() {
		return this.pesbru;
	}

	public void setPesbru(double pesbru) {
		this.pesbru = pesbru;
	}

	public String getPlavei() {
		return this.plavei;
	}

	public void setPlavei(String plavei) {
		this.plavei = plavei;
	}

	public String getRegnactrarodcar() {
		return this.regnactrarodcar;
	}

	public void setRegnactrarodcar(String regnactrarodcar) {
		this.regnactrarodcar = regnactrarodcar;
	}

	public String getRegnactrarodcarpro() {
		return this.regnactrarodcarpro;
	}

	public void setRegnactrarodcarpro(String regnactrarodcarpro) {
		this.regnactrarodcarpro = regnactrarodcarpro;
	}

	public String getRen() {
		return this.ren;
	}

	public void setRen(String ren) {
		this.ren = ren;
	}

	public String getSer() {
		return this.ser;
	}

	public void setSer(String ser) {
		this.ser = ser;
	}

	public Integer getSitmdf() {
		return this.sitmdf;
	}

	public void setSitmdf(Integer sitmdf) {
		this.sitmdf = sitmdf;
	}

	public double getTar() {
		return this.tar;
	}

	public void setTar(double tar) {
		this.tar = tar;
	}

	public String getUnicar() {
		return this.unicar;
	}

	public void setUnicar(String unicar) {
		this.unicar = unicar;
	}

	public double getValtot() {
		return this.valtot;
	}

	public void setValtot(double valtot) {
		this.valtot = valtot;
	}

}