package com.sudarshan.day6;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enabled3d=" + enabled3d + ", price=" + price
				+ "]";
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
	
	@Override
	public int hashCode() {
		return Objects.hash(company, type, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


}
