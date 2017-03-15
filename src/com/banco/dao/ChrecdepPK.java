package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chrecdep database table.
 * 
 */
@Embeddable
public class ChrecdepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codchrec;

	@Column(unique=true, nullable=false)
	private Integer codlancc;

	public ChrecdepPK() {
	}
	public Integer getCodchrec() {
		return this.codchrec;
	}
	public void setCodchrec(Integer codchrec) {
		this.codchrec = codchrec;
	}
	public Integer getCodlancc() {
		return this.codlancc;
	}
	public void setCodlancc(Integer codlancc) {
		this.codlancc = codlancc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChrecdepPK)) {
			return false;
		}
		ChrecdepPK castOther = (ChrecdepPK)other;
		return 
			this.codchrec.equals(castOther.codchrec)
			&& this.codlancc.equals(castOther.codlancc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codchrec.hashCode();
		hash = hash * prime + this.codlancc.hashCode();
		
		return hash;
	}
}