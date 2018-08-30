package com.sudarshan.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.sudarshan.day6.Student;

class CollectionQfourTest {

	@Test
	void testStudent1() {
		TreeSet<Student> studentCollection = new TreeSet<>();

		studentCollection.add(new Student("sgahgd", 12335));
		studentCollection.add(new Student("hsakj", 1558));
		studentCollection.add(new Student("sgadsld",787446));
		
		
		for (Student student : studentCollection) {
			System.out.println(student);
		}
	}

}
