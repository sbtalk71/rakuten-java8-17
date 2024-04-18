package com.training.ex2;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p=a->a%2==0?true:false;
		
		IntPredicate p1=a->a%2==0?true:false;
		
		Supplier<String> s=()->"Hello There";
		
		Supplier<String> s1=()->{return "Hello There";};
		
		Function<String, String> s3= (name)->"Welcome to Lambda "+name;
		
		BiFunction<String, String, String> result=(n1, n2)->n1+""+n2;
		
		Consumer<String> res=(data)->System.out.println(data);

	}

}
