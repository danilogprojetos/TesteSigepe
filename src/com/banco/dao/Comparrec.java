package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the comparrec database table.
 * 
 */
@Entity
@Table(name="comparrec")
@NamedQuery(name="Comparrec.findAll", query="SELECT c FROM Comparrec c")
public class Comparrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComparrecPK id;

	private Integer codcom;

	public Comparrec() {
	}

	public ComparrecPK getId() {
		return this.id;
	}

	public void setId(ComparrecPK id) {
		this.id = id;
	}

	public Integer getCodcom() {
		return this.codcom;
	}

	public void setCodcom(Integer codcom) {
		this.codcom = codcom;
	}

}