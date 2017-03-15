package com.banco.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cob database table.
 * 
 */
@Entity
@Table(name="cob")
@NamedQuery(name="Cob.findAll", query="SELECT c FROM Cob c")
public class Cob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COB_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COB_COD_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer cod;

	public Cob() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

}