package com.training;

public class SwitchExpWithYield {
	public static void main(String[] args) {

		Day day = Day.THURSDAY;

		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			System.out.println(6);
			yield 6;
		case THURSDAY:
		case SATURDAY:
			System.out.println(8);
			yield 8;
		case WEDNESDAY:
			System.out.println(9);
			yield 9;
		case TUESDAY:
			System.out.println(9);
			yield 7;
		/*
		 * default: throw new IllegalArgumentException("Wrong value provided " + day);
		 */
		};

		System.out.println(numLetters);
	}
}
