package br.com.riachuelo.cervejaapi.dto;

public class IngredientDTO {

	private MaltDTO[] malt;
	private HopDTO[] hops;
	private String yeast;

	public MaltDTO[] getMalt() {
		return malt;
	}

	public void setMalt(MaltDTO[] value) {
		this.malt = value;
	}

	public HopDTO[] getHops() {
		return hops;
	}

	public void setHops(HopDTO[] value) {
		this.hops = value;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String value) {
		this.yeast = value;
	}

}
