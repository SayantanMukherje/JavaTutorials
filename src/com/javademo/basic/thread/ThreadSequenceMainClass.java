package com.javademo.basic.thread;

public class ThreadSequenceMainClass {

	public static void main(String[] args) {
		Thread t1 = new Thread( new ThreadSequence(2), "T1");
		Thread t2 = new Thread( new ThreadSequence(5), "T2");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
