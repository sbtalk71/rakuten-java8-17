package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorTeeing {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16);

		int result = nums.stream().collect(Collectors.teeing(

				Collectors.maxBy(Integer::compareTo), Collectors.minBy(Integer::compareTo), (x, y) -> x.get() + y.get()

		));

		System.out.println(result);

		List<Integer> resultList = nums.stream().collect(Collectors.teeing(

				Collectors.maxBy(Integer::compareTo), Collectors.minBy(Integer::compareTo), (x, y) -> Arrays.asList(x.get(),y.get())

		));

		System.out.println(resultList);
	}

}
