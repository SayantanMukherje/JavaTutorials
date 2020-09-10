package com.javademo.basic.thread;

public class SemaphorePrintingJob implements Runnable {
	
	SemaphorePrinterQueue semaphorePrinterQueue = new SemaphorePrinterQueue();
	public SemaphorePrintingJob(SemaphorePrinterQueue semaphorePrinterQueue) {
		this.semaphorePrinterQueue = semaphorePrinterQueue;
	}
	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread
                .currentThread().getName());
		semaphorePrinterQueue.printJob(new Object());
	}

}
