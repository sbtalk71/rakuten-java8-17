package com.training.threads;

public class Main2 {

	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread().getName()+" Starts ");
		
		Thread t1= new Thread(new Worker());
		Thread t2= new Thread(new Worker());
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread().getName()+" Ends ");

	}

}
