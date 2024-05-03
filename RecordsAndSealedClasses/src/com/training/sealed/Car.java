package com.training.sealed;

public final class Car extends Vehicle implements Service {

	
	public Car(String regNo) {
		super(regNo);
		
	}

	@Override
	public int getRegularServiceInterval() {
		
		return 6;
	}

}
