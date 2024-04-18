package com.training.ex4;

import java.util.stream.Stream;

public class StreamsSimple {

	public static void main(String[] args) {
		Stream<Integer> nums= Stream.of(1,2,3,4,5,6,8,34,12,32,54,67,89,98);
		
		//nums.filter(x->x>12).forEach(x->System.out.println(x));
		
		//nums.filter(x->x>12).forEach(System.out::println); //static method Reference
		
		DataPrinter dp=new DataPrinter();
		
		nums.filter(x->x>12).forEach(dp::doPrint); //not static method reference

	}

}

class DataPrinter{
	
	public void doPrint(Object o) {
		System.out.println(o);
	}
}
