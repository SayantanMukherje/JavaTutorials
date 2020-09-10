package com.javademo.basic.thread;

public class BinarySemaphorePrintingJob implements Runnable {
	public BinarySemaphorePrinterQueue binarySemaphorePrinterQueue;

	public BinarySemaphorePrintingJob(BinarySemaphorePrinterQueue binarySemaphorePrinterQueue) {
		this.binarySemaphorePrinterQueue = binarySemaphorePrinterQueue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		binarySemaphorePrinterQueue.printJob(new Object());
	}
	
}
