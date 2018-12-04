package com.wjk.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

	public static void main(String[] args) {
		ExecutorService fixed = Executors.newFixedThreadPool(2);
		
//		pool.execute(command);
		
		ExecutorService cache = Executors.newCachedThreadPool();
		
		ExecutorService sing = Executors.newSingleThreadExecutor();
		
		ExecutorService sch = Executors.newScheduledThreadPool(2);


	}
}
