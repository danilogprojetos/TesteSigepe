package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chxpag database table.
 * 
 */
@Entity
@Table(name="chxpag")
@NamedQuery(name="Chxpag.findAll", query="SELECT c FROM Chxpag c")
public class Chxpag implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChxpagPK id;

	public Chxpag() {
	}

	public ChxpagPK getId() {
		return this.id;
	}

	public void setId(ChxpagPK id) {
		this.id = id;
	}

}