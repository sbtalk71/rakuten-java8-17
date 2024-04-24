package com.training.executors;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) throws Exception{
		
		System.out.println(Thread.currentThread().getName());
		
		CompletableFuture<Integer> cf=CompletableFuture.supplyAsync(()->getDataWithDelay(2000)).thenApply(x->x*10);
		
		
		System.out.println(cf.get());

	}

	private static int getDataWithDelay(long delay) {

		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Random().nextInt(100);
	}
}
