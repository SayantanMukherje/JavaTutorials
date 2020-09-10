package com.javademo.basic.thread;

public class SemaphoreMainClass {

	public static void main(String[] args) {
		SemaphorePrinterQueue semaphorePrinterQueue = new SemaphorePrinterQueue();
		Thread thread[] = new Thread[10];
        for (int i = 0; i < 10; i++) 
        {
            thread[i] = new Thread(new SemaphorePrintingJob(semaphorePrinterQueue), "Thread " + i);
        }
        for (int i = 0; i < 10; i++) 
        {
            thread[i].start();
        }
	}

}
