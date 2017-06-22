package de.florianmarsch.routing.entity;

public class Location {
	
	private String address;
	private Double latitude;
	private Double longitude;
	
	public Location(String aAddress, Double aLatitude, Double aLongitude) {
		address = aAddress;
		latitude = aLatitude;
		longitude = aLongitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

	@Override
	public String toString() {
		return "Location [address=" + address + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}