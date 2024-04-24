package com.training.fj;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class AdderForkJoinMain {

	public static void main(String[] args) {
		ForkJoinPool fj = new ForkJoinPool();
		AdderTask task = new AdderTask(Arrays.asList(2,5,6,3,4,8,90,23,24,10,56));
		
		System.out.println(fj.invoke(task));

	}

}
