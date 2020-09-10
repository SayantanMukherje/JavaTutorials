package com.javademo.basic.thread;

public class BinarySemaphoreMainClass {

	public static void main(String[] args) {
		BinarySemaphorePrinterQueue binarySemaphorePrinterQueue = new BinarySemaphorePrinterQueue();
		Thread thread[] = new Thread [10];
		for (int i=0;i<10;i++) {
			thread [i] = new Thread(new BinarySemaphorePrintingJob(binarySemaphorePrinterQueue), "Thread:"+i);
		}
		for (int i=0;i<10;i++)
			thread[i].start();
	}

}
