package com.training;

public class SwitchStatement {
	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;
		int numLetters = 0;

		switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			numLetters = 6;
			break;
		case THURSDAY:
		case SATURDAY:
			numLetters = 8;
			break;
		case WEDNESDAY:
			numLetters = 9;
			break;
		default:
			throw new IllegalArgumentException("Wronf value provided " + day);

		}

		System.out.println(numLetters);
	}
}
