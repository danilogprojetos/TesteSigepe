package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conpagde database table.
 * 
 */
@Entity
@Table(name="conpagde")
@NamedQuery(name="Conpagde.findAll", query="SELECT c FROM Conpagde c")
public class Conpagde implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConpagdePK id;

	private double por;

	private double porimp;

	public Conpagde() {
	}

	public ConpagdePK getId() {
		return this.id;
	}

	public void setId(ConpagdePK id) {
		this.id = id;
	}

	public double getPor() {
		return this.por;
	}

	public void setPor(double por) {
		this.por = por;
	}

	public double getPorimp() {
		return this.porimp;
	}

	public void setPorimp(double porimp) {
		this.porimp = porimp;
	}

}