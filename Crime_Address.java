package com.bean;

public class Crime_Address {
	
	private long casenumber;
	private int areadid;
	private String areaname;
	private String location;
	private String Address;
	
	
	public long getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(long casenumber) {
		this.casenumber = casenumber;
	}
	public int getAreadid() {
		return areadid;
	}
	public void setAreadid(int areadid) {
		this.areadid = areadid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	

	private int countCrime;


	public int getCountCrime() {
		return countCrime;
	}
	public void setCountCrime(int countCrime) {
		this.countCrime = countCrime;
	}
	
	
	

}
