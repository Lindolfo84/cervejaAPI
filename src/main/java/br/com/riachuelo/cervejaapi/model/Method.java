package br.com.riachuelo.cervejaapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Method {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MashTemp> mashTemp;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Fermentation fermentation;
	private String twist;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<MashTemp> getMashTemp() {
		return mashTemp;
	}

	public void setMashTemp(List<MashTemp> value) {
		this.mashTemp = value;
	}

	public Fermentation getFermentation() {
		return fermentation;
	}

	public void setFermentation(Fermentation value) {
		this.fermentation = value;
	}

	public String getTwist() {
		return twist;
	}

	public void setTwist(String value) {
		this.twist = value;
	}

}
