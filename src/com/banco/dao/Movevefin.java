package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the movevefin database table.
 * 
 */
@Entity
@Table(name="movevefin")
@NamedQuery(name="Movevefin.findAll", query="SELECT m FROM Movevefin m")
public class Movevefin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVEVEFIN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVEVEFIN_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codevefin;

	private Integer codmov;

	@Temporal(TemporalType.DATE)
	private Date datlan;

	private byte[] moteve;

	private Integer tipmov;

	private double valeve;

	public Movevefin() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodevefin() {
		return this.codevefin;
	}

	public void setCodevefin(Integer codevefin) {
		this.codevefin = codevefin;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Date getDatlan() {
		return this.datlan;
	}

	public void setDatlan(Date datlan) {
		this.datlan = datlan;
	}

	public byte[] getMoteve() {
		return this.moteve;
	}

	public void setMoteve(byte[] moteve) {
		this.moteve = moteve;
	}

	public Integer getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(Integer tipmov) {
		this.tipmov = tipmov;
	}

	public double getValeve() {
		return this.valeve;
	}

	public void setValeve(double valeve) {
		this.valeve = valeve;
	}

}