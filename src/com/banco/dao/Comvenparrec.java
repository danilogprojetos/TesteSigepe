package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the comvenparrec database table.
 * 
 */
@Entity
@Table(name="comvenparrec")
@NamedQuery(name="Comvenparrec.findAll", query="SELECT c FROM Comvenparrec c")
public class Comvenparrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComvenparrecPK id;

	private Integer codcom;

	public Comvenparrec() {
	}

	public ComvenparrecPK getId() {
		return this.id;
	}

	public void setId(ComvenparrecPK id) {
		this.id = id;
	}

	public Integer getCodcom() {
		return this.codcom;
	}

	public void setCodcom(Integer codcom) {
		this.codcom = codcom;
	}

}