package com.training.flow.ex1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class MySubscriber implements Subscriber<Integer> {

	private Subscription subscription;
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		subscription.request(1);
		
		
	}

	@Override
	public void onNext(Integer item) {
		System.out.println("Sub1 "+item);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println(throwable);
		
	}

	@Override
	public void onComplete() {
		System.out.println("DONE!");
		
	}

}
