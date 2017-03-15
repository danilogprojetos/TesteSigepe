package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notfis database table.
 * 
 */
@Entity
@Table(name="notfis")
@NamedQuery(name="Notfi.findAll", query="SELECT n FROM Notfi n")
public class Notfi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NOTFIS_C_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NOTFIS_C_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer c;

	@Column(length=20)
	private String bai;

	private Integer can;

	@Column(length=9)
	private String cep;

	@Column(length=9)
	private String cfop;

	@Column(length=18)
	private String cgc;

	@Column(length=18)
	private String cgcemi;

	@Column(length=18)
	private String cgctra;

	@Column(length=35)
	private String cid;

	@Column(length=35)
	private String ciddestra;

	@Column(length=35)
	private String cidoritra;

	@Column(length=30)
	private String cidtra;

	@Column(length=1)
	private String clifor;

	private Integer cod;

	private Integer codcatcfo;

	private Integer codcli;

	private Integer codibgdestra;

	private Integer codibgoritra;

	private Integer codpai;

	private Integer codpedsai;

	private Integer codrecimp;

	private Integer codtipclifat;

	private Integer com;

	private double cotdol;

	@Temporal(TemporalType.DATE)
	private Date datemi;

	@Temporal(TemporalType.DATE)
	private Date datsai;

	@Column(length=50)
	private String endtra;

	private Integer ent;

	@Column(length=20)
	private String esp;

	private Integer fin;

	@Column(length=20)
	private String fon;

	@Column(length=5)
	private String horsai;

	private Integer imp;

	@Column(length=20)
	private String insest;

	@Column(length=20)
	private String insesttra;

	@Column(length=60)
	private String locemb;

	@Column(length=15)
	private String mar;

	@Column(length=2)
	private String mod;

	@Column(length=50)
	private String natope;

	@Column(length=15)
	private String num;

	private Integer numnfs;

	private byte[] obs;

	@Column(length=5)
	private String ordent;

	@Column(length=30)
	private String pai;

	private double pesbru;

	private double pesliq;

	@Column(length=9)
	private String pla;

	@Column(length=1)
	private String proter;

	private double qua;

	@Column(length=60)
	private String razsoc;

	@Column(length=10)
	private String rom;

	@Column(length=58)
	private String rua;

	@Column(length=3)
	private String ser;

	private Integer sitfre;

	private Integer sitnfe;

	@Column(length=50)
	private String tra;

	@Column(length=30)
	private String trared;

	@Column(length=2)
	private String uf;

	@Column(length=2)
	private String ufdestra;

	@Column(length=2)
	private String ufemb;

	@Column(length=2)
	private String uforitra;

	@Column(length=2)
	private String ufpla;

	@Column(length=2)
	private String uftra;

	private double valbru;

	private double valcom;

	private double valdes;

	private double valfre;

	private double valliq;

	private double valout;

	private double valseg;

	private double vol;

	public Notfi() {
	}

	public Integer getC() {
		return this.c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	public String getBai() {
		return this.bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	public Integer getCan() {
		return this.can;
	}

	public void setCan(Integer can) {
		this.can = can;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCfop() {
		return this.cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public String getCgcemi() {
		return this.cgcemi;
	}

	public void setCgcemi(String cgcemi) {
		this.cgcemi = cgcemi;
	}

	public String getCgctra() {
		return this.cgctra;
	}

	public void setCgctra(String cgctra) {
		this.cgctra = cgctra;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCiddestra() {
		return this.ciddestra;
	}

	public void setCiddestra(String ciddestra) {
		this.ciddestra = ciddestra;
	}

	public String getCidoritra() {
		return this.cidoritra;
	}

	public void setCidoritra(String cidoritra) {
		this.cidoritra = cidoritra;
	}

	public String getCidtra() {
		return this.cidtra;
	}

	public void setCidtra(String cidtra) {
		this.cidtra = cidtra;
	}

	public String getClifor() {
		return this.clifor;
	}

	public void setClifor(String clifor) {
		this.clifor = clifor;
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcatcfo() {
		return this.codcatcfo;
	}

	public void setCodcatcfo(Integer codcatcfo) {
		this.codcatcfo = codcatcfo;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodibgdestra() {
		return this.codibgdestra;
	}

	public void setCodibgdestra(Integer codibgdestra) {
		this.codibgdestra = codibgdestra;
	}

	public Integer getCodibgoritra() {
		return this.codibgoritra;
	}

	public void setCodibgoritra(Integer codibgoritra) {
		this.codibgoritra = codibgoritra;
	}

	public Integer getCodpai() {
		return this.codpai;
	}

	public void setCodpai(Integer codpai) {
		this.codpai = codpai;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodrecimp() {
		return this.codrecimp;
	}

	public void setCodrecimp(Integer codrecimp) {
		this.codrecimp = codrecimp;
	}

	public Integer getCodtipclifat() {
		return this.codtipclifat;
	}

	public void setCodtipclifat(Integer codtipclifat) {
		this.codtipclifat = codtipclifat;
	}

	public Integer getCom() {
		return this.com;
	}

	public void setCom(Integer com) {
		this.com = com;
	}

	public double getCotdol() {
		return this.cotdol;
	}

	public void setCotdol(double cotdol) {
		this.cotdol = cotdol;
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

	public String getEndtra() {
		return this.endtra;
	}

	public void setEndtra(String endtra) {
		this.endtra = endtra;
	}

	public Integer getEnt() {
		return this.ent;
	}

	public void setEnt(Integer ent) {
		this.ent = ent;
	}

	public String getEsp() {
		return this.esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public Integer getFin() {
		return this.fin;
	}

	public void setFin(Integer fin) {
		this.fin = fin;
	}

	public String getFon() {
		return this.fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
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

	public String getInsest() {
		return this.insest;
	}

	public void setInsest(String insest) {
		this.insest = insest;
	}

	public String getInsesttra() {
		return this.insesttra;
	}

	public void setInsesttra(String insesttra) {
		this.insesttra = insesttra;
	}

	public String getLocemb() {
		return this.locemb;
	}

	public void setLocemb(String locemb) {
		this.locemb = locemb;
	}

	public String getMar() {
		return this.mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}

	public String getMod() {
		return this.mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getNatope() {
		return this.natope;
	}

	public void setNatope(String natope) {
		this.natope = natope;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Integer getNumnfs() {
		return this.numnfs;
	}

	public void setNumnfs(Integer numnfs) {
		this.numnfs = numnfs;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public String getOrdent() {
		return this.ordent;
	}

	public void setOrdent(String ordent) {
		this.ordent = ordent;
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

	public double getPesliq() {
		return this.pesliq;
	}

	public void setPesliq(double pesliq) {
		this.pesliq = pesliq;
	}

	public String getPla() {
		return this.pla;
	}

	public void setPla(String pla) {
		this.pla = pla;
	}

	public String getProter() {
		return this.proter;
	}

	public void setProter(String proter) {
		this.proter = proter;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public String getRazsoc() {
		return this.razsoc;
	}

	public void setRazsoc(String razsoc) {
		this.razsoc = razsoc;
	}

	public String getRom() {
		return this.rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getSer() {
		return this.ser;
	}

	public void setSer(String ser) {
		this.ser = ser;
	}

	public Integer getSitfre() {
		return this.sitfre;
	}

	public void setSitfre(Integer sitfre) {
		this.sitfre = sitfre;
	}

	public Integer getSitnfe() {
		return this.sitnfe;
	}

	public void setSitnfe(Integer sitnfe) {
		this.sitnfe = sitnfe;
	}

	public String getTra() {
		return this.tra;
	}

	public void setTra(String tra) {
		this.tra = tra;
	}

	public String getTrared() {
		return this.trared;
	}

	public void setTrared(String trared) {
		this.trared = trared;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUfdestra() {
		return this.ufdestra;
	}

	public void setUfdestra(String ufdestra) {
		this.ufdestra = ufdestra;
	}

	public String getUfemb() {
		return this.ufemb;
	}

	public void setUfemb(String ufemb) {
		this.ufemb = ufemb;
	}

	public String getUforitra() {
		return this.uforitra;
	}

	public void setUforitra(String uforitra) {
		this.uforitra = uforitra;
	}

	public String getUfpla() {
		return this.ufpla;
	}

	public void setUfpla(String ufpla) {
		this.ufpla = ufpla;
	}

	public String getUftra() {
		return this.uftra;
	}

	public void setUftra(String uftra) {
		this.uftra = uftra;
	}

	public double getValbru() {
		return this.valbru;
	}

	public void setValbru(double valbru) {
		this.valbru = valbru;
	}

	public double getValcom() {
		return this.valcom;
	}

	public void setValcom(double valcom) {
		this.valcom = valcom;
	}

	public double getValdes() {
		return this.valdes;
	}

	public void setValdes(double valdes) {
		this.valdes = valdes;
	}

	public double getValfre() {
		return this.valfre;
	}

	public void setValfre(double valfre) {
		this.valfre = valfre;
	}

	public double getValliq() {
		return this.valliq;
	}

	public void setValliq(double valliq) {
		this.valliq = valliq;
	}

	public double getValout() {
		return this.valout;
	}

	public void setValout(double valout) {
		this.valout = valout;
	}

	public double getValseg() {
		return this.valseg;
	}

	public void setValseg(double valseg) {
		this.valseg = valseg;
	}

	public double getVol() {
		return this.vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

}