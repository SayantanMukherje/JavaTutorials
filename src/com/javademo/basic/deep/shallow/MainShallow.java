package com.javademo.basic.deep.shallow;

public class MainShallow {

	public static void main(String[] args) {
		int[] vals = { 31, 17, 19 };
		Shallow shallow = new Shallow(vals);
		shallow.showData();
		vals[1] = 22;
		shallow.showData();

	}

}
