package com.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) {

		try (
				FileReader fis = new FileReader("demo.txt")
				
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
