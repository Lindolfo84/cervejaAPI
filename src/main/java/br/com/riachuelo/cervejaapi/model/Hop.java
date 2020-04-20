package br.com.riachuelo.cervejaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToOne
	private Volume amount;
	private String add;
	private String attribute;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public Volume getAmount() {
		return amount;
	}

	public void setAmount(Volume value) {
		this.amount = value;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String value) {
		this.add = value;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String value) {
		this.attribute = value;
	}

}
