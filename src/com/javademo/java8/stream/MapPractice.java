package com.javademo.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.javademo.java8.data.Student;
import com.javademo.java8.data.StudentDataBase;

public class MapPractice {
	public static void main(String[] args) {
		 AllData(StudentDataBase.getAllStudents());
		 MaxMarks(StudentDataBase.getAllStudents());
		 MaxMarksMale(StudentDataBase.getAllStudents());
	    }

	private static void MaxMarksMale(List<Student> allStudents) {
		System.out.println(
				allStudents.stream()
				.filter(student -> "male".equals(student.getGender()))
				.map(Student::getGpa)
				.reduce(0.0,Double::max)
				);
	}

	private static void MaxMarks(List<Student> allStudents) {
		System.out.println(
		allStudents.stream()
		.map(Student::getGpa)
		.reduce(0.0,Double::max)
		);
	}

	private static void AllData(List<Student> allStudents) {
		List <Double> studentData = allStudents.stream()
										.map(Student::getGpa)
										.filter(n -> n>3.8)
										.collect(Collectors.toList());
		System.out.println(studentData);
	}
	
}
