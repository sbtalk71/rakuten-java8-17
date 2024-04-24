package com.training.concurrent.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapMain {

	public static void main(String[] args) throws Exception{
		ExecutorService es= Executors.newCachedThreadPool();
		//Map<String, String> myMap=new ConcurrentHashMap<>();
		Map<String, String> myMap=Collections.synchronizedMap(new HashMap<>());
		
		es.execute(new NumAdder(myMap));
		es.execute(new NumAdder(myMap));
		es.execute(new NumAdder(myMap));
		es.execute(new NumAdder(myMap));
		
		
		Thread.sleep(20000);
		
		es.shutdown();
		System.out.println("The Number of Total Elements "+myMap.size());

	}

}
