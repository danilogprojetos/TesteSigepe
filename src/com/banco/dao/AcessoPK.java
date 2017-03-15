package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acesso database table.
 * 
 */
@Embeddable
public class AcessoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codusu;

	@Column(unique=true, nullable=false)
	private Integer codcad;

	public AcessoPK() {
	}
	public Integer getCodusu() {
		return this.codusu;
	}
	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}
	public Integer getCodcad() {
		return this.codcad;
	}
	public void setCodcad(Integer codcad) {
		this.codcad = codcad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcessoPK)) {
			return false;
		}
		AcessoPK castOther = (AcessoPK)other;
		return 
			this.codusu.equals(castOther.codusu)
			&& this.codcad.equals(castOther.codcad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codusu.hashCode();
		hash = hash * prime + this.codcad.hashCode();
		
		return hash;
	}
}