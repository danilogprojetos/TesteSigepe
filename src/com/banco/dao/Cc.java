package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cc database table.
 * 
 */
@Entity
@Table(name="cc")
@NamedQuery(name="Cc.findAll", query="SELECT c FROM Cc c")
public class Cc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=10)
	private String age;

	@Column(length=1)
	private String agedig;

	private Integer ativo;

	@Column(length=3)
	private String car;

	@Column(length=20)
	private String cc;

	@Column(length=1)
	private String ccdig;

	@Column(length=20)
	private String ced;

	@Column(length=1)
	private String ceddig;

	@Column(length=20)
	private String cgc;

	private Integer codban;

	private Integer codcat;

	private Integer codcccor;

	private Integer consalblo;

	private Integer entflucai;

	@Column(length=15)
	private String fon;

	@Column(length=20)
	private String fonage;

	@Column(length=20)
	private String gercon;

	private byte[] ins;

	private double limcre;

	private double limdes;

	@Column(length=85)
	private String locpag;

	@Column(length=15)
	private String obs;

	@Column(length=3)
	private String padcna;

	@Column(length=50)
	private String pasarqrem;

	private double porjurlimcre;

	private double porjurlimdes;

	@Column(length=2)
	private String pos;

	private Integer proch;

	@Column(length=23)
	private String pronumbol;

	@Column(length=50)
	private String raz;

	@Column(length=30)
	private String rua;

	private double sal;

	private double salblo;

	private double salexp;

	@Column(length=8)
	private String seqarqrem;

	private Integer uticai;

	public Cc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgedig() {
		return this.agedig;
	}

	public void setAgedig(String agedig) {
		this.agedig = agedig;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getCar() {
		return this.car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCcdig() {
		return this.ccdig;
	}

	public void setCcdig(String ccdig) {
		this.ccdig = ccdig;
	}

	public String getCed() {
		return this.ced;
	}

	public void setCed(String ced) {
		this.ced = ced;
	}

	public String getCeddig() {
		return this.ceddig;
	}

	public void setCeddig(String ceddig) {
		this.ceddig = ceddig;
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public Integer getCodban() {
		return this.codban;
	}

	public void setCodban(Integer codban) {
		this.codban = codban;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodcccor() {
		return this.codcccor;
	}

	public void setCodcccor(Integer codcccor) {
		this.codcccor = codcccor;
	}

	public Integer getConsalblo() {
		return this.consalblo;
	}

	public void setConsalblo(Integer consalblo) {
		this.consalblo = consalblo;
	}

	public Integer getEntflucai() {
		return this.entflucai;
	}

	public void setEntflucai(Integer entflucai) {
		this.entflucai = entflucai;
	}

	public String getFon() {
		return this.fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
	}

	public String getFonage() {
		return this.fonage;
	}

	public void setFonage(String fonage) {
		this.fonage = fonage;
	}

	public String getGercon() {
		return this.gercon;
	}

	public void setGercon(String gercon) {
		this.gercon = gercon;
	}

	public byte[] getIns() {
		return this.ins;
	}

	public void setIns(byte[] ins) {
		this.ins = ins;
	}

	public double getLimcre() {
		return this.limcre;
	}

	public void setLimcre(double limcre) {
		this.limcre = limcre;
	}

	public double getLimdes() {
		return this.limdes;
	}

	public void setLimdes(double limdes) {
		this.limdes = limdes;
	}

	public String getLocpag() {
		return this.locpag;
	}

	public void setLocpag(String locpag) {
		this.locpag = locpag;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getPadcna() {
		return this.padcna;
	}

	public void setPadcna(String padcna) {
		this.padcna = padcna;
	}

	public String getPasarqrem() {
		return this.pasarqrem;
	}

	public void setPasarqrem(String pasarqrem) {
		this.pasarqrem = pasarqrem;
	}

	public double getPorjurlimcre() {
		return this.porjurlimcre;
	}

	public void setPorjurlimcre(double porjurlimcre) {
		this.porjurlimcre = porjurlimcre;
	}

	public double getPorjurlimdes() {
		return this.porjurlimdes;
	}

	public void setPorjurlimdes(double porjurlimdes) {
		this.porjurlimdes = porjurlimdes;
	}

	public String getPos() {
		return this.pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public Integer getProch() {
		return this.proch;
	}

	public void setProch(Integer proch) {
		this.proch = proch;
	}

	public String getPronumbol() {
		return this.pronumbol;
	}

	public void setPronumbol(String pronumbol) {
		this.pronumbol = pronumbol;
	}

	public String getRaz() {
		return this.raz;
	}

	public void setRaz(String raz) {
		this.raz = raz;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSalblo() {
		return this.salblo;
	}

	public void setSalblo(double salblo) {
		this.salblo = salblo;
	}

	public double getSalexp() {
		return this.salexp;
	}

	public void setSalexp(double salexp) {
		this.salexp = salexp;
	}

	public String getSeqarqrem() {
		return this.seqarqrem;
	}

	public void setSeqarqrem(String seqarqrem) {
		this.seqarqrem = seqarqrem;
	}

	public Integer getUticai() {
		return this.uticai;
	}

	public void setUticai(Integer uticai) {
		this.uticai = uticai;
	}

}