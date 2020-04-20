package br.com.riachuelo.cervejaapi.dto;

public class CervejaDTO {
	private long id;
	private String name;
	private String tagline;
	private String firstBrewed;
	private String description;
	private String imageURL;
	private double abv;
	private long ibu;
	private long targetFg;
	private long targetOg;
	private long ebc;
	private long srm;
	private double ph;
	private long attenuationLevel;
	private VolumeDTO volume;
	private VolumeDTO boilVolume;
	private MethodDTO method;
	private IngredientDTO ingredients;
	private String[] foodPairing;
	private String brewersTips;
	private String contributedBy;

	public long getID() {
		return id;
	}

	public void setID(long value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String value) {
		this.tagline = value;
	}

	public String getFirstBrewed() {
		return firstBrewed;
	}

	public void setFirstBrewed(String value) {
		this.firstBrewed = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String value) {
		this.imageURL = value;
	}

	public double getAbv() {
		return abv;
	}

	public void setAbv(double value) {
		this.abv = value;
	}

	public long getIbu() {
		return ibu;
	}

	public void setIbu(long value) {
		this.ibu = value;
	}

	public long getTargetFg() {
		return targetFg;
	}

	public void setTargetFg(long value) {
		this.targetFg = value;
	}

	public long getTargetOg() {
		return targetOg;
	}

	public void setTargetOg(long value) {
		this.targetOg = value;
	}

	public long getEbc() {
		return ebc;
	}

	public void setEbc(long value) {
		this.ebc = value;
	}

	public long getSrm() {
		return srm;
	}

	public void setSrm(long value) {
		this.srm = value;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double value) {
		this.ph = value;
	}

	public long getAttenuationLevel() {
		return attenuationLevel;
	}

	public void setAttenuationLevel(long value) {
		this.attenuationLevel = value;
	}

	public VolumeDTO getVolume() {
		return volume;
	}

	public void setVolume(VolumeDTO value) {
		this.volume = value;
	}

	public VolumeDTO getBoilVolume() {
		return boilVolume;
	}

	public void setBoilVolume(VolumeDTO value) {
		this.boilVolume = value;
	}

	public MethodDTO getMethod() {
		return method;
	}

	public void setMethod(MethodDTO value) {
		this.method = value;
	}

	public IngredientDTO getIngredients() {
		return ingredients;
	}

	public void setIngredients(IngredientDTO value) {
		this.ingredients = value;
	}

	public String[] getFoodPairing() {
		return foodPairing;
	}

	public void setFoodPairing(String[] value) {
		this.foodPairing = value;
	}

	public String getBrewersTips() {
		return brewersTips;
	}

	public void setBrewersTips(String value) {
		this.brewersTips = value;
	}

	public String getContributedBy() {
		return contributedBy;
	}

	public void setContributedBy(String value) {
		this.contributedBy = value;
	}
}