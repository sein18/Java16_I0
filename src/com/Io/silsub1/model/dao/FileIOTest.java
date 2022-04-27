package com.Io.silsub1.model.dao;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTest {

	public static void main(String[] args) {
		fileSave();
	
	}

	public static void fileSave() {
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		try {
			bw = new BufferedWriter(new FileWriter("silsub1.txt"));
			String val = "";
			while (!val.contains("exit")) {
				System.out.println("파일에 저장할 내용을 입력하시오.");
				val = sc.nextLine();
				bw.write(val);
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void fileRead() {
		FileReader fr = null;
		try {
			fr = new FileReader("silsub1.txt");
			 
			StringBuilder stb =new StringBuilder();
			int val = 0;
			while ((val = fr.read()) != -1) {
				stb.append((char)val);
			}
			String str = stb.toString();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
