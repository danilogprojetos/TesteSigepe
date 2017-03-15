package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vencon database table.
 * 
 */
@Entity
@Table(name="vencon")
@NamedQuery(name="Vencon.findAll", query="SELECT v FROM Vencon v")
public class Vencon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VENCON_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VENCON_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer acecon;

	@Column(length=1)
	private String clifor;

	private Integer codcat;

	private Integer codcli;

	private Integer codped;

	private Integer codpedsai;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=1)
	private String entsai;

	private byte[] obs;

	private Integer pen;

	public Vencon() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAcecon() {
		return this.acecon;
	}

	public void setAcecon(Integer acecon) {
		this.acecon = acecon;
	}

	public String getClifor() {
		return this.clifor;
	}

	public void setClifor(String clifor) {
		this.clifor = clifor;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodped() {
		return this.codped;
	}

	public void setCodped(Integer codped) {
		this.codped = codped;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getEntsai() {
		return this.entsai;
	}

	public void setEntsai(String entsai) {
		this.entsai = entsai;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Integer getPen() {
		return this.pen;
	}

	public void setPen(Integer pen) {
		this.pen = pen;
	}

}