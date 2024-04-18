package com.training.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.threads.Worker;

public class ExecutorDemo {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Worker());
		es.execute(new Worker());
		
		es.shutdown();
	}

}
