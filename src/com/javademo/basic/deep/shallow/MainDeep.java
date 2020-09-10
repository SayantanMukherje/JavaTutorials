package com.javademo.basic.deep.shallow;

public class MainDeep {
	public static void main(String[] args) {
		int[] vals = { 31, 17, 19 };
		Deep deep = new Deep(vals);
		deep.showData();
		vals[1] = 22;
		deep.showData();
	}
}
