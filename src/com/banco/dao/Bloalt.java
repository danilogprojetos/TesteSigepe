package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bloalt database table.
 * 
 */
@Entity
@Table(name="bloalt")
@NamedQuery(name="Bloalt.findAll", query="SELECT b FROM Bloalt b")
public class Bloalt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BLOALT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BLOALT_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Temporal(TemporalType.DATE)
	private Date datalt;

	@Column(length=30)
	private String numblo;

	private byte[] obs;

	public Bloalt() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Date getDatalt() {
		return this.datalt;
	}

	public void setDatalt(Date datalt) {
		this.datalt = datalt;
	}

	public String getNumblo() {
		return this.numblo;
	}

	public void setNumblo(String numblo) {
		this.numblo = numblo;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

}