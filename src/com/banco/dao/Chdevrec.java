package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the chdevrec database table.
 * 
 */
@Entity
@Table(name="chdevrec")
@NamedQuery(name="Chdevrec.findAll", query="SELECT c FROM Chdevrec c")
public class Chdevrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChdevrecPK id;

	@Temporal(TemporalType.DATE)
	private Date datdev;

	private double valpag;

	private double valtotch;

	public Chdevrec() {
	}

	public ChdevrecPK getId() {
		return this.id;
	}

	public void setId(ChdevrecPK id) {
		this.id = id;
	}

	public Date getDatdev() {
		return this.datdev;
	}

	public void setDatdev(Date datdev) {
		this.datdev = datdev;
	}

	public double getValpag() {
		return this.valpag;
	}

	public void setValpag(double valpag) {
		this.valpag = valpag;
	}

	public double getValtotch() {
		return this.valtotch;
	}

	public void setValtotch(double valtotch) {
		this.valtotch = valtotch;
	}

}