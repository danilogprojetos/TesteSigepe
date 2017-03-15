package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the forneced database table.
 * 
 */
@Entity
@Table(name="forneced")
@NamedQuery(name="Forneced.findAll", query="SELECT f FROM Forneced f")
public class Forneced implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORNECED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORNECED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=25)
	private String bai;

	@Column(length=8)
	private String cep;

	@Column(length=18)
	private String cgc;

	@Column(length=30)
	private String cidade;

	@Column(length=4)
	private String codcfo;

	private Integer codcid;

	private Integer codrep;

	private Integer codtipclifat;

	@Temporal(TemporalType.DATE)
	private Date datcad;

	private double des1;

	private double des2;

	private double des3;

	private double des4;

	private double despad;

	@Column(length=60)
	private String email;

	@Column(length=60)
	private String fan;

	@Column(length=25)
	private String fax;

	@Column(length=25)
	private String fon;

	private double fre;

	@Column(length=20)
	private String ins;

	private double ipi;

	private Integer pes;

	private double porcom;

	@Column(length=60)
	private String raz;

	@Column(length=40)
	private String refban;

	@Column(length=48)
	private String rua;

	public Forneced() {
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

	public Integer getCodrep() {
		return this.codrep;
	}

	public void setCodrep(Integer codrep) {
		this.codrep = codrep;
	}

	public Integer getCodtipclifat() {
		return this.codtipclifat;
	}

	public void setCodtipclifat(Integer codtipclifat) {
		this.codtipclifat = codtipclifat;
	}

	public Date getDatcad() {
		return this.datcad;
	}

	public void setDatcad(Date datcad) {
		this.datcad = datcad;
	}

	public double getDes1() {
		return this.des1;
	}

	public void setDes1(double des1) {
		this.des1 = des1;
	}

	public double getDes2() {
		return this.des2;
	}

	public void setDes2(double des2) {
		this.des2 = des2;
	}

	public double getDes3() {
		return this.des3;
	}

	public void setDes3(double des3) {
		this.des3 = des3;
	}

	public double getDes4() {
		return this.des4;
	}

	public void setDes4(double des4) {
		this.des4 = des4;
	}

	public double getDespad() {
		return this.despad;
	}

	public void setDespad(double despad) {
		this.despad = despad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public double getFre() {
		return this.fre;
	}

	public void setFre(double fre) {
		this.fre = fre;
	}

	public String getIns() {
		return this.ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public double getIpi() {
		return this.ipi;
	}

	public void setIpi(double ipi) {
		this.ipi = ipi;
	}

	public Integer getPes() {
		return this.pes;
	}

	public void setPes(Integer pes) {
		this.pes = pes;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public String getRaz() {
		return this.raz;
	}

	public void setRaz(String raz) {
		this.raz = raz;
	}

	public String getRefban() {
		return this.refban;
	}

	public void setRefban(String refban) {
		this.refban = refban;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}