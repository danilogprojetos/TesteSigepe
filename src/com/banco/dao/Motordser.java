package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motordser database table.
 * 
 */
@Entity
@Table(name="motordser")
@NamedQuery(name="Motordser.findAll", query="SELECT m FROM Motordser m")
public class Motordser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOTORDSER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOTORDSER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=20)
	private String motordser;

	public Motordser() {
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

	public String getMotordser() {
		return this.motordser;
	}

	public void setMotordser(String motordser) {
		this.motordser = motordser;
	}

}