package com.training.fj;

import java.util.concurrent.RecursiveAction;

public class NumSplitAction extends RecursiveAction{

	private double num;
	
	public NumSplitAction(double num) {
		this.num=num;
	}
	
	@Override
	protected void compute() {
		if(num>10) {
			
			NumSplitAction n1=new NumSplitAction(num/2);
			NumSplitAction n2=new NumSplitAction(num/2);
			n1.fork();
			n2.fork();
			
			n1.join();
			n2.join();
			
		}else {
			System.out.println("Data split is "+num);
		}
		
	}

}
