package com.training;

public class SwitchExpression {
	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;
		

		int numLetters=switch (day) {
		case MONDAY, FRIDAY, SUNDAY->6; //case->L
		case THURSDAY,SATURDAY->8;
		case WEDNESDAY-> 9;
		case TUESDAY->7;
		default ->throw new IllegalArgumentException("Wrong value provided " + day);
		};

		System.out.println(numLetters);
	}
}
