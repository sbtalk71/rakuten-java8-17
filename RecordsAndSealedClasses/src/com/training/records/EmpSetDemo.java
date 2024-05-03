package com.training.records;

import java.util.HashSet;
import java.util.Set;

public class EmpSetDemo {

	public static void main(String[] args) {
		Set<Employee> emps= new HashSet<Employee>();
		
		emps.add(new Employee(1, "john", 56000));
		emps.add(new Employee(2, "maria", 86000));
		emps.add(new Employee(3, "kelly", 96000));
		emps.add(new Employee(4, "sam", 76000));
		
		
		System.out.println(emps);

		for(Employee e:emps) {
			System.out.println(e.id()+" "+e.name()+" "+e.salary());
			System.out.println(e.getClass().isRecord());
		}
	}

}
