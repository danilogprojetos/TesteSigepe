package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itedetmer database table.
 * 
 */
@Entity
@Table(name="itedetmer")
@NamedQuery(name="Itedetmer.findAll", query="SELECT i FROM Itedetmer i")
public class Itedetmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEDETMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEDETMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer coddetmer;

	private byte[] des;

	@Column(length=20)
	private String det;

	public Itedetmer() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoddetmer() {
		return this.coddetmer;
	}

	public void setCoddetmer(Integer coddetmer) {
		this.coddetmer = coddetmer;
	}

	public byte[] getDes() {
		return this.des;
	}

	public void setDes(byte[] des) {
		this.des = des;
	}

	public String getDet() {
		return this.det;
	}

	public void setDet(String det) {
		this.det = det;
	}

}