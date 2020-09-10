package com.javademo.basic.deep.shallow;

import java.util.Arrays;

public class Shallow {
	private int[] data;
	
	public Shallow(int[] values) {
		data=values;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
