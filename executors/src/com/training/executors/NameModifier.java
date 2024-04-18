package com.training.executors;

import java.util.concurrent.Callable;

public class NameModifier implements Callable<String> {

	String name;
	
	public NameModifier(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		try {
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return name.toUpperCase();
	}

}
