package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the imppeden database table.
 * 
 */
@Embeddable
public class ImppedenPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer coditepedent;

	@Column(unique=true, nullable=false)
	private Integer codimp;

	public ImppedenPK() {
	}
	public Integer getCoditepedent() {
		return this.coditepedent;
	}
	public void setCoditepedent(Integer coditepedent) {
		this.coditepedent = coditepedent;
	}
	public Integer getCodimp() {
		return this.codimp;
	}
	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ImppedenPK)) {
			return false;
		}
		ImppedenPK castOther = (ImppedenPK)other;
		return 
			this.coditepedent.equals(castOther.coditepedent)
			&& this.codimp.equals(castOther.codimp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.coditepedent.hashCode();
		hash = hash * prime + this.codimp.hashCode();
		
		return hash;
	}
}