package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the extrato database table.
 * 
 */
@Entity
@Table(name="extrato")
@NamedQuery(name="Extrato.findAll", query="SELECT e FROM Extrato e")
public class Extrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExtratoPK id;

	@Column(length=100)
	private String des;

	public Extrato() {
	}

	public ExtratoPK getId() {
		return this.id;
	}

	public void setId(ExtratoPK id) {
		this.id = id;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}