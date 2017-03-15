package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acesso database table.
 * 
 */
@Entity
@Table(name="acesso")
@NamedQuery(name="Acesso.findAll", query="SELECT a FROM Acesso a")
public class Acesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcessoPK id;

	private Integer lib;

	public Acesso() {
	}

	public AcessoPK getId() {
		return this.id;
	}

	public void setId(AcessoPK id) {
		this.id = id;
	}

	public Integer getLib() {
		return this.lib;
	}

	public void setLib(Integer lib) {
		this.lib = lib;
	}

}