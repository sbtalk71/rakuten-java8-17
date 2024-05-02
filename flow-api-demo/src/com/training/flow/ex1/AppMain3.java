package com.training.flow.ex1;

import java.util.concurrent.SubmissionPublisher;

public class AppMain3 {

	public static void main(String[] args) {
		
		SubmissionPublisher<Integer> publisher=new SubmissionPublisher<Integer>();
		
		MyIntAdderProcessor processor=new MyIntAdderProcessor();
		
		
		MySubscriber subscriber= new MySubscriber();
		
		
		publisher.subscribe(processor);
		processor.subscribe(subscriber);
		
		System.out.println("subscribed..");
		
		int count=0;
		while(count++<15) {
			publisher.submit(count);
			sleep(500);
		}

	}

	
	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
