package com.training.sealed;

public sealed interface Service permits Car,Truck {

	int getRegularServiceInterval();

	default int getDistanceBetweenServices() {
		return 5000;
	}
}
