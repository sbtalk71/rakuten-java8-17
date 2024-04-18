package com.training.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWIthStream {

	public static void main(String[] args) throws IOException {
		
		Files.lines(Paths.get("emp.txt")).forEach(System.out::println);

	}
	
	
	/*
	 * static Emp convertToEmp(String data) {
	 * 
	 * String[] empData=data.split(",");
	 * 
	 * return new Emp(Integer.parseInt(empData[0],) }
	 */

}
