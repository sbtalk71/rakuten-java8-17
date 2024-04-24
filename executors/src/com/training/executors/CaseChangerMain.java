package com.training.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CaseChangerMain {

	public static void main(String[] args) throws Exception{
		
		ExecutorService es= Executors.newCachedThreadPool();
		
		Future<String> nameFuture= es.submit(new NameModifier("shantanu"));
		
		System.out.println("Waiting for the result...");
		
		String name=nameFuture.get();
		
		System.out.println("Result "+name);
		es.shutdown();
		
		System.out.println("Exiting from Main..");

	}

}
