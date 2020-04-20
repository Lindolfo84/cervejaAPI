package br.com.riachuelo.cervejaapi.dto;

public class MethodDTO {

	private MashTempDTO[] mashTemp;
	private FermentationDTO fermentation;
	private Object twist;

	public MashTempDTO[] getMashTemp() {
		return mashTemp;
	}

	public void setMashTemp(MashTempDTO[] value) {
		this.mashTemp = value;
	}

	public FermentationDTO getFermentation() {
		return fermentation;
	}

	public void setFermentation(FermentationDTO value) {
		this.fermentation = value;
	}

	public Object getTwist() {
		return twist;
	}

	public void setTwist(Object value) {
		this.twist = value;
	}

}
