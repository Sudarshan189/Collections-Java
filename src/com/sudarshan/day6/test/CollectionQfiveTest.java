package com.sudarshan.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.sudarshan.day6.Car;

class CollectionQfiveTest {

	
	// use tree set
	@Test
	void testCar1() {
		TreeSet<Car> carCollection = new TreeSet<>();
		
		assertEquals(true, carCollection.add(new Car("BMW", "C4", 2014, 256666)));
		assertEquals(true, carCollection.add(new Car("Audi", "gsa", 2016, 256666)));	
		assertEquals(true, carCollection.add(new Car("Maruthi", "sC4", 2018, 256666)));
		
		for (Car car : carCollection) {
			System.out.println(car);
		}
		assertEquals("[Car [make=Audi, model=gsa, year=2016, price=256666.0], Car [make=BMW, model=C4, year=2014, price=256666.0], Car [make=Maruthi, model=sC4, year=2018, price=256666.0]]", carCollection.toString());
		
		
	}

}
