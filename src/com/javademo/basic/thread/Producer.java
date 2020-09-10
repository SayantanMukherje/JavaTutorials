package com.javademo.basic.thread;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> taskQueue;
	int MAX_SIZE;

	public Producer(List<Integer> taskQueue, int MAX_SIZE) {
		this.taskQueue = taskQueue;
		this.MAX_SIZE = MAX_SIZE;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int counter = 0;
				counter++;
				produce(counter);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_SIZE) {
				System.out.println("Queue is full and name is: " + Thread.currentThread().getName());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println("Produced: " + i);
			taskQueue.notifyAll();
		}
	}

}
