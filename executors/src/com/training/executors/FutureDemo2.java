package com.training.executors;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo2 {

	public static void main(String[] args) throws Exception{
		

		ExecutorService es=Executors.newCachedThreadPool();
		
		Future<Integer> rndFuture= es.submit(()->getDataWithDelay(2000));
		
		int rndNo=rndFuture.get();
		
		
		Future<Integer> num2= es.submit(()->rndNo*10);
		
		int result=num2.get();
		
		System.out.println(result);
		
		es.shutdown();
		
	}
	
	
	private static int getDataWithDelay(long delay) {
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Random().nextInt(100);
	}

}
