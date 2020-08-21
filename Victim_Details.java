package com.bean;

public class Victim_Details {
	
	private int casenumber;
	private int age;
	private char gender;
	private char descent;
	
	
//	public Victim_Details() {
//		super();
//	}
//	public Victim_Details(int casenumber, int age, char gender, char descent, int count) {
//		super();
//		this.casenumber = casenumber;
//		this.age = age;
//		this.gender = gender;
//		this.descent = descent;
//		this.count = count;
//	}
	public int getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(int casenumber) {
		this.casenumber = casenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getDescent() {
		return descent;
	}
	public void setDescent(char descent) {
		this.descent = descent;
	}
	
	

	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
