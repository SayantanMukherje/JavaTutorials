package com.javademo.basic.thread;

public class PrintingJobMainClass {

	public static void main(String[] args) {
		PrinterQueueLock printerQueueLock = new PrinterQueueLock();
		Thread[] thread = new Thread [10];
		for (int i=0; i<10; i++) {
			thread [i] = new Thread(new PrintingJob(printerQueueLock), "Thread "+i);
		}
		for (int i = 0; i < 10; i++)
	    {
			thread[i].start();
	    }
	}
}