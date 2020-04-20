package br.com.riachuelo.cervejaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MashTemp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Volume temp;
	private long duration;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Volume getTemp() {
		return temp;
	}

	public void setTemp(Volume value) {
		this.temp = value;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long value) {
		this.duration = value;
	}

}
