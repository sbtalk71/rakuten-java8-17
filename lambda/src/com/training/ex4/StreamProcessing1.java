package com.training.ex4;

import java.util.Arrays;
import java.util.List;

public class StreamProcessing1 {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,12,14,15,16,78,98,90);
		
		//Display all the even numbers
		numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//count the odd numbers
		Long count=numList.stream().filter(n->n%2!=0).count();
		System.out.println("Odd nums "+count);
		
		//find sum of all even numbers
		System.out.println(numList.stream().filter(n->n%2==0).mapToInt(n->n.intValue()).sum());
		
		//count numbers more than 15

	}

}
