package br.com.riachuelo.cervejaapi.dto;

public class HopDTO {

	private String name;
	private VolumeDTO amount;
	private String add;
	private String attribute;

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
