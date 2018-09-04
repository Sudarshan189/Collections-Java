package com.sudarshan.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.sudarshan.day6.Student;

class CollectionQfourTest {

	@Test
	void testStudent1() {
		TreeSet<Student> studentCollection = new TreeSet<>();

		Student student1 = new Student("hsakj", 1558);
		Student student2 = new Student("sgahgd", 12335);
		Student student3 = new Student("sgadsld",787446);
		
		studentCollection.add(student1);
		studentCollection.add(student2);
		studentCollection.add(student3);
		
		
		for (Student student : studentCollection) {
			System.out.println(student);
		}
		
		
		assertEquals(student1, studentCollection.pollFirst());
		assertEquals(student2, studentCollection.pollLast());
	}

}
