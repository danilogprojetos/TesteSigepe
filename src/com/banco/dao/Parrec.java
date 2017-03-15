package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the parrec database table.
 * 
 */
@Entity
@Table(name="parrec")
@NamedQuery(name="Parrec.findAll", query="SELECT p FROM Parrec p")
public class Parrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcarcobcc;

	private Integer codcob;

	private Integer codcobhis;

	private Integer codcom;

	private Integer codforpag;

	private Integer codlancc;

	private Integer codparori;

	private Integer codparrecadi;

	private Integer codrec;

	private Integer codreprec;

	private Integer codsubtiprec;

	private Integer codtiprec;

	@Temporal(TemporalType.DATE)
	private Date datemiblo;

	@Temporal(TemporalType.DATE)
	private Date datpag;

	@Temporal(TemporalType.DATE)
	private Date datpro;

	@Temporal(TemporalType.DATE)
	private Date datven;

	private Integer gerrem;

	@Column(length=23)
	private String numblo;

	@Column(length=5)
	private String numpar;

	private byte[] obs;

	private Integer pag;

	private Integer tippag;

	private double valblopro;

	private double valdifparpar;

	private double vlrdif;

	private double vlrpag;

	public Parrec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcarcobcc() {
		return this.codcarcobcc;
	}

	public void setCodcarcobcc(Integer codcarcobcc) {
		this.codcarcobcc = codcarcobcc;
	}

	public Integer getCodcob() {
		return this.codcob;
	}

	public void setCodcob(Integer codcob) {
		this.codcob = codcob;
	}

	public Integer getCodcobhis() {
		return this.codcobhis;
	}

	public void setCodcobhis(Integer codcobhis) {
		this.codcobhis = codcobhis;
	}

	public Integer getCodcom() {
		return this.codcom;
	}

	public void setCodcom(Integer codcom) {
		this.codcom = codcom;
	}

	public Integer getCodforpag() {
		return this.codforpag;
	}

	public void setCodforpag(Integer codforpag) {
		this.codforpag = codforpag;
	}

	public Integer getCodlancc() {
		return this.codlancc;
	}

	public void setCodlancc(Integer codlancc) {
		this.codlancc = codlancc;
	}

	public Integer getCodparori() {
		return this.codparori;
	}

	public void setCodparori(Integer codparori) {
		this.codparori = codparori;
	}

	public Integer getCodparrecadi() {
		return this.codparrecadi;
	}

	public void setCodparrecadi(Integer codparrecadi) {
		this.codparrecadi = codparrecadi;
	}

	public Integer getCodrec() {
		return this.codrec;
	}

	public void setCodrec(Integer codrec) {
		this.codrec = codrec;
	}

	public Integer getCodreprec() {
		return this.codreprec;
	}

	public void setCodreprec(Integer codreprec) {
		this.codreprec = codreprec;
	}

	public Integer getCodsubtiprec() {
		return this.codsubtiprec;
	}

	public void setCodsubtiprec(Integer codsubtiprec) {
		this.codsubtiprec = codsubtiprec;
	}

	public Integer getCodtiprec() {
		return this.codtiprec;
	}

	public void setCodtiprec(Integer codtiprec) {
		this.codtiprec = codtiprec;
	}

	public Date getDatemiblo() {
		return this.datemiblo;
	}

	public void setDatemiblo(Date datemiblo) {
		this.datemiblo = datemiblo;
	}

	public Date getDatpag() {
		return this.datpag;
	}

	public void setDatpag(Date datpag) {
		this.datpag = datpag;
	}

	public Date getDatpro() {
		return this.datpro;
	}

	public void setDatpro(Date datpro) {
		this.datpro = datpro;
	}

	public Date getDatven() {
		return this.datven;
	}

	public void setDatven(Date datven) {
		this.datven = datven;
	}

	public Integer getGerrem() {
		return this.gerrem;
	}

	public void setGerrem(Integer gerrem) {
		this.gerrem = gerrem;
	}

	public String getNumblo() {
		return this.numblo;
	}

	public void setNumblo(String numblo) {
		this.numblo = numblo;
	}

	public String getNumpar() {
		return this.numpar;
	}

	public void setNumpar(String numpar) {
		this.numpar = numpar;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getPag() {
		return this.pag;
	}

	public void setPag(Integer pag) {
		this.pag = pag;
	}

	public Integer getTippag() {
		return this.tippag;
	}

	public void setTippag(Integer tippag) {
		this.tippag = tippag;
	}

	public double getValblopro() {
		return this.valblopro;
	}

	public void setValblopro(double valblopro) {
		this.valblopro = valblopro;
	}

	public double getValdifparpar() {
		return this.valdifparpar;
	}

	public void setValdifparpar(double valdifparpar) {
		this.valdifparpar = valdifparpar;
	}

	public double getVlrdif() {
		return this.vlrdif;
	}

	public void setVlrdif(double vlrdif) {
		this.vlrdif = vlrdif;
	}

	public double getVlrpag() {
		return this.vlrpag;
	}

	public void setVlrpag(double vlrpag) {
		this.vlrpag = vlrpag;
	}

}