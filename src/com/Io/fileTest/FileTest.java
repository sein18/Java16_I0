package com.Io.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("person.txt");

		System.out.println("파일명: " + file.getName());
		System.out.println("저장경로: " + file.getAbsolutePath());
		System.out.println("저장경로: " + file.getPath());
		System.out.println("용량: " + file.length());
		System.out.println("상위폴더: " + file.getParent());

		try {
			boolean b = file.createNewFile();
			
			System.out.println(b);
			
			boolean b1 = file.delete();
			System.out.println(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
