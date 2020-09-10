package com.javademo.basic.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;


public class ExecutorServiceMainClass {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CallableDemo callableDemo = new CallableDemo();
		Future<Result> resultObj = executorService.submit(callableDemo);
		try {
			System.out.println(resultObj.get().code);
			System.out.println(resultObj.get().message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		//Other examples
		 Set<Callable<String>> callables = new HashSet<Callable<String>>();  
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 1";  
	            }  
	        });  
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 2";  
	            }  
	        });  
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 3";  
	            }  
	        });  
	        try {
				System.out.println(executorService.invokeAny(callables));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        List<Future<String>> futures;
			try {
				futures = executorService.invokeAll(callables);
				for(Future<String> future : futures){  
		            System.out.println("future.get = " + future.get());  
		        }  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}
}
