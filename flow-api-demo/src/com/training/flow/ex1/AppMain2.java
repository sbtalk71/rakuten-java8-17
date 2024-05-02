package com.training.flow.ex1;

import java.util.concurrent.SubmissionPublisher;

public class AppMain2 {

	public static void main(String[] args) {
		
		SubmissionPublisher<Integer> publisher=new SubmissionPublisher<Integer>();
		
		MySubscriber subscriber= new MySubscriber();
		MySubscriber2 subscriber2= new MySubscriber2();
		
		publisher.subscribe(subscriber);
		publisher.subscribe(subscriber2);
		
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
