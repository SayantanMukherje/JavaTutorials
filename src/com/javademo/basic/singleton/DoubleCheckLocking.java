package com.javademo.basic.singleton;

public class DoubleCheckLocking {
	public static DoubleCheckLocking obj;
	public int i;

	private DoubleCheckLocking() {
		System.out.println("Instance Created Double Locking");
	}

	public static DoubleCheckLocking getInstance() {
		if (obj == null) {
			synchronized (DoubleCheckLocking.class) {
				if (obj == null)
					obj = new DoubleCheckLocking();
			}
		}
		return obj;
	}
}
