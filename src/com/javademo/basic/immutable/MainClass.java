package com.javademo.basic.immutable;

public class MainClass {
	public static void main(String args[]) {
		Age studentAge = new Age(19, "April", 1994);
		Student sayantan = new Student(1, "Sayantan", studentAge);
		System.out.println(sayantan);
		studentAge.setMonth("June");
		System.out.println(sayantan);
		System.out.println(studentAge);
	}
}
