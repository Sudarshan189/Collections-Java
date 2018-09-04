package com.sudarshan.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Comparable<Car> {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public static boolean itarateAllCars(ArrayList<Car> carCollection) {
		for (Car car : carCollection) {
			System.out.println(car.make + " " + car.model + " " + car.year + " " + car.price);
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;

		return true;
	}

	@Override
	public int compareTo(Car o) {
		return this.make.compareTo(o.make);
	}

}
