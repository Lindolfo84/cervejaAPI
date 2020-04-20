package br.com.riachuelo.cervejaapi.dto;

public class MaltDTO {

	private String name;
	private VolumeDTO amount;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public VolumeDTO getAmount() {
		return amount;
	}

	public void setAmount(VolumeDTO value) {
		this.amount = value;
	}

}
