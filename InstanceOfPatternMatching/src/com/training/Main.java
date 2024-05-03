package com.training;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Rectangle(10, 4);
		
		Shape circle=new Circle(20);

		System.out.println(Shape.getPerimeter(circle));

	}

}
