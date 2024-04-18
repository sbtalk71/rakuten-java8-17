package com.training.ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<Employee> empSet=new HashSet<Employee>();
	
	empSet.add(new Employee(1, "Ankit"));
	empSet.add(new Employee(2, "Raja"));
	empSet.add(new Employee(3, "Ranga"));
	empSet.add(new Employee(4, "Purnima"));
	empSet.add(new Employee(1, "Ankit"));
	empSet.add(new Employee(6, "Kiran"));
	
	
	System.out.println(empSet);
	
	Iterator<Employee> empItr=empSet.iterator();
	while(empItr.hasNext()) {
		Employee e= empItr.next();
		System.out.println(e);
	}
	
	for(Employee e:empSet) {
		System.out.println(e);
	}
}

}
