package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the guia database table.
 * 
 */
@Entity
@Table(name="guia")
@NamedQuery(name="Guia.findAll", query="SELECT g FROM Guia g")
public class Guia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GUIA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GUIA_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=25)
	private String bai;

	@Column(length=20)
	private String cel;

	@Column(length=8)
	private String cep;

	@Column(length=18)
	private String cgc;

	private Integer codcengui;

	private Integer codcid;

	@Column(length=20)
	private String con;

	@Column(length=40)
	private String email;

	@Column(length=15)
	private String fax;

	@Column(length=15)
	private String fon;

	@Column(length=40)
	private String gui;

	@Column(length=10)
	private String numgui;

	private byte[] obs;

	@Column(length=40)
	private String rua;

	public Guia() {
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

	public String getCel() {
		return this.cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public Integer getCodcengui() {
		return this.codcengui;
	}

	public void setCodcengui(Integer codcengui) {
		this.codcengui = codcengui;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFon() {
		return this.fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
	}

	public String getGui() {
		return this.gui;
	}

	public void setGui(String gui) {
		this.gui = gui;
	}

	public String getNumgui() {
		return this.numgui;
	}

	public void setNumgui(String numgui) {
		this.numgui = numgui;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}