package com.training.ex4;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamProcessing {

	public static void main(String[] args) {
		
		List<Employee> empList= Arrays.asList(
				new Employee(1, "Raja", 80000, "male"),
				new Employee(2, "Kiran", 60000, "female"),
				new Employee(3, "Ranga", 50000, "male"),
				new Employee(4, "Ritu", 90000, "female"),
				new Employee(5, "Karan", 60000, "male"),
				new Employee(6, "Raman", 80000, "male"));
		
		// Calculate total salary of all the employees
		
		empList.stream()
        .mapToDouble(Employee::getSalary)
        .sum();
		
		//if salary if less than 70000, add bonus 5000
		empList.stream().filter(e->e.getSalary()<70000).map(e->{e.setSalary(e.getSalary()+5000); return e;}).forEach(System.out::println);
		
		//collect all empployees in another list having salary >70000
		
		//Update the name Ritu to Reetu
		empList.stream().filter(e->e.getName().equals("Ritu")).map(e->{e.setName("Reetu"); return e;}).forEach(System.out::println);
		
		System.out.println(empList);

	}

}
