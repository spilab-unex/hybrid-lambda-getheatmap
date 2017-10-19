package es.unex.heatmap.hybrid.messages;

public class LocationFrequency {
	
	private Double latitude;
    
	private Double longitude;
    
	private Integer frequency;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public LocationFrequency(){}
	
}
