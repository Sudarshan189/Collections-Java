package com.sudarshan.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CollectionQsixTest {

	@Test
	void testStudentsFruits() {
		HashMap<String, ArrayList<String>> favorites = new HashMap<>();
		
		String[] fruits = new String[] {"Banana", "Apple", "Orange"};
		favorites.put("Sudarshan", new ArrayList<String>(Arrays.asList(fruits)));
	
		String[] fruits1 = new String[] {"Watermelon", "Apple", "Orange"};
		favorites.put("Sandeep", new ArrayList<String>(Arrays.asList(fruits1)));
		
		for(Map.Entry<String, ArrayList<String>> entry : favorites.entrySet()) {
			System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
		}
		
		
		assertEquals("[Banana, Apple, Orange]",favorites.get("Sudarshan").toString());
		
		
		
		
	}

}
