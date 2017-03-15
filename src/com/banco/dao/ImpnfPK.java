package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the impnf database table.
 * 
 */
@Embeddable
public class ImpnfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer coditenotfis;

	@Column(unique=true, nullable=false)
	private Integer codimp;

	public ImpnfPK() {
	}
	public Integer getCoditenotfis() {
		return this.coditenotfis;
	}
	public void setCoditenotfis(Integer coditenotfis) {
		this.coditenotfis = coditenotfis;
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
		if (!(other instanceof ImpnfPK)) {
			return false;
		}
		ImpnfPK castOther = (ImpnfPK)other;
		return 
			this.coditenotfis.equals(castOther.coditenotfis)
			&& this.codimp.equals(castOther.codimp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.coditenotfis.hashCode();
		hash = hash * prime + this.codimp.hashCode();
		
		return hash;
	}
}