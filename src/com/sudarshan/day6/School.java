

package com.sudarshan.day6;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(name, city, schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greateSchoolRanking=" + greateSchoolRanking + "]";
	}

}
