package com.training.sealed;

public non-sealed class Truck extends Vehicle implements Service {

	public Truck(String regNo) {
		super(regNo);
		
	}

	@Override
	public int getRegularServiceInterval() {

		return 3;
	}

}
