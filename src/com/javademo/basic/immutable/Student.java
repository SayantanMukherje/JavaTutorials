package com.javademo.basic.immutable;

public final class Student {
	private final int id;
	private final String name;
	private final Age age;

	public Student(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.age = cloneAge;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

}
