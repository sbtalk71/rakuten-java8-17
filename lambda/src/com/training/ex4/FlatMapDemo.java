package com.training.ex4;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<List<Integer>> data=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5),Arrays.asList(6,7,8));
		
		//System.out.println(data);
		
		//System.out.println(data.stream().flatMap(a->a.stream()).peek(System.out::println).findFirst().get());
		
		System.out.println(data.stream().flatMap(a->a.stream()).peek(System.out::println).limit(4).count());

	}

}
