package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipcrepiscof database table.
 * 
 */
@Entity
@Table(name="tipcrepiscof")
@NamedQuery(name="Tipcrepiscof.findAll", query="SELECT t FROM Tipcrepiscof t")
public class Tipcrepiscof implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPCREPISCOF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPCREPISCOF_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	@Column(length=100)
	private String des;

	public Tipcrepiscof() {
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

}