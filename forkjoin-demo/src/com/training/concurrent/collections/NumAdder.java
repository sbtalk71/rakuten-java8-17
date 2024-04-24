package com.training.concurrent.collections;

import java.util.Map;

public class NumAdder implements Runnable {

	Map<String, String> myMap;

	public NumAdder(Map myMap) {
		this.myMap = myMap;
	}

	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(100);
				myMap.put(tname+i, i + "");

			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
