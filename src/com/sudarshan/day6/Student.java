package com.sudarshan.day6;

public class Student implements Comparable<Student> {

	private String name;
	private int rollNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student o) {
		int result = name.compareTo(o.name);
		if (result == 0) {
			return Integer.compare(rollNo, o.rollNo);
		}
		return result;

	}

}
