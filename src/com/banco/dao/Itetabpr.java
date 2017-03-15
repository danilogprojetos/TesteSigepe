package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the itetabpr database table.
 * 
 */
@Entity
@Table(name="itetabpr")
@NamedQuery(name="Itetabpr.findAll", query="SELECT i FROM Itetabpr i")
public class Itetabpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItetabprPK id;

	@Temporal(TemporalType.DATE)
	private Date datpro;

	private double porcom;

	private double valpro;

	private double valven;

	public Itetabpr() {
	}

	public ItetabprPK getId() {
		return this.id;
	}

	public void setId(ItetabprPK id) {
		this.id = id;
	}

	public Date getDatpro() {
		return this.datpro;
	}

	public void setDatpro(Date datpro) {
		this.datpro = datpro;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public double getValpro() {
		return this.valpro;
	}

	public void setValpro(double valpro) {
		this.valpro = valpro;
	}

	public double getValven() {
		return this.valven;
	}

	public void setValven(double valven) {
		this.valven = valven;
	}

}