package com.sudarshan.day6.question1;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greateSchoolRanking;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String schoolDistrict, int greateSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greateSchoolRanking = greateSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public int getGreateSchoolRanking() {
		return greateSchoolRanking;
	}

}
