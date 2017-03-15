package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the movcrecli database table.
 * 
 */
@Entity
@Table(name="movcrecli")
@NamedQuery(name="Movcrecli.findAll", query="SELECT m FROM Movcrecli m")
public class Movcrecli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVCRECLI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVCRECLI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codcli;

	private Integer codmov;

	private Integer codsalcrecli;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Integer tipmov;

	private double valcre;

	public Movcrecli() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodmov() {
		return this.codmov;
	}

	public void setCodmov(Integer codmov) {
		this.codmov = codmov;
	}

	public Integer getCodsalcrecli() {
		return this.codsalcrecli;
	}

	public void setCodsalcrecli(Integer codsalcrecli) {
		this.codsalcrecli = codsalcrecli;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Integer getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(Integer tipmov) {
		this.tipmov = tipmov;
	}

	public double getValcre() {
		return this.valcre;
	}

	public void setValcre(double valcre) {
		this.valcre = valcre;
	}

}