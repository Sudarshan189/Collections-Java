package com.sudarshan.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sudarshan.day6.Student;

class CollectionQthreeTest {

	@Test
	void testStudent() {

		Student student1 = new Student("Sudarshan", 6564);
		Student student2 = new Student("Sandeep", 655343);
		Student student3 = new Student("Sharath", 543453);
		ArrayList<Student> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		assertEquals(student1, student.get(0));
		assertEquals(student2, student.get(1));
		assertEquals(student3, student.get(2));

		for (Student student4 : student) {
			System.out.println(student4);
		}
	}

}
