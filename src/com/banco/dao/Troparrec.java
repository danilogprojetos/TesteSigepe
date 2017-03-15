package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the troparrec database table.
 * 
 */
@Entity
@Table(name="troparrec")
@NamedQuery(name="Troparrec.findAll", query="SELECT t FROM Troparrec t")
public class Troparrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TROPARREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TROPARREC_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	private Integer codlancc;

	private Integer codparrec;

	public Troparrec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodlancc() {
		return this.codlancc;
	}

	public void setCodlancc(Integer codlancc) {
		this.codlancc = codlancc;
	}

	public Integer getCodparrec() {
		return this.codparrec;
	}

	public void setCodparrec(Integer codparrec) {
		this.codparrec = codparrec;
	}

}