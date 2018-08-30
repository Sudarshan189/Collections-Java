package com.sudarshan.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public static boolean itarateAllLaptops(ArrayList<Laptop> laptopCollection) {
		for (Laptop laptop : laptopCollection) {
			System.out.println(
					laptop.company + " " + laptop.model + " " + laptop.operatingSystem + " " + laptop.processor);
		}
		return true;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Laptop laptop = (Laptop) obj;
		if (laptop.company.equals(this.company) && laptop.model.equals(this.model)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(company, model);
	}

}