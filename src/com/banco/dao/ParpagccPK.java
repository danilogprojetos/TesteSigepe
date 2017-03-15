package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the parpagcc database table.
 * 
 */
@Embeddable
public class ParpagccPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codparpag;

	@Column(unique=true, nullable=false)
	private Integer codcc;

	public ParpagccPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParpagccPK)) {
			return false;
		}
		ParpagccPK castOther = (ParpagccPK)other;
		return 
			this.codparpag.equals(castOther.codparpag)
			&& this.codcc.equals(castOther.codcc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codparpag.hashCode();
		hash = hash * prime + this.codcc.hashCode();
		
		return hash;
	}
}