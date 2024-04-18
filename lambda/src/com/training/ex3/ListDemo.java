package com.training.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<Employee> empList=new ArrayList<Employee>();
	
	empList.add(new Employee(1, "Ankit"));
	empList.add(new Employee(2, "Raja"));
	empList.add(new Employee(3, "Ranga"));
	empList.add(new Employee(4, "Purnima"));
	empList.add(new Employee(1, "Ankit"));
	empList.add(new Employee(6, "Kiran"));
	
	
	System.out.println(empList);
	
	Iterator<Employee> empItr=empList.iterator();
	while(empItr.hasNext()) {
		Employee e= empItr.next();
		System.out.println(e);
	}
	
	for(Employee e:empList) {
		System.out.println(e);
	}
	
	empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
	
	System.out.println(empList);
	
}

}


class MySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
	
}
