package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the usurec database table.
 * 
 */
@Entity
@Table(name="usurec")
@NamedQuery(name="Usurec.findAll", query="SELECT u FROM Usurec u")
public class Usurec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codusudes;

	private Integer codusuori;

	@Temporal(TemporalType.DATE)
	private Date datrec;

	private Time horrec;

	private Integer lid;

	@Column(length=200)
	private String rec;

	public Usurec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodusudes() {
		return this.codusudes;
	}

	public void setCodusudes(Integer codusudes) {
		this.codusudes = codusudes;
	}

	public Integer getCodusuori() {
		return this.codusuori;
	}

	public void setCodusuori(Integer codusuori) {
		this.codusuori = codusuori;
	}

	public Date getDatrec() {
		return this.datrec;
	}

	public void setDatrec(Date datrec) {
		this.datrec = datrec;
	}

	public Time getHorrec() {
		return this.horrec;
	}

	public void setHorrec(Time horrec) {
		this.horrec = horrec;
	}

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getRec() {
		return this.rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}

}