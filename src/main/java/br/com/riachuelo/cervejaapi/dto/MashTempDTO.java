package br.com.riachuelo.cervejaapi.dto;

public class MashTempDTO {

	private VolumeDTO temp;
	private long duration;

	public VolumeDTO getTemp() {
		return temp;
	}

	public void setTemp(VolumeDTO value) {
		this.temp = value;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long value) {
		this.duration = value;
	}

}
