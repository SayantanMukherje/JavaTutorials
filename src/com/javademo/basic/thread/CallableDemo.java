package com.javademo.basic.thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Result> {

	@Override
	public Result call() throws Exception {
		Result obj = new Result();
		obj.message = "Success";
		obj.code = 200;
		return obj;
	}

}
