package com.training.flow.ex1;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class AppMain1 {

	public static void main(String[] args) {
		
		SubmissionPublisher<Integer> publisher=new SubmissionPublisher<Integer>();
		
		MySubscriber subscriber= new MySubscriber();
		MySubscriber2 subscriber2= new MySubscriber2();
		
		publisher.subscribe(subscriber);
		publisher.subscribe(subscriber2);
		
		Stream.of(2,3,4,5,6,7,8,9).forEach(x->{sleep(500); publisher.submit(x);});
		
		sleep(30000);

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
