package com.Io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ChangeStreamTest {

	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력: ");
			String val = br.readLine();
			
			System.out.println("val: "+ val);
			
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ouput() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java good!");
		
			//bw.flush();
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
}
