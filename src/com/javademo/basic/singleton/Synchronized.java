package com.javademo.basic.singleton;

public class Synchronized {
	public static Synchronized obj;
	public int i;

	private Synchronized() {
		System.out.println("Instance Created Synchronized");
	}

	public static synchronized Synchronized getInstance() {
		if (obj == null)
			obj = new Synchronized();
		return obj;
	}
}
