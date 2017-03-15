package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the triicmcf database table.
 * 
 */
@Entity
@Table(name="triicmcf")
@NamedQuery(name="Triicmcf.findAll", query="SELECT t FROM Triicmcf t")
public class Triicmcf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TriicmcfPK id;

	private Integer codtriicm;

	public Triicmcf() {
	}

	public TriicmcfPK getId() {
		return this.id;
	}

	public void setId(TriicmcfPK id) {
		this.id = id;
	}

	public Integer getCodtriicm() {
		return this.codtriicm;
	}

	public void setCodtriicm(Integer codtriicm) {
		this.codtriicm = codtriicm;
	}

}