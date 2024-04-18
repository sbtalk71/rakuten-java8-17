package com.training.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Starts ");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" Exits" );
	}
}
