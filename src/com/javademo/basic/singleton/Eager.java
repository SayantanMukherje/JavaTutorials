package com.javademo.basic.singleton;

public class Eager {
	public static Eager obj = new Eager();
	public int i;

	private Eager() {
		System.out.println("Instance Created Eager");
	}

	public static Eager getInstance() {
		return obj;
	}

}
