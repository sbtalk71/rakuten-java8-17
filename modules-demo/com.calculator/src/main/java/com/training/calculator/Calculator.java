package com.training.calculator;

import java.util.ServiceLoader;

import com.printer.service.Printer;
import com.training.maths.Adder;

public class Calculator {

	public static void main(String[] args) {
		
		Adder adder=new Adder();
		
		Iterable<Printer> service=ServiceLoader.load(Printer.class);
		Printer printer=service.iterator().next();
		printer.print("From module "+adder.getClass().getModule());
		
	}

}
