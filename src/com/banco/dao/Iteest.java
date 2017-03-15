package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteest database table.
 * 
 */
@Entity
@Table(name="iteest")
@NamedQuery(name="Iteest.findAll", query="SELECT i FROM Iteest i")
public class Iteest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IteestPK id;

	private double estatu;

	private double estest;

	public Iteest() {
	}

	public IteestPK getId() {
		return this.id;
	}

	public void setId(IteestPK id) {
		this.id = id;
	}

	public double getEstatu() {
		return this.estatu;
	}

	public void setEstatu(double estatu) {
		this.estatu = estatu;
	}

	public double getEstest() {
		return this.estest;
	}

	public void setEstest(double estest) {
		this.estest = estest;
	}

}