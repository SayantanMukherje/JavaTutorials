package com.javademo.basic.thread;

public class PrintingJob implements Runnable {
	
	private PrinterQueueLock printerQueueLock = new PrinterQueueLock();
	public PrintingJob(PrinterQueueLock printerQueueLock) {
		this.printerQueueLock = printerQueueLock;
	}
	@Override
	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		printerQueueLock.printJob(new Object());
	}

}
