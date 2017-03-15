package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conpedsa database table.
 * 
 */
@Entity
@Table(name="conpedsa")
@NamedQuery(name="Conpedsa.findAll", query="SELECT c FROM Conpedsa c")
public class Conpedsa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConpedsaPK id;

	private double qua;

	public Conpedsa() {
	}

	public ConpedsaPK getId() {
		return this.id;
	}

	public void setId(ConpedsaPK id) {
		this.id = id;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

}