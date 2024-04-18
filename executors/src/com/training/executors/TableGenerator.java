package com.training.executors;

public class TableGenerator {

	public void printTable(int value) {

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(value + " * " + i + " = " + (i * value));
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
