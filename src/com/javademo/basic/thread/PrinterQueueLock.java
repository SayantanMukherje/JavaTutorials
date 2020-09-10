package com.javademo.basic.thread;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueueLock {
	private final Lock lockObj = new ReentrantLock();
	public void printJob (Object document) {
		lockObj.lock();
		try {
			Long duration = (long) (Math.random()*1000);
			System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + (duration / 100) + " miliseconds :: Time - " + new Date());
	        Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
	        lockObj.unlock();
		}
	}
}
