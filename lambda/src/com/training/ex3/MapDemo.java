package com.training.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Employee> empMap=new HashMap<>();
		
		empMap.put(1,new Employee(1, "Ankit"));
		empMap.put(2,new Employee(2, "Raja"));
		empMap.put(3,new Employee(3, "Ranga"));
		empMap.put(4,new Employee(4, "Purnima"));
		empMap.put(5,new Employee(5, "Ritesh"));
		empMap.put(6,new Employee(6, "Kiran"));
		
		Set<Integer> keys=empMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" : "+empMap.get(key).getName());
		}

	}

}
