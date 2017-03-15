package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the triicmcf database table.
 * 
 */
@Embeddable
public class TriicmcfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=10)
	private String codclafis;

	@Column(unique=true, nullable=false, length=5)
	private String codcfo;

	public TriicmcfPK() {
	}
	public String getCodclafis() {
		return this.codclafis;
	}
	public void setCodclafis(String codclafis) {
		this.codclafis = codclafis;
	}
	public String getCodcfo() {
		return this.codcfo;
	}
	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TriicmcfPK)) {
			return false;
		}
		TriicmcfPK castOther = (TriicmcfPK)other;
		return 
			this.codclafis.equals(castOther.codclafis)
			&& this.codcfo.equals(castOther.codcfo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codclafis.hashCode();
		hash = hash * prime + this.codcfo.hashCode();
		
		return hash;
	}
}