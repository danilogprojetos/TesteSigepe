package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chreppag database table.
 * 
 */
@Embeddable
public class ChreppagPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codchrec;

	@Column(unique=true, nullable=false)
	private Integer codparpag;

	public ChreppagPK() {
	}
	public Integer getCodchrec() {
		return this.codchrec;
	}
	public void setCodchrec(Integer codchrec) {
		this.codchrec = codchrec;
	}
	public Integer getCodparpag() {
		return this.codparpag;
	}
	public void setCodparpag(Integer codparpag) {
		this.codparpag = codparpag;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChreppagPK)) {
			return false;
		}
		ChreppagPK castOther = (ChreppagPK)other;
		return 
			this.codchrec.equals(castOther.codchrec)
			&& this.codparpag.equals(castOther.codparpag);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codchrec.hashCode();
		hash = hash * prime + this.codparpag.hashCode();
		
		return hash;
	}
}