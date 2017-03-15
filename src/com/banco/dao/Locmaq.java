package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the locmaq database table.
 * 
 */
@Entity
@Table(name="locmaq")
@NamedQuery(name="Locmaq.findAll", query="SELECT l FROM Locmaq l")
public class Locmaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOCMAQ_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOCMAQ_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcencus;

	private Integer codcencusori;

	private Integer codmaq;

	@Temporal(TemporalType.DATE)
	private Date datent;

	@Temporal(TemporalType.DATE)
	private Date datpresai;

	@Temporal(TemporalType.DATE)
	private Date datsai;

	private Integer qua;

	public Locmaq() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodcencusori() {
		return this.codcencusori;
	}

	public void setCodcencusori(Integer codcencusori) {
		this.codcencusori = codcencusori;
	}

	public Integer getCodmaq() {
		return this.codmaq;
	}

	public void setCodmaq(Integer codmaq) {
		this.codmaq = codmaq;
	}

	public Date getDatent() {
		return this.datent;
	}

	public void setDatent(Date datent) {
		this.datent = datent;
	}

	public Date getDatpresai() {
		return this.datpresai;
	}

	public void setDatpresai(Date datpresai) {
		this.datpresai = datpresai;
	}

	public Date getDatsai() {
		return this.datsai;
	}

	public void setDatsai(Date datsai) {
		this.datsai = datsai;
	}

	public Integer getQua() {
		return this.qua;
	}

	public void setQua(Integer qua) {
		this.qua = qua;
	}

}