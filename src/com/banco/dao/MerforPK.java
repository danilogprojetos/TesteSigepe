package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the merfor database table.
 * 
 */
@Embeddable
public class MerforPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codmer;

	@Column(unique=true, nullable=false)
	private Integer codfor;

	@Column(unique=true, nullable=false, length=15)
	private String ref;

	public MerforPK() {
	}
	public Integer getCodmer() {
		return this.codmer;
	}
	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}
	public Integer getCodfor() {
		return this.codfor;
	}
	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}
	public String getRef() {
		return this.ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MerforPK)) {
			return false;
		}
		MerforPK castOther = (MerforPK)other;
		return 
			this.codmer.equals(castOther.codmer)
			&& this.codfor.equals(castOther.codfor)
			&& this.ref.equals(castOther.ref);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codmer.hashCode();
		hash = hash * prime + this.codfor.hashCode();
		hash = hash * prime + this.ref.hashCode();
		
		return hash;
	}
}