package com.training.flow.ex1;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class MyIntAdderProcessor extends SubmissionPublisher<Integer> implements Processor<Integer, Integer> {

	private Subscription subscription;
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		subscription.request(1);
		
	}

	@Override
	public void onNext(Integer item) {
		System.out.println("Modified "+item+" to "+(item+2));
		submit(item+2);
		subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println(throwable);
		
	}

	@Override
	public void onComplete() {
		System.out.println("Done");
		
	}

}
