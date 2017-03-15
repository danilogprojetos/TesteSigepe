package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carcorele database table.
 * 
 */
@Entity
@Table(name="carcorele")
@NamedQuery(name="Carcorele.findAll", query="SELECT c FROM Carcorele c")
public class Carcorele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CARCORELE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARCORELE_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=44)
	private String chanfe;

	private Integer cnotfis;

	private Integer codcli;

	private Integer codnotfis;

	private byte[] cor;

	@Column(length=30)
	private String dathoreveret;

	private Integer lot;

	@Column(length=150)
	private String motstaret;

	@Column(length=17)
	private String numpro;

	private Integer seqeve;

	private Integer staret;

	public Carcorele() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getChanfe() {
		return this.chanfe;
	}

	public void setChanfe(String chanfe) {
		this.chanfe = chanfe;
	}

	public Integer getCnotfis() {
		return this.cnotfis;
	}

	public void setCnotfis(Integer cnotfis) {
		this.cnotfis = cnotfis;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodnotfis() {
		return this.codnotfis;
	}

	public void setCodnotfis(Integer codnotfis) {
		this.codnotfis = codnotfis;
	}

	public byte[] getCor() {
		return this.cor;
	}

	public void setCor(byte[] cor) {
		this.cor = cor;
	}

	public String getDathoreveret() {
		return this.dathoreveret;
	}

	public void setDathoreveret(String dathoreveret) {
		this.dathoreveret = dathoreveret;
	}

	public Integer getLot() {
		return this.lot;
	}

	public void setLot(Integer lot) {
		this.lot = lot;
	}

	public String getMotstaret() {
		return this.motstaret;
	}

	public void setMotstaret(String motstaret) {
		this.motstaret = motstaret;
	}

	public String getNumpro() {
		return this.numpro;
	}

	public void setNumpro(String numpro) {
		this.numpro = numpro;
	}

	public Integer getSeqeve() {
		return this.seqeve;
	}

	public void setSeqeve(Integer seqeve) {
		this.seqeve = seqeve;
	}

	public Integer getStaret() {
		return this.staret;
	}

	public void setStaret(Integer staret) {
		this.staret = staret;
	}

}