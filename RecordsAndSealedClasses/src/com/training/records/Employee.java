package com.training.records;

public record Employee(int id, String name, double salary) {

	/*
	 * public Employee(int id, String name, double salary) { if(id<1) { throw new
	 * IllegalArgumentException("Id cannot be less than 1"); }
	 * 
	 * this.id=id; this.name=name; this.salary=salary; }
	 */
	
	
	public Employee {
		if(id<1) {
			throw new IllegalArgumentException("Id cannot be less than 1");
		}
		//
	}
	
}
