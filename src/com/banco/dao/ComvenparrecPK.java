package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the comvenparrec database table.
 * 
 */
@Embeddable
public class ComvenparrecPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codparrec;

	@Column(unique=true, nullable=false)
	private Integer codven;

	public ComvenparrecPK() {
	}
	public Integer getCodparrec() {
		return this.codparrec;
	}
	public void setCodparrec(Integer codparrec) {
		this.codparrec = codparrec;
	}
	public Integer getCodven() {
		return this.codven;
	}
	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ComvenparrecPK)) {
			return false;
		}
		ComvenparrecPK castOther = (ComvenparrecPK)other;
		return 
			this.codparrec.equals(castOther.codparrec)
			&& this.codven.equals(castOther.codven);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codparrec.hashCode();
		hash = hash * prime + this.codven.hashCode();
		
		return hash;
	}
}