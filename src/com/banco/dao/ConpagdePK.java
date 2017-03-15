package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the conpagde database table.
 * 
 */
@Embeddable
public class ConpagdePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codconpag;

	@Column(unique=true, nullable=false)
	private Integer dia;

	public ConpagdePK() {
	}
	public Integer getCodconpag() {
		return this.codconpag;
	}
	public void setCodconpag(Integer codconpag) {
		this.codconpag = codconpag;
	}
	public Integer getDia() {
		return this.dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConpagdePK)) {
			return false;
		}
		ConpagdePK castOther = (ConpagdePK)other;
		return 
			this.codconpag.equals(castOther.codconpag)
			&& this.dia.equals(castOther.dia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codconpag.hashCode();
		hash = hash * prime + this.dia.hashCode();
		
		return hash;
	}
}