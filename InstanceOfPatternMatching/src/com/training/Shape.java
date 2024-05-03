package com.training;

public interface Shape {
	public static double getPerimeter(Shape shape) throws IllegalArgumentException {
		/*
		 * if (shape instanceof Rectangle) { Rectangle r = (Rectangle) shape; return 2 *
		 * r.length() + 2 * r.width(); } else if (shape instanceof Circle) { Circle c =
		 * (Circle) shape; return 2 * c.radius() * Math.PI; } else { throw new
		 * IllegalArgumentException("Unrecognized shape"); }
		 */

		if (shape instanceof Rectangle r) {
			return 2 * r.length() + 2 * r.width();
		} else if (shape instanceof Circle c) {
			return 2 * c.radius() * Math.PI;
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}

		// Switch exp with Pattern Matching Preview in JDK 17

		/*
		 * return switch (shape) { case Rectangle r -> 2 * r.length() + 2 * r.width();
		 * case Circle c -> 2 * c.radius() * Math.PI; default -> throw new
		 * IllegalArgumentException("Unrecognized shape"); };
		 */

	}
}
