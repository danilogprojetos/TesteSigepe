package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ordcorpedsai database table.
 * 
 */
@Entity
@Table(name="ordcorpedsai")
@NamedQuery(name="Ordcorpedsai.findAll", query="SELECT o FROM Ordcorpedsai o")
public class Ordcorpedsai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDCORPEDSAI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDCORPEDSAI_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codordcor;

	private Integer codpedsai;

	public Ordcorpedsai() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodordcor() {
		return this.codordcor;
	}

	public void setCodordcor(Integer codordcor) {
		this.codordcor = codordcor;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

}