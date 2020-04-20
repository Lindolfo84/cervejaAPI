package br.com.riachuelo.cervejaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Volume {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double value;
	private String unit;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String value) {
		this.unit = value;
	}

}
