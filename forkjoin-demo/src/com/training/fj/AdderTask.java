package com.training.fj;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class AdderTask extends RecursiveTask<Integer> {

	private List<Integer> numList;

	public AdderTask(List<Integer> numList) {
		this.numList = numList;
	}

	@Override
	protected Integer compute() {
		System.out.println("Size of List "+numList.size());
		int sum = 0;
		if (numList.size() > 2) {
			
			AdderTask t1=new AdderTask(numList.subList(0, numList.size()/2));
			AdderTask t2=new AdderTask(numList.subList(numList.size()/2,numList.size()));
			
			t1.fork();
			t2.fork();
			sum=t1.join()+t2.join();
		} else {
			for (Integer x : numList) {
				sum = sum + x;
			}
		}
		return sum;
	}
}
