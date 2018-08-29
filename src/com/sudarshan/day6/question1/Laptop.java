package com.sudarshan.day6.question1;

import java.util.ArrayList;

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
			System.out.println(laptop.company + " " + laptop.model + " " + laptop.operatingSystem + " "+ laptop.processor);
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

	
}
