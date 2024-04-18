package com.training.ex4;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String gender;

	public Employee() {

	}

	public Employee(int id, String name, double salary, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "{" + id + " " + name + "}";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode called");
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
}
