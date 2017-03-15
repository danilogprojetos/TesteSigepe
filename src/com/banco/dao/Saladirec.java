package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the saladirec database table.
 * 
 */
@Entity
@Table(name="saladirec")
@NamedQuery(name="Saladirec.findAll", query="SELECT s FROM Saladirec s")
public class Saladirec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SALADIREC_CODPARREC_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALADIREC_CODPARREC_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer codparrec;

	private double sal;

	public Saladirec() {
	}

	public Integer getCodparrec() {
		return this.codparrec;
	}

	public void setCodparrec(Integer codparrec) {
		this.codparrec = codparrec;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}