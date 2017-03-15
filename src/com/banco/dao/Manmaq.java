package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the manmaq database table.
 * 
 */
@Entity
@Table(name="manmaq")
@NamedQuery(name="Manmaq.findAll", query="SELECT m FROM Manmaq m")
public class Manmaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MANMAQ_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MANMAQ_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codfor;

	private Integer codmanmaq;

	private Integer codmaq;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datvengar;

	private byte[] des;

	private double qua;

	private double valuni;

	public Manmaq() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCodmanmaq() {
		return this.codmanmaq;
	}

	public void setCodmanmaq(Integer codmanmaq) {
		this.codmanmaq = codmanmaq;
	}

	public Integer getCodmaq() {
		return this.codmaq;
	}

	public void setCodmaq(Integer codmaq) {
		this.codmaq = codmaq;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatvengar() {
		return this.datvengar;
	}

	public void setDatvengar(Date datvengar) {
		this.datvengar = datvengar;
	}

	public byte[] getDes() {
		return this.des;
	}

	public void setDes(byte[] des) {
		this.des = des;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getValuni() {
		return this.valuni;
	}

	public void setValuni(double valuni) {
		this.valuni = valuni;
	}

}