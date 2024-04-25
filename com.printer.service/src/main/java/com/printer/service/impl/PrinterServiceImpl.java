package com.printer.service.impl;

import com.printer.service.Printer;

public class PrinterServiceImpl implements Printer {

	@Override
	public void print(String input) {
		System.out.println("Printing : "+input);

	}

}
