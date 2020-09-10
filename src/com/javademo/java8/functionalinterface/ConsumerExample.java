package com.javademo.java8.functionalinterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javademo.java8.data.Student;
import com.javademo.java8.data.StudentDataBase;


public class ConsumerExample {
	public static Consumer <Student> printStudents = (student)->System.out.println(student);
	public static Consumer <Student> printStudentNames = (student)->System.out.println(student.getName());
	public static Consumer <Student> printStudentActivities = (student)->System.out.println(student.getActivities());
	public static Predicate <Student> filterByGrade = (student)->student.getGradeLevel()>3;
	public static Predicate <Student> filterByGPA = (student)->student.getGpa()>3.9;
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("Java 8");
		printStudents();
		printNameActivities();
		printNameAndActivitiesUsingCondition();
	}

	private static void printNameAndActivitiesUsingCondition() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.stream().filter(filterByGrade.and(filterByGPA))
		.forEach(printStudentNames.andThen(printStudentActivities));
	}

	private static void printNameActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.stream().forEach(printStudentNames.andThen(printStudentActivities));
	}

	private static void printStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.stream().forEach(printStudents);
	}
}
