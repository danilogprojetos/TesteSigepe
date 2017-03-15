package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itetabpr database table.
 * 
 */
@Embeddable
public class ItetabprPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codtabpre;

	@Column(unique=true, nullable=false)
	private Integer codmer;

	public ItetabprPK() {
	}
	public Integer getCodtabpre() {
		return this.codtabpre;
	}
	public void setCodtabpre(Integer codtabpre) {
		this.codtabpre = codtabpre;
	}
	public Integer getCodmer() {
		return this.codmer;
	}
	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItetabprPK)) {
			return false;
		}
		ItetabprPK castOther = (ItetabprPK)other;
		return 
			this.codtabpre.equals(castOther.codtabpre)
			&& this.codmer.equals(castOther.codmer);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codtabpre.hashCode();
		hash = hash * prime + this.codmer.hashCode();
		
		return hash;
	}
}