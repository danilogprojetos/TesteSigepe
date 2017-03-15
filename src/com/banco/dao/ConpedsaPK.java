package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the conpedsa database table.
 * 
 */
@Embeddable
public class ConpedsaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private Integer codpedsai;

	@Column(unique=true, nullable=false)
	private Integer codmer1;

	@Column(unique=true, nullable=false)
	private Integer codmer2;

	public ConpedsaPK() {
	}
	public Integer getCodpedsai() {
		return this.codpedsai;
	}
	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}
	public Integer getCodmer1() {
		return this.codmer1;
	}
	public void setCodmer1(Integer codmer1) {
		this.codmer1 = codmer1;
	}
	public Integer getCodmer2() {
		return this.codmer2;
	}
	public void setCodmer2(Integer codmer2) {
		this.codmer2 = codmer2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConpedsaPK)) {
			return false;
		}
		ConpedsaPK castOther = (ConpedsaPK)other;
		return 
			this.codpedsai.equals(castOther.codpedsai)
			&& this.codmer1.equals(castOther.codmer1)
			&& this.codmer2.equals(castOther.codmer2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codpedsai.hashCode();
		hash = hash * prime + this.codmer1.hashCode();
		hash = hash * prime + this.codmer2.hashCode();
		
		return hash;
	}
}