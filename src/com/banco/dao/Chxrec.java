package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chxrec database table.
 * 
 */
@Entity
@Table(name="chxrec")
@NamedQuery(name="Chxrec.findAll", query="SELECT c FROM Chxrec c")
public class Chxrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChxrecPK id;

	public Chxrec() {
	}

	public ChxrecPK getId() {
		return this.id;
	}

	public void setId(ChxrecPK id) {
		this.id = id;
	}

}