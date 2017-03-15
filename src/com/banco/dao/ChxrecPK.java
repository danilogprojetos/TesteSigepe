package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chxrec database table.
 * 
 */
@Embeddable
public class ChxrecPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codparrec;

	@Column(unique=true, nullable=false)
	private Integer codchrec;

	public ChxrecPK() {
	}
	public Integer getCodparrec() {
		return this.codparrec;
	}
	public void setCodparrec(Integer codparrec) {
		this.codparrec = codparrec;
	}
	public Integer getCodchrec() {
		return this.codchrec;
	}
	public void setCodchrec(Integer codchrec) {
		this.codchrec = codchrec;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChxrecPK)) {
			return false;
		}
		ChxrecPK castOther = (ChxrecPK)other;
		return 
			this.codparrec.equals(castOther.codparrec)
			&& this.codchrec.equals(castOther.codchrec);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codparrec.hashCode();
		hash = hash * prime + this.codchrec.hashCode();
		
		return hash;
	}
}