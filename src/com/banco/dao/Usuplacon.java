package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuplacon database table.
 * 
 */
@Entity
@Table(name="usuplacon")
@NamedQuery(name="Usuplacon.findAll", query="SELECT u FROM Usuplacon u")
public class Usuplacon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUPLACON_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUPLACON_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codplacon;

	private Integer codusu;

	private Integer lib;

	public Usuplacon() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Integer getLib() {
		return this.lib;
	}

	public void setLib(Integer lib) {
		this.lib = lib;
	}

}