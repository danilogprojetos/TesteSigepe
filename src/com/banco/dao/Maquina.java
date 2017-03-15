package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the maquina database table.
 * 
 */
@Entity
@Table(name="maquina")
@NamedQuery(name="Maquina.findAll", query="SELECT m FROM Maquina m")
public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MAQUINA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAQUINA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	private Integer codfor;

	private Integer codtipmaq;

	@Temporal(TemporalType.DATE)
	private Date datcom;

	@Temporal(TemporalType.DATE)
	private Date datvalatu;

	@Temporal(TemporalType.DATE)
	private Date datvengar;

	private double inddep;

	@Column(length=40)
	private String maq;

	private Integer qua;

	private double valatu;

	private double valcom;

	public Maquina() {
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

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCodtipmaq() {
		return this.codtipmaq;
	}

	public void setCodtipmaq(Integer codtipmaq) {
		this.codtipmaq = codtipmaq;
	}

	public Date getDatcom() {
		return this.datcom;
	}

	public void setDatcom(Date datcom) {
		this.datcom = datcom;
	}

	public Date getDatvalatu() {
		return this.datvalatu;
	}

	public void setDatvalatu(Date datvalatu) {
		this.datvalatu = datvalatu;
	}

	public Date getDatvengar() {
		return this.datvengar;
	}

	public void setDatvengar(Date datvengar) {
		this.datvengar = datvengar;
	}

	public double getInddep() {
		return this.inddep;
	}

	public void setInddep(double inddep) {
		this.inddep = inddep;
	}

	public String getMaq() {
		return this.maq;
	}

	public void setMaq(String maq) {
		this.maq = maq;
	}

	public Integer getQua() {
		return this.qua;
	}

	public void setQua(Integer qua) {
		this.qua = qua;
	}

	public double getValatu() {
		return this.valatu;
	}

	public void setValatu(double valatu) {
		this.valatu = valatu;
	}

	public double getValcom() {
		return this.valcom;
	}

	public void setValcom(double valcom) {
		this.valcom = valcom;
	}

}