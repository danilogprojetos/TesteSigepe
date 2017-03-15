package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the transfer database table.
 * 
 */
@Entity
@Table(name="transfer")
@NamedQuery(name="Transfer.findAll", query="SELECT t FROM Transfer t")
public class Transfer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRANSFER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSFER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcat;

	private Integer codceldes;

	private Integer codcelori;

	private Integer codetades;

	private Integer codpag;

	private Integer codpedpro;

	private Integer codpedsai;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datpag;

	private byte[] obs;

	private Integer pag;

	private Integer prater;

	private Integer pripro;

	private Integer sitdes;

	private Integer sitori;

	private Integer sta;

	public Transfer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodceldes() {
		return this.codceldes;
	}

	public void setCodceldes(Integer codceldes) {
		this.codceldes = codceldes;
	}

	public Integer getCodcelori() {
		return this.codcelori;
	}

	public void setCodcelori(Integer codcelori) {
		this.codcelori = codcelori;
	}

	public Integer getCodetades() {
		return this.codetades;
	}

	public void setCodetades(Integer codetades) {
		this.codetades = codetades;
	}

	public Integer getCodpag() {
		return this.codpag;
	}

	public void setCodpag(Integer codpag) {
		this.codpag = codpag;
	}

	public Integer getCodpedpro() {
		return this.codpedpro;
	}

	public void setCodpedpro(Integer codpedpro) {
		this.codpedpro = codpedpro;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatpag() {
		return this.datpag;
	}

	public void setDatpag(Date datpag) {
		this.datpag = datpag;
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

	public Integer getPrater() {
		return this.prater;
	}

	public void setPrater(Integer prater) {
		this.prater = prater;
	}

	public Integer getPripro() {
		return this.pripro;
	}

	public void setPripro(Integer pripro) {
		this.pripro = pripro;
	}

	public Integer getSitdes() {
		return this.sitdes;
	}

	public void setSitdes(Integer sitdes) {
		this.sitdes = sitdes;
	}

	public Integer getSitori() {
		return this.sitori;
	}

	public void setSitori(Integer sitori) {
		this.sitori = sitori;
	}

	public Integer getSta() {
		return this.sta;
	}

	public void setSta(Integer sta) {
		this.sta = sta;
	}

}