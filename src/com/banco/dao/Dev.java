package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dev database table.
 * 
 */
@Entity
@Table(name="dev")
@NamedQuery(name="Dev.findAll", query="SELECT d FROM Dev d")
public class Dev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEV_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEV_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codmov;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Column(length=6)
	private String tipmov;

	public Dev() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(String tipmov) {
		this.tipmov = tipmov;
	}

}