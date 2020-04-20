package br.com.riachuelo.cervejaapi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private List<Malt> malt;
	
	@OneToMany
	private List<Hop> hops;
	private String yeast;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String value) {
		this.yeast = value;
	}

	public List<Malt> getMalt() {
		return malt;
	}

	public void setMalt(List<Malt> malt) {
		this.malt = malt;
	}

	public List<Hop> getHops() {
		return hops;
	}

	public void setHops(List<Hop> hops) {
		this.hops = hops;
	}
	
	

}
