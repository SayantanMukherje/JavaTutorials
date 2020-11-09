package com.javademo.basic.thread;

public class ThreadSequence implements Runnable{
	private int n;
	ThreadSequence (int n){
		this.n=n;
	}
	@Override
	public void run() {

		for (int i=1; i<=n;i++) {
			System.out.println(i+" Call from: "+ Thread.currentThread().getName());
		}
	}

}
