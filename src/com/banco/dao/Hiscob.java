package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hiscob database table.
 * 
 */
@Entity
@Table(name="hiscob")
@NamedQuery(name="Hiscob.findAll", query="SELECT h FROM Hiscob h")
public class Hiscob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HISCOB_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISCOB_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer codcob;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=80)
	private String his;

	@Column(length=6)
	private String hor;

	public Hiscob() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getCodcob() {
		return this.codcob;
	}

	public void setCodcob(Integer codcob) {
		this.codcob = codcob;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getHis() {
		return this.his;
	}

	public void setHis(String his) {
		this.his = his;
	}

	public String getHor() {
		return this.hor;
	}

	public void setHor(String hor) {
		this.hor = hor;
	}

}