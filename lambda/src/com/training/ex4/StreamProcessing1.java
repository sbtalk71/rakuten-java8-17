package com.training.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessing1 {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,12,14,15,16,78,98,90);
		
		//Display all the even numbers
		//numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//count the odd numbers
		//Long count=numList.stream().filter(n->n%2!=0).count();
		//System.out.println("Odd nums "+count);
		
		//find sum of all even numbers
		//System.out.println(numList.stream().filter(n->n%2==0).mapToInt(n->n.intValue()).sum());
		
		//count numbers more than 15
		//System.out.println(numList.stream().max((a,b)->a.compareTo(b)).get());
		
		//System.out.println(numList.stream().max(Integer::compareTo).get());
		
		//get all the even numbers, add 10 to each number and collect them in a new List and then print the values
		
		List<Integer> evenList= numList
								.stream()
								.filter(n->n%2==0)
								.mapToInt(n->n.intValue()+10)
								.peek(x->System.out.println(x+" : "+Thread.currentThread().getName()))
								.boxed()
								.collect(Collectors.toList());
		
		
		System.out.println(numList.stream().filter(n->n%2==0).mapToInt(Integer::intValue).reduce((a,b)->a+b).getAsInt());
		
	}

}
