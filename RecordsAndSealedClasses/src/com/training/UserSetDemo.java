package com.training;

import java.util.HashSet;
import java.util.Set;

public class UserSetDemo {

	public static void main(String[] args) {
		
		Set<User> users=new HashSet<User>();
		
		users.add(new User(1,"john"));
		users.add(new User(2,"clark"));
		users.add(new User(3,"tom"));
		users.add(new User(2,"jenny"));
		
		System.out.println(users);
		

	}

}
