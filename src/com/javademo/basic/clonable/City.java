package com.javademo.basic.clonable;

public class City implements Cloneable {
	private String name;

	public City clone() throws CloneNotSupportedException {
		return (City) super.clone();
	}
}
