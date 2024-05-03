package com.training.sealed;

public sealed class Vehicle permits Car, Truck {

	private String regNo;

	public Vehicle(String regNo) {
		this.regNo = regNo;
	}

	public String getRegistrationNo() {
		return regNo;
	}
}
