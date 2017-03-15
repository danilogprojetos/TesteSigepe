package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENTE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTE_COD_GENERATOR")
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

	@Column(length=30)
	private String cidade;

	@Column(length=4)
	private String codcfo;

	private Integer codcid;

	private Integer codcli;

	private Integer codgui;

	private Integer codmun;

	private Integer codtipclifat;

	private Integer codven;

	@Column(length=20)
	private String comlog;

	@Column(length=40)
	private String con;

	@Temporal(TemporalType.DATE)
	private Date datcad;

	@Column(length=50)
	private String email;

	@Column(length=200)
	private String endereco;

	@Column(length=60)
	private String fan;

	@Column(length=15)
	private String fax;

	@Column(length=20)
	private String fon;

	@Column(length=20)
	private String ins;

	@Column(length=40)
	private String log;

	@Column(length=8)
	private String num;

	@Column(length=10)
	private String numficgui;

	private Integer pes;

	private Integer podgerrem;

	@Column(length=60)
	private String raz;

	@Column(length=75)
	private String rua;

	@Column(length=2)
	private String uf;

	public Cliente() {
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

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodgui() {
		return this.codgui;
	}

	public void setCodgui(Integer codgui) {
		this.codgui = codgui;
	}

	public Integer getCodmun() {
		return this.codmun;
	}

	public void setCodmun(Integer codmun) {
		this.codmun = codmun;
	}

	public Integer getCodtipclifat() {
		return this.codtipclifat;
	}

	public void setCodtipclifat(Integer codtipclifat) {
		this.codtipclifat = codtipclifat;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public String getComlog() {
		return this.comlog;
	}

	public void setComlog(String comlog) {
		this.comlog = comlog;
	}

	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public Date getDatcad() {
		return this.datcad;
	}

	public void setDatcad(Date datcad) {
		this.datcad = datcad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFan() {
		return this.fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
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

	public String getIns() {
		return this.ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getNumficgui() {
		return this.numficgui;
	}

	public void setNumficgui(String numficgui) {
		this.numficgui = numficgui;
	}

	public Integer getPes() {
		return this.pes;
	}

	public void setPes(Integer pes) {
		this.pes = pes;
	}

	public Integer getPodgerrem() {
		return this.podgerrem;
	}

	public void setPodgerrem(Integer podgerrem) {
		this.podgerrem = podgerrem;
	}

	public String getRaz() {
		return this.raz;
	}

	public void setRaz(String raz) {
		this.raz = raz;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}