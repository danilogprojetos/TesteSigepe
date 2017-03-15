package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cencus database table.
 * 
 */
@Entity
@Table(name="cencus")
@NamedQuery(name="Cencus.findAll", query="SELECT c FROM Cencus c")
public class Cencus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CENCUS_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CENCUS_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String bai;

	private Integer blo;

	@Column(length=40)
	private String cencus;

	private Integer codcencus;

	private Integer codcid;

	private Integer codfor;

	private double efi;

	@Column(length=30)
	private String rua;

	private Integer usaint;

	private double valhor;

	private double valtetpercot;

	public Cencus() {
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

	public String getBai() {
		return this.bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	public Integer getBlo() {
		return this.blo;
	}

	public void setBlo(Integer blo) {
		this.blo = blo;
	}

	public String getCencus() {
		return this.cencus;
	}

	public void setCencus(String cencus) {
		this.cencus = cencus;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public double getEfi() {
		return this.efi;
	}

	public void setEfi(double efi) {
		this.efi = efi;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getUsaint() {
		return this.usaint;
	}

	public void setUsaint(Integer usaint) {
		this.usaint = usaint;
	}

	public double getValhor() {
		return this.valhor;
	}

	public void setValhor(double valhor) {
		this.valhor = valhor;
	}

	public double getValtetpercot() {
		return this.valtetpercot;
	}

	public void setValtetpercot(double valtetpercot) {
		this.valtetpercot = valtetpercot;
	}

}