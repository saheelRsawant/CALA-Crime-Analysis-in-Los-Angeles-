package com.bean;

public class Crime {
	
	private int casenumber;
	private int areadid;
	private int crimecode;
	private String crimecodedesc;
	private String mocode;
	private String weapondesc;
	public int getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(int casenumber) {
		this.casenumber = casenumber;
	}
	public int getAreadid() {
		return areadid;
	}
	public void setAreadid(int areadid) {
		this.areadid = areadid;
	}
	public int getCrimecode() {
		return crimecode;
	}
	public void setCrimecode(int crimecode) {
		this.crimecode = crimecode;
	}
	public String getCrimecodedesc() {
		return crimecodedesc;
	}
	public void setCrimecodedesc(String crimecodedesc) {
		this.crimecodedesc = crimecodedesc;
	}
	public String getMocode() {
		return mocode;
	}
	public void setMocode(String mocode) {
		this.mocode = mocode;
	}
	public String getWeapondesc() {
		return weapondesc;
	}
	public void setWeapondesc(String weapondesc) {
		this.weapondesc = weapondesc;
	}

}
