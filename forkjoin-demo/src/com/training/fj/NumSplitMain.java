package com.training.fj;

import java.util.concurrent.ForkJoinPool;

public class NumSplitMain {

	public static void main(String[] args) {
		
		ForkJoinPool fj= new ForkJoinPool();
		NumSplitAction n=new NumSplitAction(400);
		fj.invoke(n);

	}

}
