package com.training;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {

	public static void main(String[] args) throws Exception{
		Path file1 = Files.createTempFile("file1", ".txt");
		Path file2 = Files.createTempFile("file2", ".txt");
		
		Files.writeString(file1, "Hello There");
		Files.writeString(file2, "Helloo There");
		
		long mismatch=Files.mismatch(file1, file2);
		
		if(mismatch>1L) {
			System.out.println("Files did not match : "+mismatch);
		}else {
			System.out.println("Files Matched ");
		}

		file1.toFile().deleteOnExit();
		file2.toFile().deleteOnExit();
	}

}
