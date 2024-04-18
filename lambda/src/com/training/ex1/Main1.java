package com.training.ex1;

public class Main1 {

	public static void main(String[] args) {
		Greeter g= new Greeter();
		
		g.pringMessage(new GoodMorning());
		
		
		g.pringMessage(new Greet() {
			
			@Override
			public String message() {
				// TODO Auto-generated method stub
				return "Good Evening..";
			}
		});

		Greet gn=()->"Good Night";
		
		g.pringMessage(()->"Good Night");
	}

}


class GoodMorning implements Greet{
	@Override
	public String message() {
		
		return " Good Morning ";
	}
}


