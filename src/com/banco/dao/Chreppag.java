package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chreppag database table.
 * 
 */
@Entity
@Table(name="chreppag")
@NamedQuery(name="Chreppag.findAll", query="SELECT c FROM Chreppag c")
public class Chreppag implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChreppagPK id;

	public Chreppag() {
	}

	public ChreppagPK getId() {
		return this.id;
	}

	public void setId(ChreppagPK id) {
		this.id = id;
	}

}