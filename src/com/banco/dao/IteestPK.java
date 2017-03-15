package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the iteest database table.
 * 
 */
@Embeddable
public class IteestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codest;

	@Column(unique=true, nullable=false)
	private Integer codmer;

	public IteestPK() {
	}
	public Integer getCodest() {
		return this.codest;
	}
	public void setCodest(Integer codest) {
		this.codest = codest;
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
		if (!(other instanceof IteestPK)) {
			return false;
		}
		IteestPK castOther = (IteestPK)other;
		return 
			this.codest.equals(castOther.codest)
			&& this.codmer.equals(castOther.codmer);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codest.hashCode();
		hash = hash * prime + this.codmer.hashCode();
		
		return hash;
	}
}