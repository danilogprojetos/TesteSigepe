package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chxpag database table.
 * 
 */
@Embeddable
public class ChxpagPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codparpag;

	@Column(unique=true, nullable=false)
	private Integer codcc;

	@Column(unique=true, nullable=false)
	private Integer ch;

	public ChxpagPK() {
	}
	public Integer getCodparpag() {
		return this.codparpag;
	}
	public void setCodparpag(Integer codparpag) {
		this.codparpag = codparpag;
	}
	public Integer getCodcc() {
		return this.codcc;
	}
	public void setCodcc(Integer codcc) {
		this.codcc = codcc;
	}
	public Integer getCh() {
		return this.ch;
	}
	public void setCh(Integer ch) {
		this.ch = ch;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChxpagPK)) {
			return false;
		}
		ChxpagPK castOther = (ChxpagPK)other;
		return 
			this.codparpag.equals(castOther.codparpag)
			&& this.codcc.equals(castOther.codcc)
			&& this.ch.equals(castOther.ch);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codparpag.hashCode();
		hash = hash * prime + this.codcc.hashCode();
		hash = hash * prime + this.ch.hashCode();
		
		return hash;
	}
}