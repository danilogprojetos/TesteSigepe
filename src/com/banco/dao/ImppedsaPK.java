package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the imppedsa database table.
 * 
 */
@Embeddable
public class ImppedsaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer coditepedsai;

	@Column(unique=true, nullable=false)
	private Integer codimp;

	public ImppedsaPK() {
	}
	public Integer getCoditepedsai() {
		return this.coditepedsai;
	}
	public void setCoditepedsai(Integer coditepedsai) {
		this.coditepedsai = coditepedsai;
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
		if (!(other instanceof ImppedsaPK)) {
			return false;
		}
		ImppedsaPK castOther = (ImppedsaPK)other;
		return 
			this.coditepedsai.equals(castOther.coditepedsai)
			&& this.codimp.equals(castOther.codimp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.coditepedsai.hashCode();
		hash = hash * prime + this.codimp.hashCode();
		
		return hash;
	}
}