package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unimed database table.
 * 
 */
@Entity
@Table(name="unimed")
@NamedQuery(name="Unimed.findAll", query="SELECT u FROM Unimed u")
public class Unimed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UNIMED_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UNIMED_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=20)
	private String des;

	@Column(length=2)
	private String unimed;

	public Unimed() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getUnimed() {
		return this.unimed;
	}

	public void setUnimed(String unimed) {
		this.unimed = unimed;
	}

}