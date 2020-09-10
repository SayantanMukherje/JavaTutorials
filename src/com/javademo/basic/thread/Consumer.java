package com.javademo.basic.thread;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> taskQueue;

	public Consumer(List<Integer> taskQueue) {
		super();
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {		
				consumer();
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void consumer() throws InterruptedException{
		synchronized (taskQueue) {
			while (0==taskQueue.size()) {
				System.out.println("Queue is empty and the name is: " + Thread.currentThread().getName());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			System.out.println("Consumed: "+taskQueue.remove(0));
			taskQueue.notifyAll();
		}
	}

}
