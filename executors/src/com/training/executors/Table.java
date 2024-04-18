package com.training.executors;

public class Table implements Runnable {
	private int value;
	private TableGenerator tg;

	Table(int value, TableGenerator tg) {
		this.value = value;
		this.tg = tg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		synchronized (tg) {
			tg.printTable(value);
		}

	}

}