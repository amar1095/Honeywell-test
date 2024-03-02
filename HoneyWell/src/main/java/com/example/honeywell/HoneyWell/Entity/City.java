package com.example.honeywell.HoneyWell.Entity;

public class City {
	
	private String name;
	private String state;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", state=" + state + ", lat=" + lat + ", lon=" + lon + ", getName()=" + getName()
				+ ", getState()=" + getState() + ", getLat()=" + getLat() + ", getLon()=" + getLon() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	private double lat;
    private double lon;
	

}
