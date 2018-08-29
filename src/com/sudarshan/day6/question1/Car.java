package com.sudarshan.day6.question1;

import java.util.ArrayList;

public class Car {
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
			System.out.println(car.make + " " + car.model + " " + car.year + " "+ car.price);
		}
		return true;
	}

}
