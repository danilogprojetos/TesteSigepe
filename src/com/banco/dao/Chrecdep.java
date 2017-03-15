package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chrecdep database table.
 * 
 */
@Entity
@Table(name="chrecdep")
@NamedQuery(name="Chrecdep.findAll", query="SELECT c FROM Chrecdep c")
public class Chrecdep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChrecdepPK id;

	public Chrecdep() {
	}

	public ChrecdepPK getId() {
		return this.id;
	}

	public void setId(ChrecdepPK id) {
		this.id = id;
	}

}