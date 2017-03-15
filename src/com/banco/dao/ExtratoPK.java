package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the extrato database table.
 * 
 */
@Embeddable
public class ExtratoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codban;

	@Column(unique=true, nullable=false)
	private Integer codtipcc;

	public ExtratoPK() {
	}
	public Integer getCodban() {
		return this.codban;
	}
	public void setCodban(Integer codban) {
		this.codban = codban;
	}
	public Integer getCodtipcc() {
		return this.codtipcc;
	}
	public void setCodtipcc(Integer codtipcc) {
		this.codtipcc = codtipcc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExtratoPK)) {
			return false;
		}
		ExtratoPK castOther = (ExtratoPK)other;
		return 
			this.codban.equals(castOther.codban)
			&& this.codtipcc.equals(castOther.codtipcc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codban.hashCode();
		hash = hash * prime + this.codtipcc.hashCode();
		
		return hash;
	}
}