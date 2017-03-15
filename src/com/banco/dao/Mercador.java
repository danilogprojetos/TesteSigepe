package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mercador database table.
 * 
 */
@Entity
@Table(name="mercador")
@NamedQuery(name="Mercador.findAll", query="SELECT m FROM Mercador m")
public class Mercador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MERCADOR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MERCADOR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private double aliicm;

	private Integer ativo;

	private Integer codanp;

	@Column(length=13)
	private String codbar;

	@Column(length=10)
	private String codclafis;

	private Integer coddetmer;

	@Column(length=13)
	private String codean;

	@Column(length=9)
	private String codespsubtri;

	private Integer codfis;

	private Integer codmar;

	private Integer codorimer;

	@Column(length=6)
	private String codpad;

	private Integer codplacon;

	private Integer codsecmer;

	@Column(length=5)
	private String codser;

	private Integer codsitopesimnac;

	private Integer codsubsecmer;

	@Column(length=4)
	private String codtam;

	private Integer codtriicm;

	@Temporal(TemporalType.DATE)
	private Date dataltvalcus;

	@Temporal(TemporalType.DATE)
	private Date datultcot;

	@Column(length=30)
	private String desfor;

	private double estmin;

	private double fatconuni;

	private Integer filtro;

	private Integer gra;

	private double indkan;

	@Column(length=8)
	private String locdep;

	private double marluc;

	@Column(length=60)
	private String mer;

	private Integer naoimpeti;

	private Integer naoimptab;

	@Column(length=15)
	private String ncm;

	private double pesbru;

	private double pesliq;

	private double porcom;

	private double pordesmax;

	private double poripi;

	private Integer proexp;

	private double quaref;

	@Column(length=2)
	private String uni;

	@Column(length=2)
	private String unicom;

	private Integer utides;

	private double valbascalstret;

	private double valcus;

	private double valcuscal;

	private double valicmstret;

	private double valven;

	private double vol;

	public Mercador() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getAliicm() {
		return this.aliicm;
	}

	public void setAliicm(double aliicm) {
		this.aliicm = aliicm;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
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

	public Integer getCoddetmer() {
		return this.coddetmer;
	}

	public void setCoddetmer(Integer coddetmer) {
		this.coddetmer = coddetmer;
	}

	public String getCodean() {
		return this.codean;
	}

	public void setCodean(String codean) {
		this.codean = codean;
	}

	public String getCodespsubtri() {
		return this.codespsubtri;
	}

	public void setCodespsubtri(String codespsubtri) {
		this.codespsubtri = codespsubtri;
	}

	public Integer getCodfis() {
		return this.codfis;
	}

	public void setCodfis(Integer codfis) {
		this.codfis = codfis;
	}

	public Integer getCodmar() {
		return this.codmar;
	}

	public void setCodmar(Integer codmar) {
		this.codmar = codmar;
	}

	public Integer getCodorimer() {
		return this.codorimer;
	}

	public void setCodorimer(Integer codorimer) {
		this.codorimer = codorimer;
	}

	public String getCodpad() {
		return this.codpad;
	}

	public void setCodpad(String codpad) {
		this.codpad = codpad;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Integer getCodsecmer() {
		return this.codsecmer;
	}

	public void setCodsecmer(Integer codsecmer) {
		this.codsecmer = codsecmer;
	}

	public String getCodser() {
		return this.codser;
	}

	public void setCodser(String codser) {
		this.codser = codser;
	}

	public Integer getCodsitopesimnac() {
		return this.codsitopesimnac;
	}

	public void setCodsitopesimnac(Integer codsitopesimnac) {
		this.codsitopesimnac = codsitopesimnac;
	}

	public Integer getCodsubsecmer() {
		return this.codsubsecmer;
	}

	public void setCodsubsecmer(Integer codsubsecmer) {
		this.codsubsecmer = codsubsecmer;
	}

	public String getCodtam() {
		return this.codtam;
	}

	public void setCodtam(String codtam) {
		this.codtam = codtam;
	}

	public Integer getCodtriicm() {
		return this.codtriicm;
	}

	public void setCodtriicm(Integer codtriicm) {
		this.codtriicm = codtriicm;
	}

	public Date getDataltvalcus() {
		return this.dataltvalcus;
	}

	public void setDataltvalcus(Date dataltvalcus) {
		this.dataltvalcus = dataltvalcus;
	}

	public Date getDatultcot() {
		return this.datultcot;
	}

	public void setDatultcot(Date datultcot) {
		this.datultcot = datultcot;
	}

	public String getDesfor() {
		return this.desfor;
	}

	public void setDesfor(String desfor) {
		this.desfor = desfor;
	}

	public double getEstmin() {
		return this.estmin;
	}

	public void setEstmin(double estmin) {
		this.estmin = estmin;
	}

	public double getFatconuni() {
		return this.fatconuni;
	}

	public void setFatconuni(double fatconuni) {
		this.fatconuni = fatconuni;
	}

	public Integer getFiltro() {
		return this.filtro;
	}

	public void setFiltro(Integer filtro) {
		this.filtro = filtro;
	}

	public Integer getGra() {
		return this.gra;
	}

	public void setGra(Integer gra) {
		this.gra = gra;
	}

	public double getIndkan() {
		return this.indkan;
	}

	public void setIndkan(double indkan) {
		this.indkan = indkan;
	}

	public String getLocdep() {
		return this.locdep;
	}

	public void setLocdep(String locdep) {
		this.locdep = locdep;
	}

	public double getMarluc() {
		return this.marluc;
	}

	public void setMarluc(double marluc) {
		this.marluc = marluc;
	}

	public String getMer() {
		return this.mer;
	}

	public void setMer(String mer) {
		this.mer = mer;
	}

	public Integer getNaoimpeti() {
		return this.naoimpeti;
	}

	public void setNaoimpeti(Integer naoimpeti) {
		this.naoimpeti = naoimpeti;
	}

	public Integer getNaoimptab() {
		return this.naoimptab;
	}

	public void setNaoimptab(Integer naoimptab) {
		this.naoimptab = naoimptab;
	}

	public String getNcm() {
		return this.ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
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

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getPordesmax() {
		return this.pordesmax;
	}

	public void setPordesmax(double pordesmax) {
		this.pordesmax = pordesmax;
	}

	public double getPoripi() {
		return this.poripi;
	}

	public void setPoripi(double poripi) {
		this.poripi = poripi;
	}

	public Integer getProexp() {
		return this.proexp;
	}

	public void setProexp(Integer proexp) {
		this.proexp = proexp;
	}

	public double getQuaref() {
		return this.quaref;
	}

	public void setQuaref(double quaref) {
		this.quaref = quaref;
	}

	public String getUni() {
		return this.uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getUnicom() {
		return this.unicom;
	}

	public void setUnicom(String unicom) {
		this.unicom = unicom;
	}

	public Integer getUtides() {
		return this.utides;
	}

	public void setUtides(Integer utides) {
		this.utides = utides;
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

	public double getValcuscal() {
		return this.valcuscal;
	}

	public void setValcuscal(double valcuscal) {
		this.valcuscal = valcuscal;
	}

	public double getValicmstret() {
		return this.valicmstret;
	}

	public void setValicmstret(double valicmstret) {
		this.valicmstret = valicmstret;
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