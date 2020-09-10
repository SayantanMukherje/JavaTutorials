package com.javademo.basic.immutable;

public class Age {
	int day;
	String month;
	int year;

	public Age() {
	}

	@Override
	public String toString() {
		return "Age [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public Age(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
