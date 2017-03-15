package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chdevrec database table.
 * 
 */
@Embeddable
public class ChdevrecPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codparrec;

	@Column(unique=true, nullable=false)
	private Integer codchrec;

	@Column(unique=true, nullable=false, length=1)
	private String orides;

	public ChdevrecPK() {
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
	public String getOrides() {
		return this.orides;
	}
	public void setOrides(String orides) {
		this.orides = orides;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChdevrecPK)) {
			return false;
		}
		ChdevrecPK castOther = (ChdevrecPK)other;
		return 
			this.codparrec.equals(castOther.codparrec)
			&& this.codchrec.equals(castOther.codchrec)
			&& this.orides.equals(castOther.orides);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codparrec.hashCode();
		hash = hash * prime + this.codchrec.hashCode();
		hash = hash * prime + this.orides.hashCode();
		
		return hash;
	}
}