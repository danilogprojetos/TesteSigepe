package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the desips database table.
 * 
 */
@Entity
@Table(name="desips")
@NamedQuery(name="Desip.findAll", query="SELECT d FROM Desip d")
public class Desip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DESIPS_CODITEPEDSAI_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESIPS_CODITEPEDSAI_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer coditepedsai;

	private byte[] des;

	public Desip() {
	}

	public Integer getCoditepedsai() {
		return this.coditepedsai;
	}

	public void setCoditepedsai(Integer coditepedsai) {
		this.coditepedsai = coditepedsai;
	}

	public byte[] getDes() {
		return this.des;
	}

	public void setDes(byte[] des) {
		this.des = des;
	}

}