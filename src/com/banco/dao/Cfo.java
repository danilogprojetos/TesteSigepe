package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cfo database table.
 * 
 */
@Entity
@Table(name="cfo")
@NamedQuery(name="Cfo.findAll", query="SELECT c FROM Cfo c")
public class Cfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CFO_CFO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CFO_CFO_GENERATOR")
	@Column(unique=true, nullable=false, length=4)
	private String cfo;

	private Integer ativo;

	private Integer codcatcfo;

	private Integer codtipcrepiscof;

	private Integer codtriicm;

	private byte[] des;

	private Integer descof;

	private Integer desipi;

	@Column(length=60)
	private String desnotfis;

	private Integer despis;

	private Integer finnotfis;

	private Integer habconimpnotfis;

	@Column(length=255)
	private String men;

	private Integer tipmovfis;

	public Cfo() {
	}

	public String getCfo() {
		return this.cfo;
	}

	public void setCfo(String cfo) {
		this.cfo = cfo;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getCodcatcfo() {
		return this.codcatcfo;
	}

	public void setCodcatcfo(Integer codcatcfo) {
		this.codcatcfo = codcatcfo;
	}

	public Integer getCodtipcrepiscof() {
		return this.codtipcrepiscof;
	}

	public void setCodtipcrepiscof(Integer codtipcrepiscof) {
		this.codtipcrepiscof = codtipcrepiscof;
	}

	public Integer getCodtriicm() {
		return this.codtriicm;
	}

	public void setCodtriicm(Integer codtriicm) {
		this.codtriicm = codtriicm;
	}

	public byte[] getDes() {
		return this.des;
	}

	public void setDes(byte[] des) {
		this.des = des;
	}

	public Integer getDescof() {
		return this.descof;
	}

	public void setDescof(Integer descof) {
		this.descof = descof;
	}

	public Integer getDesipi() {
		return this.desipi;
	}

	public void setDesipi(Integer desipi) {
		this.desipi = desipi;
	}

	public String getDesnotfis() {
		return this.desnotfis;
	}

	public void setDesnotfis(String desnotfis) {
		this.desnotfis = desnotfis;
	}

	public Integer getDespis() {
		return this.despis;
	}

	public void setDespis(Integer despis) {
		this.despis = despis;
	}

	public Integer getFinnotfis() {
		return this.finnotfis;
	}

	public void setFinnotfis(Integer finnotfis) {
		this.finnotfis = finnotfis;
	}

	public Integer getHabconimpnotfis() {
		return this.habconimpnotfis;
	}

	public void setHabconimpnotfis(Integer habconimpnotfis) {
		this.habconimpnotfis = habconimpnotfis;
	}

	public String getMen() {
		return this.men;
	}

	public void setMen(String men) {
		this.men = men;
	}

	public Integer getTipmovfis() {
		return this.tipmovfis;
	}

	public void setTipmovfis(Integer tipmovfis) {
		this.tipmovfis = tipmovfis;
	}

}