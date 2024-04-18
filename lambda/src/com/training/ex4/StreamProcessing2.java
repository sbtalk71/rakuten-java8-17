package com.training.ex4;

import java.util.Arrays;
import java.util.List;

public class StreamProcessing2 {

	public static void main(String[] args) {
		List<String> namesList=Arrays.asList("Ranga","Kirti","shantanu","Srinivas","shankerlal","Rajeev","Shakuntala");
		
		//Display the name with maximum Characters
		String longestName= namesList.stream().max((n1, n2)->Integer.compare(n1.length(),n2.length())).orElse(null);
		System.out.println(longestName);
		//Is Rajeev Present?
		namesList.stream().filter(x -> x.equals("Rajeev")).findFirst().get();
		
		//print the length of each name
		
		//Find the first name and add 'Welcome' Prefix to it and then print
		
		//Find The last Name
		
		
	}

}
