package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the etapedpr database table.
 * 
 */
@Entity
@Table(name="etapedpr")
@NamedQuery(name="Etapedpr.findAll", query="SELECT e FROM Etapedpr e")
public class Etapedpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ETAPEDPR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ETAPEDPR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codpedpro;

	@Temporal(TemporalType.DATE)
	private Date datfin;

	@Temporal(TemporalType.DATE)
	private Date datini;

	@Column(length=20)
	private String eta;

	public Etapedpr() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodpedpro() {
		return this.codpedpro;
	}

	public void setCodpedpro(Integer codpedpro) {
		this.codpedpro = codpedpro;
	}

	public Date getDatfin() {
		return this.datfin;
	}

	public void setDatfin(Date datfin) {
		this.datfin = datfin;
	}

	public Date getDatini() {
		return this.datini;
	}

	public void setDatini(Date datini) {
		this.datini = datini;
	}

	public String getEta() {
		return this.eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

}