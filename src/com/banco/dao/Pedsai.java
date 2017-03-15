package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the pedsai database table.
 * 
 */
@Entity
@Table(name="pedsai")
@NamedQuery(name="Pedsai.findAll", query="SELECT p FROM Pedsai p")
public class Pedsai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PEDSAI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PEDSAI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer bai;

	private Integer codcat;

	@Column(length=9)
	private String codcfo;

	private Integer codcli;

	private Integer codcom;

	private Integer codcon;

	private Integer coddig;

	private Integer codforpag;

	private Integer codgui;

	private Integer codped;

	private Integer codpedsairec;

	private Integer codtrodev;

	private Integer codven;

	private Integer comguipag;

	private Integer conrec;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datpagcomgui;

	@Temporal(TemporalType.DATE)
	private Date datprefat;

	@Temporal(TemporalType.DATE)
	private Date datrec;

	private Time hor;

	private double indcom;

	private Integer lansai;

	private Integer mesabe;

	private Integer notfisimp;

	@Column(length=10)
	private String numficgui;

	@Column(length=5)
	private String nummes;

	@Column(length=100)
	private String obs;

	@Column(length=5)
	private String ordent;

	private double porcom;

	private double porcomgui;

	private double pordesata;

	private double pordesvis;

	private double porjurpra;

	@Column(length=10)
	private String rom;

	private double valbru;

	private double valcom;

	private double valdes;

	private double valdesadi;

	private double valdestro;

	private double valimp;

	private double valjur;

	private double valliq;

	private Integer vencon;

	public Pedsai() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getBai() {
		return this.bai;
	}

	public void setBai(Integer bai) {
		this.bai = bai;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodcom() {
		return this.codcom;
	}

	public void setCodcom(Integer codcom) {
		this.codcom = codcom;
	}

	public Integer getCodcon() {
		return this.codcon;
	}

	public void setCodcon(Integer codcon) {
		this.codcon = codcon;
	}

	public Integer getCoddig() {
		return this.coddig;
	}

	public void setCoddig(Integer coddig) {
		this.coddig = coddig;
	}

	public Integer getCodforpag() {
		return this.codforpag;
	}

	public void setCodforpag(Integer codforpag) {
		this.codforpag = codforpag;
	}

	public Integer getCodgui() {
		return this.codgui;
	}

	public void setCodgui(Integer codgui) {
		this.codgui = codgui;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public Integer getCodpedsairec() {
		return this.codpedsairec;
	}

	public void setCodpedsairec(Integer codpedsairec) {
		this.codpedsairec = codpedsairec;
	}

	public Integer getCodtrodev() {
		return this.codtrodev;
	}

	public void setCodtrodev(Integer codtrodev) {
		this.codtrodev = codtrodev;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Integer getComguipag() {
		return this.comguipag;
	}

	public void setComguipag(Integer comguipag) {
		this.comguipag = comguipag;
	}

	public Integer getConrec() {
		return this.conrec;
	}

	public void setConrec(Integer conrec) {
		this.conrec = conrec;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatpagcomgui() {
		return this.datpagcomgui;
	}

	public void setDatpagcomgui(Date datpagcomgui) {
		this.datpagcomgui = datpagcomgui;
	}

	public Date getDatprefat() {
		return this.datprefat;
	}

	public void setDatprefat(Date datprefat) {
		this.datprefat = datprefat;
	}

	public Date getDatrec() {
		return this.datrec;
	}

	public void setDatrec(Date datrec) {
		this.datrec = datrec;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public double getIndcom() {
		return this.indcom;
	}

	public void setIndcom(double indcom) {
		this.indcom = indcom;
	}

	public Integer getLansai() {
		return this.lansai;
	}

	public void setLansai(Integer lansai) {
		this.lansai = lansai;
	}

	public Integer getMesabe() {
		return this.mesabe;
	}

	public void setMesabe(Integer mesabe) {
		this.mesabe = mesabe;
	}

	public Integer getNotfisimp() {
		return this.notfisimp;
	}

	public void setNotfisimp(Integer notfisimp) {
		this.notfisimp = notfisimp;
	}

	public String getNumficgui() {
		return this.numficgui;
	}

	public void setNumficgui(String numficgui) {
		this.numficgui = numficgui;
	}

	public String getNummes() {
		return this.nummes;
	}

	public void setNummes(String nummes) {
		this.nummes = nummes;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getOrdent() {
		return this.ordent;
	}

	public void setOrdent(String ordent) {
		this.ordent = ordent;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getPorcomgui() {
		return this.porcomgui;
	}

	public void setPorcomgui(double porcomgui) {
		this.porcomgui = porcomgui;
	}

	public double getPordesata() {
		return this.pordesata;
	}

	public void setPordesata(double pordesata) {
		this.pordesata = pordesata;
	}

	public double getPordesvis() {
		return this.pordesvis;
	}

	public void setPordesvis(double pordesvis) {
		this.pordesvis = pordesvis;
	}

	public double getPorjurpra() {
		return this.porjurpra;
	}

	public void setPorjurpra(double porjurpra) {
		this.porjurpra = porjurpra;
	}

	public String getRom() {
		return this.rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
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

	public double getValdesadi() {
		return this.valdesadi;
	}

	public void setValdesadi(double valdesadi) {
		this.valdesadi = valdesadi;
	}

	public double getValdestro() {
		return this.valdestro;
	}

	public void setValdestro(double valdestro) {
		this.valdestro = valdestro;
	}

	public double getValimp() {
		return this.valimp;
	}

	public void setValimp(double valimp) {
		this.valimp = valimp;
	}

	public double getValjur() {
		return this.valjur;
	}

	public void setValjur(double valjur) {
		this.valjur = valjur;
	}

	public double getValliq() {
		return this.valliq;
	}

	public void setValliq(double valliq) {
		this.valliq = valliq;
	}

	public Integer getVencon() {
		return this.vencon;
	}

	public void setVencon(Integer vencon) {
		this.vencon = vencon;
	}

}