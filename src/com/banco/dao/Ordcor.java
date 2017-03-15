package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ordcor database table.
 * 
 */
@Entity
@Table(name="ordcor")
@NamedQuery(name="Ordcor.findAll", query="SELECT o FROM Ordcor o")
public class Ordcor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDCOR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDCOR_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Temporal(TemporalType.DATE)
	private Date dat;

	@Temporal(TemporalType.DATE)
	private Date datpreent;

	public Ordcor() {
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

	public Date getDatpreent() {
		return this.datpreent;
	}

	public void setDatpreent(Date datpreent) {
		this.datpreent = datpreent;
	}

}