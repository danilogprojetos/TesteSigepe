package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subsecmer database table.
 * 
 */
@Entity
@Table(name="subsecmer")
@NamedQuery(name="Subsecmer.findAll", query="SELECT s FROM Subsecmer s")
public class Subsecmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBSECMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBSECMER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer ativo;

	@Column(length=30)
	private String subsecmer;

	public Subsecmer() {
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

	public String getSubsecmer() {
		return this.subsecmer;
	}

	public void setSubsecmer(String subsecmer) {
		this.subsecmer = subsecmer;
	}

}