package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the cotger database table.
 * 
 */
@Entity
@Table(name="cotger")
@NamedQuery(name="Cotger.findAll", query="SELECT c FROM Cotger c")
public class Cotger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COTGER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COTGER_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private Time hor;

	public Cotger() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

}