package com.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo2 {

	//var num=10;
	
	public static void main(String[] args) {
		
		var y=20;
		
		Arrays.asList(1,2,3,4,5).stream().map((var x)->x.intValue()*20).forEach(System.out::println);

		try (
				var fis = new FileReader("demo.txt")
				
			) {

			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
