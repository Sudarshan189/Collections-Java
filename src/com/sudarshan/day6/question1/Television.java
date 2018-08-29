package com.sudarshan.day6.question1;

public class Television {
	private String company;
	private String type;
	private boolean enabled3d;
	private double price;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String company, String type, boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enabled3d = enabled3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isEnabled3d() {
		return enabled3d;
	}

	public double getPrice() {
		return price;
	}

}
