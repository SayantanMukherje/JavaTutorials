package com.javademo.basic.thread;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphorePrinterQueue {
	private final Semaphore semaphore;
	
	private final Lock printerLock;
	
	private boolean freePrinters[];

	public SemaphorePrinterQueue() {
		semaphore = new Semaphore (3);
		freePrinters = new boolean [3];
		Arrays.fill(freePrinters,true);
		printerLock = new ReentrantLock();
	}
	
	public int getPrinter() {
		int printerNumber = -1;
		try {
			printerLock.lock();
			for (int i=0; i<freePrinters.length; i++) {
				if (freePrinters[i]) {
					printerNumber = i;
					freePrinters[i]=false;
					break;
				}
			}		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			printerLock.unlock();
		}
		return printerNumber;
	}
	
	public void releasePrinter(int i) {
		printerLock.lock();
		freePrinters[i]=true;
		printerLock.unlock();
	}
	public void printJob(Object document) {
		try {
			semaphore.acquire();
			int assignedPrinter = getPrinter();
            
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + ": Printer " + assignedPrinter
                    + " : Printing a Job during " + (duration / 1000)
                    + " seconds :: Time - " + new Date());
            Thread.sleep(duration);
             
            releasePrinter(assignedPrinter);
		}
		catch (InterruptedException e) {
            e.printStackTrace();
        } 
        finally {
            System.out.printf("%s: The document has been printed\n", Thread
                    .currentThread().getName());
             
            //Increase the semaphore counter back
            semaphore.release();
        }
	}
	
}
